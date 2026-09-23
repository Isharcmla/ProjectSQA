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

public class ObjectMapper_readTree_1880594201318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public ObjectMapper_readTree_1880594201318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67170 = Class.forName((String) "java.io.File$PathStatus");
        Field term67169 = ((Class) term67170).getDeclaredField((String) "INVALID");
        ((Field) term67169).setAccessible(true);
        Object enum5 = ((Field) term67169).get((Object) null);
        term139 = newInstance(Class.forName("java.io.File"));
        setField(term139, term139.getClass(), "path", "MuLcgQHgqz");
        setField(term139, term139.getClass(), "status", enum5);
        setIntField(term139, term139.getClass(), "prefixLength", 568599855);
        setField(term139, term139.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term139;
        try {
            callMethod(klass, "readTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


