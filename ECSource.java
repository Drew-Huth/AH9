class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    while (head.next != null) {
      if (head.val != head.next.val)
        return false;
      isUnivalueList(head = head.next);
    }
    return true;
  }

  public static void main(String[] args) {
    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(2);
    Node<Integer> x = new Node<>(2);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;
    System.out.println((ECSource.isUnivalueList(u)));
  }
}
