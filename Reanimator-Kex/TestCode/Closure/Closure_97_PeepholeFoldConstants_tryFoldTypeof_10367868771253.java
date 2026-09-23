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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405896;
     Object term405986;
     Object term421520;
     Object term421521;
     Object term421478;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term405986 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term406076 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term405986, term405986.getClass(), "type", 32);
        setField(term405986, term405986.getClass(), "first", term406076);
        term421520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421520, term421520.getClass(), "currentTraversal", null);
        term421521 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term421522 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term421521, term421521.getClass(), "encodedSourceStart", 0);
        setIntField(term421521, term421521.getClass(), "encodedSourceEnd", 0);
        setField(term421521, term421521.getClass(), "sourceName", null);
        setIntField(term421521, term421521.getClass(), "baseLineno", 0);
        setIntField(term421521, term421521.getClass(), "endLineno", 0);
        setField(term421521, term421521.getClass(), "functions", null);
        setField(term421521, term421521.getClass(), "regexps", null);
        setField(term421521, term421521.getClass(), "itsVariables", null);
        setField(term421521, term421521.getClass(), "itsConst", null);
        setField(term421521, term421521.getClass(), "itsVariableNames", null);
        setIntField(term421521, term421521.getClass(), "varStart", 0);
        setField(term421521, term421521.getClass(), "compilerData", null);
        setIntField(term421521, term421521.getClass(), "type", 32);
        setField(term421521, term421521.getClass(), "next", null);
        setIntField(term421522, term421522.getClass(), "encodedSourceStart", 0);
        setIntField(term421522, term421522.getClass(), "encodedSourceEnd", 0);
        setField(term421522, term421522.getClass(), "sourceName", null);
        setIntField(term421522, term421522.getClass(), "baseLineno", 0);
        setIntField(term421522, term421522.getClass(), "endLineno", 0);
        setField(term421522, term421522.getClass(), "functions", null);
        setField(term421522, term421522.getClass(), "regexps", null);
        setField(term421522, term421522.getClass(), "itsVariables", null);
        setField(term421522, term421522.getClass(), "itsConst", null);
        setField(term421522, term421522.getClass(), "itsVariableNames", null);
        setIntField(term421522, term421522.getClass(), "varStart", 0);
        setField(term421522, term421522.getClass(), "compilerData", null);
        setIntField(term421522, term421522.getClass(), "type", 0);
        setField(term421522, term421522.getClass(), "next", null);
        setField(term421522, term421522.getClass(), "first", null);
        setField(term421522, term421522.getClass(), "last", null);
        setField(term421522, term421522.getClass(), "propListHead", null);
        setIntField(term421522, term421522.getClass(), "sourcePosition", 0);
        setField(term421522, term421522.getClass(), "jsType", null);
        setField(term421522, term421522.getClass(), "parent", null);
        setField(term421521, term421521.getClass(), "first", term421522);
        setField(term421521, term421521.getClass(), "last", null);
        setField(term421521, term421521.getClass(), "propListHead", null);
        setIntField(term421521, term421521.getClass(), "sourcePosition", 0);
        setField(term421521, term421521.getClass(), "jsType", null);
        setField(term421521, term421521.getClass(), "parent", null);
        term421478 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term421485 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term421478, term421478.getClass(), "encodedSourceStart", 0);
        setIntField(term421478, term421478.getClass(), "encodedSourceEnd", 0);
        setField(term421478, term421478.getClass(), "sourceName", null);
        setIntField(term421478, term421478.getClass(), "baseLineno", 0);
        setIntField(term421478, term421478.getClass(), "endLineno", 0);
        setField(term421478, term421478.getClass(), "functions", null);
        setField(term421478, term421478.getClass(), "regexps", null);
        setField(term421478, term421478.getClass(), "itsVariables", null);
        setField(term421478, term421478.getClass(), "itsConst", null);
        setField(term421478, term421478.getClass(), "itsVariableNames", null);
        setIntField(term421478, term421478.getClass(), "varStart", 0);
        setField(term421478, term421478.getClass(), "compilerData", null);
        setIntField(term421478, term421478.getClass(), "type", 32);
        setField(term421478, term421478.getClass(), "next", null);
        setIntField(term421485, term421485.getClass(), "encodedSourceStart", 0);
        setIntField(term421485, term421485.getClass(), "encodedSourceEnd", 0);
        setField(term421485, term421485.getClass(), "sourceName", null);
        setIntField(term421485, term421485.getClass(), "baseLineno", 0);
        setIntField(term421485, term421485.getClass(), "endLineno", 0);
        setField(term421485, term421485.getClass(), "functions", null);
        setField(term421485, term421485.getClass(), "regexps", null);
        setField(term421485, term421485.getClass(), "itsVariables", null);
        setField(term421485, term421485.getClass(), "itsConst", null);
        setField(term421485, term421485.getClass(), "itsVariableNames", null);
        setIntField(term421485, term421485.getClass(), "varStart", 0);
        setField(term421485, term421485.getClass(), "compilerData", null);
        setIntField(term421485, term421485.getClass(), "type", 0);
        setField(term421485, term421485.getClass(), "next", null);
        setField(term421485, term421485.getClass(), "first", null);
        setField(term421485, term421485.getClass(), "last", null);
        setField(term421485, term421485.getClass(), "propListHead", null);
        setIntField(term421485, term421485.getClass(), "sourcePosition", 0);
        setField(term421485, term421485.getClass(), "jsType", null);
        setField(term421485, term421485.getClass(), "parent", null);
        setField(term421478, term421478.getClass(), "first", term421485);
        setField(term421478, term421478.getClass(), "last", null);
        setField(term421478, term421478.getClass(), "propListHead", null);
        setIntField(term421478, term421478.getClass(), "sourcePosition", 0);
        setField(term421478, term421478.getClass(), "jsType", null);
        setField(term421478, term421478.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term405986;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term405896, args);
        assertTrue(recursiveEquals(term405896, term421520));
        assertTrue(recursiveEquals(term405986, term421521));
        assertTrue(recursiveEquals(retValue, term421478));
    }

};


