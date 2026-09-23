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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731792;
     Object term731884;
     Object term732122;
     Object term732123;
     Object term732077;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731792 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term731884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term731970 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term732062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term731970, term731970.getClass(), "next", term732062);
        setIntField(term731970, term731970.getClass(), "type", 39);
        setField(term731884, term731884.getClass(), "first", term731970);
        setIntField(term731884, term731884.getClass(), "type", 19);
        term732122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term732122, term732122.getClass(), "currentTraversal", null);
        term732123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term732125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term732123, term732123.getClass(), "str", null);
        setIntField(term732123, term732123.getClass(), "type", 19);
        setField(term732123, term732123.getClass(), "next", null);
        setField(term732124, term732124.getClass(), "functionName", null);
        setBooleanField(term732124, term732124.getClass(), "itsNeedsActivation", false);
        setIntField(term732124, term732124.getClass(), "itsFunctionType", 0);
        setBooleanField(term732124, term732124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term732124, term732124.getClass(), "encodedSourceStart", 0);
        setIntField(term732124, term732124.getClass(), "encodedSourceEnd", 0);
        setField(term732124, term732124.getClass(), "sourceName", null);
        setIntField(term732124, term732124.getClass(), "baseLineno", 0);
        setIntField(term732124, term732124.getClass(), "endLineno", 0);
        setField(term732124, term732124.getClass(), "functions", null);
        setField(term732124, term732124.getClass(), "regexps", null);
        setField(term732124, term732124.getClass(), "itsVariables", null);
        setField(term732124, term732124.getClass(), "itsConst", null);
        setField(term732124, term732124.getClass(), "itsVariableNames", null);
        setIntField(term732124, term732124.getClass(), "varStart", 0);
        setField(term732124, term732124.getClass(), "compilerData", null);
        setIntField(term732124, term732124.getClass(), "type", 39);
        setField(term732125, term732125.getClass(), "str", null);
        setIntField(term732125, term732125.getClass(), "type", 0);
        setField(term732125, term732125.getClass(), "next", null);
        setField(term732125, term732125.getClass(), "first", null);
        setField(term732125, term732125.getClass(), "last", null);
        setField(term732125, term732125.getClass(), "propListHead", null);
        setIntField(term732125, term732125.getClass(), "sourcePosition", 0);
        setField(term732125, term732125.getClass(), "jsType", null);
        setField(term732125, term732125.getClass(), "parent", null);
        setField(term732124, term732124.getClass(), "next", term732125);
        setField(term732124, term732124.getClass(), "first", null);
        setField(term732124, term732124.getClass(), "last", null);
        setField(term732124, term732124.getClass(), "propListHead", null);
        setIntField(term732124, term732124.getClass(), "sourcePosition", 0);
        setField(term732124, term732124.getClass(), "jsType", null);
        setField(term732124, term732124.getClass(), "parent", null);
        setField(term732123, term732123.getClass(), "first", term732124);
        setField(term732123, term732123.getClass(), "last", null);
        setField(term732123, term732123.getClass(), "propListHead", null);
        setIntField(term732123, term732123.getClass(), "sourcePosition", 0);
        setField(term732123, term732123.getClass(), "jsType", null);
        setField(term732123, term732123.getClass(), "parent", null);
        term732077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term732089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term732077, term732077.getClass(), "str", null);
        setIntField(term732077, term732077.getClass(), "type", 19);
        setField(term732077, term732077.getClass(), "next", null);
        setField(term732079, term732079.getClass(), "functionName", null);
        setBooleanField(term732079, term732079.getClass(), "itsNeedsActivation", false);
        setIntField(term732079, term732079.getClass(), "itsFunctionType", 0);
        setBooleanField(term732079, term732079.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term732079, term732079.getClass(), "encodedSourceStart", 0);
        setIntField(term732079, term732079.getClass(), "encodedSourceEnd", 0);
        setField(term732079, term732079.getClass(), "sourceName", null);
        setIntField(term732079, term732079.getClass(), "baseLineno", 0);
        setIntField(term732079, term732079.getClass(), "endLineno", 0);
        setField(term732079, term732079.getClass(), "functions", null);
        setField(term732079, term732079.getClass(), "regexps", null);
        setField(term732079, term732079.getClass(), "itsVariables", null);
        setField(term732079, term732079.getClass(), "itsConst", null);
        setField(term732079, term732079.getClass(), "itsVariableNames", null);
        setIntField(term732079, term732079.getClass(), "varStart", 0);
        setField(term732079, term732079.getClass(), "compilerData", null);
        setIntField(term732079, term732079.getClass(), "type", 39);
        setField(term732089, term732089.getClass(), "str", null);
        setIntField(term732089, term732089.getClass(), "type", 0);
        setField(term732089, term732089.getClass(), "next", null);
        setField(term732089, term732089.getClass(), "first", null);
        setField(term732089, term732089.getClass(), "last", null);
        setField(term732089, term732089.getClass(), "propListHead", null);
        setIntField(term732089, term732089.getClass(), "sourcePosition", 0);
        setField(term732089, term732089.getClass(), "jsType", null);
        setField(term732089, term732089.getClass(), "parent", null);
        setField(term732079, term732079.getClass(), "next", term732089);
        setField(term732079, term732079.getClass(), "first", null);
        setField(term732079, term732079.getClass(), "last", null);
        setField(term732079, term732079.getClass(), "propListHead", null);
        setIntField(term732079, term732079.getClass(), "sourcePosition", 0);
        setField(term732079, term732079.getClass(), "jsType", null);
        setField(term732079, term732079.getClass(), "parent", null);
        setField(term732077, term732077.getClass(), "first", term732079);
        setField(term732077, term732077.getClass(), "last", null);
        setField(term732077, term732077.getClass(), "propListHead", null);
        setIntField(term732077, term732077.getClass(), "sourcePosition", 0);
        setField(term732077, term732077.getClass(), "jsType", null);
        setField(term732077, term732077.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term731884;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term731792, args);
        assertTrue(recursiveEquals(term731792, term732122));
        assertTrue(recursiveEquals(term731884, term732123));
        assertTrue(recursiveEquals(retValue, term732077));
    }

};


