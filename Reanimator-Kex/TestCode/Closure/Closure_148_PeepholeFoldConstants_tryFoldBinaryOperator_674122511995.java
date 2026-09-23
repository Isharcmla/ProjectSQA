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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232503;
     Object term232595;
     Object term233159;
     Object term233160;
     Object term233102;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term232595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term232687, term232687.getClass(), "next", term232773);
        setIntField(term232687, term232687.getClass(), "type", 63);
        setField(term232595, term232595.getClass(), "first", term232687);
        setIntField(term232595, term232595.getClass(), "type", 35);
        term233159 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term233159, term233159.getClass(), "currentTraversal", null);
        term233160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233162 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term233160, term233160.getClass(), "str", null);
        setIntField(term233160, term233160.getClass(), "type", 35);
        setField(term233160, term233160.getClass(), "next", null);
        setField(term233161, term233161.getClass(), "str", null);
        setIntField(term233161, term233161.getClass(), "type", 63);
        setField(term233162, term233162.getClass(), "functionName", null);
        setBooleanField(term233162, term233162.getClass(), "itsNeedsActivation", false);
        setIntField(term233162, term233162.getClass(), "itsFunctionType", 0);
        setBooleanField(term233162, term233162.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233162, term233162.getClass(), "encodedSourceStart", 0);
        setIntField(term233162, term233162.getClass(), "encodedSourceEnd", 0);
        setField(term233162, term233162.getClass(), "sourceName", null);
        setIntField(term233162, term233162.getClass(), "baseLineno", 0);
        setIntField(term233162, term233162.getClass(), "endLineno", 0);
        setField(term233162, term233162.getClass(), "functions", null);
        setField(term233162, term233162.getClass(), "regexps", null);
        setField(term233162, term233162.getClass(), "itsVariables", null);
        setField(term233162, term233162.getClass(), "itsConst", null);
        setField(term233162, term233162.getClass(), "itsVariableNames", null);
        setIntField(term233162, term233162.getClass(), "varStart", 0);
        setField(term233162, term233162.getClass(), "compilerData", null);
        setIntField(term233162, term233162.getClass(), "type", 0);
        setField(term233162, term233162.getClass(), "next", null);
        setField(term233162, term233162.getClass(), "first", null);
        setField(term233162, term233162.getClass(), "last", null);
        setField(term233162, term233162.getClass(), "propListHead", null);
        setIntField(term233162, term233162.getClass(), "sourcePosition", 0);
        setField(term233162, term233162.getClass(), "jsType", null);
        setField(term233162, term233162.getClass(), "parent", null);
        setField(term233161, term233161.getClass(), "next", term233162);
        setField(term233161, term233161.getClass(), "first", null);
        setField(term233161, term233161.getClass(), "last", null);
        setField(term233161, term233161.getClass(), "propListHead", null);
        setIntField(term233161, term233161.getClass(), "sourcePosition", 0);
        setField(term233161, term233161.getClass(), "jsType", null);
        setField(term233161, term233161.getClass(), "parent", null);
        setField(term233160, term233160.getClass(), "first", term233161);
        setField(term233160, term233160.getClass(), "last", null);
        setField(term233160, term233160.getClass(), "propListHead", null);
        setIntField(term233160, term233160.getClass(), "sourcePosition", 0);
        setField(term233160, term233160.getClass(), "jsType", null);
        setField(term233160, term233160.getClass(), "parent", null);
        term233102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term233102, term233102.getClass(), "str", null);
        setIntField(term233102, term233102.getClass(), "type", 35);
        setField(term233102, term233102.getClass(), "next", null);
        setField(term233104, term233104.getClass(), "str", null);
        setIntField(term233104, term233104.getClass(), "type", 63);
        setField(term233106, term233106.getClass(), "functionName", null);
        setBooleanField(term233106, term233106.getClass(), "itsNeedsActivation", false);
        setIntField(term233106, term233106.getClass(), "itsFunctionType", 0);
        setBooleanField(term233106, term233106.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233106, term233106.getClass(), "encodedSourceStart", 0);
        setIntField(term233106, term233106.getClass(), "encodedSourceEnd", 0);
        setField(term233106, term233106.getClass(), "sourceName", null);
        setIntField(term233106, term233106.getClass(), "baseLineno", 0);
        setIntField(term233106, term233106.getClass(), "endLineno", 0);
        setField(term233106, term233106.getClass(), "functions", null);
        setField(term233106, term233106.getClass(), "regexps", null);
        setField(term233106, term233106.getClass(), "itsVariables", null);
        setField(term233106, term233106.getClass(), "itsConst", null);
        setField(term233106, term233106.getClass(), "itsVariableNames", null);
        setIntField(term233106, term233106.getClass(), "varStart", 0);
        setField(term233106, term233106.getClass(), "compilerData", null);
        setIntField(term233106, term233106.getClass(), "type", 0);
        setField(term233106, term233106.getClass(), "next", null);
        setField(term233106, term233106.getClass(), "first", null);
        setField(term233106, term233106.getClass(), "last", null);
        setField(term233106, term233106.getClass(), "propListHead", null);
        setIntField(term233106, term233106.getClass(), "sourcePosition", 0);
        setField(term233106, term233106.getClass(), "jsType", null);
        setField(term233106, term233106.getClass(), "parent", null);
        setField(term233104, term233104.getClass(), "next", term233106);
        setField(term233104, term233104.getClass(), "first", null);
        setField(term233104, term233104.getClass(), "last", null);
        setField(term233104, term233104.getClass(), "propListHead", null);
        setIntField(term233104, term233104.getClass(), "sourcePosition", 0);
        setField(term233104, term233104.getClass(), "jsType", null);
        setField(term233104, term233104.getClass(), "parent", null);
        setField(term233102, term233102.getClass(), "first", term233104);
        setField(term233102, term233102.getClass(), "last", null);
        setField(term233102, term233102.getClass(), "propListHead", null);
        setIntField(term233102, term233102.getClass(), "sourcePosition", 0);
        setField(term233102, term233102.getClass(), "jsType", null);
        setField(term233102, term233102.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term232595;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term232503, args);
        assertTrue(recursiveEquals(term232503, term233159));
        assertTrue(recursiveEquals(term232595, term233160));
        assertTrue(recursiveEquals(retValue, term233102));
    }

};


