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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273756;
     Object term273848;
     Object term274552;
     Object term274553;
     Object term274502;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273756 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term273848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term273934 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term273934, term273934.getClass(), "next", term274004);
        setField(term273848, term273848.getClass(), "first", term273934);
        setIntField(term273848, term273848.getClass(), "type", 13);
        term274552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term274552, term274552.getClass(), "currentTraversal", null);
        term274553 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274554 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term274553, term274553.getClass(), "str", null);
        setIntField(term274553, term274553.getClass(), "type", 13);
        setField(term274553, term274553.getClass(), "next", null);
        setField(term274554, term274554.getClass(), "functionName", null);
        setBooleanField(term274554, term274554.getClass(), "itsNeedsActivation", false);
        setIntField(term274554, term274554.getClass(), "itsFunctionType", 0);
        setBooleanField(term274554, term274554.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term274554, term274554.getClass(), "encodedSourceStart", 0);
        setIntField(term274554, term274554.getClass(), "encodedSourceEnd", 0);
        setField(term274554, term274554.getClass(), "sourceName", null);
        setIntField(term274554, term274554.getClass(), "baseLineno", 0);
        setIntField(term274554, term274554.getClass(), "endLineno", 0);
        setField(term274554, term274554.getClass(), "functions", null);
        setField(term274554, term274554.getClass(), "regexps", null);
        setField(term274554, term274554.getClass(), "itsVariables", null);
        setField(term274554, term274554.getClass(), "itsConst", null);
        setField(term274554, term274554.getClass(), "itsVariableNames", null);
        setIntField(term274554, term274554.getClass(), "varStart", 0);
        setField(term274554, term274554.getClass(), "compilerData", null);
        setIntField(term274554, term274554.getClass(), "type", 0);
        setIntField(term274555, term274555.getClass(), "type", 0);
        setField(term274555, term274555.getClass(), "next", null);
        setField(term274555, term274555.getClass(), "first", null);
        setField(term274555, term274555.getClass(), "last", null);
        setField(term274555, term274555.getClass(), "propListHead", null);
        setIntField(term274555, term274555.getClass(), "sourcePosition", 0);
        setField(term274555, term274555.getClass(), "jsType", null);
        setField(term274555, term274555.getClass(), "parent", null);
        setField(term274554, term274554.getClass(), "next", term274555);
        setField(term274554, term274554.getClass(), "first", null);
        setField(term274554, term274554.getClass(), "last", null);
        setField(term274554, term274554.getClass(), "propListHead", null);
        setIntField(term274554, term274554.getClass(), "sourcePosition", 0);
        setField(term274554, term274554.getClass(), "jsType", null);
        setField(term274554, term274554.getClass(), "parent", null);
        setField(term274553, term274553.getClass(), "first", term274554);
        setField(term274553, term274553.getClass(), "last", null);
        setField(term274553, term274553.getClass(), "propListHead", null);
        setIntField(term274553, term274553.getClass(), "sourcePosition", 0);
        setField(term274553, term274553.getClass(), "jsType", null);
        setField(term274553, term274553.getClass(), "parent", null);
        term274502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274504 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term274502, term274502.getClass(), "str", null);
        setIntField(term274502, term274502.getClass(), "type", 13);
        setField(term274502, term274502.getClass(), "next", null);
        setField(term274504, term274504.getClass(), "functionName", null);
        setBooleanField(term274504, term274504.getClass(), "itsNeedsActivation", false);
        setIntField(term274504, term274504.getClass(), "itsFunctionType", 0);
        setBooleanField(term274504, term274504.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term274504, term274504.getClass(), "encodedSourceStart", 0);
        setIntField(term274504, term274504.getClass(), "encodedSourceEnd", 0);
        setField(term274504, term274504.getClass(), "sourceName", null);
        setIntField(term274504, term274504.getClass(), "baseLineno", 0);
        setIntField(term274504, term274504.getClass(), "endLineno", 0);
        setField(term274504, term274504.getClass(), "functions", null);
        setField(term274504, term274504.getClass(), "regexps", null);
        setField(term274504, term274504.getClass(), "itsVariables", null);
        setField(term274504, term274504.getClass(), "itsConst", null);
        setField(term274504, term274504.getClass(), "itsVariableNames", null);
        setIntField(term274504, term274504.getClass(), "varStart", 0);
        setField(term274504, term274504.getClass(), "compilerData", null);
        setIntField(term274504, term274504.getClass(), "type", 0);
        setIntField(term274514, term274514.getClass(), "type", 0);
        setField(term274514, term274514.getClass(), "next", null);
        setField(term274514, term274514.getClass(), "first", null);
        setField(term274514, term274514.getClass(), "last", null);
        setField(term274514, term274514.getClass(), "propListHead", null);
        setIntField(term274514, term274514.getClass(), "sourcePosition", 0);
        setField(term274514, term274514.getClass(), "jsType", null);
        setField(term274514, term274514.getClass(), "parent", null);
        setField(term274504, term274504.getClass(), "next", term274514);
        setField(term274504, term274504.getClass(), "first", null);
        setField(term274504, term274504.getClass(), "last", null);
        setField(term274504, term274504.getClass(), "propListHead", null);
        setIntField(term274504, term274504.getClass(), "sourcePosition", 0);
        setField(term274504, term274504.getClass(), "jsType", null);
        setField(term274504, term274504.getClass(), "parent", null);
        setField(term274502, term274502.getClass(), "first", term274504);
        setField(term274502, term274502.getClass(), "last", null);
        setField(term274502, term274502.getClass(), "propListHead", null);
        setIntField(term274502, term274502.getClass(), "sourcePosition", 0);
        setField(term274502, term274502.getClass(), "jsType", null);
        setField(term274502, term274502.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term273848;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term273756, args);
        assertTrue(recursiveEquals(term273756, term274552));
        assertTrue(recursiveEquals(term273848, term274553));
        assertTrue(recursiveEquals(retValue, term274502));
    }

};


