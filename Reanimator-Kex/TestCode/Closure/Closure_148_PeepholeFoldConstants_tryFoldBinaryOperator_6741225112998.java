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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880501;
     Object term880593;
     Object term882030;
     Object term882031;
     Object term881942;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880501 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term880593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term880683 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term880775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term880867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term880775, term880775.getClass(), "type", 44);
        setField(term880683, term880683.getClass(), "next", term880775);
        setIntField(term880683, term880683.getClass(), "type", 0);
        setField(term880593, term880593.getClass(), "first", term880683);
        setIntField(term880593, term880593.getClass(), "type", 101);
        setIntField(term880867, term880867.getClass(), "type", 98);
        setField(term880593, term880593.getClass(), "parent", term880867);
        term882030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term882030, term882030.getClass(), "currentTraversal", null);
        term882031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term882032 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term882033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term882034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term882031, term882031.getClass(), "number", 0.0);
        setIntField(term882031, term882031.getClass(), "type", 101);
        setField(term882031, term882031.getClass(), "next", null);
        setIntField(term882032, term882032.getClass(), "encodedSourceStart", 0);
        setIntField(term882032, term882032.getClass(), "encodedSourceEnd", 0);
        setField(term882032, term882032.getClass(), "sourceName", null);
        setIntField(term882032, term882032.getClass(), "baseLineno", 0);
        setIntField(term882032, term882032.getClass(), "endLineno", 0);
        setField(term882032, term882032.getClass(), "functions", null);
        setField(term882032, term882032.getClass(), "regexps", null);
        setField(term882032, term882032.getClass(), "itsVariables", null);
        setField(term882032, term882032.getClass(), "itsConst", null);
        setField(term882032, term882032.getClass(), "itsVariableNames", null);
        setIntField(term882032, term882032.getClass(), "varStart", 0);
        setField(term882032, term882032.getClass(), "compilerData", null);
        setIntField(term882032, term882032.getClass(), "type", 0);
        setDoubleField(term882033, term882033.getClass(), "number", 0.0);
        setIntField(term882033, term882033.getClass(), "type", 44);
        setField(term882033, term882033.getClass(), "next", null);
        setField(term882033, term882033.getClass(), "first", null);
        setField(term882033, term882033.getClass(), "last", null);
        setField(term882033, term882033.getClass(), "propListHead", null);
        setIntField(term882033, term882033.getClass(), "sourcePosition", 0);
        setField(term882033, term882033.getClass(), "jsType", null);
        setField(term882033, term882033.getClass(), "parent", null);
        setField(term882032, term882032.getClass(), "next", term882033);
        setField(term882032, term882032.getClass(), "first", null);
        setField(term882032, term882032.getClass(), "last", null);
        setField(term882032, term882032.getClass(), "propListHead", null);
        setIntField(term882032, term882032.getClass(), "sourcePosition", 0);
        setField(term882032, term882032.getClass(), "jsType", null);
        setField(term882032, term882032.getClass(), "parent", null);
        setField(term882031, term882031.getClass(), "first", term882032);
        setField(term882031, term882031.getClass(), "last", null);
        setField(term882031, term882031.getClass(), "propListHead", null);
        setIntField(term882031, term882031.getClass(), "sourcePosition", 0);
        setField(term882031, term882031.getClass(), "jsType", null);
        setDoubleField(term882034, term882034.getClass(), "number", 0.0);
        setIntField(term882034, term882034.getClass(), "type", 98);
        setField(term882034, term882034.getClass(), "next", null);
        setField(term882034, term882034.getClass(), "first", null);
        setField(term882034, term882034.getClass(), "last", null);
        setField(term882034, term882034.getClass(), "propListHead", null);
        setIntField(term882034, term882034.getClass(), "sourcePosition", 0);
        setField(term882034, term882034.getClass(), "jsType", null);
        setField(term882034, term882034.getClass(), "parent", null);
        setField(term882031, term882031.getClass(), "parent", term882034);
        term881942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term881945 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term881952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term881958 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term881942, term881942.getClass(), "number", 0.0);
        setIntField(term881942, term881942.getClass(), "type", 101);
        setField(term881942, term881942.getClass(), "next", null);
        setIntField(term881945, term881945.getClass(), "encodedSourceStart", 0);
        setIntField(term881945, term881945.getClass(), "encodedSourceEnd", 0);
        setField(term881945, term881945.getClass(), "sourceName", null);
        setIntField(term881945, term881945.getClass(), "baseLineno", 0);
        setIntField(term881945, term881945.getClass(), "endLineno", 0);
        setField(term881945, term881945.getClass(), "functions", null);
        setField(term881945, term881945.getClass(), "regexps", null);
        setField(term881945, term881945.getClass(), "itsVariables", null);
        setField(term881945, term881945.getClass(), "itsConst", null);
        setField(term881945, term881945.getClass(), "itsVariableNames", null);
        setIntField(term881945, term881945.getClass(), "varStart", 0);
        setField(term881945, term881945.getClass(), "compilerData", null);
        setIntField(term881945, term881945.getClass(), "type", 0);
        setDoubleField(term881952, term881952.getClass(), "number", 0.0);
        setIntField(term881952, term881952.getClass(), "type", 44);
        setField(term881952, term881952.getClass(), "next", null);
        setField(term881952, term881952.getClass(), "first", null);
        setField(term881952, term881952.getClass(), "last", null);
        setField(term881952, term881952.getClass(), "propListHead", null);
        setIntField(term881952, term881952.getClass(), "sourcePosition", 0);
        setField(term881952, term881952.getClass(), "jsType", null);
        setField(term881952, term881952.getClass(), "parent", null);
        setField(term881945, term881945.getClass(), "next", term881952);
        setField(term881945, term881945.getClass(), "first", null);
        setField(term881945, term881945.getClass(), "last", null);
        setField(term881945, term881945.getClass(), "propListHead", null);
        setIntField(term881945, term881945.getClass(), "sourcePosition", 0);
        setField(term881945, term881945.getClass(), "jsType", null);
        setField(term881945, term881945.getClass(), "parent", null);
        setField(term881942, term881942.getClass(), "first", term881945);
        setField(term881942, term881942.getClass(), "last", null);
        setField(term881942, term881942.getClass(), "propListHead", null);
        setIntField(term881942, term881942.getClass(), "sourcePosition", 0);
        setField(term881942, term881942.getClass(), "jsType", null);
        setDoubleField(term881958, term881958.getClass(), "number", 0.0);
        setIntField(term881958, term881958.getClass(), "type", 98);
        setField(term881958, term881958.getClass(), "next", null);
        setField(term881958, term881958.getClass(), "first", null);
        setField(term881958, term881958.getClass(), "last", null);
        setField(term881958, term881958.getClass(), "propListHead", null);
        setIntField(term881958, term881958.getClass(), "sourcePosition", 0);
        setField(term881958, term881958.getClass(), "jsType", null);
        setField(term881958, term881958.getClass(), "parent", null);
        setField(term881942, term881942.getClass(), "parent", term881958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term880593;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term880501, args);
        assertTrue(recursiveEquals(term880501, term882030));
        assertTrue(recursiveEquals(term880593, term882031));
        assertTrue(recursiveEquals(retValue, term881942));
    }

};


