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

public class TypeCheck_visitBinaryOperator_20675338601666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537912;
     Object term537982;

    public TypeCheck_visitBinaryOperator_20675338601666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537912 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term537982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term538210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term538052, term538052.getClass(), "jsType", term538140);
        setField(term537982, term537982.getClass(), "first", term538052);
        setField(term538210, term538210.getClass(), "jsType", term538320);
        setField(term537982, term537982.getClass(), "last", term538210);
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
        args[2] = term537982;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term537912, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


