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

public class RemoveUnusedVars_traverseNode_121208155172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15820;
     Object term15890;
     Object term16541;
     Object term16542;

    public RemoveUnusedVars_traverseNode_121208155172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15820 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term15890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15890, term15890.getClass(), "type", 64);
        setIntField(term15960, term15960.getClass(), "type", 64);
        setField(term15960, term15960.getClass(), "first", null);
        setField(term15890, term15890.getClass(), "first", term15960);
        term16541 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term16541, term16541.getClass(), "compiler", null);
        setField(term16541, term16541.getClass(), "codingConvention", null);
        setBooleanField(term16541, term16541.getClass(), "removeGlobals", false);
        setBooleanField(term16541, term16541.getClass(), "preserveFunctionExpressionNames", false);
        setField(term16541, term16541.getClass(), "referenced", null);
        setField(term16541, term16541.getClass(), "maybeUnreferenced", null);
        setField(term16541, term16541.getClass(), "allFunctionScopes", null);
        setField(term16541, term16541.getClass(), "assignsByVar", null);
        setField(term16541, term16541.getClass(), "assignsByNode", null);
        setField(term16541, term16541.getClass(), "inheritsCalls", null);
        setField(term16541, term16541.getClass(), "continuations", null);
        setBooleanField(term16541, term16541.getClass(), "modifyCallSites", false);
        setField(term16541, term16541.getClass(), "callSiteOptimizer", null);
        term16542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16542, term16542.getClass(), "type", 64);
        setField(term16542, term16542.getClass(), "next", null);
        setIntField(term16543, term16543.getClass(), "type", 64);
        setField(term16543, term16543.getClass(), "next", null);
        setField(term16543, term16543.getClass(), "first", null);
        setField(term16543, term16543.getClass(), "last", null);
        setField(term16543, term16543.getClass(), "propListHead", null);
        setIntField(term16543, term16543.getClass(), "sourcePosition", 0);
        setField(term16543, term16543.getClass(), "jsType", null);
        setField(term16543, term16543.getClass(), "parent", null);
        setField(term16542, term16542.getClass(), "first", term16543);
        setField(term16542, term16542.getClass(), "last", null);
        setField(term16542, term16542.getClass(), "propListHead", null);
        setIntField(term16542, term16542.getClass(), "sourcePosition", 0);
        setField(term16542, term16542.getClass(), "jsType", null);
        setField(term16542, term16542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term15890;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term15820, args);
        assertTrue(recursiveEquals(term15820, term16541));
        assertTrue(recursiveEquals(term15890, term16542));
    }

};


