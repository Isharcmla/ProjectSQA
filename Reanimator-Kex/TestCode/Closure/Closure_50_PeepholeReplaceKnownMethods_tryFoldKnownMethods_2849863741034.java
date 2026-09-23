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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4457292;
     Object term4457384;
     Object term4458683;
     Object term4458684;
     Object term4458353;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4457292 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4457384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4457476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4457568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4457660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4457784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4457476, term4457476.getClass(), "type", 35);
        setIntField(term4457660, term4457660.getClass(), "type", 40);
        setField(term4457660, term4457660.getClass(), "str", "charAt");
        setField(term4457568, term4457568.getClass(), "next", term4457660);
        setIntField(term4457568, term4457568.getClass(), "type", 40);
        setField(term4457476, term4457476.getClass(), "first", term4457568);
        setIntField(term4457784, term4457784.getClass(), "type", 44);
        setField(term4457476, term4457476.getClass(), "next", term4457784);
        setField(term4457384, term4457384.getClass(), "first", term4457476);
        setIntField(term4457384, term4457384.getClass(), "type", 37);
        term4458683 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4458683, term4458683.getClass(), "currentTraversal", null);
        term4458684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4458687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4458684, term4458684.getClass(), "str", null);
        setIntField(term4458684, term4458684.getClass(), "type", 37);
        setField(term4458684, term4458684.getClass(), "next", null);
        setField(term4458685, term4458685.getClass(), "str", null);
        setIntField(term4458685, term4458685.getClass(), "type", 35);
        setField(term4458686, term4458686.getClass(), "functionName", null);
        setBooleanField(term4458686, term4458686.getClass(), "itsNeedsActivation", false);
        setIntField(term4458686, term4458686.getClass(), "itsFunctionType", 0);
        setBooleanField(term4458686, term4458686.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4458686, term4458686.getClass(), "encodedSourceStart", 0);
        setIntField(term4458686, term4458686.getClass(), "encodedSourceEnd", 0);
        setField(term4458686, term4458686.getClass(), "sourceName", null);
        setIntField(term4458686, term4458686.getClass(), "baseLineno", 0);
        setIntField(term4458686, term4458686.getClass(), "endLineno", 0);
        setField(term4458686, term4458686.getClass(), "functions", null);
        setField(term4458686, term4458686.getClass(), "regexps", null);
        setField(term4458686, term4458686.getClass(), "itsVariables", null);
        setField(term4458686, term4458686.getClass(), "itsConst", null);
        setField(term4458686, term4458686.getClass(), "itsVariableNames", null);
        setIntField(term4458686, term4458686.getClass(), "varStart", 0);
        setField(term4458686, term4458686.getClass(), "compilerData", null);
        setIntField(term4458686, term4458686.getClass(), "type", 44);
        setField(term4458686, term4458686.getClass(), "next", null);
        setField(term4458686, term4458686.getClass(), "first", null);
        setField(term4458686, term4458686.getClass(), "last", null);
        setField(term4458686, term4458686.getClass(), "propListHead", null);
        setIntField(term4458686, term4458686.getClass(), "sourcePosition", 0);
        setField(term4458686, term4458686.getClass(), "jsType", null);
        setField(term4458686, term4458686.getClass(), "parent", null);
        setField(term4458685, term4458685.getClass(), "next", term4458686);
        setField(term4458687, term4458687.getClass(), "str", null);
        setIntField(term4458687, term4458687.getClass(), "type", 40);
        setField(term4458688, term4458688.getClass(), "str", "");
        setIntField(term4458688, term4458688.getClass(), "type", 40);
        setField(term4458688, term4458688.getClass(), "next", null);
        setField(term4458688, term4458688.getClass(), "first", null);
        setField(term4458688, term4458688.getClass(), "last", null);
        setField(term4458688, term4458688.getClass(), "propListHead", null);
        setIntField(term4458688, term4458688.getClass(), "sourcePosition", 0);
        setField(term4458688, term4458688.getClass(), "jsType", null);
        setField(term4458688, term4458688.getClass(), "parent", null);
        setField(term4458687, term4458687.getClass(), "next", term4458688);
        setField(term4458687, term4458687.getClass(), "first", null);
        setField(term4458687, term4458687.getClass(), "last", null);
        setField(term4458687, term4458687.getClass(), "propListHead", null);
        setIntField(term4458687, term4458687.getClass(), "sourcePosition", 0);
        setField(term4458687, term4458687.getClass(), "jsType", null);
        setField(term4458687, term4458687.getClass(), "parent", null);
        setField(term4458685, term4458685.getClass(), "first", term4458687);
        setField(term4458685, term4458685.getClass(), "last", null);
        setField(term4458685, term4458685.getClass(), "propListHead", null);
        setIntField(term4458685, term4458685.getClass(), "sourcePosition", 0);
        setField(term4458685, term4458685.getClass(), "jsType", null);
        setField(term4458685, term4458685.getClass(), "parent", null);
        setField(term4458684, term4458684.getClass(), "first", term4458685);
        setField(term4458684, term4458684.getClass(), "last", null);
        setField(term4458684, term4458684.getClass(), "propListHead", null);
        setIntField(term4458684, term4458684.getClass(), "sourcePosition", 0);
        setField(term4458684, term4458684.getClass(), "jsType", null);
        setField(term4458684, term4458684.getClass(), "parent", null);
        term4458353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458357 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4458368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4458370 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4458353, term4458353.getClass(), "str", null);
        setIntField(term4458353, term4458353.getClass(), "type", 37);
        setField(term4458353, term4458353.getClass(), "next", null);
        setField(term4458355, term4458355.getClass(), "str", null);
        setIntField(term4458355, term4458355.getClass(), "type", 35);
        setField(term4458357, term4458357.getClass(), "functionName", null);
        setBooleanField(term4458357, term4458357.getClass(), "itsNeedsActivation", false);
        setIntField(term4458357, term4458357.getClass(), "itsFunctionType", 0);
        setBooleanField(term4458357, term4458357.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4458357, term4458357.getClass(), "encodedSourceStart", 0);
        setIntField(term4458357, term4458357.getClass(), "encodedSourceEnd", 0);
        setField(term4458357, term4458357.getClass(), "sourceName", null);
        setIntField(term4458357, term4458357.getClass(), "baseLineno", 0);
        setIntField(term4458357, term4458357.getClass(), "endLineno", 0);
        setField(term4458357, term4458357.getClass(), "functions", null);
        setField(term4458357, term4458357.getClass(), "regexps", null);
        setField(term4458357, term4458357.getClass(), "itsVariables", null);
        setField(term4458357, term4458357.getClass(), "itsConst", null);
        setField(term4458357, term4458357.getClass(), "itsVariableNames", null);
        setIntField(term4458357, term4458357.getClass(), "varStart", 0);
        setField(term4458357, term4458357.getClass(), "compilerData", null);
        setIntField(term4458357, term4458357.getClass(), "type", 44);
        setField(term4458357, term4458357.getClass(), "next", null);
        setField(term4458357, term4458357.getClass(), "first", null);
        setField(term4458357, term4458357.getClass(), "last", null);
        setField(term4458357, term4458357.getClass(), "propListHead", null);
        setIntField(term4458357, term4458357.getClass(), "sourcePosition", 0);
        setField(term4458357, term4458357.getClass(), "jsType", null);
        setField(term4458357, term4458357.getClass(), "parent", null);
        setField(term4458355, term4458355.getClass(), "next", term4458357);
        setField(term4458368, term4458368.getClass(), "str", null);
        setIntField(term4458368, term4458368.getClass(), "type", 40);
        setField(term4458370, term4458370.getClass(), "str", "");
        setIntField(term4458370, term4458370.getClass(), "type", 40);
        setField(term4458370, term4458370.getClass(), "next", null);
        setField(term4458370, term4458370.getClass(), "first", null);
        setField(term4458370, term4458370.getClass(), "last", null);
        setField(term4458370, term4458370.getClass(), "propListHead", null);
        setIntField(term4458370, term4458370.getClass(), "sourcePosition", 0);
        setField(term4458370, term4458370.getClass(), "jsType", null);
        setField(term4458370, term4458370.getClass(), "parent", null);
        setField(term4458368, term4458368.getClass(), "next", term4458370);
        setField(term4458368, term4458368.getClass(), "first", null);
        setField(term4458368, term4458368.getClass(), "last", null);
        setField(term4458368, term4458368.getClass(), "propListHead", null);
        setIntField(term4458368, term4458368.getClass(), "sourcePosition", 0);
        setField(term4458368, term4458368.getClass(), "jsType", null);
        setField(term4458368, term4458368.getClass(), "parent", null);
        setField(term4458355, term4458355.getClass(), "first", term4458368);
        setField(term4458355, term4458355.getClass(), "last", null);
        setField(term4458355, term4458355.getClass(), "propListHead", null);
        setIntField(term4458355, term4458355.getClass(), "sourcePosition", 0);
        setField(term4458355, term4458355.getClass(), "jsType", null);
        setField(term4458355, term4458355.getClass(), "parent", null);
        setField(term4458353, term4458353.getClass(), "first", term4458355);
        setField(term4458353, term4458353.getClass(), "last", null);
        setField(term4458353, term4458353.getClass(), "propListHead", null);
        setIntField(term4458353, term4458353.getClass(), "sourcePosition", 0);
        setField(term4458353, term4458353.getClass(), "jsType", null);
        setField(term4458353, term4458353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4457384;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4457292, args);
        assertTrue(recursiveEquals(term4457292, term4458683));
        assertTrue(recursiveEquals(term4457384, term4458684));
        assertTrue(recursiveEquals(retValue, term4458353));
    }

};


