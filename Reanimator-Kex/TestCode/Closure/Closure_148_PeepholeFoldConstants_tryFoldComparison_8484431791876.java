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

public class PeepholeFoldConstants_tryFoldComparison_8484431791876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494800;
     Object term494886;
     Object term494972;
     Object term495064;
     Object term496124;
     Object term496125;
     Object term496126;
     Object term496127;
     Object term496093;

    public PeepholeFoldConstants_tryFoldComparison_8484431791876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494800 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term494886 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term494886, term494886.getClass(), "type", 14);
        term494972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term494972, term494972.getClass(), "type", 42);
        term495064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term495064, term495064.getClass(), "type", 42);
        term496124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term496124, term496124.getClass(), "currentTraversal", null);
        term496125 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term496125, term496125.getClass(), "functionName", null);
        setBooleanField(term496125, term496125.getClass(), "itsNeedsActivation", false);
        setIntField(term496125, term496125.getClass(), "itsFunctionType", 0);
        setBooleanField(term496125, term496125.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term496125, term496125.getClass(), "encodedSourceStart", 0);
        setIntField(term496125, term496125.getClass(), "encodedSourceEnd", 0);
        setField(term496125, term496125.getClass(), "sourceName", null);
        setIntField(term496125, term496125.getClass(), "baseLineno", 0);
        setIntField(term496125, term496125.getClass(), "endLineno", 0);
        setField(term496125, term496125.getClass(), "functions", null);
        setField(term496125, term496125.getClass(), "regexps", null);
        setField(term496125, term496125.getClass(), "itsVariables", null);
        setField(term496125, term496125.getClass(), "itsConst", null);
        setField(term496125, term496125.getClass(), "itsVariableNames", null);
        setIntField(term496125, term496125.getClass(), "varStart", 0);
        setField(term496125, term496125.getClass(), "compilerData", null);
        setIntField(term496125, term496125.getClass(), "type", 42);
        setField(term496125, term496125.getClass(), "next", null);
        setField(term496125, term496125.getClass(), "first", null);
        setField(term496125, term496125.getClass(), "last", null);
        setField(term496125, term496125.getClass(), "propListHead", null);
        setIntField(term496125, term496125.getClass(), "sourcePosition", 0);
        setField(term496125, term496125.getClass(), "jsType", null);
        setField(term496125, term496125.getClass(), "parent", null);
        term496126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term496126, term496126.getClass(), "functionName", null);
        setBooleanField(term496126, term496126.getClass(), "itsNeedsActivation", false);
        setIntField(term496126, term496126.getClass(), "itsFunctionType", 0);
        setBooleanField(term496126, term496126.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term496126, term496126.getClass(), "encodedSourceStart", 0);
        setIntField(term496126, term496126.getClass(), "encodedSourceEnd", 0);
        setField(term496126, term496126.getClass(), "sourceName", null);
        setIntField(term496126, term496126.getClass(), "baseLineno", 0);
        setIntField(term496126, term496126.getClass(), "endLineno", 0);
        setField(term496126, term496126.getClass(), "functions", null);
        setField(term496126, term496126.getClass(), "regexps", null);
        setField(term496126, term496126.getClass(), "itsVariables", null);
        setField(term496126, term496126.getClass(), "itsConst", null);
        setField(term496126, term496126.getClass(), "itsVariableNames", null);
        setIntField(term496126, term496126.getClass(), "varStart", 0);
        setField(term496126, term496126.getClass(), "compilerData", null);
        setIntField(term496126, term496126.getClass(), "type", 14);
        setField(term496126, term496126.getClass(), "next", null);
        setField(term496126, term496126.getClass(), "first", null);
        setField(term496126, term496126.getClass(), "last", null);
        setField(term496126, term496126.getClass(), "propListHead", null);
        setIntField(term496126, term496126.getClass(), "sourcePosition", 0);
        setField(term496126, term496126.getClass(), "jsType", null);
        setField(term496126, term496126.getClass(), "parent", null);
        term496127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term496127, term496127.getClass(), "number", 0.0);
        setIntField(term496127, term496127.getClass(), "type", 42);
        setField(term496127, term496127.getClass(), "next", null);
        setField(term496127, term496127.getClass(), "first", null);
        setField(term496127, term496127.getClass(), "last", null);
        setField(term496127, term496127.getClass(), "propListHead", null);
        setIntField(term496127, term496127.getClass(), "sourcePosition", 0);
        setField(term496127, term496127.getClass(), "jsType", null);
        setField(term496127, term496127.getClass(), "parent", null);
        term496093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term496093, term496093.getClass(), "functionName", null);
        setBooleanField(term496093, term496093.getClass(), "itsNeedsActivation", false);
        setIntField(term496093, term496093.getClass(), "itsFunctionType", 0);
        setBooleanField(term496093, term496093.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term496093, term496093.getClass(), "encodedSourceStart", 0);
        setIntField(term496093, term496093.getClass(), "encodedSourceEnd", 0);
        setField(term496093, term496093.getClass(), "sourceName", null);
        setIntField(term496093, term496093.getClass(), "baseLineno", 0);
        setIntField(term496093, term496093.getClass(), "endLineno", 0);
        setField(term496093, term496093.getClass(), "functions", null);
        setField(term496093, term496093.getClass(), "regexps", null);
        setField(term496093, term496093.getClass(), "itsVariables", null);
        setField(term496093, term496093.getClass(), "itsConst", null);
        setField(term496093, term496093.getClass(), "itsVariableNames", null);
        setIntField(term496093, term496093.getClass(), "varStart", 0);
        setField(term496093, term496093.getClass(), "compilerData", null);
        setIntField(term496093, term496093.getClass(), "type", 14);
        setField(term496093, term496093.getClass(), "next", null);
        setField(term496093, term496093.getClass(), "first", null);
        setField(term496093, term496093.getClass(), "last", null);
        setField(term496093, term496093.getClass(), "propListHead", null);
        setIntField(term496093, term496093.getClass(), "sourcePosition", 0);
        setField(term496093, term496093.getClass(), "jsType", null);
        setField(term496093, term496093.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term494886;
        args[1] = term494972;
        args[2] = term495064;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term494800, args);
        assertTrue(recursiveEquals(term494800, term496124));
        assertTrue(recursiveEquals(term494886, term496125));
        assertTrue(recursiveEquals(term494972, term496126));
        assertTrue(recursiveEquals(term495064, term496127));
        assertTrue(recursiveEquals(retValue, term496093));
    }

};


