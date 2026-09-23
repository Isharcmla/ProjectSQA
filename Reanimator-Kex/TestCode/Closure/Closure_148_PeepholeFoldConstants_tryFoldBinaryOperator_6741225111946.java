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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518340;
     Object term518432;
     Object term518659;
     Object term518660;
     Object term518609;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518340 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term518432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term518518, term518518.getClass(), "next", term518588);
        setField(term518432, term518432.getClass(), "first", term518518);
        setIntField(term518432, term518432.getClass(), "type", 17);
        term518659 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518659, term518659.getClass(), "currentTraversal", null);
        term518660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term518660, term518660.getClass(), "str", null);
        setIntField(term518660, term518660.getClass(), "type", 17);
        setField(term518660, term518660.getClass(), "next", null);
        setField(term518661, term518661.getClass(), "functionName", null);
        setBooleanField(term518661, term518661.getClass(), "itsNeedsActivation", false);
        setIntField(term518661, term518661.getClass(), "itsFunctionType", 0);
        setBooleanField(term518661, term518661.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518661, term518661.getClass(), "encodedSourceStart", 0);
        setIntField(term518661, term518661.getClass(), "encodedSourceEnd", 0);
        setField(term518661, term518661.getClass(), "sourceName", null);
        setIntField(term518661, term518661.getClass(), "baseLineno", 0);
        setIntField(term518661, term518661.getClass(), "endLineno", 0);
        setField(term518661, term518661.getClass(), "functions", null);
        setField(term518661, term518661.getClass(), "regexps", null);
        setField(term518661, term518661.getClass(), "itsVariables", null);
        setField(term518661, term518661.getClass(), "itsConst", null);
        setField(term518661, term518661.getClass(), "itsVariableNames", null);
        setIntField(term518661, term518661.getClass(), "varStart", 0);
        setField(term518661, term518661.getClass(), "compilerData", null);
        setIntField(term518661, term518661.getClass(), "type", 0);
        setIntField(term518662, term518662.getClass(), "type", 0);
        setField(term518662, term518662.getClass(), "next", null);
        setField(term518662, term518662.getClass(), "first", null);
        setField(term518662, term518662.getClass(), "last", null);
        setField(term518662, term518662.getClass(), "propListHead", null);
        setIntField(term518662, term518662.getClass(), "sourcePosition", 0);
        setField(term518662, term518662.getClass(), "jsType", null);
        setField(term518662, term518662.getClass(), "parent", null);
        setField(term518661, term518661.getClass(), "next", term518662);
        setField(term518661, term518661.getClass(), "first", null);
        setField(term518661, term518661.getClass(), "last", null);
        setField(term518661, term518661.getClass(), "propListHead", null);
        setIntField(term518661, term518661.getClass(), "sourcePosition", 0);
        setField(term518661, term518661.getClass(), "jsType", null);
        setField(term518661, term518661.getClass(), "parent", null);
        setField(term518660, term518660.getClass(), "first", term518661);
        setField(term518660, term518660.getClass(), "last", null);
        setField(term518660, term518660.getClass(), "propListHead", null);
        setIntField(term518660, term518660.getClass(), "sourcePosition", 0);
        setField(term518660, term518660.getClass(), "jsType", null);
        setField(term518660, term518660.getClass(), "parent", null);
        term518609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term518609, term518609.getClass(), "str", null);
        setIntField(term518609, term518609.getClass(), "type", 17);
        setField(term518609, term518609.getClass(), "next", null);
        setField(term518611, term518611.getClass(), "functionName", null);
        setBooleanField(term518611, term518611.getClass(), "itsNeedsActivation", false);
        setIntField(term518611, term518611.getClass(), "itsFunctionType", 0);
        setBooleanField(term518611, term518611.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518611, term518611.getClass(), "encodedSourceStart", 0);
        setIntField(term518611, term518611.getClass(), "encodedSourceEnd", 0);
        setField(term518611, term518611.getClass(), "sourceName", null);
        setIntField(term518611, term518611.getClass(), "baseLineno", 0);
        setIntField(term518611, term518611.getClass(), "endLineno", 0);
        setField(term518611, term518611.getClass(), "functions", null);
        setField(term518611, term518611.getClass(), "regexps", null);
        setField(term518611, term518611.getClass(), "itsVariables", null);
        setField(term518611, term518611.getClass(), "itsConst", null);
        setField(term518611, term518611.getClass(), "itsVariableNames", null);
        setIntField(term518611, term518611.getClass(), "varStart", 0);
        setField(term518611, term518611.getClass(), "compilerData", null);
        setIntField(term518611, term518611.getClass(), "type", 0);
        setIntField(term518621, term518621.getClass(), "type", 0);
        setField(term518621, term518621.getClass(), "next", null);
        setField(term518621, term518621.getClass(), "first", null);
        setField(term518621, term518621.getClass(), "last", null);
        setField(term518621, term518621.getClass(), "propListHead", null);
        setIntField(term518621, term518621.getClass(), "sourcePosition", 0);
        setField(term518621, term518621.getClass(), "jsType", null);
        setField(term518621, term518621.getClass(), "parent", null);
        setField(term518611, term518611.getClass(), "next", term518621);
        setField(term518611, term518611.getClass(), "first", null);
        setField(term518611, term518611.getClass(), "last", null);
        setField(term518611, term518611.getClass(), "propListHead", null);
        setIntField(term518611, term518611.getClass(), "sourcePosition", 0);
        setField(term518611, term518611.getClass(), "jsType", null);
        setField(term518611, term518611.getClass(), "parent", null);
        setField(term518609, term518609.getClass(), "first", term518611);
        setField(term518609, term518609.getClass(), "last", null);
        setField(term518609, term518609.getClass(), "propListHead", null);
        setIntField(term518609, term518609.getClass(), "sourcePosition", 0);
        setField(term518609, term518609.getClass(), "jsType", null);
        setField(term518609, term518609.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term518432;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term518340, args);
        assertTrue(recursiveEquals(term518340, term518659));
        assertTrue(recursiveEquals(term518432, term518660));
        assertTrue(recursiveEquals(retValue, term518609));
    }

};


