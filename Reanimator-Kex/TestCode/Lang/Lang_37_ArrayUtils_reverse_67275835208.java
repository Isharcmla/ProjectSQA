package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class ArrayUtils_reverse_67275835208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term12145;

    public ArrayUtils_reverse_67275835208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = (Object[]) newArray("java.lang.Object", 5);
        Object term381 = newInstance(Class.forName("java.lang.Object"));
        Object term382 = newInstance(Class.forName("java.lang.Object"));
        Object term383 = newInstance(Class.forName("java.lang.Object"));
        Object term384 = newInstance(Class.forName("java.lang.Object"));
        Object term385 = newInstance(Class.forName("java.lang.Object"));
        setElement(term380, 0, term381);
        setElement(term380, 1, term382);
        setElement(term380, 2, term383);
        setElement(term380, 3, term384);
        setElement(term380, 4, term385);
        term12145 = (Object[]) newArray("java.lang.Object", 5);
        Object term12146 = newInstance(Class.forName("java.lang.Object"));
        Object term12147 = newInstance(Class.forName("java.lang.Object"));
        Object term12148 = newInstance(Class.forName("java.lang.Object"));
        Object term12149 = newInstance(Class.forName("java.lang.Object"));
        Object term12150 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12145, 0, term12146);
        setElement(term12145, 1, term12147);
        setElement(term12145, 2, term12148);
        setElement(term12145, 3, term12149);
        setElement(term12145, 4, term12150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term380;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term380, term12145));
    }

};


