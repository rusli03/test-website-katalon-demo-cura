# test-website-katalon-demo-cura
Project automation katalon untuk test home weekend.inc
# 🧪 Katalon Automation Project  
### Project: Website Demo Cura & Petstore API Automation

---

## 📁 Project Structure

test-website-katalon-demo-cura/
├── Test Cases/
│ ├── login_logout/
│ │ ├── TC_login_valid.tc
│ │ ├── TC_login_invalid.tc
│ │ └── TC_logout.tc
│ └── PetstoreAPITest/
│ ├── TC01_Create_User.groovy
│ ├── TC02_Get_User.groovy
│ └── TC03_Update_User.groovy
│
├── Object Repository/
│ ├── API/
│ │ ├── createUser.rs
│ │ ├── getUserByName.rs
│ │ └── updateUser.rs
│ └── Web/
│ └── (website cura elements)
│
└── Profiles/
└── default.glbl


---

## 🌐 API Automation (Swagger Petstore)

Base URL:

### ✅ Test Scenarios
| No | Method | Endpoint | Description |
|----|---------|-----------|--------------|
| 1 | **POST** | `/user` | Create new user |
| 2 | **GET** | `/user/{username}` | Get user detail by username |
| 3 | **PUT** | `/user/{username}` | Update existing user data |

### 🔧 Example Test Data
```json
{
  "id": 101,
  "username": "qa_rusli",
  "firstName": "Rusli",
  "lastName": "Fauzi",
  "email": "rusli@example.com",
  "password": "123456",
  "phone": "08123456789",
  "userStatus": 1
}

How to Run Tests in Katalon Studio
1. Open Katalon Studio
2. Load project folder test-website-katalon-demo-cura
3. Go to Test Cases → PetstoreAPITest
4. Right-click → Run → Web Service Request
5. Check the result in the Log Viewer or Reports tab
Make sure you have internet connection to access Swagger API.

🧾 Test Results
Test Case	Result
TC01_Create_User	✅ Passed
TC02_Get_User	✅ Passed
TC03_Update_User	✅ Passed

🧰 Tools & Dependencies
Katalon Studio Enterprise 10.3.2
Groovy scripting
Git + GitHub for version control
Swagger Petstore (public API)

👤 Author
Rusli Fauzi
Quality Assurance Engineer
📧 rusli.fauzi@gmail.com
💼 GitHub: Rusli03



