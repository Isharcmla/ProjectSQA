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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174632;
     Object term174718;
     Object term175267;
     Object term175268;
     Object term175213;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term174718 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term174788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term174718, term174718.getClass(), "first", term174718);
        setField(term174718, term174718.getClass(), "next", term174788);
        setIntField(term174718, term174718.getClass(), "type", 14);
        term175267 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term175267, term175267.getClass(), "currentTraversal", null);
        term175268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term175269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term175268, term175268.getClass(), "functionName", null);
        setBooleanField(term175268, term175268.getClass(), "itsNeedsActivation", false);
        setIntField(term175268, term175268.getClass(), "itsFunctionType", 0);
        setBooleanField(term175268, term175268.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175268, term175268.getClass(), "encodedSourceStart", 0);
        setIntField(term175268, term175268.getClass(), "encodedSourceEnd", 0);
        setField(term175268, term175268.getClass(), "sourceName", null);
        setIntField(term175268, term175268.getClass(), "baseLineno", 0);
        setIntField(term175268, term175268.getClass(), "endLineno", 0);
        setField(term175268, term175268.getClass(), "functions", null);
        setField(term175268, term175268.getClass(), "regexps", null);
        setField(term175268, term175268.getClass(), "itsVariables", null);
        setField(term175268, term175268.getClass(), "itsConst", null);
        setField(term175268, term175268.getClass(), "itsVariableNames", null);
        setIntField(term175268, term175268.getClass(), "varStart", 0);
        setField(term175268, term175268.getClass(), "compilerData", null);
        setIntField(term175268, term175268.getClass(), "type", 14);
        setIntField(term175269, term175269.getClass(), "type", 0);
        setField(term175269, term175269.getClass(), "next", null);
        setField(term175269, term175269.getClass(), "first", null);
        setField(term175269, term175269.getClass(), "last", null);
        setField(term175269, term175269.getClass(), "propListHead", null);
        setIntField(term175269, term175269.getClass(), "sourcePosition", 0);
        setField(term175269, term175269.getClass(), "jsType", null);
        setField(term175269, term175269.getClass(), "parent", null);
        setField(term175268, term175268.getClass(), "next", term175269);
        setField(term175268, term175268.getClass(), "first", term175268);
        setField(term175268, term175268.getClass(), "last", null);
        setField(term175268, term175268.getClass(), "propListHead", null);
        setIntField(term175268, term175268.getClass(), "sourcePosition", 0);
        setField(term175268, term175268.getClass(), "jsType", null);
        setField(term175268, term175268.getClass(), "parent", null);
        term175213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term175223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term175213, term175213.getClass(), "functionName", null);
        setBooleanField(term175213, term175213.getClass(), "itsNeedsActivation", false);
        setIntField(term175213, term175213.getClass(), "itsFunctionType", 0);
        setBooleanField(term175213, term175213.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175213, term175213.getClass(), "encodedSourceStart", 0);
        setIntField(term175213, term175213.getClass(), "encodedSourceEnd", 0);
        setField(term175213, term175213.getClass(), "sourceName", null);
        setIntField(term175213, term175213.getClass(), "baseLineno", 0);
        setIntField(term175213, term175213.getClass(), "endLineno", 0);
        setField(term175213, term175213.getClass(), "functions", null);
        setField(term175213, term175213.getClass(), "regexps", null);
        setField(term175213, term175213.getClass(), "itsVariables", null);
        setField(term175213, term175213.getClass(), "itsConst", null);
        setField(term175213, term175213.getClass(), "itsVariableNames", null);
        setIntField(term175213, term175213.getClass(), "varStart", 0);
        setField(term175213, term175213.getClass(), "compilerData", null);
        setIntField(term175213, term175213.getClass(), "type", 14);
        setIntField(term175223, term175223.getClass(), "type", 0);
        setField(term175223, term175223.getClass(), "next", null);
        setField(term175223, term175223.getClass(), "first", null);
        setField(term175223, term175223.getClass(), "last", null);
        setField(term175223, term175223.getClass(), "propListHead", null);
        setIntField(term175223, term175223.getClass(), "sourcePosition", 0);
        setField(term175223, term175223.getClass(), "jsType", null);
        setField(term175223, term175223.getClass(), "parent", null);
        setField(term175213, term175213.getClass(), "next", term175223);
        setField(term175213, term175213.getClass(), "first", term175213);
        setField(term175213, term175213.getClass(), "last", null);
        setField(term175213, term175213.getClass(), "propListHead", null);
        setIntField(term175213, term175213.getClass(), "sourcePosition", 0);
        setField(term175213, term175213.getClass(), "jsType", null);
        setField(term175213, term175213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term174718;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term174632, args);
        assertTrue(recursiveEquals(term174632, term175267));
        assertTrue(recursiveEquals(term174718, term175268));
        assertTrue(recursiveEquals(retValue, term175213));
    }

};


