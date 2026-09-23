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

public class ArrayUtils_isSameLength_1946808970204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term316;
     Object term11769;
     Object term11770;

    public ArrayUtils_isSameLength_1946808970204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = (byte[]) newByteArray(3);
        setByteElement(term312, 0, (byte) -10);
        setByteElement(term312, 1, (byte) 79);
        setByteElement(term312, 2, (byte) -119);
        term316 = (byte[]) newByteArray(7);
        setByteElement(term316, 0, (byte) -66);
        setByteElement(term316, 1, (byte) 83);
        setByteElement(term316, 2, (byte) 74);
        setByteElement(term316, 3, (byte) -71);
        setByteElement(term316, 4, (byte) 49);
        setByteElement(term316, 5, (byte) -54);
        setByteElement(term316, 6, (byte) 67);
        term11769 = (byte[]) newByteArray(3);
        setByteElement(term11769, 0, (byte) -10);
        setByteElement(term11769, 1, (byte) 79);
        setByteElement(term11769, 2, (byte) -119);
        term11770 = (byte[]) newByteArray(7);
        setByteElement(term11770, 0, (byte) -66);
        setByteElement(term11770, 1, (byte) 83);
        setByteElement(term11770, 2, (byte) 74);
        setByteElement(term11770, 3, (byte) -71);
        setByteElement(term11770, 4, (byte) 49);
        setByteElement(term11770, 5, (byte) -54);
        setByteElement(term11770, 6, (byte) 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term312;
        args[1] = term316;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term312, term11769));
        assertTrue(recursiveEquals(term316, term11770));
        assertTrue(recursiveEquals(retValue, false));
    }

};


