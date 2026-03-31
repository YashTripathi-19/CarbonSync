/**
 * animations.js — Scroll-reveal via IntersectionObserver + navbar scroll class.
 */

document.addEventListener("DOMContentLoaded", () => {
  initScrollReveal();
  initNavbarScroll();
});

// ── Scroll-reveal ──────────────────────────────────────────────────────────────
function initScrollReveal() {
  const observer = new IntersectionObserver(
    (entries) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          entry.target.classList.add("visible");
          observer.unobserve(entry.target); // fire once
        }
      });
    },
    { threshold: 0.15 }
  );

  // Apply stagger delays to children of [data-stagger] groups
  document.querySelectorAll("[data-stagger]").forEach((group) => {
    Array.from(group.children).forEach((child, i) => {
      child.style.transitionDelay = `${i * 150}ms`;
      // Ensure the child carries the reveal class so the observer picks it up
      if (!child.classList.contains("reveal")) {
        child.classList.add("reveal");
      }
    });
  });

  // Observe every .reveal element (includes those just added above)
  document.querySelectorAll(".reveal").forEach((el) => observer.observe(el));
}

// ── Navbar scroll class ────────────────────────────────────────────────────────
function initNavbarScroll() {
  const navbar = document.querySelector(".navbar");
  if (!navbar) return;

  window.addEventListener("scroll", () => {
    navbar.classList.toggle("navbar--scrolled", window.scrollY > 80);
  }, { passive: true });
}
