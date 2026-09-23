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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709954;
     Object term710046;
     Object term710855;
     Object term710856;
     Object term710803;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term710046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710228 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term710138, term710138.getClass(), "next", term710228);
        setIntField(term710138, term710138.getClass(), "type", 39);
        setField(term710046, term710046.getClass(), "first", term710138);
        setIntField(term710046, term710046.getClass(), "type", 11);
        term710855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term710855, term710855.getClass(), "currentTraversal", null);
        term710856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710858 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term710856, term710856.getClass(), "number", 0.0);
        setIntField(term710856, term710856.getClass(), "type", 11);
        setField(term710856, term710856.getClass(), "next", null);
        setDoubleField(term710857, term710857.getClass(), "number", 0.0);
        setIntField(term710857, term710857.getClass(), "type", 39);
        setIntField(term710858, term710858.getClass(), "encodedSourceStart", 0);
        setIntField(term710858, term710858.getClass(), "encodedSourceEnd", 0);
        setField(term710858, term710858.getClass(), "sourceName", null);
        setIntField(term710858, term710858.getClass(), "baseLineno", 0);
        setIntField(term710858, term710858.getClass(), "endLineno", 0);
        setField(term710858, term710858.getClass(), "functions", null);
        setField(term710858, term710858.getClass(), "regexps", null);
        setField(term710858, term710858.getClass(), "itsVariables", null);
        setField(term710858, term710858.getClass(), "itsConst", null);
        setField(term710858, term710858.getClass(), "itsVariableNames", null);
        setIntField(term710858, term710858.getClass(), "varStart", 0);
        setField(term710858, term710858.getClass(), "compilerData", null);
        setIntField(term710858, term710858.getClass(), "type", 0);
        setField(term710858, term710858.getClass(), "next", null);
        setField(term710858, term710858.getClass(), "first", null);
        setField(term710858, term710858.getClass(), "last", null);
        setField(term710858, term710858.getClass(), "propListHead", null);
        setIntField(term710858, term710858.getClass(), "sourcePosition", 0);
        setField(term710858, term710858.getClass(), "jsType", null);
        setField(term710858, term710858.getClass(), "parent", null);
        setField(term710857, term710857.getClass(), "next", term710858);
        setField(term710857, term710857.getClass(), "first", null);
        setField(term710857, term710857.getClass(), "last", null);
        setField(term710857, term710857.getClass(), "propListHead", null);
        setIntField(term710857, term710857.getClass(), "sourcePosition", 0);
        setField(term710857, term710857.getClass(), "jsType", null);
        setField(term710857, term710857.getClass(), "parent", null);
        setField(term710856, term710856.getClass(), "first", term710857);
        setField(term710856, term710856.getClass(), "last", null);
        setField(term710856, term710856.getClass(), "propListHead", null);
        setIntField(term710856, term710856.getClass(), "sourcePosition", 0);
        setField(term710856, term710856.getClass(), "jsType", null);
        setField(term710856, term710856.getClass(), "parent", null);
        term710803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710809 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term710803, term710803.getClass(), "number", 0.0);
        setIntField(term710803, term710803.getClass(), "type", 11);
        setField(term710803, term710803.getClass(), "next", null);
        setDoubleField(term710806, term710806.getClass(), "number", 0.0);
        setIntField(term710806, term710806.getClass(), "type", 39);
        setIntField(term710809, term710809.getClass(), "encodedSourceStart", 0);
        setIntField(term710809, term710809.getClass(), "encodedSourceEnd", 0);
        setField(term710809, term710809.getClass(), "sourceName", null);
        setIntField(term710809, term710809.getClass(), "baseLineno", 0);
        setIntField(term710809, term710809.getClass(), "endLineno", 0);
        setField(term710809, term710809.getClass(), "functions", null);
        setField(term710809, term710809.getClass(), "regexps", null);
        setField(term710809, term710809.getClass(), "itsVariables", null);
        setField(term710809, term710809.getClass(), "itsConst", null);
        setField(term710809, term710809.getClass(), "itsVariableNames", null);
        setIntField(term710809, term710809.getClass(), "varStart", 0);
        setField(term710809, term710809.getClass(), "compilerData", null);
        setIntField(term710809, term710809.getClass(), "type", 0);
        setField(term710809, term710809.getClass(), "next", null);
        setField(term710809, term710809.getClass(), "first", null);
        setField(term710809, term710809.getClass(), "last", null);
        setField(term710809, term710809.getClass(), "propListHead", null);
        setIntField(term710809, term710809.getClass(), "sourcePosition", 0);
        setField(term710809, term710809.getClass(), "jsType", null);
        setField(term710809, term710809.getClass(), "parent", null);
        setField(term710806, term710806.getClass(), "next", term710809);
        setField(term710806, term710806.getClass(), "first", null);
        setField(term710806, term710806.getClass(), "last", null);
        setField(term710806, term710806.getClass(), "propListHead", null);
        setIntField(term710806, term710806.getClass(), "sourcePosition", 0);
        setField(term710806, term710806.getClass(), "jsType", null);
        setField(term710806, term710806.getClass(), "parent", null);
        setField(term710803, term710803.getClass(), "first", term710806);
        setField(term710803, term710803.getClass(), "last", null);
        setField(term710803, term710803.getClass(), "propListHead", null);
        setIntField(term710803, term710803.getClass(), "sourcePosition", 0);
        setField(term710803, term710803.getClass(), "jsType", null);
        setField(term710803, term710803.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term710046;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term709954, args);
        assertTrue(recursiveEquals(term709954, term710855));
        assertTrue(recursiveEquals(term710046, term710856));
        assertTrue(recursiveEquals(retValue, term710803));
    }

};


