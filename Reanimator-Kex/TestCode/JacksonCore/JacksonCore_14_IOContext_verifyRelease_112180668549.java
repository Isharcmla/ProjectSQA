package com.fasterxml.jackson.core.io;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IOContext_verifyRelease_112180668549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term68;

    public IOContext_verifyRelease_112180668549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = (byte[]) newByteArray(2);
        setByteElement(term65, 0, (byte) 83);
        setByteElement(term65, 1, (byte) 74);
        term68 = (byte[]) newByteArray(6);
        setByteElement(term68, 0, (byte) -71);
        setByteElement(term68, 1, (byte) 49);
        setByteElement(term68, 2, (byte) -54);
        setByteElement(term68, 3, (byte) 67);
        setByteElement(term68, 4, (byte) 78);
        setByteElement(term68, 5, (byte) 87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term65;
        args[1] = term68;
        try {
            callMethod(klass, "_verifyRelease", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


