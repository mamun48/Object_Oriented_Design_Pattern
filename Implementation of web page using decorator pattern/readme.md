# Decorator Design Pattern for Web Page Enhancement

## Overview

This Java program illustrates the use of the Decorator design pattern to enhance the behavior of a web page dynamically. The Decorator pattern allows for the addition of features to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. In this program, we demonstrate how to decorate a basic web page with two features: authorization control and search result pagination.

## Classes

1. **WebPage** (Interface)
   - Represents the basic web page behavior.
   - Contains the `display` method, which displays the content of the web page.

2. **BasicWebPage** (Concrete Component)
   - Implements the `WebPage` interface.
   - Represents a basic web page with a simple content.

3. **WebPageDecorator** (Abstract Decorator)
   - Extends the `WebPage` interface.
   - Contains a reference to the decorated `WebPage` object.
   - Provides a default implementation of the `display` method, delegating the call to the decorated object.

4. **AuthorizationDecorator** (Concrete Decorator)
   - Extends the `WebPageDecorator` class.
   - Adds authorization control to the web page.
   - Checks if the current user is authorized to access the page and displays it accordingly.

5. **PagingDecorator** (Concrete Decorator)
   - Extends the `WebPageDecorator` class.
   - Adds search result pagination to the web page.
   - Displays a portion of search results in a paginated manner.

## Program Execution

1. The `main` method in the `DecoratorPatternDemo` class serves as the entry point of the program.

2. A basic web page is created using `BasicWebPage`.

3. The `AuthorizationDecorator` is used to add authorization control to the web page. It checks if the current user is authorized to access the page and displays it accordingly.

4. The `PagingDecorator` is used to add search result pagination to the web page. It splits the search results and displays a portion of them.

5. The final decorated web page with both authorization control and search result pagination is displayed.



