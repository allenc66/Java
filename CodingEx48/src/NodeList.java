public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem a);

    boolean removeItem(ListItem b);

    void traverse(ListItem root);
}
