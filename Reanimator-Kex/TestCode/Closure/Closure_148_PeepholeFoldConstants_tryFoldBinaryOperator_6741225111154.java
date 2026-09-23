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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272302;
     Object term272394;
     Object term272795;
     Object term272796;
     Object term272714;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272302 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term272394 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272486 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term272486, term272486.getClass(), "next", term272572);
        setIntField(term272486, term272486.getClass(), "type", 0);
        setField(term272394, term272394.getClass(), "first", term272486);
        setIntField(term272394, term272394.getClass(), "type", 101);
        setField(term272394, term272394.getClass(), "parent", null);
        term272795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term272795, term272795.getClass(), "currentTraversal", null);
        term272796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term272796, term272796.getClass(), "number", 0.0);
        setIntField(term272796, term272796.getClass(), "type", 101);
        setField(term272796, term272796.getClass(), "next", null);
        setDoubleField(term272797, term272797.getClass(), "number", 0.0);
        setIntField(term272797, term272797.getClass(), "type", 0);
        setField(term272798, term272798.getClass(), "functionName", null);
        setBooleanField(term272798, term272798.getClass(), "itsNeedsActivation", false);
        setIntField(term272798, term272798.getClass(), "itsFunctionType", 0);
        setBooleanField(term272798, term272798.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term272798, term272798.getClass(), "encodedSourceStart", 0);
        setIntField(term272798, term272798.getClass(), "encodedSourceEnd", 0);
        setField(term272798, term272798.getClass(), "sourceName", null);
        setIntField(term272798, term272798.getClass(), "baseLineno", 0);
        setIntField(term272798, term272798.getClass(), "endLineno", 0);
        setField(term272798, term272798.getClass(), "functions", null);
        setField(term272798, term272798.getClass(), "regexps", null);
        setField(term272798, term272798.getClass(), "itsVariables", null);
        setField(term272798, term272798.getClass(), "itsConst", null);
        setField(term272798, term272798.getClass(), "itsVariableNames", null);
        setIntField(term272798, term272798.getClass(), "varStart", 0);
        setField(term272798, term272798.getClass(), "compilerData", null);
        setIntField(term272798, term272798.getClass(), "type", 0);
        setField(term272798, term272798.getClass(), "next", null);
        setField(term272798, term272798.getClass(), "first", null);
        setField(term272798, term272798.getClass(), "last", null);
        setField(term272798, term272798.getClass(), "propListHead", null);
        setIntField(term272798, term272798.getClass(), "sourcePosition", 0);
        setField(term272798, term272798.getClass(), "jsType", null);
        setField(term272798, term272798.getClass(), "parent", null);
        setField(term272797, term272797.getClass(), "next", term272798);
        setField(term272797, term272797.getClass(), "first", null);
        setField(term272797, term272797.getClass(), "last", null);
        setField(term272797, term272797.getClass(), "propListHead", null);
        setIntField(term272797, term272797.getClass(), "sourcePosition", 0);
        setField(term272797, term272797.getClass(), "jsType", null);
        setField(term272797, term272797.getClass(), "parent", null);
        setField(term272796, term272796.getClass(), "first", term272797);
        setField(term272796, term272796.getClass(), "last", null);
        setField(term272796, term272796.getClass(), "propListHead", null);
        setIntField(term272796, term272796.getClass(), "sourcePosition", 0);
        setField(term272796, term272796.getClass(), "jsType", null);
        setField(term272796, term272796.getClass(), "parent", null);
        term272714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term272714, term272714.getClass(), "number", 0.0);
        setIntField(term272714, term272714.getClass(), "type", 101);
        setField(term272714, term272714.getClass(), "next", null);
        setDoubleField(term272717, term272717.getClass(), "number", 0.0);
        setIntField(term272717, term272717.getClass(), "type", 0);
        setField(term272720, term272720.getClass(), "functionName", null);
        setBooleanField(term272720, term272720.getClass(), "itsNeedsActivation", false);
        setIntField(term272720, term272720.getClass(), "itsFunctionType", 0);
        setBooleanField(term272720, term272720.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term272720, term272720.getClass(), "encodedSourceStart", 0);
        setIntField(term272720, term272720.getClass(), "encodedSourceEnd", 0);
        setField(term272720, term272720.getClass(), "sourceName", null);
        setIntField(term272720, term272720.getClass(), "baseLineno", 0);
        setIntField(term272720, term272720.getClass(), "endLineno", 0);
        setField(term272720, term272720.getClass(), "functions", null);
        setField(term272720, term272720.getClass(), "regexps", null);
        setField(term272720, term272720.getClass(), "itsVariables", null);
        setField(term272720, term272720.getClass(), "itsConst", null);
        setField(term272720, term272720.getClass(), "itsVariableNames", null);
        setIntField(term272720, term272720.getClass(), "varStart", 0);
        setField(term272720, term272720.getClass(), "compilerData", null);
        setIntField(term272720, term272720.getClass(), "type", 0);
        setField(term272720, term272720.getClass(), "next", null);
        setField(term272720, term272720.getClass(), "first", null);
        setField(term272720, term272720.getClass(), "last", null);
        setField(term272720, term272720.getClass(), "propListHead", null);
        setIntField(term272720, term272720.getClass(), "sourcePosition", 0);
        setField(term272720, term272720.getClass(), "jsType", null);
        setField(term272720, term272720.getClass(), "parent", null);
        setField(term272717, term272717.getClass(), "next", term272720);
        setField(term272717, term272717.getClass(), "first", null);
        setField(term272717, term272717.getClass(), "last", null);
        setField(term272717, term272717.getClass(), "propListHead", null);
        setIntField(term272717, term272717.getClass(), "sourcePosition", 0);
        setField(term272717, term272717.getClass(), "jsType", null);
        setField(term272717, term272717.getClass(), "parent", null);
        setField(term272714, term272714.getClass(), "first", term272717);
        setField(term272714, term272714.getClass(), "last", null);
        setField(term272714, term272714.getClass(), "propListHead", null);
        setIntField(term272714, term272714.getClass(), "sourcePosition", 0);
        setField(term272714, term272714.getClass(), "jsType", null);
        setField(term272714, term272714.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term272394;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term272302, args);
        assertTrue(recursiveEquals(term272302, term272795));
        assertTrue(recursiveEquals(term272394, term272796));
        assertTrue(recursiveEquals(retValue, term272714));
    }

};


