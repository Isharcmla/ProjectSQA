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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48017;
     Object term48107;
     Object term62837;
     Object term62838;
     Object term62756;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48017 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48107 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term48197 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term48107, term48107.getClass(), "first", term48107);
        setField(term48107, term48107.getClass(), "next", term48197);
        setIntField(term48107, term48107.getClass(), "type", 23);
        term62837 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62837, term62837.getClass(), "currentTraversal", null);
        term62838 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term62839 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term62838, term62838.getClass(), "encodedSourceStart", 0);
        setIntField(term62838, term62838.getClass(), "encodedSourceEnd", 0);
        setField(term62838, term62838.getClass(), "sourceName", null);
        setIntField(term62838, term62838.getClass(), "baseLineno", 0);
        setIntField(term62838, term62838.getClass(), "endLineno", 0);
        setField(term62838, term62838.getClass(), "functions", null);
        setField(term62838, term62838.getClass(), "regexps", null);
        setField(term62838, term62838.getClass(), "itsVariables", null);
        setField(term62838, term62838.getClass(), "itsConst", null);
        setField(term62838, term62838.getClass(), "itsVariableNames", null);
        setIntField(term62838, term62838.getClass(), "varStart", 0);
        setField(term62838, term62838.getClass(), "compilerData", null);
        setIntField(term62838, term62838.getClass(), "type", 23);
        setIntField(term62839, term62839.getClass(), "encodedSourceStart", 0);
        setIntField(term62839, term62839.getClass(), "encodedSourceEnd", 0);
        setField(term62839, term62839.getClass(), "sourceName", null);
        setIntField(term62839, term62839.getClass(), "baseLineno", 0);
        setIntField(term62839, term62839.getClass(), "endLineno", 0);
        setField(term62839, term62839.getClass(), "functions", null);
        setField(term62839, term62839.getClass(), "regexps", null);
        setField(term62839, term62839.getClass(), "itsVariables", null);
        setField(term62839, term62839.getClass(), "itsConst", null);
        setField(term62839, term62839.getClass(), "itsVariableNames", null);
        setIntField(term62839, term62839.getClass(), "varStart", 0);
        setField(term62839, term62839.getClass(), "compilerData", null);
        setIntField(term62839, term62839.getClass(), "type", 0);
        setField(term62839, term62839.getClass(), "next", null);
        setField(term62839, term62839.getClass(), "first", null);
        setField(term62839, term62839.getClass(), "last", null);
        setField(term62839, term62839.getClass(), "propListHead", null);
        setIntField(term62839, term62839.getClass(), "sourcePosition", 0);
        setField(term62839, term62839.getClass(), "jsType", null);
        setField(term62839, term62839.getClass(), "parent", null);
        setField(term62838, term62838.getClass(), "next", term62839);
        setField(term62838, term62838.getClass(), "first", term62838);
        setField(term62838, term62838.getClass(), "last", null);
        setField(term62838, term62838.getClass(), "propListHead", null);
        setIntField(term62838, term62838.getClass(), "sourcePosition", 0);
        setField(term62838, term62838.getClass(), "jsType", null);
        setField(term62838, term62838.getClass(), "parent", null);
        term62756 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term62763 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term62756, term62756.getClass(), "encodedSourceStart", 0);
        setIntField(term62756, term62756.getClass(), "encodedSourceEnd", 0);
        setField(term62756, term62756.getClass(), "sourceName", null);
        setIntField(term62756, term62756.getClass(), "baseLineno", 0);
        setIntField(term62756, term62756.getClass(), "endLineno", 0);
        setField(term62756, term62756.getClass(), "functions", null);
        setField(term62756, term62756.getClass(), "regexps", null);
        setField(term62756, term62756.getClass(), "itsVariables", null);
        setField(term62756, term62756.getClass(), "itsConst", null);
        setField(term62756, term62756.getClass(), "itsVariableNames", null);
        setIntField(term62756, term62756.getClass(), "varStart", 0);
        setField(term62756, term62756.getClass(), "compilerData", null);
        setIntField(term62756, term62756.getClass(), "type", 23);
        setIntField(term62763, term62763.getClass(), "encodedSourceStart", 0);
        setIntField(term62763, term62763.getClass(), "encodedSourceEnd", 0);
        setField(term62763, term62763.getClass(), "sourceName", null);
        setIntField(term62763, term62763.getClass(), "baseLineno", 0);
        setIntField(term62763, term62763.getClass(), "endLineno", 0);
        setField(term62763, term62763.getClass(), "functions", null);
        setField(term62763, term62763.getClass(), "regexps", null);
        setField(term62763, term62763.getClass(), "itsVariables", null);
        setField(term62763, term62763.getClass(), "itsConst", null);
        setField(term62763, term62763.getClass(), "itsVariableNames", null);
        setIntField(term62763, term62763.getClass(), "varStart", 0);
        setField(term62763, term62763.getClass(), "compilerData", null);
        setIntField(term62763, term62763.getClass(), "type", 0);
        setField(term62763, term62763.getClass(), "next", null);
        setField(term62763, term62763.getClass(), "first", null);
        setField(term62763, term62763.getClass(), "last", null);
        setField(term62763, term62763.getClass(), "propListHead", null);
        setIntField(term62763, term62763.getClass(), "sourcePosition", 0);
        setField(term62763, term62763.getClass(), "jsType", null);
        setField(term62763, term62763.getClass(), "parent", null);
        setField(term62756, term62756.getClass(), "next", term62763);
        setField(term62756, term62756.getClass(), "first", term62756);
        setField(term62756, term62756.getClass(), "last", null);
        setField(term62756, term62756.getClass(), "propListHead", null);
        setIntField(term62756, term62756.getClass(), "sourcePosition", 0);
        setField(term62756, term62756.getClass(), "jsType", null);
        setField(term62756, term62756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48107;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term48017, args);
        assertTrue(recursiveEquals(term48017, term62837));
        assertTrue(recursiveEquals(term48107, term62838));
        assertTrue(recursiveEquals(retValue, term62756));
    }

};


