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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681861;
     Object term681953;
     Object term682480;
     Object term682481;
     Object term682437;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term681953 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term682039, term682039.getClass(), "next", term682109);
        setField(term681953, term681953.getClass(), "first", term682039);
        setIntField(term681953, term681953.getClass(), "type", 20);
        term682480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term682480, term682480.getClass(), "currentTraversal", null);
        term682481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682482 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term682481, term682481.getClass(), "str", null);
        setIntField(term682481, term682481.getClass(), "type", 20);
        setField(term682481, term682481.getClass(), "next", null);
        setField(term682482, term682482.getClass(), "functionName", null);
        setBooleanField(term682482, term682482.getClass(), "itsNeedsActivation", false);
        setIntField(term682482, term682482.getClass(), "itsFunctionType", 0);
        setBooleanField(term682482, term682482.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682482, term682482.getClass(), "encodedSourceStart", 0);
        setIntField(term682482, term682482.getClass(), "encodedSourceEnd", 0);
        setField(term682482, term682482.getClass(), "sourceName", null);
        setIntField(term682482, term682482.getClass(), "baseLineno", 0);
        setIntField(term682482, term682482.getClass(), "endLineno", 0);
        setField(term682482, term682482.getClass(), "functions", null);
        setField(term682482, term682482.getClass(), "regexps", null);
        setField(term682482, term682482.getClass(), "itsVariables", null);
        setField(term682482, term682482.getClass(), "itsConst", null);
        setField(term682482, term682482.getClass(), "itsVariableNames", null);
        setIntField(term682482, term682482.getClass(), "varStart", 0);
        setField(term682482, term682482.getClass(), "compilerData", null);
        setIntField(term682482, term682482.getClass(), "type", 0);
        setIntField(term682483, term682483.getClass(), "type", 0);
        setField(term682483, term682483.getClass(), "next", null);
        setField(term682483, term682483.getClass(), "first", null);
        setField(term682483, term682483.getClass(), "last", null);
        setField(term682483, term682483.getClass(), "propListHead", null);
        setIntField(term682483, term682483.getClass(), "sourcePosition", 0);
        setField(term682483, term682483.getClass(), "jsType", null);
        setField(term682483, term682483.getClass(), "parent", null);
        setField(term682482, term682482.getClass(), "next", term682483);
        setField(term682482, term682482.getClass(), "first", null);
        setField(term682482, term682482.getClass(), "last", null);
        setField(term682482, term682482.getClass(), "propListHead", null);
        setIntField(term682482, term682482.getClass(), "sourcePosition", 0);
        setField(term682482, term682482.getClass(), "jsType", null);
        setField(term682482, term682482.getClass(), "parent", null);
        setField(term682481, term682481.getClass(), "first", term682482);
        setField(term682481, term682481.getClass(), "last", null);
        setField(term682481, term682481.getClass(), "propListHead", null);
        setIntField(term682481, term682481.getClass(), "sourcePosition", 0);
        setField(term682481, term682481.getClass(), "jsType", null);
        setField(term682481, term682481.getClass(), "parent", null);
        term682437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term682437, term682437.getClass(), "str", null);
        setIntField(term682437, term682437.getClass(), "type", 20);
        setField(term682437, term682437.getClass(), "next", null);
        setField(term682439, term682439.getClass(), "functionName", null);
        setBooleanField(term682439, term682439.getClass(), "itsNeedsActivation", false);
        setIntField(term682439, term682439.getClass(), "itsFunctionType", 0);
        setBooleanField(term682439, term682439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682439, term682439.getClass(), "encodedSourceStart", 0);
        setIntField(term682439, term682439.getClass(), "encodedSourceEnd", 0);
        setField(term682439, term682439.getClass(), "sourceName", null);
        setIntField(term682439, term682439.getClass(), "baseLineno", 0);
        setIntField(term682439, term682439.getClass(), "endLineno", 0);
        setField(term682439, term682439.getClass(), "functions", null);
        setField(term682439, term682439.getClass(), "regexps", null);
        setField(term682439, term682439.getClass(), "itsVariables", null);
        setField(term682439, term682439.getClass(), "itsConst", null);
        setField(term682439, term682439.getClass(), "itsVariableNames", null);
        setIntField(term682439, term682439.getClass(), "varStart", 0);
        setField(term682439, term682439.getClass(), "compilerData", null);
        setIntField(term682439, term682439.getClass(), "type", 0);
        setIntField(term682449, term682449.getClass(), "type", 0);
        setField(term682449, term682449.getClass(), "next", null);
        setField(term682449, term682449.getClass(), "first", null);
        setField(term682449, term682449.getClass(), "last", null);
        setField(term682449, term682449.getClass(), "propListHead", null);
        setIntField(term682449, term682449.getClass(), "sourcePosition", 0);
        setField(term682449, term682449.getClass(), "jsType", null);
        setField(term682449, term682449.getClass(), "parent", null);
        setField(term682439, term682439.getClass(), "next", term682449);
        setField(term682439, term682439.getClass(), "first", null);
        setField(term682439, term682439.getClass(), "last", null);
        setField(term682439, term682439.getClass(), "propListHead", null);
        setIntField(term682439, term682439.getClass(), "sourcePosition", 0);
        setField(term682439, term682439.getClass(), "jsType", null);
        setField(term682439, term682439.getClass(), "parent", null);
        setField(term682437, term682437.getClass(), "first", term682439);
        setField(term682437, term682437.getClass(), "last", null);
        setField(term682437, term682437.getClass(), "propListHead", null);
        setIntField(term682437, term682437.getClass(), "sourcePosition", 0);
        setField(term682437, term682437.getClass(), "jsType", null);
        setField(term682437, term682437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term681953;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term681861, args);
        assertTrue(recursiveEquals(term681861, term682480));
        assertTrue(recursiveEquals(term681953, term682481));
        assertTrue(recursiveEquals(retValue, term682437));
    }

};


