package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_resolveInternal_128941235745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7923;

    public ArrowType_resolveInternal_128941235745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term7923, term7923.getClass(), "returnType", null);
        setField(term8063, term8063.getClass(), "jsType", term8157);
        setField(term7993, term7993.getClass(), "first", term8063);
        setField(term7923, term7923.getClass(), "parameters", term7993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term7923, args);
    }

};


