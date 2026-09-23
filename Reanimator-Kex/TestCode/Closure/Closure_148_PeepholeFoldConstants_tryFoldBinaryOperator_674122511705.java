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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156483;
     Object term156573;
     Object term157238;
     Object term157239;
     Object term157174;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term156573 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term156663 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term156753 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term156663, term156663.getClass(), "next", term156753);
        setIntField(term156663, term156663.getClass(), "type", 39);
        setField(term156573, term156573.getClass(), "first", term156663);
        setIntField(term156573, term156573.getClass(), "type", 18);
        term157238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term157238, term157238.getClass(), "currentTraversal", null);
        term157239 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term157240 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term157241 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term157239, term157239.getClass(), "encodedSourceStart", 0);
        setIntField(term157239, term157239.getClass(), "encodedSourceEnd", 0);
        setField(term157239, term157239.getClass(), "sourceName", null);
        setIntField(term157239, term157239.getClass(), "baseLineno", 0);
        setIntField(term157239, term157239.getClass(), "endLineno", 0);
        setField(term157239, term157239.getClass(), "functions", null);
        setField(term157239, term157239.getClass(), "regexps", null);
        setField(term157239, term157239.getClass(), "itsVariables", null);
        setField(term157239, term157239.getClass(), "itsConst", null);
        setField(term157239, term157239.getClass(), "itsVariableNames", null);
        setIntField(term157239, term157239.getClass(), "varStart", 0);
        setField(term157239, term157239.getClass(), "compilerData", null);
        setIntField(term157239, term157239.getClass(), "type", 18);
        setField(term157239, term157239.getClass(), "next", null);
        setIntField(term157240, term157240.getClass(), "encodedSourceStart", 0);
        setIntField(term157240, term157240.getClass(), "encodedSourceEnd", 0);
        setField(term157240, term157240.getClass(), "sourceName", null);
        setIntField(term157240, term157240.getClass(), "baseLineno", 0);
        setIntField(term157240, term157240.getClass(), "endLineno", 0);
        setField(term157240, term157240.getClass(), "functions", null);
        setField(term157240, term157240.getClass(), "regexps", null);
        setField(term157240, term157240.getClass(), "itsVariables", null);
        setField(term157240, term157240.getClass(), "itsConst", null);
        setField(term157240, term157240.getClass(), "itsVariableNames", null);
        setIntField(term157240, term157240.getClass(), "varStart", 0);
        setField(term157240, term157240.getClass(), "compilerData", null);
        setIntField(term157240, term157240.getClass(), "type", 39);
        setIntField(term157241, term157241.getClass(), "encodedSourceStart", 0);
        setIntField(term157241, term157241.getClass(), "encodedSourceEnd", 0);
        setField(term157241, term157241.getClass(), "sourceName", null);
        setIntField(term157241, term157241.getClass(), "baseLineno", 0);
        setIntField(term157241, term157241.getClass(), "endLineno", 0);
        setField(term157241, term157241.getClass(), "functions", null);
        setField(term157241, term157241.getClass(), "regexps", null);
        setField(term157241, term157241.getClass(), "itsVariables", null);
        setField(term157241, term157241.getClass(), "itsConst", null);
        setField(term157241, term157241.getClass(), "itsVariableNames", null);
        setIntField(term157241, term157241.getClass(), "varStart", 0);
        setField(term157241, term157241.getClass(), "compilerData", null);
        setIntField(term157241, term157241.getClass(), "type", 0);
        setField(term157241, term157241.getClass(), "next", null);
        setField(term157241, term157241.getClass(), "first", null);
        setField(term157241, term157241.getClass(), "last", null);
        setField(term157241, term157241.getClass(), "propListHead", null);
        setIntField(term157241, term157241.getClass(), "sourcePosition", 0);
        setField(term157241, term157241.getClass(), "jsType", null);
        setField(term157241, term157241.getClass(), "parent", null);
        setField(term157240, term157240.getClass(), "next", term157241);
        setField(term157240, term157240.getClass(), "first", null);
        setField(term157240, term157240.getClass(), "last", null);
        setField(term157240, term157240.getClass(), "propListHead", null);
        setIntField(term157240, term157240.getClass(), "sourcePosition", 0);
        setField(term157240, term157240.getClass(), "jsType", null);
        setField(term157240, term157240.getClass(), "parent", null);
        setField(term157239, term157239.getClass(), "first", term157240);
        setField(term157239, term157239.getClass(), "last", null);
        setField(term157239, term157239.getClass(), "propListHead", null);
        setIntField(term157239, term157239.getClass(), "sourcePosition", 0);
        setField(term157239, term157239.getClass(), "jsType", null);
        setField(term157239, term157239.getClass(), "parent", null);
        term157174 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term157181 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term157188 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term157174, term157174.getClass(), "encodedSourceStart", 0);
        setIntField(term157174, term157174.getClass(), "encodedSourceEnd", 0);
        setField(term157174, term157174.getClass(), "sourceName", null);
        setIntField(term157174, term157174.getClass(), "baseLineno", 0);
        setIntField(term157174, term157174.getClass(), "endLineno", 0);
        setField(term157174, term157174.getClass(), "functions", null);
        setField(term157174, term157174.getClass(), "regexps", null);
        setField(term157174, term157174.getClass(), "itsVariables", null);
        setField(term157174, term157174.getClass(), "itsConst", null);
        setField(term157174, term157174.getClass(), "itsVariableNames", null);
        setIntField(term157174, term157174.getClass(), "varStart", 0);
        setField(term157174, term157174.getClass(), "compilerData", null);
        setIntField(term157174, term157174.getClass(), "type", 18);
        setField(term157174, term157174.getClass(), "next", null);
        setIntField(term157181, term157181.getClass(), "encodedSourceStart", 0);
        setIntField(term157181, term157181.getClass(), "encodedSourceEnd", 0);
        setField(term157181, term157181.getClass(), "sourceName", null);
        setIntField(term157181, term157181.getClass(), "baseLineno", 0);
        setIntField(term157181, term157181.getClass(), "endLineno", 0);
        setField(term157181, term157181.getClass(), "functions", null);
        setField(term157181, term157181.getClass(), "regexps", null);
        setField(term157181, term157181.getClass(), "itsVariables", null);
        setField(term157181, term157181.getClass(), "itsConst", null);
        setField(term157181, term157181.getClass(), "itsVariableNames", null);
        setIntField(term157181, term157181.getClass(), "varStart", 0);
        setField(term157181, term157181.getClass(), "compilerData", null);
        setIntField(term157181, term157181.getClass(), "type", 39);
        setIntField(term157188, term157188.getClass(), "encodedSourceStart", 0);
        setIntField(term157188, term157188.getClass(), "encodedSourceEnd", 0);
        setField(term157188, term157188.getClass(), "sourceName", null);
        setIntField(term157188, term157188.getClass(), "baseLineno", 0);
        setIntField(term157188, term157188.getClass(), "endLineno", 0);
        setField(term157188, term157188.getClass(), "functions", null);
        setField(term157188, term157188.getClass(), "regexps", null);
        setField(term157188, term157188.getClass(), "itsVariables", null);
        setField(term157188, term157188.getClass(), "itsConst", null);
        setField(term157188, term157188.getClass(), "itsVariableNames", null);
        setIntField(term157188, term157188.getClass(), "varStart", 0);
        setField(term157188, term157188.getClass(), "compilerData", null);
        setIntField(term157188, term157188.getClass(), "type", 0);
        setField(term157188, term157188.getClass(), "next", null);
        setField(term157188, term157188.getClass(), "first", null);
        setField(term157188, term157188.getClass(), "last", null);
        setField(term157188, term157188.getClass(), "propListHead", null);
        setIntField(term157188, term157188.getClass(), "sourcePosition", 0);
        setField(term157188, term157188.getClass(), "jsType", null);
        setField(term157188, term157188.getClass(), "parent", null);
        setField(term157181, term157181.getClass(), "next", term157188);
        setField(term157181, term157181.getClass(), "first", null);
        setField(term157181, term157181.getClass(), "last", null);
        setField(term157181, term157181.getClass(), "propListHead", null);
        setIntField(term157181, term157181.getClass(), "sourcePosition", 0);
        setField(term157181, term157181.getClass(), "jsType", null);
        setField(term157181, term157181.getClass(), "parent", null);
        setField(term157174, term157174.getClass(), "first", term157181);
        setField(term157174, term157174.getClass(), "last", null);
        setField(term157174, term157174.getClass(), "propListHead", null);
        setIntField(term157174, term157174.getClass(), "sourcePosition", 0);
        setField(term157174, term157174.getClass(), "jsType", null);
        setField(term157174, term157174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156573;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term156483, args);
        assertTrue(recursiveEquals(term156483, term157238));
        assertTrue(recursiveEquals(term156573, term157239));
        assertTrue(recursiveEquals(retValue, term157174));
    }

};


