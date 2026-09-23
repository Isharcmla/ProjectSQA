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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465858;
     Object term465944;
     Object term466128;
     Object term466220;
     Object term466828;
     Object term466829;
     Object term466831;
     Object term466832;
     Object term466749;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465858 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term465944 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term466036, term466036.getClass(), "type", 108);
        setField(term465944, term465944.getClass(), "parent", term466036);
        setIntField(term465944, term465944.getClass(), "type", 100);
        term466128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term466128, term466128.getClass(), "type", 0);
        term466220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term466220, term466220.getClass(), "type", 44);
        term466828 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term466828, term466828.getClass(), "currentTraversal", null);
        term466829 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term466829, term466829.getClass(), "functionName", null);
        setBooleanField(term466829, term466829.getClass(), "itsNeedsActivation", false);
        setIntField(term466829, term466829.getClass(), "itsFunctionType", 0);
        setBooleanField(term466829, term466829.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466829, term466829.getClass(), "encodedSourceStart", 0);
        setIntField(term466829, term466829.getClass(), "encodedSourceEnd", 0);
        setField(term466829, term466829.getClass(), "sourceName", null);
        setIntField(term466829, term466829.getClass(), "baseLineno", 0);
        setIntField(term466829, term466829.getClass(), "endLineno", 0);
        setField(term466829, term466829.getClass(), "functions", null);
        setField(term466829, term466829.getClass(), "regexps", null);
        setField(term466829, term466829.getClass(), "itsVariables", null);
        setField(term466829, term466829.getClass(), "itsConst", null);
        setField(term466829, term466829.getClass(), "itsVariableNames", null);
        setIntField(term466829, term466829.getClass(), "varStart", 0);
        setField(term466829, term466829.getClass(), "compilerData", null);
        setIntField(term466829, term466829.getClass(), "type", 100);
        setField(term466829, term466829.getClass(), "next", null);
        setField(term466829, term466829.getClass(), "first", null);
        setField(term466829, term466829.getClass(), "last", null);
        setField(term466829, term466829.getClass(), "propListHead", null);
        setIntField(term466829, term466829.getClass(), "sourcePosition", 0);
        setField(term466829, term466829.getClass(), "jsType", null);
        setDoubleField(term466830, term466830.getClass(), "number", 0.0);
        setIntField(term466830, term466830.getClass(), "type", 108);
        setField(term466830, term466830.getClass(), "next", null);
        setField(term466830, term466830.getClass(), "first", null);
        setField(term466830, term466830.getClass(), "last", null);
        setField(term466830, term466830.getClass(), "propListHead", null);
        setIntField(term466830, term466830.getClass(), "sourcePosition", 0);
        setField(term466830, term466830.getClass(), "jsType", null);
        setField(term466830, term466830.getClass(), "parent", null);
        setField(term466829, term466829.getClass(), "parent", term466830);
        term466831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term466831, term466831.getClass(), "number", 0.0);
        setIntField(term466831, term466831.getClass(), "type", 0);
        setField(term466831, term466831.getClass(), "next", null);
        setField(term466831, term466831.getClass(), "first", null);
        setField(term466831, term466831.getClass(), "last", null);
        setField(term466831, term466831.getClass(), "propListHead", null);
        setIntField(term466831, term466831.getClass(), "sourcePosition", 0);
        setField(term466831, term466831.getClass(), "jsType", null);
        setField(term466831, term466831.getClass(), "parent", null);
        term466832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term466832, term466832.getClass(), "str", null);
        setIntField(term466832, term466832.getClass(), "type", 44);
        setField(term466832, term466832.getClass(), "next", null);
        setField(term466832, term466832.getClass(), "first", null);
        setField(term466832, term466832.getClass(), "last", null);
        setField(term466832, term466832.getClass(), "propListHead", null);
        setIntField(term466832, term466832.getClass(), "sourcePosition", 0);
        setField(term466832, term466832.getClass(), "jsType", null);
        setField(term466832, term466832.getClass(), "parent", null);
        term466749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term466749, term466749.getClass(), "functionName", null);
        setBooleanField(term466749, term466749.getClass(), "itsNeedsActivation", false);
        setIntField(term466749, term466749.getClass(), "itsFunctionType", 0);
        setBooleanField(term466749, term466749.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466749, term466749.getClass(), "encodedSourceStart", 0);
        setIntField(term466749, term466749.getClass(), "encodedSourceEnd", 0);
        setField(term466749, term466749.getClass(), "sourceName", null);
        setIntField(term466749, term466749.getClass(), "baseLineno", 0);
        setIntField(term466749, term466749.getClass(), "endLineno", 0);
        setField(term466749, term466749.getClass(), "functions", null);
        setField(term466749, term466749.getClass(), "regexps", null);
        setField(term466749, term466749.getClass(), "itsVariables", null);
        setField(term466749, term466749.getClass(), "itsConst", null);
        setField(term466749, term466749.getClass(), "itsVariableNames", null);
        setIntField(term466749, term466749.getClass(), "varStart", 0);
        setField(term466749, term466749.getClass(), "compilerData", null);
        setIntField(term466749, term466749.getClass(), "type", 100);
        setField(term466749, term466749.getClass(), "next", null);
        setField(term466749, term466749.getClass(), "first", null);
        setField(term466749, term466749.getClass(), "last", null);
        setField(term466749, term466749.getClass(), "propListHead", null);
        setIntField(term466749, term466749.getClass(), "sourcePosition", 0);
        setField(term466749, term466749.getClass(), "jsType", null);
        setDoubleField(term466760, term466760.getClass(), "number", 0.0);
        setIntField(term466760, term466760.getClass(), "type", 108);
        setField(term466760, term466760.getClass(), "next", null);
        setField(term466760, term466760.getClass(), "first", null);
        setField(term466760, term466760.getClass(), "last", null);
        setField(term466760, term466760.getClass(), "propListHead", null);
        setIntField(term466760, term466760.getClass(), "sourcePosition", 0);
        setField(term466760, term466760.getClass(), "jsType", null);
        setField(term466760, term466760.getClass(), "parent", null);
        setField(term466749, term466749.getClass(), "parent", term466760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term465944;
        args[1] = term466128;
        args[2] = term466220;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term465858, args);
        assertTrue(recursiveEquals(term465858, term466828));
        assertTrue(recursiveEquals(term465944, term466829));
        assertTrue(recursiveEquals(term466128, term466831));
        assertTrue(recursiveEquals(term466220, term466832));
        assertTrue(recursiveEquals(retValue, term466749));
    }

};


