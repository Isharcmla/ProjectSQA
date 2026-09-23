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

public class PeepholeFoldConstants_tryFoldComparison_8484431792601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738903;
     Object term738989;
     Object term739075;
     Object term739161;
     Object term739636;
     Object term739637;
     Object term739638;
     Object term739639;
     Object term739600;

    public PeepholeFoldConstants_tryFoldComparison_8484431792601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738903 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term738989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term738989, term738989.getClass(), "type", 14);
        term739075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term739075, term739075.getClass(), "type", 14);
        term739161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term739636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term739636, term739636.getClass(), "currentTraversal", null);
        term739637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term739637, term739637.getClass(), "functionName", null);
        setBooleanField(term739637, term739637.getClass(), "itsNeedsActivation", false);
        setIntField(term739637, term739637.getClass(), "itsFunctionType", 0);
        setBooleanField(term739637, term739637.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739637, term739637.getClass(), "encodedSourceStart", 0);
        setIntField(term739637, term739637.getClass(), "encodedSourceEnd", 0);
        setField(term739637, term739637.getClass(), "sourceName", null);
        setIntField(term739637, term739637.getClass(), "baseLineno", 0);
        setIntField(term739637, term739637.getClass(), "endLineno", 0);
        setField(term739637, term739637.getClass(), "functions", null);
        setField(term739637, term739637.getClass(), "regexps", null);
        setField(term739637, term739637.getClass(), "itsVariables", null);
        setField(term739637, term739637.getClass(), "itsConst", null);
        setField(term739637, term739637.getClass(), "itsVariableNames", null);
        setIntField(term739637, term739637.getClass(), "varStart", 0);
        setField(term739637, term739637.getClass(), "compilerData", null);
        setIntField(term739637, term739637.getClass(), "type", 14);
        setField(term739637, term739637.getClass(), "next", null);
        setField(term739637, term739637.getClass(), "first", null);
        setField(term739637, term739637.getClass(), "last", null);
        setField(term739637, term739637.getClass(), "propListHead", null);
        setIntField(term739637, term739637.getClass(), "sourcePosition", 0);
        setField(term739637, term739637.getClass(), "jsType", null);
        setField(term739637, term739637.getClass(), "parent", null);
        term739638 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term739638, term739638.getClass(), "functionName", null);
        setBooleanField(term739638, term739638.getClass(), "itsNeedsActivation", false);
        setIntField(term739638, term739638.getClass(), "itsFunctionType", 0);
        setBooleanField(term739638, term739638.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739638, term739638.getClass(), "encodedSourceStart", 0);
        setIntField(term739638, term739638.getClass(), "encodedSourceEnd", 0);
        setField(term739638, term739638.getClass(), "sourceName", null);
        setIntField(term739638, term739638.getClass(), "baseLineno", 0);
        setIntField(term739638, term739638.getClass(), "endLineno", 0);
        setField(term739638, term739638.getClass(), "functions", null);
        setField(term739638, term739638.getClass(), "regexps", null);
        setField(term739638, term739638.getClass(), "itsVariables", null);
        setField(term739638, term739638.getClass(), "itsConst", null);
        setField(term739638, term739638.getClass(), "itsVariableNames", null);
        setIntField(term739638, term739638.getClass(), "varStart", 0);
        setField(term739638, term739638.getClass(), "compilerData", null);
        setIntField(term739638, term739638.getClass(), "type", 14);
        setField(term739638, term739638.getClass(), "next", null);
        setField(term739638, term739638.getClass(), "first", null);
        setField(term739638, term739638.getClass(), "last", null);
        setField(term739638, term739638.getClass(), "propListHead", null);
        setIntField(term739638, term739638.getClass(), "sourcePosition", 0);
        setField(term739638, term739638.getClass(), "jsType", null);
        setField(term739638, term739638.getClass(), "parent", null);
        term739639 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term739639, term739639.getClass(), "functionName", null);
        setBooleanField(term739639, term739639.getClass(), "itsNeedsActivation", false);
        setIntField(term739639, term739639.getClass(), "itsFunctionType", 0);
        setBooleanField(term739639, term739639.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739639, term739639.getClass(), "encodedSourceStart", 0);
        setIntField(term739639, term739639.getClass(), "encodedSourceEnd", 0);
        setField(term739639, term739639.getClass(), "sourceName", null);
        setIntField(term739639, term739639.getClass(), "baseLineno", 0);
        setIntField(term739639, term739639.getClass(), "endLineno", 0);
        setField(term739639, term739639.getClass(), "functions", null);
        setField(term739639, term739639.getClass(), "regexps", null);
        setField(term739639, term739639.getClass(), "itsVariables", null);
        setField(term739639, term739639.getClass(), "itsConst", null);
        setField(term739639, term739639.getClass(), "itsVariableNames", null);
        setIntField(term739639, term739639.getClass(), "varStart", 0);
        setField(term739639, term739639.getClass(), "compilerData", null);
        setIntField(term739639, term739639.getClass(), "type", 0);
        setField(term739639, term739639.getClass(), "next", null);
        setField(term739639, term739639.getClass(), "first", null);
        setField(term739639, term739639.getClass(), "last", null);
        setField(term739639, term739639.getClass(), "propListHead", null);
        setIntField(term739639, term739639.getClass(), "sourcePosition", 0);
        setField(term739639, term739639.getClass(), "jsType", null);
        setField(term739639, term739639.getClass(), "parent", null);
        term739600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term739600, term739600.getClass(), "functionName", null);
        setBooleanField(term739600, term739600.getClass(), "itsNeedsActivation", false);
        setIntField(term739600, term739600.getClass(), "itsFunctionType", 0);
        setBooleanField(term739600, term739600.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739600, term739600.getClass(), "encodedSourceStart", 0);
        setIntField(term739600, term739600.getClass(), "encodedSourceEnd", 0);
        setField(term739600, term739600.getClass(), "sourceName", null);
        setIntField(term739600, term739600.getClass(), "baseLineno", 0);
        setIntField(term739600, term739600.getClass(), "endLineno", 0);
        setField(term739600, term739600.getClass(), "functions", null);
        setField(term739600, term739600.getClass(), "regexps", null);
        setField(term739600, term739600.getClass(), "itsVariables", null);
        setField(term739600, term739600.getClass(), "itsConst", null);
        setField(term739600, term739600.getClass(), "itsVariableNames", null);
        setIntField(term739600, term739600.getClass(), "varStart", 0);
        setField(term739600, term739600.getClass(), "compilerData", null);
        setIntField(term739600, term739600.getClass(), "type", 14);
        setField(term739600, term739600.getClass(), "next", null);
        setField(term739600, term739600.getClass(), "first", null);
        setField(term739600, term739600.getClass(), "last", null);
        setField(term739600, term739600.getClass(), "propListHead", null);
        setIntField(term739600, term739600.getClass(), "sourcePosition", 0);
        setField(term739600, term739600.getClass(), "jsType", null);
        setField(term739600, term739600.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term738989;
        args[1] = term739075;
        args[2] = term739161;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term738903, args);
        assertTrue(recursiveEquals(term738903, term739636));
        assertTrue(recursiveEquals(term738989, term739637));
        assertTrue(recursiveEquals(term739075, term739638));
        assertTrue(recursiveEquals(term739161, term739639));
        assertTrue(recursiveEquals(retValue, term739600));
    }

};


