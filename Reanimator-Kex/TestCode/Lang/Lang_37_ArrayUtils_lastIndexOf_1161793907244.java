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
import java.lang.Byte;

public class ArrayUtils_lastIndexOf_1161793907244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;
     Object term805;
     Object term13232;

    public ArrayUtils_lastIndexOf_1161793907244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = (byte[]) newByteArray(6);
        setByteElement(term798, 0, (byte) -111);
        setByteElement(term798, 1, (byte) 23);
        setByteElement(term798, 2, (byte) -15);
        setByteElement(term798, 3, (byte) 36);
        setByteElement(term798, 4, (byte) 118);
        setByteElement(term798, 5, (byte) 106);
        term805 = new Byte((byte) 98);
        term13232 = (byte[]) newByteArray(6);
        setByteElement(term13232, 0, (byte) -111);
        setByteElement(term13232, 1, (byte) 23);
        setByteElement(term13232, 2, (byte) -15);
        setByteElement(term13232, 3, (byte) 36);
        setByteElement(term13232, 4, (byte) 118);
        setByteElement(term13232, 5, (byte) 106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term798;
        args[1] = term805;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term798, term13232));
        assertTrue(recursiveEquals(term805, (byte) 98));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


