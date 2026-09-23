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

public class TypeCheck_visitBinaryOperator_2067533860559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173775;
     Object term173845;

    public TypeCheck_visitBinaryOperator_2067533860559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173775 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term173775, term173775.getClass(), "noTypeCheckSection", -1);
        term173845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term174103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term173915, term173915.getClass(), "jsType", term174033);
        setField(term173845, term173845.getClass(), "first", term173915);
        setField(term174103, term174103.getClass(), "jsType", term174209);
        setField(term173845, term173845.getClass(), "last", term174103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 28;
        args[1] = null;
        args[2] = term173845;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term173775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


