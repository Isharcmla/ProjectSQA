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

public class TypeCheck_visitBinaryOperator_2067533860389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115673;
     Object term115743;

    public TypeCheck_visitBinaryOperator_2067533860389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115673 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term115743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term116001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term115813, term115813.getClass(), "jsType", term115931);
        setField(term115743, term115743.getClass(), "first", term115813);
        setField(term116001, term116001.getClass(), "jsType", term116099);
        setField(term115743, term115743.getClass(), "last", term116001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 82;
        args[1] = null;
        args[2] = term115743;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term115673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


