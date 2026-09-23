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

public class TypeCheck_visitBinaryOperator_20675338601692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576381;
     Object term576451;

    public TypeCheck_visitBinaryOperator_20675338601692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576381 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term576451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term576521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term576625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term576695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term576785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term576521, term576521.getClass(), "jsType", term576625);
        setField(term576451, term576451.getClass(), "first", term576521);
        setField(term576695, term576695.getClass(), "jsType", term576785);
        setField(term576451, term576451.getClass(), "last", term576695);
        setIntField(term576451, term576451.getClass(), "type", 77);
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
        args[2] = term576451;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term576381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


