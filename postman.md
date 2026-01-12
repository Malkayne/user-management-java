# User Management API - Postman Documentation

**Base URL**: `http://localhost:8080/api/users`

## 1. Create User
**Method**: `POST`
**URL**: `http://localhost:8080/api/users`
**Headers**:
- `Content-Type`: `application/json`

**Body (JSON)**:
```json
{
  "name": "Kayode Owoseni",
  "email": "kayode@example.com",
  "password": "secret123"
}
```

**Response (201 Created)**:
```json
{
  "id": 1,
  "name": "Kayode Owoseni",
  "email": "kayode@example.com",
  "createdAt": "2026-01-12T10:20:30"
}
```

---

## 2. List Users
**Method**: `GET`
**URL**: `http://localhost:8080/api/users`

**Response (200 OK)**:
```json
[
  {
    "id": 1,
    "name": "Kayode Owoseni",
    "email": "kayode@example.com",
    "createdAt": "2026-01-12T10:20:30"
  }
]
```

---

## 3. Get Single User
**Method**: `GET`
**URL**: `http://localhost:8080/api/users/{id}`
**Example**: `http://localhost:8080/api/users/1`

**Response (200 OK)**:
```json
{
  "id": 1,
  "name": "Kayode Owoseni",
  "email": "kayode@example.com",
  "createdAt": "2026-01-12T10:20:30"
}
```

**Response (404 Not Found)**:
```json
{
  "status": "error",
  "message": "User not found with id: 1"
}
```

---

## 4. Update User
**Method**: `PUT`
**URL**: `http://localhost:8080/api/users/{id}`
**Example**: `http://localhost:8080/api/users/1`
**Headers**:
- `Content-Type`: `application/json`

**Body (JSON)**:
```json
{
  "name": "Kayode Updated",
  "email": "kayode.updated@example.com"
}
```
*(Note: Fields are optional, only provide what you want to update)*

**Response (200 OK)**:
```json
{
  "id": 1,
  "name": "Kayode Updated",
  "email": "kayode.updated@example.com",
  "createdAt": "2026-01-12T10:20:30"
}
```

---

## 5. Delete User
**Method**: `DELETE`
**URL**: `http://localhost:8080/api/users/{id}`
**Example**: `http://localhost:8080/api/users/1`

**Response (204 No Content)**:
*(Empty Body)*
