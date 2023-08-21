public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next(){
       return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem a) {
        this.rightLink = a;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem b) {
        this.leftLink = b;
        return this.leftLink;
    }
    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return ((String) super.getValue()).compareTo((String)item.getValue());
        } else {
            return -1;
        }

    }
}
