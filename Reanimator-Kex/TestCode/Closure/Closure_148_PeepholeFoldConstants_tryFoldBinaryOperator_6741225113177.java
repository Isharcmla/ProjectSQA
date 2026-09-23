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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942672;
     Object term942764;
     Object term943611;
     Object term943612;
     Object term943539;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942672 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term942764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term942854 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term942946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term942946, term942946.getClass(), "type", 64);
        setField(term942854, term942854.getClass(), "next", term942946);
        setIntField(term942854, term942854.getClass(), "type", 0);
        setField(term942764, term942764.getClass(), "first", term942854);
        setIntField(term942764, term942764.getClass(), "type", 101);
        setField(term942764, term942764.getClass(), "parent", term942946);
        term943611 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term943611, term943611.getClass(), "currentTraversal", null);
        term943612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term943613 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term943614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term943612, term943612.getClass(), "str", null);
        setIntField(term943612, term943612.getClass(), "type", 101);
        setField(term943612, term943612.getClass(), "next", null);
        setIntField(term943613, term943613.getClass(), "encodedSourceStart", 0);
        setIntField(term943613, term943613.getClass(), "encodedSourceEnd", 0);
        setField(term943613, term943613.getClass(), "sourceName", null);
        setIntField(term943613, term943613.getClass(), "baseLineno", 0);
        setIntField(term943613, term943613.getClass(), "endLineno", 0);
        setField(term943613, term943613.getClass(), "functions", null);
        setField(term943613, term943613.getClass(), "regexps", null);
        setField(term943613, term943613.getClass(), "itsVariables", null);
        setField(term943613, term943613.getClass(), "itsConst", null);
        setField(term943613, term943613.getClass(), "itsVariableNames", null);
        setIntField(term943613, term943613.getClass(), "varStart", 0);
        setField(term943613, term943613.getClass(), "compilerData", null);
        setIntField(term943613, term943613.getClass(), "type", 0);
        setField(term943614, term943614.getClass(), "str", null);
        setIntField(term943614, term943614.getClass(), "type", 64);
        setField(term943614, term943614.getClass(), "next", null);
        setField(term943614, term943614.getClass(), "first", null);
        setField(term943614, term943614.getClass(), "last", null);
        setField(term943614, term943614.getClass(), "propListHead", null);
        setIntField(term943614, term943614.getClass(), "sourcePosition", 0);
        setField(term943614, term943614.getClass(), "jsType", null);
        setField(term943614, term943614.getClass(), "parent", null);
        setField(term943613, term943613.getClass(), "next", term943614);
        setField(term943613, term943613.getClass(), "first", null);
        setField(term943613, term943613.getClass(), "last", null);
        setField(term943613, term943613.getClass(), "propListHead", null);
        setIntField(term943613, term943613.getClass(), "sourcePosition", 0);
        setField(term943613, term943613.getClass(), "jsType", null);
        setField(term943613, term943613.getClass(), "parent", null);
        setField(term943612, term943612.getClass(), "first", term943613);
        setField(term943612, term943612.getClass(), "last", null);
        setField(term943612, term943612.getClass(), "propListHead", null);
        setIntField(term943612, term943612.getClass(), "sourcePosition", 0);
        setField(term943612, term943612.getClass(), "jsType", null);
        setField(term943612, term943612.getClass(), "parent", term943614);
        term943539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term943541 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term943548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term943539, term943539.getClass(), "str", null);
        setIntField(term943539, term943539.getClass(), "type", 101);
        setField(term943539, term943539.getClass(), "next", null);
        setIntField(term943541, term943541.getClass(), "encodedSourceStart", 0);
        setIntField(term943541, term943541.getClass(), "encodedSourceEnd", 0);
        setField(term943541, term943541.getClass(), "sourceName", null);
        setIntField(term943541, term943541.getClass(), "baseLineno", 0);
        setIntField(term943541, term943541.getClass(), "endLineno", 0);
        setField(term943541, term943541.getClass(), "functions", null);
        setField(term943541, term943541.getClass(), "regexps", null);
        setField(term943541, term943541.getClass(), "itsVariables", null);
        setField(term943541, term943541.getClass(), "itsConst", null);
        setField(term943541, term943541.getClass(), "itsVariableNames", null);
        setIntField(term943541, term943541.getClass(), "varStart", 0);
        setField(term943541, term943541.getClass(), "compilerData", null);
        setIntField(term943541, term943541.getClass(), "type", 0);
        setField(term943548, term943548.getClass(), "str", null);
        setIntField(term943548, term943548.getClass(), "type", 64);
        setField(term943548, term943548.getClass(), "next", null);
        setField(term943548, term943548.getClass(), "first", null);
        setField(term943548, term943548.getClass(), "last", null);
        setField(term943548, term943548.getClass(), "propListHead", null);
        setIntField(term943548, term943548.getClass(), "sourcePosition", 0);
        setField(term943548, term943548.getClass(), "jsType", null);
        setField(term943548, term943548.getClass(), "parent", null);
        setField(term943541, term943541.getClass(), "next", term943548);
        setField(term943541, term943541.getClass(), "first", null);
        setField(term943541, term943541.getClass(), "last", null);
        setField(term943541, term943541.getClass(), "propListHead", null);
        setIntField(term943541, term943541.getClass(), "sourcePosition", 0);
        setField(term943541, term943541.getClass(), "jsType", null);
        setField(term943541, term943541.getClass(), "parent", null);
        setField(term943539, term943539.getClass(), "first", term943541);
        setField(term943539, term943539.getClass(), "last", null);
        setField(term943539, term943539.getClass(), "propListHead", null);
        setIntField(term943539, term943539.getClass(), "sourcePosition", 0);
        setField(term943539, term943539.getClass(), "jsType", null);
        setField(term943539, term943539.getClass(), "parent", term943548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term942764;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term942672, args);
        assertTrue(recursiveEquals(term942672, term943611));
        assertTrue(recursiveEquals(term942764, term943612));
        assertTrue(recursiveEquals(retValue, term943539));
    }

};


