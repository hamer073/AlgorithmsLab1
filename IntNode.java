public class IntNode{
  private int value;
  private Node parent;
  private Node[] children;

  Node(int value, Node parent) {
    this.value = value;
    this.parent = parent;

    parent.addChild(this);
  }

  private void addChild(Node newChild){
    this.children.append(newChild);
  }

  public Node getParent(){ return this.parent; }
  public Node[] getChildren(){ return this.children; }
  public int getValue(){ return this.value; }
  public int setValue(newValue){ this.value = newValue; }
}
