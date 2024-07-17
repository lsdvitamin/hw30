package org.otus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Sergei on 16.07.2024 17:39.
 * @project hw30
 */
class MainTest {
    private Main array;

    @BeforeEach
    public void init() {
        array = new Main();
    }


    @Test
    public void testSearchFirstOne() {
        String out = Arrays.toString(new int[]{2, 2});
        String res = Arrays.toString(array.searchFirstOne(new int[]{1, 2, 1, 2, 2}));
        Assertions.assertEquals(out, res);
    }

    @Test
    public void testSearchOnCorrectRuntimeException() {
        int[] out = {2, 2, 2, 2, 2};
        try {
            array.searchFirstOne(out);
            fail("Тест должен не пройти, если мы раньше не получили ошибку");
        } catch (Exception e) {
            Assertions.assertEquals("Единиц не найдено", e.getMessage());
        }
    }


    @Test
    public void testSearchOneAndTwo() {
        Boolean res = array.searchOneAndTwo(new int[]{1, 2});
        Assertions.assertEquals(true, res);
    }

    @Test
    public void testSearchOneAndTwo1() {
        Boolean res = array.searchOneAndTwo(new int[]{1, 1});
        Assertions.assertEquals(false, res);
    }

    @Test
    public void testSearchOneAndTwo2() {
        Boolean res = array.searchOneAndTwo(new int[]{1, 3});
        Assertions.assertEquals(false, res);
    }

    @Test
    public void testSearchOneAndTwo3() {
        Boolean res = array.searchOneAndTwo(new int[]{1, 2, 2, 1});
        Assertions.assertEquals(true, res);
    }


}