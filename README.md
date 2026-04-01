# 🌱 CarbonSync - Carbon Data Management Platform

> **🔴 Live Demo:** [https://carbon-sync.netlify.app](https://carbon-sync.netlify.app)

CarbonSync is a full-stack web application designed to simplify the process of tracking, managing, and verifying carbon emissions. It provides a centralized platform where companies, auditors, and authorities can collaborate efficiently.

---

## 🌐 Live Portals

| Portal | Link |
|--------|------|
| Landing Page | [carbon-sync.netlify.app](https://carbon-sync.netlify.app) |
| Company Dashboard | [carbon-sync.netlify.app/pages/dashboard.html](https://carbon-sync.netlify.app/pages/dashboard.html) |
| Auditor Portal | [carbon-sync.netlify.app/pages/auditor.html](https://carbon-sync.netlify.app/pages/auditor.html) |
| Government Monitor | [carbon-sync.netlify.app/pages/government.html](https://carbon-sync.netlify.app/pages/government.html) |

---

## 🚀 Problem Statement

Carbon emission tracking in industries is often manual, scattered, and inefficient.  
Organizations face challenges in:
- Managing emission data
- Generating structured reports
- Ensuring transparency and compliance

At the same time, auditors and authorities lack a unified system to verify and monitor this data effectively.

---

## 💡 Solution

CarbonSync addresses these challenges by providing a centralized digital platform that:

- Enables companies to track and manage carbon emissions
- Allows auditors to verify and validate data
- Helps authorities monitor compliance and activities

The platform connects all stakeholders into a single, streamlined workflow.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | Vanilla HTML, CSS, JavaScript |
| Backend | Java Spring Boot 3, Maven |
| Database | PostgreSQL (wiring in progress) |
| Deployment | Netlify (frontend) · Railway (backend — upcoming) |
| Tools | Git, GitHub, Postman |

---

## 📁 Project Structure

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

## ⚙️ Features (Built / In Progress)

- Monochromatic black & gold design system
- Interactive Spline 3D hero on landing page
- Three role-based portals — Company, Auditor, Government
- Animated dashboards with live counters, charts, and terminal widgets
- Auditor review queue with expand / verify / flag toggle
- Government compliance table with real CSV, JSON, and PDF export
- Onboarding tour on each portal for new users
- Fully responsive — mobile hamburger nav, stacked layouts
- User authentication and role-based access
- Emission data tracking and management
- Report generation and structured data handling
- Auditor verification workflow
- Centralized dashboard for monitoring

---

## 🧠 System Design (Concept)

- Role-based system (Company / Auditor / Authority)
- Centralized database for storing emission data
- REST APIs for communication between frontend and backend

---

## ⚡ Run Locally

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

## 🔌 API Endpoints

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

## 📌 Current Status

🚧 The frontend prototype is fully built and live. The Spring Boot backend compiles and runs with stub data. Database wiring and JWT authentication are the next milestones.

---

## 🎯 Future Scope

- Wire PostgreSQL via Railway
- Implement JWT authentication
- Connect frontend API calls to live backend
- Advanced analytics and insights
- AI-assisted anomaly detection for auditors
- Carbon credit marketplace module
- Integration with external systems
- Scalable architecture for larger datasets

---

## 🤝 Contributors

- Yash Tripathi
- Somiya Chaturvedi
- Tarang Nemani
- Utkarsh Tiwari

---

## 📬 Contact

For any queries or collaboration, feel free to connect.
