import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                list1.next =  mergeTwoLists(list1.next,list2);
                return list1;
            }
            else
            {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }
    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(solution.mergeTwoLists(list1,list2));//val, next val, next next val 1 1 2 3 4 4


    }
}
