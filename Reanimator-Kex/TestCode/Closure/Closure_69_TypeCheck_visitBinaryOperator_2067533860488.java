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

public class TypeCheck_visitBinaryOperator_2067533860488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148096;
     Object term148166;

    public TypeCheck_visitBinaryOperator_2067533860488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148096 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term148166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term148414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term148236, term148236.getClass(), "jsType", term148344);
        setField(term148166, term148166.getClass(), "first", term148236);
        setField(term148414, term148414.getClass(), "jsType", term148510);
        setField(term148166, term148166.getClass(), "last", term148414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 13;
        args[1] = null;
        args[2] = term148166;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term148096, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


