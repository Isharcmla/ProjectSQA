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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828902;
     Object term828994;
     Object term829867;
     Object term829868;
     Object term829788;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term828902 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term828994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term829084 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term829176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term829176, term829176.getClass(), "type", 44);
        setField(term829084, term829084.getClass(), "next", term829176);
        setIntField(term829084, term829084.getClass(), "type", 0);
        setField(term828994, term828994.getClass(), "first", term829084);
        setIntField(term828994, term828994.getClass(), "type", 101);
        setField(term828994, term828994.getClass(), "parent", term829176);
        term829867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term829867, term829867.getClass(), "currentTraversal", null);
        term829868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term829869 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term829870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term829868, term829868.getClass(), "number", 0.0);
        setIntField(term829868, term829868.getClass(), "type", 101);
        setField(term829868, term829868.getClass(), "next", null);
        setIntField(term829869, term829869.getClass(), "encodedSourceStart", 0);
        setIntField(term829869, term829869.getClass(), "encodedSourceEnd", 0);
        setField(term829869, term829869.getClass(), "sourceName", null);
        setIntField(term829869, term829869.getClass(), "baseLineno", 0);
        setIntField(term829869, term829869.getClass(), "endLineno", 0);
        setField(term829869, term829869.getClass(), "functions", null);
        setField(term829869, term829869.getClass(), "regexps", null);
        setField(term829869, term829869.getClass(), "itsVariables", null);
        setField(term829869, term829869.getClass(), "itsConst", null);
        setField(term829869, term829869.getClass(), "itsVariableNames", null);
        setIntField(term829869, term829869.getClass(), "varStart", 0);
        setField(term829869, term829869.getClass(), "compilerData", null);
        setIntField(term829869, term829869.getClass(), "type", 0);
        setDoubleField(term829870, term829870.getClass(), "number", 0.0);
        setIntField(term829870, term829870.getClass(), "type", 44);
        setField(term829870, term829870.getClass(), "next", null);
        setField(term829870, term829870.getClass(), "first", null);
        setField(term829870, term829870.getClass(), "last", null);
        setField(term829870, term829870.getClass(), "propListHead", null);
        setIntField(term829870, term829870.getClass(), "sourcePosition", 0);
        setField(term829870, term829870.getClass(), "jsType", null);
        setField(term829870, term829870.getClass(), "parent", null);
        setField(term829869, term829869.getClass(), "next", term829870);
        setField(term829869, term829869.getClass(), "first", null);
        setField(term829869, term829869.getClass(), "last", null);
        setField(term829869, term829869.getClass(), "propListHead", null);
        setIntField(term829869, term829869.getClass(), "sourcePosition", 0);
        setField(term829869, term829869.getClass(), "jsType", null);
        setField(term829869, term829869.getClass(), "parent", null);
        setField(term829868, term829868.getClass(), "first", term829869);
        setField(term829868, term829868.getClass(), "last", null);
        setField(term829868, term829868.getClass(), "propListHead", null);
        setIntField(term829868, term829868.getClass(), "sourcePosition", 0);
        setField(term829868, term829868.getClass(), "jsType", null);
        setField(term829868, term829868.getClass(), "parent", term829870);
        term829788 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term829791 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term829798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term829788, term829788.getClass(), "number", 0.0);
        setIntField(term829788, term829788.getClass(), "type", 101);
        setField(term829788, term829788.getClass(), "next", null);
        setIntField(term829791, term829791.getClass(), "encodedSourceStart", 0);
        setIntField(term829791, term829791.getClass(), "encodedSourceEnd", 0);
        setField(term829791, term829791.getClass(), "sourceName", null);
        setIntField(term829791, term829791.getClass(), "baseLineno", 0);
        setIntField(term829791, term829791.getClass(), "endLineno", 0);
        setField(term829791, term829791.getClass(), "functions", null);
        setField(term829791, term829791.getClass(), "regexps", null);
        setField(term829791, term829791.getClass(), "itsVariables", null);
        setField(term829791, term829791.getClass(), "itsConst", null);
        setField(term829791, term829791.getClass(), "itsVariableNames", null);
        setIntField(term829791, term829791.getClass(), "varStart", 0);
        setField(term829791, term829791.getClass(), "compilerData", null);
        setIntField(term829791, term829791.getClass(), "type", 0);
        setDoubleField(term829798, term829798.getClass(), "number", 0.0);
        setIntField(term829798, term829798.getClass(), "type", 44);
        setField(term829798, term829798.getClass(), "next", null);
        setField(term829798, term829798.getClass(), "first", null);
        setField(term829798, term829798.getClass(), "last", null);
        setField(term829798, term829798.getClass(), "propListHead", null);
        setIntField(term829798, term829798.getClass(), "sourcePosition", 0);
        setField(term829798, term829798.getClass(), "jsType", null);
        setField(term829798, term829798.getClass(), "parent", null);
        setField(term829791, term829791.getClass(), "next", term829798);
        setField(term829791, term829791.getClass(), "first", null);
        setField(term829791, term829791.getClass(), "last", null);
        setField(term829791, term829791.getClass(), "propListHead", null);
        setIntField(term829791, term829791.getClass(), "sourcePosition", 0);
        setField(term829791, term829791.getClass(), "jsType", null);
        setField(term829791, term829791.getClass(), "parent", null);
        setField(term829788, term829788.getClass(), "first", term829791);
        setField(term829788, term829788.getClass(), "last", null);
        setField(term829788, term829788.getClass(), "propListHead", null);
        setIntField(term829788, term829788.getClass(), "sourcePosition", 0);
        setField(term829788, term829788.getClass(), "jsType", null);
        setField(term829788, term829788.getClass(), "parent", term829798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term828994;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term828902, args);
        assertTrue(recursiveEquals(term828902, term829867));
        assertTrue(recursiveEquals(term828994, term829868));
        assertTrue(recursiveEquals(retValue, term829788));
    }

};


