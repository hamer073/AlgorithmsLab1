class NPermutations {
  int[][] outputArray;

  public entryPoint(int numberOfElements){
    int numberOfPermutations = n!;
    outputArray = new int[][numberOfPermutations];

    int[] initialArray = generateInitialArray(n);
  }

  private void recursionInsanity(Node parent, int[] remainingElements){
    if (remainingElements.length == 0) { return void; }
    else {
      for(int element:remainingElements){
        tempArray[remainingElements.length-1];
        Node node = new Node(element, parent);
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
