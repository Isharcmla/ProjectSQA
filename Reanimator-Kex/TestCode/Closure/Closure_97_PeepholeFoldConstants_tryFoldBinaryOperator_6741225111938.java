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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736751;
     Object term736843;
     Object term737519;
     Object term737520;
     Object term737450;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term736843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term736929 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737015 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term736929, term736929.getClass(), "next", term737015);
        setIntField(term736929, term736929.getClass(), "type", 39);
        setField(term736843, term736843.getClass(), "first", term736929);
        setIntField(term736843, term736843.getClass(), "type", 18);
        term737519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term737519, term737519.getClass(), "currentTraversal", null);
        term737520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term737521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term737520, term737520.getClass(), "str", null);
        setIntField(term737520, term737520.getClass(), "type", 18);
        setField(term737520, term737520.getClass(), "next", null);
        setField(term737521, term737521.getClass(), "functionName", null);
        setBooleanField(term737521, term737521.getClass(), "itsNeedsActivation", false);
        setIntField(term737521, term737521.getClass(), "itsFunctionType", 0);
        setBooleanField(term737521, term737521.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737521, term737521.getClass(), "encodedSourceStart", 0);
        setIntField(term737521, term737521.getClass(), "encodedSourceEnd", 0);
        setField(term737521, term737521.getClass(), "sourceName", null);
        setIntField(term737521, term737521.getClass(), "baseLineno", 0);
        setIntField(term737521, term737521.getClass(), "endLineno", 0);
        setField(term737521, term737521.getClass(), "functions", null);
        setField(term737521, term737521.getClass(), "regexps", null);
        setField(term737521, term737521.getClass(), "itsVariables", null);
        setField(term737521, term737521.getClass(), "itsConst", null);
        setField(term737521, term737521.getClass(), "itsVariableNames", null);
        setIntField(term737521, term737521.getClass(), "varStart", 0);
        setField(term737521, term737521.getClass(), "compilerData", null);
        setIntField(term737521, term737521.getClass(), "type", 39);
        setField(term737522, term737522.getClass(), "functionName", null);
        setBooleanField(term737522, term737522.getClass(), "itsNeedsActivation", false);
        setIntField(term737522, term737522.getClass(), "itsFunctionType", 0);
        setBooleanField(term737522, term737522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737522, term737522.getClass(), "encodedSourceStart", 0);
        setIntField(term737522, term737522.getClass(), "encodedSourceEnd", 0);
        setField(term737522, term737522.getClass(), "sourceName", null);
        setIntField(term737522, term737522.getClass(), "baseLineno", 0);
        setIntField(term737522, term737522.getClass(), "endLineno", 0);
        setField(term737522, term737522.getClass(), "functions", null);
        setField(term737522, term737522.getClass(), "regexps", null);
        setField(term737522, term737522.getClass(), "itsVariables", null);
        setField(term737522, term737522.getClass(), "itsConst", null);
        setField(term737522, term737522.getClass(), "itsVariableNames", null);
        setIntField(term737522, term737522.getClass(), "varStart", 0);
        setField(term737522, term737522.getClass(), "compilerData", null);
        setIntField(term737522, term737522.getClass(), "type", 0);
        setField(term737522, term737522.getClass(), "next", null);
        setField(term737522, term737522.getClass(), "first", null);
        setField(term737522, term737522.getClass(), "last", null);
        setField(term737522, term737522.getClass(), "propListHead", null);
        setIntField(term737522, term737522.getClass(), "sourcePosition", 0);
        setField(term737522, term737522.getClass(), "jsType", null);
        setField(term737522, term737522.getClass(), "parent", null);
        setField(term737521, term737521.getClass(), "next", term737522);
        setField(term737521, term737521.getClass(), "first", null);
        setField(term737521, term737521.getClass(), "last", null);
        setField(term737521, term737521.getClass(), "propListHead", null);
        setIntField(term737521, term737521.getClass(), "sourcePosition", 0);
        setField(term737521, term737521.getClass(), "jsType", null);
        setField(term737521, term737521.getClass(), "parent", null);
        setField(term737520, term737520.getClass(), "first", term737521);
        setField(term737520, term737520.getClass(), "last", null);
        setField(term737520, term737520.getClass(), "propListHead", null);
        setIntField(term737520, term737520.getClass(), "sourcePosition", 0);
        setField(term737520, term737520.getClass(), "jsType", null);
        setField(term737520, term737520.getClass(), "parent", null);
        term737450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term737452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737462 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term737450, term737450.getClass(), "str", null);
        setIntField(term737450, term737450.getClass(), "type", 18);
        setField(term737450, term737450.getClass(), "next", null);
        setField(term737452, term737452.getClass(), "functionName", null);
        setBooleanField(term737452, term737452.getClass(), "itsNeedsActivation", false);
        setIntField(term737452, term737452.getClass(), "itsFunctionType", 0);
        setBooleanField(term737452, term737452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737452, term737452.getClass(), "encodedSourceStart", 0);
        setIntField(term737452, term737452.getClass(), "encodedSourceEnd", 0);
        setField(term737452, term737452.getClass(), "sourceName", null);
        setIntField(term737452, term737452.getClass(), "baseLineno", 0);
        setIntField(term737452, term737452.getClass(), "endLineno", 0);
        setField(term737452, term737452.getClass(), "functions", null);
        setField(term737452, term737452.getClass(), "regexps", null);
        setField(term737452, term737452.getClass(), "itsVariables", null);
        setField(term737452, term737452.getClass(), "itsConst", null);
        setField(term737452, term737452.getClass(), "itsVariableNames", null);
        setIntField(term737452, term737452.getClass(), "varStart", 0);
        setField(term737452, term737452.getClass(), "compilerData", null);
        setIntField(term737452, term737452.getClass(), "type", 39);
        setField(term737462, term737462.getClass(), "functionName", null);
        setBooleanField(term737462, term737462.getClass(), "itsNeedsActivation", false);
        setIntField(term737462, term737462.getClass(), "itsFunctionType", 0);
        setBooleanField(term737462, term737462.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737462, term737462.getClass(), "encodedSourceStart", 0);
        setIntField(term737462, term737462.getClass(), "encodedSourceEnd", 0);
        setField(term737462, term737462.getClass(), "sourceName", null);
        setIntField(term737462, term737462.getClass(), "baseLineno", 0);
        setIntField(term737462, term737462.getClass(), "endLineno", 0);
        setField(term737462, term737462.getClass(), "functions", null);
        setField(term737462, term737462.getClass(), "regexps", null);
        setField(term737462, term737462.getClass(), "itsVariables", null);
        setField(term737462, term737462.getClass(), "itsConst", null);
        setField(term737462, term737462.getClass(), "itsVariableNames", null);
        setIntField(term737462, term737462.getClass(), "varStart", 0);
        setField(term737462, term737462.getClass(), "compilerData", null);
        setIntField(term737462, term737462.getClass(), "type", 0);
        setField(term737462, term737462.getClass(), "next", null);
        setField(term737462, term737462.getClass(), "first", null);
        setField(term737462, term737462.getClass(), "last", null);
        setField(term737462, term737462.getClass(), "propListHead", null);
        setIntField(term737462, term737462.getClass(), "sourcePosition", 0);
        setField(term737462, term737462.getClass(), "jsType", null);
        setField(term737462, term737462.getClass(), "parent", null);
        setField(term737452, term737452.getClass(), "next", term737462);
        setField(term737452, term737452.getClass(), "first", null);
        setField(term737452, term737452.getClass(), "last", null);
        setField(term737452, term737452.getClass(), "propListHead", null);
        setIntField(term737452, term737452.getClass(), "sourcePosition", 0);
        setField(term737452, term737452.getClass(), "jsType", null);
        setField(term737452, term737452.getClass(), "parent", null);
        setField(term737450, term737450.getClass(), "first", term737452);
        setField(term737450, term737450.getClass(), "last", null);
        setField(term737450, term737450.getClass(), "propListHead", null);
        setIntField(term737450, term737450.getClass(), "sourcePosition", 0);
        setField(term737450, term737450.getClass(), "jsType", null);
        setField(term737450, term737450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term736843;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term736751, args);
        assertTrue(recursiveEquals(term736751, term737519));
        assertTrue(recursiveEquals(term736843, term737520));
        assertTrue(recursiveEquals(retValue, term737450));
    }

};


