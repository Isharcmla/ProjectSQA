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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65428;
     Object term65518;
     Object term81112;
     Object term81113;
     Object term81046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65518 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term65608 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term65698 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term65608, term65608.getClass(), "next", term65698);
        setField(term65518, term65518.getClass(), "first", term65608);
        setIntField(term65518, term65518.getClass(), "type", 33);
        term81112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81112, term81112.getClass(), "currentTraversal", null);
        term81113 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81114 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81115 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term81113, term81113.getClass(), "encodedSourceStart", 0);
        setIntField(term81113, term81113.getClass(), "encodedSourceEnd", 0);
        setField(term81113, term81113.getClass(), "sourceName", null);
        setIntField(term81113, term81113.getClass(), "baseLineno", 0);
        setIntField(term81113, term81113.getClass(), "endLineno", 0);
        setField(term81113, term81113.getClass(), "functions", null);
        setField(term81113, term81113.getClass(), "regexps", null);
        setField(term81113, term81113.getClass(), "itsVariables", null);
        setField(term81113, term81113.getClass(), "itsConst", null);
        setField(term81113, term81113.getClass(), "itsVariableNames", null);
        setIntField(term81113, term81113.getClass(), "varStart", 0);
        setField(term81113, term81113.getClass(), "compilerData", null);
        setIntField(term81113, term81113.getClass(), "type", 33);
        setField(term81113, term81113.getClass(), "next", null);
        setIntField(term81114, term81114.getClass(), "encodedSourceStart", 0);
        setIntField(term81114, term81114.getClass(), "encodedSourceEnd", 0);
        setField(term81114, term81114.getClass(), "sourceName", null);
        setIntField(term81114, term81114.getClass(), "baseLineno", 0);
        setIntField(term81114, term81114.getClass(), "endLineno", 0);
        setField(term81114, term81114.getClass(), "functions", null);
        setField(term81114, term81114.getClass(), "regexps", null);
        setField(term81114, term81114.getClass(), "itsVariables", null);
        setField(term81114, term81114.getClass(), "itsConst", null);
        setField(term81114, term81114.getClass(), "itsVariableNames", null);
        setIntField(term81114, term81114.getClass(), "varStart", 0);
        setField(term81114, term81114.getClass(), "compilerData", null);
        setIntField(term81114, term81114.getClass(), "type", 0);
        setIntField(term81115, term81115.getClass(), "encodedSourceStart", 0);
        setIntField(term81115, term81115.getClass(), "encodedSourceEnd", 0);
        setField(term81115, term81115.getClass(), "sourceName", null);
        setIntField(term81115, term81115.getClass(), "baseLineno", 0);
        setIntField(term81115, term81115.getClass(), "endLineno", 0);
        setField(term81115, term81115.getClass(), "functions", null);
        setField(term81115, term81115.getClass(), "regexps", null);
        setField(term81115, term81115.getClass(), "itsVariables", null);
        setField(term81115, term81115.getClass(), "itsConst", null);
        setField(term81115, term81115.getClass(), "itsVariableNames", null);
        setIntField(term81115, term81115.getClass(), "varStart", 0);
        setField(term81115, term81115.getClass(), "compilerData", null);
        setIntField(term81115, term81115.getClass(), "type", 0);
        setField(term81115, term81115.getClass(), "next", null);
        setField(term81115, term81115.getClass(), "first", null);
        setField(term81115, term81115.getClass(), "last", null);
        setField(term81115, term81115.getClass(), "propListHead", null);
        setIntField(term81115, term81115.getClass(), "sourcePosition", 0);
        setField(term81115, term81115.getClass(), "jsType", null);
        setField(term81115, term81115.getClass(), "parent", null);
        setField(term81114, term81114.getClass(), "next", term81115);
        setField(term81114, term81114.getClass(), "first", null);
        setField(term81114, term81114.getClass(), "last", null);
        setField(term81114, term81114.getClass(), "propListHead", null);
        setIntField(term81114, term81114.getClass(), "sourcePosition", 0);
        setField(term81114, term81114.getClass(), "jsType", null);
        setField(term81114, term81114.getClass(), "parent", null);
        setField(term81113, term81113.getClass(), "first", term81114);
        setField(term81113, term81113.getClass(), "last", null);
        setField(term81113, term81113.getClass(), "propListHead", null);
        setIntField(term81113, term81113.getClass(), "sourcePosition", 0);
        setField(term81113, term81113.getClass(), "jsType", null);
        setField(term81113, term81113.getClass(), "parent", null);
        term81046 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81053 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81060 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term81046, term81046.getClass(), "encodedSourceStart", 0);
        setIntField(term81046, term81046.getClass(), "encodedSourceEnd", 0);
        setField(term81046, term81046.getClass(), "sourceName", null);
        setIntField(term81046, term81046.getClass(), "baseLineno", 0);
        setIntField(term81046, term81046.getClass(), "endLineno", 0);
        setField(term81046, term81046.getClass(), "functions", null);
        setField(term81046, term81046.getClass(), "regexps", null);
        setField(term81046, term81046.getClass(), "itsVariables", null);
        setField(term81046, term81046.getClass(), "itsConst", null);
        setField(term81046, term81046.getClass(), "itsVariableNames", null);
        setIntField(term81046, term81046.getClass(), "varStart", 0);
        setField(term81046, term81046.getClass(), "compilerData", null);
        setIntField(term81046, term81046.getClass(), "type", 33);
        setField(term81046, term81046.getClass(), "next", null);
        setIntField(term81053, term81053.getClass(), "encodedSourceStart", 0);
        setIntField(term81053, term81053.getClass(), "encodedSourceEnd", 0);
        setField(term81053, term81053.getClass(), "sourceName", null);
        setIntField(term81053, term81053.getClass(), "baseLineno", 0);
        setIntField(term81053, term81053.getClass(), "endLineno", 0);
        setField(term81053, term81053.getClass(), "functions", null);
        setField(term81053, term81053.getClass(), "regexps", null);
        setField(term81053, term81053.getClass(), "itsVariables", null);
        setField(term81053, term81053.getClass(), "itsConst", null);
        setField(term81053, term81053.getClass(), "itsVariableNames", null);
        setIntField(term81053, term81053.getClass(), "varStart", 0);
        setField(term81053, term81053.getClass(), "compilerData", null);
        setIntField(term81053, term81053.getClass(), "type", 0);
        setIntField(term81060, term81060.getClass(), "encodedSourceStart", 0);
        setIntField(term81060, term81060.getClass(), "encodedSourceEnd", 0);
        setField(term81060, term81060.getClass(), "sourceName", null);
        setIntField(term81060, term81060.getClass(), "baseLineno", 0);
        setIntField(term81060, term81060.getClass(), "endLineno", 0);
        setField(term81060, term81060.getClass(), "functions", null);
        setField(term81060, term81060.getClass(), "regexps", null);
        setField(term81060, term81060.getClass(), "itsVariables", null);
        setField(term81060, term81060.getClass(), "itsConst", null);
        setField(term81060, term81060.getClass(), "itsVariableNames", null);
        setIntField(term81060, term81060.getClass(), "varStart", 0);
        setField(term81060, term81060.getClass(), "compilerData", null);
        setIntField(term81060, term81060.getClass(), "type", 0);
        setField(term81060, term81060.getClass(), "next", null);
        setField(term81060, term81060.getClass(), "first", null);
        setField(term81060, term81060.getClass(), "last", null);
        setField(term81060, term81060.getClass(), "propListHead", null);
        setIntField(term81060, term81060.getClass(), "sourcePosition", 0);
        setField(term81060, term81060.getClass(), "jsType", null);
        setField(term81060, term81060.getClass(), "parent", null);
        setField(term81053, term81053.getClass(), "next", term81060);
        setField(term81053, term81053.getClass(), "first", null);
        setField(term81053, term81053.getClass(), "last", null);
        setField(term81053, term81053.getClass(), "propListHead", null);
        setIntField(term81053, term81053.getClass(), "sourcePosition", 0);
        setField(term81053, term81053.getClass(), "jsType", null);
        setField(term81053, term81053.getClass(), "parent", null);
        setField(term81046, term81046.getClass(), "first", term81053);
        setField(term81046, term81046.getClass(), "last", null);
        setField(term81046, term81046.getClass(), "propListHead", null);
        setIntField(term81046, term81046.getClass(), "sourcePosition", 0);
        setField(term81046, term81046.getClass(), "jsType", null);
        setField(term81046, term81046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65518;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term65428, args);
        assertTrue(recursiveEquals(term65428, term81112));
        assertTrue(recursiveEquals(term65518, term81113));
        assertTrue(recursiveEquals(retValue, term81046));
    }

};


