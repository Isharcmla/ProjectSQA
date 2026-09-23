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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178306;
     Object term178398;
     Object term178713;
     Object term178714;
     Object term178636;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term178398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term178490, term178490.getClass(), "next", term178576);
        setIntField(term178490, term178490.getClass(), "type", 0);
        setField(term178398, term178398.getClass(), "first", term178490);
        setIntField(term178398, term178398.getClass(), "type", 100);
        setField(term178398, term178398.getClass(), "parent", null);
        term178713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term178713, term178713.getClass(), "currentTraversal", null);
        term178714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term178714, term178714.getClass(), "str", null);
        setIntField(term178714, term178714.getClass(), "type", 100);
        setField(term178714, term178714.getClass(), "next", null);
        setField(term178715, term178715.getClass(), "str", null);
        setIntField(term178715, term178715.getClass(), "type", 0);
        setField(term178716, term178716.getClass(), "functionName", null);
        setBooleanField(term178716, term178716.getClass(), "itsNeedsActivation", false);
        setIntField(term178716, term178716.getClass(), "itsFunctionType", 0);
        setBooleanField(term178716, term178716.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178716, term178716.getClass(), "encodedSourceStart", 0);
        setIntField(term178716, term178716.getClass(), "encodedSourceEnd", 0);
        setField(term178716, term178716.getClass(), "sourceName", null);
        setIntField(term178716, term178716.getClass(), "baseLineno", 0);
        setIntField(term178716, term178716.getClass(), "endLineno", 0);
        setField(term178716, term178716.getClass(), "functions", null);
        setField(term178716, term178716.getClass(), "regexps", null);
        setField(term178716, term178716.getClass(), "itsVariables", null);
        setField(term178716, term178716.getClass(), "itsConst", null);
        setField(term178716, term178716.getClass(), "itsVariableNames", null);
        setIntField(term178716, term178716.getClass(), "varStart", 0);
        setField(term178716, term178716.getClass(), "compilerData", null);
        setIntField(term178716, term178716.getClass(), "type", 0);
        setField(term178716, term178716.getClass(), "next", null);
        setField(term178716, term178716.getClass(), "first", null);
        setField(term178716, term178716.getClass(), "last", null);
        setField(term178716, term178716.getClass(), "propListHead", null);
        setIntField(term178716, term178716.getClass(), "sourcePosition", 0);
        setField(term178716, term178716.getClass(), "jsType", null);
        setField(term178716, term178716.getClass(), "parent", null);
        setField(term178715, term178715.getClass(), "next", term178716);
        setField(term178715, term178715.getClass(), "first", null);
        setField(term178715, term178715.getClass(), "last", null);
        setField(term178715, term178715.getClass(), "propListHead", null);
        setIntField(term178715, term178715.getClass(), "sourcePosition", 0);
        setField(term178715, term178715.getClass(), "jsType", null);
        setField(term178715, term178715.getClass(), "parent", null);
        setField(term178714, term178714.getClass(), "first", term178715);
        setField(term178714, term178714.getClass(), "last", null);
        setField(term178714, term178714.getClass(), "propListHead", null);
        setIntField(term178714, term178714.getClass(), "sourcePosition", 0);
        setField(term178714, term178714.getClass(), "jsType", null);
        setField(term178714, term178714.getClass(), "parent", null);
        term178636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term178636, term178636.getClass(), "str", null);
        setIntField(term178636, term178636.getClass(), "type", 100);
        setField(term178636, term178636.getClass(), "next", null);
        setField(term178638, term178638.getClass(), "str", null);
        setIntField(term178638, term178638.getClass(), "type", 0);
        setField(term178640, term178640.getClass(), "functionName", null);
        setBooleanField(term178640, term178640.getClass(), "itsNeedsActivation", false);
        setIntField(term178640, term178640.getClass(), "itsFunctionType", 0);
        setBooleanField(term178640, term178640.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178640, term178640.getClass(), "encodedSourceStart", 0);
        setIntField(term178640, term178640.getClass(), "encodedSourceEnd", 0);
        setField(term178640, term178640.getClass(), "sourceName", null);
        setIntField(term178640, term178640.getClass(), "baseLineno", 0);
        setIntField(term178640, term178640.getClass(), "endLineno", 0);
        setField(term178640, term178640.getClass(), "functions", null);
        setField(term178640, term178640.getClass(), "regexps", null);
        setField(term178640, term178640.getClass(), "itsVariables", null);
        setField(term178640, term178640.getClass(), "itsConst", null);
        setField(term178640, term178640.getClass(), "itsVariableNames", null);
        setIntField(term178640, term178640.getClass(), "varStart", 0);
        setField(term178640, term178640.getClass(), "compilerData", null);
        setIntField(term178640, term178640.getClass(), "type", 0);
        setField(term178640, term178640.getClass(), "next", null);
        setField(term178640, term178640.getClass(), "first", null);
        setField(term178640, term178640.getClass(), "last", null);
        setField(term178640, term178640.getClass(), "propListHead", null);
        setIntField(term178640, term178640.getClass(), "sourcePosition", 0);
        setField(term178640, term178640.getClass(), "jsType", null);
        setField(term178640, term178640.getClass(), "parent", null);
        setField(term178638, term178638.getClass(), "next", term178640);
        setField(term178638, term178638.getClass(), "first", null);
        setField(term178638, term178638.getClass(), "last", null);
        setField(term178638, term178638.getClass(), "propListHead", null);
        setIntField(term178638, term178638.getClass(), "sourcePosition", 0);
        setField(term178638, term178638.getClass(), "jsType", null);
        setField(term178638, term178638.getClass(), "parent", null);
        setField(term178636, term178636.getClass(), "first", term178638);
        setField(term178636, term178636.getClass(), "last", null);
        setField(term178636, term178636.getClass(), "propListHead", null);
        setIntField(term178636, term178636.getClass(), "sourcePosition", 0);
        setField(term178636, term178636.getClass(), "jsType", null);
        setField(term178636, term178636.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term178398;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term178306, args);
        assertTrue(recursiveEquals(term178306, term178713));
        assertTrue(recursiveEquals(term178398, term178714));
        assertTrue(recursiveEquals(retValue, term178636));
    }

};


