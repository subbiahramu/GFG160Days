class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node newHead = null, tmp = null;
        while(head1!=null || head2!=null){
            if(head1!=null && (head2 == null || head1.data<head2.data)){
                if(newHead == null){
                    newHead=head1;
                    tmp=head1;
                }else {
                    tmp.next=head1;
                    tmp=head1;
                }     
                head1=head1.next;
            }
            else {
                if(newHead == null){
                    newHead=head2;
                    tmp=head2;
               }else {
                    tmp.next=head2;
                    tmp=head2;
                }
                head2=head2.next;
            }
        }
        tmp.next=null;
        return newHead;
    }} 
