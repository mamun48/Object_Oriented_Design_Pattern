import java.util.List;

class PagingDecorator extends WebPageDecorator {
    private List<String> searchResults;

    public PagingDecorator(WebPage decoratedPage, List<String> searchResults) {
        super(decoratedPage);
        this.searchResults = searchResults;
    }

    @Override
    public void display() {
        // Split the search results and display a portion of them.
        int pageSize = 5;
        for (int i = 0; i < pageSize && i < searchResults.size(); i++) {
            System.out.println(searchResults.get(i));
        }
        super.display();
    }
}