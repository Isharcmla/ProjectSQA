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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayUtils_remove_1043952204335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1835;
     Object term1843;

    public ArrayUtils_remove_1043952204335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1835 = (byte[]) newByteArray(7);
        setByteElement(term1835, 0, (byte) 116);
        setByteElement(term1835, 1, (byte) -81);
        setByteElement(term1835, 2, (byte) 102);
        setByteElement(term1835, 3, (byte) -118);
        setByteElement(term1835, 4, (byte) -126);
        setByteElement(term1835, 5, (byte) -91);
        setByteElement(term1835, 6, (byte) -104);
        term1843 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1835;
        args[1] = term1843;
        try {
            callMethod(klass, "remove", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


