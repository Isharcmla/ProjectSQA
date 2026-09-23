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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355004;
     Object term355090;
     Object term355246;
     Object term355332;
     Object term355498;
     Object term355499;
     Object term355501;
     Object term355502;
     Object term355427;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term355090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355090, term355090.getClass(), "parent", term355160);
        setIntField(term355090, term355090.getClass(), "type", 0);
        term355246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term355246, term355246.getClass(), "type", 0);
        term355332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term355332, term355332.getClass(), "type", 44);
        term355498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term355498, term355498.getClass(), "currentTraversal", null);
        term355499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355499, term355499.getClass(), "functionName", null);
        setBooleanField(term355499, term355499.getClass(), "itsNeedsActivation", false);
        setIntField(term355499, term355499.getClass(), "itsFunctionType", 0);
        setBooleanField(term355499, term355499.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355499, term355499.getClass(), "encodedSourceStart", 0);
        setIntField(term355499, term355499.getClass(), "encodedSourceEnd", 0);
        setField(term355499, term355499.getClass(), "sourceName", null);
        setIntField(term355499, term355499.getClass(), "baseLineno", 0);
        setIntField(term355499, term355499.getClass(), "endLineno", 0);
        setField(term355499, term355499.getClass(), "functions", null);
        setField(term355499, term355499.getClass(), "regexps", null);
        setField(term355499, term355499.getClass(), "itsVariables", null);
        setField(term355499, term355499.getClass(), "itsConst", null);
        setField(term355499, term355499.getClass(), "itsVariableNames", null);
        setIntField(term355499, term355499.getClass(), "varStart", 0);
        setField(term355499, term355499.getClass(), "compilerData", null);
        setIntField(term355499, term355499.getClass(), "type", 0);
        setField(term355499, term355499.getClass(), "next", null);
        setField(term355499, term355499.getClass(), "first", null);
        setField(term355499, term355499.getClass(), "last", null);
        setField(term355499, term355499.getClass(), "propListHead", null);
        setIntField(term355499, term355499.getClass(), "sourcePosition", 0);
        setField(term355499, term355499.getClass(), "jsType", null);
        setIntField(term355500, term355500.getClass(), "type", 0);
        setField(term355500, term355500.getClass(), "next", null);
        setField(term355500, term355500.getClass(), "first", null);
        setField(term355500, term355500.getClass(), "last", null);
        setField(term355500, term355500.getClass(), "propListHead", null);
        setIntField(term355500, term355500.getClass(), "sourcePosition", 0);
        setField(term355500, term355500.getClass(), "jsType", null);
        setField(term355500, term355500.getClass(), "parent", null);
        setField(term355499, term355499.getClass(), "parent", term355500);
        term355501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term355501, term355501.getClass(), "functionName", null);
        setBooleanField(term355501, term355501.getClass(), "itsNeedsActivation", false);
        setIntField(term355501, term355501.getClass(), "itsFunctionType", 0);
        setBooleanField(term355501, term355501.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355501, term355501.getClass(), "encodedSourceStart", 0);
        setIntField(term355501, term355501.getClass(), "encodedSourceEnd", 0);
        setField(term355501, term355501.getClass(), "sourceName", null);
        setIntField(term355501, term355501.getClass(), "baseLineno", 0);
        setIntField(term355501, term355501.getClass(), "endLineno", 0);
        setField(term355501, term355501.getClass(), "functions", null);
        setField(term355501, term355501.getClass(), "regexps", null);
        setField(term355501, term355501.getClass(), "itsVariables", null);
        setField(term355501, term355501.getClass(), "itsConst", null);
        setField(term355501, term355501.getClass(), "itsVariableNames", null);
        setIntField(term355501, term355501.getClass(), "varStart", 0);
        setField(term355501, term355501.getClass(), "compilerData", null);
        setIntField(term355501, term355501.getClass(), "type", 0);
        setField(term355501, term355501.getClass(), "next", null);
        setField(term355501, term355501.getClass(), "first", null);
        setField(term355501, term355501.getClass(), "last", null);
        setField(term355501, term355501.getClass(), "propListHead", null);
        setIntField(term355501, term355501.getClass(), "sourcePosition", 0);
        setField(term355501, term355501.getClass(), "jsType", null);
        setField(term355501, term355501.getClass(), "parent", null);
        term355502 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term355502, term355502.getClass(), "functionName", null);
        setBooleanField(term355502, term355502.getClass(), "itsNeedsActivation", false);
        setIntField(term355502, term355502.getClass(), "itsFunctionType", 0);
        setBooleanField(term355502, term355502.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355502, term355502.getClass(), "encodedSourceStart", 0);
        setIntField(term355502, term355502.getClass(), "encodedSourceEnd", 0);
        setField(term355502, term355502.getClass(), "sourceName", null);
        setIntField(term355502, term355502.getClass(), "baseLineno", 0);
        setIntField(term355502, term355502.getClass(), "endLineno", 0);
        setField(term355502, term355502.getClass(), "functions", null);
        setField(term355502, term355502.getClass(), "regexps", null);
        setField(term355502, term355502.getClass(), "itsVariables", null);
        setField(term355502, term355502.getClass(), "itsConst", null);
        setField(term355502, term355502.getClass(), "itsVariableNames", null);
        setIntField(term355502, term355502.getClass(), "varStart", 0);
        setField(term355502, term355502.getClass(), "compilerData", null);
        setIntField(term355502, term355502.getClass(), "type", 44);
        setField(term355502, term355502.getClass(), "next", null);
        setField(term355502, term355502.getClass(), "first", null);
        setField(term355502, term355502.getClass(), "last", null);
        setField(term355502, term355502.getClass(), "propListHead", null);
        setIntField(term355502, term355502.getClass(), "sourcePosition", 0);
        setField(term355502, term355502.getClass(), "jsType", null);
        setField(term355502, term355502.getClass(), "parent", null);
        term355427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355427, term355427.getClass(), "functionName", null);
        setBooleanField(term355427, term355427.getClass(), "itsNeedsActivation", false);
        setIntField(term355427, term355427.getClass(), "itsFunctionType", 0);
        setBooleanField(term355427, term355427.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355427, term355427.getClass(), "encodedSourceStart", 0);
        setIntField(term355427, term355427.getClass(), "encodedSourceEnd", 0);
        setField(term355427, term355427.getClass(), "sourceName", null);
        setIntField(term355427, term355427.getClass(), "baseLineno", 0);
        setIntField(term355427, term355427.getClass(), "endLineno", 0);
        setField(term355427, term355427.getClass(), "functions", null);
        setField(term355427, term355427.getClass(), "regexps", null);
        setField(term355427, term355427.getClass(), "itsVariables", null);
        setField(term355427, term355427.getClass(), "itsConst", null);
        setField(term355427, term355427.getClass(), "itsVariableNames", null);
        setIntField(term355427, term355427.getClass(), "varStart", 0);
        setField(term355427, term355427.getClass(), "compilerData", null);
        setIntField(term355427, term355427.getClass(), "type", 0);
        setField(term355427, term355427.getClass(), "next", null);
        setField(term355427, term355427.getClass(), "first", null);
        setField(term355427, term355427.getClass(), "last", null);
        setField(term355427, term355427.getClass(), "propListHead", null);
        setIntField(term355427, term355427.getClass(), "sourcePosition", 0);
        setField(term355427, term355427.getClass(), "jsType", null);
        setIntField(term355438, term355438.getClass(), "type", 0);
        setField(term355438, term355438.getClass(), "next", null);
        setField(term355438, term355438.getClass(), "first", null);
        setField(term355438, term355438.getClass(), "last", null);
        setField(term355438, term355438.getClass(), "propListHead", null);
        setIntField(term355438, term355438.getClass(), "sourcePosition", 0);
        setField(term355438, term355438.getClass(), "jsType", null);
        setField(term355438, term355438.getClass(), "parent", null);
        setField(term355427, term355427.getClass(), "parent", term355438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term355090;
        args[1] = term355246;
        args[2] = term355332;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term355004, args);
        assertTrue(recursiveEquals(term355004, term355498));
        assertTrue(recursiveEquals(term355090, term355499));
        assertTrue(recursiveEquals(term355246, term355501));
        assertTrue(recursiveEquals(term355332, term355502));
        assertTrue(recursiveEquals(retValue, term355427));
    }

};


