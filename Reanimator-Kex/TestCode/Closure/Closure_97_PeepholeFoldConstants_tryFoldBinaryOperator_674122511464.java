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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107313;
     Object term107403;
     Object term107714;
     Object term107715;
     Object term107644;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term107403 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107493 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107583 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term107493, term107493.getClass(), "next", term107583);
        setIntField(term107493, term107493.getClass(), "type", 39);
        setField(term107403, term107403.getClass(), "first", term107493);
        setIntField(term107403, term107403.getClass(), "type", 9);
        term107714 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term107714, term107714.getClass(), "currentTraversal", null);
        term107715 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107716 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107717 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term107715, term107715.getClass(), "encodedSourceStart", 0);
        setIntField(term107715, term107715.getClass(), "encodedSourceEnd", 0);
        setField(term107715, term107715.getClass(), "sourceName", null);
        setIntField(term107715, term107715.getClass(), "baseLineno", 0);
        setIntField(term107715, term107715.getClass(), "endLineno", 0);
        setField(term107715, term107715.getClass(), "functions", null);
        setField(term107715, term107715.getClass(), "regexps", null);
        setField(term107715, term107715.getClass(), "itsVariables", null);
        setField(term107715, term107715.getClass(), "itsConst", null);
        setField(term107715, term107715.getClass(), "itsVariableNames", null);
        setIntField(term107715, term107715.getClass(), "varStart", 0);
        setField(term107715, term107715.getClass(), "compilerData", null);
        setIntField(term107715, term107715.getClass(), "type", 9);
        setField(term107715, term107715.getClass(), "next", null);
        setIntField(term107716, term107716.getClass(), "encodedSourceStart", 0);
        setIntField(term107716, term107716.getClass(), "encodedSourceEnd", 0);
        setField(term107716, term107716.getClass(), "sourceName", null);
        setIntField(term107716, term107716.getClass(), "baseLineno", 0);
        setIntField(term107716, term107716.getClass(), "endLineno", 0);
        setField(term107716, term107716.getClass(), "functions", null);
        setField(term107716, term107716.getClass(), "regexps", null);
        setField(term107716, term107716.getClass(), "itsVariables", null);
        setField(term107716, term107716.getClass(), "itsConst", null);
        setField(term107716, term107716.getClass(), "itsVariableNames", null);
        setIntField(term107716, term107716.getClass(), "varStart", 0);
        setField(term107716, term107716.getClass(), "compilerData", null);
        setIntField(term107716, term107716.getClass(), "type", 39);
        setIntField(term107717, term107717.getClass(), "encodedSourceStart", 0);
        setIntField(term107717, term107717.getClass(), "encodedSourceEnd", 0);
        setField(term107717, term107717.getClass(), "sourceName", null);
        setIntField(term107717, term107717.getClass(), "baseLineno", 0);
        setIntField(term107717, term107717.getClass(), "endLineno", 0);
        setField(term107717, term107717.getClass(), "functions", null);
        setField(term107717, term107717.getClass(), "regexps", null);
        setField(term107717, term107717.getClass(), "itsVariables", null);
        setField(term107717, term107717.getClass(), "itsConst", null);
        setField(term107717, term107717.getClass(), "itsVariableNames", null);
        setIntField(term107717, term107717.getClass(), "varStart", 0);
        setField(term107717, term107717.getClass(), "compilerData", null);
        setIntField(term107717, term107717.getClass(), "type", 0);
        setField(term107717, term107717.getClass(), "next", null);
        setField(term107717, term107717.getClass(), "first", null);
        setField(term107717, term107717.getClass(), "last", null);
        setField(term107717, term107717.getClass(), "propListHead", null);
        setIntField(term107717, term107717.getClass(), "sourcePosition", 0);
        setField(term107717, term107717.getClass(), "jsType", null);
        setField(term107717, term107717.getClass(), "parent", null);
        setField(term107716, term107716.getClass(), "next", term107717);
        setField(term107716, term107716.getClass(), "first", null);
        setField(term107716, term107716.getClass(), "last", null);
        setField(term107716, term107716.getClass(), "propListHead", null);
        setIntField(term107716, term107716.getClass(), "sourcePosition", 0);
        setField(term107716, term107716.getClass(), "jsType", null);
        setField(term107716, term107716.getClass(), "parent", null);
        setField(term107715, term107715.getClass(), "first", term107716);
        setField(term107715, term107715.getClass(), "last", null);
        setField(term107715, term107715.getClass(), "propListHead", null);
        setIntField(term107715, term107715.getClass(), "sourcePosition", 0);
        setField(term107715, term107715.getClass(), "jsType", null);
        setField(term107715, term107715.getClass(), "parent", null);
        term107644 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107651 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107658 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term107644, term107644.getClass(), "encodedSourceStart", 0);
        setIntField(term107644, term107644.getClass(), "encodedSourceEnd", 0);
        setField(term107644, term107644.getClass(), "sourceName", null);
        setIntField(term107644, term107644.getClass(), "baseLineno", 0);
        setIntField(term107644, term107644.getClass(), "endLineno", 0);
        setField(term107644, term107644.getClass(), "functions", null);
        setField(term107644, term107644.getClass(), "regexps", null);
        setField(term107644, term107644.getClass(), "itsVariables", null);
        setField(term107644, term107644.getClass(), "itsConst", null);
        setField(term107644, term107644.getClass(), "itsVariableNames", null);
        setIntField(term107644, term107644.getClass(), "varStart", 0);
        setField(term107644, term107644.getClass(), "compilerData", null);
        setIntField(term107644, term107644.getClass(), "type", 9);
        setField(term107644, term107644.getClass(), "next", null);
        setIntField(term107651, term107651.getClass(), "encodedSourceStart", 0);
        setIntField(term107651, term107651.getClass(), "encodedSourceEnd", 0);
        setField(term107651, term107651.getClass(), "sourceName", null);
        setIntField(term107651, term107651.getClass(), "baseLineno", 0);
        setIntField(term107651, term107651.getClass(), "endLineno", 0);
        setField(term107651, term107651.getClass(), "functions", null);
        setField(term107651, term107651.getClass(), "regexps", null);
        setField(term107651, term107651.getClass(), "itsVariables", null);
        setField(term107651, term107651.getClass(), "itsConst", null);
        setField(term107651, term107651.getClass(), "itsVariableNames", null);
        setIntField(term107651, term107651.getClass(), "varStart", 0);
        setField(term107651, term107651.getClass(), "compilerData", null);
        setIntField(term107651, term107651.getClass(), "type", 39);
        setIntField(term107658, term107658.getClass(), "encodedSourceStart", 0);
        setIntField(term107658, term107658.getClass(), "encodedSourceEnd", 0);
        setField(term107658, term107658.getClass(), "sourceName", null);
        setIntField(term107658, term107658.getClass(), "baseLineno", 0);
        setIntField(term107658, term107658.getClass(), "endLineno", 0);
        setField(term107658, term107658.getClass(), "functions", null);
        setField(term107658, term107658.getClass(), "regexps", null);
        setField(term107658, term107658.getClass(), "itsVariables", null);
        setField(term107658, term107658.getClass(), "itsConst", null);
        setField(term107658, term107658.getClass(), "itsVariableNames", null);
        setIntField(term107658, term107658.getClass(), "varStart", 0);
        setField(term107658, term107658.getClass(), "compilerData", null);
        setIntField(term107658, term107658.getClass(), "type", 0);
        setField(term107658, term107658.getClass(), "next", null);
        setField(term107658, term107658.getClass(), "first", null);
        setField(term107658, term107658.getClass(), "last", null);
        setField(term107658, term107658.getClass(), "propListHead", null);
        setIntField(term107658, term107658.getClass(), "sourcePosition", 0);
        setField(term107658, term107658.getClass(), "jsType", null);
        setField(term107658, term107658.getClass(), "parent", null);
        setField(term107651, term107651.getClass(), "next", term107658);
        setField(term107651, term107651.getClass(), "first", null);
        setField(term107651, term107651.getClass(), "last", null);
        setField(term107651, term107651.getClass(), "propListHead", null);
        setIntField(term107651, term107651.getClass(), "sourcePosition", 0);
        setField(term107651, term107651.getClass(), "jsType", null);
        setField(term107651, term107651.getClass(), "parent", null);
        setField(term107644, term107644.getClass(), "first", term107651);
        setField(term107644, term107644.getClass(), "last", null);
        setField(term107644, term107644.getClass(), "propListHead", null);
        setIntField(term107644, term107644.getClass(), "sourcePosition", 0);
        setField(term107644, term107644.getClass(), "jsType", null);
        setField(term107644, term107644.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term107403;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term107313, args);
        assertTrue(recursiveEquals(term107313, term107714));
        assertTrue(recursiveEquals(term107403, term107715));
        assertTrue(recursiveEquals(retValue, term107644));
    }

};


