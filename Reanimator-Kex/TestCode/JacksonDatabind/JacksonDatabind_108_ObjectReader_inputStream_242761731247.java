package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ObjectReader_inputStream_242761731247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;

    public ObjectReader_inputStream_242761731247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32251 = Class.forName((String) "java.io.File$PathStatus");
        Field term32250 = ((Class) term32251).getDeclaredField((String) "INVALID");
        ((Field) term32250).setAccessible(true);
        Object enum5 = ((Field) term32250).get((Object) null);
        term888 = newInstance(Class.forName("java.io.File"));
        setField(term888, term888.getClass(), "path", "MjGYSRKTNF");
        setField(term888, term888.getClass(), "status", enum5);
        setIntField(term888, term888.getClass(), "prefixLength", 1725571209);
        setField(term888, term888.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term888;
        try {
            callMethod(klass, "_inputStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


