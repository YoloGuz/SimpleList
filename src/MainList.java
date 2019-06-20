public class MainList {
    public static void main (String [] args){
        SimpleList miSimoleList = new SimpleList();
        miSimoleList.insertHead("A");
        miSimoleList.insertHead("B");
        miSimoleList.insertHead("C");
        miSimoleList.insertEnd("D");
        miSimoleList.insertEnd("E");
        miSimoleList.printList();
    }
}
