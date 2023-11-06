class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> previous = null;
    Node<T> curr = head;
    Node<T> next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = previous;
      previous = curr;
      curr = next;
    }
    head = previous;
    return head;
  }

  public static void main(String[] args) {
    Node<String> x = new Node<>("x");
    Node<String> y = new Node<>("y");
    Node<String> z = new Node<>("z");
    x.next = y; // x -> y
    y.next = z;
    // Printing solution
    Node<String> head = Source.reverseList(x);

    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }
}