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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ArrayUtils_subarray_376933467188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term117;
     Object term119;

    public ArrayUtils_subarray_376933467188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = (Object[]) newArray("java.lang.Object", 5);
        Object term112 = newInstance(Class.forName("java.lang.Object"));
        Object term113 = newInstance(Class.forName("java.lang.Object"));
        Object term114 = newInstance(Class.forName("java.lang.Object"));
        Object term115 = newInstance(Class.forName("java.lang.Object"));
        Object term116 = newInstance(Class.forName("java.lang.Object"));
        setElement(term111, 0, term112);
        setElement(term111, 1, term113);
        setElement(term111, 2, term114);
        setElement(term111, 3, term115);
        setElement(term111, 4, term116);
        term117 = new Integer(391863371);
        term119 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term111;
        args[1] = term117;
        args[2] = term119;
        try {
            callMethod(klass, "subarray", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


