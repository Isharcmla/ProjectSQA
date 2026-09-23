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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35814;
     Object term35900;
     Object term36439;
     Object term36440;
     Object term36398;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35900, term35900.getClass(), "first", term35900);
        setField(term35900, term35900.getClass(), "next", term35970);
        setIntField(term35900, term35900.getClass(), "type", 11);
        term36439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36439, term36439.getClass(), "currentTraversal", null);
        term36440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term36441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36440, term36440.getClass(), "functionName", null);
        setBooleanField(term36440, term36440.getClass(), "itsNeedsActivation", false);
        setIntField(term36440, term36440.getClass(), "itsFunctionType", 0);
        setBooleanField(term36440, term36440.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term36440, term36440.getClass(), "encodedSourceStart", 0);
        setIntField(term36440, term36440.getClass(), "encodedSourceEnd", 0);
        setField(term36440, term36440.getClass(), "sourceName", null);
        setIntField(term36440, term36440.getClass(), "baseLineno", 0);
        setIntField(term36440, term36440.getClass(), "endLineno", 0);
        setField(term36440, term36440.getClass(), "functions", null);
        setField(term36440, term36440.getClass(), "regexps", null);
        setField(term36440, term36440.getClass(), "itsVariables", null);
        setField(term36440, term36440.getClass(), "itsConst", null);
        setField(term36440, term36440.getClass(), "itsVariableNames", null);
        setIntField(term36440, term36440.getClass(), "varStart", 0);
        setField(term36440, term36440.getClass(), "compilerData", null);
        setIntField(term36440, term36440.getClass(), "type", 11);
        setIntField(term36441, term36441.getClass(), "type", 0);
        setField(term36441, term36441.getClass(), "next", null);
        setField(term36441, term36441.getClass(), "first", null);
        setField(term36441, term36441.getClass(), "last", null);
        setField(term36441, term36441.getClass(), "propListHead", null);
        setIntField(term36441, term36441.getClass(), "sourcePosition", 0);
        setField(term36441, term36441.getClass(), "jsType", null);
        setField(term36441, term36441.getClass(), "parent", null);
        setField(term36440, term36440.getClass(), "next", term36441);
        setField(term36440, term36440.getClass(), "first", term36440);
        setField(term36440, term36440.getClass(), "last", null);
        setField(term36440, term36440.getClass(), "propListHead", null);
        setIntField(term36440, term36440.getClass(), "sourcePosition", 0);
        setField(term36440, term36440.getClass(), "jsType", null);
        setField(term36440, term36440.getClass(), "parent", null);
        term36398 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term36408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36398, term36398.getClass(), "functionName", null);
        setBooleanField(term36398, term36398.getClass(), "itsNeedsActivation", false);
        setIntField(term36398, term36398.getClass(), "itsFunctionType", 0);
        setBooleanField(term36398, term36398.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term36398, term36398.getClass(), "encodedSourceStart", 0);
        setIntField(term36398, term36398.getClass(), "encodedSourceEnd", 0);
        setField(term36398, term36398.getClass(), "sourceName", null);
        setIntField(term36398, term36398.getClass(), "baseLineno", 0);
        setIntField(term36398, term36398.getClass(), "endLineno", 0);
        setField(term36398, term36398.getClass(), "functions", null);
        setField(term36398, term36398.getClass(), "regexps", null);
        setField(term36398, term36398.getClass(), "itsVariables", null);
        setField(term36398, term36398.getClass(), "itsConst", null);
        setField(term36398, term36398.getClass(), "itsVariableNames", null);
        setIntField(term36398, term36398.getClass(), "varStart", 0);
        setField(term36398, term36398.getClass(), "compilerData", null);
        setIntField(term36398, term36398.getClass(), "type", 11);
        setIntField(term36408, term36408.getClass(), "type", 0);
        setField(term36408, term36408.getClass(), "next", null);
        setField(term36408, term36408.getClass(), "first", null);
        setField(term36408, term36408.getClass(), "last", null);
        setField(term36408, term36408.getClass(), "propListHead", null);
        setIntField(term36408, term36408.getClass(), "sourcePosition", 0);
        setField(term36408, term36408.getClass(), "jsType", null);
        setField(term36408, term36408.getClass(), "parent", null);
        setField(term36398, term36398.getClass(), "next", term36408);
        setField(term36398, term36398.getClass(), "first", term36398);
        setField(term36398, term36398.getClass(), "last", null);
        setField(term36398, term36398.getClass(), "propListHead", null);
        setIntField(term36398, term36398.getClass(), "sourcePosition", 0);
        setField(term36398, term36398.getClass(), "jsType", null);
        setField(term36398, term36398.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35900;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term35814, args);
        assertTrue(recursiveEquals(term35814, term36439));
        assertTrue(recursiveEquals(term35900, term36440));
        assertTrue(recursiveEquals(retValue, term36398));
    }

};


