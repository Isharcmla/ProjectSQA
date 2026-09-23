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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83619;
     Object term83689;
     Object term84263;
     Object term84264;
     Object term84200;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83619 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term83689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83779 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term83871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term83779, term83779.getClass(), "next", term83871);
        setIntField(term83779, term83779.getClass(), "type", 0);
        setField(term83689, term83689.getClass(), "first", term83779);
        setIntField(term83689, term83689.getClass(), "type", 101);
        setField(term83689, term83689.getClass(), "parent", null);
        term84263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term84263, term84263.getClass(), "currentTraversal", null);
        term84264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84265 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term84266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term84264, term84264.getClass(), "type", 101);
        setField(term84264, term84264.getClass(), "next", null);
        setIntField(term84265, term84265.getClass(), "encodedSourceStart", 0);
        setIntField(term84265, term84265.getClass(), "encodedSourceEnd", 0);
        setField(term84265, term84265.getClass(), "sourceName", null);
        setIntField(term84265, term84265.getClass(), "baseLineno", 0);
        setIntField(term84265, term84265.getClass(), "endLineno", 0);
        setField(term84265, term84265.getClass(), "functions", null);
        setField(term84265, term84265.getClass(), "regexps", null);
        setField(term84265, term84265.getClass(), "itsVariables", null);
        setField(term84265, term84265.getClass(), "itsConst", null);
        setField(term84265, term84265.getClass(), "itsVariableNames", null);
        setIntField(term84265, term84265.getClass(), "varStart", 0);
        setField(term84265, term84265.getClass(), "compilerData", null);
        setIntField(term84265, term84265.getClass(), "type", 0);
        setField(term84266, term84266.getClass(), "str", null);
        setIntField(term84266, term84266.getClass(), "type", 0);
        setField(term84266, term84266.getClass(), "next", null);
        setField(term84266, term84266.getClass(), "first", null);
        setField(term84266, term84266.getClass(), "last", null);
        setField(term84266, term84266.getClass(), "propListHead", null);
        setIntField(term84266, term84266.getClass(), "sourcePosition", 0);
        setField(term84266, term84266.getClass(), "jsType", null);
        setField(term84266, term84266.getClass(), "parent", null);
        setField(term84265, term84265.getClass(), "next", term84266);
        setField(term84265, term84265.getClass(), "first", null);
        setField(term84265, term84265.getClass(), "last", null);
        setField(term84265, term84265.getClass(), "propListHead", null);
        setIntField(term84265, term84265.getClass(), "sourcePosition", 0);
        setField(term84265, term84265.getClass(), "jsType", null);
        setField(term84265, term84265.getClass(), "parent", null);
        setField(term84264, term84264.getClass(), "first", term84265);
        setField(term84264, term84264.getClass(), "last", null);
        setField(term84264, term84264.getClass(), "propListHead", null);
        setIntField(term84264, term84264.getClass(), "sourcePosition", 0);
        setField(term84264, term84264.getClass(), "jsType", null);
        setField(term84264, term84264.getClass(), "parent", null);
        term84200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84202 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term84209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term84200, term84200.getClass(), "type", 101);
        setField(term84200, term84200.getClass(), "next", null);
        setIntField(term84202, term84202.getClass(), "encodedSourceStart", 0);
        setIntField(term84202, term84202.getClass(), "encodedSourceEnd", 0);
        setField(term84202, term84202.getClass(), "sourceName", null);
        setIntField(term84202, term84202.getClass(), "baseLineno", 0);
        setIntField(term84202, term84202.getClass(), "endLineno", 0);
        setField(term84202, term84202.getClass(), "functions", null);
        setField(term84202, term84202.getClass(), "regexps", null);
        setField(term84202, term84202.getClass(), "itsVariables", null);
        setField(term84202, term84202.getClass(), "itsConst", null);
        setField(term84202, term84202.getClass(), "itsVariableNames", null);
        setIntField(term84202, term84202.getClass(), "varStart", 0);
        setField(term84202, term84202.getClass(), "compilerData", null);
        setIntField(term84202, term84202.getClass(), "type", 0);
        setField(term84209, term84209.getClass(), "str", null);
        setIntField(term84209, term84209.getClass(), "type", 0);
        setField(term84209, term84209.getClass(), "next", null);
        setField(term84209, term84209.getClass(), "first", null);
        setField(term84209, term84209.getClass(), "last", null);
        setField(term84209, term84209.getClass(), "propListHead", null);
        setIntField(term84209, term84209.getClass(), "sourcePosition", 0);
        setField(term84209, term84209.getClass(), "jsType", null);
        setField(term84209, term84209.getClass(), "parent", null);
        setField(term84202, term84202.getClass(), "next", term84209);
        setField(term84202, term84202.getClass(), "first", null);
        setField(term84202, term84202.getClass(), "last", null);
        setField(term84202, term84202.getClass(), "propListHead", null);
        setIntField(term84202, term84202.getClass(), "sourcePosition", 0);
        setField(term84202, term84202.getClass(), "jsType", null);
        setField(term84202, term84202.getClass(), "parent", null);
        setField(term84200, term84200.getClass(), "first", term84202);
        setField(term84200, term84200.getClass(), "last", null);
        setField(term84200, term84200.getClass(), "propListHead", null);
        setIntField(term84200, term84200.getClass(), "sourcePosition", 0);
        setField(term84200, term84200.getClass(), "jsType", null);
        setField(term84200, term84200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term83689;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term83619, args);
        assertTrue(recursiveEquals(term83619, term84263));
        assertTrue(recursiveEquals(term83689, term84264));
        assertTrue(recursiveEquals(retValue, term84200));
    }

};


