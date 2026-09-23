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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164858;
     Object term164944;
     Object term165144;
     Object term165145;
     Object term165100;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164858 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term164944 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term165014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term164944, term164944.getClass(), "first", term164944);
        setField(term164944, term164944.getClass(), "next", term165014);
        setIntField(term164944, term164944.getClass(), "type", 46);
        term165144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term165144, term165144.getClass(), "currentTraversal", null);
        term165145 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term165146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term165145, term165145.getClass(), "functionName", null);
        setBooleanField(term165145, term165145.getClass(), "itsNeedsActivation", false);
        setIntField(term165145, term165145.getClass(), "itsFunctionType", 0);
        setBooleanField(term165145, term165145.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term165145, term165145.getClass(), "encodedSourceStart", 0);
        setIntField(term165145, term165145.getClass(), "encodedSourceEnd", 0);
        setField(term165145, term165145.getClass(), "sourceName", null);
        setIntField(term165145, term165145.getClass(), "baseLineno", 0);
        setIntField(term165145, term165145.getClass(), "endLineno", 0);
        setField(term165145, term165145.getClass(), "functions", null);
        setField(term165145, term165145.getClass(), "regexps", null);
        setField(term165145, term165145.getClass(), "itsVariables", null);
        setField(term165145, term165145.getClass(), "itsConst", null);
        setField(term165145, term165145.getClass(), "itsVariableNames", null);
        setIntField(term165145, term165145.getClass(), "varStart", 0);
        setField(term165145, term165145.getClass(), "compilerData", null);
        setIntField(term165145, term165145.getClass(), "type", 46);
        setIntField(term165146, term165146.getClass(), "type", 0);
        setField(term165146, term165146.getClass(), "next", null);
        setField(term165146, term165146.getClass(), "first", null);
        setField(term165146, term165146.getClass(), "last", null);
        setField(term165146, term165146.getClass(), "propListHead", null);
        setIntField(term165146, term165146.getClass(), "sourcePosition", 0);
        setField(term165146, term165146.getClass(), "jsType", null);
        setField(term165146, term165146.getClass(), "parent", null);
        setField(term165145, term165145.getClass(), "next", term165146);
        setField(term165145, term165145.getClass(), "first", term165145);
        setField(term165145, term165145.getClass(), "last", null);
        setField(term165145, term165145.getClass(), "propListHead", null);
        setIntField(term165145, term165145.getClass(), "sourcePosition", 0);
        setField(term165145, term165145.getClass(), "jsType", null);
        setField(term165145, term165145.getClass(), "parent", null);
        term165100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term165110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term165100, term165100.getClass(), "functionName", null);
        setBooleanField(term165100, term165100.getClass(), "itsNeedsActivation", false);
        setIntField(term165100, term165100.getClass(), "itsFunctionType", 0);
        setBooleanField(term165100, term165100.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term165100, term165100.getClass(), "encodedSourceStart", 0);
        setIntField(term165100, term165100.getClass(), "encodedSourceEnd", 0);
        setField(term165100, term165100.getClass(), "sourceName", null);
        setIntField(term165100, term165100.getClass(), "baseLineno", 0);
        setIntField(term165100, term165100.getClass(), "endLineno", 0);
        setField(term165100, term165100.getClass(), "functions", null);
        setField(term165100, term165100.getClass(), "regexps", null);
        setField(term165100, term165100.getClass(), "itsVariables", null);
        setField(term165100, term165100.getClass(), "itsConst", null);
        setField(term165100, term165100.getClass(), "itsVariableNames", null);
        setIntField(term165100, term165100.getClass(), "varStart", 0);
        setField(term165100, term165100.getClass(), "compilerData", null);
        setIntField(term165100, term165100.getClass(), "type", 46);
        setIntField(term165110, term165110.getClass(), "type", 0);
        setField(term165110, term165110.getClass(), "next", null);
        setField(term165110, term165110.getClass(), "first", null);
        setField(term165110, term165110.getClass(), "last", null);
        setField(term165110, term165110.getClass(), "propListHead", null);
        setIntField(term165110, term165110.getClass(), "sourcePosition", 0);
        setField(term165110, term165110.getClass(), "jsType", null);
        setField(term165110, term165110.getClass(), "parent", null);
        setField(term165100, term165100.getClass(), "next", term165110);
        setField(term165100, term165100.getClass(), "first", term165100);
        setField(term165100, term165100.getClass(), "last", null);
        setField(term165100, term165100.getClass(), "propListHead", null);
        setIntField(term165100, term165100.getClass(), "sourcePosition", 0);
        setField(term165100, term165100.getClass(), "jsType", null);
        setField(term165100, term165100.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term164944;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term164858, args);
        assertTrue(recursiveEquals(term164858, term165144));
        assertTrue(recursiveEquals(term164944, term165145));
        assertTrue(recursiveEquals(retValue, term165100));
    }

};


