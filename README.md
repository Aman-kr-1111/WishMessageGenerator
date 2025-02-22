# 🎉 WishMessageGenerator

A simple **Spring Core** application that generates a personalized greeting message based on the current time. This project demonstrates **Dependency Injection (DI)** using the **Spring Framework** and highlights different ways to inject dependencies into a bean.

------
## 🛠 Tech Stack

- **Java 17+**
- **Spring Core 6.2.2** (without Spring Boot)
- **XML-based Spring Configuration**

---
## 📜 Dependencies

Make sure you have the following Spring JAR files in your classpath:

- `spring-beans-6.2.2.jar`
- `spring-context-6.2.2.jar`
- `spring-core-6.2.2.jar`
- `spring-expression-6.2.2.jar`
- `spring-aop-6.2.2.jar`
- `spring-context-support-6.2.2.jar`
- `spring-jcl-6.2.2.jar`

---
## 📁 Project Structure

```
📂 src/
 ├── 📂 com/nt/sbeans/
 │    ├── WishMessageGenerator.java  // Main Spring Bean
 │
 ├── 📂 com/nt/client/
 │    ├── DependencyInjectionTest.java  // Client class
 │
 ├── 📂 com/nt/cfgs/
 │    ├── applicationContext.xml  // Spring Configuration File
```
---
## 📜 Description

This project demonstrates how **Spring Dependency Injection (DI)** is used to inject an object of `LocalDateTime` into the `WishMessageGenerator` class. This injection allows `WishMessageGenerator` to determine the current time and generate an appropriate wish message.

### 🔹 **Key Components & Their Purpose**

1. **`WishMessageGenerator.java`** - A Spring Bean that generates a greeting message based on the time of the day.
2. **`DependencyInjectionTest.java`** - The client class that loads the Spring container and fetches the required bean.
3. **`applicationContext.xml`** - The Spring configuration file that:
   - Defines multiple `LocalDateTime` beans with different timestamps.
   - Enables **Component Scanning** to auto-detect and register `@Component` annotated beans.
   - Demonstrates **Factory Method Injection** to instantiate `LocalDateTime`.
---
## 🔧 Setup & Run

1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/WishMessageGenerator.git
   cd WishMessageGenerator
   ```

2. **Compile and Run**
   ```sh
   javac -cp .;lib/* src/com/nt/client/DependencyInjectionTest.java
   java -cp .;lib/* com.nt.client.DependencyInjectionTest
   ```

---
## 📝 How It Works

### 🔹 **Spring Dependency Injection Explained**

- **Field Injection** (Used in `WishMessageGenerator`):
  - The `@Autowired` annotation is used to automatically inject an instance of `LocalDateTime` into the class.
  - The dependency is resolved by looking for a matching bean in the Spring context.

- **Constructor Injection (Commented Code in `WishMessageGenerator`)**:
  - This approach injects dependencies through the constructor.
  - If multiple parameters are required, multiple beans are passed during instantiation.

- **Setter Injection (Commented Code in `WishMessageGenerator`)**:
  - Instead of injecting at the constructor level, dependencies are assigned via setter methods.

---
### 🔹 **Bean Definition in `applicationContext.xml`**

- **Dynamically Fetching Current Date & Time**
  ```xml
  <bean id="ldt" class="java.time.LocalDateTime" factory-method="now" primary="true"/>
  ```
  - This method injects the current system date-time dynamically.
  - `primary="true"` ensures this is the default bean when multiple instances exist.

- **Manually Setting a Specific Date & Time**
  ```xml
  <bean id="ldt2" class="java.time.LocalDateTime" factory-method="of">
       <constructor-arg name="year" value="2021"/>
       <constructor-arg name="month" value="11"/>
       <constructor-arg name="dayOfMonth" value="25"/>
       <constructor-arg name="hour" value="10"/>
       <constructor-arg name="minute" value="40"/>
       <constructor-arg name="second" value="21"/>
  </bean>
  ```
  - Instead of using the system date-time, this manually sets a fixed timestamp.
  - Useful for testing scenarios where you need a predictable output.

---
### 🎯 **Expected Output**

When running `DependencyInjectionTest.java`, the output will be:
```
Good Morning, Raja  // If the current time is in the morning
Good Afternoon, Raja // If it's afternoon
Good Evening, Raja  // If it's evening
Good Night, Raja  // If it's night
```

## 📌 Key Takeaways

✅ **Spring handles object creation and dependency management automatically.**

✅ **Multiple ways to inject dependencies: Field, Constructor, and Setter Injection.**

✅ **XML Configuration is still a valid approach, even with Spring Boot's rise.**

✅ **You can manually specify timestamps for testing purposes.**

---

## ✨ Created By

👨‍💻 **Aman Kumar**  
🚀 Passionate Java Full Stack Developer 💡  
📧 Reach me at: [LinkedIn](https://www.linkedin.com/in/your-profile) | [GitHub](https://github.com/your-profile)  

---

🔗 **Happy Coding! 🚀**



