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

public class RemoveUnusedVars_traverseNode_121208155180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18201;
     Object term18293;
     Object term18855;
     Object term18856;

    public RemoveUnusedVars_traverseNode_121208155180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18201 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term18293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term18293, term18293.getClass(), "type", 64);
        setIntField(term18385, term18385.getClass(), "type", 64);
        setField(term18385, term18385.getClass(), "first", null);
        setField(term18293, term18293.getClass(), "first", term18385);
        term18855 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term18855, term18855.getClass(), "compiler", null);
        setField(term18855, term18855.getClass(), "codingConvention", null);
        setBooleanField(term18855, term18855.getClass(), "removeGlobals", false);
        setBooleanField(term18855, term18855.getClass(), "preserveFunctionExpressionNames", false);
        setField(term18855, term18855.getClass(), "referenced", null);
        setField(term18855, term18855.getClass(), "maybeUnreferenced", null);
        setField(term18855, term18855.getClass(), "allFunctionScopes", null);
        setField(term18855, term18855.getClass(), "assignsByVar", null);
        setField(term18855, term18855.getClass(), "assignsByNode", null);
        setField(term18855, term18855.getClass(), "inheritsCalls", null);
        setField(term18855, term18855.getClass(), "continuations", null);
        setBooleanField(term18855, term18855.getClass(), "modifyCallSites", false);
        setField(term18855, term18855.getClass(), "callSiteOptimizer", null);
        term18856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term18856, term18856.getClass(), "str", null);
        setIntField(term18856, term18856.getClass(), "type", 64);
        setField(term18856, term18856.getClass(), "next", null);
        setField(term18857, term18857.getClass(), "str", null);
        setIntField(term18857, term18857.getClass(), "type", 64);
        setField(term18857, term18857.getClass(), "next", null);
        setField(term18857, term18857.getClass(), "first", null);
        setField(term18857, term18857.getClass(), "last", null);
        setField(term18857, term18857.getClass(), "propListHead", null);
        setIntField(term18857, term18857.getClass(), "sourcePosition", 0);
        setField(term18857, term18857.getClass(), "jsType", null);
        setField(term18857, term18857.getClass(), "parent", null);
        setField(term18856, term18856.getClass(), "first", term18857);
        setField(term18856, term18856.getClass(), "last", null);
        setField(term18856, term18856.getClass(), "propListHead", null);
        setIntField(term18856, term18856.getClass(), "sourcePosition", 0);
        setField(term18856, term18856.getClass(), "jsType", null);
        setField(term18856, term18856.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term18293;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term18201, args);
        assertTrue(recursiveEquals(term18201, term18855));
        assertTrue(recursiveEquals(term18293, term18856));
    }

};


