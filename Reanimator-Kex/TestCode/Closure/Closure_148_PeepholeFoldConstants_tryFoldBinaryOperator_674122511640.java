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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141080;
     Object term141172;
     Object term141529;
     Object term141530;
     Object term141476;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141080 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term141172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term141264, term141264.getClass(), "next", term141350);
        setIntField(term141264, term141264.getClass(), "type", 39);
        setField(term141172, term141172.getClass(), "first", term141264);
        setIntField(term141172, term141172.getClass(), "type", 20);
        term141529 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term141529, term141529.getClass(), "currentTraversal", null);
        term141530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term141530, term141530.getClass(), "str", null);
        setIntField(term141530, term141530.getClass(), "type", 20);
        setField(term141530, term141530.getClass(), "next", null);
        setField(term141531, term141531.getClass(), "str", null);
        setIntField(term141531, term141531.getClass(), "type", 39);
        setField(term141532, term141532.getClass(), "functionName", null);
        setBooleanField(term141532, term141532.getClass(), "itsNeedsActivation", false);
        setIntField(term141532, term141532.getClass(), "itsFunctionType", 0);
        setBooleanField(term141532, term141532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141532, term141532.getClass(), "encodedSourceStart", 0);
        setIntField(term141532, term141532.getClass(), "encodedSourceEnd", 0);
        setField(term141532, term141532.getClass(), "sourceName", null);
        setIntField(term141532, term141532.getClass(), "baseLineno", 0);
        setIntField(term141532, term141532.getClass(), "endLineno", 0);
        setField(term141532, term141532.getClass(), "functions", null);
        setField(term141532, term141532.getClass(), "regexps", null);
        setField(term141532, term141532.getClass(), "itsVariables", null);
        setField(term141532, term141532.getClass(), "itsConst", null);
        setField(term141532, term141532.getClass(), "itsVariableNames", null);
        setIntField(term141532, term141532.getClass(), "varStart", 0);
        setField(term141532, term141532.getClass(), "compilerData", null);
        setIntField(term141532, term141532.getClass(), "type", 0);
        setField(term141532, term141532.getClass(), "next", null);
        setField(term141532, term141532.getClass(), "first", null);
        setField(term141532, term141532.getClass(), "last", null);
        setField(term141532, term141532.getClass(), "propListHead", null);
        setIntField(term141532, term141532.getClass(), "sourcePosition", 0);
        setField(term141532, term141532.getClass(), "jsType", null);
        setField(term141532, term141532.getClass(), "parent", null);
        setField(term141531, term141531.getClass(), "next", term141532);
        setField(term141531, term141531.getClass(), "first", null);
        setField(term141531, term141531.getClass(), "last", null);
        setField(term141531, term141531.getClass(), "propListHead", null);
        setIntField(term141531, term141531.getClass(), "sourcePosition", 0);
        setField(term141531, term141531.getClass(), "jsType", null);
        setField(term141531, term141531.getClass(), "parent", null);
        setField(term141530, term141530.getClass(), "first", term141531);
        setField(term141530, term141530.getClass(), "last", null);
        setField(term141530, term141530.getClass(), "propListHead", null);
        setIntField(term141530, term141530.getClass(), "sourcePosition", 0);
        setField(term141530, term141530.getClass(), "jsType", null);
        setField(term141530, term141530.getClass(), "parent", null);
        term141476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term141476, term141476.getClass(), "str", null);
        setIntField(term141476, term141476.getClass(), "type", 20);
        setField(term141476, term141476.getClass(), "next", null);
        setField(term141478, term141478.getClass(), "str", null);
        setIntField(term141478, term141478.getClass(), "type", 39);
        setField(term141480, term141480.getClass(), "functionName", null);
        setBooleanField(term141480, term141480.getClass(), "itsNeedsActivation", false);
        setIntField(term141480, term141480.getClass(), "itsFunctionType", 0);
        setBooleanField(term141480, term141480.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141480, term141480.getClass(), "encodedSourceStart", 0);
        setIntField(term141480, term141480.getClass(), "encodedSourceEnd", 0);
        setField(term141480, term141480.getClass(), "sourceName", null);
        setIntField(term141480, term141480.getClass(), "baseLineno", 0);
        setIntField(term141480, term141480.getClass(), "endLineno", 0);
        setField(term141480, term141480.getClass(), "functions", null);
        setField(term141480, term141480.getClass(), "regexps", null);
        setField(term141480, term141480.getClass(), "itsVariables", null);
        setField(term141480, term141480.getClass(), "itsConst", null);
        setField(term141480, term141480.getClass(), "itsVariableNames", null);
        setIntField(term141480, term141480.getClass(), "varStart", 0);
        setField(term141480, term141480.getClass(), "compilerData", null);
        setIntField(term141480, term141480.getClass(), "type", 0);
        setField(term141480, term141480.getClass(), "next", null);
        setField(term141480, term141480.getClass(), "first", null);
        setField(term141480, term141480.getClass(), "last", null);
        setField(term141480, term141480.getClass(), "propListHead", null);
        setIntField(term141480, term141480.getClass(), "sourcePosition", 0);
        setField(term141480, term141480.getClass(), "jsType", null);
        setField(term141480, term141480.getClass(), "parent", null);
        setField(term141478, term141478.getClass(), "next", term141480);
        setField(term141478, term141478.getClass(), "first", null);
        setField(term141478, term141478.getClass(), "last", null);
        setField(term141478, term141478.getClass(), "propListHead", null);
        setIntField(term141478, term141478.getClass(), "sourcePosition", 0);
        setField(term141478, term141478.getClass(), "jsType", null);
        setField(term141478, term141478.getClass(), "parent", null);
        setField(term141476, term141476.getClass(), "first", term141478);
        setField(term141476, term141476.getClass(), "last", null);
        setField(term141476, term141476.getClass(), "propListHead", null);
        setIntField(term141476, term141476.getClass(), "sourcePosition", 0);
        setField(term141476, term141476.getClass(), "jsType", null);
        setField(term141476, term141476.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term141172;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term141080, args);
        assertTrue(recursiveEquals(term141080, term141529));
        assertTrue(recursiveEquals(term141172, term141530));
        assertTrue(recursiveEquals(retValue, term141476));
    }

};


