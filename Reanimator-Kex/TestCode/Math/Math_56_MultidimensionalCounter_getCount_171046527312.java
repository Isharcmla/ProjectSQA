package org.apache.commons.math.util;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultidimensionalCounter_getCount_171046527312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term91;

    public MultidimensionalCounter_getCount_171046527312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term74 = (int[]) newIntArray(6);
        int[] term81 = (int[]) newIntArray(7);
        setIntField(term72, term72.getClass(), "dimension", -1087774327);
        setIntElement(term74, 0, -1530420153);
        setIntElement(term74, 1, -469968304);
        setIntElement(term74, 2, -1145578966);
        setIntElement(term74, 3, 679763016);
        setIntElement(term74, 4, 1962444399);
        setIntElement(term74, 5, 767834723);
        setField(term72, term72.getClass(), "uniCounterOffset", term74);
        setIntElement(term81, 0, -602026508);
        setIntElement(term81, 1, -157887805);
        setIntElement(term81, 2, 1876565163);
        setIntElement(term81, 3, -817164822);
        setIntElement(term81, 4, -1016503459);
        setIntElement(term81, 5, -1968847291);
        setIntElement(term81, 6, 579005622);
        setField(term72, term72.getClass(), "size", term81);
        setIntField(term72, term72.getClass(), "totalSize", -14890619);
        setIntField(term72, term72.getClass(), "last", 1632125673);
        term91 = (int[]) newIntArray(1);
        setIntElement(term91, 0, 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91;
        try {
            callMethod(klass, "getCount", argTypes, term72, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


