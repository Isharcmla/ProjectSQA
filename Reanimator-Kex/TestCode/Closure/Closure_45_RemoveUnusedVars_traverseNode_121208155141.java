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

public class RemoveUnusedVars_traverseNode_121208155141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7124;
     Object term7216;
     Object term9020;
     Object term9021;

    public RemoveUnusedVars_traverseNode_121208155141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7124 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term7216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term7216, term7216.getClass(), "type", 0);
        setIntField(term7308, term7308.getClass(), "type", 0);
        setIntField(term7400, term7400.getClass(), "type", 64);
        setField(term7400, term7400.getClass(), "first", null);
        setField(term7400, term7400.getClass(), "next", null);
        setField(term7308, term7308.getClass(), "first", term7400);
        setField(term7308, term7308.getClass(), "next", term7492);
        setField(term7216, term7216.getClass(), "first", term7308);
        term9020 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term9020, term9020.getClass(), "compiler", null);
        setField(term9020, term9020.getClass(), "codingConvention", null);
        setBooleanField(term9020, term9020.getClass(), "removeGlobals", false);
        setBooleanField(term9020, term9020.getClass(), "preserveFunctionExpressionNames", false);
        setField(term9020, term9020.getClass(), "referenced", null);
        setField(term9020, term9020.getClass(), "maybeUnreferenced", null);
        setField(term9020, term9020.getClass(), "allFunctionScopes", null);
        setField(term9020, term9020.getClass(), "assignsByVar", null);
        setField(term9020, term9020.getClass(), "assignsByNode", null);
        setField(term9020, term9020.getClass(), "inheritsCalls", null);
        setField(term9020, term9020.getClass(), "continuations", null);
        setBooleanField(term9020, term9020.getClass(), "modifyCallSites", false);
        setField(term9020, term9020.getClass(), "callSiteOptimizer", null);
        term9021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term9022 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term9023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term9024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term9021, term9021.getClass(), "str", null);
        setIntField(term9021, term9021.getClass(), "type", 0);
        setField(term9021, term9021.getClass(), "next", null);
        setField(term9022, term9022.getClass(), "str", null);
        setIntField(term9022, term9022.getClass(), "type", 0);
        setField(term9023, term9023.getClass(), "str", null);
        setIntField(term9023, term9023.getClass(), "type", 0);
        setField(term9023, term9023.getClass(), "next", null);
        setField(term9023, term9023.getClass(), "first", null);
        setField(term9023, term9023.getClass(), "last", null);
        setField(term9023, term9023.getClass(), "propListHead", null);
        setIntField(term9023, term9023.getClass(), "sourcePosition", 0);
        setField(term9023, term9023.getClass(), "jsType", null);
        setField(term9023, term9023.getClass(), "parent", null);
        setField(term9022, term9022.getClass(), "next", term9023);
        setField(term9024, term9024.getClass(), "str", null);
        setIntField(term9024, term9024.getClass(), "type", 64);
        setField(term9024, term9024.getClass(), "next", null);
        setField(term9024, term9024.getClass(), "first", null);
        setField(term9024, term9024.getClass(), "last", null);
        setField(term9024, term9024.getClass(), "propListHead", null);
        setIntField(term9024, term9024.getClass(), "sourcePosition", 0);
        setField(term9024, term9024.getClass(), "jsType", null);
        setField(term9024, term9024.getClass(), "parent", null);
        setField(term9022, term9022.getClass(), "first", term9024);
        setField(term9022, term9022.getClass(), "last", null);
        setField(term9022, term9022.getClass(), "propListHead", null);
        setIntField(term9022, term9022.getClass(), "sourcePosition", 0);
        setField(term9022, term9022.getClass(), "jsType", null);
        setField(term9022, term9022.getClass(), "parent", null);
        setField(term9021, term9021.getClass(), "first", term9022);
        setField(term9021, term9021.getClass(), "last", null);
        setField(term9021, term9021.getClass(), "propListHead", null);
        setIntField(term9021, term9021.getClass(), "sourcePosition", 0);
        setField(term9021, term9021.getClass(), "jsType", null);
        setField(term9021, term9021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term7216;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term7124, args);
        assertTrue(recursiveEquals(term7124, term9020));
        assertTrue(recursiveEquals(term7216, term9021));
    }

};


