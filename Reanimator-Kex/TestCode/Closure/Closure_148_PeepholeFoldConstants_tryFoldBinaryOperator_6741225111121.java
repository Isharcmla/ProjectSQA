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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263440;
     Object term263532;
     Object term264192;
     Object term264193;
     Object term264131;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263440 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term263532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263714 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term263624, term263624.getClass(), "next", term263714);
        setIntField(term263624, term263624.getClass(), "type", 16);
        setField(term263532, term263532.getClass(), "first", term263624);
        setIntField(term263532, term263532.getClass(), "type", 16);
        term264192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term264192, term264192.getClass(), "currentTraversal", null);
        term264193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term264194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term264195 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term264193, term264193.getClass(), "number", 0.0);
        setIntField(term264193, term264193.getClass(), "type", 16);
        setField(term264193, term264193.getClass(), "next", null);
        setDoubleField(term264194, term264194.getClass(), "number", 0.0);
        setIntField(term264194, term264194.getClass(), "type", 16);
        setIntField(term264195, term264195.getClass(), "encodedSourceStart", 0);
        setIntField(term264195, term264195.getClass(), "encodedSourceEnd", 0);
        setField(term264195, term264195.getClass(), "sourceName", null);
        setIntField(term264195, term264195.getClass(), "baseLineno", 0);
        setIntField(term264195, term264195.getClass(), "endLineno", 0);
        setField(term264195, term264195.getClass(), "functions", null);
        setField(term264195, term264195.getClass(), "regexps", null);
        setField(term264195, term264195.getClass(), "itsVariables", null);
        setField(term264195, term264195.getClass(), "itsConst", null);
        setField(term264195, term264195.getClass(), "itsVariableNames", null);
        setIntField(term264195, term264195.getClass(), "varStart", 0);
        setField(term264195, term264195.getClass(), "compilerData", null);
        setIntField(term264195, term264195.getClass(), "type", 0);
        setField(term264195, term264195.getClass(), "next", null);
        setField(term264195, term264195.getClass(), "first", null);
        setField(term264195, term264195.getClass(), "last", null);
        setField(term264195, term264195.getClass(), "propListHead", null);
        setIntField(term264195, term264195.getClass(), "sourcePosition", 0);
        setField(term264195, term264195.getClass(), "jsType", null);
        setField(term264195, term264195.getClass(), "parent", null);
        setField(term264194, term264194.getClass(), "next", term264195);
        setField(term264194, term264194.getClass(), "first", null);
        setField(term264194, term264194.getClass(), "last", null);
        setField(term264194, term264194.getClass(), "propListHead", null);
        setIntField(term264194, term264194.getClass(), "sourcePosition", 0);
        setField(term264194, term264194.getClass(), "jsType", null);
        setField(term264194, term264194.getClass(), "parent", null);
        setField(term264193, term264193.getClass(), "first", term264194);
        setField(term264193, term264193.getClass(), "last", null);
        setField(term264193, term264193.getClass(), "propListHead", null);
        setIntField(term264193, term264193.getClass(), "sourcePosition", 0);
        setField(term264193, term264193.getClass(), "jsType", null);
        setField(term264193, term264193.getClass(), "parent", null);
        term264131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term264134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term264137 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term264131, term264131.getClass(), "number", 0.0);
        setIntField(term264131, term264131.getClass(), "type", 16);
        setField(term264131, term264131.getClass(), "next", null);
        setDoubleField(term264134, term264134.getClass(), "number", 0.0);
        setIntField(term264134, term264134.getClass(), "type", 16);
        setIntField(term264137, term264137.getClass(), "encodedSourceStart", 0);
        setIntField(term264137, term264137.getClass(), "encodedSourceEnd", 0);
        setField(term264137, term264137.getClass(), "sourceName", null);
        setIntField(term264137, term264137.getClass(), "baseLineno", 0);
        setIntField(term264137, term264137.getClass(), "endLineno", 0);
        setField(term264137, term264137.getClass(), "functions", null);
        setField(term264137, term264137.getClass(), "regexps", null);
        setField(term264137, term264137.getClass(), "itsVariables", null);
        setField(term264137, term264137.getClass(), "itsConst", null);
        setField(term264137, term264137.getClass(), "itsVariableNames", null);
        setIntField(term264137, term264137.getClass(), "varStart", 0);
        setField(term264137, term264137.getClass(), "compilerData", null);
        setIntField(term264137, term264137.getClass(), "type", 0);
        setField(term264137, term264137.getClass(), "next", null);
        setField(term264137, term264137.getClass(), "first", null);
        setField(term264137, term264137.getClass(), "last", null);
        setField(term264137, term264137.getClass(), "propListHead", null);
        setIntField(term264137, term264137.getClass(), "sourcePosition", 0);
        setField(term264137, term264137.getClass(), "jsType", null);
        setField(term264137, term264137.getClass(), "parent", null);
        setField(term264134, term264134.getClass(), "next", term264137);
        setField(term264134, term264134.getClass(), "first", null);
        setField(term264134, term264134.getClass(), "last", null);
        setField(term264134, term264134.getClass(), "propListHead", null);
        setIntField(term264134, term264134.getClass(), "sourcePosition", 0);
        setField(term264134, term264134.getClass(), "jsType", null);
        setField(term264134, term264134.getClass(), "parent", null);
        setField(term264131, term264131.getClass(), "first", term264134);
        setField(term264131, term264131.getClass(), "last", null);
        setField(term264131, term264131.getClass(), "propListHead", null);
        setIntField(term264131, term264131.getClass(), "sourcePosition", 0);
        setField(term264131, term264131.getClass(), "jsType", null);
        setField(term264131, term264131.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term263532;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term263440, args);
        assertTrue(recursiveEquals(term263440, term264192));
        assertTrue(recursiveEquals(term263532, term264193));
        assertTrue(recursiveEquals(retValue, term264131));
    }

};


