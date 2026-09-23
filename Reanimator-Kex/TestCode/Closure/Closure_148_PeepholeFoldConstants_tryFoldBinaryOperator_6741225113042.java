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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895718;
     Object term895810;
     Object term896136;
     Object term896137;
     Object term896071;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term895810 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895896 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term895966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term895966, term895966.getClass(), "type", 16);
        setField(term895896, term895896.getClass(), "next", term895966);
        setIntField(term895896, term895896.getClass(), "type", 42);
        setField(term895810, term895810.getClass(), "first", term895896);
        setIntField(term895810, term895810.getClass(), "type", 16);
        term896136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term896136, term896136.getClass(), "currentTraversal", null);
        term896137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term896138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term896137, term896137.getClass(), "number", 0.0);
        setIntField(term896137, term896137.getClass(), "type", 16);
        setField(term896137, term896137.getClass(), "next", null);
        setField(term896138, term896138.getClass(), "functionName", null);
        setBooleanField(term896138, term896138.getClass(), "itsNeedsActivation", false);
        setIntField(term896138, term896138.getClass(), "itsFunctionType", 0);
        setBooleanField(term896138, term896138.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896138, term896138.getClass(), "encodedSourceStart", 0);
        setIntField(term896138, term896138.getClass(), "encodedSourceEnd", 0);
        setField(term896138, term896138.getClass(), "sourceName", null);
        setIntField(term896138, term896138.getClass(), "baseLineno", 0);
        setIntField(term896138, term896138.getClass(), "endLineno", 0);
        setField(term896138, term896138.getClass(), "functions", null);
        setField(term896138, term896138.getClass(), "regexps", null);
        setField(term896138, term896138.getClass(), "itsVariables", null);
        setField(term896138, term896138.getClass(), "itsConst", null);
        setField(term896138, term896138.getClass(), "itsVariableNames", null);
        setIntField(term896138, term896138.getClass(), "varStart", 0);
        setField(term896138, term896138.getClass(), "compilerData", null);
        setIntField(term896138, term896138.getClass(), "type", 42);
        setIntField(term896139, term896139.getClass(), "type", 16);
        setField(term896139, term896139.getClass(), "next", null);
        setField(term896139, term896139.getClass(), "first", null);
        setField(term896139, term896139.getClass(), "last", null);
        setField(term896139, term896139.getClass(), "propListHead", null);
        setIntField(term896139, term896139.getClass(), "sourcePosition", 0);
        setField(term896139, term896139.getClass(), "jsType", null);
        setField(term896139, term896139.getClass(), "parent", null);
        setField(term896138, term896138.getClass(), "next", term896139);
        setField(term896138, term896138.getClass(), "first", null);
        setField(term896138, term896138.getClass(), "last", null);
        setField(term896138, term896138.getClass(), "propListHead", null);
        setIntField(term896138, term896138.getClass(), "sourcePosition", 0);
        setField(term896138, term896138.getClass(), "jsType", null);
        setField(term896138, term896138.getClass(), "parent", null);
        setField(term896137, term896137.getClass(), "first", term896138);
        setField(term896137, term896137.getClass(), "last", null);
        setField(term896137, term896137.getClass(), "propListHead", null);
        setIntField(term896137, term896137.getClass(), "sourcePosition", 0);
        setField(term896137, term896137.getClass(), "jsType", null);
        setField(term896137, term896137.getClass(), "parent", null);
        term896071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term896074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term896071, term896071.getClass(), "number", 0.0);
        setIntField(term896071, term896071.getClass(), "type", 16);
        setField(term896071, term896071.getClass(), "next", null);
        setField(term896074, term896074.getClass(), "functionName", null);
        setBooleanField(term896074, term896074.getClass(), "itsNeedsActivation", false);
        setIntField(term896074, term896074.getClass(), "itsFunctionType", 0);
        setBooleanField(term896074, term896074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896074, term896074.getClass(), "encodedSourceStart", 0);
        setIntField(term896074, term896074.getClass(), "encodedSourceEnd", 0);
        setField(term896074, term896074.getClass(), "sourceName", null);
        setIntField(term896074, term896074.getClass(), "baseLineno", 0);
        setIntField(term896074, term896074.getClass(), "endLineno", 0);
        setField(term896074, term896074.getClass(), "functions", null);
        setField(term896074, term896074.getClass(), "regexps", null);
        setField(term896074, term896074.getClass(), "itsVariables", null);
        setField(term896074, term896074.getClass(), "itsConst", null);
        setField(term896074, term896074.getClass(), "itsVariableNames", null);
        setIntField(term896074, term896074.getClass(), "varStart", 0);
        setField(term896074, term896074.getClass(), "compilerData", null);
        setIntField(term896074, term896074.getClass(), "type", 42);
        setIntField(term896084, term896084.getClass(), "type", 16);
        setField(term896084, term896084.getClass(), "next", null);
        setField(term896084, term896084.getClass(), "first", null);
        setField(term896084, term896084.getClass(), "last", null);
        setField(term896084, term896084.getClass(), "propListHead", null);
        setIntField(term896084, term896084.getClass(), "sourcePosition", 0);
        setField(term896084, term896084.getClass(), "jsType", null);
        setField(term896084, term896084.getClass(), "parent", null);
        setField(term896074, term896074.getClass(), "next", term896084);
        setField(term896074, term896074.getClass(), "first", null);
        setField(term896074, term896074.getClass(), "last", null);
        setField(term896074, term896074.getClass(), "propListHead", null);
        setIntField(term896074, term896074.getClass(), "sourcePosition", 0);
        setField(term896074, term896074.getClass(), "jsType", null);
        setField(term896074, term896074.getClass(), "parent", null);
        setField(term896071, term896071.getClass(), "first", term896074);
        setField(term896071, term896071.getClass(), "last", null);
        setField(term896071, term896071.getClass(), "propListHead", null);
        setIntField(term896071, term896071.getClass(), "sourcePosition", 0);
        setField(term896071, term896071.getClass(), "jsType", null);
        setField(term896071, term896071.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term895810;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term895718, args);
        assertTrue(recursiveEquals(term895718, term896136));
        assertTrue(recursiveEquals(term895810, term896137));
        assertTrue(recursiveEquals(retValue, term896071));
    }

};


