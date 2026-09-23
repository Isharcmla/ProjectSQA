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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540322;
     Object term540408;
     Object term540586;
     Object term540678;
     Object term541234;
     Object term541235;
     Object term541237;
     Object term541238;
     Object term541139;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term540408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term540494, term540494.getClass(), "type", 114);
        setField(term540408, term540408.getClass(), "parent", term540494);
        setIntField(term540408, term540408.getClass(), "type", 0);
        term540586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term540586, term540586.getClass(), "type", 114);
        term540678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term540678, term540678.getClass(), "type", 63);
        term541234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term541234, term541234.getClass(), "currentTraversal", null);
        term541235 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term541236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term541235, term541235.getClass(), "functionName", null);
        setBooleanField(term541235, term541235.getClass(), "itsNeedsActivation", false);
        setIntField(term541235, term541235.getClass(), "itsFunctionType", 0);
        setBooleanField(term541235, term541235.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term541235, term541235.getClass(), "encodedSourceStart", 0);
        setIntField(term541235, term541235.getClass(), "encodedSourceEnd", 0);
        setField(term541235, term541235.getClass(), "sourceName", null);
        setIntField(term541235, term541235.getClass(), "baseLineno", 0);
        setIntField(term541235, term541235.getClass(), "endLineno", 0);
        setField(term541235, term541235.getClass(), "functions", null);
        setField(term541235, term541235.getClass(), "regexps", null);
        setField(term541235, term541235.getClass(), "itsVariables", null);
        setField(term541235, term541235.getClass(), "itsConst", null);
        setField(term541235, term541235.getClass(), "itsVariableNames", null);
        setIntField(term541235, term541235.getClass(), "varStart", 0);
        setField(term541235, term541235.getClass(), "compilerData", null);
        setIntField(term541235, term541235.getClass(), "type", 0);
        setField(term541235, term541235.getClass(), "next", null);
        setField(term541235, term541235.getClass(), "first", null);
        setField(term541235, term541235.getClass(), "last", null);
        setField(term541235, term541235.getClass(), "propListHead", null);
        setIntField(term541235, term541235.getClass(), "sourcePosition", 0);
        setField(term541235, term541235.getClass(), "jsType", null);
        setField(term541236, term541236.getClass(), "functionName", null);
        setBooleanField(term541236, term541236.getClass(), "itsNeedsActivation", false);
        setIntField(term541236, term541236.getClass(), "itsFunctionType", 0);
        setBooleanField(term541236, term541236.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term541236, term541236.getClass(), "encodedSourceStart", 0);
        setIntField(term541236, term541236.getClass(), "encodedSourceEnd", 0);
        setField(term541236, term541236.getClass(), "sourceName", null);
        setIntField(term541236, term541236.getClass(), "baseLineno", 0);
        setIntField(term541236, term541236.getClass(), "endLineno", 0);
        setField(term541236, term541236.getClass(), "functions", null);
        setField(term541236, term541236.getClass(), "regexps", null);
        setField(term541236, term541236.getClass(), "itsVariables", null);
        setField(term541236, term541236.getClass(), "itsConst", null);
        setField(term541236, term541236.getClass(), "itsVariableNames", null);
        setIntField(term541236, term541236.getClass(), "varStart", 0);
        setField(term541236, term541236.getClass(), "compilerData", null);
        setIntField(term541236, term541236.getClass(), "type", 114);
        setField(term541236, term541236.getClass(), "next", null);
        setField(term541236, term541236.getClass(), "first", null);
        setField(term541236, term541236.getClass(), "last", null);
        setField(term541236, term541236.getClass(), "propListHead", null);
        setIntField(term541236, term541236.getClass(), "sourcePosition", 0);
        setField(term541236, term541236.getClass(), "jsType", null);
        setField(term541236, term541236.getClass(), "parent", null);
        setField(term541235, term541235.getClass(), "parent", term541236);
        term541237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term541237, term541237.getClass(), "number", 0.0);
        setIntField(term541237, term541237.getClass(), "type", 114);
        setField(term541237, term541237.getClass(), "next", null);
        setField(term541237, term541237.getClass(), "first", null);
        setField(term541237, term541237.getClass(), "last", null);
        setField(term541237, term541237.getClass(), "propListHead", null);
        setIntField(term541237, term541237.getClass(), "sourcePosition", 0);
        setField(term541237, term541237.getClass(), "jsType", null);
        setField(term541237, term541237.getClass(), "parent", null);
        term541238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term541238, term541238.getClass(), "number", 0.0);
        setIntField(term541238, term541238.getClass(), "type", 63);
        setField(term541238, term541238.getClass(), "next", null);
        setField(term541238, term541238.getClass(), "first", null);
        setField(term541238, term541238.getClass(), "last", null);
        setField(term541238, term541238.getClass(), "propListHead", null);
        setIntField(term541238, term541238.getClass(), "sourcePosition", 0);
        setField(term541238, term541238.getClass(), "jsType", null);
        setField(term541238, term541238.getClass(), "parent", null);
        term541139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term541150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term541139, term541139.getClass(), "functionName", null);
        setBooleanField(term541139, term541139.getClass(), "itsNeedsActivation", false);
        setIntField(term541139, term541139.getClass(), "itsFunctionType", 0);
        setBooleanField(term541139, term541139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term541139, term541139.getClass(), "encodedSourceStart", 0);
        setIntField(term541139, term541139.getClass(), "encodedSourceEnd", 0);
        setField(term541139, term541139.getClass(), "sourceName", null);
        setIntField(term541139, term541139.getClass(), "baseLineno", 0);
        setIntField(term541139, term541139.getClass(), "endLineno", 0);
        setField(term541139, term541139.getClass(), "functions", null);
        setField(term541139, term541139.getClass(), "regexps", null);
        setField(term541139, term541139.getClass(), "itsVariables", null);
        setField(term541139, term541139.getClass(), "itsConst", null);
        setField(term541139, term541139.getClass(), "itsVariableNames", null);
        setIntField(term541139, term541139.getClass(), "varStart", 0);
        setField(term541139, term541139.getClass(), "compilerData", null);
        setIntField(term541139, term541139.getClass(), "type", 0);
        setField(term541139, term541139.getClass(), "next", null);
        setField(term541139, term541139.getClass(), "first", null);
        setField(term541139, term541139.getClass(), "last", null);
        setField(term541139, term541139.getClass(), "propListHead", null);
        setIntField(term541139, term541139.getClass(), "sourcePosition", 0);
        setField(term541139, term541139.getClass(), "jsType", null);
        setField(term541150, term541150.getClass(), "functionName", null);
        setBooleanField(term541150, term541150.getClass(), "itsNeedsActivation", false);
        setIntField(term541150, term541150.getClass(), "itsFunctionType", 0);
        setBooleanField(term541150, term541150.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term541150, term541150.getClass(), "encodedSourceStart", 0);
        setIntField(term541150, term541150.getClass(), "encodedSourceEnd", 0);
        setField(term541150, term541150.getClass(), "sourceName", null);
        setIntField(term541150, term541150.getClass(), "baseLineno", 0);
        setIntField(term541150, term541150.getClass(), "endLineno", 0);
        setField(term541150, term541150.getClass(), "functions", null);
        setField(term541150, term541150.getClass(), "regexps", null);
        setField(term541150, term541150.getClass(), "itsVariables", null);
        setField(term541150, term541150.getClass(), "itsConst", null);
        setField(term541150, term541150.getClass(), "itsVariableNames", null);
        setIntField(term541150, term541150.getClass(), "varStart", 0);
        setField(term541150, term541150.getClass(), "compilerData", null);
        setIntField(term541150, term541150.getClass(), "type", 114);
        setField(term541150, term541150.getClass(), "next", null);
        setField(term541150, term541150.getClass(), "first", null);
        setField(term541150, term541150.getClass(), "last", null);
        setField(term541150, term541150.getClass(), "propListHead", null);
        setIntField(term541150, term541150.getClass(), "sourcePosition", 0);
        setField(term541150, term541150.getClass(), "jsType", null);
        setField(term541150, term541150.getClass(), "parent", null);
        setField(term541139, term541139.getClass(), "parent", term541150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term540408;
        args[1] = term540586;
        args[2] = term540678;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term540322, args);
        assertTrue(recursiveEquals(term540322, term541234));
        assertTrue(recursiveEquals(term540408, term541235));
        assertTrue(recursiveEquals(term540586, term541237));
        assertTrue(recursiveEquals(term540678, term541238));
        assertTrue(recursiveEquals(retValue, term541139));
    }

};


