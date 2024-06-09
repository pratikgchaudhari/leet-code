package com.leetcode.armstrongnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {

    @Test
    void shouldReturnTrueIfAGivenNumberIsAnArmstrongNumber() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        assertTrue(armstrongNumber.isArmstrong(153));
    }

    @Test
    void shouldReturnFalseIfAGivenNumberIsNotAnArmstrongNumber() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        assertFalse(armstrongNumber.isArmstrong(154));
    }

}