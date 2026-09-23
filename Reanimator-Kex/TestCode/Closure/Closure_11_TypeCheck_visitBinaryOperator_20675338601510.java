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

public class TypeCheck_visitBinaryOperator_20675338601510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471337;
     Object term471407;

    public TypeCheck_visitBinaryOperator_20675338601510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471337 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term471407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term471635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term471477, term471477.getClass(), "jsType", term471565);
        setField(term471407, term471407.getClass(), "first", term471477);
        setField(term471635, term471635.getClass(), "jsType", term471733);
        setField(term471407, term471407.getClass(), "last", term471635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 50;
        args[1] = null;
        args[2] = term471407;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term471337, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


