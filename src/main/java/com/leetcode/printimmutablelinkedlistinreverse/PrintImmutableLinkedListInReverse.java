package com.leetcode.printimmutablelinkedlistinreverse;

public class PrintImmutableLinkedListInReverse {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head.getNext() != null)
            printLinkedListInReverse(head.getNext());
        head.printVal();
    }
}
