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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667188;
     Object term667280;
     Object term667619;
     Object term667620;
     Object term667551;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667188 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term667280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667370 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term667462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term667370, term667370.getClass(), "next", term667462);
        setIntField(term667370, term667370.getClass(), "type", 0);
        setField(term667280, term667280.getClass(), "first", term667370);
        setIntField(term667280, term667280.getClass(), "type", 100);
        setField(term667280, term667280.getClass(), "parent", null);
        term667619 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term667619, term667619.getClass(), "currentTraversal", null);
        term667620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667621 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term667622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term667620, term667620.getClass(), "number", 0.0);
        setIntField(term667620, term667620.getClass(), "type", 100);
        setField(term667620, term667620.getClass(), "next", null);
        setIntField(term667621, term667621.getClass(), "encodedSourceStart", 0);
        setIntField(term667621, term667621.getClass(), "encodedSourceEnd", 0);
        setField(term667621, term667621.getClass(), "sourceName", null);
        setIntField(term667621, term667621.getClass(), "baseLineno", 0);
        setIntField(term667621, term667621.getClass(), "endLineno", 0);
        setField(term667621, term667621.getClass(), "functions", null);
        setField(term667621, term667621.getClass(), "regexps", null);
        setField(term667621, term667621.getClass(), "itsVariables", null);
        setField(term667621, term667621.getClass(), "itsConst", null);
        setField(term667621, term667621.getClass(), "itsVariableNames", null);
        setIntField(term667621, term667621.getClass(), "varStart", 0);
        setField(term667621, term667621.getClass(), "compilerData", null);
        setIntField(term667621, term667621.getClass(), "type", 0);
        setDoubleField(term667622, term667622.getClass(), "number", 0.0);
        setIntField(term667622, term667622.getClass(), "type", 0);
        setField(term667622, term667622.getClass(), "next", null);
        setField(term667622, term667622.getClass(), "first", null);
        setField(term667622, term667622.getClass(), "last", null);
        setField(term667622, term667622.getClass(), "propListHead", null);
        setIntField(term667622, term667622.getClass(), "sourcePosition", 0);
        setField(term667622, term667622.getClass(), "jsType", null);
        setField(term667622, term667622.getClass(), "parent", null);
        setField(term667621, term667621.getClass(), "next", term667622);
        setField(term667621, term667621.getClass(), "first", null);
        setField(term667621, term667621.getClass(), "last", null);
        setField(term667621, term667621.getClass(), "propListHead", null);
        setIntField(term667621, term667621.getClass(), "sourcePosition", 0);
        setField(term667621, term667621.getClass(), "jsType", null);
        setField(term667621, term667621.getClass(), "parent", null);
        setField(term667620, term667620.getClass(), "first", term667621);
        setField(term667620, term667620.getClass(), "last", null);
        setField(term667620, term667620.getClass(), "propListHead", null);
        setIntField(term667620, term667620.getClass(), "sourcePosition", 0);
        setField(term667620, term667620.getClass(), "jsType", null);
        setField(term667620, term667620.getClass(), "parent", null);
        term667551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667554 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term667561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term667551, term667551.getClass(), "number", 0.0);
        setIntField(term667551, term667551.getClass(), "type", 100);
        setField(term667551, term667551.getClass(), "next", null);
        setIntField(term667554, term667554.getClass(), "encodedSourceStart", 0);
        setIntField(term667554, term667554.getClass(), "encodedSourceEnd", 0);
        setField(term667554, term667554.getClass(), "sourceName", null);
        setIntField(term667554, term667554.getClass(), "baseLineno", 0);
        setIntField(term667554, term667554.getClass(), "endLineno", 0);
        setField(term667554, term667554.getClass(), "functions", null);
        setField(term667554, term667554.getClass(), "regexps", null);
        setField(term667554, term667554.getClass(), "itsVariables", null);
        setField(term667554, term667554.getClass(), "itsConst", null);
        setField(term667554, term667554.getClass(), "itsVariableNames", null);
        setIntField(term667554, term667554.getClass(), "varStart", 0);
        setField(term667554, term667554.getClass(), "compilerData", null);
        setIntField(term667554, term667554.getClass(), "type", 0);
        setDoubleField(term667561, term667561.getClass(), "number", 0.0);
        setIntField(term667561, term667561.getClass(), "type", 0);
        setField(term667561, term667561.getClass(), "next", null);
        setField(term667561, term667561.getClass(), "first", null);
        setField(term667561, term667561.getClass(), "last", null);
        setField(term667561, term667561.getClass(), "propListHead", null);
        setIntField(term667561, term667561.getClass(), "sourcePosition", 0);
        setField(term667561, term667561.getClass(), "jsType", null);
        setField(term667561, term667561.getClass(), "parent", null);
        setField(term667554, term667554.getClass(), "next", term667561);
        setField(term667554, term667554.getClass(), "first", null);
        setField(term667554, term667554.getClass(), "last", null);
        setField(term667554, term667554.getClass(), "propListHead", null);
        setIntField(term667554, term667554.getClass(), "sourcePosition", 0);
        setField(term667554, term667554.getClass(), "jsType", null);
        setField(term667554, term667554.getClass(), "parent", null);
        setField(term667551, term667551.getClass(), "first", term667554);
        setField(term667551, term667551.getClass(), "last", null);
        setField(term667551, term667551.getClass(), "propListHead", null);
        setIntField(term667551, term667551.getClass(), "sourcePosition", 0);
        setField(term667551, term667551.getClass(), "jsType", null);
        setField(term667551, term667551.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term667280;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term667188, args);
        assertTrue(recursiveEquals(term667188, term667619));
        assertTrue(recursiveEquals(term667280, term667620));
        assertTrue(recursiveEquals(retValue, term667551));
    }

};


