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

public class PeepholeFoldConstants_tryFoldAndOr_425870290636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140069;
     Object term140161;
     Object term140339;
     Object term140409;
     Object term140510;
     Object term140511;
     Object term140513;
     Object term140514;
     Object term140459;

    public PeepholeFoldConstants_tryFoldAndOr_425870290636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term140161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term140161, term140161.getClass(), "parent", term140253);
        setIntField(term140161, term140161.getClass(), "type", 0);
        term140339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term140339, term140339.getClass(), "type", 0);
        term140409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term140510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term140510, term140510.getClass(), "currentTraversal", null);
        term140511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term140511, term140511.getClass(), "number", 0.0);
        setIntField(term140511, term140511.getClass(), "type", 0);
        setField(term140511, term140511.getClass(), "next", null);
        setField(term140511, term140511.getClass(), "first", null);
        setField(term140511, term140511.getClass(), "last", null);
        setField(term140511, term140511.getClass(), "propListHead", null);
        setIntField(term140511, term140511.getClass(), "sourcePosition", 0);
        setField(term140511, term140511.getClass(), "jsType", null);
        setDoubleField(term140512, term140512.getClass(), "number", 0.0);
        setIntField(term140512, term140512.getClass(), "type", 0);
        setField(term140512, term140512.getClass(), "next", null);
        setField(term140512, term140512.getClass(), "first", null);
        setField(term140512, term140512.getClass(), "last", null);
        setField(term140512, term140512.getClass(), "propListHead", null);
        setIntField(term140512, term140512.getClass(), "sourcePosition", 0);
        setField(term140512, term140512.getClass(), "jsType", null);
        setField(term140512, term140512.getClass(), "parent", null);
        setField(term140511, term140511.getClass(), "parent", term140512);
        term140513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140513, term140513.getClass(), "functionName", null);
        setBooleanField(term140513, term140513.getClass(), "itsNeedsActivation", false);
        setIntField(term140513, term140513.getClass(), "itsFunctionType", 0);
        setBooleanField(term140513, term140513.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140513, term140513.getClass(), "encodedSourceStart", 0);
        setIntField(term140513, term140513.getClass(), "encodedSourceEnd", 0);
        setField(term140513, term140513.getClass(), "sourceName", null);
        setIntField(term140513, term140513.getClass(), "baseLineno", 0);
        setIntField(term140513, term140513.getClass(), "endLineno", 0);
        setField(term140513, term140513.getClass(), "functions", null);
        setField(term140513, term140513.getClass(), "regexps", null);
        setField(term140513, term140513.getClass(), "itsVariables", null);
        setField(term140513, term140513.getClass(), "itsConst", null);
        setField(term140513, term140513.getClass(), "itsVariableNames", null);
        setIntField(term140513, term140513.getClass(), "varStart", 0);
        setField(term140513, term140513.getClass(), "compilerData", null);
        setIntField(term140513, term140513.getClass(), "type", 0);
        setField(term140513, term140513.getClass(), "next", null);
        setField(term140513, term140513.getClass(), "first", null);
        setField(term140513, term140513.getClass(), "last", null);
        setField(term140513, term140513.getClass(), "propListHead", null);
        setIntField(term140513, term140513.getClass(), "sourcePosition", 0);
        setField(term140513, term140513.getClass(), "jsType", null);
        setField(term140513, term140513.getClass(), "parent", null);
        term140514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140514, term140514.getClass(), "type", 0);
        setField(term140514, term140514.getClass(), "next", null);
        setField(term140514, term140514.getClass(), "first", null);
        setField(term140514, term140514.getClass(), "last", null);
        setField(term140514, term140514.getClass(), "propListHead", null);
        setIntField(term140514, term140514.getClass(), "sourcePosition", 0);
        setField(term140514, term140514.getClass(), "jsType", null);
        setField(term140514, term140514.getClass(), "parent", null);
        term140459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term140459, term140459.getClass(), "number", 0.0);
        setIntField(term140459, term140459.getClass(), "type", 0);
        setField(term140459, term140459.getClass(), "next", null);
        setField(term140459, term140459.getClass(), "first", null);
        setField(term140459, term140459.getClass(), "last", null);
        setField(term140459, term140459.getClass(), "propListHead", null);
        setIntField(term140459, term140459.getClass(), "sourcePosition", 0);
        setField(term140459, term140459.getClass(), "jsType", null);
        setDoubleField(term140463, term140463.getClass(), "number", 0.0);
        setIntField(term140463, term140463.getClass(), "type", 0);
        setField(term140463, term140463.getClass(), "next", null);
        setField(term140463, term140463.getClass(), "first", null);
        setField(term140463, term140463.getClass(), "last", null);
        setField(term140463, term140463.getClass(), "propListHead", null);
        setIntField(term140463, term140463.getClass(), "sourcePosition", 0);
        setField(term140463, term140463.getClass(), "jsType", null);
        setField(term140463, term140463.getClass(), "parent", null);
        setField(term140459, term140459.getClass(), "parent", term140463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term140161;
        args[1] = term140339;
        args[2] = term140409;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term140069, args);
        assertTrue(recursiveEquals(term140069, term140510));
        assertTrue(recursiveEquals(term140161, term140511));
        assertTrue(recursiveEquals(term140339, term140513));
        assertTrue(recursiveEquals(term140409, term140514));
        assertTrue(recursiveEquals(retValue, term140459));
    }

};


