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

public class ObjectMapper_writeValue_1811300211129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6612;
     Object term6637;

    public ObjectMapper_writeValue_1811300211129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6649 = Class.forName((String) "java.io.File$PathStatus");
        Field term6648 = ((Class) term6649).getDeclaredField((String) "CHECKED");
        ((Field) term6648).setAccessible(true);
        Object enum4 = ((Field) term6648).get((Object) null);
        term6612 = newInstance(Class.forName("java.io.File"));
        setField(term6612, term6612.getClass(), "path", "uuaPigETmJ");
        setField(term6612, term6612.getClass(), "status", enum4);
        setIntField(term6612, term6612.getClass(), "prefixLength", 1725571209);
        setField(term6612, term6612.getClass(), "filePath", null);
        term6637 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term6612;
        args[1] = term6637;
        callMethod(klass, "writeValue", argTypes, null, args);
    }

};


