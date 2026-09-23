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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402708;
     Object term402800;
     Object term420981;
     Object term420982;
     Object term420913;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402708 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term402800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term402892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term402982 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term402982, term402982.getClass(), "type", 106);
        setField(term402892, term402892.getClass(), "next", term402982);
        setIntField(term402892, term402892.getClass(), "type", 42);
        setField(term402800, term402800.getClass(), "first", term402892);
        setIntField(term402800, term402800.getClass(), "type", 14);
        term420981 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420981, term420981.getClass(), "currentTraversal", null);
        term420982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420984 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term420982, term420982.getClass(), "number", 0.0);
        setIntField(term420982, term420982.getClass(), "type", 14);
        setField(term420982, term420982.getClass(), "next", null);
        setDoubleField(term420983, term420983.getClass(), "number", 0.0);
        setIntField(term420983, term420983.getClass(), "type", 42);
        setIntField(term420984, term420984.getClass(), "encodedSourceStart", 0);
        setIntField(term420984, term420984.getClass(), "encodedSourceEnd", 0);
        setField(term420984, term420984.getClass(), "sourceName", null);
        setIntField(term420984, term420984.getClass(), "baseLineno", 0);
        setIntField(term420984, term420984.getClass(), "endLineno", 0);
        setField(term420984, term420984.getClass(), "functions", null);
        setField(term420984, term420984.getClass(), "regexps", null);
        setField(term420984, term420984.getClass(), "itsVariables", null);
        setField(term420984, term420984.getClass(), "itsConst", null);
        setField(term420984, term420984.getClass(), "itsVariableNames", null);
        setIntField(term420984, term420984.getClass(), "varStart", 0);
        setField(term420984, term420984.getClass(), "compilerData", null);
        setIntField(term420984, term420984.getClass(), "type", 106);
        setField(term420984, term420984.getClass(), "next", null);
        setField(term420984, term420984.getClass(), "first", null);
        setField(term420984, term420984.getClass(), "last", null);
        setField(term420984, term420984.getClass(), "propListHead", null);
        setIntField(term420984, term420984.getClass(), "sourcePosition", 0);
        setField(term420984, term420984.getClass(), "jsType", null);
        setField(term420984, term420984.getClass(), "parent", null);
        setField(term420983, term420983.getClass(), "next", term420984);
        setField(term420983, term420983.getClass(), "first", null);
        setField(term420983, term420983.getClass(), "last", null);
        setField(term420983, term420983.getClass(), "propListHead", null);
        setIntField(term420983, term420983.getClass(), "sourcePosition", 0);
        setField(term420983, term420983.getClass(), "jsType", null);
        setField(term420983, term420983.getClass(), "parent", null);
        setField(term420982, term420982.getClass(), "first", term420983);
        setField(term420982, term420982.getClass(), "last", null);
        setField(term420982, term420982.getClass(), "propListHead", null);
        setIntField(term420982, term420982.getClass(), "sourcePosition", 0);
        setField(term420982, term420982.getClass(), "jsType", null);
        setField(term420982, term420982.getClass(), "parent", null);
        term420913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420919 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term420913, term420913.getClass(), "number", 0.0);
        setIntField(term420913, term420913.getClass(), "type", 14);
        setField(term420913, term420913.getClass(), "next", null);
        setDoubleField(term420916, term420916.getClass(), "number", 0.0);
        setIntField(term420916, term420916.getClass(), "type", 42);
        setIntField(term420919, term420919.getClass(), "encodedSourceStart", 0);
        setIntField(term420919, term420919.getClass(), "encodedSourceEnd", 0);
        setField(term420919, term420919.getClass(), "sourceName", null);
        setIntField(term420919, term420919.getClass(), "baseLineno", 0);
        setIntField(term420919, term420919.getClass(), "endLineno", 0);
        setField(term420919, term420919.getClass(), "functions", null);
        setField(term420919, term420919.getClass(), "regexps", null);
        setField(term420919, term420919.getClass(), "itsVariables", null);
        setField(term420919, term420919.getClass(), "itsConst", null);
        setField(term420919, term420919.getClass(), "itsVariableNames", null);
        setIntField(term420919, term420919.getClass(), "varStart", 0);
        setField(term420919, term420919.getClass(), "compilerData", null);
        setIntField(term420919, term420919.getClass(), "type", 106);
        setField(term420919, term420919.getClass(), "next", null);
        setField(term420919, term420919.getClass(), "first", null);
        setField(term420919, term420919.getClass(), "last", null);
        setField(term420919, term420919.getClass(), "propListHead", null);
        setIntField(term420919, term420919.getClass(), "sourcePosition", 0);
        setField(term420919, term420919.getClass(), "jsType", null);
        setField(term420919, term420919.getClass(), "parent", null);
        setField(term420916, term420916.getClass(), "next", term420919);
        setField(term420916, term420916.getClass(), "first", null);
        setField(term420916, term420916.getClass(), "last", null);
        setField(term420916, term420916.getClass(), "propListHead", null);
        setIntField(term420916, term420916.getClass(), "sourcePosition", 0);
        setField(term420916, term420916.getClass(), "jsType", null);
        setField(term420916, term420916.getClass(), "parent", null);
        setField(term420913, term420913.getClass(), "first", term420916);
        setField(term420913, term420913.getClass(), "last", null);
        setField(term420913, term420913.getClass(), "propListHead", null);
        setIntField(term420913, term420913.getClass(), "sourcePosition", 0);
        setField(term420913, term420913.getClass(), "jsType", null);
        setField(term420913, term420913.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term402800;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term402708, args);
        assertTrue(recursiveEquals(term402708, term420981));
        assertTrue(recursiveEquals(term402800, term420982));
        assertTrue(recursiveEquals(retValue, term420913));
    }

};


