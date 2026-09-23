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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3677535;
     Object term3677627;
     Object term3678513;
     Object term3678514;
     Object term3678124;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3677535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3677627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3677719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3677811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3677903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3677719, term3677719.getClass(), "type", 35);
        setIntField(term3677903, term3677903.getClass(), "type", 40);
        setField(term3677903, term3677903.getClass(), "str", "indexOf");
        setField(term3677811, term3677811.getClass(), "next", term3677903);
        setIntField(term3677811, term3677811.getClass(), "type", 40);
        setField(term3677811, term3677811.getClass(), "str", null);
        setField(term3677719, term3677719.getClass(), "first", term3677811);
        setIntField(term3678027, term3678027.getClass(), "type", 43);
        setField(term3678027, term3678027.getClass(), "next", term3677903);
        setField(term3677719, term3677719.getClass(), "next", term3678027);
        setField(term3677627, term3677627.getClass(), "first", term3677719);
        setIntField(term3677627, term3677627.getClass(), "type", 37);
        term3678513 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3678513, term3678513.getClass(), "currentTraversal", null);
        term3678514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3678517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3678514, term3678514.getClass(), "str", null);
        setIntField(term3678514, term3678514.getClass(), "type", 37);
        setField(term3678514, term3678514.getClass(), "next", null);
        setField(term3678515, term3678515.getClass(), "str", null);
        setIntField(term3678515, term3678515.getClass(), "type", 35);
        setField(term3678516, term3678516.getClass(), "functionName", null);
        setBooleanField(term3678516, term3678516.getClass(), "itsNeedsActivation", false);
        setIntField(term3678516, term3678516.getClass(), "itsFunctionType", 0);
        setBooleanField(term3678516, term3678516.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3678516, term3678516.getClass(), "encodedSourceStart", 0);
        setIntField(term3678516, term3678516.getClass(), "encodedSourceEnd", 0);
        setField(term3678516, term3678516.getClass(), "sourceName", null);
        setIntField(term3678516, term3678516.getClass(), "baseLineno", 0);
        setIntField(term3678516, term3678516.getClass(), "endLineno", 0);
        setField(term3678516, term3678516.getClass(), "functions", null);
        setField(term3678516, term3678516.getClass(), "regexps", null);
        setField(term3678516, term3678516.getClass(), "itsVariables", null);
        setField(term3678516, term3678516.getClass(), "itsConst", null);
        setField(term3678516, term3678516.getClass(), "itsVariableNames", null);
        setIntField(term3678516, term3678516.getClass(), "varStart", 0);
        setField(term3678516, term3678516.getClass(), "compilerData", null);
        setIntField(term3678516, term3678516.getClass(), "type", 43);
        setField(term3678517, term3678517.getClass(), "str", "");
        setIntField(term3678517, term3678517.getClass(), "type", 40);
        setField(term3678517, term3678517.getClass(), "next", null);
        setField(term3678517, term3678517.getClass(), "first", null);
        setField(term3678517, term3678517.getClass(), "last", null);
        setField(term3678517, term3678517.getClass(), "propListHead", null);
        setIntField(term3678517, term3678517.getClass(), "sourcePosition", 0);
        setField(term3678517, term3678517.getClass(), "jsType", null);
        setField(term3678517, term3678517.getClass(), "parent", null);
        setField(term3678516, term3678516.getClass(), "next", term3678517);
        setField(term3678516, term3678516.getClass(), "first", null);
        setField(term3678516, term3678516.getClass(), "last", null);
        setField(term3678516, term3678516.getClass(), "propListHead", null);
        setIntField(term3678516, term3678516.getClass(), "sourcePosition", 0);
        setField(term3678516, term3678516.getClass(), "jsType", null);
        setField(term3678516, term3678516.getClass(), "parent", null);
        setField(term3678515, term3678515.getClass(), "next", term3678516);
        setField(term3678519, term3678519.getClass(), "str", null);
        setIntField(term3678519, term3678519.getClass(), "type", 40);
        setField(term3678519, term3678519.getClass(), "next", term3678517);
        setField(term3678519, term3678519.getClass(), "first", null);
        setField(term3678519, term3678519.getClass(), "last", null);
        setField(term3678519, term3678519.getClass(), "propListHead", null);
        setIntField(term3678519, term3678519.getClass(), "sourcePosition", 0);
        setField(term3678519, term3678519.getClass(), "jsType", null);
        setField(term3678519, term3678519.getClass(), "parent", null);
        setField(term3678515, term3678515.getClass(), "first", term3678519);
        setField(term3678515, term3678515.getClass(), "last", null);
        setField(term3678515, term3678515.getClass(), "propListHead", null);
        setIntField(term3678515, term3678515.getClass(), "sourcePosition", 0);
        setField(term3678515, term3678515.getClass(), "jsType", null);
        setField(term3678515, term3678515.getClass(), "parent", null);
        setField(term3678514, term3678514.getClass(), "first", term3678515);
        setField(term3678514, term3678514.getClass(), "last", null);
        setField(term3678514, term3678514.getClass(), "propListHead", null);
        setIntField(term3678514, term3678514.getClass(), "sourcePosition", 0);
        setField(term3678514, term3678514.getClass(), "jsType", null);
        setField(term3678514, term3678514.getClass(), "parent", null);
        term3678124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3678138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3678143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3678124, term3678124.getClass(), "str", null);
        setIntField(term3678124, term3678124.getClass(), "type", 37);
        setField(term3678124, term3678124.getClass(), "next", null);
        setField(term3678126, term3678126.getClass(), "str", null);
        setIntField(term3678126, term3678126.getClass(), "type", 35);
        setField(term3678128, term3678128.getClass(), "functionName", null);
        setBooleanField(term3678128, term3678128.getClass(), "itsNeedsActivation", false);
        setIntField(term3678128, term3678128.getClass(), "itsFunctionType", 0);
        setBooleanField(term3678128, term3678128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3678128, term3678128.getClass(), "encodedSourceStart", 0);
        setIntField(term3678128, term3678128.getClass(), "encodedSourceEnd", 0);
        setField(term3678128, term3678128.getClass(), "sourceName", null);
        setIntField(term3678128, term3678128.getClass(), "baseLineno", 0);
        setIntField(term3678128, term3678128.getClass(), "endLineno", 0);
        setField(term3678128, term3678128.getClass(), "functions", null);
        setField(term3678128, term3678128.getClass(), "regexps", null);
        setField(term3678128, term3678128.getClass(), "itsVariables", null);
        setField(term3678128, term3678128.getClass(), "itsConst", null);
        setField(term3678128, term3678128.getClass(), "itsVariableNames", null);
        setIntField(term3678128, term3678128.getClass(), "varStart", 0);
        setField(term3678128, term3678128.getClass(), "compilerData", null);
        setIntField(term3678128, term3678128.getClass(), "type", 43);
        setField(term3678138, term3678138.getClass(), "str", "");
        setIntField(term3678138, term3678138.getClass(), "type", 40);
        setField(term3678138, term3678138.getClass(), "next", null);
        setField(term3678138, term3678138.getClass(), "first", null);
        setField(term3678138, term3678138.getClass(), "last", null);
        setField(term3678138, term3678138.getClass(), "propListHead", null);
        setIntField(term3678138, term3678138.getClass(), "sourcePosition", 0);
        setField(term3678138, term3678138.getClass(), "jsType", null);
        setField(term3678138, term3678138.getClass(), "parent", null);
        setField(term3678128, term3678128.getClass(), "next", term3678138);
        setField(term3678128, term3678128.getClass(), "first", null);
        setField(term3678128, term3678128.getClass(), "last", null);
        setField(term3678128, term3678128.getClass(), "propListHead", null);
        setIntField(term3678128, term3678128.getClass(), "sourcePosition", 0);
        setField(term3678128, term3678128.getClass(), "jsType", null);
        setField(term3678128, term3678128.getClass(), "parent", null);
        setField(term3678126, term3678126.getClass(), "next", term3678128);
        setField(term3678143, term3678143.getClass(), "str", null);
        setIntField(term3678143, term3678143.getClass(), "type", 40);
        setField(term3678143, term3678143.getClass(), "next", term3678138);
        setField(term3678143, term3678143.getClass(), "first", null);
        setField(term3678143, term3678143.getClass(), "last", null);
        setField(term3678143, term3678143.getClass(), "propListHead", null);
        setIntField(term3678143, term3678143.getClass(), "sourcePosition", 0);
        setField(term3678143, term3678143.getClass(), "jsType", null);
        setField(term3678143, term3678143.getClass(), "parent", null);
        setField(term3678126, term3678126.getClass(), "first", term3678143);
        setField(term3678126, term3678126.getClass(), "last", null);
        setField(term3678126, term3678126.getClass(), "propListHead", null);
        setIntField(term3678126, term3678126.getClass(), "sourcePosition", 0);
        setField(term3678126, term3678126.getClass(), "jsType", null);
        setField(term3678126, term3678126.getClass(), "parent", null);
        setField(term3678124, term3678124.getClass(), "first", term3678126);
        setField(term3678124, term3678124.getClass(), "last", null);
        setField(term3678124, term3678124.getClass(), "propListHead", null);
        setIntField(term3678124, term3678124.getClass(), "sourcePosition", 0);
        setField(term3678124, term3678124.getClass(), "jsType", null);
        setField(term3678124, term3678124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3677627;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3677535, args);
        assertTrue(recursiveEquals(term3677535, term3678513));
        assertTrue(recursiveEquals(term3677627, term3678514));
        assertTrue(recursiveEquals(retValue, term3678124));
    }

};


