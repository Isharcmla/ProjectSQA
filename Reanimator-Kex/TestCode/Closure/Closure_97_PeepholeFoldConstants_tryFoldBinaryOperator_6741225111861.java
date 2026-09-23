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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715905;
     Object term715997;
     Object term716328;
     Object term716329;
     Object term716288;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715905 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term715997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term716087 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term715997, term715997.getClass(), "first", term715997);
        setField(term715997, term715997.getClass(), "next", term716087);
        setIntField(term715997, term715997.getClass(), "type", 33);
        term716328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term716328, term716328.getClass(), "currentTraversal", null);
        term716329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term716330 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term716329, term716329.getClass(), "str", null);
        setIntField(term716329, term716329.getClass(), "type", 33);
        setIntField(term716330, term716330.getClass(), "encodedSourceStart", 0);
        setIntField(term716330, term716330.getClass(), "encodedSourceEnd", 0);
        setField(term716330, term716330.getClass(), "sourceName", null);
        setIntField(term716330, term716330.getClass(), "baseLineno", 0);
        setIntField(term716330, term716330.getClass(), "endLineno", 0);
        setField(term716330, term716330.getClass(), "functions", null);
        setField(term716330, term716330.getClass(), "regexps", null);
        setField(term716330, term716330.getClass(), "itsVariables", null);
        setField(term716330, term716330.getClass(), "itsConst", null);
        setField(term716330, term716330.getClass(), "itsVariableNames", null);
        setIntField(term716330, term716330.getClass(), "varStart", 0);
        setField(term716330, term716330.getClass(), "compilerData", null);
        setIntField(term716330, term716330.getClass(), "type", 0);
        setField(term716330, term716330.getClass(), "next", null);
        setField(term716330, term716330.getClass(), "first", null);
        setField(term716330, term716330.getClass(), "last", null);
        setField(term716330, term716330.getClass(), "propListHead", null);
        setIntField(term716330, term716330.getClass(), "sourcePosition", 0);
        setField(term716330, term716330.getClass(), "jsType", null);
        setField(term716330, term716330.getClass(), "parent", null);
        setField(term716329, term716329.getClass(), "next", term716330);
        setField(term716329, term716329.getClass(), "first", term716329);
        setField(term716329, term716329.getClass(), "last", null);
        setField(term716329, term716329.getClass(), "propListHead", null);
        setIntField(term716329, term716329.getClass(), "sourcePosition", 0);
        setField(term716329, term716329.getClass(), "jsType", null);
        setField(term716329, term716329.getClass(), "parent", null);
        term716288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term716290 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term716288, term716288.getClass(), "str", null);
        setIntField(term716288, term716288.getClass(), "type", 33);
        setIntField(term716290, term716290.getClass(), "encodedSourceStart", 0);
        setIntField(term716290, term716290.getClass(), "encodedSourceEnd", 0);
        setField(term716290, term716290.getClass(), "sourceName", null);
        setIntField(term716290, term716290.getClass(), "baseLineno", 0);
        setIntField(term716290, term716290.getClass(), "endLineno", 0);
        setField(term716290, term716290.getClass(), "functions", null);
        setField(term716290, term716290.getClass(), "regexps", null);
        setField(term716290, term716290.getClass(), "itsVariables", null);
        setField(term716290, term716290.getClass(), "itsConst", null);
        setField(term716290, term716290.getClass(), "itsVariableNames", null);
        setIntField(term716290, term716290.getClass(), "varStart", 0);
        setField(term716290, term716290.getClass(), "compilerData", null);
        setIntField(term716290, term716290.getClass(), "type", 0);
        setField(term716290, term716290.getClass(), "next", null);
        setField(term716290, term716290.getClass(), "first", null);
        setField(term716290, term716290.getClass(), "last", null);
        setField(term716290, term716290.getClass(), "propListHead", null);
        setIntField(term716290, term716290.getClass(), "sourcePosition", 0);
        setField(term716290, term716290.getClass(), "jsType", null);
        setField(term716290, term716290.getClass(), "parent", null);
        setField(term716288, term716288.getClass(), "next", term716290);
        setField(term716288, term716288.getClass(), "first", term716288);
        setField(term716288, term716288.getClass(), "last", null);
        setField(term716288, term716288.getClass(), "propListHead", null);
        setIntField(term716288, term716288.getClass(), "sourcePosition", 0);
        setField(term716288, term716288.getClass(), "jsType", null);
        setField(term716288, term716288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term715997;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term715905, args);
        assertTrue(recursiveEquals(term715905, term716328));
        assertTrue(recursiveEquals(term715997, term716329));
        assertTrue(recursiveEquals(retValue, term716288));
    }

};


