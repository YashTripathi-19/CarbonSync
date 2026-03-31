# CarbonSync Backend

Spring Boot 3 · Java 17 · Maven

## Run locally

```bash
cd backend
mvn spring-boot:run
```

API base: `http://localhost:8080/api`

## Current state

All repositories are **stub interfaces** — services return hardcoded in-memory data.
The app compiles and all endpoints respond immediately with no database required.

## Wire a real database

1. Add the PostgreSQL dependency in `pom.xml` (block is commented out — swap H2 for it)
2. Uncomment the datasource block in `application.properties`
3. Make each repository extend `JpaRepository<Model, Long>` and annotate with `@Repository`
4. Annotate each model with `@Entity`, `@Table`, `@Id`, `@GeneratedValue`
5. Remove the hardcoded `STUB` lists from services and replace with repository calls

## Wire JWT auth

1. Add `jjwt` dependency to `pom.xml`
2. Implement `JwtUtil` (generate / validate tokens)
3. Add `JwtAuthFilter extends OncePerRequestFilter`
4. Register the filter in `SecurityConfig` before `UsernamePasswordAuthenticationFilter`
5. Replace `stub-jwt-token` in `AuthService` with real token generation

---

## API Endpoints

| Method | Path | Description |
|--------|------|-------------|
| POST | `/api/auth/signup` | Register a new user |
| POST | `/api/auth/login` | Authenticate and receive token |
| GET | `/api/companies` | List all companies |
| GET | `/api/companies/{id}` | Get company by ID |
| POST | `/api/companies` | Create a company |
| GET | `/api/auditors` | List all auditors |
| GET | `/api/auditors/{id}` | Get auditor by ID |
| POST | `/api/auditors` | Create an auditor |
| GET | `/api/government` | List all government bodies |
| GET | `/api/government/{id}` | Get government body by ID |
| POST | `/api/government` | Create a government body |
| GET | `/api/carbon` | List all carbon entries |
| GET | `/api/carbon/{id}` | Get carbon entry by ID |
| GET | `/api/carbon/company/{companyId}` | Get entries for a company |
| POST | `/api/carbon` | Submit a new carbon entry |
