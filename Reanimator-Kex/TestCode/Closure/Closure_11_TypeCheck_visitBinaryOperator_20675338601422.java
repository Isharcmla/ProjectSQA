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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_20675338601422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435250;
     Object term435320;

    public TypeCheck_visitBinaryOperator_20675338601422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term435320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term435548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term435390, term435390.getClass(), "jsType", term435478);
        setField(term435320, term435320.getClass(), "first", term435390);
        setField(term435548, term435548.getClass(), "jsType", term435654);
        setField(term435320, term435320.getClass(), "last", term435548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 22;
        args[1] = null;
        args[2] = term435320;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term435250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


