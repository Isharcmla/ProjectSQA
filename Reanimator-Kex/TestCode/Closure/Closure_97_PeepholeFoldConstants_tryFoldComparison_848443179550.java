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

public class PeepholeFoldConstants_tryFoldComparison_848443179550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145806;
     Object term145898;
     Object term145990;
     Object term146076;
     Object term146144;
     Object term146145;
     Object term146146;
     Object term146147;
     Object term146117;

    public PeepholeFoldConstants_tryFoldComparison_848443179550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145806 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term145898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145898, term145898.getClass(), "type", 16);
        term145990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145990, term145990.getClass(), "type", 16);
        term146076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term146144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term146144, term146144.getClass(), "currentTraversal", null);
        term146145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term146145, term146145.getClass(), "number", 0.0);
        setIntField(term146145, term146145.getClass(), "type", 16);
        setField(term146145, term146145.getClass(), "next", null);
        setField(term146145, term146145.getClass(), "first", null);
        setField(term146145, term146145.getClass(), "last", null);
        setField(term146145, term146145.getClass(), "propListHead", null);
        setIntField(term146145, term146145.getClass(), "sourcePosition", 0);
        setField(term146145, term146145.getClass(), "jsType", null);
        setField(term146145, term146145.getClass(), "parent", null);
        term146146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term146146, term146146.getClass(), "number", 0.0);
        setIntField(term146146, term146146.getClass(), "type", 16);
        setField(term146146, term146146.getClass(), "next", null);
        setField(term146146, term146146.getClass(), "first", null);
        setField(term146146, term146146.getClass(), "last", null);
        setField(term146146, term146146.getClass(), "propListHead", null);
        setIntField(term146146, term146146.getClass(), "sourcePosition", 0);
        setField(term146146, term146146.getClass(), "jsType", null);
        setField(term146146, term146146.getClass(), "parent", null);
        term146147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term146147, term146147.getClass(), "functionName", null);
        setBooleanField(term146147, term146147.getClass(), "itsNeedsActivation", false);
        setIntField(term146147, term146147.getClass(), "itsFunctionType", 0);
        setBooleanField(term146147, term146147.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term146147, term146147.getClass(), "encodedSourceStart", 0);
        setIntField(term146147, term146147.getClass(), "encodedSourceEnd", 0);
        setField(term146147, term146147.getClass(), "sourceName", null);
        setIntField(term146147, term146147.getClass(), "baseLineno", 0);
        setIntField(term146147, term146147.getClass(), "endLineno", 0);
        setField(term146147, term146147.getClass(), "functions", null);
        setField(term146147, term146147.getClass(), "regexps", null);
        setField(term146147, term146147.getClass(), "itsVariables", null);
        setField(term146147, term146147.getClass(), "itsConst", null);
        setField(term146147, term146147.getClass(), "itsVariableNames", null);
        setIntField(term146147, term146147.getClass(), "varStart", 0);
        setField(term146147, term146147.getClass(), "compilerData", null);
        setIntField(term146147, term146147.getClass(), "type", 0);
        setField(term146147, term146147.getClass(), "next", null);
        setField(term146147, term146147.getClass(), "first", null);
        setField(term146147, term146147.getClass(), "last", null);
        setField(term146147, term146147.getClass(), "propListHead", null);
        setIntField(term146147, term146147.getClass(), "sourcePosition", 0);
        setField(term146147, term146147.getClass(), "jsType", null);
        setField(term146147, term146147.getClass(), "parent", null);
        term146117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term146117, term146117.getClass(), "number", 0.0);
        setIntField(term146117, term146117.getClass(), "type", 16);
        setField(term146117, term146117.getClass(), "next", null);
        setField(term146117, term146117.getClass(), "first", null);
        setField(term146117, term146117.getClass(), "last", null);
        setField(term146117, term146117.getClass(), "propListHead", null);
        setIntField(term146117, term146117.getClass(), "sourcePosition", 0);
        setField(term146117, term146117.getClass(), "jsType", null);
        setField(term146117, term146117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term145898;
        args[1] = term145990;
        args[2] = term146076;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term145806, args);
        assertTrue(recursiveEquals(term145806, term146144));
        assertTrue(recursiveEquals(term145898, term146145));
        assertTrue(recursiveEquals(term145990, term146146));
        assertTrue(recursiveEquals(term146076, term146147));
        assertTrue(recursiveEquals(retValue, term146117));
    }

};


