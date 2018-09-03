class NPermutations {
  int[][] outputArray;

  public static void main(String[] args) {
    entryPoint(Integer.parseInt(args[0]));
  }

  public entryPoint(int numberOfElements){
    long numberOfPermutations = factorial(numberOfElements);
    outputArray = new int[][numberOfPermutations];

    int[] initialArray = generateInitialArray(numberOfElements);

    Node zeroNode = new Node(0, null);
    recursionInsanity(zeroNode, initialArray);
    for (int[] permutation : outputArray) {
      System.out.println(permutation.toString());
    }
  }

  private void recursionInsanity(Node parent, int[] remainingElements){

    // base case
    if (remainingElements.length == 0){
      outputArray.append(getParentsAndChild(parent, new int[]));
    }

    else {
      for(int element:remainingElements){
        tempArray[remainingElements.length-1];
        Node node = new Node(element, parent);

        // create array one element smaller
        for(int tempElement : remainingElements){
          if(tempElement != element){ tempArray.append(tempElement); }
        }
        recursionInsanity(node, tempArray);
      }
    }

  }

  private int[] generateInitialArray(int numberOfElements){
    int[] result;

    for(int i = 1; i <= numberOfElements; i++){
      result.append(i);
    }
    return result;
  }

  private int[] getParentsAndChild(Node leaf, int[] values){
    if(leaf.getParent().getParent() == null) {
      return values;
    }
    else {
      values.append(leaf.getValue());
      getParentsAndChild(leaf.getParent(), values);
    }
  }

  //TODO: implement factorial
  private int factorial(n) {
    long product = 1;
    for(int i = n; i > 1; i--){
      product = product * i;
    }
    return product;
  }

}
