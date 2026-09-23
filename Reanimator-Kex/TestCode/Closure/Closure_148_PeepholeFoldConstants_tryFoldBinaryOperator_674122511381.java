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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76980;
     Object term77066;
     Object term77483;
     Object term77484;
     Object term77439;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76980 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term77066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77066, term77066.getClass(), "first", term77066);
        setField(term77066, term77066.getClass(), "next", term77136);
        setIntField(term77066, term77066.getClass(), "type", 45);
        term77483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term77483, term77483.getClass(), "currentTraversal", null);
        term77484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77484, term77484.getClass(), "functionName", null);
        setBooleanField(term77484, term77484.getClass(), "itsNeedsActivation", false);
        setIntField(term77484, term77484.getClass(), "itsFunctionType", 0);
        setBooleanField(term77484, term77484.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77484, term77484.getClass(), "encodedSourceStart", 0);
        setIntField(term77484, term77484.getClass(), "encodedSourceEnd", 0);
        setField(term77484, term77484.getClass(), "sourceName", null);
        setIntField(term77484, term77484.getClass(), "baseLineno", 0);
        setIntField(term77484, term77484.getClass(), "endLineno", 0);
        setField(term77484, term77484.getClass(), "functions", null);
        setField(term77484, term77484.getClass(), "regexps", null);
        setField(term77484, term77484.getClass(), "itsVariables", null);
        setField(term77484, term77484.getClass(), "itsConst", null);
        setField(term77484, term77484.getClass(), "itsVariableNames", null);
        setIntField(term77484, term77484.getClass(), "varStart", 0);
        setField(term77484, term77484.getClass(), "compilerData", null);
        setIntField(term77484, term77484.getClass(), "type", 45);
        setIntField(term77485, term77485.getClass(), "type", 0);
        setField(term77485, term77485.getClass(), "next", null);
        setField(term77485, term77485.getClass(), "first", null);
        setField(term77485, term77485.getClass(), "last", null);
        setField(term77485, term77485.getClass(), "propListHead", null);
        setIntField(term77485, term77485.getClass(), "sourcePosition", 0);
        setField(term77485, term77485.getClass(), "jsType", null);
        setField(term77485, term77485.getClass(), "parent", null);
        setField(term77484, term77484.getClass(), "next", term77485);
        setField(term77484, term77484.getClass(), "first", term77484);
        setField(term77484, term77484.getClass(), "last", null);
        setField(term77484, term77484.getClass(), "propListHead", null);
        setIntField(term77484, term77484.getClass(), "sourcePosition", 0);
        setField(term77484, term77484.getClass(), "jsType", null);
        setField(term77484, term77484.getClass(), "parent", null);
        term77439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77439, term77439.getClass(), "functionName", null);
        setBooleanField(term77439, term77439.getClass(), "itsNeedsActivation", false);
        setIntField(term77439, term77439.getClass(), "itsFunctionType", 0);
        setBooleanField(term77439, term77439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77439, term77439.getClass(), "encodedSourceStart", 0);
        setIntField(term77439, term77439.getClass(), "encodedSourceEnd", 0);
        setField(term77439, term77439.getClass(), "sourceName", null);
        setIntField(term77439, term77439.getClass(), "baseLineno", 0);
        setIntField(term77439, term77439.getClass(), "endLineno", 0);
        setField(term77439, term77439.getClass(), "functions", null);
        setField(term77439, term77439.getClass(), "regexps", null);
        setField(term77439, term77439.getClass(), "itsVariables", null);
        setField(term77439, term77439.getClass(), "itsConst", null);
        setField(term77439, term77439.getClass(), "itsVariableNames", null);
        setIntField(term77439, term77439.getClass(), "varStart", 0);
        setField(term77439, term77439.getClass(), "compilerData", null);
        setIntField(term77439, term77439.getClass(), "type", 45);
        setIntField(term77449, term77449.getClass(), "type", 0);
        setField(term77449, term77449.getClass(), "next", null);
        setField(term77449, term77449.getClass(), "first", null);
        setField(term77449, term77449.getClass(), "last", null);
        setField(term77449, term77449.getClass(), "propListHead", null);
        setIntField(term77449, term77449.getClass(), "sourcePosition", 0);
        setField(term77449, term77449.getClass(), "jsType", null);
        setField(term77449, term77449.getClass(), "parent", null);
        setField(term77439, term77439.getClass(), "next", term77449);
        setField(term77439, term77439.getClass(), "first", term77439);
        setField(term77439, term77439.getClass(), "last", null);
        setField(term77439, term77439.getClass(), "propListHead", null);
        setIntField(term77439, term77439.getClass(), "sourcePosition", 0);
        setField(term77439, term77439.getClass(), "jsType", null);
        setField(term77439, term77439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77066;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term76980, args);
        assertTrue(recursiveEquals(term76980, term77483));
        assertTrue(recursiveEquals(term77066, term77484));
        assertTrue(recursiveEquals(retValue, term77439));
    }

};


