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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591726;
     Object term591812;
     Object term591990;
     Object term592082;
     Object term592189;
     Object term592190;
     Object term592192;
     Object term592193;
     Object term592094;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term591812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term591898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term591898, term591898.getClass(), "type", 114);
        setField(term591812, term591812.getClass(), "parent", term591898);
        setIntField(term591812, term591812.getClass(), "type", 0);
        term591990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term591990, term591990.getClass(), "type", 66);
        term592082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term592082, term592082.getClass(), "type", 63);
        term592189 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term592189, term592189.getClass(), "currentTraversal", null);
        term592190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term592191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term592190, term592190.getClass(), "functionName", null);
        setBooleanField(term592190, term592190.getClass(), "itsNeedsActivation", false);
        setIntField(term592190, term592190.getClass(), "itsFunctionType", 0);
        setBooleanField(term592190, term592190.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term592190, term592190.getClass(), "encodedSourceStart", 0);
        setIntField(term592190, term592190.getClass(), "encodedSourceEnd", 0);
        setField(term592190, term592190.getClass(), "sourceName", null);
        setIntField(term592190, term592190.getClass(), "baseLineno", 0);
        setIntField(term592190, term592190.getClass(), "endLineno", 0);
        setField(term592190, term592190.getClass(), "functions", null);
        setField(term592190, term592190.getClass(), "regexps", null);
        setField(term592190, term592190.getClass(), "itsVariables", null);
        setField(term592190, term592190.getClass(), "itsConst", null);
        setField(term592190, term592190.getClass(), "itsVariableNames", null);
        setIntField(term592190, term592190.getClass(), "varStart", 0);
        setField(term592190, term592190.getClass(), "compilerData", null);
        setIntField(term592190, term592190.getClass(), "type", 0);
        setField(term592190, term592190.getClass(), "next", null);
        setField(term592190, term592190.getClass(), "first", null);
        setField(term592190, term592190.getClass(), "last", null);
        setField(term592190, term592190.getClass(), "propListHead", null);
        setIntField(term592190, term592190.getClass(), "sourcePosition", 0);
        setField(term592190, term592190.getClass(), "jsType", null);
        setField(term592191, term592191.getClass(), "functionName", null);
        setBooleanField(term592191, term592191.getClass(), "itsNeedsActivation", false);
        setIntField(term592191, term592191.getClass(), "itsFunctionType", 0);
        setBooleanField(term592191, term592191.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term592191, term592191.getClass(), "encodedSourceStart", 0);
        setIntField(term592191, term592191.getClass(), "encodedSourceEnd", 0);
        setField(term592191, term592191.getClass(), "sourceName", null);
        setIntField(term592191, term592191.getClass(), "baseLineno", 0);
        setIntField(term592191, term592191.getClass(), "endLineno", 0);
        setField(term592191, term592191.getClass(), "functions", null);
        setField(term592191, term592191.getClass(), "regexps", null);
        setField(term592191, term592191.getClass(), "itsVariables", null);
        setField(term592191, term592191.getClass(), "itsConst", null);
        setField(term592191, term592191.getClass(), "itsVariableNames", null);
        setIntField(term592191, term592191.getClass(), "varStart", 0);
        setField(term592191, term592191.getClass(), "compilerData", null);
        setIntField(term592191, term592191.getClass(), "type", 114);
        setField(term592191, term592191.getClass(), "next", null);
        setField(term592191, term592191.getClass(), "first", null);
        setField(term592191, term592191.getClass(), "last", null);
        setField(term592191, term592191.getClass(), "propListHead", null);
        setIntField(term592191, term592191.getClass(), "sourcePosition", 0);
        setField(term592191, term592191.getClass(), "jsType", null);
        setField(term592191, term592191.getClass(), "parent", null);
        setField(term592190, term592190.getClass(), "parent", term592191);
        term592192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term592192, term592192.getClass(), "number", 0.0);
        setIntField(term592192, term592192.getClass(), "type", 66);
        setField(term592192, term592192.getClass(), "next", null);
        setField(term592192, term592192.getClass(), "first", null);
        setField(term592192, term592192.getClass(), "last", null);
        setField(term592192, term592192.getClass(), "propListHead", null);
        setIntField(term592192, term592192.getClass(), "sourcePosition", 0);
        setField(term592192, term592192.getClass(), "jsType", null);
        setField(term592192, term592192.getClass(), "parent", null);
        term592193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term592193, term592193.getClass(), "number", 0.0);
        setIntField(term592193, term592193.getClass(), "type", 63);
        setField(term592193, term592193.getClass(), "next", null);
        setField(term592193, term592193.getClass(), "first", null);
        setField(term592193, term592193.getClass(), "last", null);
        setField(term592193, term592193.getClass(), "propListHead", null);
        setIntField(term592193, term592193.getClass(), "sourcePosition", 0);
        setField(term592193, term592193.getClass(), "jsType", null);
        setField(term592193, term592193.getClass(), "parent", null);
        term592094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term592105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term592094, term592094.getClass(), "functionName", null);
        setBooleanField(term592094, term592094.getClass(), "itsNeedsActivation", false);
        setIntField(term592094, term592094.getClass(), "itsFunctionType", 0);
        setBooleanField(term592094, term592094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term592094, term592094.getClass(), "encodedSourceStart", 0);
        setIntField(term592094, term592094.getClass(), "encodedSourceEnd", 0);
        setField(term592094, term592094.getClass(), "sourceName", null);
        setIntField(term592094, term592094.getClass(), "baseLineno", 0);
        setIntField(term592094, term592094.getClass(), "endLineno", 0);
        setField(term592094, term592094.getClass(), "functions", null);
        setField(term592094, term592094.getClass(), "regexps", null);
        setField(term592094, term592094.getClass(), "itsVariables", null);
        setField(term592094, term592094.getClass(), "itsConst", null);
        setField(term592094, term592094.getClass(), "itsVariableNames", null);
        setIntField(term592094, term592094.getClass(), "varStart", 0);
        setField(term592094, term592094.getClass(), "compilerData", null);
        setIntField(term592094, term592094.getClass(), "type", 0);
        setField(term592094, term592094.getClass(), "next", null);
        setField(term592094, term592094.getClass(), "first", null);
        setField(term592094, term592094.getClass(), "last", null);
        setField(term592094, term592094.getClass(), "propListHead", null);
        setIntField(term592094, term592094.getClass(), "sourcePosition", 0);
        setField(term592094, term592094.getClass(), "jsType", null);
        setField(term592105, term592105.getClass(), "functionName", null);
        setBooleanField(term592105, term592105.getClass(), "itsNeedsActivation", false);
        setIntField(term592105, term592105.getClass(), "itsFunctionType", 0);
        setBooleanField(term592105, term592105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term592105, term592105.getClass(), "encodedSourceStart", 0);
        setIntField(term592105, term592105.getClass(), "encodedSourceEnd", 0);
        setField(term592105, term592105.getClass(), "sourceName", null);
        setIntField(term592105, term592105.getClass(), "baseLineno", 0);
        setIntField(term592105, term592105.getClass(), "endLineno", 0);
        setField(term592105, term592105.getClass(), "functions", null);
        setField(term592105, term592105.getClass(), "regexps", null);
        setField(term592105, term592105.getClass(), "itsVariables", null);
        setField(term592105, term592105.getClass(), "itsConst", null);
        setField(term592105, term592105.getClass(), "itsVariableNames", null);
        setIntField(term592105, term592105.getClass(), "varStart", 0);
        setField(term592105, term592105.getClass(), "compilerData", null);
        setIntField(term592105, term592105.getClass(), "type", 114);
        setField(term592105, term592105.getClass(), "next", null);
        setField(term592105, term592105.getClass(), "first", null);
        setField(term592105, term592105.getClass(), "last", null);
        setField(term592105, term592105.getClass(), "propListHead", null);
        setIntField(term592105, term592105.getClass(), "sourcePosition", 0);
        setField(term592105, term592105.getClass(), "jsType", null);
        setField(term592105, term592105.getClass(), "parent", null);
        setField(term592094, term592094.getClass(), "parent", term592105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term591812;
        args[1] = term591990;
        args[2] = term592082;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term591726, args);
        assertTrue(recursiveEquals(term591726, term592189));
        assertTrue(recursiveEquals(term591812, term592190));
        assertTrue(recursiveEquals(term591990, term592192));
        assertTrue(recursiveEquals(term592082, term592193));
        assertTrue(recursiveEquals(retValue, term592094));
    }

};


