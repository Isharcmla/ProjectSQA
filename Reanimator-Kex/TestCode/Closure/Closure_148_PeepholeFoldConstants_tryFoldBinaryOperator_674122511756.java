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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170351;
     Object term170443;
     Object term170685;
     Object term170686;
     Object term170637;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term170443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170625 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term170535, term170535.getClass(), "next", term170625);
        setIntField(term170535, term170535.getClass(), "type", 39);
        setField(term170443, term170443.getClass(), "first", term170535);
        setIntField(term170443, term170443.getClass(), "type", 11);
        term170685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term170685, term170685.getClass(), "currentTraversal", null);
        term170686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170688 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term170686, term170686.getClass(), "str", null);
        setIntField(term170686, term170686.getClass(), "type", 11);
        setField(term170686, term170686.getClass(), "next", null);
        setField(term170687, term170687.getClass(), "str", null);
        setIntField(term170687, term170687.getClass(), "type", 39);
        setIntField(term170688, term170688.getClass(), "encodedSourceStart", 0);
        setIntField(term170688, term170688.getClass(), "encodedSourceEnd", 0);
        setField(term170688, term170688.getClass(), "sourceName", null);
        setIntField(term170688, term170688.getClass(), "baseLineno", 0);
        setIntField(term170688, term170688.getClass(), "endLineno", 0);
        setField(term170688, term170688.getClass(), "functions", null);
        setField(term170688, term170688.getClass(), "regexps", null);
        setField(term170688, term170688.getClass(), "itsVariables", null);
        setField(term170688, term170688.getClass(), "itsConst", null);
        setField(term170688, term170688.getClass(), "itsVariableNames", null);
        setIntField(term170688, term170688.getClass(), "varStart", 0);
        setField(term170688, term170688.getClass(), "compilerData", null);
        setIntField(term170688, term170688.getClass(), "type", 0);
        setField(term170688, term170688.getClass(), "next", null);
        setField(term170688, term170688.getClass(), "first", null);
        setField(term170688, term170688.getClass(), "last", null);
        setField(term170688, term170688.getClass(), "propListHead", null);
        setIntField(term170688, term170688.getClass(), "sourcePosition", 0);
        setField(term170688, term170688.getClass(), "jsType", null);
        setField(term170688, term170688.getClass(), "parent", null);
        setField(term170687, term170687.getClass(), "next", term170688);
        setField(term170687, term170687.getClass(), "first", null);
        setField(term170687, term170687.getClass(), "last", null);
        setField(term170687, term170687.getClass(), "propListHead", null);
        setIntField(term170687, term170687.getClass(), "sourcePosition", 0);
        setField(term170687, term170687.getClass(), "jsType", null);
        setField(term170687, term170687.getClass(), "parent", null);
        setField(term170686, term170686.getClass(), "first", term170687);
        setField(term170686, term170686.getClass(), "last", null);
        setField(term170686, term170686.getClass(), "propListHead", null);
        setIntField(term170686, term170686.getClass(), "sourcePosition", 0);
        setField(term170686, term170686.getClass(), "jsType", null);
        setField(term170686, term170686.getClass(), "parent", null);
        term170637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170639 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170641 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term170637, term170637.getClass(), "str", null);
        setIntField(term170637, term170637.getClass(), "type", 11);
        setField(term170637, term170637.getClass(), "next", null);
        setField(term170639, term170639.getClass(), "str", null);
        setIntField(term170639, term170639.getClass(), "type", 39);
        setIntField(term170641, term170641.getClass(), "encodedSourceStart", 0);
        setIntField(term170641, term170641.getClass(), "encodedSourceEnd", 0);
        setField(term170641, term170641.getClass(), "sourceName", null);
        setIntField(term170641, term170641.getClass(), "baseLineno", 0);
        setIntField(term170641, term170641.getClass(), "endLineno", 0);
        setField(term170641, term170641.getClass(), "functions", null);
        setField(term170641, term170641.getClass(), "regexps", null);
        setField(term170641, term170641.getClass(), "itsVariables", null);
        setField(term170641, term170641.getClass(), "itsConst", null);
        setField(term170641, term170641.getClass(), "itsVariableNames", null);
        setIntField(term170641, term170641.getClass(), "varStart", 0);
        setField(term170641, term170641.getClass(), "compilerData", null);
        setIntField(term170641, term170641.getClass(), "type", 0);
        setField(term170641, term170641.getClass(), "next", null);
        setField(term170641, term170641.getClass(), "first", null);
        setField(term170641, term170641.getClass(), "last", null);
        setField(term170641, term170641.getClass(), "propListHead", null);
        setIntField(term170641, term170641.getClass(), "sourcePosition", 0);
        setField(term170641, term170641.getClass(), "jsType", null);
        setField(term170641, term170641.getClass(), "parent", null);
        setField(term170639, term170639.getClass(), "next", term170641);
        setField(term170639, term170639.getClass(), "first", null);
        setField(term170639, term170639.getClass(), "last", null);
        setField(term170639, term170639.getClass(), "propListHead", null);
        setIntField(term170639, term170639.getClass(), "sourcePosition", 0);
        setField(term170639, term170639.getClass(), "jsType", null);
        setField(term170639, term170639.getClass(), "parent", null);
        setField(term170637, term170637.getClass(), "first", term170639);
        setField(term170637, term170637.getClass(), "last", null);
        setField(term170637, term170637.getClass(), "propListHead", null);
        setIntField(term170637, term170637.getClass(), "sourcePosition", 0);
        setField(term170637, term170637.getClass(), "jsType", null);
        setField(term170637, term170637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term170443;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term170351, args);
        assertTrue(recursiveEquals(term170351, term170685));
        assertTrue(recursiveEquals(term170443, term170686));
        assertTrue(recursiveEquals(retValue, term170637));
    }

};


