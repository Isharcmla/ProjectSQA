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

public class PeepholeFoldConstants_optimizeSubtree_16065069931322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319337;
     Object term319423;
     Object term320088;
     Object term320089;
     Object term320019;

    public PeepholeFoldConstants_optimizeSubtree_16065069931322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319337 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term319423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term319515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term319423, term319423.getClass(), "type", 33);
        setField(term319423, term319423.getClass(), "first", term319423);
        setField(term319423, term319423.getClass(), "next", term319515);
        term320088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term320088, term320088.getClass(), "currentTraversal", null);
        term320089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term320090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term320089, term320089.getClass(), "functionName", null);
        setBooleanField(term320089, term320089.getClass(), "itsNeedsActivation", false);
        setIntField(term320089, term320089.getClass(), "itsFunctionType", 0);
        setBooleanField(term320089, term320089.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term320089, term320089.getClass(), "encodedSourceStart", 0);
        setIntField(term320089, term320089.getClass(), "encodedSourceEnd", 0);
        setField(term320089, term320089.getClass(), "sourceName", null);
        setIntField(term320089, term320089.getClass(), "baseLineno", 0);
        setIntField(term320089, term320089.getClass(), "endLineno", 0);
        setField(term320089, term320089.getClass(), "functions", null);
        setField(term320089, term320089.getClass(), "regexps", null);
        setField(term320089, term320089.getClass(), "itsVariables", null);
        setField(term320089, term320089.getClass(), "itsConst", null);
        setField(term320089, term320089.getClass(), "itsVariableNames", null);
        setIntField(term320089, term320089.getClass(), "varStart", 0);
        setField(term320089, term320089.getClass(), "compilerData", null);
        setIntField(term320089, term320089.getClass(), "type", 33);
        setField(term320090, term320090.getClass(), "str", null);
        setIntField(term320090, term320090.getClass(), "type", 0);
        setField(term320090, term320090.getClass(), "next", null);
        setField(term320090, term320090.getClass(), "first", null);
        setField(term320090, term320090.getClass(), "last", null);
        setField(term320090, term320090.getClass(), "propListHead", null);
        setIntField(term320090, term320090.getClass(), "sourcePosition", 0);
        setField(term320090, term320090.getClass(), "jsType", null);
        setField(term320090, term320090.getClass(), "parent", null);
        setField(term320089, term320089.getClass(), "next", term320090);
        setField(term320089, term320089.getClass(), "first", term320089);
        setField(term320089, term320089.getClass(), "last", null);
        setField(term320089, term320089.getClass(), "propListHead", null);
        setIntField(term320089, term320089.getClass(), "sourcePosition", 0);
        setField(term320089, term320089.getClass(), "jsType", null);
        setField(term320089, term320089.getClass(), "parent", null);
        term320019 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term320029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term320019, term320019.getClass(), "functionName", null);
        setBooleanField(term320019, term320019.getClass(), "itsNeedsActivation", false);
        setIntField(term320019, term320019.getClass(), "itsFunctionType", 0);
        setBooleanField(term320019, term320019.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term320019, term320019.getClass(), "encodedSourceStart", 0);
        setIntField(term320019, term320019.getClass(), "encodedSourceEnd", 0);
        setField(term320019, term320019.getClass(), "sourceName", null);
        setIntField(term320019, term320019.getClass(), "baseLineno", 0);
        setIntField(term320019, term320019.getClass(), "endLineno", 0);
        setField(term320019, term320019.getClass(), "functions", null);
        setField(term320019, term320019.getClass(), "regexps", null);
        setField(term320019, term320019.getClass(), "itsVariables", null);
        setField(term320019, term320019.getClass(), "itsConst", null);
        setField(term320019, term320019.getClass(), "itsVariableNames", null);
        setIntField(term320019, term320019.getClass(), "varStart", 0);
        setField(term320019, term320019.getClass(), "compilerData", null);
        setIntField(term320019, term320019.getClass(), "type", 33);
        setField(term320029, term320029.getClass(), "str", null);
        setIntField(term320029, term320029.getClass(), "type", 0);
        setField(term320029, term320029.getClass(), "next", null);
        setField(term320029, term320029.getClass(), "first", null);
        setField(term320029, term320029.getClass(), "last", null);
        setField(term320029, term320029.getClass(), "propListHead", null);
        setIntField(term320029, term320029.getClass(), "sourcePosition", 0);
        setField(term320029, term320029.getClass(), "jsType", null);
        setField(term320029, term320029.getClass(), "parent", null);
        setField(term320019, term320019.getClass(), "next", term320029);
        setField(term320019, term320019.getClass(), "first", term320019);
        setField(term320019, term320019.getClass(), "last", null);
        setField(term320019, term320019.getClass(), "propListHead", null);
        setIntField(term320019, term320019.getClass(), "sourcePosition", 0);
        setField(term320019, term320019.getClass(), "jsType", null);
        setField(term320019, term320019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term319423;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term319337, args);
        assertTrue(recursiveEquals(term319337, term320088));
        assertTrue(recursiveEquals(term319423, term320089));
        assertTrue(recursiveEquals(retValue, term320019));
    }

};


