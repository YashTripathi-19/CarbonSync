// Fetch wrappers for Spring Boot endpoints (stubbed)

const api = {
  /**
   * Generic GET request
   * @param {string} path - endpoint path e.g. "/companies"
   */
  async get(path) {
    const res = await fetch(`${CONFIG.API_BASE_URL}${path}`);
    if (!res.ok) throw new Error(`GET ${path} failed: ${res.status}`);
    return res.json();
  },

  /**
   * Generic POST request
   * @param {string} path - endpoint path
   * @param {object} body - request payload
   */
  async post(path, body) {
    const res = await fetch(`${CONFIG.API_BASE_URL}${path}`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(body),
    });
    if (!res.ok) throw new Error(`POST ${path} failed: ${res.status}`);
    return res.json();
  },

  // --- Auth ---
  auth: {
    login: (data) => api.post("/auth/login", data),
    signup: (data) => api.post("/auth/signup", data),
  },

  // --- Company ---
  company: {
    getAll: () => api.get("/companies"),
    getById: (id) => api.get(`/companies/${id}`),
  },

  // --- Carbon ---
  carbon: {
    getEntries: (companyId) => api.get(`/carbon?companyId=${companyId}`),
  },

  // --- Auditor ---
  auditor: {
    getAll: () => api.get("/auditors"),
  },

  // --- Government ---
  government: {
    getAll: () => api.get("/government"),
  },
};
