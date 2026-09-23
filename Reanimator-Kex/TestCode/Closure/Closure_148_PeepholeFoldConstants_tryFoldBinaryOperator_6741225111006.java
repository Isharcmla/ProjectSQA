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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235383;
     Object term235475;
     Object term235770;
     Object term235771;
     Object term235708;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term235475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235657 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term235657, term235657.getClass(), "type", 16);
        setField(term235567, term235567.getClass(), "next", term235657);
        setIntField(term235567, term235567.getClass(), "type", 42);
        setField(term235475, term235475.getClass(), "first", term235567);
        setIntField(term235475, term235475.getClass(), "type", 16);
        term235770 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term235770, term235770.getClass(), "currentTraversal", null);
        term235771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235773 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term235771, term235771.getClass(), "str", null);
        setIntField(term235771, term235771.getClass(), "type", 16);
        setField(term235771, term235771.getClass(), "next", null);
        setField(term235772, term235772.getClass(), "str", null);
        setIntField(term235772, term235772.getClass(), "type", 42);
        setIntField(term235773, term235773.getClass(), "encodedSourceStart", 0);
        setIntField(term235773, term235773.getClass(), "encodedSourceEnd", 0);
        setField(term235773, term235773.getClass(), "sourceName", null);
        setIntField(term235773, term235773.getClass(), "baseLineno", 0);
        setIntField(term235773, term235773.getClass(), "endLineno", 0);
        setField(term235773, term235773.getClass(), "functions", null);
        setField(term235773, term235773.getClass(), "regexps", null);
        setField(term235773, term235773.getClass(), "itsVariables", null);
        setField(term235773, term235773.getClass(), "itsConst", null);
        setField(term235773, term235773.getClass(), "itsVariableNames", null);
        setIntField(term235773, term235773.getClass(), "varStart", 0);
        setField(term235773, term235773.getClass(), "compilerData", null);
        setIntField(term235773, term235773.getClass(), "type", 16);
        setField(term235773, term235773.getClass(), "next", null);
        setField(term235773, term235773.getClass(), "first", null);
        setField(term235773, term235773.getClass(), "last", null);
        setField(term235773, term235773.getClass(), "propListHead", null);
        setIntField(term235773, term235773.getClass(), "sourcePosition", 0);
        setField(term235773, term235773.getClass(), "jsType", null);
        setField(term235773, term235773.getClass(), "parent", null);
        setField(term235772, term235772.getClass(), "next", term235773);
        setField(term235772, term235772.getClass(), "first", null);
        setField(term235772, term235772.getClass(), "last", null);
        setField(term235772, term235772.getClass(), "propListHead", null);
        setIntField(term235772, term235772.getClass(), "sourcePosition", 0);
        setField(term235772, term235772.getClass(), "jsType", null);
        setField(term235772, term235772.getClass(), "parent", null);
        setField(term235771, term235771.getClass(), "first", term235772);
        setField(term235771, term235771.getClass(), "last", null);
        setField(term235771, term235771.getClass(), "propListHead", null);
        setIntField(term235771, term235771.getClass(), "sourcePosition", 0);
        setField(term235771, term235771.getClass(), "jsType", null);
        setField(term235771, term235771.getClass(), "parent", null);
        term235708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235712 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term235708, term235708.getClass(), "str", null);
        setIntField(term235708, term235708.getClass(), "type", 16);
        setField(term235708, term235708.getClass(), "next", null);
        setField(term235710, term235710.getClass(), "str", null);
        setIntField(term235710, term235710.getClass(), "type", 42);
        setIntField(term235712, term235712.getClass(), "encodedSourceStart", 0);
        setIntField(term235712, term235712.getClass(), "encodedSourceEnd", 0);
        setField(term235712, term235712.getClass(), "sourceName", null);
        setIntField(term235712, term235712.getClass(), "baseLineno", 0);
        setIntField(term235712, term235712.getClass(), "endLineno", 0);
        setField(term235712, term235712.getClass(), "functions", null);
        setField(term235712, term235712.getClass(), "regexps", null);
        setField(term235712, term235712.getClass(), "itsVariables", null);
        setField(term235712, term235712.getClass(), "itsConst", null);
        setField(term235712, term235712.getClass(), "itsVariableNames", null);
        setIntField(term235712, term235712.getClass(), "varStart", 0);
        setField(term235712, term235712.getClass(), "compilerData", null);
        setIntField(term235712, term235712.getClass(), "type", 16);
        setField(term235712, term235712.getClass(), "next", null);
        setField(term235712, term235712.getClass(), "first", null);
        setField(term235712, term235712.getClass(), "last", null);
        setField(term235712, term235712.getClass(), "propListHead", null);
        setIntField(term235712, term235712.getClass(), "sourcePosition", 0);
        setField(term235712, term235712.getClass(), "jsType", null);
        setField(term235712, term235712.getClass(), "parent", null);
        setField(term235710, term235710.getClass(), "next", term235712);
        setField(term235710, term235710.getClass(), "first", null);
        setField(term235710, term235710.getClass(), "last", null);
        setField(term235710, term235710.getClass(), "propListHead", null);
        setIntField(term235710, term235710.getClass(), "sourcePosition", 0);
        setField(term235710, term235710.getClass(), "jsType", null);
        setField(term235710, term235710.getClass(), "parent", null);
        setField(term235708, term235708.getClass(), "first", term235710);
        setField(term235708, term235708.getClass(), "last", null);
        setField(term235708, term235708.getClass(), "propListHead", null);
        setIntField(term235708, term235708.getClass(), "sourcePosition", 0);
        setField(term235708, term235708.getClass(), "jsType", null);
        setField(term235708, term235708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term235475;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term235383, args);
        assertTrue(recursiveEquals(term235383, term235770));
        assertTrue(recursiveEquals(term235475, term235771));
        assertTrue(recursiveEquals(retValue, term235708));
    }

};


