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

public class TypeCheck_visitBinaryOperator_20675338601652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557449;
     Object term557519;

    public TypeCheck_visitBinaryOperator_20675338601652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557449 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term557519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term557755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term557589, term557589.getClass(), "jsType", term557685);
        setField(term557519, term557519.getClass(), "first", term557589);
        setField(term557755, term557755.getClass(), "jsType", term557843);
        setField(term557519, term557519.getClass(), "last", term557755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 60;
        args[1] = null;
        args[2] = term557519;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term557449, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


