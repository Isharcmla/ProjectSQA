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
import java.util.ArrayDeque;
import java.util.LinkedList;

public class NodeTraversal_init_2009643098104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18968;
     Object term19349;
     Object term19360;

    public NodeTraversal_init_2009643098104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term18714 = new ArrayDeque();
        Object term18660 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term18852 = newInstance(Class.forName("com.google.javascript.jscomp.InstrumentFunctions$InstrumentReturns"));
        setField(term18660, term18660.getClass(), "scopes", null);
        setField(term18660, term18660.getClass(), "scopeRoots", term18714);
        setField(term18660, term18660.getClass(), "cfgs", null);
        setField(term18660, term18660.getClass(), "callback", term18852);
        term18968 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels$ProcessLabels"));
        ArrayDeque term19351 = new ArrayDeque();
        ArrayDeque term19353 = new ArrayDeque();
        LinkedList term19355 = new LinkedList();
        term19349 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term19350 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels$ProcessLabels"));
        Object term19358 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term19359 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler"));
        setField(term19349, term19349.getClass(), "compiler", null);
        setField(term19350, term19350.getClass(), "namespaceStack", null);
        setField(term19350, term19350.getClass(), "names", null);
        setField(term19350, term19350.getClass(), "this$0", null);
        setField(term19349, term19349.getClass(), "callback", term19350);
        setField(term19349, term19349.getClass(), "curNode", null);
        setField(term19349, term19349.getClass(), "scopes", term19351);
        setField(term19349, term19349.getClass(), "scopeRoots", term19353);
        setField(term19349, term19349.getClass(), "cfgs", term19355);
        setField(term19349, term19349.getClass(), "sourceName", "");
        setField(term19349, term19349.getClass(), "inputId", null);
        setField(term19358, term19358.getClass(), "compiler", null);
        setField(term19358, term19358.getClass(), "scope", null);
        setField(term19358, term19358.getClass(), "inputId", null);
        setField(term19359, term19359.getClass(), "this$0", term19358);
        setField(term19358, term19358.getClass(), "redeclarationHandler", term19359);
        setField(term19349, term19349.getClass(), "scopeCreator", term19358);
        setField(term19349, term19349.getClass(), "scopeCallback", term19350);
        term19360 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels$ProcessLabels"));
        setField(term19360, term19360.getClass(), "namespaceStack", null);
        setField(term19360, term19360.getClass(), "names", null);
        setField(term19360, term19360.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18968;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19349));
        assertTrue(recursiveEquals(term18968, term19360));
    }

};


