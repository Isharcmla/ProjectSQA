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

public class TypeCheck_visitBinaryOperator_20675338601638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553140;
     Object term553210;

    public TypeCheck_visitBinaryOperator_20675338601638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553140 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term553210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term553444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term553280, term553280.getClass(), "jsType", term553374);
        setField(term553210, term553210.getClass(), "first", term553280);
        setField(term553444, term553444.getClass(), "jsType", term553568);
        setField(term553210, term553210.getClass(), "last", term553444);
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
        args[2] = term553210;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term553140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


