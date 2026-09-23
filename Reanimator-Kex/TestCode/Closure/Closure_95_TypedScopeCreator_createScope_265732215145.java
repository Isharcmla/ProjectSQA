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

public class TypedScopeCreator_createScope_265732215145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101652;
     Object term101722;
     Object term102006;

    public TypedScopeCreator_createScope_265732215145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101652 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term101652, term101652.getClass(), "compiler", null);
        term101722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101722, term101722.getClass(), "jsType", null);
        setIntField(term101722, term101722.getClass(), "type", 0);
        setField(term101862, term101862.getClass(), "next", term101722);
        setIntField(term101862, term101862.getClass(), "type", 39);
        setField(term101862, term101862.getClass(), "first", null);
        setField(term101792, term101792.getClass(), "next", term101862);
        setIntField(term101792, term101792.getClass(), "type", 0);
        setField(term101932, term101932.getClass(), "next", null);
        setIntField(term101932, term101932.getClass(), "type", 0);
        setField(term101932, term101932.getClass(), "first", null);
        setField(term101792, term101792.getClass(), "first", term101932);
        setField(term101722, term101722.getClass(), "first", term101792);
        term102006 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term102076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term102006, term102006.getClass(), "rootNode", term102076);
        setField(term102006, term102006.getClass(), "thisType", term102176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term101722;
        args[1] = term102006;
        try {
            callMethod(klass, "createScope", argTypes, term101652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


