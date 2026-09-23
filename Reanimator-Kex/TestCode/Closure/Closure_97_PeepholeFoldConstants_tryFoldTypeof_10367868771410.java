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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532831;
     Object term532917;
     Object term533111;
     Object term533112;
     Object term533078;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532831 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term532917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term532917, term532917.getClass(), "type", 32);
        setField(term532917, term532917.getClass(), "first", term533009);
        term533111 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term533111, term533111.getClass(), "currentTraversal", null);
        term533112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term533112, term533112.getClass(), "functionName", null);
        setBooleanField(term533112, term533112.getClass(), "itsNeedsActivation", false);
        setIntField(term533112, term533112.getClass(), "itsFunctionType", 0);
        setBooleanField(term533112, term533112.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533112, term533112.getClass(), "encodedSourceStart", 0);
        setIntField(term533112, term533112.getClass(), "encodedSourceEnd", 0);
        setField(term533112, term533112.getClass(), "sourceName", null);
        setIntField(term533112, term533112.getClass(), "baseLineno", 0);
        setIntField(term533112, term533112.getClass(), "endLineno", 0);
        setField(term533112, term533112.getClass(), "functions", null);
        setField(term533112, term533112.getClass(), "regexps", null);
        setField(term533112, term533112.getClass(), "itsVariables", null);
        setField(term533112, term533112.getClass(), "itsConst", null);
        setField(term533112, term533112.getClass(), "itsVariableNames", null);
        setIntField(term533112, term533112.getClass(), "varStart", 0);
        setField(term533112, term533112.getClass(), "compilerData", null);
        setIntField(term533112, term533112.getClass(), "type", 32);
        setField(term533112, term533112.getClass(), "next", null);
        setDoubleField(term533113, term533113.getClass(), "number", 0.0);
        setIntField(term533113, term533113.getClass(), "type", 0);
        setField(term533113, term533113.getClass(), "next", null);
        setField(term533113, term533113.getClass(), "first", null);
        setField(term533113, term533113.getClass(), "last", null);
        setField(term533113, term533113.getClass(), "propListHead", null);
        setIntField(term533113, term533113.getClass(), "sourcePosition", 0);
        setField(term533113, term533113.getClass(), "jsType", null);
        setField(term533113, term533113.getClass(), "parent", null);
        setField(term533112, term533112.getClass(), "first", term533113);
        setField(term533112, term533112.getClass(), "last", null);
        setField(term533112, term533112.getClass(), "propListHead", null);
        setIntField(term533112, term533112.getClass(), "sourcePosition", 0);
        setField(term533112, term533112.getClass(), "jsType", null);
        setField(term533112, term533112.getClass(), "parent", null);
        term533078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term533078, term533078.getClass(), "functionName", null);
        setBooleanField(term533078, term533078.getClass(), "itsNeedsActivation", false);
        setIntField(term533078, term533078.getClass(), "itsFunctionType", 0);
        setBooleanField(term533078, term533078.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533078, term533078.getClass(), "encodedSourceStart", 0);
        setIntField(term533078, term533078.getClass(), "encodedSourceEnd", 0);
        setField(term533078, term533078.getClass(), "sourceName", null);
        setIntField(term533078, term533078.getClass(), "baseLineno", 0);
        setIntField(term533078, term533078.getClass(), "endLineno", 0);
        setField(term533078, term533078.getClass(), "functions", null);
        setField(term533078, term533078.getClass(), "regexps", null);
        setField(term533078, term533078.getClass(), "itsVariables", null);
        setField(term533078, term533078.getClass(), "itsConst", null);
        setField(term533078, term533078.getClass(), "itsVariableNames", null);
        setIntField(term533078, term533078.getClass(), "varStart", 0);
        setField(term533078, term533078.getClass(), "compilerData", null);
        setIntField(term533078, term533078.getClass(), "type", 32);
        setField(term533078, term533078.getClass(), "next", null);
        setDoubleField(term533088, term533088.getClass(), "number", 0.0);
        setIntField(term533088, term533088.getClass(), "type", 0);
        setField(term533088, term533088.getClass(), "next", null);
        setField(term533088, term533088.getClass(), "first", null);
        setField(term533088, term533088.getClass(), "last", null);
        setField(term533088, term533088.getClass(), "propListHead", null);
        setIntField(term533088, term533088.getClass(), "sourcePosition", 0);
        setField(term533088, term533088.getClass(), "jsType", null);
        setField(term533088, term533088.getClass(), "parent", null);
        setField(term533078, term533078.getClass(), "first", term533088);
        setField(term533078, term533078.getClass(), "last", null);
        setField(term533078, term533078.getClass(), "propListHead", null);
        setIntField(term533078, term533078.getClass(), "sourcePosition", 0);
        setField(term533078, term533078.getClass(), "jsType", null);
        setField(term533078, term533078.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term532917;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term532831, args);
        assertTrue(recursiveEquals(term532831, term533111));
        assertTrue(recursiveEquals(term532917, term533112));
        assertTrue(recursiveEquals(retValue, term533078));
    }

};


