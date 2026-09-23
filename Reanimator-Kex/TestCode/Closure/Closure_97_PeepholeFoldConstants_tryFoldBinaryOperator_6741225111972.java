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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746880;
     Object term746972;
     Object term747218;
     Object term747219;
     Object term747165;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term746972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term747064, term747064.getClass(), "next", term747150);
        setIntField(term747064, term747064.getClass(), "type", 39);
        setField(term746972, term746972.getClass(), "first", term747064);
        setIntField(term746972, term746972.getClass(), "type", 18);
        term747218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term747218, term747218.getClass(), "currentTraversal", null);
        term747219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747221 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term747219, term747219.getClass(), "str", null);
        setIntField(term747219, term747219.getClass(), "type", 18);
        setField(term747219, term747219.getClass(), "next", null);
        setField(term747220, term747220.getClass(), "str", null);
        setIntField(term747220, term747220.getClass(), "type", 39);
        setField(term747221, term747221.getClass(), "functionName", null);
        setBooleanField(term747221, term747221.getClass(), "itsNeedsActivation", false);
        setIntField(term747221, term747221.getClass(), "itsFunctionType", 0);
        setBooleanField(term747221, term747221.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term747221, term747221.getClass(), "encodedSourceStart", 0);
        setIntField(term747221, term747221.getClass(), "encodedSourceEnd", 0);
        setField(term747221, term747221.getClass(), "sourceName", null);
        setIntField(term747221, term747221.getClass(), "baseLineno", 0);
        setIntField(term747221, term747221.getClass(), "endLineno", 0);
        setField(term747221, term747221.getClass(), "functions", null);
        setField(term747221, term747221.getClass(), "regexps", null);
        setField(term747221, term747221.getClass(), "itsVariables", null);
        setField(term747221, term747221.getClass(), "itsConst", null);
        setField(term747221, term747221.getClass(), "itsVariableNames", null);
        setIntField(term747221, term747221.getClass(), "varStart", 0);
        setField(term747221, term747221.getClass(), "compilerData", null);
        setIntField(term747221, term747221.getClass(), "type", 0);
        setField(term747221, term747221.getClass(), "next", null);
        setField(term747221, term747221.getClass(), "first", null);
        setField(term747221, term747221.getClass(), "last", null);
        setField(term747221, term747221.getClass(), "propListHead", null);
        setIntField(term747221, term747221.getClass(), "sourcePosition", 0);
        setField(term747221, term747221.getClass(), "jsType", null);
        setField(term747221, term747221.getClass(), "parent", null);
        setField(term747220, term747220.getClass(), "next", term747221);
        setField(term747220, term747220.getClass(), "first", null);
        setField(term747220, term747220.getClass(), "last", null);
        setField(term747220, term747220.getClass(), "propListHead", null);
        setIntField(term747220, term747220.getClass(), "sourcePosition", 0);
        setField(term747220, term747220.getClass(), "jsType", null);
        setField(term747220, term747220.getClass(), "parent", null);
        setField(term747219, term747219.getClass(), "first", term747220);
        setField(term747219, term747219.getClass(), "last", null);
        setField(term747219, term747219.getClass(), "propListHead", null);
        setIntField(term747219, term747219.getClass(), "sourcePosition", 0);
        setField(term747219, term747219.getClass(), "jsType", null);
        setField(term747219, term747219.getClass(), "parent", null);
        term747165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747169 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term747165, term747165.getClass(), "str", null);
        setIntField(term747165, term747165.getClass(), "type", 18);
        setField(term747165, term747165.getClass(), "next", null);
        setField(term747167, term747167.getClass(), "str", null);
        setIntField(term747167, term747167.getClass(), "type", 39);
        setField(term747169, term747169.getClass(), "functionName", null);
        setBooleanField(term747169, term747169.getClass(), "itsNeedsActivation", false);
        setIntField(term747169, term747169.getClass(), "itsFunctionType", 0);
        setBooleanField(term747169, term747169.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term747169, term747169.getClass(), "encodedSourceStart", 0);
        setIntField(term747169, term747169.getClass(), "encodedSourceEnd", 0);
        setField(term747169, term747169.getClass(), "sourceName", null);
        setIntField(term747169, term747169.getClass(), "baseLineno", 0);
        setIntField(term747169, term747169.getClass(), "endLineno", 0);
        setField(term747169, term747169.getClass(), "functions", null);
        setField(term747169, term747169.getClass(), "regexps", null);
        setField(term747169, term747169.getClass(), "itsVariables", null);
        setField(term747169, term747169.getClass(), "itsConst", null);
        setField(term747169, term747169.getClass(), "itsVariableNames", null);
        setIntField(term747169, term747169.getClass(), "varStart", 0);
        setField(term747169, term747169.getClass(), "compilerData", null);
        setIntField(term747169, term747169.getClass(), "type", 0);
        setField(term747169, term747169.getClass(), "next", null);
        setField(term747169, term747169.getClass(), "first", null);
        setField(term747169, term747169.getClass(), "last", null);
        setField(term747169, term747169.getClass(), "propListHead", null);
        setIntField(term747169, term747169.getClass(), "sourcePosition", 0);
        setField(term747169, term747169.getClass(), "jsType", null);
        setField(term747169, term747169.getClass(), "parent", null);
        setField(term747167, term747167.getClass(), "next", term747169);
        setField(term747167, term747167.getClass(), "first", null);
        setField(term747167, term747167.getClass(), "last", null);
        setField(term747167, term747167.getClass(), "propListHead", null);
        setIntField(term747167, term747167.getClass(), "sourcePosition", 0);
        setField(term747167, term747167.getClass(), "jsType", null);
        setField(term747167, term747167.getClass(), "parent", null);
        setField(term747165, term747165.getClass(), "first", term747167);
        setField(term747165, term747165.getClass(), "last", null);
        setField(term747165, term747165.getClass(), "propListHead", null);
        setIntField(term747165, term747165.getClass(), "sourcePosition", 0);
        setField(term747165, term747165.getClass(), "jsType", null);
        setField(term747165, term747165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term746972;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term746880, args);
        assertTrue(recursiveEquals(term746880, term747218));
        assertTrue(recursiveEquals(term746972, term747219));
        assertTrue(recursiveEquals(retValue, term747165));
    }

};


