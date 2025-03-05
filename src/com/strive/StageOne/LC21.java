package com.strive.StageOne;

public class LC21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode s = new ListNode(-1,null); //创建新链表
        ListNode p = s; //p指针记录新链表的头结点
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next  = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 != null){   //List1
            p.next = list1;
        }
        if(list2 != null){   //List2
            p.next = list2;
        }
        return s.next;
    }

    public static void main(String[] args) {
    }
}
