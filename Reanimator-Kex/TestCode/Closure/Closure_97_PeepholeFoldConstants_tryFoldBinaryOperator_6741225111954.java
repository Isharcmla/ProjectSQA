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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741483;
     Object term741569;
     Object term741793;
     Object term741794;
     Object term741749;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term741569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term741569, term741569.getClass(), "first", term741569);
        setField(term741569, term741569.getClass(), "next", term741639);
        setIntField(term741569, term741569.getClass(), "type", 46);
        term741793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term741793, term741793.getClass(), "currentTraversal", null);
        term741794 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term741794, term741794.getClass(), "functionName", null);
        setBooleanField(term741794, term741794.getClass(), "itsNeedsActivation", false);
        setIntField(term741794, term741794.getClass(), "itsFunctionType", 0);
        setBooleanField(term741794, term741794.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741794, term741794.getClass(), "encodedSourceStart", 0);
        setIntField(term741794, term741794.getClass(), "encodedSourceEnd", 0);
        setField(term741794, term741794.getClass(), "sourceName", null);
        setIntField(term741794, term741794.getClass(), "baseLineno", 0);
        setIntField(term741794, term741794.getClass(), "endLineno", 0);
        setField(term741794, term741794.getClass(), "functions", null);
        setField(term741794, term741794.getClass(), "regexps", null);
        setField(term741794, term741794.getClass(), "itsVariables", null);
        setField(term741794, term741794.getClass(), "itsConst", null);
        setField(term741794, term741794.getClass(), "itsVariableNames", null);
        setIntField(term741794, term741794.getClass(), "varStart", 0);
        setField(term741794, term741794.getClass(), "compilerData", null);
        setIntField(term741794, term741794.getClass(), "type", 46);
        setIntField(term741795, term741795.getClass(), "type", 0);
        setField(term741795, term741795.getClass(), "next", null);
        setField(term741795, term741795.getClass(), "first", null);
        setField(term741795, term741795.getClass(), "last", null);
        setField(term741795, term741795.getClass(), "propListHead", null);
        setIntField(term741795, term741795.getClass(), "sourcePosition", 0);
        setField(term741795, term741795.getClass(), "jsType", null);
        setField(term741795, term741795.getClass(), "parent", null);
        setField(term741794, term741794.getClass(), "next", term741795);
        setField(term741794, term741794.getClass(), "first", term741794);
        setField(term741794, term741794.getClass(), "last", null);
        setField(term741794, term741794.getClass(), "propListHead", null);
        setIntField(term741794, term741794.getClass(), "sourcePosition", 0);
        setField(term741794, term741794.getClass(), "jsType", null);
        setField(term741794, term741794.getClass(), "parent", null);
        term741749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term741749, term741749.getClass(), "functionName", null);
        setBooleanField(term741749, term741749.getClass(), "itsNeedsActivation", false);
        setIntField(term741749, term741749.getClass(), "itsFunctionType", 0);
        setBooleanField(term741749, term741749.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741749, term741749.getClass(), "encodedSourceStart", 0);
        setIntField(term741749, term741749.getClass(), "encodedSourceEnd", 0);
        setField(term741749, term741749.getClass(), "sourceName", null);
        setIntField(term741749, term741749.getClass(), "baseLineno", 0);
        setIntField(term741749, term741749.getClass(), "endLineno", 0);
        setField(term741749, term741749.getClass(), "functions", null);
        setField(term741749, term741749.getClass(), "regexps", null);
        setField(term741749, term741749.getClass(), "itsVariables", null);
        setField(term741749, term741749.getClass(), "itsConst", null);
        setField(term741749, term741749.getClass(), "itsVariableNames", null);
        setIntField(term741749, term741749.getClass(), "varStart", 0);
        setField(term741749, term741749.getClass(), "compilerData", null);
        setIntField(term741749, term741749.getClass(), "type", 46);
        setIntField(term741759, term741759.getClass(), "type", 0);
        setField(term741759, term741759.getClass(), "next", null);
        setField(term741759, term741759.getClass(), "first", null);
        setField(term741759, term741759.getClass(), "last", null);
        setField(term741759, term741759.getClass(), "propListHead", null);
        setIntField(term741759, term741759.getClass(), "sourcePosition", 0);
        setField(term741759, term741759.getClass(), "jsType", null);
        setField(term741759, term741759.getClass(), "parent", null);
        setField(term741749, term741749.getClass(), "next", term741759);
        setField(term741749, term741749.getClass(), "first", term741749);
        setField(term741749, term741749.getClass(), "last", null);
        setField(term741749, term741749.getClass(), "propListHead", null);
        setIntField(term741749, term741749.getClass(), "sourcePosition", 0);
        setField(term741749, term741749.getClass(), "jsType", null);
        setField(term741749, term741749.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term741569;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term741483, args);
        assertTrue(recursiveEquals(term741483, term741793));
        assertTrue(recursiveEquals(term741569, term741794));
        assertTrue(recursiveEquals(retValue, term741749));
    }

};


