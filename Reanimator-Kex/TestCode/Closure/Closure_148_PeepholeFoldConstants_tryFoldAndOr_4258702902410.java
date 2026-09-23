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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671068;
     Object term671154;
     Object term671332;
     Object term671424;
     Object term671630;
     Object term671631;
     Object term671633;
     Object term671634;
     Object term671535;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term671154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671240 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term671240, term671240.getClass(), "type", 114);
        setField(term671154, term671154.getClass(), "parent", term671240);
        setIntField(term671154, term671154.getClass(), "type", 0);
        term671332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term671332, term671332.getClass(), "type", 61);
        term671424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term671424, term671424.getClass(), "type", 63);
        term671630 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term671630, term671630.getClass(), "currentTraversal", null);
        term671631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671631, term671631.getClass(), "functionName", null);
        setBooleanField(term671631, term671631.getClass(), "itsNeedsActivation", false);
        setIntField(term671631, term671631.getClass(), "itsFunctionType", 0);
        setBooleanField(term671631, term671631.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671631, term671631.getClass(), "encodedSourceStart", 0);
        setIntField(term671631, term671631.getClass(), "encodedSourceEnd", 0);
        setField(term671631, term671631.getClass(), "sourceName", null);
        setIntField(term671631, term671631.getClass(), "baseLineno", 0);
        setIntField(term671631, term671631.getClass(), "endLineno", 0);
        setField(term671631, term671631.getClass(), "functions", null);
        setField(term671631, term671631.getClass(), "regexps", null);
        setField(term671631, term671631.getClass(), "itsVariables", null);
        setField(term671631, term671631.getClass(), "itsConst", null);
        setField(term671631, term671631.getClass(), "itsVariableNames", null);
        setIntField(term671631, term671631.getClass(), "varStart", 0);
        setField(term671631, term671631.getClass(), "compilerData", null);
        setIntField(term671631, term671631.getClass(), "type", 0);
        setField(term671631, term671631.getClass(), "next", null);
        setField(term671631, term671631.getClass(), "first", null);
        setField(term671631, term671631.getClass(), "last", null);
        setField(term671631, term671631.getClass(), "propListHead", null);
        setIntField(term671631, term671631.getClass(), "sourcePosition", 0);
        setField(term671631, term671631.getClass(), "jsType", null);
        setField(term671632, term671632.getClass(), "functionName", null);
        setBooleanField(term671632, term671632.getClass(), "itsNeedsActivation", false);
        setIntField(term671632, term671632.getClass(), "itsFunctionType", 0);
        setBooleanField(term671632, term671632.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671632, term671632.getClass(), "encodedSourceStart", 0);
        setIntField(term671632, term671632.getClass(), "encodedSourceEnd", 0);
        setField(term671632, term671632.getClass(), "sourceName", null);
        setIntField(term671632, term671632.getClass(), "baseLineno", 0);
        setIntField(term671632, term671632.getClass(), "endLineno", 0);
        setField(term671632, term671632.getClass(), "functions", null);
        setField(term671632, term671632.getClass(), "regexps", null);
        setField(term671632, term671632.getClass(), "itsVariables", null);
        setField(term671632, term671632.getClass(), "itsConst", null);
        setField(term671632, term671632.getClass(), "itsVariableNames", null);
        setIntField(term671632, term671632.getClass(), "varStart", 0);
        setField(term671632, term671632.getClass(), "compilerData", null);
        setIntField(term671632, term671632.getClass(), "type", 114);
        setField(term671632, term671632.getClass(), "next", null);
        setField(term671632, term671632.getClass(), "first", null);
        setField(term671632, term671632.getClass(), "last", null);
        setField(term671632, term671632.getClass(), "propListHead", null);
        setIntField(term671632, term671632.getClass(), "sourcePosition", 0);
        setField(term671632, term671632.getClass(), "jsType", null);
        setField(term671632, term671632.getClass(), "parent", null);
        setField(term671631, term671631.getClass(), "parent", term671632);
        term671633 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term671633, term671633.getClass(), "number", 0.0);
        setIntField(term671633, term671633.getClass(), "type", 61);
        setField(term671633, term671633.getClass(), "next", null);
        setField(term671633, term671633.getClass(), "first", null);
        setField(term671633, term671633.getClass(), "last", null);
        setField(term671633, term671633.getClass(), "propListHead", null);
        setIntField(term671633, term671633.getClass(), "sourcePosition", 0);
        setField(term671633, term671633.getClass(), "jsType", null);
        setField(term671633, term671633.getClass(), "parent", null);
        term671634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term671634, term671634.getClass(), "number", 0.0);
        setIntField(term671634, term671634.getClass(), "type", 63);
        setField(term671634, term671634.getClass(), "next", null);
        setField(term671634, term671634.getClass(), "first", null);
        setField(term671634, term671634.getClass(), "last", null);
        setField(term671634, term671634.getClass(), "propListHead", null);
        setIntField(term671634, term671634.getClass(), "sourcePosition", 0);
        setField(term671634, term671634.getClass(), "jsType", null);
        setField(term671634, term671634.getClass(), "parent", null);
        term671535 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671535, term671535.getClass(), "functionName", null);
        setBooleanField(term671535, term671535.getClass(), "itsNeedsActivation", false);
        setIntField(term671535, term671535.getClass(), "itsFunctionType", 0);
        setBooleanField(term671535, term671535.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671535, term671535.getClass(), "encodedSourceStart", 0);
        setIntField(term671535, term671535.getClass(), "encodedSourceEnd", 0);
        setField(term671535, term671535.getClass(), "sourceName", null);
        setIntField(term671535, term671535.getClass(), "baseLineno", 0);
        setIntField(term671535, term671535.getClass(), "endLineno", 0);
        setField(term671535, term671535.getClass(), "functions", null);
        setField(term671535, term671535.getClass(), "regexps", null);
        setField(term671535, term671535.getClass(), "itsVariables", null);
        setField(term671535, term671535.getClass(), "itsConst", null);
        setField(term671535, term671535.getClass(), "itsVariableNames", null);
        setIntField(term671535, term671535.getClass(), "varStart", 0);
        setField(term671535, term671535.getClass(), "compilerData", null);
        setIntField(term671535, term671535.getClass(), "type", 0);
        setField(term671535, term671535.getClass(), "next", null);
        setField(term671535, term671535.getClass(), "first", null);
        setField(term671535, term671535.getClass(), "last", null);
        setField(term671535, term671535.getClass(), "propListHead", null);
        setIntField(term671535, term671535.getClass(), "sourcePosition", 0);
        setField(term671535, term671535.getClass(), "jsType", null);
        setField(term671546, term671546.getClass(), "functionName", null);
        setBooleanField(term671546, term671546.getClass(), "itsNeedsActivation", false);
        setIntField(term671546, term671546.getClass(), "itsFunctionType", 0);
        setBooleanField(term671546, term671546.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671546, term671546.getClass(), "encodedSourceStart", 0);
        setIntField(term671546, term671546.getClass(), "encodedSourceEnd", 0);
        setField(term671546, term671546.getClass(), "sourceName", null);
        setIntField(term671546, term671546.getClass(), "baseLineno", 0);
        setIntField(term671546, term671546.getClass(), "endLineno", 0);
        setField(term671546, term671546.getClass(), "functions", null);
        setField(term671546, term671546.getClass(), "regexps", null);
        setField(term671546, term671546.getClass(), "itsVariables", null);
        setField(term671546, term671546.getClass(), "itsConst", null);
        setField(term671546, term671546.getClass(), "itsVariableNames", null);
        setIntField(term671546, term671546.getClass(), "varStart", 0);
        setField(term671546, term671546.getClass(), "compilerData", null);
        setIntField(term671546, term671546.getClass(), "type", 114);
        setField(term671546, term671546.getClass(), "next", null);
        setField(term671546, term671546.getClass(), "first", null);
        setField(term671546, term671546.getClass(), "last", null);
        setField(term671546, term671546.getClass(), "propListHead", null);
        setIntField(term671546, term671546.getClass(), "sourcePosition", 0);
        setField(term671546, term671546.getClass(), "jsType", null);
        setField(term671546, term671546.getClass(), "parent", null);
        setField(term671535, term671535.getClass(), "parent", term671546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term671154;
        args[1] = term671332;
        args[2] = term671424;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term671068, args);
        assertTrue(recursiveEquals(term671068, term671630));
        assertTrue(recursiveEquals(term671154, term671631));
        assertTrue(recursiveEquals(term671332, term671633));
        assertTrue(recursiveEquals(term671424, term671634));
        assertTrue(recursiveEquals(retValue, term671535));
    }

};


