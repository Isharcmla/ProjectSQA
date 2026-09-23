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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651027;
     Object term651113;
     Object term651269;
     Object term651355;
     Object term651760;
     Object term651761;
     Object term651763;
     Object term651764;
     Object term651669;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term651027 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term651113 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term651183, term651183.getClass(), "type", 108);
        setField(term651113, term651113.getClass(), "parent", term651183);
        setIntField(term651113, term651113.getClass(), "type", 0);
        term651269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term651269, term651269.getClass(), "type", 129);
        term651355 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term651355, term651355.getClass(), "type", 63);
        term651760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651760, term651760.getClass(), "currentTraversal", null);
        term651761 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651761, term651761.getClass(), "functionName", null);
        setBooleanField(term651761, term651761.getClass(), "itsNeedsActivation", false);
        setIntField(term651761, term651761.getClass(), "itsFunctionType", 0);
        setBooleanField(term651761, term651761.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651761, term651761.getClass(), "encodedSourceStart", 0);
        setIntField(term651761, term651761.getClass(), "encodedSourceEnd", 0);
        setField(term651761, term651761.getClass(), "sourceName", null);
        setIntField(term651761, term651761.getClass(), "baseLineno", 0);
        setIntField(term651761, term651761.getClass(), "endLineno", 0);
        setField(term651761, term651761.getClass(), "functions", null);
        setField(term651761, term651761.getClass(), "regexps", null);
        setField(term651761, term651761.getClass(), "itsVariables", null);
        setField(term651761, term651761.getClass(), "itsConst", null);
        setField(term651761, term651761.getClass(), "itsVariableNames", null);
        setIntField(term651761, term651761.getClass(), "varStart", 0);
        setField(term651761, term651761.getClass(), "compilerData", null);
        setIntField(term651761, term651761.getClass(), "type", 0);
        setField(term651761, term651761.getClass(), "next", null);
        setField(term651761, term651761.getClass(), "first", null);
        setField(term651761, term651761.getClass(), "last", null);
        setField(term651761, term651761.getClass(), "propListHead", null);
        setIntField(term651761, term651761.getClass(), "sourcePosition", 0);
        setField(term651761, term651761.getClass(), "jsType", null);
        setIntField(term651762, term651762.getClass(), "type", 108);
        setField(term651762, term651762.getClass(), "next", null);
        setField(term651762, term651762.getClass(), "first", null);
        setField(term651762, term651762.getClass(), "last", null);
        setField(term651762, term651762.getClass(), "propListHead", null);
        setIntField(term651762, term651762.getClass(), "sourcePosition", 0);
        setField(term651762, term651762.getClass(), "jsType", null);
        setField(term651762, term651762.getClass(), "parent", null);
        setField(term651761, term651761.getClass(), "parent", term651762);
        term651763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term651763, term651763.getClass(), "functionName", null);
        setBooleanField(term651763, term651763.getClass(), "itsNeedsActivation", false);
        setIntField(term651763, term651763.getClass(), "itsFunctionType", 0);
        setBooleanField(term651763, term651763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651763, term651763.getClass(), "encodedSourceStart", 0);
        setIntField(term651763, term651763.getClass(), "encodedSourceEnd", 0);
        setField(term651763, term651763.getClass(), "sourceName", null);
        setIntField(term651763, term651763.getClass(), "baseLineno", 0);
        setIntField(term651763, term651763.getClass(), "endLineno", 0);
        setField(term651763, term651763.getClass(), "functions", null);
        setField(term651763, term651763.getClass(), "regexps", null);
        setField(term651763, term651763.getClass(), "itsVariables", null);
        setField(term651763, term651763.getClass(), "itsConst", null);
        setField(term651763, term651763.getClass(), "itsVariableNames", null);
        setIntField(term651763, term651763.getClass(), "varStart", 0);
        setField(term651763, term651763.getClass(), "compilerData", null);
        setIntField(term651763, term651763.getClass(), "type", 129);
        setField(term651763, term651763.getClass(), "next", null);
        setField(term651763, term651763.getClass(), "first", null);
        setField(term651763, term651763.getClass(), "last", null);
        setField(term651763, term651763.getClass(), "propListHead", null);
        setIntField(term651763, term651763.getClass(), "sourcePosition", 0);
        setField(term651763, term651763.getClass(), "jsType", null);
        setField(term651763, term651763.getClass(), "parent", null);
        term651764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term651764, term651764.getClass(), "functionName", null);
        setBooleanField(term651764, term651764.getClass(), "itsNeedsActivation", false);
        setIntField(term651764, term651764.getClass(), "itsFunctionType", 0);
        setBooleanField(term651764, term651764.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651764, term651764.getClass(), "encodedSourceStart", 0);
        setIntField(term651764, term651764.getClass(), "encodedSourceEnd", 0);
        setField(term651764, term651764.getClass(), "sourceName", null);
        setIntField(term651764, term651764.getClass(), "baseLineno", 0);
        setIntField(term651764, term651764.getClass(), "endLineno", 0);
        setField(term651764, term651764.getClass(), "functions", null);
        setField(term651764, term651764.getClass(), "regexps", null);
        setField(term651764, term651764.getClass(), "itsVariables", null);
        setField(term651764, term651764.getClass(), "itsConst", null);
        setField(term651764, term651764.getClass(), "itsVariableNames", null);
        setIntField(term651764, term651764.getClass(), "varStart", 0);
        setField(term651764, term651764.getClass(), "compilerData", null);
        setIntField(term651764, term651764.getClass(), "type", 63);
        setField(term651764, term651764.getClass(), "next", null);
        setField(term651764, term651764.getClass(), "first", null);
        setField(term651764, term651764.getClass(), "last", null);
        setField(term651764, term651764.getClass(), "propListHead", null);
        setIntField(term651764, term651764.getClass(), "sourcePosition", 0);
        setField(term651764, term651764.getClass(), "jsType", null);
        setField(term651764, term651764.getClass(), "parent", null);
        term651669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651669, term651669.getClass(), "functionName", null);
        setBooleanField(term651669, term651669.getClass(), "itsNeedsActivation", false);
        setIntField(term651669, term651669.getClass(), "itsFunctionType", 0);
        setBooleanField(term651669, term651669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651669, term651669.getClass(), "encodedSourceStart", 0);
        setIntField(term651669, term651669.getClass(), "encodedSourceEnd", 0);
        setField(term651669, term651669.getClass(), "sourceName", null);
        setIntField(term651669, term651669.getClass(), "baseLineno", 0);
        setIntField(term651669, term651669.getClass(), "endLineno", 0);
        setField(term651669, term651669.getClass(), "functions", null);
        setField(term651669, term651669.getClass(), "regexps", null);
        setField(term651669, term651669.getClass(), "itsVariables", null);
        setField(term651669, term651669.getClass(), "itsConst", null);
        setField(term651669, term651669.getClass(), "itsVariableNames", null);
        setIntField(term651669, term651669.getClass(), "varStart", 0);
        setField(term651669, term651669.getClass(), "compilerData", null);
        setIntField(term651669, term651669.getClass(), "type", 0);
        setField(term651669, term651669.getClass(), "next", null);
        setField(term651669, term651669.getClass(), "first", null);
        setField(term651669, term651669.getClass(), "last", null);
        setField(term651669, term651669.getClass(), "propListHead", null);
        setIntField(term651669, term651669.getClass(), "sourcePosition", 0);
        setField(term651669, term651669.getClass(), "jsType", null);
        setIntField(term651680, term651680.getClass(), "type", 108);
        setField(term651680, term651680.getClass(), "next", null);
        setField(term651680, term651680.getClass(), "first", null);
        setField(term651680, term651680.getClass(), "last", null);
        setField(term651680, term651680.getClass(), "propListHead", null);
        setIntField(term651680, term651680.getClass(), "sourcePosition", 0);
        setField(term651680, term651680.getClass(), "jsType", null);
        setField(term651680, term651680.getClass(), "parent", null);
        setField(term651669, term651669.getClass(), "parent", term651680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term651113;
        args[1] = term651269;
        args[2] = term651355;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term651027, args);
        assertTrue(recursiveEquals(term651027, term651760));
        assertTrue(recursiveEquals(term651113, term651761));
        assertTrue(recursiveEquals(term651269, term651763));
        assertTrue(recursiveEquals(term651355, term651764));
        assertTrue(recursiveEquals(retValue, term651669));
    }

};


