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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436128;
     Object term436220;
     Object term436463;
     Object term436464;
     Object term436415;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term436220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436402 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term436312, term436312.getClass(), "next", term436402);
        setIntField(term436312, term436312.getClass(), "type", 39);
        setField(term436220, term436220.getClass(), "first", term436312);
        setIntField(term436220, term436220.getClass(), "type", 22);
        term436463 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term436463, term436463.getClass(), "currentTraversal", null);
        term436464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436466 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term436464, term436464.getClass(), "number", 0.0);
        setIntField(term436464, term436464.getClass(), "type", 22);
        setField(term436464, term436464.getClass(), "next", null);
        setDoubleField(term436465, term436465.getClass(), "number", 0.0);
        setIntField(term436465, term436465.getClass(), "type", 39);
        setIntField(term436466, term436466.getClass(), "encodedSourceStart", 0);
        setIntField(term436466, term436466.getClass(), "encodedSourceEnd", 0);
        setField(term436466, term436466.getClass(), "sourceName", null);
        setIntField(term436466, term436466.getClass(), "baseLineno", 0);
        setIntField(term436466, term436466.getClass(), "endLineno", 0);
        setField(term436466, term436466.getClass(), "functions", null);
        setField(term436466, term436466.getClass(), "regexps", null);
        setField(term436466, term436466.getClass(), "itsVariables", null);
        setField(term436466, term436466.getClass(), "itsConst", null);
        setField(term436466, term436466.getClass(), "itsVariableNames", null);
        setIntField(term436466, term436466.getClass(), "varStart", 0);
        setField(term436466, term436466.getClass(), "compilerData", null);
        setIntField(term436466, term436466.getClass(), "type", 0);
        setField(term436466, term436466.getClass(), "next", null);
        setField(term436466, term436466.getClass(), "first", null);
        setField(term436466, term436466.getClass(), "last", null);
        setField(term436466, term436466.getClass(), "propListHead", null);
        setIntField(term436466, term436466.getClass(), "sourcePosition", 0);
        setField(term436466, term436466.getClass(), "jsType", null);
        setField(term436466, term436466.getClass(), "parent", null);
        setField(term436465, term436465.getClass(), "next", term436466);
        setField(term436465, term436465.getClass(), "first", null);
        setField(term436465, term436465.getClass(), "last", null);
        setField(term436465, term436465.getClass(), "propListHead", null);
        setIntField(term436465, term436465.getClass(), "sourcePosition", 0);
        setField(term436465, term436465.getClass(), "jsType", null);
        setField(term436465, term436465.getClass(), "parent", null);
        setField(term436464, term436464.getClass(), "first", term436465);
        setField(term436464, term436464.getClass(), "last", null);
        setField(term436464, term436464.getClass(), "propListHead", null);
        setIntField(term436464, term436464.getClass(), "sourcePosition", 0);
        setField(term436464, term436464.getClass(), "jsType", null);
        setField(term436464, term436464.getClass(), "parent", null);
        term436415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436421 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term436415, term436415.getClass(), "number", 0.0);
        setIntField(term436415, term436415.getClass(), "type", 22);
        setField(term436415, term436415.getClass(), "next", null);
        setDoubleField(term436418, term436418.getClass(), "number", 0.0);
        setIntField(term436418, term436418.getClass(), "type", 39);
        setIntField(term436421, term436421.getClass(), "encodedSourceStart", 0);
        setIntField(term436421, term436421.getClass(), "encodedSourceEnd", 0);
        setField(term436421, term436421.getClass(), "sourceName", null);
        setIntField(term436421, term436421.getClass(), "baseLineno", 0);
        setIntField(term436421, term436421.getClass(), "endLineno", 0);
        setField(term436421, term436421.getClass(), "functions", null);
        setField(term436421, term436421.getClass(), "regexps", null);
        setField(term436421, term436421.getClass(), "itsVariables", null);
        setField(term436421, term436421.getClass(), "itsConst", null);
        setField(term436421, term436421.getClass(), "itsVariableNames", null);
        setIntField(term436421, term436421.getClass(), "varStart", 0);
        setField(term436421, term436421.getClass(), "compilerData", null);
        setIntField(term436421, term436421.getClass(), "type", 0);
        setField(term436421, term436421.getClass(), "next", null);
        setField(term436421, term436421.getClass(), "first", null);
        setField(term436421, term436421.getClass(), "last", null);
        setField(term436421, term436421.getClass(), "propListHead", null);
        setIntField(term436421, term436421.getClass(), "sourcePosition", 0);
        setField(term436421, term436421.getClass(), "jsType", null);
        setField(term436421, term436421.getClass(), "parent", null);
        setField(term436418, term436418.getClass(), "next", term436421);
        setField(term436418, term436418.getClass(), "first", null);
        setField(term436418, term436418.getClass(), "last", null);
        setField(term436418, term436418.getClass(), "propListHead", null);
        setIntField(term436418, term436418.getClass(), "sourcePosition", 0);
        setField(term436418, term436418.getClass(), "jsType", null);
        setField(term436418, term436418.getClass(), "parent", null);
        setField(term436415, term436415.getClass(), "first", term436418);
        setField(term436415, term436415.getClass(), "last", null);
        setField(term436415, term436415.getClass(), "propListHead", null);
        setIntField(term436415, term436415.getClass(), "sourcePosition", 0);
        setField(term436415, term436415.getClass(), "jsType", null);
        setField(term436415, term436415.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term436220;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term436128, args);
        assertTrue(recursiveEquals(term436128, term436463));
        assertTrue(recursiveEquals(term436220, term436464));
        assertTrue(recursiveEquals(retValue, term436415));
    }

};


