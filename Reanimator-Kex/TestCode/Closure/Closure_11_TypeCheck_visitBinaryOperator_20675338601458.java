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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_20675338601458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448979;
     Object term449049;

    public TypeCheck_visitBinaryOperator_20675338601458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448979 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term449049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term449295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term449119, term449119.getClass(), "jsType", term449225);
        setField(term449049, term449049.getClass(), "first", term449119);
        setField(term449295, term449295.getClass(), "jsType", term449383);
        setField(term449049, term449049.getClass(), "last", term449295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 55;
        args[1] = null;
        args[2] = term449049;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term448979, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


