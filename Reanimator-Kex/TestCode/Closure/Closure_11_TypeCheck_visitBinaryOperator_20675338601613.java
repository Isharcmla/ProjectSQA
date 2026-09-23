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

public class TypeCheck_visitBinaryOperator_20675338601613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512502;
     Object term512662;

    public TypeCheck_visitBinaryOperator_20675338601613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512502 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term512592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term512502, term512502.getClass(), "validator", term512592);
        term512662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term512900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term513010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term512732, term512732.getClass(), "jsType", term512830);
        setField(term512662, term512662.getClass(), "first", term512732);
        setField(term512900, term512900.getClass(), "jsType", term513010);
        setField(term512662, term512662.getClass(), "last", term512900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 22;
        args[1] = null;
        args[2] = term512662;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term512502, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


