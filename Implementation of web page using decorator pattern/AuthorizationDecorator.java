import java.util.List;

class AuthorizationDecorator extends WebPageDecorator {
    private List<String> authorizedUsers;

    public AuthorizationDecorator(WebPage decoratedPage, List<String> authorizedUsers) {
        super(decoratedPage);
        this.authorizedUsers = authorizedUsers;
    }

    @Override
    public void display() {
        // Check if the user is authorized.
        String currentUser = "UserA"; // Simulated current user
        if (authorizedUsers.contains(currentUser)) {
            super.display(); // Display the page if authorized.
        } else {
            System.out.println("Unauthorized access. Please log in.");
        }
    }
}
