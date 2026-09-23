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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651886;
     Object term651972;
     Object term652096;
     Object term652097;
     Object term652066;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term651886 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term651972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term652064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term651972, term651972.getClass(), "type", 32);
        setField(term651972, term651972.getClass(), "first", term652064);
        term652096 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term652096, term652096.getClass(), "currentTraversal", null);
        term652097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term652098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term652097, term652097.getClass(), "functionName", null);
        setBooleanField(term652097, term652097.getClass(), "itsNeedsActivation", false);
        setIntField(term652097, term652097.getClass(), "itsFunctionType", 0);
        setBooleanField(term652097, term652097.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term652097, term652097.getClass(), "encodedSourceStart", 0);
        setIntField(term652097, term652097.getClass(), "encodedSourceEnd", 0);
        setField(term652097, term652097.getClass(), "sourceName", null);
        setIntField(term652097, term652097.getClass(), "baseLineno", 0);
        setIntField(term652097, term652097.getClass(), "endLineno", 0);
        setField(term652097, term652097.getClass(), "functions", null);
        setField(term652097, term652097.getClass(), "regexps", null);
        setField(term652097, term652097.getClass(), "itsVariables", null);
        setField(term652097, term652097.getClass(), "itsConst", null);
        setField(term652097, term652097.getClass(), "itsVariableNames", null);
        setIntField(term652097, term652097.getClass(), "varStart", 0);
        setField(term652097, term652097.getClass(), "compilerData", null);
        setIntField(term652097, term652097.getClass(), "type", 32);
        setField(term652097, term652097.getClass(), "next", null);
        setField(term652098, term652098.getClass(), "str", null);
        setIntField(term652098, term652098.getClass(), "type", 0);
        setField(term652098, term652098.getClass(), "next", null);
        setField(term652098, term652098.getClass(), "first", null);
        setField(term652098, term652098.getClass(), "last", null);
        setField(term652098, term652098.getClass(), "propListHead", null);
        setIntField(term652098, term652098.getClass(), "sourcePosition", 0);
        setField(term652098, term652098.getClass(), "jsType", null);
        setField(term652098, term652098.getClass(), "parent", null);
        setField(term652097, term652097.getClass(), "first", term652098);
        setField(term652097, term652097.getClass(), "last", null);
        setField(term652097, term652097.getClass(), "propListHead", null);
        setIntField(term652097, term652097.getClass(), "sourcePosition", 0);
        setField(term652097, term652097.getClass(), "jsType", null);
        setField(term652097, term652097.getClass(), "parent", null);
        term652066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term652076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term652066, term652066.getClass(), "functionName", null);
        setBooleanField(term652066, term652066.getClass(), "itsNeedsActivation", false);
        setIntField(term652066, term652066.getClass(), "itsFunctionType", 0);
        setBooleanField(term652066, term652066.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term652066, term652066.getClass(), "encodedSourceStart", 0);
        setIntField(term652066, term652066.getClass(), "encodedSourceEnd", 0);
        setField(term652066, term652066.getClass(), "sourceName", null);
        setIntField(term652066, term652066.getClass(), "baseLineno", 0);
        setIntField(term652066, term652066.getClass(), "endLineno", 0);
        setField(term652066, term652066.getClass(), "functions", null);
        setField(term652066, term652066.getClass(), "regexps", null);
        setField(term652066, term652066.getClass(), "itsVariables", null);
        setField(term652066, term652066.getClass(), "itsConst", null);
        setField(term652066, term652066.getClass(), "itsVariableNames", null);
        setIntField(term652066, term652066.getClass(), "varStart", 0);
        setField(term652066, term652066.getClass(), "compilerData", null);
        setIntField(term652066, term652066.getClass(), "type", 32);
        setField(term652066, term652066.getClass(), "next", null);
        setField(term652076, term652076.getClass(), "str", null);
        setIntField(term652076, term652076.getClass(), "type", 0);
        setField(term652076, term652076.getClass(), "next", null);
        setField(term652076, term652076.getClass(), "first", null);
        setField(term652076, term652076.getClass(), "last", null);
        setField(term652076, term652076.getClass(), "propListHead", null);
        setIntField(term652076, term652076.getClass(), "sourcePosition", 0);
        setField(term652076, term652076.getClass(), "jsType", null);
        setField(term652076, term652076.getClass(), "parent", null);
        setField(term652066, term652066.getClass(), "first", term652076);
        setField(term652066, term652066.getClass(), "last", null);
        setField(term652066, term652066.getClass(), "propListHead", null);
        setIntField(term652066, term652066.getClass(), "sourcePosition", 0);
        setField(term652066, term652066.getClass(), "jsType", null);
        setField(term652066, term652066.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term651972;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term651886, args);
        assertTrue(recursiveEquals(term651886, term652096));
        assertTrue(recursiveEquals(term651972, term652097));
        assertTrue(recursiveEquals(retValue, term652066));
    }

};


