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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759190;
     Object term759282;
     Object term759530;
     Object term759531;
     Object term759482;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759190 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term759282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term759368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term759460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term759368, term759368.getClass(), "next", term759460);
        setIntField(term759368, term759368.getClass(), "type", 39);
        setField(term759282, term759282.getClass(), "first", term759368);
        setIntField(term759282, term759282.getClass(), "type", 22);
        term759530 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term759530, term759530.getClass(), "currentTraversal", null);
        term759531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term759532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term759533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term759531, term759531.getClass(), "str", null);
        setIntField(term759531, term759531.getClass(), "type", 22);
        setField(term759531, term759531.getClass(), "next", null);
        setField(term759532, term759532.getClass(), "functionName", null);
        setBooleanField(term759532, term759532.getClass(), "itsNeedsActivation", false);
        setIntField(term759532, term759532.getClass(), "itsFunctionType", 0);
        setBooleanField(term759532, term759532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term759532, term759532.getClass(), "encodedSourceStart", 0);
        setIntField(term759532, term759532.getClass(), "encodedSourceEnd", 0);
        setField(term759532, term759532.getClass(), "sourceName", null);
        setIntField(term759532, term759532.getClass(), "baseLineno", 0);
        setIntField(term759532, term759532.getClass(), "endLineno", 0);
        setField(term759532, term759532.getClass(), "functions", null);
        setField(term759532, term759532.getClass(), "regexps", null);
        setField(term759532, term759532.getClass(), "itsVariables", null);
        setField(term759532, term759532.getClass(), "itsConst", null);
        setField(term759532, term759532.getClass(), "itsVariableNames", null);
        setIntField(term759532, term759532.getClass(), "varStart", 0);
        setField(term759532, term759532.getClass(), "compilerData", null);
        setIntField(term759532, term759532.getClass(), "type", 39);
        setDoubleField(term759533, term759533.getClass(), "number", 0.0);
        setIntField(term759533, term759533.getClass(), "type", 0);
        setField(term759533, term759533.getClass(), "next", null);
        setField(term759533, term759533.getClass(), "first", null);
        setField(term759533, term759533.getClass(), "last", null);
        setField(term759533, term759533.getClass(), "propListHead", null);
        setIntField(term759533, term759533.getClass(), "sourcePosition", 0);
        setField(term759533, term759533.getClass(), "jsType", null);
        setField(term759533, term759533.getClass(), "parent", null);
        setField(term759532, term759532.getClass(), "next", term759533);
        setField(term759532, term759532.getClass(), "first", null);
        setField(term759532, term759532.getClass(), "last", null);
        setField(term759532, term759532.getClass(), "propListHead", null);
        setIntField(term759532, term759532.getClass(), "sourcePosition", 0);
        setField(term759532, term759532.getClass(), "jsType", null);
        setField(term759532, term759532.getClass(), "parent", null);
        setField(term759531, term759531.getClass(), "first", term759532);
        setField(term759531, term759531.getClass(), "last", null);
        setField(term759531, term759531.getClass(), "propListHead", null);
        setIntField(term759531, term759531.getClass(), "sourcePosition", 0);
        setField(term759531, term759531.getClass(), "jsType", null);
        setField(term759531, term759531.getClass(), "parent", null);
        term759482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term759484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term759494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term759482, term759482.getClass(), "str", null);
        setIntField(term759482, term759482.getClass(), "type", 22);
        setField(term759482, term759482.getClass(), "next", null);
        setField(term759484, term759484.getClass(), "functionName", null);
        setBooleanField(term759484, term759484.getClass(), "itsNeedsActivation", false);
        setIntField(term759484, term759484.getClass(), "itsFunctionType", 0);
        setBooleanField(term759484, term759484.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term759484, term759484.getClass(), "encodedSourceStart", 0);
        setIntField(term759484, term759484.getClass(), "encodedSourceEnd", 0);
        setField(term759484, term759484.getClass(), "sourceName", null);
        setIntField(term759484, term759484.getClass(), "baseLineno", 0);
        setIntField(term759484, term759484.getClass(), "endLineno", 0);
        setField(term759484, term759484.getClass(), "functions", null);
        setField(term759484, term759484.getClass(), "regexps", null);
        setField(term759484, term759484.getClass(), "itsVariables", null);
        setField(term759484, term759484.getClass(), "itsConst", null);
        setField(term759484, term759484.getClass(), "itsVariableNames", null);
        setIntField(term759484, term759484.getClass(), "varStart", 0);
        setField(term759484, term759484.getClass(), "compilerData", null);
        setIntField(term759484, term759484.getClass(), "type", 39);
        setDoubleField(term759494, term759494.getClass(), "number", 0.0);
        setIntField(term759494, term759494.getClass(), "type", 0);
        setField(term759494, term759494.getClass(), "next", null);
        setField(term759494, term759494.getClass(), "first", null);
        setField(term759494, term759494.getClass(), "last", null);
        setField(term759494, term759494.getClass(), "propListHead", null);
        setIntField(term759494, term759494.getClass(), "sourcePosition", 0);
        setField(term759494, term759494.getClass(), "jsType", null);
        setField(term759494, term759494.getClass(), "parent", null);
        setField(term759484, term759484.getClass(), "next", term759494);
        setField(term759484, term759484.getClass(), "first", null);
        setField(term759484, term759484.getClass(), "last", null);
        setField(term759484, term759484.getClass(), "propListHead", null);
        setIntField(term759484, term759484.getClass(), "sourcePosition", 0);
        setField(term759484, term759484.getClass(), "jsType", null);
        setField(term759484, term759484.getClass(), "parent", null);
        setField(term759482, term759482.getClass(), "first", term759484);
        setField(term759482, term759482.getClass(), "last", null);
        setField(term759482, term759482.getClass(), "propListHead", null);
        setIntField(term759482, term759482.getClass(), "sourcePosition", 0);
        setField(term759482, term759482.getClass(), "jsType", null);
        setField(term759482, term759482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term759282;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term759190, args);
        assertTrue(recursiveEquals(term759190, term759530));
        assertTrue(recursiveEquals(term759282, term759531));
        assertTrue(recursiveEquals(retValue, term759482));
    }

};


