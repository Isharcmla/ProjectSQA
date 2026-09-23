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

public class TypeCheck_visitBinaryOperator_20675338601370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415157;
     Object term415227;

    public TypeCheck_visitBinaryOperator_20675338601370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term415227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term415459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term415297, term415297.getClass(), "jsType", term415389);
        setField(term415227, term415227.getClass(), "first", term415297);
        setField(term415459, term415459.getClass(), "jsType", term415565);
        setField(term415227, term415227.getClass(), "last", term415459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 13;
        args[1] = null;
        args[2] = term415227;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term415157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


