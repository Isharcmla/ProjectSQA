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

public class TypeCheck_visitBinaryOperator_20675338601690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547218;
     Object term547288;

    public TypeCheck_visitBinaryOperator_20675338601690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term547288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term547526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term547358, term547358.getClass(), "jsType", term547456);
        setField(term547288, term547288.getClass(), "first", term547358);
        setField(term547526, term547526.getClass(), "jsType", term547638);
        setField(term547288, term547288.getClass(), "last", term547526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 95;
        args[1] = null;
        args[2] = term547288;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term547218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


