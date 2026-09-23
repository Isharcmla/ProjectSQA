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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295982;
     Object term296074;
     Object term296843;
     Object term296844;
     Object term296784;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295982 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term296074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296256 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term296166, term296166.getClass(), "next", term296256);
        setIntField(term296166, term296166.getClass(), "type", 14);
        setField(term296074, term296074.getClass(), "first", term296166);
        setIntField(term296074, term296074.getClass(), "type", 14);
        term296843 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term296843, term296843.getClass(), "currentTraversal", null);
        term296844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296846 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term296844, term296844.getClass(), "str", null);
        setIntField(term296844, term296844.getClass(), "type", 14);
        setField(term296844, term296844.getClass(), "next", null);
        setField(term296845, term296845.getClass(), "str", null);
        setIntField(term296845, term296845.getClass(), "type", 14);
        setIntField(term296846, term296846.getClass(), "encodedSourceStart", 0);
        setIntField(term296846, term296846.getClass(), "encodedSourceEnd", 0);
        setField(term296846, term296846.getClass(), "sourceName", null);
        setIntField(term296846, term296846.getClass(), "baseLineno", 0);
        setIntField(term296846, term296846.getClass(), "endLineno", 0);
        setField(term296846, term296846.getClass(), "functions", null);
        setField(term296846, term296846.getClass(), "regexps", null);
        setField(term296846, term296846.getClass(), "itsVariables", null);
        setField(term296846, term296846.getClass(), "itsConst", null);
        setField(term296846, term296846.getClass(), "itsVariableNames", null);
        setIntField(term296846, term296846.getClass(), "varStart", 0);
        setField(term296846, term296846.getClass(), "compilerData", null);
        setIntField(term296846, term296846.getClass(), "type", 0);
        setField(term296846, term296846.getClass(), "next", null);
        setField(term296846, term296846.getClass(), "first", null);
        setField(term296846, term296846.getClass(), "last", null);
        setField(term296846, term296846.getClass(), "propListHead", null);
        setIntField(term296846, term296846.getClass(), "sourcePosition", 0);
        setField(term296846, term296846.getClass(), "jsType", null);
        setField(term296846, term296846.getClass(), "parent", null);
        setField(term296845, term296845.getClass(), "next", term296846);
        setField(term296845, term296845.getClass(), "first", null);
        setField(term296845, term296845.getClass(), "last", null);
        setField(term296845, term296845.getClass(), "propListHead", null);
        setIntField(term296845, term296845.getClass(), "sourcePosition", 0);
        setField(term296845, term296845.getClass(), "jsType", null);
        setField(term296845, term296845.getClass(), "parent", null);
        setField(term296844, term296844.getClass(), "first", term296845);
        setField(term296844, term296844.getClass(), "last", null);
        setField(term296844, term296844.getClass(), "propListHead", null);
        setIntField(term296844, term296844.getClass(), "sourcePosition", 0);
        setField(term296844, term296844.getClass(), "jsType", null);
        setField(term296844, term296844.getClass(), "parent", null);
        term296784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296788 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term296784, term296784.getClass(), "str", null);
        setIntField(term296784, term296784.getClass(), "type", 14);
        setField(term296784, term296784.getClass(), "next", null);
        setField(term296786, term296786.getClass(), "str", null);
        setIntField(term296786, term296786.getClass(), "type", 14);
        setIntField(term296788, term296788.getClass(), "encodedSourceStart", 0);
        setIntField(term296788, term296788.getClass(), "encodedSourceEnd", 0);
        setField(term296788, term296788.getClass(), "sourceName", null);
        setIntField(term296788, term296788.getClass(), "baseLineno", 0);
        setIntField(term296788, term296788.getClass(), "endLineno", 0);
        setField(term296788, term296788.getClass(), "functions", null);
        setField(term296788, term296788.getClass(), "regexps", null);
        setField(term296788, term296788.getClass(), "itsVariables", null);
        setField(term296788, term296788.getClass(), "itsConst", null);
        setField(term296788, term296788.getClass(), "itsVariableNames", null);
        setIntField(term296788, term296788.getClass(), "varStart", 0);
        setField(term296788, term296788.getClass(), "compilerData", null);
        setIntField(term296788, term296788.getClass(), "type", 0);
        setField(term296788, term296788.getClass(), "next", null);
        setField(term296788, term296788.getClass(), "first", null);
        setField(term296788, term296788.getClass(), "last", null);
        setField(term296788, term296788.getClass(), "propListHead", null);
        setIntField(term296788, term296788.getClass(), "sourcePosition", 0);
        setField(term296788, term296788.getClass(), "jsType", null);
        setField(term296788, term296788.getClass(), "parent", null);
        setField(term296786, term296786.getClass(), "next", term296788);
        setField(term296786, term296786.getClass(), "first", null);
        setField(term296786, term296786.getClass(), "last", null);
        setField(term296786, term296786.getClass(), "propListHead", null);
        setIntField(term296786, term296786.getClass(), "sourcePosition", 0);
        setField(term296786, term296786.getClass(), "jsType", null);
        setField(term296786, term296786.getClass(), "parent", null);
        setField(term296784, term296784.getClass(), "first", term296786);
        setField(term296784, term296784.getClass(), "last", null);
        setField(term296784, term296784.getClass(), "propListHead", null);
        setIntField(term296784, term296784.getClass(), "sourcePosition", 0);
        setField(term296784, term296784.getClass(), "jsType", null);
        setField(term296784, term296784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term296074;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term295982, args);
        assertTrue(recursiveEquals(term295982, term296843));
        assertTrue(recursiveEquals(term296074, term296844));
        assertTrue(recursiveEquals(retValue, term296784));
    }

};


