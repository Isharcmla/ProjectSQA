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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80824;
     Object term80910;
     Object term81321;
     Object term81322;
     Object term81277;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term80910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80910, term80910.getClass(), "first", term80910);
        setField(term80910, term80910.getClass(), "next", term80980);
        setIntField(term80910, term80910.getClass(), "type", 52);
        term81321 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81321, term81321.getClass(), "currentTraversal", null);
        term81322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81322, term81322.getClass(), "functionName", null);
        setBooleanField(term81322, term81322.getClass(), "itsNeedsActivation", false);
        setIntField(term81322, term81322.getClass(), "itsFunctionType", 0);
        setBooleanField(term81322, term81322.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81322, term81322.getClass(), "encodedSourceStart", 0);
        setIntField(term81322, term81322.getClass(), "encodedSourceEnd", 0);
        setField(term81322, term81322.getClass(), "sourceName", null);
        setIntField(term81322, term81322.getClass(), "baseLineno", 0);
        setIntField(term81322, term81322.getClass(), "endLineno", 0);
        setField(term81322, term81322.getClass(), "functions", null);
        setField(term81322, term81322.getClass(), "regexps", null);
        setField(term81322, term81322.getClass(), "itsVariables", null);
        setField(term81322, term81322.getClass(), "itsConst", null);
        setField(term81322, term81322.getClass(), "itsVariableNames", null);
        setIntField(term81322, term81322.getClass(), "varStart", 0);
        setField(term81322, term81322.getClass(), "compilerData", null);
        setIntField(term81322, term81322.getClass(), "type", 52);
        setIntField(term81323, term81323.getClass(), "type", 0);
        setField(term81323, term81323.getClass(), "next", null);
        setField(term81323, term81323.getClass(), "first", null);
        setField(term81323, term81323.getClass(), "last", null);
        setField(term81323, term81323.getClass(), "propListHead", null);
        setIntField(term81323, term81323.getClass(), "sourcePosition", 0);
        setField(term81323, term81323.getClass(), "jsType", null);
        setField(term81323, term81323.getClass(), "parent", null);
        setField(term81322, term81322.getClass(), "next", term81323);
        setField(term81322, term81322.getClass(), "first", term81322);
        setField(term81322, term81322.getClass(), "last", null);
        setField(term81322, term81322.getClass(), "propListHead", null);
        setIntField(term81322, term81322.getClass(), "sourcePosition", 0);
        setField(term81322, term81322.getClass(), "jsType", null);
        setField(term81322, term81322.getClass(), "parent", null);
        term81277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81277, term81277.getClass(), "functionName", null);
        setBooleanField(term81277, term81277.getClass(), "itsNeedsActivation", false);
        setIntField(term81277, term81277.getClass(), "itsFunctionType", 0);
        setBooleanField(term81277, term81277.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81277, term81277.getClass(), "encodedSourceStart", 0);
        setIntField(term81277, term81277.getClass(), "encodedSourceEnd", 0);
        setField(term81277, term81277.getClass(), "sourceName", null);
        setIntField(term81277, term81277.getClass(), "baseLineno", 0);
        setIntField(term81277, term81277.getClass(), "endLineno", 0);
        setField(term81277, term81277.getClass(), "functions", null);
        setField(term81277, term81277.getClass(), "regexps", null);
        setField(term81277, term81277.getClass(), "itsVariables", null);
        setField(term81277, term81277.getClass(), "itsConst", null);
        setField(term81277, term81277.getClass(), "itsVariableNames", null);
        setIntField(term81277, term81277.getClass(), "varStart", 0);
        setField(term81277, term81277.getClass(), "compilerData", null);
        setIntField(term81277, term81277.getClass(), "type", 52);
        setIntField(term81287, term81287.getClass(), "type", 0);
        setField(term81287, term81287.getClass(), "next", null);
        setField(term81287, term81287.getClass(), "first", null);
        setField(term81287, term81287.getClass(), "last", null);
        setField(term81287, term81287.getClass(), "propListHead", null);
        setIntField(term81287, term81287.getClass(), "sourcePosition", 0);
        setField(term81287, term81287.getClass(), "jsType", null);
        setField(term81287, term81287.getClass(), "parent", null);
        setField(term81277, term81277.getClass(), "next", term81287);
        setField(term81277, term81277.getClass(), "first", term81277);
        setField(term81277, term81277.getClass(), "last", null);
        setField(term81277, term81277.getClass(), "propListHead", null);
        setIntField(term81277, term81277.getClass(), "sourcePosition", 0);
        setField(term81277, term81277.getClass(), "jsType", null);
        setField(term81277, term81277.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term80910;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term80824, args);
        assertTrue(recursiveEquals(term80824, term81321));
        assertTrue(recursiveEquals(term80910, term81322));
        assertTrue(recursiveEquals(retValue, term81277));
    }

};


