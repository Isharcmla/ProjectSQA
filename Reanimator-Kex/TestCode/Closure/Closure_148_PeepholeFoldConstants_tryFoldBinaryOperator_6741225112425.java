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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676048;
     Object term676140;
     Object term676891;
     Object term676892;
     Object term676839;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term676140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term676226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term676296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term676226, term676226.getClass(), "next", term676296);
        setField(term676140, term676140.getClass(), "first", term676226);
        setIntField(term676140, term676140.getClass(), "type", 13);
        term676891 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term676891, term676891.getClass(), "currentTraversal", null);
        term676892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term676893 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term676894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term676892, term676892.getClass(), "number", 0.0);
        setIntField(term676892, term676892.getClass(), "type", 13);
        setField(term676892, term676892.getClass(), "next", null);
        setField(term676893, term676893.getClass(), "functionName", null);
        setBooleanField(term676893, term676893.getClass(), "itsNeedsActivation", false);
        setIntField(term676893, term676893.getClass(), "itsFunctionType", 0);
        setBooleanField(term676893, term676893.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term676893, term676893.getClass(), "encodedSourceStart", 0);
        setIntField(term676893, term676893.getClass(), "encodedSourceEnd", 0);
        setField(term676893, term676893.getClass(), "sourceName", null);
        setIntField(term676893, term676893.getClass(), "baseLineno", 0);
        setIntField(term676893, term676893.getClass(), "endLineno", 0);
        setField(term676893, term676893.getClass(), "functions", null);
        setField(term676893, term676893.getClass(), "regexps", null);
        setField(term676893, term676893.getClass(), "itsVariables", null);
        setField(term676893, term676893.getClass(), "itsConst", null);
        setField(term676893, term676893.getClass(), "itsVariableNames", null);
        setIntField(term676893, term676893.getClass(), "varStart", 0);
        setField(term676893, term676893.getClass(), "compilerData", null);
        setIntField(term676893, term676893.getClass(), "type", 0);
        setIntField(term676894, term676894.getClass(), "type", 0);
        setField(term676894, term676894.getClass(), "next", null);
        setField(term676894, term676894.getClass(), "first", null);
        setField(term676894, term676894.getClass(), "last", null);
        setField(term676894, term676894.getClass(), "propListHead", null);
        setIntField(term676894, term676894.getClass(), "sourcePosition", 0);
        setField(term676894, term676894.getClass(), "jsType", null);
        setField(term676894, term676894.getClass(), "parent", null);
        setField(term676893, term676893.getClass(), "next", term676894);
        setField(term676893, term676893.getClass(), "first", null);
        setField(term676893, term676893.getClass(), "last", null);
        setField(term676893, term676893.getClass(), "propListHead", null);
        setIntField(term676893, term676893.getClass(), "sourcePosition", 0);
        setField(term676893, term676893.getClass(), "jsType", null);
        setField(term676893, term676893.getClass(), "parent", null);
        setField(term676892, term676892.getClass(), "first", term676893);
        setField(term676892, term676892.getClass(), "last", null);
        setField(term676892, term676892.getClass(), "propListHead", null);
        setIntField(term676892, term676892.getClass(), "sourcePosition", 0);
        setField(term676892, term676892.getClass(), "jsType", null);
        setField(term676892, term676892.getClass(), "parent", null);
        term676839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term676842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term676852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term676839, term676839.getClass(), "number", 0.0);
        setIntField(term676839, term676839.getClass(), "type", 13);
        setField(term676839, term676839.getClass(), "next", null);
        setField(term676842, term676842.getClass(), "functionName", null);
        setBooleanField(term676842, term676842.getClass(), "itsNeedsActivation", false);
        setIntField(term676842, term676842.getClass(), "itsFunctionType", 0);
        setBooleanField(term676842, term676842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term676842, term676842.getClass(), "encodedSourceStart", 0);
        setIntField(term676842, term676842.getClass(), "encodedSourceEnd", 0);
        setField(term676842, term676842.getClass(), "sourceName", null);
        setIntField(term676842, term676842.getClass(), "baseLineno", 0);
        setIntField(term676842, term676842.getClass(), "endLineno", 0);
        setField(term676842, term676842.getClass(), "functions", null);
        setField(term676842, term676842.getClass(), "regexps", null);
        setField(term676842, term676842.getClass(), "itsVariables", null);
        setField(term676842, term676842.getClass(), "itsConst", null);
        setField(term676842, term676842.getClass(), "itsVariableNames", null);
        setIntField(term676842, term676842.getClass(), "varStart", 0);
        setField(term676842, term676842.getClass(), "compilerData", null);
        setIntField(term676842, term676842.getClass(), "type", 0);
        setIntField(term676852, term676852.getClass(), "type", 0);
        setField(term676852, term676852.getClass(), "next", null);
        setField(term676852, term676852.getClass(), "first", null);
        setField(term676852, term676852.getClass(), "last", null);
        setField(term676852, term676852.getClass(), "propListHead", null);
        setIntField(term676852, term676852.getClass(), "sourcePosition", 0);
        setField(term676852, term676852.getClass(), "jsType", null);
        setField(term676852, term676852.getClass(), "parent", null);
        setField(term676842, term676842.getClass(), "next", term676852);
        setField(term676842, term676842.getClass(), "first", null);
        setField(term676842, term676842.getClass(), "last", null);
        setField(term676842, term676842.getClass(), "propListHead", null);
        setIntField(term676842, term676842.getClass(), "sourcePosition", 0);
        setField(term676842, term676842.getClass(), "jsType", null);
        setField(term676842, term676842.getClass(), "parent", null);
        setField(term676839, term676839.getClass(), "first", term676842);
        setField(term676839, term676839.getClass(), "last", null);
        setField(term676839, term676839.getClass(), "propListHead", null);
        setIntField(term676839, term676839.getClass(), "sourcePosition", 0);
        setField(term676839, term676839.getClass(), "jsType", null);
        setField(term676839, term676839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term676140;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term676048, args);
        assertTrue(recursiveEquals(term676048, term676891));
        assertTrue(recursiveEquals(term676140, term676892));
        assertTrue(recursiveEquals(retValue, term676839));
    }

};


