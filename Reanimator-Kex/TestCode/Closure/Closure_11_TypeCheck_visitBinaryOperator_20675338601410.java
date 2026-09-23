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

public class TypeCheck_visitBinaryOperator_20675338601410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430292;
     Object term430362;

    public TypeCheck_visitBinaryOperator_20675338601410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430292 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term430362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term430612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term430432, term430432.getClass(), "jsType", term430542);
        setField(term430362, term430362.getClass(), "first", term430432);
        setField(term430612, term430612.getClass(), "jsType", term430710);
        setField(term430362, term430362.getClass(), "last", term430612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 39;
        args[1] = null;
        args[2] = term430362;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term430292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


