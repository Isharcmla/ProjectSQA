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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184507;
     Object term184599;
     Object term185086;
     Object term185087;
     Object term185046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term184599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184689 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term184599, term184599.getClass(), "first", term184599);
        setField(term184599, term184599.getClass(), "next", term184689);
        setIntField(term184599, term184599.getClass(), "type", 33);
        term185086 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term185086, term185086.getClass(), "currentTraversal", null);
        term185087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185088 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term185087, term185087.getClass(), "str", null);
        setIntField(term185087, term185087.getClass(), "type", 33);
        setIntField(term185088, term185088.getClass(), "encodedSourceStart", 0);
        setIntField(term185088, term185088.getClass(), "encodedSourceEnd", 0);
        setField(term185088, term185088.getClass(), "sourceName", null);
        setIntField(term185088, term185088.getClass(), "baseLineno", 0);
        setIntField(term185088, term185088.getClass(), "endLineno", 0);
        setField(term185088, term185088.getClass(), "functions", null);
        setField(term185088, term185088.getClass(), "regexps", null);
        setField(term185088, term185088.getClass(), "itsVariables", null);
        setField(term185088, term185088.getClass(), "itsConst", null);
        setField(term185088, term185088.getClass(), "itsVariableNames", null);
        setIntField(term185088, term185088.getClass(), "varStart", 0);
        setField(term185088, term185088.getClass(), "compilerData", null);
        setIntField(term185088, term185088.getClass(), "type", 0);
        setField(term185088, term185088.getClass(), "next", null);
        setField(term185088, term185088.getClass(), "first", null);
        setField(term185088, term185088.getClass(), "last", null);
        setField(term185088, term185088.getClass(), "propListHead", null);
        setIntField(term185088, term185088.getClass(), "sourcePosition", 0);
        setField(term185088, term185088.getClass(), "jsType", null);
        setField(term185088, term185088.getClass(), "parent", null);
        setField(term185087, term185087.getClass(), "next", term185088);
        setField(term185087, term185087.getClass(), "first", term185087);
        setField(term185087, term185087.getClass(), "last", null);
        setField(term185087, term185087.getClass(), "propListHead", null);
        setIntField(term185087, term185087.getClass(), "sourcePosition", 0);
        setField(term185087, term185087.getClass(), "jsType", null);
        setField(term185087, term185087.getClass(), "parent", null);
        term185046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185048 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term185046, term185046.getClass(), "str", null);
        setIntField(term185046, term185046.getClass(), "type", 33);
        setIntField(term185048, term185048.getClass(), "encodedSourceStart", 0);
        setIntField(term185048, term185048.getClass(), "encodedSourceEnd", 0);
        setField(term185048, term185048.getClass(), "sourceName", null);
        setIntField(term185048, term185048.getClass(), "baseLineno", 0);
        setIntField(term185048, term185048.getClass(), "endLineno", 0);
        setField(term185048, term185048.getClass(), "functions", null);
        setField(term185048, term185048.getClass(), "regexps", null);
        setField(term185048, term185048.getClass(), "itsVariables", null);
        setField(term185048, term185048.getClass(), "itsConst", null);
        setField(term185048, term185048.getClass(), "itsVariableNames", null);
        setIntField(term185048, term185048.getClass(), "varStart", 0);
        setField(term185048, term185048.getClass(), "compilerData", null);
        setIntField(term185048, term185048.getClass(), "type", 0);
        setField(term185048, term185048.getClass(), "next", null);
        setField(term185048, term185048.getClass(), "first", null);
        setField(term185048, term185048.getClass(), "last", null);
        setField(term185048, term185048.getClass(), "propListHead", null);
        setIntField(term185048, term185048.getClass(), "sourcePosition", 0);
        setField(term185048, term185048.getClass(), "jsType", null);
        setField(term185048, term185048.getClass(), "parent", null);
        setField(term185046, term185046.getClass(), "next", term185048);
        setField(term185046, term185046.getClass(), "first", term185046);
        setField(term185046, term185046.getClass(), "last", null);
        setField(term185046, term185046.getClass(), "propListHead", null);
        setIntField(term185046, term185046.getClass(), "sourcePosition", 0);
        setField(term185046, term185046.getClass(), "jsType", null);
        setField(term185046, term185046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term184599;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term184507, args);
        assertTrue(recursiveEquals(term184507, term185086));
        assertTrue(recursiveEquals(term184599, term185087));
        assertTrue(recursiveEquals(retValue, term185046));
    }

};


