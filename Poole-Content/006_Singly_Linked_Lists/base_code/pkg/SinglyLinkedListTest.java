public class SinglyLinkedListTest{
/*  Test 1
This will test that we can add one node with a non zero value
to the linked list. */

// Setup
public static void main(String[] args){


    SinglyLinkedList test_linkedlist = new SinglyLinkedList();
    
    // insert to the linked list
    for(int i=0;i<2;i++)
        test_linkedlist.insert(i,i+1);
    for(int i=0;i<5;i++)
        test_linkedlist.insert(i, i+1);



    // assert that the reality meets expectation
    // assert that if we run the code (left hand side of the ==), we will get the output that we want / are writing a test for
}


//
}