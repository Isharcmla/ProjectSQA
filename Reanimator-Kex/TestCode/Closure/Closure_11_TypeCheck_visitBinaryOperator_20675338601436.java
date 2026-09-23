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

public class TypeCheck_visitBinaryOperator_20675338601436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440139;
     Object term440209;

    public TypeCheck_visitBinaryOperator_20675338601436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440139 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term440209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term440441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term440279, term440279.getClass(), "jsType", term440371);
        setField(term440209, term440209.getClass(), "first", term440279);
        setField(term440441, term440441.getClass(), "jsType", term440539);
        setField(term440209, term440209.getClass(), "last", term440441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 79;
        args[1] = null;
        args[2] = term440209;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term440139, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


