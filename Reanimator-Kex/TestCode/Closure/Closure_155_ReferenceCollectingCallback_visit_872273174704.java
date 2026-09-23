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

public class ReferenceCollectingCallback_visit_872273174704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186010;
     Object term186231;
     Object term186188;
     Object term186645;
     Object term186646;
     Object term186647;

    public ReferenceCollectingCallback_visit_872273174704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186010 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term186231 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term186231, term186231.getClass(), "type", 0);
        term186188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term186188, term186188.getClass(), "type", 101);
        setField(term186188, term186188.getClass(), "first", term186231);
        term186645 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term186645, term186645.getClass(), "referenceMap", null);
        setField(term186645, term186645.getClass(), "blockStack", null);
        setField(term186645, term186645.getClass(), "behavior", null);
        setField(term186645, term186645.getClass(), "compiler", null);
        setField(term186645, term186645.getClass(), "varFilter", null);
        term186646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term186646, term186646.getClass(), "functionName", null);
        setBooleanField(term186646, term186646.getClass(), "itsNeedsActivation", false);
        setIntField(term186646, term186646.getClass(), "itsFunctionType", 0);
        setBooleanField(term186646, term186646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term186646, term186646.getClass(), "encodedSourceStart", 0);
        setIntField(term186646, term186646.getClass(), "encodedSourceEnd", 0);
        setField(term186646, term186646.getClass(), "sourceName", null);
        setIntField(term186646, term186646.getClass(), "baseLineno", 0);
        setIntField(term186646, term186646.getClass(), "endLineno", 0);
        setField(term186646, term186646.getClass(), "functions", null);
        setField(term186646, term186646.getClass(), "regexps", null);
        setField(term186646, term186646.getClass(), "itsVariables", null);
        setField(term186646, term186646.getClass(), "itsConst", null);
        setField(term186646, term186646.getClass(), "itsVariableNames", null);
        setIntField(term186646, term186646.getClass(), "varStart", 0);
        setField(term186646, term186646.getClass(), "compilerData", null);
        setIntField(term186646, term186646.getClass(), "type", 0);
        setField(term186646, term186646.getClass(), "next", null);
        setField(term186646, term186646.getClass(), "first", null);
        setField(term186646, term186646.getClass(), "last", null);
        setField(term186646, term186646.getClass(), "propListHead", null);
        setIntField(term186646, term186646.getClass(), "sourcePosition", 0);
        setField(term186646, term186646.getClass(), "jsType", null);
        setField(term186646, term186646.getClass(), "parent", null);
        term186647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186648 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term186647, term186647.getClass(), "number", 0.0);
        setIntField(term186647, term186647.getClass(), "type", 101);
        setField(term186647, term186647.getClass(), "next", null);
        setField(term186648, term186648.getClass(), "functionName", null);
        setBooleanField(term186648, term186648.getClass(), "itsNeedsActivation", false);
        setIntField(term186648, term186648.getClass(), "itsFunctionType", 0);
        setBooleanField(term186648, term186648.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term186648, term186648.getClass(), "encodedSourceStart", 0);
        setIntField(term186648, term186648.getClass(), "encodedSourceEnd", 0);
        setField(term186648, term186648.getClass(), "sourceName", null);
        setIntField(term186648, term186648.getClass(), "baseLineno", 0);
        setIntField(term186648, term186648.getClass(), "endLineno", 0);
        setField(term186648, term186648.getClass(), "functions", null);
        setField(term186648, term186648.getClass(), "regexps", null);
        setField(term186648, term186648.getClass(), "itsVariables", null);
        setField(term186648, term186648.getClass(), "itsConst", null);
        setField(term186648, term186648.getClass(), "itsVariableNames", null);
        setIntField(term186648, term186648.getClass(), "varStart", 0);
        setField(term186648, term186648.getClass(), "compilerData", null);
        setIntField(term186648, term186648.getClass(), "type", 0);
        setField(term186648, term186648.getClass(), "next", null);
        setField(term186648, term186648.getClass(), "first", null);
        setField(term186648, term186648.getClass(), "last", null);
        setField(term186648, term186648.getClass(), "propListHead", null);
        setIntField(term186648, term186648.getClass(), "sourcePosition", 0);
        setField(term186648, term186648.getClass(), "jsType", null);
        setField(term186648, term186648.getClass(), "parent", null);
        setField(term186647, term186647.getClass(), "first", term186648);
        setField(term186647, term186647.getClass(), "last", null);
        setField(term186647, term186647.getClass(), "propListHead", null);
        setIntField(term186647, term186647.getClass(), "sourcePosition", 0);
        setField(term186647, term186647.getClass(), "jsType", null);
        setField(term186647, term186647.getClass(), "parent", null);
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
        args[1] = term186231;
        args[2] = term186188;
        callMethod(klass, "visit", argTypes, term186010, args);
        assertTrue(recursiveEquals(term186010, term186645));
        assertTrue(recursiveEquals(term186231, term186647));
        assertTrue(recursiveEquals(term186188, null));
    }

};


