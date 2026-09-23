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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538403;
     Object term538495;
     Object term539099;
     Object term539100;
     Object term539037;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term538495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term538581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term538581, term538581.getClass(), "next", term538673);
        setIntField(term538581, term538581.getClass(), "type", 108);
        setField(term538495, term538495.getClass(), "first", term538581);
        setIntField(term538495, term538495.getClass(), "type", 14);
        term539099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term539099, term539099.getClass(), "currentTraversal", null);
        term539100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term539101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term539100, term539100.getClass(), "number", 0.0);
        setIntField(term539100, term539100.getClass(), "type", 14);
        setField(term539100, term539100.getClass(), "next", null);
        setField(term539101, term539101.getClass(), "functionName", null);
        setBooleanField(term539101, term539101.getClass(), "itsNeedsActivation", false);
        setIntField(term539101, term539101.getClass(), "itsFunctionType", 0);
        setBooleanField(term539101, term539101.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term539101, term539101.getClass(), "encodedSourceStart", 0);
        setIntField(term539101, term539101.getClass(), "encodedSourceEnd", 0);
        setField(term539101, term539101.getClass(), "sourceName", null);
        setIntField(term539101, term539101.getClass(), "baseLineno", 0);
        setIntField(term539101, term539101.getClass(), "endLineno", 0);
        setField(term539101, term539101.getClass(), "functions", null);
        setField(term539101, term539101.getClass(), "regexps", null);
        setField(term539101, term539101.getClass(), "itsVariables", null);
        setField(term539101, term539101.getClass(), "itsConst", null);
        setField(term539101, term539101.getClass(), "itsVariableNames", null);
        setIntField(term539101, term539101.getClass(), "varStart", 0);
        setField(term539101, term539101.getClass(), "compilerData", null);
        setIntField(term539101, term539101.getClass(), "type", 108);
        setField(term539102, term539102.getClass(), "str", null);
        setIntField(term539102, term539102.getClass(), "type", 0);
        setField(term539102, term539102.getClass(), "next", null);
        setField(term539102, term539102.getClass(), "first", null);
        setField(term539102, term539102.getClass(), "last", null);
        setField(term539102, term539102.getClass(), "propListHead", null);
        setIntField(term539102, term539102.getClass(), "sourcePosition", 0);
        setField(term539102, term539102.getClass(), "jsType", null);
        setField(term539102, term539102.getClass(), "parent", null);
        setField(term539101, term539101.getClass(), "next", term539102);
        setField(term539101, term539101.getClass(), "first", null);
        setField(term539101, term539101.getClass(), "last", null);
        setField(term539101, term539101.getClass(), "propListHead", null);
        setIntField(term539101, term539101.getClass(), "sourcePosition", 0);
        setField(term539101, term539101.getClass(), "jsType", null);
        setField(term539101, term539101.getClass(), "parent", null);
        setField(term539100, term539100.getClass(), "first", term539101);
        setField(term539100, term539100.getClass(), "last", null);
        setField(term539100, term539100.getClass(), "propListHead", null);
        setIntField(term539100, term539100.getClass(), "sourcePosition", 0);
        setField(term539100, term539100.getClass(), "jsType", null);
        setField(term539100, term539100.getClass(), "parent", null);
        term539037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term539040 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term539037, term539037.getClass(), "number", 0.0);
        setIntField(term539037, term539037.getClass(), "type", 14);
        setField(term539037, term539037.getClass(), "next", null);
        setField(term539040, term539040.getClass(), "functionName", null);
        setBooleanField(term539040, term539040.getClass(), "itsNeedsActivation", false);
        setIntField(term539040, term539040.getClass(), "itsFunctionType", 0);
        setBooleanField(term539040, term539040.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term539040, term539040.getClass(), "encodedSourceStart", 0);
        setIntField(term539040, term539040.getClass(), "encodedSourceEnd", 0);
        setField(term539040, term539040.getClass(), "sourceName", null);
        setIntField(term539040, term539040.getClass(), "baseLineno", 0);
        setIntField(term539040, term539040.getClass(), "endLineno", 0);
        setField(term539040, term539040.getClass(), "functions", null);
        setField(term539040, term539040.getClass(), "regexps", null);
        setField(term539040, term539040.getClass(), "itsVariables", null);
        setField(term539040, term539040.getClass(), "itsConst", null);
        setField(term539040, term539040.getClass(), "itsVariableNames", null);
        setIntField(term539040, term539040.getClass(), "varStart", 0);
        setField(term539040, term539040.getClass(), "compilerData", null);
        setIntField(term539040, term539040.getClass(), "type", 108);
        setField(term539050, term539050.getClass(), "str", null);
        setIntField(term539050, term539050.getClass(), "type", 0);
        setField(term539050, term539050.getClass(), "next", null);
        setField(term539050, term539050.getClass(), "first", null);
        setField(term539050, term539050.getClass(), "last", null);
        setField(term539050, term539050.getClass(), "propListHead", null);
        setIntField(term539050, term539050.getClass(), "sourcePosition", 0);
        setField(term539050, term539050.getClass(), "jsType", null);
        setField(term539050, term539050.getClass(), "parent", null);
        setField(term539040, term539040.getClass(), "next", term539050);
        setField(term539040, term539040.getClass(), "first", null);
        setField(term539040, term539040.getClass(), "last", null);
        setField(term539040, term539040.getClass(), "propListHead", null);
        setIntField(term539040, term539040.getClass(), "sourcePosition", 0);
        setField(term539040, term539040.getClass(), "jsType", null);
        setField(term539040, term539040.getClass(), "parent", null);
        setField(term539037, term539037.getClass(), "first", term539040);
        setField(term539037, term539037.getClass(), "last", null);
        setField(term539037, term539037.getClass(), "propListHead", null);
        setIntField(term539037, term539037.getClass(), "sourcePosition", 0);
        setField(term539037, term539037.getClass(), "jsType", null);
        setField(term539037, term539037.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term538495;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term538403, args);
        assertTrue(recursiveEquals(term538403, term539099));
        assertTrue(recursiveEquals(term538495, term539100));
        assertTrue(recursiveEquals(retValue, term539037));
    }

};


