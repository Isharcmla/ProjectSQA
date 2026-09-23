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

public class TypeCheck_visitBinaryOperator_2067533860356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102824;
     Object term102894;

    public TypeCheck_visitBinaryOperator_2067533860356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102824 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term102894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term103140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term102964, term102964.getClass(), "jsType", term103070);
        setField(term102894, term102894.getClass(), "first", term102964);
        setField(term103140, term103140.getClass(), "jsType", term103250);
        setField(term102894, term102894.getClass(), "last", term103140);
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
        args[2] = term102894;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term102824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


