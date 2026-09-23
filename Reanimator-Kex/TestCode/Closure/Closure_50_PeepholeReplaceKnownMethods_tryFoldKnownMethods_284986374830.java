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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3700983;
     Object term3701075;
     Object term3701812;
     Object term3701813;
     Object term3701439;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3700983 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3701075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701383 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3701167, term3701167.getClass(), "type", 35);
        setField(term3701259, term3701259.getClass(), "next", term3701259);
        setIntField(term3701259, term3701259.getClass(), "type", 40);
        setField(term3701259, term3701259.getClass(), "str", "indexOf");
        setField(term3701167, term3701167.getClass(), "first", term3701259);
        setIntField(term3701383, term3701383.getClass(), "type", 41);
        setField(term3701383, term3701383.getClass(), "next", term3701259);
        setField(term3701167, term3701167.getClass(), "next", term3701383);
        setField(term3701075, term3701075.getClass(), "first", term3701167);
        setIntField(term3701075, term3701075.getClass(), "type", 37);
        term3701812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3701812, term3701812.getClass(), "currentTraversal", null);
        term3701813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3701816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3701813, term3701813.getClass(), "str", null);
        setIntField(term3701813, term3701813.getClass(), "type", 37);
        setField(term3701813, term3701813.getClass(), "next", null);
        setField(term3701814, term3701814.getClass(), "str", null);
        setIntField(term3701814, term3701814.getClass(), "type", 35);
        setField(term3701815, term3701815.getClass(), "functionName", null);
        setBooleanField(term3701815, term3701815.getClass(), "itsNeedsActivation", false);
        setIntField(term3701815, term3701815.getClass(), "itsFunctionType", 0);
        setBooleanField(term3701815, term3701815.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3701815, term3701815.getClass(), "encodedSourceStart", 0);
        setIntField(term3701815, term3701815.getClass(), "encodedSourceEnd", 0);
        setField(term3701815, term3701815.getClass(), "sourceName", null);
        setIntField(term3701815, term3701815.getClass(), "baseLineno", 0);
        setIntField(term3701815, term3701815.getClass(), "endLineno", 0);
        setField(term3701815, term3701815.getClass(), "functions", null);
        setField(term3701815, term3701815.getClass(), "regexps", null);
        setField(term3701815, term3701815.getClass(), "itsVariables", null);
        setField(term3701815, term3701815.getClass(), "itsConst", null);
        setField(term3701815, term3701815.getClass(), "itsVariableNames", null);
        setIntField(term3701815, term3701815.getClass(), "varStart", 0);
        setField(term3701815, term3701815.getClass(), "compilerData", null);
        setIntField(term3701815, term3701815.getClass(), "type", 41);
        setField(term3701816, term3701816.getClass(), "str", "");
        setIntField(term3701816, term3701816.getClass(), "type", 40);
        setField(term3701816, term3701816.getClass(), "next", term3701816);
        setField(term3701816, term3701816.getClass(), "first", null);
        setField(term3701816, term3701816.getClass(), "last", null);
        setField(term3701816, term3701816.getClass(), "propListHead", null);
        setIntField(term3701816, term3701816.getClass(), "sourcePosition", 0);
        setField(term3701816, term3701816.getClass(), "jsType", null);
        setField(term3701816, term3701816.getClass(), "parent", null);
        setField(term3701815, term3701815.getClass(), "next", term3701816);
        setField(term3701815, term3701815.getClass(), "first", null);
        setField(term3701815, term3701815.getClass(), "last", null);
        setField(term3701815, term3701815.getClass(), "propListHead", null);
        setIntField(term3701815, term3701815.getClass(), "sourcePosition", 0);
        setField(term3701815, term3701815.getClass(), "jsType", null);
        setField(term3701815, term3701815.getClass(), "parent", null);
        setField(term3701814, term3701814.getClass(), "next", term3701815);
        setField(term3701814, term3701814.getClass(), "first", term3701816);
        setField(term3701814, term3701814.getClass(), "last", null);
        setField(term3701814, term3701814.getClass(), "propListHead", null);
        setIntField(term3701814, term3701814.getClass(), "sourcePosition", 0);
        setField(term3701814, term3701814.getClass(), "jsType", null);
        setField(term3701814, term3701814.getClass(), "parent", null);
        setField(term3701813, term3701813.getClass(), "first", term3701814);
        setField(term3701813, term3701813.getClass(), "last", null);
        setField(term3701813, term3701813.getClass(), "propListHead", null);
        setIntField(term3701813, term3701813.getClass(), "sourcePosition", 0);
        setField(term3701813, term3701813.getClass(), "jsType", null);
        setField(term3701813, term3701813.getClass(), "parent", null);
        term3701439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3701443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3701453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3701439, term3701439.getClass(), "str", null);
        setIntField(term3701439, term3701439.getClass(), "type", 37);
        setField(term3701439, term3701439.getClass(), "next", null);
        setField(term3701441, term3701441.getClass(), "str", null);
        setIntField(term3701441, term3701441.getClass(), "type", 35);
        setField(term3701443, term3701443.getClass(), "functionName", null);
        setBooleanField(term3701443, term3701443.getClass(), "itsNeedsActivation", false);
        setIntField(term3701443, term3701443.getClass(), "itsFunctionType", 0);
        setBooleanField(term3701443, term3701443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3701443, term3701443.getClass(), "encodedSourceStart", 0);
        setIntField(term3701443, term3701443.getClass(), "encodedSourceEnd", 0);
        setField(term3701443, term3701443.getClass(), "sourceName", null);
        setIntField(term3701443, term3701443.getClass(), "baseLineno", 0);
        setIntField(term3701443, term3701443.getClass(), "endLineno", 0);
        setField(term3701443, term3701443.getClass(), "functions", null);
        setField(term3701443, term3701443.getClass(), "regexps", null);
        setField(term3701443, term3701443.getClass(), "itsVariables", null);
        setField(term3701443, term3701443.getClass(), "itsConst", null);
        setField(term3701443, term3701443.getClass(), "itsVariableNames", null);
        setIntField(term3701443, term3701443.getClass(), "varStart", 0);
        setField(term3701443, term3701443.getClass(), "compilerData", null);
        setIntField(term3701443, term3701443.getClass(), "type", 41);
        setField(term3701453, term3701453.getClass(), "str", "");
        setIntField(term3701453, term3701453.getClass(), "type", 40);
        setField(term3701453, term3701453.getClass(), "next", term3701453);
        setField(term3701453, term3701453.getClass(), "first", null);
        setField(term3701453, term3701453.getClass(), "last", null);
        setField(term3701453, term3701453.getClass(), "propListHead", null);
        setIntField(term3701453, term3701453.getClass(), "sourcePosition", 0);
        setField(term3701453, term3701453.getClass(), "jsType", null);
        setField(term3701453, term3701453.getClass(), "parent", null);
        setField(term3701443, term3701443.getClass(), "next", term3701453);
        setField(term3701443, term3701443.getClass(), "first", null);
        setField(term3701443, term3701443.getClass(), "last", null);
        setField(term3701443, term3701443.getClass(), "propListHead", null);
        setIntField(term3701443, term3701443.getClass(), "sourcePosition", 0);
        setField(term3701443, term3701443.getClass(), "jsType", null);
        setField(term3701443, term3701443.getClass(), "parent", null);
        setField(term3701441, term3701441.getClass(), "next", term3701443);
        setField(term3701441, term3701441.getClass(), "first", term3701453);
        setField(term3701441, term3701441.getClass(), "last", null);
        setField(term3701441, term3701441.getClass(), "propListHead", null);
        setIntField(term3701441, term3701441.getClass(), "sourcePosition", 0);
        setField(term3701441, term3701441.getClass(), "jsType", null);
        setField(term3701441, term3701441.getClass(), "parent", null);
        setField(term3701439, term3701439.getClass(), "first", term3701441);
        setField(term3701439, term3701439.getClass(), "last", null);
        setField(term3701439, term3701439.getClass(), "propListHead", null);
        setIntField(term3701439, term3701439.getClass(), "sourcePosition", 0);
        setField(term3701439, term3701439.getClass(), "jsType", null);
        setField(term3701439, term3701439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3701075;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3700983, args);
        assertTrue(recursiveEquals(term3700983, term3701812));
        assertTrue(recursiveEquals(term3701075, term3701813));
        assertTrue(recursiveEquals(retValue, term3701439));
    }

};


