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

public class TypeCheck_visitBinaryOperator_20675338601440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441628;
     Object term441698;

    public TypeCheck_visitBinaryOperator_20675338601440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441628 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term441698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term441768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term441868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term441938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term441768, term441768.getClass(), "jsType", term441868);
        setField(term441698, term441698.getClass(), "first", term441768);
        setField(term441938, term441938.getClass(), "jsType", null);
        setField(term441698, term441698.getClass(), "last", term441938);
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
        args[2] = term441698;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term441628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


