class Solution {
    Node reverseList(Node head) {
        // code here
        Node tmpHead = null;
        while(head!=null){
            Node nex = head.next;
            if(tmpHead == null) {
                tmpHead = head;
                tmpHead.next = null;
            }
            else {
                head.next = tmpHead;
                tmpHead = head;
            }
            head = nex;
        }
        return tmpHead;
    }
}