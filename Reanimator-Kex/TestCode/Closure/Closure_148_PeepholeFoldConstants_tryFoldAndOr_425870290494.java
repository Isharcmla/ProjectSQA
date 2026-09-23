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

public class PeepholeFoldConstants_tryFoldAndOr_425870290494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103051;
     Object term103143;
     Object term103229;
     Object term103321;
     Object term103424;
     Object term103425;
     Object term103426;
     Object term103427;
     Object term103376;

    public PeepholeFoldConstants_tryFoldAndOr_425870290494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103051 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term103143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term103143, term103143.getClass(), "parent", null);
        setIntField(term103143, term103143.getClass(), "type", 0);
        term103229 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term103229, term103229.getClass(), "type", 0);
        term103321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term103424 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term103424, term103424.getClass(), "currentTraversal", null);
        term103425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term103425, term103425.getClass(), "number", 0.0);
        setIntField(term103425, term103425.getClass(), "type", 0);
        setField(term103425, term103425.getClass(), "next", null);
        setField(term103425, term103425.getClass(), "first", null);
        setField(term103425, term103425.getClass(), "last", null);
        setField(term103425, term103425.getClass(), "propListHead", null);
        setIntField(term103425, term103425.getClass(), "sourcePosition", 0);
        setField(term103425, term103425.getClass(), "jsType", null);
        setField(term103425, term103425.getClass(), "parent", null);
        term103426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term103426, term103426.getClass(), "functionName", null);
        setBooleanField(term103426, term103426.getClass(), "itsNeedsActivation", false);
        setIntField(term103426, term103426.getClass(), "itsFunctionType", 0);
        setBooleanField(term103426, term103426.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term103426, term103426.getClass(), "encodedSourceStart", 0);
        setIntField(term103426, term103426.getClass(), "encodedSourceEnd", 0);
        setField(term103426, term103426.getClass(), "sourceName", null);
        setIntField(term103426, term103426.getClass(), "baseLineno", 0);
        setIntField(term103426, term103426.getClass(), "endLineno", 0);
        setField(term103426, term103426.getClass(), "functions", null);
        setField(term103426, term103426.getClass(), "regexps", null);
        setField(term103426, term103426.getClass(), "itsVariables", null);
        setField(term103426, term103426.getClass(), "itsConst", null);
        setField(term103426, term103426.getClass(), "itsVariableNames", null);
        setIntField(term103426, term103426.getClass(), "varStart", 0);
        setField(term103426, term103426.getClass(), "compilerData", null);
        setIntField(term103426, term103426.getClass(), "type", 0);
        setField(term103426, term103426.getClass(), "next", null);
        setField(term103426, term103426.getClass(), "first", null);
        setField(term103426, term103426.getClass(), "last", null);
        setField(term103426, term103426.getClass(), "propListHead", null);
        setIntField(term103426, term103426.getClass(), "sourcePosition", 0);
        setField(term103426, term103426.getClass(), "jsType", null);
        setField(term103426, term103426.getClass(), "parent", null);
        term103427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term103427, term103427.getClass(), "number", 0.0);
        setIntField(term103427, term103427.getClass(), "type", 0);
        setField(term103427, term103427.getClass(), "next", null);
        setField(term103427, term103427.getClass(), "first", null);
        setField(term103427, term103427.getClass(), "last", null);
        setField(term103427, term103427.getClass(), "propListHead", null);
        setIntField(term103427, term103427.getClass(), "sourcePosition", 0);
        setField(term103427, term103427.getClass(), "jsType", null);
        setField(term103427, term103427.getClass(), "parent", null);
        term103376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term103376, term103376.getClass(), "number", 0.0);
        setIntField(term103376, term103376.getClass(), "type", 0);
        setField(term103376, term103376.getClass(), "next", null);
        setField(term103376, term103376.getClass(), "first", null);
        setField(term103376, term103376.getClass(), "last", null);
        setField(term103376, term103376.getClass(), "propListHead", null);
        setIntField(term103376, term103376.getClass(), "sourcePosition", 0);
        setField(term103376, term103376.getClass(), "jsType", null);
        setField(term103376, term103376.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term103143;
        args[1] = term103229;
        args[2] = term103321;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term103051, args);
        assertTrue(recursiveEquals(term103051, term103424));
        assertTrue(recursiveEquals(term103143, term103425));
        assertTrue(recursiveEquals(term103229, term103426));
        assertTrue(recursiveEquals(term103321, term103427));
        assertTrue(recursiveEquals(retValue, term103376));
    }

};


