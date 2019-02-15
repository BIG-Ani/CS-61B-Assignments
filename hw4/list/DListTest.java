/*DListTest.java*/

package list;

public class DListTest{

	public static void dlistDisplay(DList testList){
	  System.out.println("\n Is it empty? :" + testList.isEmpty());
	  System.out.println("\n The length of this Dlist : " + testList.length()+"\n");
	}

	public static void testDListConstructor(){
		DList tList1 = new DList();
	  	
	  	System.out.println("\n A new Dlist after first construction should be [  ]: " + tList1.toString());
		dlistDisplay(tList1);
	}

	public static void manipulationTest(){
		DList tList1 = new DList();

		int[] frontList	= {1,5,3,65,10,32};
		int[] backList	= {32,45,65,27,76};

		System.out.println("\n Testing the insertFront function///");
		for (int i : frontList) {
			tList1.insertFront(new Integer(i));
		}

		System.out.println("\n Testing result after front inseration...");
		System.out.println("\n The DList after front insertion should be [32, 10, 65, 3, 5, 1]: " + tList1.toString()+"\n");
		dlistDisplay(tList1);

		System.out.println("\n Testing the insertBack function///");
		for (int j : backList) {
			tList1.insertBack(j);
		}

		System.out.println("\n Testing result after back insertation...");
		System.out.println("\n The DList after back insertation should be [32, 10, 65, 3, 5, 1, 32, 45, 65, 27, 76]:" + tList1.toString()+"\n");
		dlistDisplay(tList1);

		nodeManipulationTest(tList1);
	}

	public static void nodeManipulationTest(DList testList){
		DListNode testNode = testList.head.next.next;

		System.out.println("\n Testing the remove function///");
		testList.remove(testNode);
		System.out.println("\n The Dlist after remove manipulation should be [32, 65, 3, 5, 1, 32, 45, 65, 27, 76]: "+testList.toString());
		dlistDisplay(testList);

		int inBfore = 777, inBk = 222;
		System.out.println("\n Testing the insertBefore function///");
		testList.insertBefore(new Integer(inBfore), testList.head.next);
		System.out.println("\n The Dlist after remove manipulation should be [777, 32, 65, 3, 5, 1, 32, 45, 65, 27, 76]: "+testList.toString());
		dlistDisplay(testList);
		
		testList.insertBefore(new Integer(inBfore), testList.head.next.next);
		System.out.println("\n The Dlist after remove manipulation should be [777, 777, 32, 65, 3, 5, 1, 32, 45, 65, 27, 76]: "+testList.toString());
		dlistDisplay(testList);

		System.out.println("\n Testing the insertBack function///");
		testList.insertAfter(new Integer(inBk), testList.head.prev);
		System.out.println("\n The Dlist after remove manipulation should be [777, 777, 32, 65, 3, 5, 1, 32, 45, 65, 27, 76, 222]: "+testList.toString());
		dlistDisplay(testList);

		testList.insertAfter(new Integer(inBk), testList.head.prev.prev);
		System.out.println("\n The Dlist after remove manipulation should be [777, 777, 32, 65, 3, 5, 1, 32, 45, 65, 27, 76, 222, 222]: "+testList.toString());
		dlistDisplay(testList);

		int inBfore1 = 888, inBk1=111;
		testList.insertBefore(new Integer(inBfore1), testList.front().next.next.next);
		System.out.println("\n The Dlist after remove manipulation should be [777, 777, 32, 888, 65, 3, 5, 1, 32, 45, 65, 27, 76, 222, 222]: "+testList.toString());
		dlistDisplay(testList);

		testList.insertAfter(new Integer(inBk1), testList.back().prev.prev.prev);
		System.out.println("\n The Dlist after remove manipulation should be [777, 777, 32, 888, 65, 3, 5, 1, 32, 45, 65, 27, 111, 76, 222, 222]: "+testList.toString());
		dlistDisplay(testList);

	}

	public static void main(String[] args){

		testDListConstructor();
		manipulationTest();

	}
}