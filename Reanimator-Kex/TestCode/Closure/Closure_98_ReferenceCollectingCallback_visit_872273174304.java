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

public class ReferenceCollectingCallback_visit_872273174304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77282;
     Object term77503;
     Object term77460;
     Object term77576;
     Object term77577;
     Object term77578;

    public ReferenceCollectingCallback_visit_872273174304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77282 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term77503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term77503, term77503.getClass(), "type", 0);
        term77460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77460, term77460.getClass(), "type", 108);
        setField(term77460, term77460.getClass(), "first", term77503);
        term77576 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term77576, term77576.getClass(), "referenceMap", null);
        setField(term77576, term77576.getClass(), "blockStack", null);
        setField(term77576, term77576.getClass(), "behavior", null);
        setField(term77576, term77576.getClass(), "compiler", null);
        setField(term77576, term77576.getClass(), "varFilter", null);
        term77577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77577, term77577.getClass(), "functionName", null);
        setBooleanField(term77577, term77577.getClass(), "itsNeedsActivation", false);
        setIntField(term77577, term77577.getClass(), "itsFunctionType", 0);
        setBooleanField(term77577, term77577.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77577, term77577.getClass(), "encodedSourceStart", 0);
        setIntField(term77577, term77577.getClass(), "encodedSourceEnd", 0);
        setField(term77577, term77577.getClass(), "sourceName", null);
        setIntField(term77577, term77577.getClass(), "baseLineno", 0);
        setIntField(term77577, term77577.getClass(), "endLineno", 0);
        setField(term77577, term77577.getClass(), "functions", null);
        setField(term77577, term77577.getClass(), "regexps", null);
        setField(term77577, term77577.getClass(), "itsVariables", null);
        setField(term77577, term77577.getClass(), "itsConst", null);
        setField(term77577, term77577.getClass(), "itsVariableNames", null);
        setIntField(term77577, term77577.getClass(), "varStart", 0);
        setField(term77577, term77577.getClass(), "compilerData", null);
        setIntField(term77577, term77577.getClass(), "type", 0);
        setField(term77577, term77577.getClass(), "next", null);
        setField(term77577, term77577.getClass(), "first", null);
        setField(term77577, term77577.getClass(), "last", null);
        setField(term77577, term77577.getClass(), "propListHead", null);
        setIntField(term77577, term77577.getClass(), "sourcePosition", 0);
        setField(term77577, term77577.getClass(), "jsType", null);
        setField(term77577, term77577.getClass(), "parent", null);
        term77578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term77579 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term77578, term77578.getClass(), "number", 0.0);
        setIntField(term77578, term77578.getClass(), "type", 108);
        setField(term77578, term77578.getClass(), "next", null);
        setField(term77579, term77579.getClass(), "functionName", null);
        setBooleanField(term77579, term77579.getClass(), "itsNeedsActivation", false);
        setIntField(term77579, term77579.getClass(), "itsFunctionType", 0);
        setBooleanField(term77579, term77579.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77579, term77579.getClass(), "encodedSourceStart", 0);
        setIntField(term77579, term77579.getClass(), "encodedSourceEnd", 0);
        setField(term77579, term77579.getClass(), "sourceName", null);
        setIntField(term77579, term77579.getClass(), "baseLineno", 0);
        setIntField(term77579, term77579.getClass(), "endLineno", 0);
        setField(term77579, term77579.getClass(), "functions", null);
        setField(term77579, term77579.getClass(), "regexps", null);
        setField(term77579, term77579.getClass(), "itsVariables", null);
        setField(term77579, term77579.getClass(), "itsConst", null);
        setField(term77579, term77579.getClass(), "itsVariableNames", null);
        setIntField(term77579, term77579.getClass(), "varStart", 0);
        setField(term77579, term77579.getClass(), "compilerData", null);
        setIntField(term77579, term77579.getClass(), "type", 0);
        setField(term77579, term77579.getClass(), "next", null);
        setField(term77579, term77579.getClass(), "first", null);
        setField(term77579, term77579.getClass(), "last", null);
        setField(term77579, term77579.getClass(), "propListHead", null);
        setIntField(term77579, term77579.getClass(), "sourcePosition", 0);
        setField(term77579, term77579.getClass(), "jsType", null);
        setField(term77579, term77579.getClass(), "parent", null);
        setField(term77578, term77578.getClass(), "first", term77579);
        setField(term77578, term77578.getClass(), "last", null);
        setField(term77578, term77578.getClass(), "propListHead", null);
        setIntField(term77578, term77578.getClass(), "sourcePosition", 0);
        setField(term77578, term77578.getClass(), "jsType", null);
        setField(term77578, term77578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term77503;
        args[2] = term77460;
        callMethod(klass, "visit", argTypes, term77282, args);
        assertTrue(recursiveEquals(term77282, term77576));
        assertTrue(recursiveEquals(term77503, term77578));
        assertTrue(recursiveEquals(term77460, null));
    }

};


