class NPermutations {
  int[][] outputArray;

  public entryPoint(int numberOfElements){
    int numberOfPermutations = numberOfElements!;
    outputArray = new int[][numberOfPermutations];

    int[] initialArray = generateInitialArray(numberOfElements);

    Node zeroNode = new Node(0, null);
    recursionInsanity(zeroNode, initialArray);
  }

  private int[] recursionInsanity(Node parent, int[] remainingElements){

    // base case
    if (remainingElements.length == 0){ return /* array */; }

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

  private int[][] generateAllPermutations(int numberOfElements){

    outputArray.append(generateInitialArray(numberOfElements));

  }

  private int[] generateInitialArray(int numberOfElements){
    int[] result;

    for(int i = 1; i <= numberOfElements; i++){
      result.append(i);
    }
    return result;
  }

  private int factorial(n) {
    //TODO: implement factorial
  }

}
