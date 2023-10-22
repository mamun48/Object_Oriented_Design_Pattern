import java.util.List;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        String pageContent = "Welcome to our web page!";
        List<String> searchResults = List.of("Result 1", "Result 2", "Result 3", "Result 4", "Result 5", "Result 6", "Result 7");
        List<String> authorizedUsers = List.of("UserA", "UserB");

        WebPage basicPage = new BasicWebPage(pageContent);

        // Add authorization check and paging to the web page.
        WebPage authorizedPage = new AuthorizationDecorator(basicPage, authorizedUsers);
        WebPage paginatedPage = new PagingDecorator(authorizedPage, searchResults);

        // Display the final decorated web page.
        paginatedPage.display();
    }
}
