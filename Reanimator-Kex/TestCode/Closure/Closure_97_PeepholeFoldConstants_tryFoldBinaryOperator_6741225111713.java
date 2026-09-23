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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675975;
     Object term676065;
     Object term676774;
     Object term676775;
     Object term676713;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675975 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term676065 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term676155 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term676065, term676065.getClass(), "first", term676065);
        setField(term676065, term676065.getClass(), "next", term676155);
        setIntField(term676065, term676065.getClass(), "type", 16);
        term676774 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term676774, term676774.getClass(), "currentTraversal", null);
        term676775 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term676776 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term676775, term676775.getClass(), "encodedSourceStart", 0);
        setIntField(term676775, term676775.getClass(), "encodedSourceEnd", 0);
        setField(term676775, term676775.getClass(), "sourceName", null);
        setIntField(term676775, term676775.getClass(), "baseLineno", 0);
        setIntField(term676775, term676775.getClass(), "endLineno", 0);
        setField(term676775, term676775.getClass(), "functions", null);
        setField(term676775, term676775.getClass(), "regexps", null);
        setField(term676775, term676775.getClass(), "itsVariables", null);
        setField(term676775, term676775.getClass(), "itsConst", null);
        setField(term676775, term676775.getClass(), "itsVariableNames", null);
        setIntField(term676775, term676775.getClass(), "varStart", 0);
        setField(term676775, term676775.getClass(), "compilerData", null);
        setIntField(term676775, term676775.getClass(), "type", 16);
        setIntField(term676776, term676776.getClass(), "encodedSourceStart", 0);
        setIntField(term676776, term676776.getClass(), "encodedSourceEnd", 0);
        setField(term676776, term676776.getClass(), "sourceName", null);
        setIntField(term676776, term676776.getClass(), "baseLineno", 0);
        setIntField(term676776, term676776.getClass(), "endLineno", 0);
        setField(term676776, term676776.getClass(), "functions", null);
        setField(term676776, term676776.getClass(), "regexps", null);
        setField(term676776, term676776.getClass(), "itsVariables", null);
        setField(term676776, term676776.getClass(), "itsConst", null);
        setField(term676776, term676776.getClass(), "itsVariableNames", null);
        setIntField(term676776, term676776.getClass(), "varStart", 0);
        setField(term676776, term676776.getClass(), "compilerData", null);
        setIntField(term676776, term676776.getClass(), "type", 0);
        setField(term676776, term676776.getClass(), "next", null);
        setField(term676776, term676776.getClass(), "first", null);
        setField(term676776, term676776.getClass(), "last", null);
        setField(term676776, term676776.getClass(), "propListHead", null);
        setIntField(term676776, term676776.getClass(), "sourcePosition", 0);
        setField(term676776, term676776.getClass(), "jsType", null);
        setField(term676776, term676776.getClass(), "parent", null);
        setField(term676775, term676775.getClass(), "next", term676776);
        setField(term676775, term676775.getClass(), "first", term676775);
        setField(term676775, term676775.getClass(), "last", null);
        setField(term676775, term676775.getClass(), "propListHead", null);
        setIntField(term676775, term676775.getClass(), "sourcePosition", 0);
        setField(term676775, term676775.getClass(), "jsType", null);
        setField(term676775, term676775.getClass(), "parent", null);
        term676713 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term676720 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term676713, term676713.getClass(), "encodedSourceStart", 0);
        setIntField(term676713, term676713.getClass(), "encodedSourceEnd", 0);
        setField(term676713, term676713.getClass(), "sourceName", null);
        setIntField(term676713, term676713.getClass(), "baseLineno", 0);
        setIntField(term676713, term676713.getClass(), "endLineno", 0);
        setField(term676713, term676713.getClass(), "functions", null);
        setField(term676713, term676713.getClass(), "regexps", null);
        setField(term676713, term676713.getClass(), "itsVariables", null);
        setField(term676713, term676713.getClass(), "itsConst", null);
        setField(term676713, term676713.getClass(), "itsVariableNames", null);
        setIntField(term676713, term676713.getClass(), "varStart", 0);
        setField(term676713, term676713.getClass(), "compilerData", null);
        setIntField(term676713, term676713.getClass(), "type", 16);
        setIntField(term676720, term676720.getClass(), "encodedSourceStart", 0);
        setIntField(term676720, term676720.getClass(), "encodedSourceEnd", 0);
        setField(term676720, term676720.getClass(), "sourceName", null);
        setIntField(term676720, term676720.getClass(), "baseLineno", 0);
        setIntField(term676720, term676720.getClass(), "endLineno", 0);
        setField(term676720, term676720.getClass(), "functions", null);
        setField(term676720, term676720.getClass(), "regexps", null);
        setField(term676720, term676720.getClass(), "itsVariables", null);
        setField(term676720, term676720.getClass(), "itsConst", null);
        setField(term676720, term676720.getClass(), "itsVariableNames", null);
        setIntField(term676720, term676720.getClass(), "varStart", 0);
        setField(term676720, term676720.getClass(), "compilerData", null);
        setIntField(term676720, term676720.getClass(), "type", 0);
        setField(term676720, term676720.getClass(), "next", null);
        setField(term676720, term676720.getClass(), "first", null);
        setField(term676720, term676720.getClass(), "last", null);
        setField(term676720, term676720.getClass(), "propListHead", null);
        setIntField(term676720, term676720.getClass(), "sourcePosition", 0);
        setField(term676720, term676720.getClass(), "jsType", null);
        setField(term676720, term676720.getClass(), "parent", null);
        setField(term676713, term676713.getClass(), "next", term676720);
        setField(term676713, term676713.getClass(), "first", term676713);
        setField(term676713, term676713.getClass(), "last", null);
        setField(term676713, term676713.getClass(), "propListHead", null);
        setIntField(term676713, term676713.getClass(), "sourcePosition", 0);
        setField(term676713, term676713.getClass(), "jsType", null);
        setField(term676713, term676713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term676065;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term675975, args);
        assertTrue(recursiveEquals(term675975, term676774));
        assertTrue(recursiveEquals(term676065, term676775));
        assertTrue(recursiveEquals(retValue, term676713));
    }

};


