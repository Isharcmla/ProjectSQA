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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ObjectMapper_readTree_188059420194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public ObjectMapper_readTree_188059420194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197 = Class.forName((String) "java.io.File$PathStatus");
        Field term196 = ((Class) term197).getDeclaredField((String) "INVALID");
        ((Field) term196).setAccessible(true);
        Object enum0 = ((Field) term196).get((Object) null);
        term139 = newInstance(Class.forName("java.io.File"));
        setField(term139, term139.getClass(), "path", "MuLcgQHgqz");
        setField(term139, term139.getClass(), "status", enum0);
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
        callMethod(klass, "readTree", argTypes, null, args);
    }

};


