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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85201;
     Object term85293;
     Object term85955;
     Object term85956;
     Object term85892;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term85293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85475 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term85385, term85385.getClass(), "next", term85475);
        setIntField(term85385, term85385.getClass(), "type", 14);
        setField(term85293, term85293.getClass(), "first", term85385);
        setIntField(term85293, term85293.getClass(), "type", 14);
        term85955 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term85955, term85955.getClass(), "currentTraversal", null);
        term85956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85958 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term85956, term85956.getClass(), "number", 0.0);
        setIntField(term85956, term85956.getClass(), "type", 14);
        setField(term85956, term85956.getClass(), "next", null);
        setDoubleField(term85957, term85957.getClass(), "number", 0.0);
        setIntField(term85957, term85957.getClass(), "type", 14);
        setIntField(term85958, term85958.getClass(), "encodedSourceStart", 0);
        setIntField(term85958, term85958.getClass(), "encodedSourceEnd", 0);
        setField(term85958, term85958.getClass(), "sourceName", null);
        setIntField(term85958, term85958.getClass(), "baseLineno", 0);
        setIntField(term85958, term85958.getClass(), "endLineno", 0);
        setField(term85958, term85958.getClass(), "functions", null);
        setField(term85958, term85958.getClass(), "regexps", null);
        setField(term85958, term85958.getClass(), "itsVariables", null);
        setField(term85958, term85958.getClass(), "itsConst", null);
        setField(term85958, term85958.getClass(), "itsVariableNames", null);
        setIntField(term85958, term85958.getClass(), "varStart", 0);
        setField(term85958, term85958.getClass(), "compilerData", null);
        setIntField(term85958, term85958.getClass(), "type", 0);
        setField(term85958, term85958.getClass(), "next", null);
        setField(term85958, term85958.getClass(), "first", null);
        setField(term85958, term85958.getClass(), "last", null);
        setField(term85958, term85958.getClass(), "propListHead", null);
        setIntField(term85958, term85958.getClass(), "sourcePosition", 0);
        setField(term85958, term85958.getClass(), "jsType", null);
        setField(term85958, term85958.getClass(), "parent", null);
        setField(term85957, term85957.getClass(), "next", term85958);
        setField(term85957, term85957.getClass(), "first", null);
        setField(term85957, term85957.getClass(), "last", null);
        setField(term85957, term85957.getClass(), "propListHead", null);
        setIntField(term85957, term85957.getClass(), "sourcePosition", 0);
        setField(term85957, term85957.getClass(), "jsType", null);
        setField(term85957, term85957.getClass(), "parent", null);
        setField(term85956, term85956.getClass(), "first", term85957);
        setField(term85956, term85956.getClass(), "last", null);
        setField(term85956, term85956.getClass(), "propListHead", null);
        setIntField(term85956, term85956.getClass(), "sourcePosition", 0);
        setField(term85956, term85956.getClass(), "jsType", null);
        setField(term85956, term85956.getClass(), "parent", null);
        term85892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85898 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term85892, term85892.getClass(), "number", 0.0);
        setIntField(term85892, term85892.getClass(), "type", 14);
        setField(term85892, term85892.getClass(), "next", null);
        setDoubleField(term85895, term85895.getClass(), "number", 0.0);
        setIntField(term85895, term85895.getClass(), "type", 14);
        setIntField(term85898, term85898.getClass(), "encodedSourceStart", 0);
        setIntField(term85898, term85898.getClass(), "encodedSourceEnd", 0);
        setField(term85898, term85898.getClass(), "sourceName", null);
        setIntField(term85898, term85898.getClass(), "baseLineno", 0);
        setIntField(term85898, term85898.getClass(), "endLineno", 0);
        setField(term85898, term85898.getClass(), "functions", null);
        setField(term85898, term85898.getClass(), "regexps", null);
        setField(term85898, term85898.getClass(), "itsVariables", null);
        setField(term85898, term85898.getClass(), "itsConst", null);
        setField(term85898, term85898.getClass(), "itsVariableNames", null);
        setIntField(term85898, term85898.getClass(), "varStart", 0);
        setField(term85898, term85898.getClass(), "compilerData", null);
        setIntField(term85898, term85898.getClass(), "type", 0);
        setField(term85898, term85898.getClass(), "next", null);
        setField(term85898, term85898.getClass(), "first", null);
        setField(term85898, term85898.getClass(), "last", null);
        setField(term85898, term85898.getClass(), "propListHead", null);
        setIntField(term85898, term85898.getClass(), "sourcePosition", 0);
        setField(term85898, term85898.getClass(), "jsType", null);
        setField(term85898, term85898.getClass(), "parent", null);
        setField(term85895, term85895.getClass(), "next", term85898);
        setField(term85895, term85895.getClass(), "first", null);
        setField(term85895, term85895.getClass(), "last", null);
        setField(term85895, term85895.getClass(), "propListHead", null);
        setIntField(term85895, term85895.getClass(), "sourcePosition", 0);
        setField(term85895, term85895.getClass(), "jsType", null);
        setField(term85895, term85895.getClass(), "parent", null);
        setField(term85892, term85892.getClass(), "first", term85895);
        setField(term85892, term85892.getClass(), "last", null);
        setField(term85892, term85892.getClass(), "propListHead", null);
        setIntField(term85892, term85892.getClass(), "sourcePosition", 0);
        setField(term85892, term85892.getClass(), "jsType", null);
        setField(term85892, term85892.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85293;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term85201, args);
        assertTrue(recursiveEquals(term85201, term85955));
        assertTrue(recursiveEquals(term85293, term85956));
        assertTrue(recursiveEquals(retValue, term85892));
    }

};


