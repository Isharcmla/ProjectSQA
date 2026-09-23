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

public class ArrayUtils_toObject_257822544283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1240;
     Object term14511;
     Object term14500;

    public ArrayUtils_toObject_257822544283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1240 = (byte[]) newByteArray(3);
        setByteElement(term1240, 0, (byte) 99);
        setByteElement(term1240, 1, (byte) -12);
        setByteElement(term1240, 2, (byte) -61);
        term14511 = (byte[]) newByteArray(3);
        setByteElement(term14511, 0, (byte) 99);
        setByteElement(term14511, 1, (byte) -12);
        setByteElement(term14511, 2, (byte) -61);
        Byte term14501 = new Byte((byte) 99);
        Byte term14503 = new Byte((byte) -12);
        Byte term14505 = new Byte((byte) -61);
        term14500 = (Object[]) newArray("java.lang.Byte", 3);
        setElement(term14500, 0, term14501);
        setElement(term14500, 1, term14503);
        setElement(term14500, 2, term14505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1240;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1240, term14511));
        assertTrue(recursiveEquals(retValue, term14500));
    }

};


