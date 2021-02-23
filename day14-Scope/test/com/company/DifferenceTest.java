package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DifferenceTest {

    @Test
    public void computeDifferenceTest() {
        int[] a = {1, 2, 5, 100};
        Difference difference = new Difference(a);
        Assert.assertEquals(99, difference.computeDifference());
    }
}