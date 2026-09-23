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

public class ReferenceCollectingCallback_visit_872273174564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153030;
     Object term153254;
     Object term153208;
     Object term153544;
     Object term153545;
     Object term153546;

    public ReferenceCollectingCallback_visit_872273174564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153030 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term153254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term153254, term153254.getClass(), "type", 0);
        term153208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term153208, term153208.getClass(), "type", 108);
        setField(term153208, term153208.getClass(), "first", term153254);
        term153544 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term153544, term153544.getClass(), "referenceMap", null);
        setField(term153544, term153544.getClass(), "blockStack", null);
        setField(term153544, term153544.getClass(), "behavior", null);
        setField(term153544, term153544.getClass(), "compiler", null);
        setField(term153544, term153544.getClass(), "varFilter", null);
        term153545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term153545, term153545.getClass(), "number", 0.0);
        setIntField(term153545, term153545.getClass(), "type", 0);
        setField(term153545, term153545.getClass(), "next", null);
        setField(term153545, term153545.getClass(), "first", null);
        setField(term153545, term153545.getClass(), "last", null);
        setField(term153545, term153545.getClass(), "propListHead", null);
        setIntField(term153545, term153545.getClass(), "sourcePosition", 0);
        setField(term153545, term153545.getClass(), "jsType", null);
        setField(term153545, term153545.getClass(), "parent", null);
        term153546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term153547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term153546, term153546.getClass(), "functionName", null);
        setBooleanField(term153546, term153546.getClass(), "itsNeedsActivation", false);
        setIntField(term153546, term153546.getClass(), "itsFunctionType", 0);
        setBooleanField(term153546, term153546.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term153546, term153546.getClass(), "encodedSourceStart", 0);
        setIntField(term153546, term153546.getClass(), "encodedSourceEnd", 0);
        setField(term153546, term153546.getClass(), "sourceName", null);
        setIntField(term153546, term153546.getClass(), "baseLineno", 0);
        setIntField(term153546, term153546.getClass(), "endLineno", 0);
        setField(term153546, term153546.getClass(), "functions", null);
        setField(term153546, term153546.getClass(), "regexps", null);
        setField(term153546, term153546.getClass(), "itsVariables", null);
        setField(term153546, term153546.getClass(), "itsConst", null);
        setField(term153546, term153546.getClass(), "itsVariableNames", null);
        setIntField(term153546, term153546.getClass(), "varStart", 0);
        setField(term153546, term153546.getClass(), "compilerData", null);
        setIntField(term153546, term153546.getClass(), "type", 108);
        setField(term153546, term153546.getClass(), "next", null);
        setDoubleField(term153547, term153547.getClass(), "number", 0.0);
        setIntField(term153547, term153547.getClass(), "type", 0);
        setField(term153547, term153547.getClass(), "next", null);
        setField(term153547, term153547.getClass(), "first", null);
        setField(term153547, term153547.getClass(), "last", null);
        setField(term153547, term153547.getClass(), "propListHead", null);
        setIntField(term153547, term153547.getClass(), "sourcePosition", 0);
        setField(term153547, term153547.getClass(), "jsType", null);
        setField(term153547, term153547.getClass(), "parent", null);
        setField(term153546, term153546.getClass(), "first", term153547);
        setField(term153546, term153546.getClass(), "last", null);
        setField(term153546, term153546.getClass(), "propListHead", null);
        setIntField(term153546, term153546.getClass(), "sourcePosition", 0);
        setField(term153546, term153546.getClass(), "jsType", null);
        setField(term153546, term153546.getClass(), "parent", null);
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
        args[1] = term153254;
        args[2] = term153208;
        callMethod(klass, "visit", argTypes, term153030, args);
        assertTrue(recursiveEquals(term153030, term153544));
        assertTrue(recursiveEquals(term153254, term153546));
        assertTrue(recursiveEquals(term153208, null));
    }

};


