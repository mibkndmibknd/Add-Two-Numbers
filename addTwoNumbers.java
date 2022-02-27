import ListNode.ListNode;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode p=l1;
        ListNode q=l2;
        ListNode dummyhead=new ListNode(0);
        ListNode cur=dummyhead;
        while(p!=null  || q!=null ){
          int sum=0;
          if(p!=null && q!=null)
            sum=p.val+q.val+carry;
          else if(q!=null)
            sum=q.val+carry;
          else if(p!=null)
            sum=p.val+carry;
          else
            sum=carry;
          if(sum>=10){
            carry=1;
            sum=sum%10;
          }
          else
            carry=0;
          cur.next=new ListNode(sum);
          cur=cur.next;
          if(p!=null)
            p=p.next;
          if(q!=null)
            q=q.next;
        }
        if(carry==1)
          cur.next=new ListNode(1);
        return dummyhead.next;
    }
}
public class addTwoNumbers{
  public static void main(String[] args) {
    ListNode l13=new ListNode(8);
    ListNode l12=new ListNode(4,l13);
    ListNode l11=new ListNode(5,l12);

    ListNode l23=new ListNode(4);
    ListNode l22=new ListNode(6,l23);
    ListNode l21=new ListNode(5,l22);


    ListNode ans1;
    Solution s1=new Solution();
    ans1=s1.addTwoNumbers(l11,l21);
    //ans1=l11;
    System.out.println(ans1.val);
    //System.out.println(ans1.next.val);
    while(ans1.next!=null){
      ans1=ans1.next;
      System.out.println(ans1.val);
    }
  }
}
