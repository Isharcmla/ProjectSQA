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
import java.lang.Byte;

public class ArrayUtils_toPrimitive_1708512294281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1224;
     Object term14449;
     Object term14444;

    public ArrayUtils_toPrimitive_1708512294281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term1225 = new Byte((byte) 47);
        term1224 = (Object[]) newArray("java.lang.Byte", 1);
        setElement(term1224, 0, term1225);
        Byte term14450 = new Byte((byte) 47);
        term14449 = (Object[]) newArray("java.lang.Byte", 1);
        setElement(term14449, 0, term14450);
        term14444 = (byte[]) newByteArray(1);
        setByteElement(term14444, 0, (byte) 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Byte"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1224;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1224, term14449));
        assertTrue(recursiveEquals(retValue, term14444));
    }

};


