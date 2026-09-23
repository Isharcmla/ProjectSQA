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

public class ReferenceCollectingCallback_visit_872273174651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171716;
     Object term171940;
     Object term171894;
     Object term172340;
     Object term172341;
     Object term172342;

    public ReferenceCollectingCallback_visit_872273174651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171716 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term171940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term171940, term171940.getClass(), "type", 0);
        term171894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term171894, term171894.getClass(), "type", 101);
        setField(term171894, term171894.getClass(), "first", term171940);
        term172340 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term172340, term172340.getClass(), "referenceMap", null);
        setField(term172340, term172340.getClass(), "blockStack", null);
        setField(term172340, term172340.getClass(), "behavior", null);
        setField(term172340, term172340.getClass(), "compiler", null);
        setField(term172340, term172340.getClass(), "varFilter", null);
        term172341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term172341, term172341.getClass(), "number", 0.0);
        setIntField(term172341, term172341.getClass(), "type", 0);
        setField(term172341, term172341.getClass(), "next", null);
        setField(term172341, term172341.getClass(), "first", null);
        setField(term172341, term172341.getClass(), "last", null);
        setField(term172341, term172341.getClass(), "propListHead", null);
        setIntField(term172341, term172341.getClass(), "sourcePosition", 0);
        setField(term172341, term172341.getClass(), "jsType", null);
        setField(term172341, term172341.getClass(), "parent", null);
        term172342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term172342, term172342.getClass(), "functionName", null);
        setBooleanField(term172342, term172342.getClass(), "itsNeedsActivation", false);
        setIntField(term172342, term172342.getClass(), "itsFunctionType", 0);
        setBooleanField(term172342, term172342.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172342, term172342.getClass(), "encodedSourceStart", 0);
        setIntField(term172342, term172342.getClass(), "encodedSourceEnd", 0);
        setField(term172342, term172342.getClass(), "sourceName", null);
        setIntField(term172342, term172342.getClass(), "baseLineno", 0);
        setIntField(term172342, term172342.getClass(), "endLineno", 0);
        setField(term172342, term172342.getClass(), "functions", null);
        setField(term172342, term172342.getClass(), "regexps", null);
        setField(term172342, term172342.getClass(), "itsVariables", null);
        setField(term172342, term172342.getClass(), "itsConst", null);
        setField(term172342, term172342.getClass(), "itsVariableNames", null);
        setIntField(term172342, term172342.getClass(), "varStart", 0);
        setField(term172342, term172342.getClass(), "compilerData", null);
        setIntField(term172342, term172342.getClass(), "type", 101);
        setField(term172342, term172342.getClass(), "next", null);
        setDoubleField(term172343, term172343.getClass(), "number", 0.0);
        setIntField(term172343, term172343.getClass(), "type", 0);
        setField(term172343, term172343.getClass(), "next", null);
        setField(term172343, term172343.getClass(), "first", null);
        setField(term172343, term172343.getClass(), "last", null);
        setField(term172343, term172343.getClass(), "propListHead", null);
        setIntField(term172343, term172343.getClass(), "sourcePosition", 0);
        setField(term172343, term172343.getClass(), "jsType", null);
        setField(term172343, term172343.getClass(), "parent", null);
        setField(term172342, term172342.getClass(), "first", term172343);
        setField(term172342, term172342.getClass(), "last", null);
        setField(term172342, term172342.getClass(), "propListHead", null);
        setIntField(term172342, term172342.getClass(), "sourcePosition", 0);
        setField(term172342, term172342.getClass(), "jsType", null);
        setField(term172342, term172342.getClass(), "parent", null);
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
        args[1] = term171940;
        args[2] = term171894;
        callMethod(klass, "visit", argTypes, term171716, args);
        assertTrue(recursiveEquals(term171716, term172340));
        assertTrue(recursiveEquals(term171940, term172342));
        assertTrue(recursiveEquals(term171894, null));
    }

};


