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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306244;
     Object term306336;
     Object term306993;
     Object term306994;
     Object term306925;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term306336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306518 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term306518, term306518.getClass(), "type", 106);
        setField(term306428, term306428.getClass(), "next", term306518);
        setIntField(term306428, term306428.getClass(), "type", 42);
        setField(term306336, term306336.getClass(), "first", term306428);
        setIntField(term306336, term306336.getClass(), "type", 14);
        term306993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term306993, term306993.getClass(), "currentTraversal", null);
        term306994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306996 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term306994, term306994.getClass(), "number", 0.0);
        setIntField(term306994, term306994.getClass(), "type", 14);
        setField(term306994, term306994.getClass(), "next", null);
        setDoubleField(term306995, term306995.getClass(), "number", 0.0);
        setIntField(term306995, term306995.getClass(), "type", 42);
        setIntField(term306996, term306996.getClass(), "encodedSourceStart", 0);
        setIntField(term306996, term306996.getClass(), "encodedSourceEnd", 0);
        setField(term306996, term306996.getClass(), "sourceName", null);
        setIntField(term306996, term306996.getClass(), "baseLineno", 0);
        setIntField(term306996, term306996.getClass(), "endLineno", 0);
        setField(term306996, term306996.getClass(), "functions", null);
        setField(term306996, term306996.getClass(), "regexps", null);
        setField(term306996, term306996.getClass(), "itsVariables", null);
        setField(term306996, term306996.getClass(), "itsConst", null);
        setField(term306996, term306996.getClass(), "itsVariableNames", null);
        setIntField(term306996, term306996.getClass(), "varStart", 0);
        setField(term306996, term306996.getClass(), "compilerData", null);
        setIntField(term306996, term306996.getClass(), "type", 106);
        setField(term306996, term306996.getClass(), "next", null);
        setField(term306996, term306996.getClass(), "first", null);
        setField(term306996, term306996.getClass(), "last", null);
        setField(term306996, term306996.getClass(), "propListHead", null);
        setIntField(term306996, term306996.getClass(), "sourcePosition", 0);
        setField(term306996, term306996.getClass(), "jsType", null);
        setField(term306996, term306996.getClass(), "parent", null);
        setField(term306995, term306995.getClass(), "next", term306996);
        setField(term306995, term306995.getClass(), "first", null);
        setField(term306995, term306995.getClass(), "last", null);
        setField(term306995, term306995.getClass(), "propListHead", null);
        setIntField(term306995, term306995.getClass(), "sourcePosition", 0);
        setField(term306995, term306995.getClass(), "jsType", null);
        setField(term306995, term306995.getClass(), "parent", null);
        setField(term306994, term306994.getClass(), "first", term306995);
        setField(term306994, term306994.getClass(), "last", null);
        setField(term306994, term306994.getClass(), "propListHead", null);
        setIntField(term306994, term306994.getClass(), "sourcePosition", 0);
        setField(term306994, term306994.getClass(), "jsType", null);
        setField(term306994, term306994.getClass(), "parent", null);
        term306925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306931 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term306925, term306925.getClass(), "number", 0.0);
        setIntField(term306925, term306925.getClass(), "type", 14);
        setField(term306925, term306925.getClass(), "next", null);
        setDoubleField(term306928, term306928.getClass(), "number", 0.0);
        setIntField(term306928, term306928.getClass(), "type", 42);
        setIntField(term306931, term306931.getClass(), "encodedSourceStart", 0);
        setIntField(term306931, term306931.getClass(), "encodedSourceEnd", 0);
        setField(term306931, term306931.getClass(), "sourceName", null);
        setIntField(term306931, term306931.getClass(), "baseLineno", 0);
        setIntField(term306931, term306931.getClass(), "endLineno", 0);
        setField(term306931, term306931.getClass(), "functions", null);
        setField(term306931, term306931.getClass(), "regexps", null);
        setField(term306931, term306931.getClass(), "itsVariables", null);
        setField(term306931, term306931.getClass(), "itsConst", null);
        setField(term306931, term306931.getClass(), "itsVariableNames", null);
        setIntField(term306931, term306931.getClass(), "varStart", 0);
        setField(term306931, term306931.getClass(), "compilerData", null);
        setIntField(term306931, term306931.getClass(), "type", 106);
        setField(term306931, term306931.getClass(), "next", null);
        setField(term306931, term306931.getClass(), "first", null);
        setField(term306931, term306931.getClass(), "last", null);
        setField(term306931, term306931.getClass(), "propListHead", null);
        setIntField(term306931, term306931.getClass(), "sourcePosition", 0);
        setField(term306931, term306931.getClass(), "jsType", null);
        setField(term306931, term306931.getClass(), "parent", null);
        setField(term306928, term306928.getClass(), "next", term306931);
        setField(term306928, term306928.getClass(), "first", null);
        setField(term306928, term306928.getClass(), "last", null);
        setField(term306928, term306928.getClass(), "propListHead", null);
        setIntField(term306928, term306928.getClass(), "sourcePosition", 0);
        setField(term306928, term306928.getClass(), "jsType", null);
        setField(term306928, term306928.getClass(), "parent", null);
        setField(term306925, term306925.getClass(), "first", term306928);
        setField(term306925, term306925.getClass(), "last", null);
        setField(term306925, term306925.getClass(), "propListHead", null);
        setIntField(term306925, term306925.getClass(), "sourcePosition", 0);
        setField(term306925, term306925.getClass(), "jsType", null);
        setField(term306925, term306925.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term306336;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term306244, args);
        assertTrue(recursiveEquals(term306244, term306993));
        assertTrue(recursiveEquals(term306336, term306994));
        assertTrue(recursiveEquals(retValue, term306925));
    }

};


