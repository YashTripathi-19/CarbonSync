# CarbonSync — Carbon Data Management Platform

> **Live Demo:** [https://carbon-sync.netlify.app](https://carbon-sync.netlify.app)

CarbonSync is a full-stack carbon compliance platform that connects companies, auditors, and government bodies on a single system to track, verify, and report carbon emissions — transparently and in real time.

---

## Live Preview

| Portal | Link |
|--------|------|
| Landing Page | [carbon-sync.netlify.app](https://carbon-sync.netlify.app) |
| Company Dashboard | [carbon-sync.netlify.app/pages/dashboard.html](https://carbon-sync.netlify.app/pages/dashboard.html) |
| Auditor Portal | [carbon-sync.netlify.app/pages/auditor.html](https://carbon-sync.netlify.app/pages/auditor.html) |
| Government Monitor | [carbon-sync.netlify.app/pages/government.html](https://carbon-sync.netlify.app/pages/government.html) |

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | Vanilla HTML, CSS, JavaScript |
| Backend | Java Spring Boot 3, Maven |
| Database | PostgreSQL (wiring in progress) |
| Deployment | Netlify (frontend) · Railway (backend — upcoming) |

---

## Project Structure

```
CarbonSync/
├── frontend/
│   ├── index.html              # Landing page
│   ├── pages/
│   │   ├── dashboard.html      # Company portal
│   │   ├── auditor.html        # Auditor portal
│   │   ├── government.html     # Government monitor
│   │   ├── login-company.html
│   │   ├── login-auditor.html
│   │   └── login-govt.html
│   ├── styles/                 # Design system (variables, base, layout, components)
│   ├── scripts/                # Globe, animations, API wrappers
│   └── assets/                 # Icons, fonts, images
└── backend/
    ├── pom.xml
    └── src/main/java/com/carbonsync/
        ├── auth/               # JWT auth (stub)
        ├── company/            # Company CRUD
        ├── auditor/            # Auditor CRUD
        ├── government/         # Government body CRUD
        ├── carbon/             # Carbon entry CRUD
        ├── config/             # CORS, Security
        ├── exception/          # Global error handling
        └── utils/              # Response wrapper
```

---

## Features

- Monochromatic black & gold design system
- Interactive Spline 3D hero on landing page
- Three role-based portals — Company, Auditor, Government
- Animated dashboards with live counters, charts, and terminal widgets
- Auditor review queue with expand/verify/flag toggle
- Government compliance table with real CSV, JSON, and PDF export
- Onboarding tour on each portal for new users
- Fully responsive — mobile hamburger nav, stacked layouts
- Spring Boot REST API scaffold with stub data (DB wiring in progress)

---

## Run Locally

**Frontend**
```bash
cd frontend
python3 -m http.server 5500
# Open http://localhost:5500
```

**Backend**
```bash
cd backend
mvn spring-boot:run
# API at http://localhost:8080/api
```

---

## API Endpoints

| Method | Path | Description |
|--------|------|-------------|
| POST | `/api/auth/signup` | Register a new user |
| POST | `/api/auth/login` | Authenticate and receive token |
| GET | `/api/companies` | List all companies |
| GET | `/api/auditors` | List all auditors |
| GET | `/api/government` | List all government bodies |
| GET | `/api/carbon` | List all carbon entries |
| GET | `/api/carbon/company/{id}` | Get entries for a company |

---

## Current Status

The frontend prototype is fully built and live. The Spring Boot backend compiles and runs with stub data. Database wiring and JWT authentication are the next milestones.

---

## Roadmap

- [ ] Wire PostgreSQL via Railway
- [ ] Implement JWT authentication
- [ ] Connect frontend API calls to live backend
- [ ] Add AI-assisted anomaly detection for auditors
- [ ] Carbon credit marketplace module

---

## Contributors

- Yash Tripathi
- Somiya Chaturvedi
- Tarang Nemani
- Utkarsh Tiwari
