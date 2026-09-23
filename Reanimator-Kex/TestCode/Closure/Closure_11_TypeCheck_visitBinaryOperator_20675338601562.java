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

public class TypeCheck_visitBinaryOperator_20675338601562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494041;
     Object term494111;

    public TypeCheck_visitBinaryOperator_20675338601562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494041 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term494111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term494357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term494181, term494181.getClass(), "jsType", term494287);
        setField(term494111, term494111.getClass(), "first", term494181);
        setField(term494357, term494357.getClass(), "jsType", term494445);
        setField(term494111, term494111.getClass(), "last", term494357);
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
        args[2] = term494111;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term494041, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


