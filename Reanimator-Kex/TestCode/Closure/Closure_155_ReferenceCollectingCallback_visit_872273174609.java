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

public class ReferenceCollectingCallback_visit_872273174609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159871;
     Object term160095;
     Object term160049;
     Object term160486;
     Object term160487;
     Object term160488;

    public ReferenceCollectingCallback_visit_872273174609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159871 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term160095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term160095, term160095.getClass(), "type", 0);
        term160049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term160049, term160049.getClass(), "type", 98);
        setField(term160049, term160049.getClass(), "first", term160095);
        term160486 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term160486, term160486.getClass(), "referenceMap", null);
        setField(term160486, term160486.getClass(), "blockStack", null);
        setField(term160486, term160486.getClass(), "behavior", null);
        setField(term160486, term160486.getClass(), "compiler", null);
        setField(term160486, term160486.getClass(), "varFilter", null);
        term160487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term160487, term160487.getClass(), "number", 0.0);
        setIntField(term160487, term160487.getClass(), "type", 0);
        setField(term160487, term160487.getClass(), "next", null);
        setField(term160487, term160487.getClass(), "first", null);
        setField(term160487, term160487.getClass(), "last", null);
        setField(term160487, term160487.getClass(), "propListHead", null);
        setIntField(term160487, term160487.getClass(), "sourcePosition", 0);
        setField(term160487, term160487.getClass(), "jsType", null);
        setField(term160487, term160487.getClass(), "parent", null);
        term160488 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term160488, term160488.getClass(), "functionName", null);
        setBooleanField(term160488, term160488.getClass(), "itsNeedsActivation", false);
        setIntField(term160488, term160488.getClass(), "itsFunctionType", 0);
        setBooleanField(term160488, term160488.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160488, term160488.getClass(), "encodedSourceStart", 0);
        setIntField(term160488, term160488.getClass(), "encodedSourceEnd", 0);
        setField(term160488, term160488.getClass(), "sourceName", null);
        setIntField(term160488, term160488.getClass(), "baseLineno", 0);
        setIntField(term160488, term160488.getClass(), "endLineno", 0);
        setField(term160488, term160488.getClass(), "functions", null);
        setField(term160488, term160488.getClass(), "regexps", null);
        setField(term160488, term160488.getClass(), "itsVariables", null);
        setField(term160488, term160488.getClass(), "itsConst", null);
        setField(term160488, term160488.getClass(), "itsVariableNames", null);
        setIntField(term160488, term160488.getClass(), "varStart", 0);
        setField(term160488, term160488.getClass(), "compilerData", null);
        setIntField(term160488, term160488.getClass(), "type", 98);
        setField(term160488, term160488.getClass(), "next", null);
        setDoubleField(term160489, term160489.getClass(), "number", 0.0);
        setIntField(term160489, term160489.getClass(), "type", 0);
        setField(term160489, term160489.getClass(), "next", null);
        setField(term160489, term160489.getClass(), "first", null);
        setField(term160489, term160489.getClass(), "last", null);
        setField(term160489, term160489.getClass(), "propListHead", null);
        setIntField(term160489, term160489.getClass(), "sourcePosition", 0);
        setField(term160489, term160489.getClass(), "jsType", null);
        setField(term160489, term160489.getClass(), "parent", null);
        setField(term160488, term160488.getClass(), "first", term160489);
        setField(term160488, term160488.getClass(), "last", null);
        setField(term160488, term160488.getClass(), "propListHead", null);
        setIntField(term160488, term160488.getClass(), "sourcePosition", 0);
        setField(term160488, term160488.getClass(), "jsType", null);
        setField(term160488, term160488.getClass(), "parent", null);
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
        args[1] = term160095;
        args[2] = term160049;
        callMethod(klass, "visit", argTypes, term159871, args);
        assertTrue(recursiveEquals(term159871, term160486));
        assertTrue(recursiveEquals(term160095, term160488));
        assertTrue(recursiveEquals(term160049, null));
    }

};


