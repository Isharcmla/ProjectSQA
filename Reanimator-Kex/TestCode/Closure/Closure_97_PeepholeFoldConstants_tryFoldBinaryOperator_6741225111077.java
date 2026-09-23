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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334153;
     Object term334245;
     Object term334936;
     Object term334937;
     Object term334879;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334153 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term334245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334337, term334337.getClass(), "next", term334423);
        setIntField(term334337, term334337.getClass(), "type", 39);
        setField(term334245, term334245.getClass(), "first", term334337);
        setIntField(term334245, term334245.getClass(), "type", 20);
        term334936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term334936, term334936.getClass(), "currentTraversal", null);
        term334937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term334937, term334937.getClass(), "number", 0.0);
        setIntField(term334937, term334937.getClass(), "type", 20);
        setField(term334937, term334937.getClass(), "next", null);
        setDoubleField(term334938, term334938.getClass(), "number", 0.0);
        setIntField(term334938, term334938.getClass(), "type", 39);
        setField(term334939, term334939.getClass(), "functionName", null);
        setBooleanField(term334939, term334939.getClass(), "itsNeedsActivation", false);
        setIntField(term334939, term334939.getClass(), "itsFunctionType", 0);
        setBooleanField(term334939, term334939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334939, term334939.getClass(), "encodedSourceStart", 0);
        setIntField(term334939, term334939.getClass(), "encodedSourceEnd", 0);
        setField(term334939, term334939.getClass(), "sourceName", null);
        setIntField(term334939, term334939.getClass(), "baseLineno", 0);
        setIntField(term334939, term334939.getClass(), "endLineno", 0);
        setField(term334939, term334939.getClass(), "functions", null);
        setField(term334939, term334939.getClass(), "regexps", null);
        setField(term334939, term334939.getClass(), "itsVariables", null);
        setField(term334939, term334939.getClass(), "itsConst", null);
        setField(term334939, term334939.getClass(), "itsVariableNames", null);
        setIntField(term334939, term334939.getClass(), "varStart", 0);
        setField(term334939, term334939.getClass(), "compilerData", null);
        setIntField(term334939, term334939.getClass(), "type", 0);
        setField(term334939, term334939.getClass(), "next", null);
        setField(term334939, term334939.getClass(), "first", null);
        setField(term334939, term334939.getClass(), "last", null);
        setField(term334939, term334939.getClass(), "propListHead", null);
        setIntField(term334939, term334939.getClass(), "sourcePosition", 0);
        setField(term334939, term334939.getClass(), "jsType", null);
        setField(term334939, term334939.getClass(), "parent", null);
        setField(term334938, term334938.getClass(), "next", term334939);
        setField(term334938, term334938.getClass(), "first", null);
        setField(term334938, term334938.getClass(), "last", null);
        setField(term334938, term334938.getClass(), "propListHead", null);
        setIntField(term334938, term334938.getClass(), "sourcePosition", 0);
        setField(term334938, term334938.getClass(), "jsType", null);
        setField(term334938, term334938.getClass(), "parent", null);
        setField(term334937, term334937.getClass(), "first", term334938);
        setField(term334937, term334937.getClass(), "last", null);
        setField(term334937, term334937.getClass(), "propListHead", null);
        setIntField(term334937, term334937.getClass(), "sourcePosition", 0);
        setField(term334937, term334937.getClass(), "jsType", null);
        setField(term334937, term334937.getClass(), "parent", null);
        term334879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334885 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term334879, term334879.getClass(), "number", 0.0);
        setIntField(term334879, term334879.getClass(), "type", 20);
        setField(term334879, term334879.getClass(), "next", null);
        setDoubleField(term334882, term334882.getClass(), "number", 0.0);
        setIntField(term334882, term334882.getClass(), "type", 39);
        setField(term334885, term334885.getClass(), "functionName", null);
        setBooleanField(term334885, term334885.getClass(), "itsNeedsActivation", false);
        setIntField(term334885, term334885.getClass(), "itsFunctionType", 0);
        setBooleanField(term334885, term334885.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334885, term334885.getClass(), "encodedSourceStart", 0);
        setIntField(term334885, term334885.getClass(), "encodedSourceEnd", 0);
        setField(term334885, term334885.getClass(), "sourceName", null);
        setIntField(term334885, term334885.getClass(), "baseLineno", 0);
        setIntField(term334885, term334885.getClass(), "endLineno", 0);
        setField(term334885, term334885.getClass(), "functions", null);
        setField(term334885, term334885.getClass(), "regexps", null);
        setField(term334885, term334885.getClass(), "itsVariables", null);
        setField(term334885, term334885.getClass(), "itsConst", null);
        setField(term334885, term334885.getClass(), "itsVariableNames", null);
        setIntField(term334885, term334885.getClass(), "varStart", 0);
        setField(term334885, term334885.getClass(), "compilerData", null);
        setIntField(term334885, term334885.getClass(), "type", 0);
        setField(term334885, term334885.getClass(), "next", null);
        setField(term334885, term334885.getClass(), "first", null);
        setField(term334885, term334885.getClass(), "last", null);
        setField(term334885, term334885.getClass(), "propListHead", null);
        setIntField(term334885, term334885.getClass(), "sourcePosition", 0);
        setField(term334885, term334885.getClass(), "jsType", null);
        setField(term334885, term334885.getClass(), "parent", null);
        setField(term334882, term334882.getClass(), "next", term334885);
        setField(term334882, term334882.getClass(), "first", null);
        setField(term334882, term334882.getClass(), "last", null);
        setField(term334882, term334882.getClass(), "propListHead", null);
        setIntField(term334882, term334882.getClass(), "sourcePosition", 0);
        setField(term334882, term334882.getClass(), "jsType", null);
        setField(term334882, term334882.getClass(), "parent", null);
        setField(term334879, term334879.getClass(), "first", term334882);
        setField(term334879, term334879.getClass(), "last", null);
        setField(term334879, term334879.getClass(), "propListHead", null);
        setIntField(term334879, term334879.getClass(), "sourcePosition", 0);
        setField(term334879, term334879.getClass(), "jsType", null);
        setField(term334879, term334879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term334245;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term334153, args);
        assertTrue(recursiveEquals(term334153, term334936));
        assertTrue(recursiveEquals(term334245, term334937));
        assertTrue(recursiveEquals(retValue, term334879));
    }

};


