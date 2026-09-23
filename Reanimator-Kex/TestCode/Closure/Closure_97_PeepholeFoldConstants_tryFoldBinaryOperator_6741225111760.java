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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689904;
     Object term689996;
     Object term690336;
     Object term690337;
     Object term690284;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689904 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term689996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690178 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term690088, term690088.getClass(), "next", term690178);
        setIntField(term690088, term690088.getClass(), "type", 63);
        setField(term689996, term689996.getClass(), "first", term690088);
        setIntField(term689996, term689996.getClass(), "type", 35);
        term690336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term690336, term690336.getClass(), "currentTraversal", null);
        term690337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690339 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term690337, term690337.getClass(), "number", 0.0);
        setIntField(term690337, term690337.getClass(), "type", 35);
        setField(term690337, term690337.getClass(), "next", null);
        setDoubleField(term690338, term690338.getClass(), "number", 0.0);
        setIntField(term690338, term690338.getClass(), "type", 63);
        setIntField(term690339, term690339.getClass(), "encodedSourceStart", 0);
        setIntField(term690339, term690339.getClass(), "encodedSourceEnd", 0);
        setField(term690339, term690339.getClass(), "sourceName", null);
        setIntField(term690339, term690339.getClass(), "baseLineno", 0);
        setIntField(term690339, term690339.getClass(), "endLineno", 0);
        setField(term690339, term690339.getClass(), "functions", null);
        setField(term690339, term690339.getClass(), "regexps", null);
        setField(term690339, term690339.getClass(), "itsVariables", null);
        setField(term690339, term690339.getClass(), "itsConst", null);
        setField(term690339, term690339.getClass(), "itsVariableNames", null);
        setIntField(term690339, term690339.getClass(), "varStart", 0);
        setField(term690339, term690339.getClass(), "compilerData", null);
        setIntField(term690339, term690339.getClass(), "type", 0);
        setField(term690339, term690339.getClass(), "next", null);
        setField(term690339, term690339.getClass(), "first", null);
        setField(term690339, term690339.getClass(), "last", null);
        setField(term690339, term690339.getClass(), "propListHead", null);
        setIntField(term690339, term690339.getClass(), "sourcePosition", 0);
        setField(term690339, term690339.getClass(), "jsType", null);
        setField(term690339, term690339.getClass(), "parent", null);
        setField(term690338, term690338.getClass(), "next", term690339);
        setField(term690338, term690338.getClass(), "first", null);
        setField(term690338, term690338.getClass(), "last", null);
        setField(term690338, term690338.getClass(), "propListHead", null);
        setIntField(term690338, term690338.getClass(), "sourcePosition", 0);
        setField(term690338, term690338.getClass(), "jsType", null);
        setField(term690338, term690338.getClass(), "parent", null);
        setField(term690337, term690337.getClass(), "first", term690338);
        setField(term690337, term690337.getClass(), "last", null);
        setField(term690337, term690337.getClass(), "propListHead", null);
        setIntField(term690337, term690337.getClass(), "sourcePosition", 0);
        setField(term690337, term690337.getClass(), "jsType", null);
        setField(term690337, term690337.getClass(), "parent", null);
        term690284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690290 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term690284, term690284.getClass(), "number", 0.0);
        setIntField(term690284, term690284.getClass(), "type", 35);
        setField(term690284, term690284.getClass(), "next", null);
        setDoubleField(term690287, term690287.getClass(), "number", 0.0);
        setIntField(term690287, term690287.getClass(), "type", 63);
        setIntField(term690290, term690290.getClass(), "encodedSourceStart", 0);
        setIntField(term690290, term690290.getClass(), "encodedSourceEnd", 0);
        setField(term690290, term690290.getClass(), "sourceName", null);
        setIntField(term690290, term690290.getClass(), "baseLineno", 0);
        setIntField(term690290, term690290.getClass(), "endLineno", 0);
        setField(term690290, term690290.getClass(), "functions", null);
        setField(term690290, term690290.getClass(), "regexps", null);
        setField(term690290, term690290.getClass(), "itsVariables", null);
        setField(term690290, term690290.getClass(), "itsConst", null);
        setField(term690290, term690290.getClass(), "itsVariableNames", null);
        setIntField(term690290, term690290.getClass(), "varStart", 0);
        setField(term690290, term690290.getClass(), "compilerData", null);
        setIntField(term690290, term690290.getClass(), "type", 0);
        setField(term690290, term690290.getClass(), "next", null);
        setField(term690290, term690290.getClass(), "first", null);
        setField(term690290, term690290.getClass(), "last", null);
        setField(term690290, term690290.getClass(), "propListHead", null);
        setIntField(term690290, term690290.getClass(), "sourcePosition", 0);
        setField(term690290, term690290.getClass(), "jsType", null);
        setField(term690290, term690290.getClass(), "parent", null);
        setField(term690287, term690287.getClass(), "next", term690290);
        setField(term690287, term690287.getClass(), "first", null);
        setField(term690287, term690287.getClass(), "last", null);
        setField(term690287, term690287.getClass(), "propListHead", null);
        setIntField(term690287, term690287.getClass(), "sourcePosition", 0);
        setField(term690287, term690287.getClass(), "jsType", null);
        setField(term690287, term690287.getClass(), "parent", null);
        setField(term690284, term690284.getClass(), "first", term690287);
        setField(term690284, term690284.getClass(), "last", null);
        setField(term690284, term690284.getClass(), "propListHead", null);
        setIntField(term690284, term690284.getClass(), "sourcePosition", 0);
        setField(term690284, term690284.getClass(), "jsType", null);
        setField(term690284, term690284.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term689996;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term689904, args);
        assertTrue(recursiveEquals(term689904, term690336));
        assertTrue(recursiveEquals(term689996, term690337));
        assertTrue(recursiveEquals(retValue, term690284));
    }

};


