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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_16272974651084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303730;
     Object term304312;
     Object term305943;
     Object term305950;

    public ReferenceCollectingCallback_enterScope_16272974651084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term303976 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term304455 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term304498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term304498, term304498.getClass(), "type", 105);
        setIntField(term304541, term304541.getClass(), "type", 132);
        setField(term304498, term304498.getClass(), "parent", term304541);
        setField(term304455, term304455.getClass(), "rootNode", term304498);
        ArrayList term303836 = new ArrayList();
        ((ArrayList) term303836).add(term303976);
        ((ArrayList) term303836).add(term304455);
        ((ArrayList) term303836).add(term304455);
        ((ArrayList) term303836).add(term304455);
        ArrayDeque term303784 = new ArrayDeque((Collection<? extends Object>) term303836);
        term303730 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term303730, term303730.getClass(), "blockStack", term303784);
        ArrayList term304418 = new ArrayList();
        ((ArrayList) term304418).add(term304455);
        ((ArrayList) term304418).add(term304455);
        ((ArrayList) term304418).add(term304455);
        ((ArrayList) term304418).add(term304455);
        ArrayDeque term304366 = new ArrayDeque((Collection<? extends Object>) term304418);
        ArrayList term304647 = new ArrayList();
        ArrayDeque term304595 = new ArrayDeque((Collection<? extends Object>) term304647);
        term304312 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term304312, term304312.getClass(), "scopes", term304366);
        setField(term304312, term304312.getClass(), "scopeRoots", term304595);
        ArrayDeque term305944 = new ArrayDeque();
        term305943 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term305943, term305943.getClass(), "referenceMap", null);
        setField(term305943, term305943.getClass(), "blockStack", term305944);
        setField(term305943, term305943.getClass(), "behavior", null);
        setField(term305943, term305943.getClass(), "compiler", null);
        setField(term305943, term305943.getClass(), "varFilter", null);
        Object term305953 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term305954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term305953, term305953.getClass(), "vars", null);
        setField(term305953, term305953.getClass(), "parent", null);
        setField(term305954, term305954.getClass(), "functionName", null);
        setBooleanField(term305954, term305954.getClass(), "itsNeedsActivation", false);
        setIntField(term305954, term305954.getClass(), "itsFunctionType", 0);
        setBooleanField(term305954, term305954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term305954, term305954.getClass(), "encodedSourceStart", 0);
        setIntField(term305954, term305954.getClass(), "encodedSourceEnd", 0);
        setField(term305954, term305954.getClass(), "sourceName", null);
        setIntField(term305954, term305954.getClass(), "baseLineno", 0);
        setIntField(term305954, term305954.getClass(), "endLineno", 0);
        setField(term305954, term305954.getClass(), "functions", null);
        setField(term305954, term305954.getClass(), "regexps", null);
        setField(term305954, term305954.getClass(), "itsVariables", null);
        setField(term305954, term305954.getClass(), "itsConst", null);
        setField(term305954, term305954.getClass(), "itsVariableNames", null);
        setIntField(term305954, term305954.getClass(), "varStart", 0);
        setField(term305954, term305954.getClass(), "compilerData", null);
        setIntField(term305954, term305954.getClass(), "type", 105);
        setField(term305954, term305954.getClass(), "next", null);
        setField(term305954, term305954.getClass(), "first", null);
        setField(term305954, term305954.getClass(), "last", null);
        setField(term305954, term305954.getClass(), "propListHead", null);
        setIntField(term305954, term305954.getClass(), "sourcePosition", 0);
        setField(term305954, term305954.getClass(), "jsType", null);
        setField(term305954, term305954.getClass(), "parent", null);
        setField(term305953, term305953.getClass(), "rootNode", term305954);
        setField(term305953, term305953.getClass(), "thisType", null);
        setBooleanField(term305953, term305953.getClass(), "isBottom", false);
        ArrayDeque term305951 = new ArrayDeque();
        ((ArrayDeque) term305951).add(term305953);
        ((ArrayDeque) term305951).add(term305953);
        ((ArrayDeque) term305951).add(term305953);
        ((ArrayDeque) term305951).add(term305953);
        ArrayDeque term305955 = new ArrayDeque();
        term305950 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term305950, term305950.getClass(), "compiler", null);
        setField(term305950, term305950.getClass(), "callback", null);
        setField(term305950, term305950.getClass(), "curNode", null);
        setField(term305950, term305950.getClass(), "scopes", term305951);
        setField(term305950, term305950.getClass(), "scopeRoots", term305955);
        setField(term305950, term305950.getClass(), "cfgs", null);
        setField(term305950, term305950.getClass(), "sourceName", null);
        setField(term305950, term305950.getClass(), "scopeCreator", null);
        setField(term305950, term305950.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term304312;
        callMethod(klass, "enterScope", argTypes, term303730, args);
        assertTrue(recursiveEquals(term303730, term305943));
        assertTrue(recursiveEquals(term304312, term305950));
    }

};


