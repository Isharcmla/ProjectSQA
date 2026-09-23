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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685499;
     Object term685591;
     Object term686614;
     Object term686615;
     Object term686544;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685499 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term685591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term685769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term685677, term685677.getClass(), "next", term685769);
        setIntField(term685677, term685677.getClass(), "type", 42);
        setField(term685591, term685591.getClass(), "first", term685677);
        setIntField(term685591, term685591.getClass(), "type", 14);
        term686614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term686614, term686614.getClass(), "currentTraversal", null);
        term686615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term686617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term686615, term686615.getClass(), "number", 0.0);
        setIntField(term686615, term686615.getClass(), "type", 14);
        setField(term686615, term686615.getClass(), "next", null);
        setField(term686616, term686616.getClass(), "functionName", null);
        setBooleanField(term686616, term686616.getClass(), "itsNeedsActivation", false);
        setIntField(term686616, term686616.getClass(), "itsFunctionType", 0);
        setBooleanField(term686616, term686616.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686616, term686616.getClass(), "encodedSourceStart", 0);
        setIntField(term686616, term686616.getClass(), "encodedSourceEnd", 0);
        setField(term686616, term686616.getClass(), "sourceName", null);
        setIntField(term686616, term686616.getClass(), "baseLineno", 0);
        setIntField(term686616, term686616.getClass(), "endLineno", 0);
        setField(term686616, term686616.getClass(), "functions", null);
        setField(term686616, term686616.getClass(), "regexps", null);
        setField(term686616, term686616.getClass(), "itsVariables", null);
        setField(term686616, term686616.getClass(), "itsConst", null);
        setField(term686616, term686616.getClass(), "itsVariableNames", null);
        setIntField(term686616, term686616.getClass(), "varStart", 0);
        setField(term686616, term686616.getClass(), "compilerData", null);
        setIntField(term686616, term686616.getClass(), "type", 42);
        setDoubleField(term686617, term686617.getClass(), "number", 0.0);
        setIntField(term686617, term686617.getClass(), "type", 0);
        setField(term686617, term686617.getClass(), "next", null);
        setField(term686617, term686617.getClass(), "first", null);
        setField(term686617, term686617.getClass(), "last", null);
        setField(term686617, term686617.getClass(), "propListHead", null);
        setIntField(term686617, term686617.getClass(), "sourcePosition", 0);
        setField(term686617, term686617.getClass(), "jsType", null);
        setField(term686617, term686617.getClass(), "parent", null);
        setField(term686616, term686616.getClass(), "next", term686617);
        setField(term686616, term686616.getClass(), "first", null);
        setField(term686616, term686616.getClass(), "last", null);
        setField(term686616, term686616.getClass(), "propListHead", null);
        setIntField(term686616, term686616.getClass(), "sourcePosition", 0);
        setField(term686616, term686616.getClass(), "jsType", null);
        setField(term686616, term686616.getClass(), "parent", null);
        setField(term686615, term686615.getClass(), "first", term686616);
        setField(term686615, term686615.getClass(), "last", null);
        setField(term686615, term686615.getClass(), "propListHead", null);
        setIntField(term686615, term686615.getClass(), "sourcePosition", 0);
        setField(term686615, term686615.getClass(), "jsType", null);
        setField(term686615, term686615.getClass(), "parent", null);
        term686544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term686557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term686544, term686544.getClass(), "number", 0.0);
        setIntField(term686544, term686544.getClass(), "type", 14);
        setField(term686544, term686544.getClass(), "next", null);
        setField(term686547, term686547.getClass(), "functionName", null);
        setBooleanField(term686547, term686547.getClass(), "itsNeedsActivation", false);
        setIntField(term686547, term686547.getClass(), "itsFunctionType", 0);
        setBooleanField(term686547, term686547.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686547, term686547.getClass(), "encodedSourceStart", 0);
        setIntField(term686547, term686547.getClass(), "encodedSourceEnd", 0);
        setField(term686547, term686547.getClass(), "sourceName", null);
        setIntField(term686547, term686547.getClass(), "baseLineno", 0);
        setIntField(term686547, term686547.getClass(), "endLineno", 0);
        setField(term686547, term686547.getClass(), "functions", null);
        setField(term686547, term686547.getClass(), "regexps", null);
        setField(term686547, term686547.getClass(), "itsVariables", null);
        setField(term686547, term686547.getClass(), "itsConst", null);
        setField(term686547, term686547.getClass(), "itsVariableNames", null);
        setIntField(term686547, term686547.getClass(), "varStart", 0);
        setField(term686547, term686547.getClass(), "compilerData", null);
        setIntField(term686547, term686547.getClass(), "type", 42);
        setDoubleField(term686557, term686557.getClass(), "number", 0.0);
        setIntField(term686557, term686557.getClass(), "type", 0);
        setField(term686557, term686557.getClass(), "next", null);
        setField(term686557, term686557.getClass(), "first", null);
        setField(term686557, term686557.getClass(), "last", null);
        setField(term686557, term686557.getClass(), "propListHead", null);
        setIntField(term686557, term686557.getClass(), "sourcePosition", 0);
        setField(term686557, term686557.getClass(), "jsType", null);
        setField(term686557, term686557.getClass(), "parent", null);
        setField(term686547, term686547.getClass(), "next", term686557);
        setField(term686547, term686547.getClass(), "first", null);
        setField(term686547, term686547.getClass(), "last", null);
        setField(term686547, term686547.getClass(), "propListHead", null);
        setIntField(term686547, term686547.getClass(), "sourcePosition", 0);
        setField(term686547, term686547.getClass(), "jsType", null);
        setField(term686547, term686547.getClass(), "parent", null);
        setField(term686544, term686544.getClass(), "first", term686547);
        setField(term686544, term686544.getClass(), "last", null);
        setField(term686544, term686544.getClass(), "propListHead", null);
        setIntField(term686544, term686544.getClass(), "sourcePosition", 0);
        setField(term686544, term686544.getClass(), "jsType", null);
        setField(term686544, term686544.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term685591;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term685499, args);
        assertTrue(recursiveEquals(term685499, term686614));
        assertTrue(recursiveEquals(term685591, term686615));
        assertTrue(recursiveEquals(retValue, term686544));
    }

};


