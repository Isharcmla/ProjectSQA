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

public class ReferenceCollectingCallback_visit_872273174695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182547;
     Object term182771;
     Object term182725;
     Object term183571;
     Object term183572;
     Object term183573;

    public ReferenceCollectingCallback_visit_872273174695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182547 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term182771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term182771, term182771.getClass(), "type", 0);
        term182725 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term182725, term182725.getClass(), "type", 108);
        setField(term182725, term182725.getClass(), "first", term182771);
        term183571 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term183571, term183571.getClass(), "referenceMap", null);
        setField(term183571, term183571.getClass(), "blockStack", null);
        setField(term183571, term183571.getClass(), "behavior", null);
        setField(term183571, term183571.getClass(), "compiler", null);
        setField(term183571, term183571.getClass(), "varFilter", null);
        term183572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term183572, term183572.getClass(), "number", 0.0);
        setIntField(term183572, term183572.getClass(), "type", 0);
        setField(term183572, term183572.getClass(), "next", null);
        setField(term183572, term183572.getClass(), "first", null);
        setField(term183572, term183572.getClass(), "last", null);
        setField(term183572, term183572.getClass(), "propListHead", null);
        setIntField(term183572, term183572.getClass(), "sourcePosition", 0);
        setField(term183572, term183572.getClass(), "jsType", null);
        setField(term183572, term183572.getClass(), "parent", null);
        term183573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term183573, term183573.getClass(), "functionName", null);
        setBooleanField(term183573, term183573.getClass(), "itsNeedsActivation", false);
        setIntField(term183573, term183573.getClass(), "itsFunctionType", 0);
        setBooleanField(term183573, term183573.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term183573, term183573.getClass(), "encodedSourceStart", 0);
        setIntField(term183573, term183573.getClass(), "encodedSourceEnd", 0);
        setField(term183573, term183573.getClass(), "sourceName", null);
        setIntField(term183573, term183573.getClass(), "baseLineno", 0);
        setIntField(term183573, term183573.getClass(), "endLineno", 0);
        setField(term183573, term183573.getClass(), "functions", null);
        setField(term183573, term183573.getClass(), "regexps", null);
        setField(term183573, term183573.getClass(), "itsVariables", null);
        setField(term183573, term183573.getClass(), "itsConst", null);
        setField(term183573, term183573.getClass(), "itsVariableNames", null);
        setIntField(term183573, term183573.getClass(), "varStart", 0);
        setField(term183573, term183573.getClass(), "compilerData", null);
        setIntField(term183573, term183573.getClass(), "type", 108);
        setField(term183573, term183573.getClass(), "next", null);
        setDoubleField(term183574, term183574.getClass(), "number", 0.0);
        setIntField(term183574, term183574.getClass(), "type", 0);
        setField(term183574, term183574.getClass(), "next", null);
        setField(term183574, term183574.getClass(), "first", null);
        setField(term183574, term183574.getClass(), "last", null);
        setField(term183574, term183574.getClass(), "propListHead", null);
        setIntField(term183574, term183574.getClass(), "sourcePosition", 0);
        setField(term183574, term183574.getClass(), "jsType", null);
        setField(term183574, term183574.getClass(), "parent", null);
        setField(term183573, term183573.getClass(), "first", term183574);
        setField(term183573, term183573.getClass(), "last", null);
        setField(term183573, term183573.getClass(), "propListHead", null);
        setIntField(term183573, term183573.getClass(), "sourcePosition", 0);
        setField(term183573, term183573.getClass(), "jsType", null);
        setField(term183573, term183573.getClass(), "parent", null);
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
        args[1] = term182771;
        args[2] = term182725;
        callMethod(klass, "visit", argTypes, term182547, args);
        assertTrue(recursiveEquals(term182547, term183571));
        assertTrue(recursiveEquals(term182771, term183573));
        assertTrue(recursiveEquals(term182725, null));
    }

};


