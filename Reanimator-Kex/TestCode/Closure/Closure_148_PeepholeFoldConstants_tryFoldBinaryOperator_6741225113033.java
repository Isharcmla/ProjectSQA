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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892738;
     Object term892830;
     Object term893609;
     Object term893610;
     Object term893561;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term892738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term892830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term892922 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term893012 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term892922, term892922.getClass(), "next", term893012);
        setIntField(term892922, term892922.getClass(), "type", 63);
        setField(term892830, term892830.getClass(), "first", term892922);
        setIntField(term892830, term892830.getClass(), "type", 35);
        term893609 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term893609, term893609.getClass(), "currentTraversal", null);
        term893610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term893611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term893612 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term893610, term893610.getClass(), "str", null);
        setIntField(term893610, term893610.getClass(), "type", 35);
        setField(term893610, term893610.getClass(), "next", null);
        setField(term893611, term893611.getClass(), "str", null);
        setIntField(term893611, term893611.getClass(), "type", 63);
        setIntField(term893612, term893612.getClass(), "encodedSourceStart", 0);
        setIntField(term893612, term893612.getClass(), "encodedSourceEnd", 0);
        setField(term893612, term893612.getClass(), "sourceName", null);
        setIntField(term893612, term893612.getClass(), "baseLineno", 0);
        setIntField(term893612, term893612.getClass(), "endLineno", 0);
        setField(term893612, term893612.getClass(), "functions", null);
        setField(term893612, term893612.getClass(), "regexps", null);
        setField(term893612, term893612.getClass(), "itsVariables", null);
        setField(term893612, term893612.getClass(), "itsConst", null);
        setField(term893612, term893612.getClass(), "itsVariableNames", null);
        setIntField(term893612, term893612.getClass(), "varStart", 0);
        setField(term893612, term893612.getClass(), "compilerData", null);
        setIntField(term893612, term893612.getClass(), "type", 0);
        setField(term893612, term893612.getClass(), "next", null);
        setField(term893612, term893612.getClass(), "first", null);
        setField(term893612, term893612.getClass(), "last", null);
        setField(term893612, term893612.getClass(), "propListHead", null);
        setIntField(term893612, term893612.getClass(), "sourcePosition", 0);
        setField(term893612, term893612.getClass(), "jsType", null);
        setField(term893612, term893612.getClass(), "parent", null);
        setField(term893611, term893611.getClass(), "next", term893612);
        setField(term893611, term893611.getClass(), "first", null);
        setField(term893611, term893611.getClass(), "last", null);
        setField(term893611, term893611.getClass(), "propListHead", null);
        setIntField(term893611, term893611.getClass(), "sourcePosition", 0);
        setField(term893611, term893611.getClass(), "jsType", null);
        setField(term893611, term893611.getClass(), "parent", null);
        setField(term893610, term893610.getClass(), "first", term893611);
        setField(term893610, term893610.getClass(), "last", null);
        setField(term893610, term893610.getClass(), "propListHead", null);
        setIntField(term893610, term893610.getClass(), "sourcePosition", 0);
        setField(term893610, term893610.getClass(), "jsType", null);
        setField(term893610, term893610.getClass(), "parent", null);
        term893561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term893563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term893565 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term893561, term893561.getClass(), "str", null);
        setIntField(term893561, term893561.getClass(), "type", 35);
        setField(term893561, term893561.getClass(), "next", null);
        setField(term893563, term893563.getClass(), "str", null);
        setIntField(term893563, term893563.getClass(), "type", 63);
        setIntField(term893565, term893565.getClass(), "encodedSourceStart", 0);
        setIntField(term893565, term893565.getClass(), "encodedSourceEnd", 0);
        setField(term893565, term893565.getClass(), "sourceName", null);
        setIntField(term893565, term893565.getClass(), "baseLineno", 0);
        setIntField(term893565, term893565.getClass(), "endLineno", 0);
        setField(term893565, term893565.getClass(), "functions", null);
        setField(term893565, term893565.getClass(), "regexps", null);
        setField(term893565, term893565.getClass(), "itsVariables", null);
        setField(term893565, term893565.getClass(), "itsConst", null);
        setField(term893565, term893565.getClass(), "itsVariableNames", null);
        setIntField(term893565, term893565.getClass(), "varStart", 0);
        setField(term893565, term893565.getClass(), "compilerData", null);
        setIntField(term893565, term893565.getClass(), "type", 0);
        setField(term893565, term893565.getClass(), "next", null);
        setField(term893565, term893565.getClass(), "first", null);
        setField(term893565, term893565.getClass(), "last", null);
        setField(term893565, term893565.getClass(), "propListHead", null);
        setIntField(term893565, term893565.getClass(), "sourcePosition", 0);
        setField(term893565, term893565.getClass(), "jsType", null);
        setField(term893565, term893565.getClass(), "parent", null);
        setField(term893563, term893563.getClass(), "next", term893565);
        setField(term893563, term893563.getClass(), "first", null);
        setField(term893563, term893563.getClass(), "last", null);
        setField(term893563, term893563.getClass(), "propListHead", null);
        setIntField(term893563, term893563.getClass(), "sourcePosition", 0);
        setField(term893563, term893563.getClass(), "jsType", null);
        setField(term893563, term893563.getClass(), "parent", null);
        setField(term893561, term893561.getClass(), "first", term893563);
        setField(term893561, term893561.getClass(), "last", null);
        setField(term893561, term893561.getClass(), "propListHead", null);
        setIntField(term893561, term893561.getClass(), "sourcePosition", 0);
        setField(term893561, term893561.getClass(), "jsType", null);
        setField(term893561, term893561.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term892830;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term892738, args);
        assertTrue(recursiveEquals(term892738, term893609));
        assertTrue(recursiveEquals(term892830, term893610));
        assertTrue(recursiveEquals(retValue, term893561));
    }

};


