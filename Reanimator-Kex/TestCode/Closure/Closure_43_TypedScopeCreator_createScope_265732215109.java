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

public class TypedScopeCreator_createScope_265732215109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76118;
     Object term76188;
     Object term76402;

    public TypedScopeCreator_createScope_265732215109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76118 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term76118, term76118.getClass(), "compiler", null);
        term76188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76188, term76188.getClass(), "jsType", null);
        setIntField(term76188, term76188.getClass(), "type", 0);
        setField(term76188, term76188.getClass(), "parent", null);
        setField(term76258, term76258.getClass(), "next", null);
        setIntField(term76258, term76258.getClass(), "type", 0);
        setField(term76328, term76328.getClass(), "next", null);
        setIntField(term76328, term76328.getClass(), "type", 39);
        setField(term76328, term76328.getClass(), "first", null);
        setField(term76258, term76258.getClass(), "first", term76328);
        setField(term76188, term76188.getClass(), "first", term76258);
        term76402 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term76402, term76402.getClass(), "rootNode", null);
        setField(term76402, term76402.getClass(), "thisType", null);
        setIntField(term76402, term76402.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term76188;
        args[1] = term76402;
        try {
            callMethod(klass, "createScope", argTypes, term76118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


