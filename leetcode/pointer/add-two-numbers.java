/*
2. 两数相加
题目地址：https://leetcode.cn/problems/add-two-numbers/solution/po-su-jie-fa-shao-bing-ji-qiao-by-ac_oie-etln/
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        int t = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            t = a + b + t;
            tmp.next = new ListNode(t % 10);
            t /= 10;
            tmp = tmp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (t > 0) tmp.next = new ListNode(t);
        return dummy.next;
    }
}