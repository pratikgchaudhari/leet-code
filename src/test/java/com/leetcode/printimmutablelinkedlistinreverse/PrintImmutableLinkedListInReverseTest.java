package com.leetcode.printimmutablelinkedlistinreverse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintImmutableLinkedListInReverseTest {
    private ByteArrayOutputStream mockedOutputStream = new ByteArrayOutputStream();
    private PrintStream originalOutputStream = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(mockedOutputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOutputStream);
    }

    @Test
    void shouldPrintTheContentsOfAGivenImmutableLinkedListInReverse() {
        var node4 = new ImmutableListNode(4, null);
        var node3 = new ImmutableListNode(3, node4);
        var node2 = new ImmutableListNode(2, node3);
        var head = new ImmutableListNode(1, node2);

        var printImmutableLinkedListInReverse = new PrintImmutableLinkedListInReverse();
        printImmutableLinkedListInReverse.printLinkedListInReverse(head);

        assertEquals("4321", mockedOutputStream.toString());

    }


}