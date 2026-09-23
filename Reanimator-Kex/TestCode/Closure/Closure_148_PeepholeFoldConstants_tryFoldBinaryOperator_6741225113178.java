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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943177;
     Object term943269;
     Object term943710;
     Object term943711;
     Object term943632;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term943269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term943359 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term943429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term943429, term943429.getClass(), "type", 63);
        setField(term943359, term943359.getClass(), "next", term943429);
        setIntField(term943359, term943359.getClass(), "type", 0);
        setField(term943269, term943269.getClass(), "first", term943359);
        setIntField(term943269, term943269.getClass(), "type", 101);
        setField(term943269, term943269.getClass(), "parent", term943521);
        term943710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term943710, term943710.getClass(), "currentTraversal", null);
        term943711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term943712 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term943713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term943711, term943711.getClass(), "str", null);
        setIntField(term943711, term943711.getClass(), "type", 101);
        setField(term943711, term943711.getClass(), "next", null);
        setIntField(term943712, term943712.getClass(), "encodedSourceStart", 0);
        setIntField(term943712, term943712.getClass(), "encodedSourceEnd", 0);
        setField(term943712, term943712.getClass(), "sourceName", null);
        setIntField(term943712, term943712.getClass(), "baseLineno", 0);
        setIntField(term943712, term943712.getClass(), "endLineno", 0);
        setField(term943712, term943712.getClass(), "functions", null);
        setField(term943712, term943712.getClass(), "regexps", null);
        setField(term943712, term943712.getClass(), "itsVariables", null);
        setField(term943712, term943712.getClass(), "itsConst", null);
        setField(term943712, term943712.getClass(), "itsVariableNames", null);
        setIntField(term943712, term943712.getClass(), "varStart", 0);
        setField(term943712, term943712.getClass(), "compilerData", null);
        setIntField(term943712, term943712.getClass(), "type", 0);
        setIntField(term943713, term943713.getClass(), "type", 63);
        setField(term943713, term943713.getClass(), "next", null);
        setField(term943713, term943713.getClass(), "first", null);
        setField(term943713, term943713.getClass(), "last", null);
        setField(term943713, term943713.getClass(), "propListHead", null);
        setIntField(term943713, term943713.getClass(), "sourcePosition", 0);
        setField(term943713, term943713.getClass(), "jsType", null);
        setField(term943713, term943713.getClass(), "parent", null);
        setField(term943712, term943712.getClass(), "next", term943713);
        setField(term943712, term943712.getClass(), "first", null);
        setField(term943712, term943712.getClass(), "last", null);
        setField(term943712, term943712.getClass(), "propListHead", null);
        setIntField(term943712, term943712.getClass(), "sourcePosition", 0);
        setField(term943712, term943712.getClass(), "jsType", null);
        setField(term943712, term943712.getClass(), "parent", null);
        setField(term943711, term943711.getClass(), "first", term943712);
        setField(term943711, term943711.getClass(), "last", null);
        setField(term943711, term943711.getClass(), "propListHead", null);
        setIntField(term943711, term943711.getClass(), "sourcePosition", 0);
        setField(term943711, term943711.getClass(), "jsType", null);
        setField(term943714, term943714.getClass(), "str", null);
        setIntField(term943714, term943714.getClass(), "type", 0);
        setField(term943714, term943714.getClass(), "next", null);
        setField(term943714, term943714.getClass(), "first", null);
        setField(term943714, term943714.getClass(), "last", null);
        setField(term943714, term943714.getClass(), "propListHead", null);
        setIntField(term943714, term943714.getClass(), "sourcePosition", 0);
        setField(term943714, term943714.getClass(), "jsType", null);
        setField(term943714, term943714.getClass(), "parent", null);
        setField(term943711, term943711.getClass(), "parent", term943714);
        term943632 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term943634 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term943641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term943632, term943632.getClass(), "str", null);
        setIntField(term943632, term943632.getClass(), "type", 101);
        setField(term943632, term943632.getClass(), "next", null);
        setIntField(term943634, term943634.getClass(), "encodedSourceStart", 0);
        setIntField(term943634, term943634.getClass(), "encodedSourceEnd", 0);
        setField(term943634, term943634.getClass(), "sourceName", null);
        setIntField(term943634, term943634.getClass(), "baseLineno", 0);
        setIntField(term943634, term943634.getClass(), "endLineno", 0);
        setField(term943634, term943634.getClass(), "functions", null);
        setField(term943634, term943634.getClass(), "regexps", null);
        setField(term943634, term943634.getClass(), "itsVariables", null);
        setField(term943634, term943634.getClass(), "itsConst", null);
        setField(term943634, term943634.getClass(), "itsVariableNames", null);
        setIntField(term943634, term943634.getClass(), "varStart", 0);
        setField(term943634, term943634.getClass(), "compilerData", null);
        setIntField(term943634, term943634.getClass(), "type", 0);
        setIntField(term943641, term943641.getClass(), "type", 63);
        setField(term943641, term943641.getClass(), "next", null);
        setField(term943641, term943641.getClass(), "first", null);
        setField(term943641, term943641.getClass(), "last", null);
        setField(term943641, term943641.getClass(), "propListHead", null);
        setIntField(term943641, term943641.getClass(), "sourcePosition", 0);
        setField(term943641, term943641.getClass(), "jsType", null);
        setField(term943641, term943641.getClass(), "parent", null);
        setField(term943634, term943634.getClass(), "next", term943641);
        setField(term943634, term943634.getClass(), "first", null);
        setField(term943634, term943634.getClass(), "last", null);
        setField(term943634, term943634.getClass(), "propListHead", null);
        setIntField(term943634, term943634.getClass(), "sourcePosition", 0);
        setField(term943634, term943634.getClass(), "jsType", null);
        setField(term943634, term943634.getClass(), "parent", null);
        setField(term943632, term943632.getClass(), "first", term943634);
        setField(term943632, term943632.getClass(), "last", null);
        setField(term943632, term943632.getClass(), "propListHead", null);
        setIntField(term943632, term943632.getClass(), "sourcePosition", 0);
        setField(term943632, term943632.getClass(), "jsType", null);
        setField(term943646, term943646.getClass(), "str", null);
        setIntField(term943646, term943646.getClass(), "type", 0);
        setField(term943646, term943646.getClass(), "next", null);
        setField(term943646, term943646.getClass(), "first", null);
        setField(term943646, term943646.getClass(), "last", null);
        setField(term943646, term943646.getClass(), "propListHead", null);
        setIntField(term943646, term943646.getClass(), "sourcePosition", 0);
        setField(term943646, term943646.getClass(), "jsType", null);
        setField(term943646, term943646.getClass(), "parent", null);
        setField(term943632, term943632.getClass(), "parent", term943646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term943269;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term943177, args);
        assertTrue(recursiveEquals(term943177, term943710));
        assertTrue(recursiveEquals(term943269, term943711));
        assertTrue(recursiveEquals(retValue, term943632));
    }

};


