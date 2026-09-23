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

public class TypeCheck_visitBinaryOperator_2067533860464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141179;
     Object term141249;

    public TypeCheck_visitBinaryOperator_2067533860464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141179 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term141249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term141497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term141319, term141319.getClass(), "jsType", term141427);
        setField(term141249, term141249.getClass(), "first", term141319);
        setField(term141497, term141497.getClass(), "jsType", term141611);
        setField(term141249, term141249.getClass(), "last", term141497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 88;
        args[1] = null;
        args[2] = term141249;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term141179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


