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

public class PeepholeFoldConstants_tryFoldComparison_8484431791261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300942;
     Object term301034;
     Object term301126;
     Object term301212;
     Object term301643;
     Object term301644;
     Object term301645;
     Object term301646;
     Object term301616;

    public PeepholeFoldConstants_tryFoldComparison_8484431791261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300942 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term301034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term301034, term301034.getClass(), "type", 16);
        term301126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term301126, term301126.getClass(), "type", 16);
        term301212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term301643 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term301643, term301643.getClass(), "currentTraversal", null);
        term301644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term301644, term301644.getClass(), "number", 0.0);
        setIntField(term301644, term301644.getClass(), "type", 16);
        setField(term301644, term301644.getClass(), "next", null);
        setField(term301644, term301644.getClass(), "first", null);
        setField(term301644, term301644.getClass(), "last", null);
        setField(term301644, term301644.getClass(), "propListHead", null);
        setIntField(term301644, term301644.getClass(), "sourcePosition", 0);
        setField(term301644, term301644.getClass(), "jsType", null);
        setField(term301644, term301644.getClass(), "parent", null);
        term301645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term301645, term301645.getClass(), "number", 0.0);
        setIntField(term301645, term301645.getClass(), "type", 16);
        setField(term301645, term301645.getClass(), "next", null);
        setField(term301645, term301645.getClass(), "first", null);
        setField(term301645, term301645.getClass(), "last", null);
        setField(term301645, term301645.getClass(), "propListHead", null);
        setIntField(term301645, term301645.getClass(), "sourcePosition", 0);
        setField(term301645, term301645.getClass(), "jsType", null);
        setField(term301645, term301645.getClass(), "parent", null);
        term301646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term301646, term301646.getClass(), "functionName", null);
        setBooleanField(term301646, term301646.getClass(), "itsNeedsActivation", false);
        setIntField(term301646, term301646.getClass(), "itsFunctionType", 0);
        setBooleanField(term301646, term301646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term301646, term301646.getClass(), "encodedSourceStart", 0);
        setIntField(term301646, term301646.getClass(), "encodedSourceEnd", 0);
        setField(term301646, term301646.getClass(), "sourceName", null);
        setIntField(term301646, term301646.getClass(), "baseLineno", 0);
        setIntField(term301646, term301646.getClass(), "endLineno", 0);
        setField(term301646, term301646.getClass(), "functions", null);
        setField(term301646, term301646.getClass(), "regexps", null);
        setField(term301646, term301646.getClass(), "itsVariables", null);
        setField(term301646, term301646.getClass(), "itsConst", null);
        setField(term301646, term301646.getClass(), "itsVariableNames", null);
        setIntField(term301646, term301646.getClass(), "varStart", 0);
        setField(term301646, term301646.getClass(), "compilerData", null);
        setIntField(term301646, term301646.getClass(), "type", 0);
        setField(term301646, term301646.getClass(), "next", null);
        setField(term301646, term301646.getClass(), "first", null);
        setField(term301646, term301646.getClass(), "last", null);
        setField(term301646, term301646.getClass(), "propListHead", null);
        setIntField(term301646, term301646.getClass(), "sourcePosition", 0);
        setField(term301646, term301646.getClass(), "jsType", null);
        setField(term301646, term301646.getClass(), "parent", null);
        term301616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term301616, term301616.getClass(), "number", 0.0);
        setIntField(term301616, term301616.getClass(), "type", 16);
        setField(term301616, term301616.getClass(), "next", null);
        setField(term301616, term301616.getClass(), "first", null);
        setField(term301616, term301616.getClass(), "last", null);
        setField(term301616, term301616.getClass(), "propListHead", null);
        setIntField(term301616, term301616.getClass(), "sourcePosition", 0);
        setField(term301616, term301616.getClass(), "jsType", null);
        setField(term301616, term301616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term301034;
        args[1] = term301126;
        args[2] = term301212;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term300942, args);
        assertTrue(recursiveEquals(term300942, term301643));
        assertTrue(recursiveEquals(term301034, term301644));
        assertTrue(recursiveEquals(term301126, term301645));
        assertTrue(recursiveEquals(term301212, term301646));
        assertTrue(recursiveEquals(retValue, term301616));
    }

};


