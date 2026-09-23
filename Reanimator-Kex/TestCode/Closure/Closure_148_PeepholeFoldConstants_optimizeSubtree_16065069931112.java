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

public class PeepholeFoldConstants_optimizeSubtree_16065069931112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261107;
     Object term261193;
     Object term262143;
     Object term262144;
     Object term262090;

    public PeepholeFoldConstants_optimizeSubtree_16065069931112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term261193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term261193, term261193.getClass(), "type", 37);
        term262143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term262143, term262143.getClass(), "currentTraversal", null);
        term262144 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term262144, term262144.getClass(), "functionName", null);
        setBooleanField(term262144, term262144.getClass(), "itsNeedsActivation", false);
        setIntField(term262144, term262144.getClass(), "itsFunctionType", 0);
        setBooleanField(term262144, term262144.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term262144, term262144.getClass(), "encodedSourceStart", 0);
        setIntField(term262144, term262144.getClass(), "encodedSourceEnd", 0);
        setField(term262144, term262144.getClass(), "sourceName", null);
        setIntField(term262144, term262144.getClass(), "baseLineno", 0);
        setIntField(term262144, term262144.getClass(), "endLineno", 0);
        setField(term262144, term262144.getClass(), "functions", null);
        setField(term262144, term262144.getClass(), "regexps", null);
        setField(term262144, term262144.getClass(), "itsVariables", null);
        setField(term262144, term262144.getClass(), "itsConst", null);
        setField(term262144, term262144.getClass(), "itsVariableNames", null);
        setIntField(term262144, term262144.getClass(), "varStart", 0);
        setField(term262144, term262144.getClass(), "compilerData", null);
        setIntField(term262144, term262144.getClass(), "type", 37);
        setField(term262144, term262144.getClass(), "next", null);
        setField(term262144, term262144.getClass(), "first", null);
        setField(term262144, term262144.getClass(), "last", null);
        setField(term262144, term262144.getClass(), "propListHead", null);
        setIntField(term262144, term262144.getClass(), "sourcePosition", 0);
        setField(term262144, term262144.getClass(), "jsType", null);
        setField(term262144, term262144.getClass(), "parent", null);
        term262090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term262090, term262090.getClass(), "functionName", null);
        setBooleanField(term262090, term262090.getClass(), "itsNeedsActivation", false);
        setIntField(term262090, term262090.getClass(), "itsFunctionType", 0);
        setBooleanField(term262090, term262090.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term262090, term262090.getClass(), "encodedSourceStart", 0);
        setIntField(term262090, term262090.getClass(), "encodedSourceEnd", 0);
        setField(term262090, term262090.getClass(), "sourceName", null);
        setIntField(term262090, term262090.getClass(), "baseLineno", 0);
        setIntField(term262090, term262090.getClass(), "endLineno", 0);
        setField(term262090, term262090.getClass(), "functions", null);
        setField(term262090, term262090.getClass(), "regexps", null);
        setField(term262090, term262090.getClass(), "itsVariables", null);
        setField(term262090, term262090.getClass(), "itsConst", null);
        setField(term262090, term262090.getClass(), "itsVariableNames", null);
        setIntField(term262090, term262090.getClass(), "varStart", 0);
        setField(term262090, term262090.getClass(), "compilerData", null);
        setIntField(term262090, term262090.getClass(), "type", 37);
        setField(term262090, term262090.getClass(), "next", null);
        setField(term262090, term262090.getClass(), "first", null);
        setField(term262090, term262090.getClass(), "last", null);
        setField(term262090, term262090.getClass(), "propListHead", null);
        setIntField(term262090, term262090.getClass(), "sourcePosition", 0);
        setField(term262090, term262090.getClass(), "jsType", null);
        setField(term262090, term262090.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term261193;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term261107, args);
        assertTrue(recursiveEquals(term261107, term262143));
        assertTrue(recursiveEquals(term261193, term262144));
        assertTrue(recursiveEquals(retValue, term262090));
    }

};


