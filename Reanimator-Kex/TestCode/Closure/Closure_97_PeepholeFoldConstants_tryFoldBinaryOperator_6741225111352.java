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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444353;
     Object term444443;
     Object term465780;
     Object term465781;
     Object term465716;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term444443 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term444533 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term444623 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term444533, term444533.getClass(), "next", term444623);
        setIntField(term444533, term444533.getClass(), "type", 39);
        setField(term444443, term444443.getClass(), "first", term444533);
        setIntField(term444443, term444443.getClass(), "type", 19);
        term465780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term465780, term465780.getClass(), "currentTraversal", null);
        term465781 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465782 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465783 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term465781, term465781.getClass(), "encodedSourceStart", 0);
        setIntField(term465781, term465781.getClass(), "encodedSourceEnd", 0);
        setField(term465781, term465781.getClass(), "sourceName", null);
        setIntField(term465781, term465781.getClass(), "baseLineno", 0);
        setIntField(term465781, term465781.getClass(), "endLineno", 0);
        setField(term465781, term465781.getClass(), "functions", null);
        setField(term465781, term465781.getClass(), "regexps", null);
        setField(term465781, term465781.getClass(), "itsVariables", null);
        setField(term465781, term465781.getClass(), "itsConst", null);
        setField(term465781, term465781.getClass(), "itsVariableNames", null);
        setIntField(term465781, term465781.getClass(), "varStart", 0);
        setField(term465781, term465781.getClass(), "compilerData", null);
        setIntField(term465781, term465781.getClass(), "type", 19);
        setField(term465781, term465781.getClass(), "next", null);
        setIntField(term465782, term465782.getClass(), "encodedSourceStart", 0);
        setIntField(term465782, term465782.getClass(), "encodedSourceEnd", 0);
        setField(term465782, term465782.getClass(), "sourceName", null);
        setIntField(term465782, term465782.getClass(), "baseLineno", 0);
        setIntField(term465782, term465782.getClass(), "endLineno", 0);
        setField(term465782, term465782.getClass(), "functions", null);
        setField(term465782, term465782.getClass(), "regexps", null);
        setField(term465782, term465782.getClass(), "itsVariables", null);
        setField(term465782, term465782.getClass(), "itsConst", null);
        setField(term465782, term465782.getClass(), "itsVariableNames", null);
        setIntField(term465782, term465782.getClass(), "varStart", 0);
        setField(term465782, term465782.getClass(), "compilerData", null);
        setIntField(term465782, term465782.getClass(), "type", 39);
        setIntField(term465783, term465783.getClass(), "encodedSourceStart", 0);
        setIntField(term465783, term465783.getClass(), "encodedSourceEnd", 0);
        setField(term465783, term465783.getClass(), "sourceName", null);
        setIntField(term465783, term465783.getClass(), "baseLineno", 0);
        setIntField(term465783, term465783.getClass(), "endLineno", 0);
        setField(term465783, term465783.getClass(), "functions", null);
        setField(term465783, term465783.getClass(), "regexps", null);
        setField(term465783, term465783.getClass(), "itsVariables", null);
        setField(term465783, term465783.getClass(), "itsConst", null);
        setField(term465783, term465783.getClass(), "itsVariableNames", null);
        setIntField(term465783, term465783.getClass(), "varStart", 0);
        setField(term465783, term465783.getClass(), "compilerData", null);
        setIntField(term465783, term465783.getClass(), "type", 0);
        setField(term465783, term465783.getClass(), "next", null);
        setField(term465783, term465783.getClass(), "first", null);
        setField(term465783, term465783.getClass(), "last", null);
        setField(term465783, term465783.getClass(), "propListHead", null);
        setIntField(term465783, term465783.getClass(), "sourcePosition", 0);
        setField(term465783, term465783.getClass(), "jsType", null);
        setField(term465783, term465783.getClass(), "parent", null);
        setField(term465782, term465782.getClass(), "next", term465783);
        setField(term465782, term465782.getClass(), "first", null);
        setField(term465782, term465782.getClass(), "last", null);
        setField(term465782, term465782.getClass(), "propListHead", null);
        setIntField(term465782, term465782.getClass(), "sourcePosition", 0);
        setField(term465782, term465782.getClass(), "jsType", null);
        setField(term465782, term465782.getClass(), "parent", null);
        setField(term465781, term465781.getClass(), "first", term465782);
        setField(term465781, term465781.getClass(), "last", null);
        setField(term465781, term465781.getClass(), "propListHead", null);
        setIntField(term465781, term465781.getClass(), "sourcePosition", 0);
        setField(term465781, term465781.getClass(), "jsType", null);
        setField(term465781, term465781.getClass(), "parent", null);
        term465716 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465723 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465730 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term465716, term465716.getClass(), "encodedSourceStart", 0);
        setIntField(term465716, term465716.getClass(), "encodedSourceEnd", 0);
        setField(term465716, term465716.getClass(), "sourceName", null);
        setIntField(term465716, term465716.getClass(), "baseLineno", 0);
        setIntField(term465716, term465716.getClass(), "endLineno", 0);
        setField(term465716, term465716.getClass(), "functions", null);
        setField(term465716, term465716.getClass(), "regexps", null);
        setField(term465716, term465716.getClass(), "itsVariables", null);
        setField(term465716, term465716.getClass(), "itsConst", null);
        setField(term465716, term465716.getClass(), "itsVariableNames", null);
        setIntField(term465716, term465716.getClass(), "varStart", 0);
        setField(term465716, term465716.getClass(), "compilerData", null);
        setIntField(term465716, term465716.getClass(), "type", 19);
        setField(term465716, term465716.getClass(), "next", null);
        setIntField(term465723, term465723.getClass(), "encodedSourceStart", 0);
        setIntField(term465723, term465723.getClass(), "encodedSourceEnd", 0);
        setField(term465723, term465723.getClass(), "sourceName", null);
        setIntField(term465723, term465723.getClass(), "baseLineno", 0);
        setIntField(term465723, term465723.getClass(), "endLineno", 0);
        setField(term465723, term465723.getClass(), "functions", null);
        setField(term465723, term465723.getClass(), "regexps", null);
        setField(term465723, term465723.getClass(), "itsVariables", null);
        setField(term465723, term465723.getClass(), "itsConst", null);
        setField(term465723, term465723.getClass(), "itsVariableNames", null);
        setIntField(term465723, term465723.getClass(), "varStart", 0);
        setField(term465723, term465723.getClass(), "compilerData", null);
        setIntField(term465723, term465723.getClass(), "type", 39);
        setIntField(term465730, term465730.getClass(), "encodedSourceStart", 0);
        setIntField(term465730, term465730.getClass(), "encodedSourceEnd", 0);
        setField(term465730, term465730.getClass(), "sourceName", null);
        setIntField(term465730, term465730.getClass(), "baseLineno", 0);
        setIntField(term465730, term465730.getClass(), "endLineno", 0);
        setField(term465730, term465730.getClass(), "functions", null);
        setField(term465730, term465730.getClass(), "regexps", null);
        setField(term465730, term465730.getClass(), "itsVariables", null);
        setField(term465730, term465730.getClass(), "itsConst", null);
        setField(term465730, term465730.getClass(), "itsVariableNames", null);
        setIntField(term465730, term465730.getClass(), "varStart", 0);
        setField(term465730, term465730.getClass(), "compilerData", null);
        setIntField(term465730, term465730.getClass(), "type", 0);
        setField(term465730, term465730.getClass(), "next", null);
        setField(term465730, term465730.getClass(), "first", null);
        setField(term465730, term465730.getClass(), "last", null);
        setField(term465730, term465730.getClass(), "propListHead", null);
        setIntField(term465730, term465730.getClass(), "sourcePosition", 0);
        setField(term465730, term465730.getClass(), "jsType", null);
        setField(term465730, term465730.getClass(), "parent", null);
        setField(term465723, term465723.getClass(), "next", term465730);
        setField(term465723, term465723.getClass(), "first", null);
        setField(term465723, term465723.getClass(), "last", null);
        setField(term465723, term465723.getClass(), "propListHead", null);
        setIntField(term465723, term465723.getClass(), "sourcePosition", 0);
        setField(term465723, term465723.getClass(), "jsType", null);
        setField(term465723, term465723.getClass(), "parent", null);
        setField(term465716, term465716.getClass(), "first", term465723);
        setField(term465716, term465716.getClass(), "last", null);
        setField(term465716, term465716.getClass(), "propListHead", null);
        setIntField(term465716, term465716.getClass(), "sourcePosition", 0);
        setField(term465716, term465716.getClass(), "jsType", null);
        setField(term465716, term465716.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term444443;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term444353, args);
        assertTrue(recursiveEquals(term444353, term465780));
        assertTrue(recursiveEquals(term444443, term465781));
        assertTrue(recursiveEquals(retValue, term465716));
    }

};


