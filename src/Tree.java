public class Tree {

    //вложенный класс
    static class Node {
        public Node left;            // левое и правое поддеревья и ключ
        public Node right;
        public int key;

        public Node(int key) {       // конструктор с инициализацией ключа

            this.key = key;
        }
    }

    Node root;   // корень

    public void addNode(int key) {   //добавление нового узла
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            // начинаем строить дерево с корня
            Node focusNode = root;
            // будующий родитель для нового узла
            Node parent;
            while (true) {
                //корень это родитель
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void printTree(Node focusNode) {
        if (focusNode != null) {
            printTree(focusNode.left);
            System.out.println(focusNode);
            printTree(focusNode.right);
        }
    }

    public void treeSort(int[] array) {
        //получить массив изаписать его в дерево и вывести дерево
        for (int i = 0; i < array.length; i++) {
            addNode(array[i]);
//            System.out.println(i+" узел бинарного дерева "+array[i]);
        }
        printTree(root);
    }
}


