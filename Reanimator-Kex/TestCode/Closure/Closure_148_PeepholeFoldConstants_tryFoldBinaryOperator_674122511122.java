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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20917;
     Object term20987;
     Object term21286;
     Object term21287;
     Object term21208;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21077 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term21167 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term21077, term21077.getClass(), "next", term21167);
        setIntField(term21077, term21077.getClass(), "type", 0);
        setField(term20987, term20987.getClass(), "first", term21077);
        setIntField(term20987, term20987.getClass(), "type", 101);
        setField(term20987, term20987.getClass(), "parent", null);
        term21286 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21286, term21286.getClass(), "currentTraversal", null);
        term21287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21288 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term21289 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term21287, term21287.getClass(), "type", 101);
        setField(term21287, term21287.getClass(), "next", null);
        setIntField(term21288, term21288.getClass(), "encodedSourceStart", 0);
        setIntField(term21288, term21288.getClass(), "encodedSourceEnd", 0);
        setField(term21288, term21288.getClass(), "sourceName", null);
        setIntField(term21288, term21288.getClass(), "baseLineno", 0);
        setIntField(term21288, term21288.getClass(), "endLineno", 0);
        setField(term21288, term21288.getClass(), "functions", null);
        setField(term21288, term21288.getClass(), "regexps", null);
        setField(term21288, term21288.getClass(), "itsVariables", null);
        setField(term21288, term21288.getClass(), "itsConst", null);
        setField(term21288, term21288.getClass(), "itsVariableNames", null);
        setIntField(term21288, term21288.getClass(), "varStart", 0);
        setField(term21288, term21288.getClass(), "compilerData", null);
        setIntField(term21288, term21288.getClass(), "type", 0);
        setIntField(term21289, term21289.getClass(), "encodedSourceStart", 0);
        setIntField(term21289, term21289.getClass(), "encodedSourceEnd", 0);
        setField(term21289, term21289.getClass(), "sourceName", null);
        setIntField(term21289, term21289.getClass(), "baseLineno", 0);
        setIntField(term21289, term21289.getClass(), "endLineno", 0);
        setField(term21289, term21289.getClass(), "functions", null);
        setField(term21289, term21289.getClass(), "regexps", null);
        setField(term21289, term21289.getClass(), "itsVariables", null);
        setField(term21289, term21289.getClass(), "itsConst", null);
        setField(term21289, term21289.getClass(), "itsVariableNames", null);
        setIntField(term21289, term21289.getClass(), "varStart", 0);
        setField(term21289, term21289.getClass(), "compilerData", null);
        setIntField(term21289, term21289.getClass(), "type", 0);
        setField(term21289, term21289.getClass(), "next", null);
        setField(term21289, term21289.getClass(), "first", null);
        setField(term21289, term21289.getClass(), "last", null);
        setField(term21289, term21289.getClass(), "propListHead", null);
        setIntField(term21289, term21289.getClass(), "sourcePosition", 0);
        setField(term21289, term21289.getClass(), "jsType", null);
        setField(term21289, term21289.getClass(), "parent", null);
        setField(term21288, term21288.getClass(), "next", term21289);
        setField(term21288, term21288.getClass(), "first", null);
        setField(term21288, term21288.getClass(), "last", null);
        setField(term21288, term21288.getClass(), "propListHead", null);
        setIntField(term21288, term21288.getClass(), "sourcePosition", 0);
        setField(term21288, term21288.getClass(), "jsType", null);
        setField(term21288, term21288.getClass(), "parent", null);
        setField(term21287, term21287.getClass(), "first", term21288);
        setField(term21287, term21287.getClass(), "last", null);
        setField(term21287, term21287.getClass(), "propListHead", null);
        setIntField(term21287, term21287.getClass(), "sourcePosition", 0);
        setField(term21287, term21287.getClass(), "jsType", null);
        setField(term21287, term21287.getClass(), "parent", null);
        term21208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21210 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term21217 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term21208, term21208.getClass(), "type", 101);
        setField(term21208, term21208.getClass(), "next", null);
        setIntField(term21210, term21210.getClass(), "encodedSourceStart", 0);
        setIntField(term21210, term21210.getClass(), "encodedSourceEnd", 0);
        setField(term21210, term21210.getClass(), "sourceName", null);
        setIntField(term21210, term21210.getClass(), "baseLineno", 0);
        setIntField(term21210, term21210.getClass(), "endLineno", 0);
        setField(term21210, term21210.getClass(), "functions", null);
        setField(term21210, term21210.getClass(), "regexps", null);
        setField(term21210, term21210.getClass(), "itsVariables", null);
        setField(term21210, term21210.getClass(), "itsConst", null);
        setField(term21210, term21210.getClass(), "itsVariableNames", null);
        setIntField(term21210, term21210.getClass(), "varStart", 0);
        setField(term21210, term21210.getClass(), "compilerData", null);
        setIntField(term21210, term21210.getClass(), "type", 0);
        setIntField(term21217, term21217.getClass(), "encodedSourceStart", 0);
        setIntField(term21217, term21217.getClass(), "encodedSourceEnd", 0);
        setField(term21217, term21217.getClass(), "sourceName", null);
        setIntField(term21217, term21217.getClass(), "baseLineno", 0);
        setIntField(term21217, term21217.getClass(), "endLineno", 0);
        setField(term21217, term21217.getClass(), "functions", null);
        setField(term21217, term21217.getClass(), "regexps", null);
        setField(term21217, term21217.getClass(), "itsVariables", null);
        setField(term21217, term21217.getClass(), "itsConst", null);
        setField(term21217, term21217.getClass(), "itsVariableNames", null);
        setIntField(term21217, term21217.getClass(), "varStart", 0);
        setField(term21217, term21217.getClass(), "compilerData", null);
        setIntField(term21217, term21217.getClass(), "type", 0);
        setField(term21217, term21217.getClass(), "next", null);
        setField(term21217, term21217.getClass(), "first", null);
        setField(term21217, term21217.getClass(), "last", null);
        setField(term21217, term21217.getClass(), "propListHead", null);
        setIntField(term21217, term21217.getClass(), "sourcePosition", 0);
        setField(term21217, term21217.getClass(), "jsType", null);
        setField(term21217, term21217.getClass(), "parent", null);
        setField(term21210, term21210.getClass(), "next", term21217);
        setField(term21210, term21210.getClass(), "first", null);
        setField(term21210, term21210.getClass(), "last", null);
        setField(term21210, term21210.getClass(), "propListHead", null);
        setIntField(term21210, term21210.getClass(), "sourcePosition", 0);
        setField(term21210, term21210.getClass(), "jsType", null);
        setField(term21210, term21210.getClass(), "parent", null);
        setField(term21208, term21208.getClass(), "first", term21210);
        setField(term21208, term21208.getClass(), "last", null);
        setField(term21208, term21208.getClass(), "propListHead", null);
        setIntField(term21208, term21208.getClass(), "sourcePosition", 0);
        setField(term21208, term21208.getClass(), "jsType", null);
        setField(term21208, term21208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20987;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term20917, args);
        assertTrue(recursiveEquals(term20917, term21286));
        assertTrue(recursiveEquals(term20987, term21287));
        assertTrue(recursiveEquals(retValue, term21208));
    }

};


