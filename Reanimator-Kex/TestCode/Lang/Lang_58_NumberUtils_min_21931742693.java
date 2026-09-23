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
import java.lang.Byte;

public class NumberUtils_min_21931742693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;
     Object term635;
     Object term637;

    public NumberUtils_min_21931742693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = new Byte((byte) -66);
        term635 = new Byte((byte) 83);
        term637 = new Byte((byte) 74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term633;
        args[1] = term635;
        args[2] = term637;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term633, (byte) -66));
        assertTrue(recursiveEquals(term635, (byte) 83));
        assertTrue(recursiveEquals(term637, (byte) 74));
        assertTrue(recursiveEquals(retValue, (byte) -66));
    }

};


