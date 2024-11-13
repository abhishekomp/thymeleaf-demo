# Thymeleaf layout dialect demonstration

This project demonstrates usage of Thymeleaf layout dialect in a Spring Boot application.

## Project Overview

This Spring Boot application showcases the following features:

- Usage of Thymeleaf layout dialect to define the base layout that other web pages can use to feed their content.
- Usage of layout dialect directive `layout:decorate`
- Usage of `layout:title-pattern="$CONTENT_TITLE"` to dynamically specify the web page title.
- Passing variable to the html for Thymeleaf to perform the rendering of data.
- Usage of HTML table whose rows are populated by using Thymeleaf's th:each directive.
- Formatting of date for display purpose using #temporals.format (thymeleaf)

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 17 or later
- Apache Maven

## Project Structure

The project (multi-module maven project) consists of the following applications:

- `thymeleaf-demo`: A Spring boot application that demonstrates usage of Thymeleaf fragments.
- `thymeleaf-layout-dialect-demo`: A Spring boot application that demonstrates usage of Thymeleaf layout dialect feature.

## Usage

Once the application is running, you can interact access the application using following endpoint:

- thymeleaf-demo: http://localhost:8080
- thymeleaf-layout-dialect-demo = http://localhost:8081

The above endpoint will show the main page for the web application.

Happy coding!