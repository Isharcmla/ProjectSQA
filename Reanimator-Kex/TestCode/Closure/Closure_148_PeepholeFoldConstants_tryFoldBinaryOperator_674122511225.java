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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42448;
     Object term42538;
     Object term43028;
     Object term43029;
     Object term42964;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42448 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42538 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term42628 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term42718 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term42628, term42628.getClass(), "next", term42718);
        setIntField(term42628, term42628.getClass(), "type", 39);
        setField(term42538, term42538.getClass(), "first", term42628);
        setIntField(term42538, term42538.getClass(), "type", 22);
        term43028 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term43028, term43028.getClass(), "currentTraversal", null);
        term43029 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term43030 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term43031 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term43029, term43029.getClass(), "encodedSourceStart", 0);
        setIntField(term43029, term43029.getClass(), "encodedSourceEnd", 0);
        setField(term43029, term43029.getClass(), "sourceName", null);
        setIntField(term43029, term43029.getClass(), "baseLineno", 0);
        setIntField(term43029, term43029.getClass(), "endLineno", 0);
        setField(term43029, term43029.getClass(), "functions", null);
        setField(term43029, term43029.getClass(), "regexps", null);
        setField(term43029, term43029.getClass(), "itsVariables", null);
        setField(term43029, term43029.getClass(), "itsConst", null);
        setField(term43029, term43029.getClass(), "itsVariableNames", null);
        setIntField(term43029, term43029.getClass(), "varStart", 0);
        setField(term43029, term43029.getClass(), "compilerData", null);
        setIntField(term43029, term43029.getClass(), "type", 22);
        setField(term43029, term43029.getClass(), "next", null);
        setIntField(term43030, term43030.getClass(), "encodedSourceStart", 0);
        setIntField(term43030, term43030.getClass(), "encodedSourceEnd", 0);
        setField(term43030, term43030.getClass(), "sourceName", null);
        setIntField(term43030, term43030.getClass(), "baseLineno", 0);
        setIntField(term43030, term43030.getClass(), "endLineno", 0);
        setField(term43030, term43030.getClass(), "functions", null);
        setField(term43030, term43030.getClass(), "regexps", null);
        setField(term43030, term43030.getClass(), "itsVariables", null);
        setField(term43030, term43030.getClass(), "itsConst", null);
        setField(term43030, term43030.getClass(), "itsVariableNames", null);
        setIntField(term43030, term43030.getClass(), "varStart", 0);
        setField(term43030, term43030.getClass(), "compilerData", null);
        setIntField(term43030, term43030.getClass(), "type", 39);
        setIntField(term43031, term43031.getClass(), "encodedSourceStart", 0);
        setIntField(term43031, term43031.getClass(), "encodedSourceEnd", 0);
        setField(term43031, term43031.getClass(), "sourceName", null);
        setIntField(term43031, term43031.getClass(), "baseLineno", 0);
        setIntField(term43031, term43031.getClass(), "endLineno", 0);
        setField(term43031, term43031.getClass(), "functions", null);
        setField(term43031, term43031.getClass(), "regexps", null);
        setField(term43031, term43031.getClass(), "itsVariables", null);
        setField(term43031, term43031.getClass(), "itsConst", null);
        setField(term43031, term43031.getClass(), "itsVariableNames", null);
        setIntField(term43031, term43031.getClass(), "varStart", 0);
        setField(term43031, term43031.getClass(), "compilerData", null);
        setIntField(term43031, term43031.getClass(), "type", 0);
        setField(term43031, term43031.getClass(), "next", null);
        setField(term43031, term43031.getClass(), "first", null);
        setField(term43031, term43031.getClass(), "last", null);
        setField(term43031, term43031.getClass(), "propListHead", null);
        setIntField(term43031, term43031.getClass(), "sourcePosition", 0);
        setField(term43031, term43031.getClass(), "jsType", null);
        setField(term43031, term43031.getClass(), "parent", null);
        setField(term43030, term43030.getClass(), "next", term43031);
        setField(term43030, term43030.getClass(), "first", null);
        setField(term43030, term43030.getClass(), "last", null);
        setField(term43030, term43030.getClass(), "propListHead", null);
        setIntField(term43030, term43030.getClass(), "sourcePosition", 0);
        setField(term43030, term43030.getClass(), "jsType", null);
        setField(term43030, term43030.getClass(), "parent", null);
        setField(term43029, term43029.getClass(), "first", term43030);
        setField(term43029, term43029.getClass(), "last", null);
        setField(term43029, term43029.getClass(), "propListHead", null);
        setIntField(term43029, term43029.getClass(), "sourcePosition", 0);
        setField(term43029, term43029.getClass(), "jsType", null);
        setField(term43029, term43029.getClass(), "parent", null);
        term42964 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term42971 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term42978 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term42964, term42964.getClass(), "encodedSourceStart", 0);
        setIntField(term42964, term42964.getClass(), "encodedSourceEnd", 0);
        setField(term42964, term42964.getClass(), "sourceName", null);
        setIntField(term42964, term42964.getClass(), "baseLineno", 0);
        setIntField(term42964, term42964.getClass(), "endLineno", 0);
        setField(term42964, term42964.getClass(), "functions", null);
        setField(term42964, term42964.getClass(), "regexps", null);
        setField(term42964, term42964.getClass(), "itsVariables", null);
        setField(term42964, term42964.getClass(), "itsConst", null);
        setField(term42964, term42964.getClass(), "itsVariableNames", null);
        setIntField(term42964, term42964.getClass(), "varStart", 0);
        setField(term42964, term42964.getClass(), "compilerData", null);
        setIntField(term42964, term42964.getClass(), "type", 22);
        setField(term42964, term42964.getClass(), "next", null);
        setIntField(term42971, term42971.getClass(), "encodedSourceStart", 0);
        setIntField(term42971, term42971.getClass(), "encodedSourceEnd", 0);
        setField(term42971, term42971.getClass(), "sourceName", null);
        setIntField(term42971, term42971.getClass(), "baseLineno", 0);
        setIntField(term42971, term42971.getClass(), "endLineno", 0);
        setField(term42971, term42971.getClass(), "functions", null);
        setField(term42971, term42971.getClass(), "regexps", null);
        setField(term42971, term42971.getClass(), "itsVariables", null);
        setField(term42971, term42971.getClass(), "itsConst", null);
        setField(term42971, term42971.getClass(), "itsVariableNames", null);
        setIntField(term42971, term42971.getClass(), "varStart", 0);
        setField(term42971, term42971.getClass(), "compilerData", null);
        setIntField(term42971, term42971.getClass(), "type", 39);
        setIntField(term42978, term42978.getClass(), "encodedSourceStart", 0);
        setIntField(term42978, term42978.getClass(), "encodedSourceEnd", 0);
        setField(term42978, term42978.getClass(), "sourceName", null);
        setIntField(term42978, term42978.getClass(), "baseLineno", 0);
        setIntField(term42978, term42978.getClass(), "endLineno", 0);
        setField(term42978, term42978.getClass(), "functions", null);
        setField(term42978, term42978.getClass(), "regexps", null);
        setField(term42978, term42978.getClass(), "itsVariables", null);
        setField(term42978, term42978.getClass(), "itsConst", null);
        setField(term42978, term42978.getClass(), "itsVariableNames", null);
        setIntField(term42978, term42978.getClass(), "varStart", 0);
        setField(term42978, term42978.getClass(), "compilerData", null);
        setIntField(term42978, term42978.getClass(), "type", 0);
        setField(term42978, term42978.getClass(), "next", null);
        setField(term42978, term42978.getClass(), "first", null);
        setField(term42978, term42978.getClass(), "last", null);
        setField(term42978, term42978.getClass(), "propListHead", null);
        setIntField(term42978, term42978.getClass(), "sourcePosition", 0);
        setField(term42978, term42978.getClass(), "jsType", null);
        setField(term42978, term42978.getClass(), "parent", null);
        setField(term42971, term42971.getClass(), "next", term42978);
        setField(term42971, term42971.getClass(), "first", null);
        setField(term42971, term42971.getClass(), "last", null);
        setField(term42971, term42971.getClass(), "propListHead", null);
        setIntField(term42971, term42971.getClass(), "sourcePosition", 0);
        setField(term42971, term42971.getClass(), "jsType", null);
        setField(term42971, term42971.getClass(), "parent", null);
        setField(term42964, term42964.getClass(), "first", term42971);
        setField(term42964, term42964.getClass(), "last", null);
        setField(term42964, term42964.getClass(), "propListHead", null);
        setIntField(term42964, term42964.getClass(), "sourcePosition", 0);
        setField(term42964, term42964.getClass(), "jsType", null);
        setField(term42964, term42964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42538;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term42448, args);
        assertTrue(recursiveEquals(term42448, term43028));
        assertTrue(recursiveEquals(term42538, term43029));
        assertTrue(recursiveEquals(retValue, term42964));
    }

};


