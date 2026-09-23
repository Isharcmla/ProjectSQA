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

public class ArrowType_resolveInternal_128941235743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7535;

    public ArrowType_resolveInternal_128941235743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term7535, term7535.getClass(), "returnType", null);
        setField(term7675, term7675.getClass(), "jsType", term7769);
        setField(term7605, term7605.getClass(), "first", term7675);
        setField(term7535, term7535.getClass(), "parameters", term7605);
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
        callMethod(klass, "resolveInternal", argTypes, term7535, args);
    }

};


