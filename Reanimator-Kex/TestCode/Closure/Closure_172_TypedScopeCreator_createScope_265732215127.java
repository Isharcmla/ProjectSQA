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

public class TypedScopeCreator_createScope_265732215127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56303;
     Object term56475;
     Object term56803;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56303 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term56383 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term56383, term56383.getClass(), "phaseOptimizer", null);
        setField(term56303, term56303.getClass(), "compiler", term56383);
        term56475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56475, term56475.getClass(), "type", 0);
        setIntField(term56567, term56567.getClass(), "type", 0);
        setField(term56567, term56567.getClass(), "parent", null);
        setField(term56475, term56475.getClass(), "parent", term56567);
        setField(term56637, term56637.getClass(), "next", term56729);
        setIntField(term56637, term56637.getClass(), "type", 118);
        setField(term56637, term56637.getClass(), "first", null);
        setField(term56475, term56475.getClass(), "first", term56637);
        term56803 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term56803, term56803.getClass(), "rootNode", null);
        setIntField(term56803, term56803.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term56475;
        args[1] = term56803;
        callMethod(klass, "createScope", argTypes, term56303, args);
    }

};


