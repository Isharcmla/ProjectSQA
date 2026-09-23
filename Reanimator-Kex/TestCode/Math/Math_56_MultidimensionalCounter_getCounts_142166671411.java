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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MultidimensionalCounter_getCounts_142166671411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term62;

    public MultidimensionalCounter_getCounts_142166671411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term50 = (int[]) newIntArray(6);
        int[] term57 = (int[]) newIntArray(2);
        setIntField(term48, term48.getClass(), "dimension", -117576464);
        setIntElement(term50, 0, -1007160944);
        setIntElement(term50, 1, 1135664017);
        setIntElement(term50, 2, 590364439);
        setIntElement(term50, 3, 865208305);
        setIntElement(term50, 4, -1275173084);
        setIntElement(term50, 5, -244121226);
        setField(term48, term48.getClass(), "uniCounterOffset", term50);
        setIntElement(term57, 0, -203030934);
        setIntElement(term57, 1, -1179120542);
        setField(term48, term48.getClass(), "size", term57);
        setIntField(term48, term48.getClass(), "totalSize", -73683645);
        setIntField(term48, term48.getClass(), "last", -226514366);
        term62 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62;
        try {
            callMethod(klass, "getCounts", argTypes, term48, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


