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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65755;
     Object term65841;
     Object term66556;
     Object term66557;
     Object term66482;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65927 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term65927, term65927.getClass(), "next", term66019);
        setIntField(term65927, term65927.getClass(), "type", 16);
        setField(term65841, term65841.getClass(), "first", term65927);
        setIntField(term65841, term65841.getClass(), "type", 16);
        term66556 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term66556, term66556.getClass(), "currentTraversal", null);
        term66557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term66557, term66557.getClass(), "functionName", null);
        setBooleanField(term66557, term66557.getClass(), "itsNeedsActivation", false);
        setIntField(term66557, term66557.getClass(), "itsFunctionType", 0);
        setBooleanField(term66557, term66557.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66557, term66557.getClass(), "encodedSourceStart", 0);
        setIntField(term66557, term66557.getClass(), "encodedSourceEnd", 0);
        setField(term66557, term66557.getClass(), "sourceName", null);
        setIntField(term66557, term66557.getClass(), "baseLineno", 0);
        setIntField(term66557, term66557.getClass(), "endLineno", 0);
        setField(term66557, term66557.getClass(), "functions", null);
        setField(term66557, term66557.getClass(), "regexps", null);
        setField(term66557, term66557.getClass(), "itsVariables", null);
        setField(term66557, term66557.getClass(), "itsConst", null);
        setField(term66557, term66557.getClass(), "itsVariableNames", null);
        setIntField(term66557, term66557.getClass(), "varStart", 0);
        setField(term66557, term66557.getClass(), "compilerData", null);
        setIntField(term66557, term66557.getClass(), "type", 16);
        setField(term66557, term66557.getClass(), "next", null);
        setField(term66558, term66558.getClass(), "functionName", null);
        setBooleanField(term66558, term66558.getClass(), "itsNeedsActivation", false);
        setIntField(term66558, term66558.getClass(), "itsFunctionType", 0);
        setBooleanField(term66558, term66558.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66558, term66558.getClass(), "encodedSourceStart", 0);
        setIntField(term66558, term66558.getClass(), "encodedSourceEnd", 0);
        setField(term66558, term66558.getClass(), "sourceName", null);
        setIntField(term66558, term66558.getClass(), "baseLineno", 0);
        setIntField(term66558, term66558.getClass(), "endLineno", 0);
        setField(term66558, term66558.getClass(), "functions", null);
        setField(term66558, term66558.getClass(), "regexps", null);
        setField(term66558, term66558.getClass(), "itsVariables", null);
        setField(term66558, term66558.getClass(), "itsConst", null);
        setField(term66558, term66558.getClass(), "itsVariableNames", null);
        setIntField(term66558, term66558.getClass(), "varStart", 0);
        setField(term66558, term66558.getClass(), "compilerData", null);
        setIntField(term66558, term66558.getClass(), "type", 16);
        setField(term66559, term66559.getClass(), "str", null);
        setIntField(term66559, term66559.getClass(), "type", 0);
        setField(term66559, term66559.getClass(), "next", null);
        setField(term66559, term66559.getClass(), "first", null);
        setField(term66559, term66559.getClass(), "last", null);
        setField(term66559, term66559.getClass(), "propListHead", null);
        setIntField(term66559, term66559.getClass(), "sourcePosition", 0);
        setField(term66559, term66559.getClass(), "jsType", null);
        setField(term66559, term66559.getClass(), "parent", null);
        setField(term66558, term66558.getClass(), "next", term66559);
        setField(term66558, term66558.getClass(), "first", null);
        setField(term66558, term66558.getClass(), "last", null);
        setField(term66558, term66558.getClass(), "propListHead", null);
        setIntField(term66558, term66558.getClass(), "sourcePosition", 0);
        setField(term66558, term66558.getClass(), "jsType", null);
        setField(term66558, term66558.getClass(), "parent", null);
        setField(term66557, term66557.getClass(), "first", term66558);
        setField(term66557, term66557.getClass(), "last", null);
        setField(term66557, term66557.getClass(), "propListHead", null);
        setIntField(term66557, term66557.getClass(), "sourcePosition", 0);
        setField(term66557, term66557.getClass(), "jsType", null);
        setField(term66557, term66557.getClass(), "parent", null);
        term66482 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term66482, term66482.getClass(), "functionName", null);
        setBooleanField(term66482, term66482.getClass(), "itsNeedsActivation", false);
        setIntField(term66482, term66482.getClass(), "itsFunctionType", 0);
        setBooleanField(term66482, term66482.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66482, term66482.getClass(), "encodedSourceStart", 0);
        setIntField(term66482, term66482.getClass(), "encodedSourceEnd", 0);
        setField(term66482, term66482.getClass(), "sourceName", null);
        setIntField(term66482, term66482.getClass(), "baseLineno", 0);
        setIntField(term66482, term66482.getClass(), "endLineno", 0);
        setField(term66482, term66482.getClass(), "functions", null);
        setField(term66482, term66482.getClass(), "regexps", null);
        setField(term66482, term66482.getClass(), "itsVariables", null);
        setField(term66482, term66482.getClass(), "itsConst", null);
        setField(term66482, term66482.getClass(), "itsVariableNames", null);
        setIntField(term66482, term66482.getClass(), "varStart", 0);
        setField(term66482, term66482.getClass(), "compilerData", null);
        setIntField(term66482, term66482.getClass(), "type", 16);
        setField(term66482, term66482.getClass(), "next", null);
        setField(term66492, term66492.getClass(), "functionName", null);
        setBooleanField(term66492, term66492.getClass(), "itsNeedsActivation", false);
        setIntField(term66492, term66492.getClass(), "itsFunctionType", 0);
        setBooleanField(term66492, term66492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66492, term66492.getClass(), "encodedSourceStart", 0);
        setIntField(term66492, term66492.getClass(), "encodedSourceEnd", 0);
        setField(term66492, term66492.getClass(), "sourceName", null);
        setIntField(term66492, term66492.getClass(), "baseLineno", 0);
        setIntField(term66492, term66492.getClass(), "endLineno", 0);
        setField(term66492, term66492.getClass(), "functions", null);
        setField(term66492, term66492.getClass(), "regexps", null);
        setField(term66492, term66492.getClass(), "itsVariables", null);
        setField(term66492, term66492.getClass(), "itsConst", null);
        setField(term66492, term66492.getClass(), "itsVariableNames", null);
        setIntField(term66492, term66492.getClass(), "varStart", 0);
        setField(term66492, term66492.getClass(), "compilerData", null);
        setIntField(term66492, term66492.getClass(), "type", 16);
        setField(term66502, term66502.getClass(), "str", null);
        setIntField(term66502, term66502.getClass(), "type", 0);
        setField(term66502, term66502.getClass(), "next", null);
        setField(term66502, term66502.getClass(), "first", null);
        setField(term66502, term66502.getClass(), "last", null);
        setField(term66502, term66502.getClass(), "propListHead", null);
        setIntField(term66502, term66502.getClass(), "sourcePosition", 0);
        setField(term66502, term66502.getClass(), "jsType", null);
        setField(term66502, term66502.getClass(), "parent", null);
        setField(term66492, term66492.getClass(), "next", term66502);
        setField(term66492, term66492.getClass(), "first", null);
        setField(term66492, term66492.getClass(), "last", null);
        setField(term66492, term66492.getClass(), "propListHead", null);
        setIntField(term66492, term66492.getClass(), "sourcePosition", 0);
        setField(term66492, term66492.getClass(), "jsType", null);
        setField(term66492, term66492.getClass(), "parent", null);
        setField(term66482, term66482.getClass(), "first", term66492);
        setField(term66482, term66482.getClass(), "last", null);
        setField(term66482, term66482.getClass(), "propListHead", null);
        setIntField(term66482, term66482.getClass(), "sourcePosition", 0);
        setField(term66482, term66482.getClass(), "jsType", null);
        setField(term66482, term66482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65841;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term65755, args);
        assertTrue(recursiveEquals(term65755, term66556));
        assertTrue(recursiveEquals(term65841, term66557));
        assertTrue(recursiveEquals(retValue, term66482));
    }

};


