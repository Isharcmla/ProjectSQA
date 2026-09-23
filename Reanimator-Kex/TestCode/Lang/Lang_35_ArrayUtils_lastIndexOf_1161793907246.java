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

public class ArrayUtils_lastIndexOf_1161793907246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term816;
     Object term13278;

    public ArrayUtils_lastIndexOf_1161793907246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = (byte[]) newByteArray(6);
        setByteElement(term809, 0, (byte) -111);
        setByteElement(term809, 1, (byte) 23);
        setByteElement(term809, 2, (byte) -15);
        setByteElement(term809, 3, (byte) 36);
        setByteElement(term809, 4, (byte) 118);
        setByteElement(term809, 5, (byte) 106);
        term816 = new Byte((byte) 98);
        term13278 = (byte[]) newByteArray(6);
        setByteElement(term13278, 0, (byte) -111);
        setByteElement(term13278, 1, (byte) 23);
        setByteElement(term13278, 2, (byte) -15);
        setByteElement(term13278, 3, (byte) 36);
        setByteElement(term13278, 4, (byte) 118);
        setByteElement(term13278, 5, (byte) 106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term809;
        args[1] = term816;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term809, term13278));
        assertTrue(recursiveEquals(term816, (byte) 98));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


