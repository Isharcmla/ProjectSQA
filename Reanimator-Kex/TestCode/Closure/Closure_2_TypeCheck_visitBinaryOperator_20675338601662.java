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

public class TypeCheck_visitBinaryOperator_20675338601662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564361;
     Object term564431;

    public TypeCheck_visitBinaryOperator_20675338601662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564361 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term564431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term564675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term564501, term564501.getClass(), "jsType", term564605);
        setField(term564431, term564431.getClass(), "first", term564501);
        setField(term564675, term564675.getClass(), "jsType", term564765);
        setField(term564431, term564431.getClass(), "last", term564675);
        setIntField(term564431, term564431.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 92;
        args[1] = null;
        args[2] = term564431;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term564361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


