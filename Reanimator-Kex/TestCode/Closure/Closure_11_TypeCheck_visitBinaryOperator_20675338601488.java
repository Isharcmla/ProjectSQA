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

public class TypeCheck_visitBinaryOperator_20675338601488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463004;
     Object term463074;

    public TypeCheck_visitBinaryOperator_20675338601488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463004 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term463074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term463314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term463144, term463144.getClass(), "jsType", term463244);
        setField(term463074, term463074.getClass(), "first", term463144);
        setField(term463314, term463314.getClass(), "jsType", term463402);
        setField(term463074, term463074.getClass(), "last", term463314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 69;
        args[1] = null;
        args[2] = term463074;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term463004, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


