package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class SorterTest {

    @Test
    public void checkDefaultSorter() {
        Sorter kSorter = new DefaultSorter();
        double[] expected = new double[]{-2.2, 1.0, 5.0};
        double[] actual = kSorter.getSortedArray();
        Assert.assertArrayEquals(expected, actual, 0.0);
    }

    @Test
    public void checkKeyboardSorter() {
        Sorter kSorter = Mockito.spy(new KeyboardSorter());
        double[] expected = new double[]{-2.2, 1.0, 5.0};
        // Mockito.when(kSorter.init()).thenReturn(expected);
        Mockito.doReturn(new double[]{1.0, 5.0, -2.2}).when(kSorter).init();
        double[] actual = kSorter.getSortedArray();
        Assert.assertArrayEquals(expected, actual, 0.0);
    }
}
