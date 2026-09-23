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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502837;
     Object term502923;
     Object term503107;
     Object term503199;
     Object term503288;
     Object term503289;
     Object term503291;
     Object term503292;
     Object term503210;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term502837 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term502923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term503015, term503015.getClass(), "type", 108);
        setField(term502923, term502923.getClass(), "parent", term503015);
        setIntField(term502923, term502923.getClass(), "type", 0);
        term503107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term503107, term503107.getClass(), "type", 103);
        term503199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term503199, term503199.getClass(), "type", 44);
        term503288 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term503288, term503288.getClass(), "currentTraversal", null);
        term503289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503290 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term503289, term503289.getClass(), "functionName", null);
        setBooleanField(term503289, term503289.getClass(), "itsNeedsActivation", false);
        setIntField(term503289, term503289.getClass(), "itsFunctionType", 0);
        setBooleanField(term503289, term503289.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term503289, term503289.getClass(), "encodedSourceStart", 0);
        setIntField(term503289, term503289.getClass(), "encodedSourceEnd", 0);
        setField(term503289, term503289.getClass(), "sourceName", null);
        setIntField(term503289, term503289.getClass(), "baseLineno", 0);
        setIntField(term503289, term503289.getClass(), "endLineno", 0);
        setField(term503289, term503289.getClass(), "functions", null);
        setField(term503289, term503289.getClass(), "regexps", null);
        setField(term503289, term503289.getClass(), "itsVariables", null);
        setField(term503289, term503289.getClass(), "itsConst", null);
        setField(term503289, term503289.getClass(), "itsVariableNames", null);
        setIntField(term503289, term503289.getClass(), "varStart", 0);
        setField(term503289, term503289.getClass(), "compilerData", null);
        setIntField(term503289, term503289.getClass(), "type", 0);
        setField(term503289, term503289.getClass(), "next", null);
        setField(term503289, term503289.getClass(), "first", null);
        setField(term503289, term503289.getClass(), "last", null);
        setField(term503289, term503289.getClass(), "propListHead", null);
        setIntField(term503289, term503289.getClass(), "sourcePosition", 0);
        setField(term503289, term503289.getClass(), "jsType", null);
        setDoubleField(term503290, term503290.getClass(), "number", 0.0);
        setIntField(term503290, term503290.getClass(), "type", 108);
        setField(term503290, term503290.getClass(), "next", null);
        setField(term503290, term503290.getClass(), "first", null);
        setField(term503290, term503290.getClass(), "last", null);
        setField(term503290, term503290.getClass(), "propListHead", null);
        setIntField(term503290, term503290.getClass(), "sourcePosition", 0);
        setField(term503290, term503290.getClass(), "jsType", null);
        setField(term503290, term503290.getClass(), "parent", null);
        setField(term503289, term503289.getClass(), "parent", term503290);
        term503291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term503291, term503291.getClass(), "number", 0.0);
        setIntField(term503291, term503291.getClass(), "type", 103);
        setField(term503291, term503291.getClass(), "next", null);
        setField(term503291, term503291.getClass(), "first", null);
        setField(term503291, term503291.getClass(), "last", null);
        setField(term503291, term503291.getClass(), "propListHead", null);
        setIntField(term503291, term503291.getClass(), "sourcePosition", 0);
        setField(term503291, term503291.getClass(), "jsType", null);
        setField(term503291, term503291.getClass(), "parent", null);
        term503292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term503292, term503292.getClass(), "str", null);
        setIntField(term503292, term503292.getClass(), "type", 44);
        setField(term503292, term503292.getClass(), "next", null);
        setField(term503292, term503292.getClass(), "first", null);
        setField(term503292, term503292.getClass(), "last", null);
        setField(term503292, term503292.getClass(), "propListHead", null);
        setIntField(term503292, term503292.getClass(), "sourcePosition", 0);
        setField(term503292, term503292.getClass(), "jsType", null);
        setField(term503292, term503292.getClass(), "parent", null);
        term503210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term503210, term503210.getClass(), "functionName", null);
        setBooleanField(term503210, term503210.getClass(), "itsNeedsActivation", false);
        setIntField(term503210, term503210.getClass(), "itsFunctionType", 0);
        setBooleanField(term503210, term503210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term503210, term503210.getClass(), "encodedSourceStart", 0);
        setIntField(term503210, term503210.getClass(), "encodedSourceEnd", 0);
        setField(term503210, term503210.getClass(), "sourceName", null);
        setIntField(term503210, term503210.getClass(), "baseLineno", 0);
        setIntField(term503210, term503210.getClass(), "endLineno", 0);
        setField(term503210, term503210.getClass(), "functions", null);
        setField(term503210, term503210.getClass(), "regexps", null);
        setField(term503210, term503210.getClass(), "itsVariables", null);
        setField(term503210, term503210.getClass(), "itsConst", null);
        setField(term503210, term503210.getClass(), "itsVariableNames", null);
        setIntField(term503210, term503210.getClass(), "varStart", 0);
        setField(term503210, term503210.getClass(), "compilerData", null);
        setIntField(term503210, term503210.getClass(), "type", 0);
        setField(term503210, term503210.getClass(), "next", null);
        setField(term503210, term503210.getClass(), "first", null);
        setField(term503210, term503210.getClass(), "last", null);
        setField(term503210, term503210.getClass(), "propListHead", null);
        setIntField(term503210, term503210.getClass(), "sourcePosition", 0);
        setField(term503210, term503210.getClass(), "jsType", null);
        setDoubleField(term503221, term503221.getClass(), "number", 0.0);
        setIntField(term503221, term503221.getClass(), "type", 108);
        setField(term503221, term503221.getClass(), "next", null);
        setField(term503221, term503221.getClass(), "first", null);
        setField(term503221, term503221.getClass(), "last", null);
        setField(term503221, term503221.getClass(), "propListHead", null);
        setIntField(term503221, term503221.getClass(), "sourcePosition", 0);
        setField(term503221, term503221.getClass(), "jsType", null);
        setField(term503221, term503221.getClass(), "parent", null);
        setField(term503210, term503210.getClass(), "parent", term503221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term502923;
        args[1] = term503107;
        args[2] = term503199;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term502837, args);
        assertTrue(recursiveEquals(term502837, term503288));
        assertTrue(recursiveEquals(term502923, term503289));
        assertTrue(recursiveEquals(term503107, term503291));
        assertTrue(recursiveEquals(term503199, term503292));
        assertTrue(recursiveEquals(retValue, term503210));
    }

};


