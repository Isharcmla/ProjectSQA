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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717908;
     Object term718000;
     Object term718257;
     Object term718258;
     Object term718194;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term718000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term718090 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term718182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term718090, term718090.getClass(), "next", term718182);
        setIntField(term718090, term718090.getClass(), "type", 0);
        setField(term718000, term718000.getClass(), "first", term718090);
        setIntField(term718000, term718000.getClass(), "type", 100);
        setField(term718000, term718000.getClass(), "parent", null);
        term718257 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term718257, term718257.getClass(), "currentTraversal", null);
        term718258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term718259 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term718260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term718258, term718258.getClass(), "str", null);
        setIntField(term718258, term718258.getClass(), "type", 100);
        setField(term718258, term718258.getClass(), "next", null);
        setIntField(term718259, term718259.getClass(), "encodedSourceStart", 0);
        setIntField(term718259, term718259.getClass(), "encodedSourceEnd", 0);
        setField(term718259, term718259.getClass(), "sourceName", null);
        setIntField(term718259, term718259.getClass(), "baseLineno", 0);
        setIntField(term718259, term718259.getClass(), "endLineno", 0);
        setField(term718259, term718259.getClass(), "functions", null);
        setField(term718259, term718259.getClass(), "regexps", null);
        setField(term718259, term718259.getClass(), "itsVariables", null);
        setField(term718259, term718259.getClass(), "itsConst", null);
        setField(term718259, term718259.getClass(), "itsVariableNames", null);
        setIntField(term718259, term718259.getClass(), "varStart", 0);
        setField(term718259, term718259.getClass(), "compilerData", null);
        setIntField(term718259, term718259.getClass(), "type", 0);
        setField(term718260, term718260.getClass(), "str", null);
        setIntField(term718260, term718260.getClass(), "type", 0);
        setField(term718260, term718260.getClass(), "next", null);
        setField(term718260, term718260.getClass(), "first", null);
        setField(term718260, term718260.getClass(), "last", null);
        setField(term718260, term718260.getClass(), "propListHead", null);
        setIntField(term718260, term718260.getClass(), "sourcePosition", 0);
        setField(term718260, term718260.getClass(), "jsType", null);
        setField(term718260, term718260.getClass(), "parent", null);
        setField(term718259, term718259.getClass(), "next", term718260);
        setField(term718259, term718259.getClass(), "first", null);
        setField(term718259, term718259.getClass(), "last", null);
        setField(term718259, term718259.getClass(), "propListHead", null);
        setIntField(term718259, term718259.getClass(), "sourcePosition", 0);
        setField(term718259, term718259.getClass(), "jsType", null);
        setField(term718259, term718259.getClass(), "parent", null);
        setField(term718258, term718258.getClass(), "first", term718259);
        setField(term718258, term718258.getClass(), "last", null);
        setField(term718258, term718258.getClass(), "propListHead", null);
        setIntField(term718258, term718258.getClass(), "sourcePosition", 0);
        setField(term718258, term718258.getClass(), "jsType", null);
        setField(term718258, term718258.getClass(), "parent", null);
        term718194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term718196 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term718203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term718194, term718194.getClass(), "str", null);
        setIntField(term718194, term718194.getClass(), "type", 100);
        setField(term718194, term718194.getClass(), "next", null);
        setIntField(term718196, term718196.getClass(), "encodedSourceStart", 0);
        setIntField(term718196, term718196.getClass(), "encodedSourceEnd", 0);
        setField(term718196, term718196.getClass(), "sourceName", null);
        setIntField(term718196, term718196.getClass(), "baseLineno", 0);
        setIntField(term718196, term718196.getClass(), "endLineno", 0);
        setField(term718196, term718196.getClass(), "functions", null);
        setField(term718196, term718196.getClass(), "regexps", null);
        setField(term718196, term718196.getClass(), "itsVariables", null);
        setField(term718196, term718196.getClass(), "itsConst", null);
        setField(term718196, term718196.getClass(), "itsVariableNames", null);
        setIntField(term718196, term718196.getClass(), "varStart", 0);
        setField(term718196, term718196.getClass(), "compilerData", null);
        setIntField(term718196, term718196.getClass(), "type", 0);
        setField(term718203, term718203.getClass(), "str", null);
        setIntField(term718203, term718203.getClass(), "type", 0);
        setField(term718203, term718203.getClass(), "next", null);
        setField(term718203, term718203.getClass(), "first", null);
        setField(term718203, term718203.getClass(), "last", null);
        setField(term718203, term718203.getClass(), "propListHead", null);
        setIntField(term718203, term718203.getClass(), "sourcePosition", 0);
        setField(term718203, term718203.getClass(), "jsType", null);
        setField(term718203, term718203.getClass(), "parent", null);
        setField(term718196, term718196.getClass(), "next", term718203);
        setField(term718196, term718196.getClass(), "first", null);
        setField(term718196, term718196.getClass(), "last", null);
        setField(term718196, term718196.getClass(), "propListHead", null);
        setIntField(term718196, term718196.getClass(), "sourcePosition", 0);
        setField(term718196, term718196.getClass(), "jsType", null);
        setField(term718196, term718196.getClass(), "parent", null);
        setField(term718194, term718194.getClass(), "first", term718196);
        setField(term718194, term718194.getClass(), "last", null);
        setField(term718194, term718194.getClass(), "propListHead", null);
        setIntField(term718194, term718194.getClass(), "sourcePosition", 0);
        setField(term718194, term718194.getClass(), "jsType", null);
        setField(term718194, term718194.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term718000;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term717908, args);
        assertTrue(recursiveEquals(term717908, term718257));
        assertTrue(recursiveEquals(term718000, term718258));
        assertTrue(recursiveEquals(retValue, term718194));
    }

};


