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

public class TypeCheck_visitBinaryOperator_20675338601478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458592;
     Object term458662;

    public TypeCheck_visitBinaryOperator_20675338601478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term458662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term458892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term458732, term458732.getClass(), "jsType", term458822);
        setField(term458662, term458662.getClass(), "first", term458732);
        setField(term458892, term458892.getClass(), "jsType", term459002);
        setField(term458662, term458662.getClass(), "last", term458892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 16;
        args[1] = null;
        args[2] = term458662;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term458592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


