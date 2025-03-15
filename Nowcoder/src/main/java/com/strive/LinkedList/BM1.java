package com.strive.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//反转链表
public class BM1 {
    public ListNode ReverseList (ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list);

    }
}
