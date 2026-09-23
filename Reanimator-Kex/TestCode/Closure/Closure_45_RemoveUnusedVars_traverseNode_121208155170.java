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

public class RemoveUnusedVars_traverseNode_121208155170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14799;
     Object term14891;
     Object term16015;
     Object term16016;

    public RemoveUnusedVars_traverseNode_121208155170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14799 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term14891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term14983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term15075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term15167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term14891, term14891.getClass(), "type", 64);
        setIntField(term14983, term14983.getClass(), "type", 64);
        setIntField(term15075, term15075.getClass(), "type", 64);
        setField(term15075, term15075.getClass(), "first", null);
        setField(term15075, term15075.getClass(), "next", null);
        setField(term14983, term14983.getClass(), "first", term15075);
        setField(term14983, term14983.getClass(), "next", term15167);
        setField(term14891, term14891.getClass(), "first", term14983);
        term16015 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term16015, term16015.getClass(), "compiler", null);
        setField(term16015, term16015.getClass(), "codingConvention", null);
        setBooleanField(term16015, term16015.getClass(), "removeGlobals", false);
        setBooleanField(term16015, term16015.getClass(), "preserveFunctionExpressionNames", false);
        setField(term16015, term16015.getClass(), "referenced", null);
        setField(term16015, term16015.getClass(), "maybeUnreferenced", null);
        setField(term16015, term16015.getClass(), "allFunctionScopes", null);
        setField(term16015, term16015.getClass(), "assignsByVar", null);
        setField(term16015, term16015.getClass(), "assignsByNode", null);
        setField(term16015, term16015.getClass(), "inheritsCalls", null);
        setField(term16015, term16015.getClass(), "continuations", null);
        setBooleanField(term16015, term16015.getClass(), "modifyCallSites", false);
        setField(term16015, term16015.getClass(), "callSiteOptimizer", null);
        term16016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term16016, term16016.getClass(), "str", null);
        setIntField(term16016, term16016.getClass(), "type", 64);
        setField(term16016, term16016.getClass(), "next", null);
        setField(term16017, term16017.getClass(), "str", null);
        setIntField(term16017, term16017.getClass(), "type", 64);
        setField(term16018, term16018.getClass(), "str", null);
        setIntField(term16018, term16018.getClass(), "type", 0);
        setField(term16018, term16018.getClass(), "next", null);
        setField(term16018, term16018.getClass(), "first", null);
        setField(term16018, term16018.getClass(), "last", null);
        setField(term16018, term16018.getClass(), "propListHead", null);
        setIntField(term16018, term16018.getClass(), "sourcePosition", 0);
        setField(term16018, term16018.getClass(), "jsType", null);
        setField(term16018, term16018.getClass(), "parent", null);
        setField(term16017, term16017.getClass(), "next", term16018);
        setField(term16019, term16019.getClass(), "str", null);
        setIntField(term16019, term16019.getClass(), "type", 64);
        setField(term16019, term16019.getClass(), "next", null);
        setField(term16019, term16019.getClass(), "first", null);
        setField(term16019, term16019.getClass(), "last", null);
        setField(term16019, term16019.getClass(), "propListHead", null);
        setIntField(term16019, term16019.getClass(), "sourcePosition", 0);
        setField(term16019, term16019.getClass(), "jsType", null);
        setField(term16019, term16019.getClass(), "parent", null);
        setField(term16017, term16017.getClass(), "first", term16019);
        setField(term16017, term16017.getClass(), "last", null);
        setField(term16017, term16017.getClass(), "propListHead", null);
        setIntField(term16017, term16017.getClass(), "sourcePosition", 0);
        setField(term16017, term16017.getClass(), "jsType", null);
        setField(term16017, term16017.getClass(), "parent", null);
        setField(term16016, term16016.getClass(), "first", term16017);
        setField(term16016, term16016.getClass(), "last", null);
        setField(term16016, term16016.getClass(), "propListHead", null);
        setIntField(term16016, term16016.getClass(), "sourcePosition", 0);
        setField(term16016, term16016.getClass(), "jsType", null);
        setField(term16016, term16016.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term14891;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term14799, args);
        assertTrue(recursiveEquals(term14799, term16015));
        assertTrue(recursiveEquals(term14891, term16016));
    }

};


