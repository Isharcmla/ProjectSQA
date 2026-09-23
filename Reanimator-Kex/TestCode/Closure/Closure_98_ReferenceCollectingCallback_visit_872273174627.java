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

public class ReferenceCollectingCallback_visit_872273174627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170621;
     Object term170845;
     Object term170799;
     Object term171363;
     Object term171364;
     Object term171365;

    public ReferenceCollectingCallback_visit_872273174627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170621 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term170845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term170845, term170845.getClass(), "type", 0);
        term170799 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term170799, term170799.getClass(), "type", 98);
        setField(term170799, term170799.getClass(), "first", term170845);
        term171363 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term171363, term171363.getClass(), "referenceMap", null);
        setField(term171363, term171363.getClass(), "blockStack", null);
        setField(term171363, term171363.getClass(), "behavior", null);
        setField(term171363, term171363.getClass(), "compiler", null);
        setField(term171363, term171363.getClass(), "varFilter", null);
        term171364 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term171364, term171364.getClass(), "number", 0.0);
        setIntField(term171364, term171364.getClass(), "type", 0);
        setField(term171364, term171364.getClass(), "next", null);
        setField(term171364, term171364.getClass(), "first", null);
        setField(term171364, term171364.getClass(), "last", null);
        setField(term171364, term171364.getClass(), "propListHead", null);
        setIntField(term171364, term171364.getClass(), "sourcePosition", 0);
        setField(term171364, term171364.getClass(), "jsType", null);
        setField(term171364, term171364.getClass(), "parent", null);
        term171365 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term171365, term171365.getClass(), "functionName", null);
        setBooleanField(term171365, term171365.getClass(), "itsNeedsActivation", false);
        setIntField(term171365, term171365.getClass(), "itsFunctionType", 0);
        setBooleanField(term171365, term171365.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171365, term171365.getClass(), "encodedSourceStart", 0);
        setIntField(term171365, term171365.getClass(), "encodedSourceEnd", 0);
        setField(term171365, term171365.getClass(), "sourceName", null);
        setIntField(term171365, term171365.getClass(), "baseLineno", 0);
        setIntField(term171365, term171365.getClass(), "endLineno", 0);
        setField(term171365, term171365.getClass(), "functions", null);
        setField(term171365, term171365.getClass(), "regexps", null);
        setField(term171365, term171365.getClass(), "itsVariables", null);
        setField(term171365, term171365.getClass(), "itsConst", null);
        setField(term171365, term171365.getClass(), "itsVariableNames", null);
        setIntField(term171365, term171365.getClass(), "varStart", 0);
        setField(term171365, term171365.getClass(), "compilerData", null);
        setIntField(term171365, term171365.getClass(), "type", 98);
        setField(term171365, term171365.getClass(), "next", null);
        setDoubleField(term171366, term171366.getClass(), "number", 0.0);
        setIntField(term171366, term171366.getClass(), "type", 0);
        setField(term171366, term171366.getClass(), "next", null);
        setField(term171366, term171366.getClass(), "first", null);
        setField(term171366, term171366.getClass(), "last", null);
        setField(term171366, term171366.getClass(), "propListHead", null);
        setIntField(term171366, term171366.getClass(), "sourcePosition", 0);
        setField(term171366, term171366.getClass(), "jsType", null);
        setField(term171366, term171366.getClass(), "parent", null);
        setField(term171365, term171365.getClass(), "first", term171366);
        setField(term171365, term171365.getClass(), "last", null);
        setField(term171365, term171365.getClass(), "propListHead", null);
        setIntField(term171365, term171365.getClass(), "sourcePosition", 0);
        setField(term171365, term171365.getClass(), "jsType", null);
        setField(term171365, term171365.getClass(), "parent", null);
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
        args[1] = term170845;
        args[2] = term170799;
        callMethod(klass, "visit", argTypes, term170621, args);
        assertTrue(recursiveEquals(term170621, term171363));
        assertTrue(recursiveEquals(term170845, term171365));
        assertTrue(recursiveEquals(term170799, null));
    }

};


