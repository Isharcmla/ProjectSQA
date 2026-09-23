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

public class TypeCheck_visitBinaryOperator_20675338601360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412341;
     Object term412411;

    public TypeCheck_visitBinaryOperator_20675338601360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412341 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term412411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term412643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term412481, term412481.getClass(), "jsType", term412573);
        setField(term412411, term412411.getClass(), "first", term412481);
        setField(term412643, term412643.getClass(), "jsType", term412753);
        setField(term412411, term412411.getClass(), "last", term412643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 26;
        args[1] = null;
        args[2] = term412411;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term412341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


