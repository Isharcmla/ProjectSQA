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

public class TypedScopeCreator_createScope_26573221561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31667;
     Object term31737;
     Object term31951;

    public TypedScopeCreator_createScope_26573221561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31667 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term31667, term31667.getClass(), "compiler", null);
        term31737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31737, term31737.getClass(), "jsType", null);
        setIntField(term31737, term31737.getClass(), "type", 0);
        setField(term31737, term31737.getClass(), "parent", null);
        setField(term31807, term31807.getClass(), "next", null);
        setIntField(term31807, term31807.getClass(), "type", 0);
        setField(term31877, term31877.getClass(), "next", null);
        setIntField(term31877, term31877.getClass(), "type", 41);
        setField(term31877, term31877.getClass(), "first", null);
        setField(term31807, term31807.getClass(), "first", term31877);
        setField(term31737, term31737.getClass(), "first", term31807);
        term31951 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term31951, term31951.getClass(), "rootNode", null);
        setField(term31951, term31951.getClass(), "thisType", null);
        setIntField(term31951, term31951.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term31737;
        args[1] = term31951;
        try {
            callMethod(klass, "createScope", argTypes, term31667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


