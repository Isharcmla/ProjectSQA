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

public class TypeCheck_visitBinaryOperator_20675338601364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418457;
     Object term418527;

    public TypeCheck_visitBinaryOperator_20675338601364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418457 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term418527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term418625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term418527, term418527.getClass(), "first", term418527);
        setField(term418527, term418527.getClass(), "jsType", term418625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = term418527;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term418457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


