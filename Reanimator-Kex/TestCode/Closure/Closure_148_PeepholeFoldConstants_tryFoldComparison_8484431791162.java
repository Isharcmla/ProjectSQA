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

public class PeepholeFoldConstants_tryFoldComparison_8484431791162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274152;
     Object term274244;
     Object term274336;
     Object term274422;
     Object term274598;
     Object term274599;
     Object term274600;
     Object term274601;
     Object term274566;

    public PeepholeFoldConstants_tryFoldComparison_8484431791162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274152 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term274244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term274244, term274244.getClass(), "type", 16);
        term274336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term274336, term274336.getClass(), "type", 42);
        term274422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term274422, term274422.getClass(), "type", 16);
        term274598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term274598, term274598.getClass(), "currentTraversal", null);
        term274599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term274599, term274599.getClass(), "number", 0.0);
        setIntField(term274599, term274599.getClass(), "type", 42);
        setField(term274599, term274599.getClass(), "next", null);
        setField(term274599, term274599.getClass(), "first", null);
        setField(term274599, term274599.getClass(), "last", null);
        setField(term274599, term274599.getClass(), "propListHead", null);
        setIntField(term274599, term274599.getClass(), "sourcePosition", 0);
        setField(term274599, term274599.getClass(), "jsType", null);
        setField(term274599, term274599.getClass(), "parent", null);
        term274600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term274600, term274600.getClass(), "number", 0.0);
        setIntField(term274600, term274600.getClass(), "type", 16);
        setField(term274600, term274600.getClass(), "next", null);
        setField(term274600, term274600.getClass(), "first", null);
        setField(term274600, term274600.getClass(), "last", null);
        setField(term274600, term274600.getClass(), "propListHead", null);
        setIntField(term274600, term274600.getClass(), "sourcePosition", 0);
        setField(term274600, term274600.getClass(), "jsType", null);
        setField(term274600, term274600.getClass(), "parent", null);
        term274601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term274601, term274601.getClass(), "functionName", null);
        setBooleanField(term274601, term274601.getClass(), "itsNeedsActivation", false);
        setIntField(term274601, term274601.getClass(), "itsFunctionType", 0);
        setBooleanField(term274601, term274601.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term274601, term274601.getClass(), "encodedSourceStart", 0);
        setIntField(term274601, term274601.getClass(), "encodedSourceEnd", 0);
        setField(term274601, term274601.getClass(), "sourceName", null);
        setIntField(term274601, term274601.getClass(), "baseLineno", 0);
        setIntField(term274601, term274601.getClass(), "endLineno", 0);
        setField(term274601, term274601.getClass(), "functions", null);
        setField(term274601, term274601.getClass(), "regexps", null);
        setField(term274601, term274601.getClass(), "itsVariables", null);
        setField(term274601, term274601.getClass(), "itsConst", null);
        setField(term274601, term274601.getClass(), "itsVariableNames", null);
        setIntField(term274601, term274601.getClass(), "varStart", 0);
        setField(term274601, term274601.getClass(), "compilerData", null);
        setIntField(term274601, term274601.getClass(), "type", 16);
        setField(term274601, term274601.getClass(), "next", null);
        setField(term274601, term274601.getClass(), "first", null);
        setField(term274601, term274601.getClass(), "last", null);
        setField(term274601, term274601.getClass(), "propListHead", null);
        setIntField(term274601, term274601.getClass(), "sourcePosition", 0);
        setField(term274601, term274601.getClass(), "jsType", null);
        setField(term274601, term274601.getClass(), "parent", null);
        term274566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term274566, term274566.getClass(), "number", 0.0);
        setIntField(term274566, term274566.getClass(), "type", 16);
        setField(term274566, term274566.getClass(), "next", null);
        setField(term274566, term274566.getClass(), "first", null);
        setField(term274566, term274566.getClass(), "last", null);
        setField(term274566, term274566.getClass(), "propListHead", null);
        setIntField(term274566, term274566.getClass(), "sourcePosition", 0);
        setField(term274566, term274566.getClass(), "jsType", null);
        setField(term274566, term274566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term274244;
        args[1] = term274336;
        args[2] = term274422;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term274152, args);
        assertTrue(recursiveEquals(term274152, term274598));
        assertTrue(recursiveEquals(term274244, term274599));
        assertTrue(recursiveEquals(term274336, term274600));
        assertTrue(recursiveEquals(term274422, term274601));
        assertTrue(recursiveEquals(retValue, term274566));
    }

};


