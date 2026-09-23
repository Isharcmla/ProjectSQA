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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13878;
     Object term13964;
     Object term20129;
     Object term20130;
     Object term20092;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term13964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term20129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term20129, term20129.getClass(), "currentTraversal", null);
        term20130 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term20130, term20130.getClass(), "functionName", null);
        setBooleanField(term20130, term20130.getClass(), "itsNeedsActivation", false);
        setIntField(term20130, term20130.getClass(), "itsFunctionType", 0);
        setBooleanField(term20130, term20130.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term20130, term20130.getClass(), "encodedSourceStart", 0);
        setIntField(term20130, term20130.getClass(), "encodedSourceEnd", 0);
        setField(term20130, term20130.getClass(), "sourceName", null);
        setIntField(term20130, term20130.getClass(), "baseLineno", 0);
        setIntField(term20130, term20130.getClass(), "endLineno", 0);
        setField(term20130, term20130.getClass(), "functions", null);
        setField(term20130, term20130.getClass(), "regexps", null);
        setField(term20130, term20130.getClass(), "itsVariables", null);
        setField(term20130, term20130.getClass(), "itsConst", null);
        setField(term20130, term20130.getClass(), "itsVariableNames", null);
        setIntField(term20130, term20130.getClass(), "varStart", 0);
        setField(term20130, term20130.getClass(), "compilerData", null);
        setIntField(term20130, term20130.getClass(), "type", 0);
        setField(term20130, term20130.getClass(), "next", null);
        setField(term20130, term20130.getClass(), "first", null);
        setField(term20130, term20130.getClass(), "last", null);
        setField(term20130, term20130.getClass(), "propListHead", null);
        setIntField(term20130, term20130.getClass(), "sourcePosition", 0);
        setField(term20130, term20130.getClass(), "jsType", null);
        setField(term20130, term20130.getClass(), "parent", null);
        term20092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term20092, term20092.getClass(), "functionName", null);
        setBooleanField(term20092, term20092.getClass(), "itsNeedsActivation", false);
        setIntField(term20092, term20092.getClass(), "itsFunctionType", 0);
        setBooleanField(term20092, term20092.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term20092, term20092.getClass(), "encodedSourceStart", 0);
        setIntField(term20092, term20092.getClass(), "encodedSourceEnd", 0);
        setField(term20092, term20092.getClass(), "sourceName", null);
        setIntField(term20092, term20092.getClass(), "baseLineno", 0);
        setIntField(term20092, term20092.getClass(), "endLineno", 0);
        setField(term20092, term20092.getClass(), "functions", null);
        setField(term20092, term20092.getClass(), "regexps", null);
        setField(term20092, term20092.getClass(), "itsVariables", null);
        setField(term20092, term20092.getClass(), "itsConst", null);
        setField(term20092, term20092.getClass(), "itsVariableNames", null);
        setIntField(term20092, term20092.getClass(), "varStart", 0);
        setField(term20092, term20092.getClass(), "compilerData", null);
        setIntField(term20092, term20092.getClass(), "type", 0);
        setField(term20092, term20092.getClass(), "next", null);
        setField(term20092, term20092.getClass(), "first", null);
        setField(term20092, term20092.getClass(), "last", null);
        setField(term20092, term20092.getClass(), "propListHead", null);
        setIntField(term20092, term20092.getClass(), "sourcePosition", 0);
        setField(term20092, term20092.getClass(), "jsType", null);
        setField(term20092, term20092.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13964;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term13878, args);
        assertTrue(recursiveEquals(term13878, term20129));
        assertTrue(recursiveEquals(term13964, term20130));
        assertTrue(recursiveEquals(retValue, term20092));
    }

};


