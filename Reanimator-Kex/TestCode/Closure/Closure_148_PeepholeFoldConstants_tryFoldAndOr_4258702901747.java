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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452995;
     Object term453081;
     Object term453265;
     Object term453357;
     Object term453993;
     Object term453994;
     Object term453996;
     Object term453997;
     Object term453915;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term453081 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term453173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term453173, term453173.getClass(), "type", 108);
        setField(term453081, term453081.getClass(), "parent", term453173);
        setIntField(term453081, term453081.getClass(), "type", 0);
        term453265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term453265, term453265.getClass(), "type", 0);
        term453357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term453357, term453357.getClass(), "type", 44);
        term453993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term453993, term453993.getClass(), "currentTraversal", null);
        term453994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term453995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term453994, term453994.getClass(), "functionName", null);
        setBooleanField(term453994, term453994.getClass(), "itsNeedsActivation", false);
        setIntField(term453994, term453994.getClass(), "itsFunctionType", 0);
        setBooleanField(term453994, term453994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term453994, term453994.getClass(), "encodedSourceStart", 0);
        setIntField(term453994, term453994.getClass(), "encodedSourceEnd", 0);
        setField(term453994, term453994.getClass(), "sourceName", null);
        setIntField(term453994, term453994.getClass(), "baseLineno", 0);
        setIntField(term453994, term453994.getClass(), "endLineno", 0);
        setField(term453994, term453994.getClass(), "functions", null);
        setField(term453994, term453994.getClass(), "regexps", null);
        setField(term453994, term453994.getClass(), "itsVariables", null);
        setField(term453994, term453994.getClass(), "itsConst", null);
        setField(term453994, term453994.getClass(), "itsVariableNames", null);
        setIntField(term453994, term453994.getClass(), "varStart", 0);
        setField(term453994, term453994.getClass(), "compilerData", null);
        setIntField(term453994, term453994.getClass(), "type", 0);
        setField(term453994, term453994.getClass(), "next", null);
        setField(term453994, term453994.getClass(), "first", null);
        setField(term453994, term453994.getClass(), "last", null);
        setField(term453994, term453994.getClass(), "propListHead", null);
        setIntField(term453994, term453994.getClass(), "sourcePosition", 0);
        setField(term453994, term453994.getClass(), "jsType", null);
        setDoubleField(term453995, term453995.getClass(), "number", 0.0);
        setIntField(term453995, term453995.getClass(), "type", 108);
        setField(term453995, term453995.getClass(), "next", null);
        setField(term453995, term453995.getClass(), "first", null);
        setField(term453995, term453995.getClass(), "last", null);
        setField(term453995, term453995.getClass(), "propListHead", null);
        setIntField(term453995, term453995.getClass(), "sourcePosition", 0);
        setField(term453995, term453995.getClass(), "jsType", null);
        setField(term453995, term453995.getClass(), "parent", null);
        setField(term453994, term453994.getClass(), "parent", term453995);
        term453996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term453996, term453996.getClass(), "number", 0.0);
        setIntField(term453996, term453996.getClass(), "type", 0);
        setField(term453996, term453996.getClass(), "next", null);
        setField(term453996, term453996.getClass(), "first", null);
        setField(term453996, term453996.getClass(), "last", null);
        setField(term453996, term453996.getClass(), "propListHead", null);
        setIntField(term453996, term453996.getClass(), "sourcePosition", 0);
        setField(term453996, term453996.getClass(), "jsType", null);
        setField(term453996, term453996.getClass(), "parent", null);
        term453997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term453997, term453997.getClass(), "str", null);
        setIntField(term453997, term453997.getClass(), "type", 44);
        setField(term453997, term453997.getClass(), "next", null);
        setField(term453997, term453997.getClass(), "first", null);
        setField(term453997, term453997.getClass(), "last", null);
        setField(term453997, term453997.getClass(), "propListHead", null);
        setIntField(term453997, term453997.getClass(), "sourcePosition", 0);
        setField(term453997, term453997.getClass(), "jsType", null);
        setField(term453997, term453997.getClass(), "parent", null);
        term453915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term453926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term453915, term453915.getClass(), "functionName", null);
        setBooleanField(term453915, term453915.getClass(), "itsNeedsActivation", false);
        setIntField(term453915, term453915.getClass(), "itsFunctionType", 0);
        setBooleanField(term453915, term453915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term453915, term453915.getClass(), "encodedSourceStart", 0);
        setIntField(term453915, term453915.getClass(), "encodedSourceEnd", 0);
        setField(term453915, term453915.getClass(), "sourceName", null);
        setIntField(term453915, term453915.getClass(), "baseLineno", 0);
        setIntField(term453915, term453915.getClass(), "endLineno", 0);
        setField(term453915, term453915.getClass(), "functions", null);
        setField(term453915, term453915.getClass(), "regexps", null);
        setField(term453915, term453915.getClass(), "itsVariables", null);
        setField(term453915, term453915.getClass(), "itsConst", null);
        setField(term453915, term453915.getClass(), "itsVariableNames", null);
        setIntField(term453915, term453915.getClass(), "varStart", 0);
        setField(term453915, term453915.getClass(), "compilerData", null);
        setIntField(term453915, term453915.getClass(), "type", 0);
        setField(term453915, term453915.getClass(), "next", null);
        setField(term453915, term453915.getClass(), "first", null);
        setField(term453915, term453915.getClass(), "last", null);
        setField(term453915, term453915.getClass(), "propListHead", null);
        setIntField(term453915, term453915.getClass(), "sourcePosition", 0);
        setField(term453915, term453915.getClass(), "jsType", null);
        setDoubleField(term453926, term453926.getClass(), "number", 0.0);
        setIntField(term453926, term453926.getClass(), "type", 108);
        setField(term453926, term453926.getClass(), "next", null);
        setField(term453926, term453926.getClass(), "first", null);
        setField(term453926, term453926.getClass(), "last", null);
        setField(term453926, term453926.getClass(), "propListHead", null);
        setIntField(term453926, term453926.getClass(), "sourcePosition", 0);
        setField(term453926, term453926.getClass(), "jsType", null);
        setField(term453926, term453926.getClass(), "parent", null);
        setField(term453915, term453915.getClass(), "parent", term453926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term453081;
        args[1] = term453265;
        args[2] = term453357;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term452995, args);
        assertTrue(recursiveEquals(term452995, term453993));
        assertTrue(recursiveEquals(term453081, term453994));
        assertTrue(recursiveEquals(term453265, term453996));
        assertTrue(recursiveEquals(term453357, term453997));
        assertTrue(recursiveEquals(retValue, term453915));
    }

};


