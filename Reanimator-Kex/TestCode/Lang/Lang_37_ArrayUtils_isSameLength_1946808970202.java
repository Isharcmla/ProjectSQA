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

public class ArrayUtils_isSameLength_1946808970202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;
     Object term305;
     Object term11723;
     Object term11724;

    public ArrayUtils_isSameLength_1946808970202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301 = (byte[]) newByteArray(3);
        setByteElement(term301, 0, (byte) -10);
        setByteElement(term301, 1, (byte) 79);
        setByteElement(term301, 2, (byte) -119);
        term305 = (byte[]) newByteArray(7);
        setByteElement(term305, 0, (byte) -66);
        setByteElement(term305, 1, (byte) 83);
        setByteElement(term305, 2, (byte) 74);
        setByteElement(term305, 3, (byte) -71);
        setByteElement(term305, 4, (byte) 49);
        setByteElement(term305, 5, (byte) -54);
        setByteElement(term305, 6, (byte) 67);
        term11723 = (byte[]) newByteArray(3);
        setByteElement(term11723, 0, (byte) -10);
        setByteElement(term11723, 1, (byte) 79);
        setByteElement(term11723, 2, (byte) -119);
        term11724 = (byte[]) newByteArray(7);
        setByteElement(term11724, 0, (byte) -66);
        setByteElement(term11724, 1, (byte) 83);
        setByteElement(term11724, 2, (byte) 74);
        setByteElement(term11724, 3, (byte) -71);
        setByteElement(term11724, 4, (byte) 49);
        setByteElement(term11724, 5, (byte) -54);
        setByteElement(term11724, 6, (byte) 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term301;
        args[1] = term305;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term301, term11723));
        assertTrue(recursiveEquals(term305, term11724));
        assertTrue(recursiveEquals(retValue, false));
    }

};


