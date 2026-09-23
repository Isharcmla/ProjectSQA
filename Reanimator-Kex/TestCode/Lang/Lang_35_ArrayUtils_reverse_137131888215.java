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

public class ArrayUtils_reverse_137131888215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431;
     Object term12273;

    public ArrayUtils_reverse_137131888215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431 = (byte[]) newByteArray(4);
        setByteElement(term431, 0, (byte) 78);
        setByteElement(term431, 1, (byte) 87);
        setByteElement(term431, 2, (byte) 121);
        setByteElement(term431, 3, (byte) -99);
        term12273 = (byte[]) newByteArray(4);
        setByteElement(term12273, 0, (byte) -99);
        setByteElement(term12273, 1, (byte) 121);
        setByteElement(term12273, 2, (byte) 87);
        setByteElement(term12273, 3, (byte) 78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term431;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term431, term12273));
    }

};


