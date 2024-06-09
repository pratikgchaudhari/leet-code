package com.leetcode.printimmutablelinkedlistinreverse;

public class ImmutableListNode {
    private final int val;
    private final ImmutableListNode next;

    public ImmutableListNode(int val, ImmutableListNode next) {
        this.val = val;
        this.next = next;
    }

    public ImmutableListNode getNext() {
        return next;
    }

    public void printVal() {
        System.out.print(val);
    }
}
