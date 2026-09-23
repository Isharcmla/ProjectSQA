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

public class ReferenceCollectingCallback_visit_872273174108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21632;
     Object term21724;
     Object term21810;
     Object term22454;
     Object term22455;
     Object term22456;

    public ReferenceCollectingCallback_visit_872273174108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21632 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term21724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term21724, term21724.getClass(), "type", -39);
        term21810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term22454 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term22454, term22454.getClass(), "referenceMap", null);
        setField(term22454, term22454.getClass(), "blockStack", null);
        setField(term22454, term22454.getClass(), "behavior", null);
        setField(term22454, term22454.getClass(), "compiler", null);
        setField(term22454, term22454.getClass(), "varFilter", null);
        term22455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22455, term22455.getClass(), "str", null);
        setIntField(term22455, term22455.getClass(), "type", -39);
        setField(term22455, term22455.getClass(), "next", null);
        setField(term22455, term22455.getClass(), "first", null);
        setField(term22455, term22455.getClass(), "last", null);
        setField(term22455, term22455.getClass(), "propListHead", null);
        setIntField(term22455, term22455.getClass(), "sourcePosition", 0);
        setField(term22455, term22455.getClass(), "jsType", null);
        setField(term22455, term22455.getClass(), "parent", null);
        term22456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term22456, term22456.getClass(), "functionName", null);
        setBooleanField(term22456, term22456.getClass(), "itsNeedsActivation", false);
        setIntField(term22456, term22456.getClass(), "itsFunctionType", 0);
        setBooleanField(term22456, term22456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term22456, term22456.getClass(), "encodedSourceStart", 0);
        setIntField(term22456, term22456.getClass(), "encodedSourceEnd", 0);
        setField(term22456, term22456.getClass(), "sourceName", null);
        setIntField(term22456, term22456.getClass(), "baseLineno", 0);
        setIntField(term22456, term22456.getClass(), "endLineno", 0);
        setField(term22456, term22456.getClass(), "functions", null);
        setField(term22456, term22456.getClass(), "regexps", null);
        setField(term22456, term22456.getClass(), "itsVariables", null);
        setField(term22456, term22456.getClass(), "itsConst", null);
        setField(term22456, term22456.getClass(), "itsVariableNames", null);
        setIntField(term22456, term22456.getClass(), "varStart", 0);
        setField(term22456, term22456.getClass(), "compilerData", null);
        setIntField(term22456, term22456.getClass(), "type", 0);
        setField(term22456, term22456.getClass(), "next", null);
        setField(term22456, term22456.getClass(), "first", null);
        setField(term22456, term22456.getClass(), "last", null);
        setField(term22456, term22456.getClass(), "propListHead", null);
        setIntField(term22456, term22456.getClass(), "sourcePosition", 0);
        setField(term22456, term22456.getClass(), "jsType", null);
        setField(term22456, term22456.getClass(), "parent", null);
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
        args[1] = term21724;
        args[2] = term21810;
        callMethod(klass, "visit", argTypes, term21632, args);
        assertTrue(recursiveEquals(term21632, term22454));
        assertTrue(recursiveEquals(term21724, term22456));
        assertTrue(recursiveEquals(term21810, null));
    }

};


