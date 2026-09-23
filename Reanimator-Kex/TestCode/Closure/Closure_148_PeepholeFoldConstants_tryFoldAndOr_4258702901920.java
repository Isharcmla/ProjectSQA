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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509226;
     Object term509312;
     Object term509496;
     Object term509588;
     Object term510027;
     Object term510028;
     Object term510030;
     Object term510031;
     Object term509948;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term509312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term509404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term509404, term509404.getClass(), "type", 108);
        setField(term509312, term509312.getClass(), "parent", term509404);
        setIntField(term509312, term509312.getClass(), "type", 100);
        term509496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term509496, term509496.getClass(), "type", 111);
        term509588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term509588, term509588.getClass(), "type", 44);
        term510027 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term510027, term510027.getClass(), "currentTraversal", null);
        term510028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term510029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term510028, term510028.getClass(), "functionName", null);
        setBooleanField(term510028, term510028.getClass(), "itsNeedsActivation", false);
        setIntField(term510028, term510028.getClass(), "itsFunctionType", 0);
        setBooleanField(term510028, term510028.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term510028, term510028.getClass(), "encodedSourceStart", 0);
        setIntField(term510028, term510028.getClass(), "encodedSourceEnd", 0);
        setField(term510028, term510028.getClass(), "sourceName", null);
        setIntField(term510028, term510028.getClass(), "baseLineno", 0);
        setIntField(term510028, term510028.getClass(), "endLineno", 0);
        setField(term510028, term510028.getClass(), "functions", null);
        setField(term510028, term510028.getClass(), "regexps", null);
        setField(term510028, term510028.getClass(), "itsVariables", null);
        setField(term510028, term510028.getClass(), "itsConst", null);
        setField(term510028, term510028.getClass(), "itsVariableNames", null);
        setIntField(term510028, term510028.getClass(), "varStart", 0);
        setField(term510028, term510028.getClass(), "compilerData", null);
        setIntField(term510028, term510028.getClass(), "type", 100);
        setField(term510028, term510028.getClass(), "next", null);
        setField(term510028, term510028.getClass(), "first", null);
        setField(term510028, term510028.getClass(), "last", null);
        setField(term510028, term510028.getClass(), "propListHead", null);
        setIntField(term510028, term510028.getClass(), "sourcePosition", 0);
        setField(term510028, term510028.getClass(), "jsType", null);
        setDoubleField(term510029, term510029.getClass(), "number", 0.0);
        setIntField(term510029, term510029.getClass(), "type", 108);
        setField(term510029, term510029.getClass(), "next", null);
        setField(term510029, term510029.getClass(), "first", null);
        setField(term510029, term510029.getClass(), "last", null);
        setField(term510029, term510029.getClass(), "propListHead", null);
        setIntField(term510029, term510029.getClass(), "sourcePosition", 0);
        setField(term510029, term510029.getClass(), "jsType", null);
        setField(term510029, term510029.getClass(), "parent", null);
        setField(term510028, term510028.getClass(), "parent", term510029);
        term510030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term510030, term510030.getClass(), "number", 0.0);
        setIntField(term510030, term510030.getClass(), "type", 111);
        setField(term510030, term510030.getClass(), "next", null);
        setField(term510030, term510030.getClass(), "first", null);
        setField(term510030, term510030.getClass(), "last", null);
        setField(term510030, term510030.getClass(), "propListHead", null);
        setIntField(term510030, term510030.getClass(), "sourcePosition", 0);
        setField(term510030, term510030.getClass(), "jsType", null);
        setField(term510030, term510030.getClass(), "parent", null);
        term510031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term510031, term510031.getClass(), "str", null);
        setIntField(term510031, term510031.getClass(), "type", 44);
        setField(term510031, term510031.getClass(), "next", null);
        setField(term510031, term510031.getClass(), "first", null);
        setField(term510031, term510031.getClass(), "last", null);
        setField(term510031, term510031.getClass(), "propListHead", null);
        setIntField(term510031, term510031.getClass(), "sourcePosition", 0);
        setField(term510031, term510031.getClass(), "jsType", null);
        setField(term510031, term510031.getClass(), "parent", null);
        term509948 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term509959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term509948, term509948.getClass(), "functionName", null);
        setBooleanField(term509948, term509948.getClass(), "itsNeedsActivation", false);
        setIntField(term509948, term509948.getClass(), "itsFunctionType", 0);
        setBooleanField(term509948, term509948.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term509948, term509948.getClass(), "encodedSourceStart", 0);
        setIntField(term509948, term509948.getClass(), "encodedSourceEnd", 0);
        setField(term509948, term509948.getClass(), "sourceName", null);
        setIntField(term509948, term509948.getClass(), "baseLineno", 0);
        setIntField(term509948, term509948.getClass(), "endLineno", 0);
        setField(term509948, term509948.getClass(), "functions", null);
        setField(term509948, term509948.getClass(), "regexps", null);
        setField(term509948, term509948.getClass(), "itsVariables", null);
        setField(term509948, term509948.getClass(), "itsConst", null);
        setField(term509948, term509948.getClass(), "itsVariableNames", null);
        setIntField(term509948, term509948.getClass(), "varStart", 0);
        setField(term509948, term509948.getClass(), "compilerData", null);
        setIntField(term509948, term509948.getClass(), "type", 100);
        setField(term509948, term509948.getClass(), "next", null);
        setField(term509948, term509948.getClass(), "first", null);
        setField(term509948, term509948.getClass(), "last", null);
        setField(term509948, term509948.getClass(), "propListHead", null);
        setIntField(term509948, term509948.getClass(), "sourcePosition", 0);
        setField(term509948, term509948.getClass(), "jsType", null);
        setDoubleField(term509959, term509959.getClass(), "number", 0.0);
        setIntField(term509959, term509959.getClass(), "type", 108);
        setField(term509959, term509959.getClass(), "next", null);
        setField(term509959, term509959.getClass(), "first", null);
        setField(term509959, term509959.getClass(), "last", null);
        setField(term509959, term509959.getClass(), "propListHead", null);
        setIntField(term509959, term509959.getClass(), "sourcePosition", 0);
        setField(term509959, term509959.getClass(), "jsType", null);
        setField(term509959, term509959.getClass(), "parent", null);
        setField(term509948, term509948.getClass(), "parent", term509959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term509312;
        args[1] = term509496;
        args[2] = term509588;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term509226, args);
        assertTrue(recursiveEquals(term509226, term510027));
        assertTrue(recursiveEquals(term509312, term510028));
        assertTrue(recursiveEquals(term509496, term510030));
        assertTrue(recursiveEquals(term509588, term510031));
        assertTrue(recursiveEquals(retValue, term509948));
    }

};


