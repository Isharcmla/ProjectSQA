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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642210;
     Object term642302;
     Object term642987;
     Object term642988;
     Object term642902;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term642302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term642392 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term642484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term642576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term642484, term642484.getClass(), "type", 47);
        setField(term642392, term642392.getClass(), "next", term642484);
        setIntField(term642392, term642392.getClass(), "type", 0);
        setField(term642302, term642302.getClass(), "first", term642392);
        setIntField(term642302, term642302.getClass(), "type", 101);
        setField(term642302, term642302.getClass(), "parent", term642576);
        term642987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term642987, term642987.getClass(), "currentTraversal", null);
        term642988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term642989 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term642990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term642991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term642988, term642988.getClass(), "str", null);
        setIntField(term642988, term642988.getClass(), "type", 101);
        setField(term642988, term642988.getClass(), "next", null);
        setIntField(term642989, term642989.getClass(), "encodedSourceStart", 0);
        setIntField(term642989, term642989.getClass(), "encodedSourceEnd", 0);
        setField(term642989, term642989.getClass(), "sourceName", null);
        setIntField(term642989, term642989.getClass(), "baseLineno", 0);
        setIntField(term642989, term642989.getClass(), "endLineno", 0);
        setField(term642989, term642989.getClass(), "functions", null);
        setField(term642989, term642989.getClass(), "regexps", null);
        setField(term642989, term642989.getClass(), "itsVariables", null);
        setField(term642989, term642989.getClass(), "itsConst", null);
        setField(term642989, term642989.getClass(), "itsVariableNames", null);
        setIntField(term642989, term642989.getClass(), "varStart", 0);
        setField(term642989, term642989.getClass(), "compilerData", null);
        setIntField(term642989, term642989.getClass(), "type", 0);
        setDoubleField(term642990, term642990.getClass(), "number", 0.0);
        setIntField(term642990, term642990.getClass(), "type", 47);
        setField(term642990, term642990.getClass(), "next", null);
        setField(term642990, term642990.getClass(), "first", null);
        setField(term642990, term642990.getClass(), "last", null);
        setField(term642990, term642990.getClass(), "propListHead", null);
        setIntField(term642990, term642990.getClass(), "sourcePosition", 0);
        setField(term642990, term642990.getClass(), "jsType", null);
        setField(term642990, term642990.getClass(), "parent", null);
        setField(term642989, term642989.getClass(), "next", term642990);
        setField(term642989, term642989.getClass(), "first", null);
        setField(term642989, term642989.getClass(), "last", null);
        setField(term642989, term642989.getClass(), "propListHead", null);
        setIntField(term642989, term642989.getClass(), "sourcePosition", 0);
        setField(term642989, term642989.getClass(), "jsType", null);
        setField(term642989, term642989.getClass(), "parent", null);
        setField(term642988, term642988.getClass(), "first", term642989);
        setField(term642988, term642988.getClass(), "last", null);
        setField(term642988, term642988.getClass(), "propListHead", null);
        setIntField(term642988, term642988.getClass(), "sourcePosition", 0);
        setField(term642988, term642988.getClass(), "jsType", null);
        setDoubleField(term642991, term642991.getClass(), "number", 0.0);
        setIntField(term642991, term642991.getClass(), "type", 0);
        setField(term642991, term642991.getClass(), "next", null);
        setField(term642991, term642991.getClass(), "first", null);
        setField(term642991, term642991.getClass(), "last", null);
        setField(term642991, term642991.getClass(), "propListHead", null);
        setIntField(term642991, term642991.getClass(), "sourcePosition", 0);
        setField(term642991, term642991.getClass(), "jsType", null);
        setField(term642991, term642991.getClass(), "parent", null);
        setField(term642988, term642988.getClass(), "parent", term642991);
        term642902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term642904 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term642911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term642917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term642902, term642902.getClass(), "str", null);
        setIntField(term642902, term642902.getClass(), "type", 101);
        setField(term642902, term642902.getClass(), "next", null);
        setIntField(term642904, term642904.getClass(), "encodedSourceStart", 0);
        setIntField(term642904, term642904.getClass(), "encodedSourceEnd", 0);
        setField(term642904, term642904.getClass(), "sourceName", null);
        setIntField(term642904, term642904.getClass(), "baseLineno", 0);
        setIntField(term642904, term642904.getClass(), "endLineno", 0);
        setField(term642904, term642904.getClass(), "functions", null);
        setField(term642904, term642904.getClass(), "regexps", null);
        setField(term642904, term642904.getClass(), "itsVariables", null);
        setField(term642904, term642904.getClass(), "itsConst", null);
        setField(term642904, term642904.getClass(), "itsVariableNames", null);
        setIntField(term642904, term642904.getClass(), "varStart", 0);
        setField(term642904, term642904.getClass(), "compilerData", null);
        setIntField(term642904, term642904.getClass(), "type", 0);
        setDoubleField(term642911, term642911.getClass(), "number", 0.0);
        setIntField(term642911, term642911.getClass(), "type", 47);
        setField(term642911, term642911.getClass(), "next", null);
        setField(term642911, term642911.getClass(), "first", null);
        setField(term642911, term642911.getClass(), "last", null);
        setField(term642911, term642911.getClass(), "propListHead", null);
        setIntField(term642911, term642911.getClass(), "sourcePosition", 0);
        setField(term642911, term642911.getClass(), "jsType", null);
        setField(term642911, term642911.getClass(), "parent", null);
        setField(term642904, term642904.getClass(), "next", term642911);
        setField(term642904, term642904.getClass(), "first", null);
        setField(term642904, term642904.getClass(), "last", null);
        setField(term642904, term642904.getClass(), "propListHead", null);
        setIntField(term642904, term642904.getClass(), "sourcePosition", 0);
        setField(term642904, term642904.getClass(), "jsType", null);
        setField(term642904, term642904.getClass(), "parent", null);
        setField(term642902, term642902.getClass(), "first", term642904);
        setField(term642902, term642902.getClass(), "last", null);
        setField(term642902, term642902.getClass(), "propListHead", null);
        setIntField(term642902, term642902.getClass(), "sourcePosition", 0);
        setField(term642902, term642902.getClass(), "jsType", null);
        setDoubleField(term642917, term642917.getClass(), "number", 0.0);
        setIntField(term642917, term642917.getClass(), "type", 0);
        setField(term642917, term642917.getClass(), "next", null);
        setField(term642917, term642917.getClass(), "first", null);
        setField(term642917, term642917.getClass(), "last", null);
        setField(term642917, term642917.getClass(), "propListHead", null);
        setIntField(term642917, term642917.getClass(), "sourcePosition", 0);
        setField(term642917, term642917.getClass(), "jsType", null);
        setField(term642917, term642917.getClass(), "parent", null);
        setField(term642902, term642902.getClass(), "parent", term642917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term642302;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term642210, args);
        assertTrue(recursiveEquals(term642210, term642987));
        assertTrue(recursiveEquals(term642302, term642988));
        assertTrue(recursiveEquals(retValue, term642902));
    }

};


