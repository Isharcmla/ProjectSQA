package org.apache.commons.codec.binary;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class Base64InputStream_init_7993198808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term7;

    public Base64InputStream_init_7993198808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Boolean(false);
        term5 = new Integer(568599855);
        term7 = (byte[]) newByteArray(5);
        setByteElement(term7, 0, (byte) 47);
        setByteElement(term7, 1, (byte) 48);
        setByteElement(term7, 2, (byte) 89);
        setByteElement(term7, 3, (byte) 75);
        setByteElement(term7, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3;
        args[2] = term5;
        args[3] = term7;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


