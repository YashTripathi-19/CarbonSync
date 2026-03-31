/**
 * globe.js — Three.js floating Earth globe
 * Assumes Three.js r128 is loaded via CDN before this script.
 */

function initGlobe(canvasId) {
  const canvas = document.getElementById(canvasId);
  if (!canvas || typeof THREE === "undefined") return;

  // ── Renderer ──────────────────────────────────────────────
  const renderer = new THREE.WebGLRenderer({
    canvas,
    alpha: true,
    antialias: true,
  });
  renderer.setPixelRatio(window.devicePixelRatio);
  renderer.setSize(canvas.clientWidth, canvas.clientHeight);

  // ── Scene & Camera ────────────────────────────────────────
  const scene = new THREE.Scene();

  const camera = new THREE.PerspectiveCamera(
    45,
    canvas.clientWidth / canvas.clientHeight,
    0.1,
    100
  );
  camera.position.z = 2.5;

  // ── Earth ─────────────────────────────────────────────────
  const textureLoader = new THREE.TextureLoader();
  const earthTexture = textureLoader.load(
    "https://threejs.org/examples/textures/planets/earth_atmos_2048.jpg"
  );

  const earthGeo = new THREE.SphereGeometry(1, 64, 64);
  const earthMat = new THREE.MeshPhongMaterial({
    map: earthTexture,
    shininess: 8,
  });
  const globe = new THREE.Mesh(earthGeo, earthMat);
  scene.add(globe);

  // ── Atmospheric glow ──────────────────────────────────────
  const glowGeo = new THREE.SphereGeometry(1.02, 64, 64);
  const glowMat = new THREE.MeshBasicMaterial({
    color: 0x74c69d,
    transparent: true,
    opacity: 0.08,
    side: THREE.BackSide,
  });
  scene.add(new THREE.Mesh(glowGeo, glowMat));

  // ── Orbit ring ────────────────────────────────────────────
  const ringGeo = new THREE.TorusGeometry(1.35, 0.008, 16, 100);
  const ringMat = new THREE.MeshBasicMaterial({
    color: 0x74c69d,
    transparent: true,
    opacity: 0.4,
  });
  const ring = new THREE.Mesh(ringGeo, ringMat);
  ring.rotation.x = (23.5 * Math.PI) / 180;
  scene.add(ring);

  // ── Lights ────────────────────────────────────────────────
  scene.add(new THREE.AmbientLight(0xffffff, 0.4));
  const dirLight = new THREE.DirectionalLight(0xffffff, 1.0);
  dirLight.position.set(5, 3, 5);
  scene.add(dirLight);

  // ── Animation loop ────────────────────────────────────────
  function animate() {
    requestAnimationFrame(animate);

    // Rotate globe
    globe.rotation.y += 0.001;

    // Gentle vertical bob
    globe.position.y = Math.sin(Date.now() * 0.001) * 0.06;

    renderer.render(scene, camera);
  }
  animate();

  // ── Resize handler ────────────────────────────────────────
  window.addEventListener("resize", () => {
    const w = canvas.clientWidth;
    const h = canvas.clientHeight;
    camera.aspect = w / h;
    camera.updateProjectionMatrix();
    renderer.setSize(w, h);
  });
}
