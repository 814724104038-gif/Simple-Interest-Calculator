# Simple Interest Calculator - Servlet Project

## 📋 Project Description
A Java Servlet-based web application that calculates Simple Interest using the formula:  
**SI = (P × R × T) / 100**

## 🎯 Objective
To implement Simple Interest calculation using Servlet's `service()` method without database support.

## 🛠️ Technologies Used
- **Backend:** Java Servlets (Jakarta EE 9+, Tomcat 10.1)
- **Frontend:** HTML5, CSS3
- **Server:** Apache Tomcat v10.1
- **IDE:** Eclipse IDE for Enterprise Java
- **Build Tool:** None (Plain Dynamic Web Project)

## 📁 Project Structure
SimpleInterestCalculator/
├── src/
│ └── com/si/calculator/
│ └── SimpleInterestServlet.java
├── webapp/
│ ├── index.html
  |----screenshots
│ ├── README.md (this file)
│ └── WEB-INF/
│ └── web.xml
└── (Eclipse configuration files)

## ⚙️ Features
- ✅ HTML form with input validation
- ✅ Servlet with `service()` method (not doGet/doPost)
- ✅ Simple Interest calculation
- ✅ Formatted result display
- ✅ Error handling for invalid inputs
- ✅ Responsive UI design

## 🚀 How to Run

### Prerequisites
- Java JDK 11 or higher
- Eclipse IDE for Enterprise Java
- Apache Tomcat v10.1

### Setup Steps
1. **Import Project:**  
   Eclipse → File → Import → Existing Projects into Workspace

2. **Configure Server:**  
   Window → Show View → Servers → Add Tomcat 10.1

3. **Run Application:**  
   Right-click `index.html` → Run As → Run on Server

4. **Access Application:**  
