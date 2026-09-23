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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304997;
     Object term305089;
     Object term305745;
     Object term305746;
     Object term305697;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term305089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305271 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term305181, term305181.getClass(), "next", term305271);
        setIntField(term305181, term305181.getClass(), "type", 39);
        setField(term305089, term305089.getClass(), "first", term305181);
        setIntField(term305089, term305089.getClass(), "type", 18);
        term305745 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term305745, term305745.getClass(), "currentTraversal", null);
        term305746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305748 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term305746, term305746.getClass(), "number", 0.0);
        setIntField(term305746, term305746.getClass(), "type", 18);
        setField(term305746, term305746.getClass(), "next", null);
        setDoubleField(term305747, term305747.getClass(), "number", 0.0);
        setIntField(term305747, term305747.getClass(), "type", 39);
        setIntField(term305748, term305748.getClass(), "encodedSourceStart", 0);
        setIntField(term305748, term305748.getClass(), "encodedSourceEnd", 0);
        setField(term305748, term305748.getClass(), "sourceName", null);
        setIntField(term305748, term305748.getClass(), "baseLineno", 0);
        setIntField(term305748, term305748.getClass(), "endLineno", 0);
        setField(term305748, term305748.getClass(), "functions", null);
        setField(term305748, term305748.getClass(), "regexps", null);
        setField(term305748, term305748.getClass(), "itsVariables", null);
        setField(term305748, term305748.getClass(), "itsConst", null);
        setField(term305748, term305748.getClass(), "itsVariableNames", null);
        setIntField(term305748, term305748.getClass(), "varStart", 0);
        setField(term305748, term305748.getClass(), "compilerData", null);
        setIntField(term305748, term305748.getClass(), "type", 0);
        setField(term305748, term305748.getClass(), "next", null);
        setField(term305748, term305748.getClass(), "first", null);
        setField(term305748, term305748.getClass(), "last", null);
        setField(term305748, term305748.getClass(), "propListHead", null);
        setIntField(term305748, term305748.getClass(), "sourcePosition", 0);
        setField(term305748, term305748.getClass(), "jsType", null);
        setField(term305748, term305748.getClass(), "parent", null);
        setField(term305747, term305747.getClass(), "next", term305748);
        setField(term305747, term305747.getClass(), "first", null);
        setField(term305747, term305747.getClass(), "last", null);
        setField(term305747, term305747.getClass(), "propListHead", null);
        setIntField(term305747, term305747.getClass(), "sourcePosition", 0);
        setField(term305747, term305747.getClass(), "jsType", null);
        setField(term305747, term305747.getClass(), "parent", null);
        setField(term305746, term305746.getClass(), "first", term305747);
        setField(term305746, term305746.getClass(), "last", null);
        setField(term305746, term305746.getClass(), "propListHead", null);
        setIntField(term305746, term305746.getClass(), "sourcePosition", 0);
        setField(term305746, term305746.getClass(), "jsType", null);
        setField(term305746, term305746.getClass(), "parent", null);
        term305697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305703 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term305697, term305697.getClass(), "number", 0.0);
        setIntField(term305697, term305697.getClass(), "type", 18);
        setField(term305697, term305697.getClass(), "next", null);
        setDoubleField(term305700, term305700.getClass(), "number", 0.0);
        setIntField(term305700, term305700.getClass(), "type", 39);
        setIntField(term305703, term305703.getClass(), "encodedSourceStart", 0);
        setIntField(term305703, term305703.getClass(), "encodedSourceEnd", 0);
        setField(term305703, term305703.getClass(), "sourceName", null);
        setIntField(term305703, term305703.getClass(), "baseLineno", 0);
        setIntField(term305703, term305703.getClass(), "endLineno", 0);
        setField(term305703, term305703.getClass(), "functions", null);
        setField(term305703, term305703.getClass(), "regexps", null);
        setField(term305703, term305703.getClass(), "itsVariables", null);
        setField(term305703, term305703.getClass(), "itsConst", null);
        setField(term305703, term305703.getClass(), "itsVariableNames", null);
        setIntField(term305703, term305703.getClass(), "varStart", 0);
        setField(term305703, term305703.getClass(), "compilerData", null);
        setIntField(term305703, term305703.getClass(), "type", 0);
        setField(term305703, term305703.getClass(), "next", null);
        setField(term305703, term305703.getClass(), "first", null);
        setField(term305703, term305703.getClass(), "last", null);
        setField(term305703, term305703.getClass(), "propListHead", null);
        setIntField(term305703, term305703.getClass(), "sourcePosition", 0);
        setField(term305703, term305703.getClass(), "jsType", null);
        setField(term305703, term305703.getClass(), "parent", null);
        setField(term305700, term305700.getClass(), "next", term305703);
        setField(term305700, term305700.getClass(), "first", null);
        setField(term305700, term305700.getClass(), "last", null);
        setField(term305700, term305700.getClass(), "propListHead", null);
        setIntField(term305700, term305700.getClass(), "sourcePosition", 0);
        setField(term305700, term305700.getClass(), "jsType", null);
        setField(term305700, term305700.getClass(), "parent", null);
        setField(term305697, term305697.getClass(), "first", term305700);
        setField(term305697, term305697.getClass(), "last", null);
        setField(term305697, term305697.getClass(), "propListHead", null);
        setIntField(term305697, term305697.getClass(), "sourcePosition", 0);
        setField(term305697, term305697.getClass(), "jsType", null);
        setField(term305697, term305697.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305089;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term304997, args);
        assertTrue(recursiveEquals(term304997, term305745));
        assertTrue(recursiveEquals(term305089, term305746));
        assertTrue(recursiveEquals(retValue, term305697));
    }

};


