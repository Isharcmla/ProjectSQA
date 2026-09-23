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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516353;
     Object term516445;
     Object term517139;
     Object term517140;
     Object term517085;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term516445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term516537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term516627 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term516537, term516537.getClass(), "next", term516627);
        setIntField(term516537, term516537.getClass(), "type", 39);
        setField(term516445, term516445.getClass(), "first", term516537);
        setIntField(term516445, term516445.getClass(), "type", 9);
        term517139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517139, term517139.getClass(), "currentTraversal", null);
        term517140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517142 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term517140, term517140.getClass(), "number", 0.0);
        setIntField(term517140, term517140.getClass(), "type", 9);
        setField(term517140, term517140.getClass(), "next", null);
        setDoubleField(term517141, term517141.getClass(), "number", 0.0);
        setIntField(term517141, term517141.getClass(), "type", 39);
        setIntField(term517142, term517142.getClass(), "encodedSourceStart", 0);
        setIntField(term517142, term517142.getClass(), "encodedSourceEnd", 0);
        setField(term517142, term517142.getClass(), "sourceName", null);
        setIntField(term517142, term517142.getClass(), "baseLineno", 0);
        setIntField(term517142, term517142.getClass(), "endLineno", 0);
        setField(term517142, term517142.getClass(), "functions", null);
        setField(term517142, term517142.getClass(), "regexps", null);
        setField(term517142, term517142.getClass(), "itsVariables", null);
        setField(term517142, term517142.getClass(), "itsConst", null);
        setField(term517142, term517142.getClass(), "itsVariableNames", null);
        setIntField(term517142, term517142.getClass(), "varStart", 0);
        setField(term517142, term517142.getClass(), "compilerData", null);
        setIntField(term517142, term517142.getClass(), "type", 0);
        setField(term517142, term517142.getClass(), "next", null);
        setField(term517142, term517142.getClass(), "first", null);
        setField(term517142, term517142.getClass(), "last", null);
        setField(term517142, term517142.getClass(), "propListHead", null);
        setIntField(term517142, term517142.getClass(), "sourcePosition", 0);
        setField(term517142, term517142.getClass(), "jsType", null);
        setField(term517142, term517142.getClass(), "parent", null);
        setField(term517141, term517141.getClass(), "next", term517142);
        setField(term517141, term517141.getClass(), "first", null);
        setField(term517141, term517141.getClass(), "last", null);
        setField(term517141, term517141.getClass(), "propListHead", null);
        setIntField(term517141, term517141.getClass(), "sourcePosition", 0);
        setField(term517141, term517141.getClass(), "jsType", null);
        setField(term517141, term517141.getClass(), "parent", null);
        setField(term517140, term517140.getClass(), "first", term517141);
        setField(term517140, term517140.getClass(), "last", null);
        setField(term517140, term517140.getClass(), "propListHead", null);
        setIntField(term517140, term517140.getClass(), "sourcePosition", 0);
        setField(term517140, term517140.getClass(), "jsType", null);
        setField(term517140, term517140.getClass(), "parent", null);
        term517085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517091 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term517085, term517085.getClass(), "number", 0.0);
        setIntField(term517085, term517085.getClass(), "type", 9);
        setField(term517085, term517085.getClass(), "next", null);
        setDoubleField(term517088, term517088.getClass(), "number", 0.0);
        setIntField(term517088, term517088.getClass(), "type", 39);
        setIntField(term517091, term517091.getClass(), "encodedSourceStart", 0);
        setIntField(term517091, term517091.getClass(), "encodedSourceEnd", 0);
        setField(term517091, term517091.getClass(), "sourceName", null);
        setIntField(term517091, term517091.getClass(), "baseLineno", 0);
        setIntField(term517091, term517091.getClass(), "endLineno", 0);
        setField(term517091, term517091.getClass(), "functions", null);
        setField(term517091, term517091.getClass(), "regexps", null);
        setField(term517091, term517091.getClass(), "itsVariables", null);
        setField(term517091, term517091.getClass(), "itsConst", null);
        setField(term517091, term517091.getClass(), "itsVariableNames", null);
        setIntField(term517091, term517091.getClass(), "varStart", 0);
        setField(term517091, term517091.getClass(), "compilerData", null);
        setIntField(term517091, term517091.getClass(), "type", 0);
        setField(term517091, term517091.getClass(), "next", null);
        setField(term517091, term517091.getClass(), "first", null);
        setField(term517091, term517091.getClass(), "last", null);
        setField(term517091, term517091.getClass(), "propListHead", null);
        setIntField(term517091, term517091.getClass(), "sourcePosition", 0);
        setField(term517091, term517091.getClass(), "jsType", null);
        setField(term517091, term517091.getClass(), "parent", null);
        setField(term517088, term517088.getClass(), "next", term517091);
        setField(term517088, term517088.getClass(), "first", null);
        setField(term517088, term517088.getClass(), "last", null);
        setField(term517088, term517088.getClass(), "propListHead", null);
        setIntField(term517088, term517088.getClass(), "sourcePosition", 0);
        setField(term517088, term517088.getClass(), "jsType", null);
        setField(term517088, term517088.getClass(), "parent", null);
        setField(term517085, term517085.getClass(), "first", term517088);
        setField(term517085, term517085.getClass(), "last", null);
        setField(term517085, term517085.getClass(), "propListHead", null);
        setIntField(term517085, term517085.getClass(), "sourcePosition", 0);
        setField(term517085, term517085.getClass(), "jsType", null);
        setField(term517085, term517085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term516445;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term516353, args);
        assertTrue(recursiveEquals(term516353, term517139));
        assertTrue(recursiveEquals(term516445, term517140));
        assertTrue(recursiveEquals(retValue, term517085));
    }

};


