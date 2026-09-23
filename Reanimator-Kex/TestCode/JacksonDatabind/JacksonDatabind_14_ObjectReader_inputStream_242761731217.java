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

public class ObjectReader_inputStream_242761731217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public ObjectReader_inputStream_242761731217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28917 = Class.forName((String) "java.io.File$PathStatus");
        Field term28916 = ((Class) term28917).getDeclaredField((String) "INVALID");
        ((Field) term28916).setAccessible(true);
        Object enum5 = ((Field) term28916).get((Object) null);
        term868 = newInstance(Class.forName("java.io.File"));
        setField(term868, term868.getClass(), "path", "SzjVpOQTyS");
        setField(term868, term868.getClass(), "status", enum5);
        setIntField(term868, term868.getClass(), "prefixLength", 1227103734);
        setField(term868, term868.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term868;
        try {
            callMethod(klass, "_inputStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


