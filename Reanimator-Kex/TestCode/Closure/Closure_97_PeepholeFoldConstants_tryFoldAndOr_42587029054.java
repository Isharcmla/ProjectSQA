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

public class PeepholeFoldConstants_tryFoldAndOr_42587029054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9485;
     Object term9614;
     Object term9700;
     Object term10010;
     Object term10011;
     Object term10012;
     Object term10013;
     Object term9959;

    public PeepholeFoldConstants_tryFoldAndOr_42587029054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9485 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term9614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9614, term9614.getClass(), "parent", null);
        setIntField(term9614, term9614.getClass(), "type", 0);
        term9700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term10010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term10010, term10010.getClass(), "currentTraversal", null);
        term10011 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10011, term10011.getClass(), "functionName", null);
        setBooleanField(term10011, term10011.getClass(), "itsNeedsActivation", false);
        setIntField(term10011, term10011.getClass(), "itsFunctionType", 0);
        setBooleanField(term10011, term10011.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10011, term10011.getClass(), "encodedSourceStart", 0);
        setIntField(term10011, term10011.getClass(), "encodedSourceEnd", 0);
        setField(term10011, term10011.getClass(), "sourceName", null);
        setIntField(term10011, term10011.getClass(), "baseLineno", 0);
        setIntField(term10011, term10011.getClass(), "endLineno", 0);
        setField(term10011, term10011.getClass(), "functions", null);
        setField(term10011, term10011.getClass(), "regexps", null);
        setField(term10011, term10011.getClass(), "itsVariables", null);
        setField(term10011, term10011.getClass(), "itsConst", null);
        setField(term10011, term10011.getClass(), "itsVariableNames", null);
        setIntField(term10011, term10011.getClass(), "varStart", 0);
        setField(term10011, term10011.getClass(), "compilerData", null);
        setIntField(term10011, term10011.getClass(), "type", 0);
        setField(term10011, term10011.getClass(), "next", null);
        setField(term10011, term10011.getClass(), "first", null);
        setField(term10011, term10011.getClass(), "last", null);
        setField(term10011, term10011.getClass(), "propListHead", null);
        setIntField(term10011, term10011.getClass(), "sourcePosition", 0);
        setField(term10011, term10011.getClass(), "jsType", null);
        setField(term10011, term10011.getClass(), "parent", null);
        term10012 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10012, term10012.getClass(), "functionName", null);
        setBooleanField(term10012, term10012.getClass(), "itsNeedsActivation", false);
        setIntField(term10012, term10012.getClass(), "itsFunctionType", 0);
        setBooleanField(term10012, term10012.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10012, term10012.getClass(), "encodedSourceStart", 0);
        setIntField(term10012, term10012.getClass(), "encodedSourceEnd", 0);
        setField(term10012, term10012.getClass(), "sourceName", null);
        setIntField(term10012, term10012.getClass(), "baseLineno", 0);
        setIntField(term10012, term10012.getClass(), "endLineno", 0);
        setField(term10012, term10012.getClass(), "functions", null);
        setField(term10012, term10012.getClass(), "regexps", null);
        setField(term10012, term10012.getClass(), "itsVariables", null);
        setField(term10012, term10012.getClass(), "itsConst", null);
        setField(term10012, term10012.getClass(), "itsVariableNames", null);
        setIntField(term10012, term10012.getClass(), "varStart", 0);
        setField(term10012, term10012.getClass(), "compilerData", null);
        setIntField(term10012, term10012.getClass(), "type", 0);
        setField(term10012, term10012.getClass(), "next", null);
        setField(term10012, term10012.getClass(), "first", null);
        setField(term10012, term10012.getClass(), "last", null);
        setField(term10012, term10012.getClass(), "propListHead", null);
        setIntField(term10012, term10012.getClass(), "sourcePosition", 0);
        setField(term10012, term10012.getClass(), "jsType", null);
        setField(term10012, term10012.getClass(), "parent", null);
        term10013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10013, term10013.getClass(), "functionName", null);
        setBooleanField(term10013, term10013.getClass(), "itsNeedsActivation", false);
        setIntField(term10013, term10013.getClass(), "itsFunctionType", 0);
        setBooleanField(term10013, term10013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10013, term10013.getClass(), "encodedSourceStart", 0);
        setIntField(term10013, term10013.getClass(), "encodedSourceEnd", 0);
        setField(term10013, term10013.getClass(), "sourceName", null);
        setIntField(term10013, term10013.getClass(), "baseLineno", 0);
        setIntField(term10013, term10013.getClass(), "endLineno", 0);
        setField(term10013, term10013.getClass(), "functions", null);
        setField(term10013, term10013.getClass(), "regexps", null);
        setField(term10013, term10013.getClass(), "itsVariables", null);
        setField(term10013, term10013.getClass(), "itsConst", null);
        setField(term10013, term10013.getClass(), "itsVariableNames", null);
        setIntField(term10013, term10013.getClass(), "varStart", 0);
        setField(term10013, term10013.getClass(), "compilerData", null);
        setIntField(term10013, term10013.getClass(), "type", 0);
        setField(term10013, term10013.getClass(), "next", null);
        setField(term10013, term10013.getClass(), "first", null);
        setField(term10013, term10013.getClass(), "last", null);
        setField(term10013, term10013.getClass(), "propListHead", null);
        setIntField(term10013, term10013.getClass(), "sourcePosition", 0);
        setField(term10013, term10013.getClass(), "jsType", null);
        setField(term10013, term10013.getClass(), "parent", null);
        term9959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9959, term9959.getClass(), "functionName", null);
        setBooleanField(term9959, term9959.getClass(), "itsNeedsActivation", false);
        setIntField(term9959, term9959.getClass(), "itsFunctionType", 0);
        setBooleanField(term9959, term9959.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term9959, term9959.getClass(), "encodedSourceStart", 0);
        setIntField(term9959, term9959.getClass(), "encodedSourceEnd", 0);
        setField(term9959, term9959.getClass(), "sourceName", null);
        setIntField(term9959, term9959.getClass(), "baseLineno", 0);
        setIntField(term9959, term9959.getClass(), "endLineno", 0);
        setField(term9959, term9959.getClass(), "functions", null);
        setField(term9959, term9959.getClass(), "regexps", null);
        setField(term9959, term9959.getClass(), "itsVariables", null);
        setField(term9959, term9959.getClass(), "itsConst", null);
        setField(term9959, term9959.getClass(), "itsVariableNames", null);
        setIntField(term9959, term9959.getClass(), "varStart", 0);
        setField(term9959, term9959.getClass(), "compilerData", null);
        setIntField(term9959, term9959.getClass(), "type", 0);
        setField(term9959, term9959.getClass(), "next", null);
        setField(term9959, term9959.getClass(), "first", null);
        setField(term9959, term9959.getClass(), "last", null);
        setField(term9959, term9959.getClass(), "propListHead", null);
        setIntField(term9959, term9959.getClass(), "sourcePosition", 0);
        setField(term9959, term9959.getClass(), "jsType", null);
        setField(term9959, term9959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term9614;
        args[1] = term9614;
        args[2] = term9700;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term9485, args);
        assertTrue(recursiveEquals(term9485, term10010));
        assertTrue(recursiveEquals(term9614, term10011));
        assertTrue(recursiveEquals(term9614, term10012));
        assertTrue(recursiveEquals(term9700, term10013));
        assertTrue(recursiveEquals(retValue, term9959));
    }

};


