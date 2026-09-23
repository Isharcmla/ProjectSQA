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

public class PeepholeFoldConstants_optimizeSubtree_16065069931800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700085;
     Object term700177;
     Object term700513;
     Object term700514;
     Object term700440;

    public PeepholeFoldConstants_optimizeSubtree_16065069931800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term700177 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700359 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term700177, term700177.getClass(), "type", 35);
        setField(term700269, term700269.getClass(), "next", term700359);
        setIntField(term700269, term700269.getClass(), "type", 63);
        setField(term700177, term700177.getClass(), "first", term700269);
        term700513 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term700513, term700513.getClass(), "currentTraversal", null);
        term700514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700516 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term700514, term700514.getClass(), "str", null);
        setIntField(term700514, term700514.getClass(), "type", 35);
        setField(term700514, term700514.getClass(), "next", null);
        setField(term700515, term700515.getClass(), "str", null);
        setIntField(term700515, term700515.getClass(), "type", 63);
        setIntField(term700516, term700516.getClass(), "encodedSourceStart", 0);
        setIntField(term700516, term700516.getClass(), "encodedSourceEnd", 0);
        setField(term700516, term700516.getClass(), "sourceName", null);
        setIntField(term700516, term700516.getClass(), "baseLineno", 0);
        setIntField(term700516, term700516.getClass(), "endLineno", 0);
        setField(term700516, term700516.getClass(), "functions", null);
        setField(term700516, term700516.getClass(), "regexps", null);
        setField(term700516, term700516.getClass(), "itsVariables", null);
        setField(term700516, term700516.getClass(), "itsConst", null);
        setField(term700516, term700516.getClass(), "itsVariableNames", null);
        setIntField(term700516, term700516.getClass(), "varStart", 0);
        setField(term700516, term700516.getClass(), "compilerData", null);
        setIntField(term700516, term700516.getClass(), "type", 0);
        setField(term700516, term700516.getClass(), "next", null);
        setField(term700516, term700516.getClass(), "first", null);
        setField(term700516, term700516.getClass(), "last", null);
        setField(term700516, term700516.getClass(), "propListHead", null);
        setIntField(term700516, term700516.getClass(), "sourcePosition", 0);
        setField(term700516, term700516.getClass(), "jsType", null);
        setField(term700516, term700516.getClass(), "parent", null);
        setField(term700515, term700515.getClass(), "next", term700516);
        setField(term700515, term700515.getClass(), "first", null);
        setField(term700515, term700515.getClass(), "last", null);
        setField(term700515, term700515.getClass(), "propListHead", null);
        setIntField(term700515, term700515.getClass(), "sourcePosition", 0);
        setField(term700515, term700515.getClass(), "jsType", null);
        setField(term700515, term700515.getClass(), "parent", null);
        setField(term700514, term700514.getClass(), "first", term700515);
        setField(term700514, term700514.getClass(), "last", null);
        setField(term700514, term700514.getClass(), "propListHead", null);
        setIntField(term700514, term700514.getClass(), "sourcePosition", 0);
        setField(term700514, term700514.getClass(), "jsType", null);
        setField(term700514, term700514.getClass(), "parent", null);
        term700440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700444 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term700440, term700440.getClass(), "str", null);
        setIntField(term700440, term700440.getClass(), "type", 35);
        setField(term700440, term700440.getClass(), "next", null);
        setField(term700442, term700442.getClass(), "str", null);
        setIntField(term700442, term700442.getClass(), "type", 63);
        setIntField(term700444, term700444.getClass(), "encodedSourceStart", 0);
        setIntField(term700444, term700444.getClass(), "encodedSourceEnd", 0);
        setField(term700444, term700444.getClass(), "sourceName", null);
        setIntField(term700444, term700444.getClass(), "baseLineno", 0);
        setIntField(term700444, term700444.getClass(), "endLineno", 0);
        setField(term700444, term700444.getClass(), "functions", null);
        setField(term700444, term700444.getClass(), "regexps", null);
        setField(term700444, term700444.getClass(), "itsVariables", null);
        setField(term700444, term700444.getClass(), "itsConst", null);
        setField(term700444, term700444.getClass(), "itsVariableNames", null);
        setIntField(term700444, term700444.getClass(), "varStart", 0);
        setField(term700444, term700444.getClass(), "compilerData", null);
        setIntField(term700444, term700444.getClass(), "type", 0);
        setField(term700444, term700444.getClass(), "next", null);
        setField(term700444, term700444.getClass(), "first", null);
        setField(term700444, term700444.getClass(), "last", null);
        setField(term700444, term700444.getClass(), "propListHead", null);
        setIntField(term700444, term700444.getClass(), "sourcePosition", 0);
        setField(term700444, term700444.getClass(), "jsType", null);
        setField(term700444, term700444.getClass(), "parent", null);
        setField(term700442, term700442.getClass(), "next", term700444);
        setField(term700442, term700442.getClass(), "first", null);
        setField(term700442, term700442.getClass(), "last", null);
        setField(term700442, term700442.getClass(), "propListHead", null);
        setIntField(term700442, term700442.getClass(), "sourcePosition", 0);
        setField(term700442, term700442.getClass(), "jsType", null);
        setField(term700442, term700442.getClass(), "parent", null);
        setField(term700440, term700440.getClass(), "first", term700442);
        setField(term700440, term700440.getClass(), "last", null);
        setField(term700440, term700440.getClass(), "propListHead", null);
        setIntField(term700440, term700440.getClass(), "sourcePosition", 0);
        setField(term700440, term700440.getClass(), "jsType", null);
        setField(term700440, term700440.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term700177;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term700085, args);
        assertTrue(recursiveEquals(term700085, term700513));
        assertTrue(recursiveEquals(term700177, term700514));
        assertTrue(recursiveEquals(retValue, term700440));
    }

};


