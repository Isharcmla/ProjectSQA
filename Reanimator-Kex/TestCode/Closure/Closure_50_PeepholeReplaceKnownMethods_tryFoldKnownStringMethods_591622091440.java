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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696927;
     Object term2697019;
     Object term3205452;
     Object term3205453;
     Object term3205325;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2696927 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2697019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2697105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2697175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2697261 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2697019, term2697019.getClass(), "type", 37);
        setIntField(term2697105, term2697105.getClass(), "type", 33);
        setField(term2697175, term2697175.getClass(), "next", term2697261);
        setIntField(term2697175, term2697175.getClass(), "type", 40);
        setField(term2697105, term2697105.getClass(), "first", term2697175);
        setField(term2697019, term2697019.getClass(), "first", term2697105);
        term3205452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3205452, term3205452.getClass(), "currentTraversal", null);
        term3205453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3205454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3205455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3205456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3205453, term3205453.getClass(), "str", null);
        setIntField(term3205453, term3205453.getClass(), "type", 37);
        setField(term3205453, term3205453.getClass(), "next", null);
        setField(term3205454, term3205454.getClass(), "functionName", null);
        setBooleanField(term3205454, term3205454.getClass(), "itsNeedsActivation", false);
        setIntField(term3205454, term3205454.getClass(), "itsFunctionType", 0);
        setBooleanField(term3205454, term3205454.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3205454, term3205454.getClass(), "encodedSourceStart", 0);
        setIntField(term3205454, term3205454.getClass(), "encodedSourceEnd", 0);
        setField(term3205454, term3205454.getClass(), "sourceName", null);
        setIntField(term3205454, term3205454.getClass(), "baseLineno", 0);
        setIntField(term3205454, term3205454.getClass(), "endLineno", 0);
        setField(term3205454, term3205454.getClass(), "functions", null);
        setField(term3205454, term3205454.getClass(), "regexps", null);
        setField(term3205454, term3205454.getClass(), "itsVariables", null);
        setField(term3205454, term3205454.getClass(), "itsConst", null);
        setField(term3205454, term3205454.getClass(), "itsVariableNames", null);
        setIntField(term3205454, term3205454.getClass(), "varStart", 0);
        setField(term3205454, term3205454.getClass(), "compilerData", null);
        setIntField(term3205454, term3205454.getClass(), "type", 33);
        setField(term3205454, term3205454.getClass(), "next", null);
        setIntField(term3205455, term3205455.getClass(), "type", 40);
        setField(term3205456, term3205456.getClass(), "functionName", null);
        setBooleanField(term3205456, term3205456.getClass(), "itsNeedsActivation", false);
        setIntField(term3205456, term3205456.getClass(), "itsFunctionType", 0);
        setBooleanField(term3205456, term3205456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3205456, term3205456.getClass(), "encodedSourceStart", 0);
        setIntField(term3205456, term3205456.getClass(), "encodedSourceEnd", 0);
        setField(term3205456, term3205456.getClass(), "sourceName", null);
        setIntField(term3205456, term3205456.getClass(), "baseLineno", 0);
        setIntField(term3205456, term3205456.getClass(), "endLineno", 0);
        setField(term3205456, term3205456.getClass(), "functions", null);
        setField(term3205456, term3205456.getClass(), "regexps", null);
        setField(term3205456, term3205456.getClass(), "itsVariables", null);
        setField(term3205456, term3205456.getClass(), "itsConst", null);
        setField(term3205456, term3205456.getClass(), "itsVariableNames", null);
        setIntField(term3205456, term3205456.getClass(), "varStart", 0);
        setField(term3205456, term3205456.getClass(), "compilerData", null);
        setIntField(term3205456, term3205456.getClass(), "type", 0);
        setField(term3205456, term3205456.getClass(), "next", null);
        setField(term3205456, term3205456.getClass(), "first", null);
        setField(term3205456, term3205456.getClass(), "last", null);
        setField(term3205456, term3205456.getClass(), "propListHead", null);
        setIntField(term3205456, term3205456.getClass(), "sourcePosition", 0);
        setField(term3205456, term3205456.getClass(), "jsType", null);
        setField(term3205456, term3205456.getClass(), "parent", null);
        setField(term3205455, term3205455.getClass(), "next", term3205456);
        setField(term3205455, term3205455.getClass(), "first", null);
        setField(term3205455, term3205455.getClass(), "last", null);
        setField(term3205455, term3205455.getClass(), "propListHead", null);
        setIntField(term3205455, term3205455.getClass(), "sourcePosition", 0);
        setField(term3205455, term3205455.getClass(), "jsType", null);
        setField(term3205455, term3205455.getClass(), "parent", null);
        setField(term3205454, term3205454.getClass(), "first", term3205455);
        setField(term3205454, term3205454.getClass(), "last", null);
        setField(term3205454, term3205454.getClass(), "propListHead", null);
        setIntField(term3205454, term3205454.getClass(), "sourcePosition", 0);
        setField(term3205454, term3205454.getClass(), "jsType", null);
        setField(term3205454, term3205454.getClass(), "parent", null);
        setField(term3205453, term3205453.getClass(), "first", term3205454);
        setField(term3205453, term3205453.getClass(), "last", null);
        setField(term3205453, term3205453.getClass(), "propListHead", null);
        setIntField(term3205453, term3205453.getClass(), "sourcePosition", 0);
        setField(term3205453, term3205453.getClass(), "jsType", null);
        setField(term3205453, term3205453.getClass(), "parent", null);
        term3205325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3205327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3205337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3205339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3205325, term3205325.getClass(), "str", null);
        setIntField(term3205325, term3205325.getClass(), "type", 37);
        setField(term3205325, term3205325.getClass(), "next", null);
        setField(term3205327, term3205327.getClass(), "functionName", null);
        setBooleanField(term3205327, term3205327.getClass(), "itsNeedsActivation", false);
        setIntField(term3205327, term3205327.getClass(), "itsFunctionType", 0);
        setBooleanField(term3205327, term3205327.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3205327, term3205327.getClass(), "encodedSourceStart", 0);
        setIntField(term3205327, term3205327.getClass(), "encodedSourceEnd", 0);
        setField(term3205327, term3205327.getClass(), "sourceName", null);
        setIntField(term3205327, term3205327.getClass(), "baseLineno", 0);
        setIntField(term3205327, term3205327.getClass(), "endLineno", 0);
        setField(term3205327, term3205327.getClass(), "functions", null);
        setField(term3205327, term3205327.getClass(), "regexps", null);
        setField(term3205327, term3205327.getClass(), "itsVariables", null);
        setField(term3205327, term3205327.getClass(), "itsConst", null);
        setField(term3205327, term3205327.getClass(), "itsVariableNames", null);
        setIntField(term3205327, term3205327.getClass(), "varStart", 0);
        setField(term3205327, term3205327.getClass(), "compilerData", null);
        setIntField(term3205327, term3205327.getClass(), "type", 33);
        setField(term3205327, term3205327.getClass(), "next", null);
        setIntField(term3205337, term3205337.getClass(), "type", 40);
        setField(term3205339, term3205339.getClass(), "functionName", null);
        setBooleanField(term3205339, term3205339.getClass(), "itsNeedsActivation", false);
        setIntField(term3205339, term3205339.getClass(), "itsFunctionType", 0);
        setBooleanField(term3205339, term3205339.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3205339, term3205339.getClass(), "encodedSourceStart", 0);
        setIntField(term3205339, term3205339.getClass(), "encodedSourceEnd", 0);
        setField(term3205339, term3205339.getClass(), "sourceName", null);
        setIntField(term3205339, term3205339.getClass(), "baseLineno", 0);
        setIntField(term3205339, term3205339.getClass(), "endLineno", 0);
        setField(term3205339, term3205339.getClass(), "functions", null);
        setField(term3205339, term3205339.getClass(), "regexps", null);
        setField(term3205339, term3205339.getClass(), "itsVariables", null);
        setField(term3205339, term3205339.getClass(), "itsConst", null);
        setField(term3205339, term3205339.getClass(), "itsVariableNames", null);
        setIntField(term3205339, term3205339.getClass(), "varStart", 0);
        setField(term3205339, term3205339.getClass(), "compilerData", null);
        setIntField(term3205339, term3205339.getClass(), "type", 0);
        setField(term3205339, term3205339.getClass(), "next", null);
        setField(term3205339, term3205339.getClass(), "first", null);
        setField(term3205339, term3205339.getClass(), "last", null);
        setField(term3205339, term3205339.getClass(), "propListHead", null);
        setIntField(term3205339, term3205339.getClass(), "sourcePosition", 0);
        setField(term3205339, term3205339.getClass(), "jsType", null);
        setField(term3205339, term3205339.getClass(), "parent", null);
        setField(term3205337, term3205337.getClass(), "next", term3205339);
        setField(term3205337, term3205337.getClass(), "first", null);
        setField(term3205337, term3205337.getClass(), "last", null);
        setField(term3205337, term3205337.getClass(), "propListHead", null);
        setIntField(term3205337, term3205337.getClass(), "sourcePosition", 0);
        setField(term3205337, term3205337.getClass(), "jsType", null);
        setField(term3205337, term3205337.getClass(), "parent", null);
        setField(term3205327, term3205327.getClass(), "first", term3205337);
        setField(term3205327, term3205327.getClass(), "last", null);
        setField(term3205327, term3205327.getClass(), "propListHead", null);
        setIntField(term3205327, term3205327.getClass(), "sourcePosition", 0);
        setField(term3205327, term3205327.getClass(), "jsType", null);
        setField(term3205327, term3205327.getClass(), "parent", null);
        setField(term3205325, term3205325.getClass(), "first", term3205327);
        setField(term3205325, term3205325.getClass(), "last", null);
        setField(term3205325, term3205325.getClass(), "propListHead", null);
        setIntField(term3205325, term3205325.getClass(), "sourcePosition", 0);
        setField(term3205325, term3205325.getClass(), "jsType", null);
        setField(term3205325, term3205325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2697019;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2696927, args);
        assertTrue(recursiveEquals(term2696927, term3205452));
        assertTrue(recursiveEquals(term2697019, term3205453));
        assertTrue(recursiveEquals(retValue, term3205325));
    }

};


