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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577653;
     Object term577739;
     Object term577895;
     Object term577981;
     Object term578632;
     Object term578633;
     Object term578635;
     Object term578636;
     Object term578541;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term577739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term577809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term577809, term577809.getClass(), "type", 108);
        setField(term577739, term577739.getClass(), "parent", term577809);
        setIntField(term577739, term577739.getClass(), "type", 0);
        term577895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term577895, term577895.getClass(), "type", 104);
        term577981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term577981, term577981.getClass(), "type", 63);
        term578632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term578632, term578632.getClass(), "currentTraversal", null);
        term578633 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term578634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term578633, term578633.getClass(), "functionName", null);
        setBooleanField(term578633, term578633.getClass(), "itsNeedsActivation", false);
        setIntField(term578633, term578633.getClass(), "itsFunctionType", 0);
        setBooleanField(term578633, term578633.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578633, term578633.getClass(), "encodedSourceStart", 0);
        setIntField(term578633, term578633.getClass(), "encodedSourceEnd", 0);
        setField(term578633, term578633.getClass(), "sourceName", null);
        setIntField(term578633, term578633.getClass(), "baseLineno", 0);
        setIntField(term578633, term578633.getClass(), "endLineno", 0);
        setField(term578633, term578633.getClass(), "functions", null);
        setField(term578633, term578633.getClass(), "regexps", null);
        setField(term578633, term578633.getClass(), "itsVariables", null);
        setField(term578633, term578633.getClass(), "itsConst", null);
        setField(term578633, term578633.getClass(), "itsVariableNames", null);
        setIntField(term578633, term578633.getClass(), "varStart", 0);
        setField(term578633, term578633.getClass(), "compilerData", null);
        setIntField(term578633, term578633.getClass(), "type", 0);
        setField(term578633, term578633.getClass(), "next", null);
        setField(term578633, term578633.getClass(), "first", null);
        setField(term578633, term578633.getClass(), "last", null);
        setField(term578633, term578633.getClass(), "propListHead", null);
        setIntField(term578633, term578633.getClass(), "sourcePosition", 0);
        setField(term578633, term578633.getClass(), "jsType", null);
        setIntField(term578634, term578634.getClass(), "type", 108);
        setField(term578634, term578634.getClass(), "next", null);
        setField(term578634, term578634.getClass(), "first", null);
        setField(term578634, term578634.getClass(), "last", null);
        setField(term578634, term578634.getClass(), "propListHead", null);
        setIntField(term578634, term578634.getClass(), "sourcePosition", 0);
        setField(term578634, term578634.getClass(), "jsType", null);
        setField(term578634, term578634.getClass(), "parent", null);
        setField(term578633, term578633.getClass(), "parent", term578634);
        term578635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term578635, term578635.getClass(), "functionName", null);
        setBooleanField(term578635, term578635.getClass(), "itsNeedsActivation", false);
        setIntField(term578635, term578635.getClass(), "itsFunctionType", 0);
        setBooleanField(term578635, term578635.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578635, term578635.getClass(), "encodedSourceStart", 0);
        setIntField(term578635, term578635.getClass(), "encodedSourceEnd", 0);
        setField(term578635, term578635.getClass(), "sourceName", null);
        setIntField(term578635, term578635.getClass(), "baseLineno", 0);
        setIntField(term578635, term578635.getClass(), "endLineno", 0);
        setField(term578635, term578635.getClass(), "functions", null);
        setField(term578635, term578635.getClass(), "regexps", null);
        setField(term578635, term578635.getClass(), "itsVariables", null);
        setField(term578635, term578635.getClass(), "itsConst", null);
        setField(term578635, term578635.getClass(), "itsVariableNames", null);
        setIntField(term578635, term578635.getClass(), "varStart", 0);
        setField(term578635, term578635.getClass(), "compilerData", null);
        setIntField(term578635, term578635.getClass(), "type", 104);
        setField(term578635, term578635.getClass(), "next", null);
        setField(term578635, term578635.getClass(), "first", null);
        setField(term578635, term578635.getClass(), "last", null);
        setField(term578635, term578635.getClass(), "propListHead", null);
        setIntField(term578635, term578635.getClass(), "sourcePosition", 0);
        setField(term578635, term578635.getClass(), "jsType", null);
        setField(term578635, term578635.getClass(), "parent", null);
        term578636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term578636, term578636.getClass(), "functionName", null);
        setBooleanField(term578636, term578636.getClass(), "itsNeedsActivation", false);
        setIntField(term578636, term578636.getClass(), "itsFunctionType", 0);
        setBooleanField(term578636, term578636.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578636, term578636.getClass(), "encodedSourceStart", 0);
        setIntField(term578636, term578636.getClass(), "encodedSourceEnd", 0);
        setField(term578636, term578636.getClass(), "sourceName", null);
        setIntField(term578636, term578636.getClass(), "baseLineno", 0);
        setIntField(term578636, term578636.getClass(), "endLineno", 0);
        setField(term578636, term578636.getClass(), "functions", null);
        setField(term578636, term578636.getClass(), "regexps", null);
        setField(term578636, term578636.getClass(), "itsVariables", null);
        setField(term578636, term578636.getClass(), "itsConst", null);
        setField(term578636, term578636.getClass(), "itsVariableNames", null);
        setIntField(term578636, term578636.getClass(), "varStart", 0);
        setField(term578636, term578636.getClass(), "compilerData", null);
        setIntField(term578636, term578636.getClass(), "type", 63);
        setField(term578636, term578636.getClass(), "next", null);
        setField(term578636, term578636.getClass(), "first", null);
        setField(term578636, term578636.getClass(), "last", null);
        setField(term578636, term578636.getClass(), "propListHead", null);
        setIntField(term578636, term578636.getClass(), "sourcePosition", 0);
        setField(term578636, term578636.getClass(), "jsType", null);
        setField(term578636, term578636.getClass(), "parent", null);
        term578541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term578552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term578541, term578541.getClass(), "functionName", null);
        setBooleanField(term578541, term578541.getClass(), "itsNeedsActivation", false);
        setIntField(term578541, term578541.getClass(), "itsFunctionType", 0);
        setBooleanField(term578541, term578541.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578541, term578541.getClass(), "encodedSourceStart", 0);
        setIntField(term578541, term578541.getClass(), "encodedSourceEnd", 0);
        setField(term578541, term578541.getClass(), "sourceName", null);
        setIntField(term578541, term578541.getClass(), "baseLineno", 0);
        setIntField(term578541, term578541.getClass(), "endLineno", 0);
        setField(term578541, term578541.getClass(), "functions", null);
        setField(term578541, term578541.getClass(), "regexps", null);
        setField(term578541, term578541.getClass(), "itsVariables", null);
        setField(term578541, term578541.getClass(), "itsConst", null);
        setField(term578541, term578541.getClass(), "itsVariableNames", null);
        setIntField(term578541, term578541.getClass(), "varStart", 0);
        setField(term578541, term578541.getClass(), "compilerData", null);
        setIntField(term578541, term578541.getClass(), "type", 0);
        setField(term578541, term578541.getClass(), "next", null);
        setField(term578541, term578541.getClass(), "first", null);
        setField(term578541, term578541.getClass(), "last", null);
        setField(term578541, term578541.getClass(), "propListHead", null);
        setIntField(term578541, term578541.getClass(), "sourcePosition", 0);
        setField(term578541, term578541.getClass(), "jsType", null);
        setIntField(term578552, term578552.getClass(), "type", 108);
        setField(term578552, term578552.getClass(), "next", null);
        setField(term578552, term578552.getClass(), "first", null);
        setField(term578552, term578552.getClass(), "last", null);
        setField(term578552, term578552.getClass(), "propListHead", null);
        setIntField(term578552, term578552.getClass(), "sourcePosition", 0);
        setField(term578552, term578552.getClass(), "jsType", null);
        setField(term578552, term578552.getClass(), "parent", null);
        setField(term578541, term578541.getClass(), "parent", term578552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term577739;
        args[1] = term577895;
        args[2] = term577981;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term577653, args);
        assertTrue(recursiveEquals(term577653, term578632));
        assertTrue(recursiveEquals(term577739, term578633));
        assertTrue(recursiveEquals(term577895, term578635));
        assertTrue(recursiveEquals(term577981, term578636));
        assertTrue(recursiveEquals(retValue, term578541));
    }

};


