public class SimpleList {
    int size;
    Node inicio;

    public void insertHead(String data){
        Node newNode = new Node(data, null);
        if (isEmpty()){
            inicio  = newNode;
        }else {
            newNode.setNext(inicio);
            inicio = newNode;
        }
    }

    public void insertEnd(String data){
        Node newNode = new Node(data, null);
        if (isEmpty()){
            inicio = newNode;
        }else {
            Node route = inicio;
            while (route.getNext() != null){
                route = route.getNext();
            }
            route.setNext(newNode);
        }
    }

    public void printList(){
        if (isEmpty()){
            System.out.println("There is not any element");
        }else {
            Node route = inicio;
            while (route != null){
                System.out.println(route.getData());
                route = route.getNext();
            }
        }
    }

    public boolean isEmpty(){
        return inicio == null;
    }
}
