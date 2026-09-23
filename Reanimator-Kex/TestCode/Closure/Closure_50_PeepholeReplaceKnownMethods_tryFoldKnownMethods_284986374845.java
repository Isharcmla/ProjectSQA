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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3708955;
     Object term3709047;
     Object term3710736;
     Object term3710737;
     Object term3710369;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3708955 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3709047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3709139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3709231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3709323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3709447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3709139, term3709139.getClass(), "type", 35);
        setIntField(term3709323, term3709323.getClass(), "type", 40);
        setField(term3709323, term3709323.getClass(), "str", "charCodeAt");
        setField(term3709231, term3709231.getClass(), "next", term3709323);
        setIntField(term3709231, term3709231.getClass(), "type", 40);
        setField(term3709139, term3709139.getClass(), "first", term3709231);
        setIntField(term3709447, term3709447.getClass(), "type", 43);
        setField(term3709139, term3709139.getClass(), "next", term3709447);
        setField(term3709047, term3709047.getClass(), "first", term3709139);
        setIntField(term3709047, term3709047.getClass(), "type", 37);
        term3710736 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3710736, term3710736.getClass(), "currentTraversal", null);
        term3710737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3710740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3710737, term3710737.getClass(), "str", null);
        setIntField(term3710737, term3710737.getClass(), "type", 37);
        setField(term3710737, term3710737.getClass(), "next", null);
        setField(term3710738, term3710738.getClass(), "str", null);
        setIntField(term3710738, term3710738.getClass(), "type", 35);
        setField(term3710739, term3710739.getClass(), "functionName", null);
        setBooleanField(term3710739, term3710739.getClass(), "itsNeedsActivation", false);
        setIntField(term3710739, term3710739.getClass(), "itsFunctionType", 0);
        setBooleanField(term3710739, term3710739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3710739, term3710739.getClass(), "encodedSourceStart", 0);
        setIntField(term3710739, term3710739.getClass(), "encodedSourceEnd", 0);
        setField(term3710739, term3710739.getClass(), "sourceName", null);
        setIntField(term3710739, term3710739.getClass(), "baseLineno", 0);
        setIntField(term3710739, term3710739.getClass(), "endLineno", 0);
        setField(term3710739, term3710739.getClass(), "functions", null);
        setField(term3710739, term3710739.getClass(), "regexps", null);
        setField(term3710739, term3710739.getClass(), "itsVariables", null);
        setField(term3710739, term3710739.getClass(), "itsConst", null);
        setField(term3710739, term3710739.getClass(), "itsVariableNames", null);
        setIntField(term3710739, term3710739.getClass(), "varStart", 0);
        setField(term3710739, term3710739.getClass(), "compilerData", null);
        setIntField(term3710739, term3710739.getClass(), "type", 43);
        setField(term3710739, term3710739.getClass(), "next", null);
        setField(term3710739, term3710739.getClass(), "first", null);
        setField(term3710739, term3710739.getClass(), "last", null);
        setField(term3710739, term3710739.getClass(), "propListHead", null);
        setIntField(term3710739, term3710739.getClass(), "sourcePosition", 0);
        setField(term3710739, term3710739.getClass(), "jsType", null);
        setField(term3710739, term3710739.getClass(), "parent", null);
        setField(term3710738, term3710738.getClass(), "next", term3710739);
        setField(term3710740, term3710740.getClass(), "str", null);
        setIntField(term3710740, term3710740.getClass(), "type", 40);
        setField(term3710741, term3710741.getClass(), "str", "");
        setIntField(term3710741, term3710741.getClass(), "type", 40);
        setField(term3710741, term3710741.getClass(), "next", null);
        setField(term3710741, term3710741.getClass(), "first", null);
        setField(term3710741, term3710741.getClass(), "last", null);
        setField(term3710741, term3710741.getClass(), "propListHead", null);
        setIntField(term3710741, term3710741.getClass(), "sourcePosition", 0);
        setField(term3710741, term3710741.getClass(), "jsType", null);
        setField(term3710741, term3710741.getClass(), "parent", null);
        setField(term3710740, term3710740.getClass(), "next", term3710741);
        setField(term3710740, term3710740.getClass(), "first", null);
        setField(term3710740, term3710740.getClass(), "last", null);
        setField(term3710740, term3710740.getClass(), "propListHead", null);
        setIntField(term3710740, term3710740.getClass(), "sourcePosition", 0);
        setField(term3710740, term3710740.getClass(), "jsType", null);
        setField(term3710740, term3710740.getClass(), "parent", null);
        setField(term3710738, term3710738.getClass(), "first", term3710740);
        setField(term3710738, term3710738.getClass(), "last", null);
        setField(term3710738, term3710738.getClass(), "propListHead", null);
        setIntField(term3710738, term3710738.getClass(), "sourcePosition", 0);
        setField(term3710738, term3710738.getClass(), "jsType", null);
        setField(term3710738, term3710738.getClass(), "parent", null);
        setField(term3710737, term3710737.getClass(), "first", term3710738);
        setField(term3710737, term3710737.getClass(), "last", null);
        setField(term3710737, term3710737.getClass(), "propListHead", null);
        setIntField(term3710737, term3710737.getClass(), "sourcePosition", 0);
        setField(term3710737, term3710737.getClass(), "jsType", null);
        setField(term3710737, term3710737.getClass(), "parent", null);
        term3710369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3710384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3710369, term3710369.getClass(), "str", null);
        setIntField(term3710369, term3710369.getClass(), "type", 37);
        setField(term3710369, term3710369.getClass(), "next", null);
        setField(term3710371, term3710371.getClass(), "str", null);
        setIntField(term3710371, term3710371.getClass(), "type", 35);
        setField(term3710373, term3710373.getClass(), "functionName", null);
        setBooleanField(term3710373, term3710373.getClass(), "itsNeedsActivation", false);
        setIntField(term3710373, term3710373.getClass(), "itsFunctionType", 0);
        setBooleanField(term3710373, term3710373.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3710373, term3710373.getClass(), "encodedSourceStart", 0);
        setIntField(term3710373, term3710373.getClass(), "encodedSourceEnd", 0);
        setField(term3710373, term3710373.getClass(), "sourceName", null);
        setIntField(term3710373, term3710373.getClass(), "baseLineno", 0);
        setIntField(term3710373, term3710373.getClass(), "endLineno", 0);
        setField(term3710373, term3710373.getClass(), "functions", null);
        setField(term3710373, term3710373.getClass(), "regexps", null);
        setField(term3710373, term3710373.getClass(), "itsVariables", null);
        setField(term3710373, term3710373.getClass(), "itsConst", null);
        setField(term3710373, term3710373.getClass(), "itsVariableNames", null);
        setIntField(term3710373, term3710373.getClass(), "varStart", 0);
        setField(term3710373, term3710373.getClass(), "compilerData", null);
        setIntField(term3710373, term3710373.getClass(), "type", 43);
        setField(term3710373, term3710373.getClass(), "next", null);
        setField(term3710373, term3710373.getClass(), "first", null);
        setField(term3710373, term3710373.getClass(), "last", null);
        setField(term3710373, term3710373.getClass(), "propListHead", null);
        setIntField(term3710373, term3710373.getClass(), "sourcePosition", 0);
        setField(term3710373, term3710373.getClass(), "jsType", null);
        setField(term3710373, term3710373.getClass(), "parent", null);
        setField(term3710371, term3710371.getClass(), "next", term3710373);
        setField(term3710384, term3710384.getClass(), "str", null);
        setIntField(term3710384, term3710384.getClass(), "type", 40);
        setField(term3710386, term3710386.getClass(), "str", "");
        setIntField(term3710386, term3710386.getClass(), "type", 40);
        setField(term3710386, term3710386.getClass(), "next", null);
        setField(term3710386, term3710386.getClass(), "first", null);
        setField(term3710386, term3710386.getClass(), "last", null);
        setField(term3710386, term3710386.getClass(), "propListHead", null);
        setIntField(term3710386, term3710386.getClass(), "sourcePosition", 0);
        setField(term3710386, term3710386.getClass(), "jsType", null);
        setField(term3710386, term3710386.getClass(), "parent", null);
        setField(term3710384, term3710384.getClass(), "next", term3710386);
        setField(term3710384, term3710384.getClass(), "first", null);
        setField(term3710384, term3710384.getClass(), "last", null);
        setField(term3710384, term3710384.getClass(), "propListHead", null);
        setIntField(term3710384, term3710384.getClass(), "sourcePosition", 0);
        setField(term3710384, term3710384.getClass(), "jsType", null);
        setField(term3710384, term3710384.getClass(), "parent", null);
        setField(term3710371, term3710371.getClass(), "first", term3710384);
        setField(term3710371, term3710371.getClass(), "last", null);
        setField(term3710371, term3710371.getClass(), "propListHead", null);
        setIntField(term3710371, term3710371.getClass(), "sourcePosition", 0);
        setField(term3710371, term3710371.getClass(), "jsType", null);
        setField(term3710371, term3710371.getClass(), "parent", null);
        setField(term3710369, term3710369.getClass(), "first", term3710371);
        setField(term3710369, term3710369.getClass(), "last", null);
        setField(term3710369, term3710369.getClass(), "propListHead", null);
        setIntField(term3710369, term3710369.getClass(), "sourcePosition", 0);
        setField(term3710369, term3710369.getClass(), "jsType", null);
        setField(term3710369, term3710369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3709047;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3708955, args);
        assertTrue(recursiveEquals(term3708955, term3710736));
        assertTrue(recursiveEquals(term3709047, term3710737));
        assertTrue(recursiveEquals(retValue, term3710369));
    }

};


