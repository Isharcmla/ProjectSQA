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

public class PeepholeFoldConstants_tryFoldComparison_8484431792173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592355;
     Object term592447;
     Object term592539;
     Object term592625;
     Object term593128;
     Object term593129;
     Object term593130;
     Object term593131;
     Object term593094;

    public PeepholeFoldConstants_tryFoldComparison_8484431792173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592355 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term592447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term592447, term592447.getClass(), "type", 14);
        term592539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term592539, term592539.getClass(), "type", 42);
        term592625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term592625, term592625.getClass(), "type", 14);
        term593128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term593128, term593128.getClass(), "currentTraversal", null);
        term593129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term593129, term593129.getClass(), "number", 0.0);
        setIntField(term593129, term593129.getClass(), "type", 42);
        setField(term593129, term593129.getClass(), "next", null);
        setField(term593129, term593129.getClass(), "first", null);
        setField(term593129, term593129.getClass(), "last", null);
        setField(term593129, term593129.getClass(), "propListHead", null);
        setIntField(term593129, term593129.getClass(), "sourcePosition", 0);
        setField(term593129, term593129.getClass(), "jsType", null);
        setField(term593129, term593129.getClass(), "parent", null);
        term593130 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term593130, term593130.getClass(), "number", 0.0);
        setIntField(term593130, term593130.getClass(), "type", 14);
        setField(term593130, term593130.getClass(), "next", null);
        setField(term593130, term593130.getClass(), "first", null);
        setField(term593130, term593130.getClass(), "last", null);
        setField(term593130, term593130.getClass(), "propListHead", null);
        setIntField(term593130, term593130.getClass(), "sourcePosition", 0);
        setField(term593130, term593130.getClass(), "jsType", null);
        setField(term593130, term593130.getClass(), "parent", null);
        term593131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term593131, term593131.getClass(), "functionName", null);
        setBooleanField(term593131, term593131.getClass(), "itsNeedsActivation", false);
        setIntField(term593131, term593131.getClass(), "itsFunctionType", 0);
        setBooleanField(term593131, term593131.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term593131, term593131.getClass(), "encodedSourceStart", 0);
        setIntField(term593131, term593131.getClass(), "encodedSourceEnd", 0);
        setField(term593131, term593131.getClass(), "sourceName", null);
        setIntField(term593131, term593131.getClass(), "baseLineno", 0);
        setIntField(term593131, term593131.getClass(), "endLineno", 0);
        setField(term593131, term593131.getClass(), "functions", null);
        setField(term593131, term593131.getClass(), "regexps", null);
        setField(term593131, term593131.getClass(), "itsVariables", null);
        setField(term593131, term593131.getClass(), "itsConst", null);
        setField(term593131, term593131.getClass(), "itsVariableNames", null);
        setIntField(term593131, term593131.getClass(), "varStart", 0);
        setField(term593131, term593131.getClass(), "compilerData", null);
        setIntField(term593131, term593131.getClass(), "type", 14);
        setField(term593131, term593131.getClass(), "next", null);
        setField(term593131, term593131.getClass(), "first", null);
        setField(term593131, term593131.getClass(), "last", null);
        setField(term593131, term593131.getClass(), "propListHead", null);
        setIntField(term593131, term593131.getClass(), "sourcePosition", 0);
        setField(term593131, term593131.getClass(), "jsType", null);
        setField(term593131, term593131.getClass(), "parent", null);
        term593094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term593094, term593094.getClass(), "number", 0.0);
        setIntField(term593094, term593094.getClass(), "type", 14);
        setField(term593094, term593094.getClass(), "next", null);
        setField(term593094, term593094.getClass(), "first", null);
        setField(term593094, term593094.getClass(), "last", null);
        setField(term593094, term593094.getClass(), "propListHead", null);
        setIntField(term593094, term593094.getClass(), "sourcePosition", 0);
        setField(term593094, term593094.getClass(), "jsType", null);
        setField(term593094, term593094.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term592447;
        args[1] = term592539;
        args[2] = term592625;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term592355, args);
        assertTrue(recursiveEquals(term592355, term593128));
        assertTrue(recursiveEquals(term592447, term593129));
        assertTrue(recursiveEquals(term592539, term593130));
        assertTrue(recursiveEquals(term592625, term593131));
        assertTrue(recursiveEquals(retValue, term593094));
    }

};


