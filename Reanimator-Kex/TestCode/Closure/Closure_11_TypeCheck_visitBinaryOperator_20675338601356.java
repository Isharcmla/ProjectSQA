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

public class TypeCheck_visitBinaryOperator_20675338601356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410831;
     Object term410901;

    public TypeCheck_visitBinaryOperator_20675338601356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410831 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term410901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term411147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term410971, term410971.getClass(), "jsType", term411077);
        setField(term410901, term410901.getClass(), "first", term410971);
        setField(term411147, term411147.getClass(), "jsType", term411261);
        setField(term410901, term410901.getClass(), "last", term411147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 45;
        args[1] = null;
        args[2] = term410901;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term410831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


