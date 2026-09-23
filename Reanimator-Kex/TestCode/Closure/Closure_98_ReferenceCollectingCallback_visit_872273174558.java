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

public class ReferenceCollectingCallback_visit_872273174558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151107;
     Object term151331;
     Object term151285;
     Object term151922;
     Object term151923;
     Object term151924;

    public ReferenceCollectingCallback_visit_872273174558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151107 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term151331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term151331, term151331.getClass(), "type", 0);
        term151285 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term151285, term151285.getClass(), "type", 100);
        setField(term151285, term151285.getClass(), "first", term151331);
        term151922 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term151922, term151922.getClass(), "referenceMap", null);
        setField(term151922, term151922.getClass(), "blockStack", null);
        setField(term151922, term151922.getClass(), "behavior", null);
        setField(term151922, term151922.getClass(), "compiler", null);
        setField(term151922, term151922.getClass(), "varFilter", null);
        term151923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term151923, term151923.getClass(), "number", 0.0);
        setIntField(term151923, term151923.getClass(), "type", 0);
        setField(term151923, term151923.getClass(), "next", null);
        setField(term151923, term151923.getClass(), "first", null);
        setField(term151923, term151923.getClass(), "last", null);
        setField(term151923, term151923.getClass(), "propListHead", null);
        setIntField(term151923, term151923.getClass(), "sourcePosition", 0);
        setField(term151923, term151923.getClass(), "jsType", null);
        setField(term151923, term151923.getClass(), "parent", null);
        term151924 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term151924, term151924.getClass(), "functionName", null);
        setBooleanField(term151924, term151924.getClass(), "itsNeedsActivation", false);
        setIntField(term151924, term151924.getClass(), "itsFunctionType", 0);
        setBooleanField(term151924, term151924.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151924, term151924.getClass(), "encodedSourceStart", 0);
        setIntField(term151924, term151924.getClass(), "encodedSourceEnd", 0);
        setField(term151924, term151924.getClass(), "sourceName", null);
        setIntField(term151924, term151924.getClass(), "baseLineno", 0);
        setIntField(term151924, term151924.getClass(), "endLineno", 0);
        setField(term151924, term151924.getClass(), "functions", null);
        setField(term151924, term151924.getClass(), "regexps", null);
        setField(term151924, term151924.getClass(), "itsVariables", null);
        setField(term151924, term151924.getClass(), "itsConst", null);
        setField(term151924, term151924.getClass(), "itsVariableNames", null);
        setIntField(term151924, term151924.getClass(), "varStart", 0);
        setField(term151924, term151924.getClass(), "compilerData", null);
        setIntField(term151924, term151924.getClass(), "type", 100);
        setField(term151924, term151924.getClass(), "next", null);
        setDoubleField(term151925, term151925.getClass(), "number", 0.0);
        setIntField(term151925, term151925.getClass(), "type", 0);
        setField(term151925, term151925.getClass(), "next", null);
        setField(term151925, term151925.getClass(), "first", null);
        setField(term151925, term151925.getClass(), "last", null);
        setField(term151925, term151925.getClass(), "propListHead", null);
        setIntField(term151925, term151925.getClass(), "sourcePosition", 0);
        setField(term151925, term151925.getClass(), "jsType", null);
        setField(term151925, term151925.getClass(), "parent", null);
        setField(term151924, term151924.getClass(), "first", term151925);
        setField(term151924, term151924.getClass(), "last", null);
        setField(term151924, term151924.getClass(), "propListHead", null);
        setIntField(term151924, term151924.getClass(), "sourcePosition", 0);
        setField(term151924, term151924.getClass(), "jsType", null);
        setField(term151924, term151924.getClass(), "parent", null);
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
        args[1] = term151331;
        args[2] = term151285;
        callMethod(klass, "visit", argTypes, term151107, args);
        assertTrue(recursiveEquals(term151107, term151922));
        assertTrue(recursiveEquals(term151331, term151924));
        assertTrue(recursiveEquals(term151285, null));
    }

};


