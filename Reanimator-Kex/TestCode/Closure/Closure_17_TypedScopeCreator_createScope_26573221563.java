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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37782;
     Object term37932;
     Object term38356;

    public TypedScopeCreator_createScope_26573221563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37782 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term37862 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37782, term37782.getClass(), "compiler", term37862);
        term37932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37932, term37932.getClass(), "jsType", null);
        setIntField(term37932, term37932.getClass(), "type", 0);
        setField(term37932, term37932.getClass(), "parent", null);
        setField(term38142, term38142.getClass(), "next", term38212);
        setIntField(term38142, term38142.getClass(), "type", 44);
        setField(term38142, term38142.getClass(), "first", null);
        setField(term38072, term38072.getClass(), "next", term38142);
        setIntField(term38072, term38072.getClass(), "type", 0);
        setField(term38072, term38072.getClass(), "first", null);
        setField(term38072, term38072.getClass(), "parent", null);
        setField(term38002, term38002.getClass(), "next", term38072);
        setIntField(term38002, term38002.getClass(), "type", 0);
        setField(term38282, term38282.getClass(), "next", null);
        setIntField(term38282, term38282.getClass(), "type", 0);
        setField(term38282, term38282.getClass(), "first", null);
        setField(term38282, term38282.getClass(), "parent", null);
        setField(term38002, term38002.getClass(), "first", term38282);
        setField(term38002, term38002.getClass(), "parent", null);
        setField(term37932, term37932.getClass(), "first", term38002);
        term38356 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term38426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38356, term38356.getClass(), "rootNode", term38426);
        setField(term38356, term38356.getClass(), "thisType", null);
        setIntField(term38356, term38356.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term37932;
        args[1] = term38356;
        try {
            callMethod(klass, "createScope", argTypes, term37782, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


