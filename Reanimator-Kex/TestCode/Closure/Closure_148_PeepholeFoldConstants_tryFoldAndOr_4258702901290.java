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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309496;
     Object term309625;
     Object term310490;
     Object term310491;
     Object term310492;
     Object term310454;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309496 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term309625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term309625, term309625.getClass(), "parent", null);
        setIntField(term309625, term309625.getClass(), "type", 47);
        term310490 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term310490, term310490.getClass(), "currentTraversal", null);
        term310491 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310491, term310491.getClass(), "functionName", null);
        setBooleanField(term310491, term310491.getClass(), "itsNeedsActivation", false);
        setIntField(term310491, term310491.getClass(), "itsFunctionType", 0);
        setBooleanField(term310491, term310491.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310491, term310491.getClass(), "encodedSourceStart", 0);
        setIntField(term310491, term310491.getClass(), "encodedSourceEnd", 0);
        setField(term310491, term310491.getClass(), "sourceName", null);
        setIntField(term310491, term310491.getClass(), "baseLineno", 0);
        setIntField(term310491, term310491.getClass(), "endLineno", 0);
        setField(term310491, term310491.getClass(), "functions", null);
        setField(term310491, term310491.getClass(), "regexps", null);
        setField(term310491, term310491.getClass(), "itsVariables", null);
        setField(term310491, term310491.getClass(), "itsConst", null);
        setField(term310491, term310491.getClass(), "itsVariableNames", null);
        setIntField(term310491, term310491.getClass(), "varStart", 0);
        setField(term310491, term310491.getClass(), "compilerData", null);
        setIntField(term310491, term310491.getClass(), "type", 47);
        setField(term310491, term310491.getClass(), "next", null);
        setField(term310491, term310491.getClass(), "first", null);
        setField(term310491, term310491.getClass(), "last", null);
        setField(term310491, term310491.getClass(), "propListHead", null);
        setIntField(term310491, term310491.getClass(), "sourcePosition", 0);
        setField(term310491, term310491.getClass(), "jsType", null);
        setField(term310491, term310491.getClass(), "parent", null);
        term310492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310492, term310492.getClass(), "functionName", null);
        setBooleanField(term310492, term310492.getClass(), "itsNeedsActivation", false);
        setIntField(term310492, term310492.getClass(), "itsFunctionType", 0);
        setBooleanField(term310492, term310492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310492, term310492.getClass(), "encodedSourceStart", 0);
        setIntField(term310492, term310492.getClass(), "encodedSourceEnd", 0);
        setField(term310492, term310492.getClass(), "sourceName", null);
        setIntField(term310492, term310492.getClass(), "baseLineno", 0);
        setIntField(term310492, term310492.getClass(), "endLineno", 0);
        setField(term310492, term310492.getClass(), "functions", null);
        setField(term310492, term310492.getClass(), "regexps", null);
        setField(term310492, term310492.getClass(), "itsVariables", null);
        setField(term310492, term310492.getClass(), "itsConst", null);
        setField(term310492, term310492.getClass(), "itsVariableNames", null);
        setIntField(term310492, term310492.getClass(), "varStart", 0);
        setField(term310492, term310492.getClass(), "compilerData", null);
        setIntField(term310492, term310492.getClass(), "type", 47);
        setField(term310492, term310492.getClass(), "next", null);
        setField(term310492, term310492.getClass(), "first", null);
        setField(term310492, term310492.getClass(), "last", null);
        setField(term310492, term310492.getClass(), "propListHead", null);
        setIntField(term310492, term310492.getClass(), "sourcePosition", 0);
        setField(term310492, term310492.getClass(), "jsType", null);
        setField(term310492, term310492.getClass(), "parent", null);
        term310454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310454, term310454.getClass(), "functionName", null);
        setBooleanField(term310454, term310454.getClass(), "itsNeedsActivation", false);
        setIntField(term310454, term310454.getClass(), "itsFunctionType", 0);
        setBooleanField(term310454, term310454.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310454, term310454.getClass(), "encodedSourceStart", 0);
        setIntField(term310454, term310454.getClass(), "encodedSourceEnd", 0);
        setField(term310454, term310454.getClass(), "sourceName", null);
        setIntField(term310454, term310454.getClass(), "baseLineno", 0);
        setIntField(term310454, term310454.getClass(), "endLineno", 0);
        setField(term310454, term310454.getClass(), "functions", null);
        setField(term310454, term310454.getClass(), "regexps", null);
        setField(term310454, term310454.getClass(), "itsVariables", null);
        setField(term310454, term310454.getClass(), "itsConst", null);
        setField(term310454, term310454.getClass(), "itsVariableNames", null);
        setIntField(term310454, term310454.getClass(), "varStart", 0);
        setField(term310454, term310454.getClass(), "compilerData", null);
        setIntField(term310454, term310454.getClass(), "type", 47);
        setField(term310454, term310454.getClass(), "next", null);
        setField(term310454, term310454.getClass(), "first", null);
        setField(term310454, term310454.getClass(), "last", null);
        setField(term310454, term310454.getClass(), "propListHead", null);
        setIntField(term310454, term310454.getClass(), "sourcePosition", 0);
        setField(term310454, term310454.getClass(), "jsType", null);
        setField(term310454, term310454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term309625;
        args[1] = term309625;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term309496, args);
        assertTrue(recursiveEquals(term309496, term310490));
        assertTrue(recursiveEquals(term309625, term310491));
        assertTrue(recursiveEquals(term309625, term310492));
        assertTrue(recursiveEquals(retValue, term310454));
    }

};


