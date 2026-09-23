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

public class TypeCheck_visitBinaryOperator_20675338601492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466078;
     Object term466148;

    public TypeCheck_visitBinaryOperator_20675338601492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466078 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term466148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term466386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term466218, term466218.getClass(), "jsType", term466316);
        setField(term466148, term466148.getClass(), "first", term466218);
        setField(term466386, term466386.getClass(), "jsType", term466478);
        setField(term466148, term466148.getClass(), "last", term466386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 53;
        args[1] = null;
        args[2] = term466148;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term466078, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


