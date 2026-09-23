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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710101;
     Object term710193;
     Object term710843;
     Object term710844;
     Object term710781;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term710193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term710279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term710349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term710349, term710349.getClass(), "type", 42);
        setField(term710279, term710279.getClass(), "next", term710349);
        setIntField(term710279, term710279.getClass(), "type", 42);
        setField(term710193, term710193.getClass(), "first", term710279);
        setIntField(term710193, term710193.getClass(), "type", 14);
        term710843 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term710843, term710843.getClass(), "currentTraversal", null);
        term710844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term710845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term710846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term710844, term710844.getClass(), "str", null);
        setIntField(term710844, term710844.getClass(), "type", 14);
        setField(term710844, term710844.getClass(), "next", null);
        setField(term710845, term710845.getClass(), "functionName", null);
        setBooleanField(term710845, term710845.getClass(), "itsNeedsActivation", false);
        setIntField(term710845, term710845.getClass(), "itsFunctionType", 0);
        setBooleanField(term710845, term710845.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term710845, term710845.getClass(), "encodedSourceStart", 0);
        setIntField(term710845, term710845.getClass(), "encodedSourceEnd", 0);
        setField(term710845, term710845.getClass(), "sourceName", null);
        setIntField(term710845, term710845.getClass(), "baseLineno", 0);
        setIntField(term710845, term710845.getClass(), "endLineno", 0);
        setField(term710845, term710845.getClass(), "functions", null);
        setField(term710845, term710845.getClass(), "regexps", null);
        setField(term710845, term710845.getClass(), "itsVariables", null);
        setField(term710845, term710845.getClass(), "itsConst", null);
        setField(term710845, term710845.getClass(), "itsVariableNames", null);
        setIntField(term710845, term710845.getClass(), "varStart", 0);
        setField(term710845, term710845.getClass(), "compilerData", null);
        setIntField(term710845, term710845.getClass(), "type", 42);
        setIntField(term710846, term710846.getClass(), "type", 42);
        setField(term710846, term710846.getClass(), "next", null);
        setField(term710846, term710846.getClass(), "first", null);
        setField(term710846, term710846.getClass(), "last", null);
        setField(term710846, term710846.getClass(), "propListHead", null);
        setIntField(term710846, term710846.getClass(), "sourcePosition", 0);
        setField(term710846, term710846.getClass(), "jsType", null);
        setField(term710846, term710846.getClass(), "parent", null);
        setField(term710845, term710845.getClass(), "next", term710846);
        setField(term710845, term710845.getClass(), "first", null);
        setField(term710845, term710845.getClass(), "last", null);
        setField(term710845, term710845.getClass(), "propListHead", null);
        setIntField(term710845, term710845.getClass(), "sourcePosition", 0);
        setField(term710845, term710845.getClass(), "jsType", null);
        setField(term710845, term710845.getClass(), "parent", null);
        setField(term710844, term710844.getClass(), "first", term710845);
        setField(term710844, term710844.getClass(), "last", null);
        setField(term710844, term710844.getClass(), "propListHead", null);
        setIntField(term710844, term710844.getClass(), "sourcePosition", 0);
        setField(term710844, term710844.getClass(), "jsType", null);
        setField(term710844, term710844.getClass(), "parent", null);
        term710781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term710783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term710793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term710781, term710781.getClass(), "str", null);
        setIntField(term710781, term710781.getClass(), "type", 14);
        setField(term710781, term710781.getClass(), "next", null);
        setField(term710783, term710783.getClass(), "functionName", null);
        setBooleanField(term710783, term710783.getClass(), "itsNeedsActivation", false);
        setIntField(term710783, term710783.getClass(), "itsFunctionType", 0);
        setBooleanField(term710783, term710783.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term710783, term710783.getClass(), "encodedSourceStart", 0);
        setIntField(term710783, term710783.getClass(), "encodedSourceEnd", 0);
        setField(term710783, term710783.getClass(), "sourceName", null);
        setIntField(term710783, term710783.getClass(), "baseLineno", 0);
        setIntField(term710783, term710783.getClass(), "endLineno", 0);
        setField(term710783, term710783.getClass(), "functions", null);
        setField(term710783, term710783.getClass(), "regexps", null);
        setField(term710783, term710783.getClass(), "itsVariables", null);
        setField(term710783, term710783.getClass(), "itsConst", null);
        setField(term710783, term710783.getClass(), "itsVariableNames", null);
        setIntField(term710783, term710783.getClass(), "varStart", 0);
        setField(term710783, term710783.getClass(), "compilerData", null);
        setIntField(term710783, term710783.getClass(), "type", 42);
        setIntField(term710793, term710793.getClass(), "type", 42);
        setField(term710793, term710793.getClass(), "next", null);
        setField(term710793, term710793.getClass(), "first", null);
        setField(term710793, term710793.getClass(), "last", null);
        setField(term710793, term710793.getClass(), "propListHead", null);
        setIntField(term710793, term710793.getClass(), "sourcePosition", 0);
        setField(term710793, term710793.getClass(), "jsType", null);
        setField(term710793, term710793.getClass(), "parent", null);
        setField(term710783, term710783.getClass(), "next", term710793);
        setField(term710783, term710783.getClass(), "first", null);
        setField(term710783, term710783.getClass(), "last", null);
        setField(term710783, term710783.getClass(), "propListHead", null);
        setIntField(term710783, term710783.getClass(), "sourcePosition", 0);
        setField(term710783, term710783.getClass(), "jsType", null);
        setField(term710783, term710783.getClass(), "parent", null);
        setField(term710781, term710781.getClass(), "first", term710783);
        setField(term710781, term710781.getClass(), "last", null);
        setField(term710781, term710781.getClass(), "propListHead", null);
        setIntField(term710781, term710781.getClass(), "sourcePosition", 0);
        setField(term710781, term710781.getClass(), "jsType", null);
        setField(term710781, term710781.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term710193;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term710101, args);
        assertTrue(recursiveEquals(term710101, term710843));
        assertTrue(recursiveEquals(term710193, term710844));
        assertTrue(recursiveEquals(retValue, term710781));
    }

};


