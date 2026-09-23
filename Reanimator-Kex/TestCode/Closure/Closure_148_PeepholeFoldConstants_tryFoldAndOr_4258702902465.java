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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690090;
     Object term690176;
     Object term690360;
     Object term690452;
     Object term691392;
     Object term691393;
     Object term691395;
     Object term691396;
     Object term691314;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term690176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term690268 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term690268, term690268.getClass(), "type", 114);
        setField(term690176, term690176.getClass(), "parent", term690268);
        setIntField(term690176, term690176.getClass(), "type", 63);
        term690360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term690360, term690360.getClass(), "type", 0);
        term690452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term690452, term690452.getClass(), "type", 63);
        term691392 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term691392, term691392.getClass(), "currentTraversal", null);
        term691393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691394 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term691393, term691393.getClass(), "functionName", null);
        setBooleanField(term691393, term691393.getClass(), "itsNeedsActivation", false);
        setIntField(term691393, term691393.getClass(), "itsFunctionType", 0);
        setBooleanField(term691393, term691393.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691393, term691393.getClass(), "encodedSourceStart", 0);
        setIntField(term691393, term691393.getClass(), "encodedSourceEnd", 0);
        setField(term691393, term691393.getClass(), "sourceName", null);
        setIntField(term691393, term691393.getClass(), "baseLineno", 0);
        setIntField(term691393, term691393.getClass(), "endLineno", 0);
        setField(term691393, term691393.getClass(), "functions", null);
        setField(term691393, term691393.getClass(), "regexps", null);
        setField(term691393, term691393.getClass(), "itsVariables", null);
        setField(term691393, term691393.getClass(), "itsConst", null);
        setField(term691393, term691393.getClass(), "itsVariableNames", null);
        setIntField(term691393, term691393.getClass(), "varStart", 0);
        setField(term691393, term691393.getClass(), "compilerData", null);
        setIntField(term691393, term691393.getClass(), "type", 63);
        setField(term691393, term691393.getClass(), "next", null);
        setField(term691393, term691393.getClass(), "first", null);
        setField(term691393, term691393.getClass(), "last", null);
        setField(term691393, term691393.getClass(), "propListHead", null);
        setIntField(term691393, term691393.getClass(), "sourcePosition", 0);
        setField(term691393, term691393.getClass(), "jsType", null);
        setField(term691394, term691394.getClass(), "str", null);
        setIntField(term691394, term691394.getClass(), "type", 114);
        setField(term691394, term691394.getClass(), "next", null);
        setField(term691394, term691394.getClass(), "first", null);
        setField(term691394, term691394.getClass(), "last", null);
        setField(term691394, term691394.getClass(), "propListHead", null);
        setIntField(term691394, term691394.getClass(), "sourcePosition", 0);
        setField(term691394, term691394.getClass(), "jsType", null);
        setField(term691394, term691394.getClass(), "parent", null);
        setField(term691393, term691393.getClass(), "parent", term691394);
        term691395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term691395, term691395.getClass(), "str", null);
        setIntField(term691395, term691395.getClass(), "type", 0);
        setField(term691395, term691395.getClass(), "next", null);
        setField(term691395, term691395.getClass(), "first", null);
        setField(term691395, term691395.getClass(), "last", null);
        setField(term691395, term691395.getClass(), "propListHead", null);
        setIntField(term691395, term691395.getClass(), "sourcePosition", 0);
        setField(term691395, term691395.getClass(), "jsType", null);
        setField(term691395, term691395.getClass(), "parent", null);
        term691396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term691396, term691396.getClass(), "number", 0.0);
        setIntField(term691396, term691396.getClass(), "type", 63);
        setField(term691396, term691396.getClass(), "next", null);
        setField(term691396, term691396.getClass(), "first", null);
        setField(term691396, term691396.getClass(), "last", null);
        setField(term691396, term691396.getClass(), "propListHead", null);
        setIntField(term691396, term691396.getClass(), "sourcePosition", 0);
        setField(term691396, term691396.getClass(), "jsType", null);
        setField(term691396, term691396.getClass(), "parent", null);
        term691314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term691314, term691314.getClass(), "functionName", null);
        setBooleanField(term691314, term691314.getClass(), "itsNeedsActivation", false);
        setIntField(term691314, term691314.getClass(), "itsFunctionType", 0);
        setBooleanField(term691314, term691314.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691314, term691314.getClass(), "encodedSourceStart", 0);
        setIntField(term691314, term691314.getClass(), "encodedSourceEnd", 0);
        setField(term691314, term691314.getClass(), "sourceName", null);
        setIntField(term691314, term691314.getClass(), "baseLineno", 0);
        setIntField(term691314, term691314.getClass(), "endLineno", 0);
        setField(term691314, term691314.getClass(), "functions", null);
        setField(term691314, term691314.getClass(), "regexps", null);
        setField(term691314, term691314.getClass(), "itsVariables", null);
        setField(term691314, term691314.getClass(), "itsConst", null);
        setField(term691314, term691314.getClass(), "itsVariableNames", null);
        setIntField(term691314, term691314.getClass(), "varStart", 0);
        setField(term691314, term691314.getClass(), "compilerData", null);
        setIntField(term691314, term691314.getClass(), "type", 63);
        setField(term691314, term691314.getClass(), "next", null);
        setField(term691314, term691314.getClass(), "first", null);
        setField(term691314, term691314.getClass(), "last", null);
        setField(term691314, term691314.getClass(), "propListHead", null);
        setIntField(term691314, term691314.getClass(), "sourcePosition", 0);
        setField(term691314, term691314.getClass(), "jsType", null);
        setField(term691325, term691325.getClass(), "str", null);
        setIntField(term691325, term691325.getClass(), "type", 114);
        setField(term691325, term691325.getClass(), "next", null);
        setField(term691325, term691325.getClass(), "first", null);
        setField(term691325, term691325.getClass(), "last", null);
        setField(term691325, term691325.getClass(), "propListHead", null);
        setIntField(term691325, term691325.getClass(), "sourcePosition", 0);
        setField(term691325, term691325.getClass(), "jsType", null);
        setField(term691325, term691325.getClass(), "parent", null);
        setField(term691314, term691314.getClass(), "parent", term691325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term690176;
        args[1] = term690360;
        args[2] = term690452;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term690090, args);
        assertTrue(recursiveEquals(term690090, term691392));
        assertTrue(recursiveEquals(term690176, term691393));
        assertTrue(recursiveEquals(term690360, term691395));
        assertTrue(recursiveEquals(term690452, term691396));
        assertTrue(recursiveEquals(retValue, term691314));
    }

};


