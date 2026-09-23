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

public class TypeCheck_visitBinaryOperator_20675338601654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558626;
     Object term558696;

    public TypeCheck_visitBinaryOperator_20675338601654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558626 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term558696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term558766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term558870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term558940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term558766, term558766.getClass(), "jsType", term558870);
        setField(term558696, term558696.getClass(), "first", term558766);
        setField(term558940, term558940.getClass(), "jsType", term559030);
        setField(term558696, term558696.getClass(), "last", term558940);
        setIntField(term558696, term558696.getClass(), "type", 38);
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
        args[2] = term558696;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term558626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


