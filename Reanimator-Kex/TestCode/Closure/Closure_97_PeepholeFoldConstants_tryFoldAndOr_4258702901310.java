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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434818;
     Object term434910;
     Object term435088;
     Object term435158;
     Object term435322;
     Object term435323;
     Object term435325;
     Object term435326;
     Object term435273;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term434910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term435002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term434910, term434910.getClass(), "parent", term435002);
        setIntField(term434910, term434910.getClass(), "type", 0);
        term435088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term435088, term435088.getClass(), "type", 0);
        term435158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term435322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term435322, term435322.getClass(), "currentTraversal", null);
        term435323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term435324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term435323, term435323.getClass(), "str", null);
        setIntField(term435323, term435323.getClass(), "type", 0);
        setField(term435323, term435323.getClass(), "next", null);
        setField(term435323, term435323.getClass(), "first", null);
        setField(term435323, term435323.getClass(), "last", null);
        setField(term435323, term435323.getClass(), "propListHead", null);
        setIntField(term435323, term435323.getClass(), "sourcePosition", 0);
        setField(term435323, term435323.getClass(), "jsType", null);
        setField(term435324, term435324.getClass(), "str", null);
        setIntField(term435324, term435324.getClass(), "type", 0);
        setField(term435324, term435324.getClass(), "next", null);
        setField(term435324, term435324.getClass(), "first", null);
        setField(term435324, term435324.getClass(), "last", null);
        setField(term435324, term435324.getClass(), "propListHead", null);
        setIntField(term435324, term435324.getClass(), "sourcePosition", 0);
        setField(term435324, term435324.getClass(), "jsType", null);
        setField(term435324, term435324.getClass(), "parent", null);
        setField(term435323, term435323.getClass(), "parent", term435324);
        term435325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term435325, term435325.getClass(), "functionName", null);
        setBooleanField(term435325, term435325.getClass(), "itsNeedsActivation", false);
        setIntField(term435325, term435325.getClass(), "itsFunctionType", 0);
        setBooleanField(term435325, term435325.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term435325, term435325.getClass(), "encodedSourceStart", 0);
        setIntField(term435325, term435325.getClass(), "encodedSourceEnd", 0);
        setField(term435325, term435325.getClass(), "sourceName", null);
        setIntField(term435325, term435325.getClass(), "baseLineno", 0);
        setIntField(term435325, term435325.getClass(), "endLineno", 0);
        setField(term435325, term435325.getClass(), "functions", null);
        setField(term435325, term435325.getClass(), "regexps", null);
        setField(term435325, term435325.getClass(), "itsVariables", null);
        setField(term435325, term435325.getClass(), "itsConst", null);
        setField(term435325, term435325.getClass(), "itsVariableNames", null);
        setIntField(term435325, term435325.getClass(), "varStart", 0);
        setField(term435325, term435325.getClass(), "compilerData", null);
        setIntField(term435325, term435325.getClass(), "type", 0);
        setField(term435325, term435325.getClass(), "next", null);
        setField(term435325, term435325.getClass(), "first", null);
        setField(term435325, term435325.getClass(), "last", null);
        setField(term435325, term435325.getClass(), "propListHead", null);
        setIntField(term435325, term435325.getClass(), "sourcePosition", 0);
        setField(term435325, term435325.getClass(), "jsType", null);
        setField(term435325, term435325.getClass(), "parent", null);
        term435326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term435326, term435326.getClass(), "type", 0);
        setField(term435326, term435326.getClass(), "next", null);
        setField(term435326, term435326.getClass(), "first", null);
        setField(term435326, term435326.getClass(), "last", null);
        setField(term435326, term435326.getClass(), "propListHead", null);
        setIntField(term435326, term435326.getClass(), "sourcePosition", 0);
        setField(term435326, term435326.getClass(), "jsType", null);
        setField(term435326, term435326.getClass(), "parent", null);
        term435273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term435276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term435273, term435273.getClass(), "str", null);
        setIntField(term435273, term435273.getClass(), "type", 0);
        setField(term435273, term435273.getClass(), "next", null);
        setField(term435273, term435273.getClass(), "first", null);
        setField(term435273, term435273.getClass(), "last", null);
        setField(term435273, term435273.getClass(), "propListHead", null);
        setIntField(term435273, term435273.getClass(), "sourcePosition", 0);
        setField(term435273, term435273.getClass(), "jsType", null);
        setField(term435276, term435276.getClass(), "str", null);
        setIntField(term435276, term435276.getClass(), "type", 0);
        setField(term435276, term435276.getClass(), "next", null);
        setField(term435276, term435276.getClass(), "first", null);
        setField(term435276, term435276.getClass(), "last", null);
        setField(term435276, term435276.getClass(), "propListHead", null);
        setIntField(term435276, term435276.getClass(), "sourcePosition", 0);
        setField(term435276, term435276.getClass(), "jsType", null);
        setField(term435276, term435276.getClass(), "parent", null);
        setField(term435273, term435273.getClass(), "parent", term435276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term434910;
        args[1] = term435088;
        args[2] = term435158;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term434818, args);
        assertTrue(recursiveEquals(term434818, term435322));
        assertTrue(recursiveEquals(term434910, term435323));
        assertTrue(recursiveEquals(term435088, term435325));
        assertTrue(recursiveEquals(term435158, term435326));
        assertTrue(recursiveEquals(retValue, term435273));
    }

};


