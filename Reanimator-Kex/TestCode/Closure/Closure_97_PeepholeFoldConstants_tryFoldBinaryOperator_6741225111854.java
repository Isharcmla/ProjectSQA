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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714390;
     Object term714480;
     Object term714801;
     Object term714802;
     Object term714733;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714390 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term714480 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714570 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714660 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term714570, term714570.getClass(), "next", term714660);
        setIntField(term714570, term714570.getClass(), "type", 39);
        setField(term714480, term714480.getClass(), "first", term714570);
        setIntField(term714480, term714480.getClass(), "type", 11);
        term714801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term714801, term714801.getClass(), "currentTraversal", null);
        term714802 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714803 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714804 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term714802, term714802.getClass(), "encodedSourceStart", 0);
        setIntField(term714802, term714802.getClass(), "encodedSourceEnd", 0);
        setField(term714802, term714802.getClass(), "sourceName", null);
        setIntField(term714802, term714802.getClass(), "baseLineno", 0);
        setIntField(term714802, term714802.getClass(), "endLineno", 0);
        setField(term714802, term714802.getClass(), "functions", null);
        setField(term714802, term714802.getClass(), "regexps", null);
        setField(term714802, term714802.getClass(), "itsVariables", null);
        setField(term714802, term714802.getClass(), "itsConst", null);
        setField(term714802, term714802.getClass(), "itsVariableNames", null);
        setIntField(term714802, term714802.getClass(), "varStart", 0);
        setField(term714802, term714802.getClass(), "compilerData", null);
        setIntField(term714802, term714802.getClass(), "type", 11);
        setField(term714802, term714802.getClass(), "next", null);
        setIntField(term714803, term714803.getClass(), "encodedSourceStart", 0);
        setIntField(term714803, term714803.getClass(), "encodedSourceEnd", 0);
        setField(term714803, term714803.getClass(), "sourceName", null);
        setIntField(term714803, term714803.getClass(), "baseLineno", 0);
        setIntField(term714803, term714803.getClass(), "endLineno", 0);
        setField(term714803, term714803.getClass(), "functions", null);
        setField(term714803, term714803.getClass(), "regexps", null);
        setField(term714803, term714803.getClass(), "itsVariables", null);
        setField(term714803, term714803.getClass(), "itsConst", null);
        setField(term714803, term714803.getClass(), "itsVariableNames", null);
        setIntField(term714803, term714803.getClass(), "varStart", 0);
        setField(term714803, term714803.getClass(), "compilerData", null);
        setIntField(term714803, term714803.getClass(), "type", 39);
        setIntField(term714804, term714804.getClass(), "encodedSourceStart", 0);
        setIntField(term714804, term714804.getClass(), "encodedSourceEnd", 0);
        setField(term714804, term714804.getClass(), "sourceName", null);
        setIntField(term714804, term714804.getClass(), "baseLineno", 0);
        setIntField(term714804, term714804.getClass(), "endLineno", 0);
        setField(term714804, term714804.getClass(), "functions", null);
        setField(term714804, term714804.getClass(), "regexps", null);
        setField(term714804, term714804.getClass(), "itsVariables", null);
        setField(term714804, term714804.getClass(), "itsConst", null);
        setField(term714804, term714804.getClass(), "itsVariableNames", null);
        setIntField(term714804, term714804.getClass(), "varStart", 0);
        setField(term714804, term714804.getClass(), "compilerData", null);
        setIntField(term714804, term714804.getClass(), "type", 0);
        setField(term714804, term714804.getClass(), "next", null);
        setField(term714804, term714804.getClass(), "first", null);
        setField(term714804, term714804.getClass(), "last", null);
        setField(term714804, term714804.getClass(), "propListHead", null);
        setIntField(term714804, term714804.getClass(), "sourcePosition", 0);
        setField(term714804, term714804.getClass(), "jsType", null);
        setField(term714804, term714804.getClass(), "parent", null);
        setField(term714803, term714803.getClass(), "next", term714804);
        setField(term714803, term714803.getClass(), "first", null);
        setField(term714803, term714803.getClass(), "last", null);
        setField(term714803, term714803.getClass(), "propListHead", null);
        setIntField(term714803, term714803.getClass(), "sourcePosition", 0);
        setField(term714803, term714803.getClass(), "jsType", null);
        setField(term714803, term714803.getClass(), "parent", null);
        setField(term714802, term714802.getClass(), "first", term714803);
        setField(term714802, term714802.getClass(), "last", null);
        setField(term714802, term714802.getClass(), "propListHead", null);
        setIntField(term714802, term714802.getClass(), "sourcePosition", 0);
        setField(term714802, term714802.getClass(), "jsType", null);
        setField(term714802, term714802.getClass(), "parent", null);
        term714733 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714740 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term714747 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term714733, term714733.getClass(), "encodedSourceStart", 0);
        setIntField(term714733, term714733.getClass(), "encodedSourceEnd", 0);
        setField(term714733, term714733.getClass(), "sourceName", null);
        setIntField(term714733, term714733.getClass(), "baseLineno", 0);
        setIntField(term714733, term714733.getClass(), "endLineno", 0);
        setField(term714733, term714733.getClass(), "functions", null);
        setField(term714733, term714733.getClass(), "regexps", null);
        setField(term714733, term714733.getClass(), "itsVariables", null);
        setField(term714733, term714733.getClass(), "itsConst", null);
        setField(term714733, term714733.getClass(), "itsVariableNames", null);
        setIntField(term714733, term714733.getClass(), "varStart", 0);
        setField(term714733, term714733.getClass(), "compilerData", null);
        setIntField(term714733, term714733.getClass(), "type", 11);
        setField(term714733, term714733.getClass(), "next", null);
        setIntField(term714740, term714740.getClass(), "encodedSourceStart", 0);
        setIntField(term714740, term714740.getClass(), "encodedSourceEnd", 0);
        setField(term714740, term714740.getClass(), "sourceName", null);
        setIntField(term714740, term714740.getClass(), "baseLineno", 0);
        setIntField(term714740, term714740.getClass(), "endLineno", 0);
        setField(term714740, term714740.getClass(), "functions", null);
        setField(term714740, term714740.getClass(), "regexps", null);
        setField(term714740, term714740.getClass(), "itsVariables", null);
        setField(term714740, term714740.getClass(), "itsConst", null);
        setField(term714740, term714740.getClass(), "itsVariableNames", null);
        setIntField(term714740, term714740.getClass(), "varStart", 0);
        setField(term714740, term714740.getClass(), "compilerData", null);
        setIntField(term714740, term714740.getClass(), "type", 39);
        setIntField(term714747, term714747.getClass(), "encodedSourceStart", 0);
        setIntField(term714747, term714747.getClass(), "encodedSourceEnd", 0);
        setField(term714747, term714747.getClass(), "sourceName", null);
        setIntField(term714747, term714747.getClass(), "baseLineno", 0);
        setIntField(term714747, term714747.getClass(), "endLineno", 0);
        setField(term714747, term714747.getClass(), "functions", null);
        setField(term714747, term714747.getClass(), "regexps", null);
        setField(term714747, term714747.getClass(), "itsVariables", null);
        setField(term714747, term714747.getClass(), "itsConst", null);
        setField(term714747, term714747.getClass(), "itsVariableNames", null);
        setIntField(term714747, term714747.getClass(), "varStart", 0);
        setField(term714747, term714747.getClass(), "compilerData", null);
        setIntField(term714747, term714747.getClass(), "type", 0);
        setField(term714747, term714747.getClass(), "next", null);
        setField(term714747, term714747.getClass(), "first", null);
        setField(term714747, term714747.getClass(), "last", null);
        setField(term714747, term714747.getClass(), "propListHead", null);
        setIntField(term714747, term714747.getClass(), "sourcePosition", 0);
        setField(term714747, term714747.getClass(), "jsType", null);
        setField(term714747, term714747.getClass(), "parent", null);
        setField(term714740, term714740.getClass(), "next", term714747);
        setField(term714740, term714740.getClass(), "first", null);
        setField(term714740, term714740.getClass(), "last", null);
        setField(term714740, term714740.getClass(), "propListHead", null);
        setIntField(term714740, term714740.getClass(), "sourcePosition", 0);
        setField(term714740, term714740.getClass(), "jsType", null);
        setField(term714740, term714740.getClass(), "parent", null);
        setField(term714733, term714733.getClass(), "first", term714740);
        setField(term714733, term714733.getClass(), "last", null);
        setField(term714733, term714733.getClass(), "propListHead", null);
        setIntField(term714733, term714733.getClass(), "sourcePosition", 0);
        setField(term714733, term714733.getClass(), "jsType", null);
        setField(term714733, term714733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term714480;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term714390, args);
        assertTrue(recursiveEquals(term714390, term714801));
        assertTrue(recursiveEquals(term714480, term714802));
        assertTrue(recursiveEquals(retValue, term714733));
    }

};


