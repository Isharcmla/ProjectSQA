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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29560;
     Object term29646;
     Object term30159;
     Object term30160;
     Object term30104;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29560 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term29646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term29732 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term29646, term29646.getClass(), "type", 37);
        setField(term29646, term29646.getClass(), "first", term29732);
        term30159 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term30159, term30159.getClass(), "currentTraversal", null);
        term30160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30160, term30160.getClass(), "functionName", null);
        setBooleanField(term30160, term30160.getClass(), "itsNeedsActivation", false);
        setIntField(term30160, term30160.getClass(), "itsFunctionType", 0);
        setBooleanField(term30160, term30160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30160, term30160.getClass(), "encodedSourceStart", 0);
        setIntField(term30160, term30160.getClass(), "encodedSourceEnd", 0);
        setField(term30160, term30160.getClass(), "sourceName", null);
        setIntField(term30160, term30160.getClass(), "baseLineno", 0);
        setIntField(term30160, term30160.getClass(), "endLineno", 0);
        setField(term30160, term30160.getClass(), "functions", null);
        setField(term30160, term30160.getClass(), "regexps", null);
        setField(term30160, term30160.getClass(), "itsVariables", null);
        setField(term30160, term30160.getClass(), "itsConst", null);
        setField(term30160, term30160.getClass(), "itsVariableNames", null);
        setIntField(term30160, term30160.getClass(), "varStart", 0);
        setField(term30160, term30160.getClass(), "compilerData", null);
        setIntField(term30160, term30160.getClass(), "type", 37);
        setField(term30160, term30160.getClass(), "next", null);
        setField(term30161, term30161.getClass(), "functionName", null);
        setBooleanField(term30161, term30161.getClass(), "itsNeedsActivation", false);
        setIntField(term30161, term30161.getClass(), "itsFunctionType", 0);
        setBooleanField(term30161, term30161.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30161, term30161.getClass(), "encodedSourceStart", 0);
        setIntField(term30161, term30161.getClass(), "encodedSourceEnd", 0);
        setField(term30161, term30161.getClass(), "sourceName", null);
        setIntField(term30161, term30161.getClass(), "baseLineno", 0);
        setIntField(term30161, term30161.getClass(), "endLineno", 0);
        setField(term30161, term30161.getClass(), "functions", null);
        setField(term30161, term30161.getClass(), "regexps", null);
        setField(term30161, term30161.getClass(), "itsVariables", null);
        setField(term30161, term30161.getClass(), "itsConst", null);
        setField(term30161, term30161.getClass(), "itsVariableNames", null);
        setIntField(term30161, term30161.getClass(), "varStart", 0);
        setField(term30161, term30161.getClass(), "compilerData", null);
        setIntField(term30161, term30161.getClass(), "type", 0);
        setField(term30161, term30161.getClass(), "next", null);
        setField(term30161, term30161.getClass(), "first", null);
        setField(term30161, term30161.getClass(), "last", null);
        setField(term30161, term30161.getClass(), "propListHead", null);
        setIntField(term30161, term30161.getClass(), "sourcePosition", 0);
        setField(term30161, term30161.getClass(), "jsType", null);
        setField(term30161, term30161.getClass(), "parent", null);
        setField(term30160, term30160.getClass(), "first", term30161);
        setField(term30160, term30160.getClass(), "last", null);
        setField(term30160, term30160.getClass(), "propListHead", null);
        setIntField(term30160, term30160.getClass(), "sourcePosition", 0);
        setField(term30160, term30160.getClass(), "jsType", null);
        setField(term30160, term30160.getClass(), "parent", null);
        term30104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30114 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30104, term30104.getClass(), "functionName", null);
        setBooleanField(term30104, term30104.getClass(), "itsNeedsActivation", false);
        setIntField(term30104, term30104.getClass(), "itsFunctionType", 0);
        setBooleanField(term30104, term30104.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30104, term30104.getClass(), "encodedSourceStart", 0);
        setIntField(term30104, term30104.getClass(), "encodedSourceEnd", 0);
        setField(term30104, term30104.getClass(), "sourceName", null);
        setIntField(term30104, term30104.getClass(), "baseLineno", 0);
        setIntField(term30104, term30104.getClass(), "endLineno", 0);
        setField(term30104, term30104.getClass(), "functions", null);
        setField(term30104, term30104.getClass(), "regexps", null);
        setField(term30104, term30104.getClass(), "itsVariables", null);
        setField(term30104, term30104.getClass(), "itsConst", null);
        setField(term30104, term30104.getClass(), "itsVariableNames", null);
        setIntField(term30104, term30104.getClass(), "varStart", 0);
        setField(term30104, term30104.getClass(), "compilerData", null);
        setIntField(term30104, term30104.getClass(), "type", 37);
        setField(term30104, term30104.getClass(), "next", null);
        setField(term30114, term30114.getClass(), "functionName", null);
        setBooleanField(term30114, term30114.getClass(), "itsNeedsActivation", false);
        setIntField(term30114, term30114.getClass(), "itsFunctionType", 0);
        setBooleanField(term30114, term30114.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30114, term30114.getClass(), "encodedSourceStart", 0);
        setIntField(term30114, term30114.getClass(), "encodedSourceEnd", 0);
        setField(term30114, term30114.getClass(), "sourceName", null);
        setIntField(term30114, term30114.getClass(), "baseLineno", 0);
        setIntField(term30114, term30114.getClass(), "endLineno", 0);
        setField(term30114, term30114.getClass(), "functions", null);
        setField(term30114, term30114.getClass(), "regexps", null);
        setField(term30114, term30114.getClass(), "itsVariables", null);
        setField(term30114, term30114.getClass(), "itsConst", null);
        setField(term30114, term30114.getClass(), "itsVariableNames", null);
        setIntField(term30114, term30114.getClass(), "varStart", 0);
        setField(term30114, term30114.getClass(), "compilerData", null);
        setIntField(term30114, term30114.getClass(), "type", 0);
        setField(term30114, term30114.getClass(), "next", null);
        setField(term30114, term30114.getClass(), "first", null);
        setField(term30114, term30114.getClass(), "last", null);
        setField(term30114, term30114.getClass(), "propListHead", null);
        setIntField(term30114, term30114.getClass(), "sourcePosition", 0);
        setField(term30114, term30114.getClass(), "jsType", null);
        setField(term30114, term30114.getClass(), "parent", null);
        setField(term30104, term30104.getClass(), "first", term30114);
        setField(term30104, term30104.getClass(), "last", null);
        setField(term30104, term30104.getClass(), "propListHead", null);
        setIntField(term30104, term30104.getClass(), "sourcePosition", 0);
        setField(term30104, term30104.getClass(), "jsType", null);
        setField(term30104, term30104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29646;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term29560, args);
        assertTrue(recursiveEquals(term29560, term30159));
        assertTrue(recursiveEquals(term29646, term30160));
        assertTrue(recursiveEquals(retValue, term30104));
    }

};


