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

public class RemoveUnusedVars_traverseNode_121208155163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13258;
     Object term13328;
     Object term13966;
     Object term13967;

    public RemoveUnusedVars_traverseNode_121208155163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13258 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term13328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13328, term13328.getClass(), "type", 0);
        setIntField(term13398, term13398.getClass(), "type", 0);
        setIntField(term13468, term13468.getClass(), "type", 0);
        setField(term13468, term13468.getClass(), "first", null);
        setField(term13468, term13468.getClass(), "next", null);
        setField(term13398, term13398.getClass(), "first", term13468);
        setIntField(term13538, term13538.getClass(), "type", 0);
        setField(term13538, term13538.getClass(), "first", term13468);
        setField(term13398, term13398.getClass(), "next", term13538);
        setField(term13328, term13328.getClass(), "first", term13398);
        term13966 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term13966, term13966.getClass(), "compiler", null);
        setField(term13966, term13966.getClass(), "codingConvention", null);
        setBooleanField(term13966, term13966.getClass(), "removeGlobals", false);
        setBooleanField(term13966, term13966.getClass(), "preserveFunctionExpressionNames", false);
        setField(term13966, term13966.getClass(), "referenced", null);
        setField(term13966, term13966.getClass(), "maybeUnreferenced", null);
        setField(term13966, term13966.getClass(), "allFunctionScopes", null);
        setField(term13966, term13966.getClass(), "assignsByVar", null);
        setField(term13966, term13966.getClass(), "assignsByNode", null);
        setField(term13966, term13966.getClass(), "inheritsCalls", null);
        setField(term13966, term13966.getClass(), "continuations", null);
        setBooleanField(term13966, term13966.getClass(), "modifyCallSites", false);
        setField(term13966, term13966.getClass(), "callSiteOptimizer", null);
        term13967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13967, term13967.getClass(), "type", 0);
        setField(term13967, term13967.getClass(), "next", null);
        setIntField(term13968, term13968.getClass(), "type", 0);
        setIntField(term13969, term13969.getClass(), "type", 0);
        setField(term13969, term13969.getClass(), "next", null);
        setIntField(term13970, term13970.getClass(), "type", 0);
        setField(term13970, term13970.getClass(), "next", null);
        setField(term13970, term13970.getClass(), "first", null);
        setField(term13970, term13970.getClass(), "last", null);
        setField(term13970, term13970.getClass(), "propListHead", null);
        setIntField(term13970, term13970.getClass(), "sourcePosition", 0);
        setField(term13970, term13970.getClass(), "jsType", null);
        setField(term13970, term13970.getClass(), "parent", null);
        setField(term13969, term13969.getClass(), "first", term13970);
        setField(term13969, term13969.getClass(), "last", null);
        setField(term13969, term13969.getClass(), "propListHead", null);
        setIntField(term13969, term13969.getClass(), "sourcePosition", 0);
        setField(term13969, term13969.getClass(), "jsType", null);
        setField(term13969, term13969.getClass(), "parent", null);
        setField(term13968, term13968.getClass(), "next", term13969);
        setField(term13968, term13968.getClass(), "first", term13970);
        setField(term13968, term13968.getClass(), "last", null);
        setField(term13968, term13968.getClass(), "propListHead", null);
        setIntField(term13968, term13968.getClass(), "sourcePosition", 0);
        setField(term13968, term13968.getClass(), "jsType", null);
        setField(term13968, term13968.getClass(), "parent", null);
        setField(term13967, term13967.getClass(), "first", term13968);
        setField(term13967, term13967.getClass(), "last", null);
        setField(term13967, term13967.getClass(), "propListHead", null);
        setIntField(term13967, term13967.getClass(), "sourcePosition", 0);
        setField(term13967, term13967.getClass(), "jsType", null);
        setField(term13967, term13967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term13328;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term13258, args);
        assertTrue(recursiveEquals(term13258, term13966));
        assertTrue(recursiveEquals(term13328, term13967));
    }

};


