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

public class PeepholeFoldConstants_tryFoldAndOr_425870290629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138151;
     Object term138243;
     Object term138329;
     Object term138415;
     Object term138966;
     Object term138967;
     Object term138968;
     Object term138969;
     Object term138911;

    public PeepholeFoldConstants_tryFoldAndOr_425870290629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138151 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term138243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term138243, term138243.getClass(), "parent", null);
        setIntField(term138243, term138243.getClass(), "type", 0);
        term138329 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term138329, term138329.getClass(), "type", 0);
        term138415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term138966 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term138966, term138966.getClass(), "currentTraversal", null);
        term138967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term138967, term138967.getClass(), "number", 0.0);
        setIntField(term138967, term138967.getClass(), "type", 0);
        setField(term138967, term138967.getClass(), "next", null);
        setField(term138967, term138967.getClass(), "first", null);
        setField(term138967, term138967.getClass(), "last", null);
        setField(term138967, term138967.getClass(), "propListHead", null);
        setIntField(term138967, term138967.getClass(), "sourcePosition", 0);
        setField(term138967, term138967.getClass(), "jsType", null);
        setField(term138967, term138967.getClass(), "parent", null);
        term138968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term138968, term138968.getClass(), "functionName", null);
        setBooleanField(term138968, term138968.getClass(), "itsNeedsActivation", false);
        setIntField(term138968, term138968.getClass(), "itsFunctionType", 0);
        setBooleanField(term138968, term138968.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138968, term138968.getClass(), "encodedSourceStart", 0);
        setIntField(term138968, term138968.getClass(), "encodedSourceEnd", 0);
        setField(term138968, term138968.getClass(), "sourceName", null);
        setIntField(term138968, term138968.getClass(), "baseLineno", 0);
        setIntField(term138968, term138968.getClass(), "endLineno", 0);
        setField(term138968, term138968.getClass(), "functions", null);
        setField(term138968, term138968.getClass(), "regexps", null);
        setField(term138968, term138968.getClass(), "itsVariables", null);
        setField(term138968, term138968.getClass(), "itsConst", null);
        setField(term138968, term138968.getClass(), "itsVariableNames", null);
        setIntField(term138968, term138968.getClass(), "varStart", 0);
        setField(term138968, term138968.getClass(), "compilerData", null);
        setIntField(term138968, term138968.getClass(), "type", 0);
        setField(term138968, term138968.getClass(), "next", null);
        setField(term138968, term138968.getClass(), "first", null);
        setField(term138968, term138968.getClass(), "last", null);
        setField(term138968, term138968.getClass(), "propListHead", null);
        setIntField(term138968, term138968.getClass(), "sourcePosition", 0);
        setField(term138968, term138968.getClass(), "jsType", null);
        setField(term138968, term138968.getClass(), "parent", null);
        term138969 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term138969, term138969.getClass(), "functionName", null);
        setBooleanField(term138969, term138969.getClass(), "itsNeedsActivation", false);
        setIntField(term138969, term138969.getClass(), "itsFunctionType", 0);
        setBooleanField(term138969, term138969.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138969, term138969.getClass(), "encodedSourceStart", 0);
        setIntField(term138969, term138969.getClass(), "encodedSourceEnd", 0);
        setField(term138969, term138969.getClass(), "sourceName", null);
        setIntField(term138969, term138969.getClass(), "baseLineno", 0);
        setIntField(term138969, term138969.getClass(), "endLineno", 0);
        setField(term138969, term138969.getClass(), "functions", null);
        setField(term138969, term138969.getClass(), "regexps", null);
        setField(term138969, term138969.getClass(), "itsVariables", null);
        setField(term138969, term138969.getClass(), "itsConst", null);
        setField(term138969, term138969.getClass(), "itsVariableNames", null);
        setIntField(term138969, term138969.getClass(), "varStart", 0);
        setField(term138969, term138969.getClass(), "compilerData", null);
        setIntField(term138969, term138969.getClass(), "type", 0);
        setField(term138969, term138969.getClass(), "next", null);
        setField(term138969, term138969.getClass(), "first", null);
        setField(term138969, term138969.getClass(), "last", null);
        setField(term138969, term138969.getClass(), "propListHead", null);
        setIntField(term138969, term138969.getClass(), "sourcePosition", 0);
        setField(term138969, term138969.getClass(), "jsType", null);
        setField(term138969, term138969.getClass(), "parent", null);
        term138911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term138911, term138911.getClass(), "number", 0.0);
        setIntField(term138911, term138911.getClass(), "type", 0);
        setField(term138911, term138911.getClass(), "next", null);
        setField(term138911, term138911.getClass(), "first", null);
        setField(term138911, term138911.getClass(), "last", null);
        setField(term138911, term138911.getClass(), "propListHead", null);
        setIntField(term138911, term138911.getClass(), "sourcePosition", 0);
        setField(term138911, term138911.getClass(), "jsType", null);
        setField(term138911, term138911.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term138243;
        args[1] = term138329;
        args[2] = term138415;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term138151, args);
        assertTrue(recursiveEquals(term138151, term138966));
        assertTrue(recursiveEquals(term138243, term138967));
        assertTrue(recursiveEquals(term138329, term138968));
        assertTrue(recursiveEquals(term138415, term138969));
        assertTrue(recursiveEquals(retValue, term138911));
    }

};


