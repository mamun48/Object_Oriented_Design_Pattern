class BasicWebPage implements WebPage {
    private String content;

    public BasicWebPage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}