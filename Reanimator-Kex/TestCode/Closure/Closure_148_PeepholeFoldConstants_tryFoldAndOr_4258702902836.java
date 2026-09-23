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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825147;
     Object term825233;
     Object term825389;
     Object term825475;
     Object term825919;
     Object term825920;
     Object term825922;
     Object term825923;
     Object term825828;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825147 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term825233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term825303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term825303, term825303.getClass(), "type", 108);
        setField(term825233, term825233.getClass(), "parent", term825303);
        setIntField(term825233, term825233.getClass(), "type", 0);
        term825389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term825389, term825389.getClass(), "type", 102);
        term825475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term825475, term825475.getClass(), "type", 63);
        term825919 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term825919, term825919.getClass(), "currentTraversal", null);
        term825920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term825921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term825920, term825920.getClass(), "functionName", null);
        setBooleanField(term825920, term825920.getClass(), "itsNeedsActivation", false);
        setIntField(term825920, term825920.getClass(), "itsFunctionType", 0);
        setBooleanField(term825920, term825920.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term825920, term825920.getClass(), "encodedSourceStart", 0);
        setIntField(term825920, term825920.getClass(), "encodedSourceEnd", 0);
        setField(term825920, term825920.getClass(), "sourceName", null);
        setIntField(term825920, term825920.getClass(), "baseLineno", 0);
        setIntField(term825920, term825920.getClass(), "endLineno", 0);
        setField(term825920, term825920.getClass(), "functions", null);
        setField(term825920, term825920.getClass(), "regexps", null);
        setField(term825920, term825920.getClass(), "itsVariables", null);
        setField(term825920, term825920.getClass(), "itsConst", null);
        setField(term825920, term825920.getClass(), "itsVariableNames", null);
        setIntField(term825920, term825920.getClass(), "varStart", 0);
        setField(term825920, term825920.getClass(), "compilerData", null);
        setIntField(term825920, term825920.getClass(), "type", 0);
        setField(term825920, term825920.getClass(), "next", null);
        setField(term825920, term825920.getClass(), "first", null);
        setField(term825920, term825920.getClass(), "last", null);
        setField(term825920, term825920.getClass(), "propListHead", null);
        setIntField(term825920, term825920.getClass(), "sourcePosition", 0);
        setField(term825920, term825920.getClass(), "jsType", null);
        setIntField(term825921, term825921.getClass(), "type", 108);
        setField(term825921, term825921.getClass(), "next", null);
        setField(term825921, term825921.getClass(), "first", null);
        setField(term825921, term825921.getClass(), "last", null);
        setField(term825921, term825921.getClass(), "propListHead", null);
        setIntField(term825921, term825921.getClass(), "sourcePosition", 0);
        setField(term825921, term825921.getClass(), "jsType", null);
        setField(term825921, term825921.getClass(), "parent", null);
        setField(term825920, term825920.getClass(), "parent", term825921);
        term825922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term825922, term825922.getClass(), "functionName", null);
        setBooleanField(term825922, term825922.getClass(), "itsNeedsActivation", false);
        setIntField(term825922, term825922.getClass(), "itsFunctionType", 0);
        setBooleanField(term825922, term825922.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term825922, term825922.getClass(), "encodedSourceStart", 0);
        setIntField(term825922, term825922.getClass(), "encodedSourceEnd", 0);
        setField(term825922, term825922.getClass(), "sourceName", null);
        setIntField(term825922, term825922.getClass(), "baseLineno", 0);
        setIntField(term825922, term825922.getClass(), "endLineno", 0);
        setField(term825922, term825922.getClass(), "functions", null);
        setField(term825922, term825922.getClass(), "regexps", null);
        setField(term825922, term825922.getClass(), "itsVariables", null);
        setField(term825922, term825922.getClass(), "itsConst", null);
        setField(term825922, term825922.getClass(), "itsVariableNames", null);
        setIntField(term825922, term825922.getClass(), "varStart", 0);
        setField(term825922, term825922.getClass(), "compilerData", null);
        setIntField(term825922, term825922.getClass(), "type", 102);
        setField(term825922, term825922.getClass(), "next", null);
        setField(term825922, term825922.getClass(), "first", null);
        setField(term825922, term825922.getClass(), "last", null);
        setField(term825922, term825922.getClass(), "propListHead", null);
        setIntField(term825922, term825922.getClass(), "sourcePosition", 0);
        setField(term825922, term825922.getClass(), "jsType", null);
        setField(term825922, term825922.getClass(), "parent", null);
        term825923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term825923, term825923.getClass(), "functionName", null);
        setBooleanField(term825923, term825923.getClass(), "itsNeedsActivation", false);
        setIntField(term825923, term825923.getClass(), "itsFunctionType", 0);
        setBooleanField(term825923, term825923.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term825923, term825923.getClass(), "encodedSourceStart", 0);
        setIntField(term825923, term825923.getClass(), "encodedSourceEnd", 0);
        setField(term825923, term825923.getClass(), "sourceName", null);
        setIntField(term825923, term825923.getClass(), "baseLineno", 0);
        setIntField(term825923, term825923.getClass(), "endLineno", 0);
        setField(term825923, term825923.getClass(), "functions", null);
        setField(term825923, term825923.getClass(), "regexps", null);
        setField(term825923, term825923.getClass(), "itsVariables", null);
        setField(term825923, term825923.getClass(), "itsConst", null);
        setField(term825923, term825923.getClass(), "itsVariableNames", null);
        setIntField(term825923, term825923.getClass(), "varStart", 0);
        setField(term825923, term825923.getClass(), "compilerData", null);
        setIntField(term825923, term825923.getClass(), "type", 63);
        setField(term825923, term825923.getClass(), "next", null);
        setField(term825923, term825923.getClass(), "first", null);
        setField(term825923, term825923.getClass(), "last", null);
        setField(term825923, term825923.getClass(), "propListHead", null);
        setIntField(term825923, term825923.getClass(), "sourcePosition", 0);
        setField(term825923, term825923.getClass(), "jsType", null);
        setField(term825923, term825923.getClass(), "parent", null);
        term825828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term825839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term825828, term825828.getClass(), "functionName", null);
        setBooleanField(term825828, term825828.getClass(), "itsNeedsActivation", false);
        setIntField(term825828, term825828.getClass(), "itsFunctionType", 0);
        setBooleanField(term825828, term825828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term825828, term825828.getClass(), "encodedSourceStart", 0);
        setIntField(term825828, term825828.getClass(), "encodedSourceEnd", 0);
        setField(term825828, term825828.getClass(), "sourceName", null);
        setIntField(term825828, term825828.getClass(), "baseLineno", 0);
        setIntField(term825828, term825828.getClass(), "endLineno", 0);
        setField(term825828, term825828.getClass(), "functions", null);
        setField(term825828, term825828.getClass(), "regexps", null);
        setField(term825828, term825828.getClass(), "itsVariables", null);
        setField(term825828, term825828.getClass(), "itsConst", null);
        setField(term825828, term825828.getClass(), "itsVariableNames", null);
        setIntField(term825828, term825828.getClass(), "varStart", 0);
        setField(term825828, term825828.getClass(), "compilerData", null);
        setIntField(term825828, term825828.getClass(), "type", 0);
        setField(term825828, term825828.getClass(), "next", null);
        setField(term825828, term825828.getClass(), "first", null);
        setField(term825828, term825828.getClass(), "last", null);
        setField(term825828, term825828.getClass(), "propListHead", null);
        setIntField(term825828, term825828.getClass(), "sourcePosition", 0);
        setField(term825828, term825828.getClass(), "jsType", null);
        setIntField(term825839, term825839.getClass(), "type", 108);
        setField(term825839, term825839.getClass(), "next", null);
        setField(term825839, term825839.getClass(), "first", null);
        setField(term825839, term825839.getClass(), "last", null);
        setField(term825839, term825839.getClass(), "propListHead", null);
        setIntField(term825839, term825839.getClass(), "sourcePosition", 0);
        setField(term825839, term825839.getClass(), "jsType", null);
        setField(term825839, term825839.getClass(), "parent", null);
        setField(term825828, term825828.getClass(), "parent", term825839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term825233;
        args[1] = term825389;
        args[2] = term825475;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term825147, args);
        assertTrue(recursiveEquals(term825147, term825919));
        assertTrue(recursiveEquals(term825233, term825920));
        assertTrue(recursiveEquals(term825389, term825922));
        assertTrue(recursiveEquals(term825475, term825923));
        assertTrue(recursiveEquals(retValue, term825828));
    }

};


