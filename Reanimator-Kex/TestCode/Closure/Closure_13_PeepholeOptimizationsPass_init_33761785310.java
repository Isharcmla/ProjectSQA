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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class PeepholeOptimizationsPass_init_33761785310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term318;
     Object term324;

    public PeepholeOptimizationsPass_init_33761785310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 5);
        Object term323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term323, term323.getClass(), "changed", false);
        setBooleanField(term323, term323.getClass(), "traverseChildScopes", true);
        ArrayList term321 = new ArrayList();
        ((ArrayList) term321).add(term323);
        term318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term319 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 5);
        Object term320 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term318, term318.getClass(), "compiler", null);
        setField(term318, term318.getClass(), "peepholeOptimizations", term319);
        setField(term320, term320.getClass(), "states", term321);
        setIntField(term320, term320.getClass(), "currentDepth", 0);
        setField(term318, term318.getClass(), "traversalState", term320);
        term324 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.AbstractPeepholeOptimization"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term318));
        assertTrue(recursiveEquals(term1, term324));
    }

};


