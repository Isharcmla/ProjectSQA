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

public class TypeCheck_visitBinaryOperator_20675338601606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536143;
     Object term536213;

    public TypeCheck_visitBinaryOperator_20675338601606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536143 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term536213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term536453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term536283, term536283.getClass(), "jsType", term536383);
        setField(term536213, term536213.getClass(), "first", term536283);
        setField(term536453, term536453.getClass(), "jsType", term536549);
        setField(term536213, term536213.getClass(), "last", term536453);
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
        args[2] = term536213;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term536143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


