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

public class TypedScopeCreator_createScope_265732215103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40203;
     Object term40375;
     Object term40611;

    public TypedScopeCreator_createScope_265732215103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40203 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term40283 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40283, term40283.getClass(), "phaseOptimizer", null);
        setField(term40203, term40203.getClass(), "compiler", term40283);
        term40375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40375, term40375.getClass(), "type", 0);
        setIntField(term40467, term40467.getClass(), "type", 0);
        setField(term40467, term40467.getClass(), "parent", null);
        setField(term40375, term40375.getClass(), "parent", term40467);
        setField(term40375, term40375.getClass(), "first", term40537);
        term40611 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term40611, term40611.getClass(), "rootNode", null);
        setIntField(term40611, term40611.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term40375;
        args[1] = term40611;
        try {
            callMethod(klass, "createScope", argTypes, term40203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


