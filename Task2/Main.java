package Task2;

class Main {

    public static void main(String[] args) {
        NodeList nodeList = new NodeList();
        nodeList.add(1);
        nodeList.add(2);
        nodeList.add(3);
        nodeList.add(4);
        nodeList.add(5);

        nodeList.printNodeList();

        nodeList.reverse();
        nodeList.printNodeList();
    }
}