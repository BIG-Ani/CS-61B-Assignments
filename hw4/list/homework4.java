public class homework4{

	public static void testConstructor(){
		DList tlist1 = new DList();
		System.out.println("\n Here is a list after construction: "+tlist1.toString());
		TestHelper.verify(tlist1.toString().equals("[  ]"), "***ERROR: toString on newly constructed list failed!");

		System.out.println("Is it empty? Should be true: " + tlist1.isEmpty());
		TestHelper.verify(tlist1.isEmpty()==true, "***ERROR: isEmpty() on newly constructed list failed!");

		System.out.println("The length should be zero: "+tlist1.length());
		TestHelper.verify(tlist1.length()==0, "***ERROR: length() on newly constructed list is wrong!");
	}

	public static void manipunationTest(){
		DList tList2 = new DList();
		int[] frontList = {2,3,5,7,11};
		int[] backList = {1,4,6,8,9,10};

		System.out.println("\n Testing the front-back insertation...");

		for (int i : frontList) {
			tList2.insertFront(new Integer(i));
		}
		String result = tList2.toString();

		System.out.println("The size of List should be 5: "+ tList2.size);
		System.out.println("The front of this list should be 11: "+tList2.front().item);
		System.out.println("The back of this list should be 2: "+tList2.back().item);

		System.out.println("The result after frontInsertation should be [11,7,5,3,2]: "+result);
		TestHelper.verify(result.equals("[  11  7  5  3  2  ]"), "***ERROR: The insertation function failed!");

		for (int j : backList) {
			tList2.insertBack(new Integer(j));
		}
		result = tList2.toString();

		System.out.println("The size of List should be 11: "+tList2.size);
		System.out.println("The back of this list should be 10: "+tList2.back().item);

		System.out.println("The result after backInsertation should be [11,7,5,3,2,1,4,6,8,9,10]: "+result);
		TestHelper.verify(result.equals("[  11  7  5  3  2  1  4  6  8  9  10  ]"), "***ERROR: The insertation function failed!");

		nodesManipunation(tList2);
	}

	public static void nodesManipunation(DList testList){
		DListNode node1 = testList.head.next.next;

		testList.remove(node1);
		String result1 = testList.toString();

		System.out.println("The list after operation should be [  11  5  3  2  1  4  6  8  9  10  ]: "+ result1);
		//TestHelper.verify(testList.size==10, "***ERROR: the result of list is wrong!!!");

		System.out.println("test list front: "+testList.head.next.item);
		System.out.println("test list back: "+testList.head.prev.item);

		DListNode node3 = testList.back();
		System.out.println("\nNode3.item: " + node3.item);
		System.out.println("Node3.prev.item: " + node3.prev.item);
		System.out.println("Node3.next.item: " + node3.next.item);

		System.out.println("\nThe new front of the list after operation: " + testList.head.next.item);
		System.out.println("The new back of the list after operation: " + testList.head.prev.item);

		testList.remove(node3);
		String result2 = testList.toString();

		System.out.println("\nAfter remove node3 test list front: " + testList.head.next.item);
		System.out.println("After remove node3 test list back: " + testList.head.prev.item);
		System.out.println("After remove node3, the list after operation should be [  7  5  3  2  1  4  6  8  9  ]: " + result2);
		//TestHelper.verify(testList.size==9, "***ERROR: the result of list is wrong!!!");

	}

  	public static void main(String[] args) {
    	testConstructor();
    	manipunationTest();
  }
}