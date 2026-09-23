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

public class TypeCheck_visitBinaryOperator_20675338601592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531271;
     Object term531341;

    public TypeCheck_visitBinaryOperator_20675338601592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531271 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term531341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term531569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term531411, term531411.getClass(), "jsType", term531499);
        setField(term531341, term531341.getClass(), "first", term531411);
        setField(term531569, term531569.getClass(), "jsType", term531659);
        setField(term531341, term531341.getClass(), "last", term531569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 92;
        args[1] = null;
        args[2] = term531341;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term531271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


