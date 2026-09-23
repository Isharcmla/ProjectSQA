package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_20675338601556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516203;
     Object term516273;

    public TypeCheck_visitBinaryOperator_20675338601556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516203 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term516273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term516523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term516343, term516343.getClass(), "jsType", term516453);
        setField(term516273, term516273.getClass(), "first", term516343);
        setField(term516523, term516523.getClass(), "jsType", term516615);
        setField(term516273, term516273.getClass(), "last", term516523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 80;
        args[1] = null;
        args[2] = term516273;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term516203, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


