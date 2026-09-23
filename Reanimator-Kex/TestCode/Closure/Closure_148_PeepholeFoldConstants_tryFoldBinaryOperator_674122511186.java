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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35257;
     Object term35327;
     Object term35679;
     Object term35680;
     Object term35601;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35257 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35417 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term35507 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term35417, term35417.getClass(), "next", term35507);
        setIntField(term35417, term35417.getClass(), "type", 0);
        setField(term35327, term35327.getClass(), "first", term35417);
        setIntField(term35327, term35327.getClass(), "type", 101);
        setField(term35327, term35327.getClass(), "parent", null);
        term35679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35679, term35679.getClass(), "currentTraversal", null);
        term35680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35681 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term35682 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term35680, term35680.getClass(), "type", 101);
        setField(term35680, term35680.getClass(), "next", null);
        setIntField(term35681, term35681.getClass(), "encodedSourceStart", 0);
        setIntField(term35681, term35681.getClass(), "encodedSourceEnd", 0);
        setField(term35681, term35681.getClass(), "sourceName", null);
        setIntField(term35681, term35681.getClass(), "baseLineno", 0);
        setIntField(term35681, term35681.getClass(), "endLineno", 0);
        setField(term35681, term35681.getClass(), "functions", null);
        setField(term35681, term35681.getClass(), "regexps", null);
        setField(term35681, term35681.getClass(), "itsVariables", null);
        setField(term35681, term35681.getClass(), "itsConst", null);
        setField(term35681, term35681.getClass(), "itsVariableNames", null);
        setIntField(term35681, term35681.getClass(), "varStart", 0);
        setField(term35681, term35681.getClass(), "compilerData", null);
        setIntField(term35681, term35681.getClass(), "type", 0);
        setIntField(term35682, term35682.getClass(), "encodedSourceStart", 0);
        setIntField(term35682, term35682.getClass(), "encodedSourceEnd", 0);
        setField(term35682, term35682.getClass(), "sourceName", null);
        setIntField(term35682, term35682.getClass(), "baseLineno", 0);
        setIntField(term35682, term35682.getClass(), "endLineno", 0);
        setField(term35682, term35682.getClass(), "functions", null);
        setField(term35682, term35682.getClass(), "regexps", null);
        setField(term35682, term35682.getClass(), "itsVariables", null);
        setField(term35682, term35682.getClass(), "itsConst", null);
        setField(term35682, term35682.getClass(), "itsVariableNames", null);
        setIntField(term35682, term35682.getClass(), "varStart", 0);
        setField(term35682, term35682.getClass(), "compilerData", null);
        setIntField(term35682, term35682.getClass(), "type", 0);
        setField(term35682, term35682.getClass(), "next", null);
        setField(term35682, term35682.getClass(), "first", null);
        setField(term35682, term35682.getClass(), "last", null);
        setField(term35682, term35682.getClass(), "propListHead", null);
        setIntField(term35682, term35682.getClass(), "sourcePosition", 0);
        setField(term35682, term35682.getClass(), "jsType", null);
        setField(term35682, term35682.getClass(), "parent", null);
        setField(term35681, term35681.getClass(), "next", term35682);
        setField(term35681, term35681.getClass(), "first", null);
        setField(term35681, term35681.getClass(), "last", null);
        setField(term35681, term35681.getClass(), "propListHead", null);
        setIntField(term35681, term35681.getClass(), "sourcePosition", 0);
        setField(term35681, term35681.getClass(), "jsType", null);
        setField(term35681, term35681.getClass(), "parent", null);
        setField(term35680, term35680.getClass(), "first", term35681);
        setField(term35680, term35680.getClass(), "last", null);
        setField(term35680, term35680.getClass(), "propListHead", null);
        setIntField(term35680, term35680.getClass(), "sourcePosition", 0);
        setField(term35680, term35680.getClass(), "jsType", null);
        setField(term35680, term35680.getClass(), "parent", null);
        term35601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35603 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term35610 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term35601, term35601.getClass(), "type", 101);
        setField(term35601, term35601.getClass(), "next", null);
        setIntField(term35603, term35603.getClass(), "encodedSourceStart", 0);
        setIntField(term35603, term35603.getClass(), "encodedSourceEnd", 0);
        setField(term35603, term35603.getClass(), "sourceName", null);
        setIntField(term35603, term35603.getClass(), "baseLineno", 0);
        setIntField(term35603, term35603.getClass(), "endLineno", 0);
        setField(term35603, term35603.getClass(), "functions", null);
        setField(term35603, term35603.getClass(), "regexps", null);
        setField(term35603, term35603.getClass(), "itsVariables", null);
        setField(term35603, term35603.getClass(), "itsConst", null);
        setField(term35603, term35603.getClass(), "itsVariableNames", null);
        setIntField(term35603, term35603.getClass(), "varStart", 0);
        setField(term35603, term35603.getClass(), "compilerData", null);
        setIntField(term35603, term35603.getClass(), "type", 0);
        setIntField(term35610, term35610.getClass(), "encodedSourceStart", 0);
        setIntField(term35610, term35610.getClass(), "encodedSourceEnd", 0);
        setField(term35610, term35610.getClass(), "sourceName", null);
        setIntField(term35610, term35610.getClass(), "baseLineno", 0);
        setIntField(term35610, term35610.getClass(), "endLineno", 0);
        setField(term35610, term35610.getClass(), "functions", null);
        setField(term35610, term35610.getClass(), "regexps", null);
        setField(term35610, term35610.getClass(), "itsVariables", null);
        setField(term35610, term35610.getClass(), "itsConst", null);
        setField(term35610, term35610.getClass(), "itsVariableNames", null);
        setIntField(term35610, term35610.getClass(), "varStart", 0);
        setField(term35610, term35610.getClass(), "compilerData", null);
        setIntField(term35610, term35610.getClass(), "type", 0);
        setField(term35610, term35610.getClass(), "next", null);
        setField(term35610, term35610.getClass(), "first", null);
        setField(term35610, term35610.getClass(), "last", null);
        setField(term35610, term35610.getClass(), "propListHead", null);
        setIntField(term35610, term35610.getClass(), "sourcePosition", 0);
        setField(term35610, term35610.getClass(), "jsType", null);
        setField(term35610, term35610.getClass(), "parent", null);
        setField(term35603, term35603.getClass(), "next", term35610);
        setField(term35603, term35603.getClass(), "first", null);
        setField(term35603, term35603.getClass(), "last", null);
        setField(term35603, term35603.getClass(), "propListHead", null);
        setIntField(term35603, term35603.getClass(), "sourcePosition", 0);
        setField(term35603, term35603.getClass(), "jsType", null);
        setField(term35603, term35603.getClass(), "parent", null);
        setField(term35601, term35601.getClass(), "first", term35603);
        setField(term35601, term35601.getClass(), "last", null);
        setField(term35601, term35601.getClass(), "propListHead", null);
        setIntField(term35601, term35601.getClass(), "sourcePosition", 0);
        setField(term35601, term35601.getClass(), "jsType", null);
        setField(term35601, term35601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35327;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term35257, args);
        assertTrue(recursiveEquals(term35257, term35679));
        assertTrue(recursiveEquals(term35327, term35680));
        assertTrue(recursiveEquals(retValue, term35601));
    }

};


