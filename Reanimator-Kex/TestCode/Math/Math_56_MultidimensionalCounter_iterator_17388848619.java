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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultidimensionalCounter_iterator_17388848619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public MultidimensionalCounter_iterator_17388848619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term14 = (int[]) newIntArray(4);
        int[] term19 = (int[]) newIntArray(3);
        setIntField(term12, term12.getClass(), "dimension", -616727354);
        setIntElement(term14, 0, -1955890973);
        setIntElement(term14, 1, -2038273078);
        setIntElement(term14, 2, 1227103734);
        setIntElement(term14, 3, -1339778481);
        setField(term12, term12.getClass(), "uniCounterOffset", term14);
        setIntElement(term19, 0, 1725571209);
        setIntElement(term19, 1, -522618178);
        setIntElement(term19, 2, 1134449235);
        setField(term12, term12.getClass(), "size", term19);
        setIntField(term12, term12.getClass(), "totalSize", -883034806);
        setIntField(term12, term12.getClass(), "last", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term12, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


