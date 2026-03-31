// Init, scroll events, and navbar behavior

document.addEventListener("DOMContentLoaded", () => {
  initNavbarScroll();
  loadComponent("navbar-placeholder", "/components/navbar.html");
  loadComponent("footer-placeholder", "/components/footer.html");
});

// Sticky navbar scroll class
function initNavbarScroll() {
  const navbar = document.getElementById("navbar");
  if (!navbar) return;
  window.addEventListener("scroll", () => {
    navbar.classList.toggle("scrolled", window.scrollY > 40);
  });
}

// Inject reusable HTML components into placeholder elements
async function loadComponent(placeholderId, path) {
  const el = document.getElementById(placeholderId);
  if (!el) return;
  try {
    const res = await fetch(path);
    if (res.ok) el.innerHTML = await res.text();
  } catch (e) {
    console.warn(`Could not load component: ${path}`, e);
  }
}
