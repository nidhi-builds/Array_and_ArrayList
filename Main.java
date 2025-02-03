// Main.java
// Name: Nidhi Pandit
// PRN: 23070126081
// Batch: B1

class Main {
    public static void main(String args[]) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();
        
        int[] userArray = in.arrayInput();
        
        // Task 1: Separate even and odd numbers
        functions.oddEven(userArray);
        
        // Task 2: Find the index of two neighboring numbers with the smallest difference
        int minIndex = functions.findSmallestDifferenceIndex(userArray);
        System.out.println("Index of the first number in the closest pair: " + minIndex);
    }
}
