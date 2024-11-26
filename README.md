# Simple Dynamic Web Application

This project demonstrates a simple Java Servlet web application. The application includes a servlet that handles HTTP GET requests and responds with a "Hello from Servlet!" message, as well as JSP pages that display messages.

## Features

- **HelloServletController**: A servlet that responds to HTTP GET requests and displays a message.
- **JSP Pages**: Static pages that display simple messages.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat or any other servlet container
- An Integrated Development Environment (IDE) like Eclipse that supports Dynamic Web Projects


## Usage

### Setting Up the Project in Eclipse

1. **Create a New Dynamic Web Project:**

    - Open Eclipse.
    - Go to `File` > `New` > `Dynamic Web Project`.
    - Enter a name for your project and configure the runtime (e.g., Apache Tomcat).
    - Click `Finish`.

2. **Add the Servlet:**

    - Right-click on the `src` folder and select `New` > `Package`. Name it `gr.perisnik.cjweb.controller`.
    - Right-click on the new package and select `New` > `Class`. Name it `HelloServletController`.

3. **Add the Servlet Code:**

     - Create a file named `HelloServletController.java` in the `gr.perisnik.cjweb.controller` folder and add the content of `HelloServletController.java`.

4. **Add the JSP Pages:**

    - Create a file named `hello.jsp` in the `WebContent` folder and add the content of `hello.jsp`.

    - Create a file named `index.html` in the `WebContent` folder and add the content of `index.html`.

5. **Run the Project:**

    - Right-click on the project and select `Run As` > `Run on Server`.
    - Choose your configured server (e.g., Apache Tomcat) and click `Finish`.

6. **Access the Servlet and JSP Pages:**

    - Open your web browser and navigate to:

      ```
      http://localhost:8080/TestWebProject/hello-servlet
      ```

      You should see the message "Hello from Servlet!" displayed on the page.

    - To access the JSP page, navigate to:

      ```
      http://localhost:8080/TestWebProject/hello.jsp
      ```

      You should see the message "Hello JSP Web App" displayed on the page.

    - To access the HTML page, navigate to:

      ```
      http://localhost:8080/TestWebProject/index.html
      ```

      You should see the message "Hello Web App" displayed on the page.

## Author

- **Peris Nik**
