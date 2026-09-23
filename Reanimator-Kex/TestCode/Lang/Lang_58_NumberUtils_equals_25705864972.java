package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_equals_25705864972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407;
     Object term413;
     Object term5582;
     Object term5583;

    public NumberUtils_equals_25705864972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407 = (byte[]) newByteArray(5);
        setByteElement(term407, 0, (byte) 47);
        setByteElement(term407, 1, (byte) 48);
        setByteElement(term407, 2, (byte) 89);
        setByteElement(term407, 3, (byte) 75);
        setByteElement(term407, 4, (byte) 18);
        term413 = (byte[]) newByteArray(4);
        setByteElement(term413, 0, (byte) -58);
        setByteElement(term413, 1, (byte) -29);
        setByteElement(term413, 2, (byte) -54);
        setByteElement(term413, 3, (byte) -10);
        term5582 = (byte[]) newByteArray(5);
        setByteElement(term5582, 0, (byte) 47);
        setByteElement(term5582, 1, (byte) 48);
        setByteElement(term5582, 2, (byte) 89);
        setByteElement(term5582, 3, (byte) 75);
        setByteElement(term5582, 4, (byte) 18);
        term5583 = (byte[]) newByteArray(4);
        setByteElement(term5583, 0, (byte) -58);
        setByteElement(term5583, 1, (byte) -29);
        setByteElement(term5583, 2, (byte) -54);
        setByteElement(term5583, 3, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term407;
        args[1] = term413;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term407, term5582));
        assertTrue(recursiveEquals(term413, term5583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


