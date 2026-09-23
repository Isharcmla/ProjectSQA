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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139306;
     Object term139398;
     Object term140049;
     Object term140050;
     Object term139990;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term139398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139580 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term139490, term139490.getClass(), "next", term139580);
        setIntField(term139490, term139490.getClass(), "type", 14);
        setField(term139398, term139398.getClass(), "first", term139490);
        setIntField(term139398, term139398.getClass(), "type", 14);
        term140049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term140049, term140049.getClass(), "currentTraversal", null);
        term140050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140052 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term140050, term140050.getClass(), "str", null);
        setIntField(term140050, term140050.getClass(), "type", 14);
        setField(term140050, term140050.getClass(), "next", null);
        setField(term140051, term140051.getClass(), "str", null);
        setIntField(term140051, term140051.getClass(), "type", 14);
        setIntField(term140052, term140052.getClass(), "encodedSourceStart", 0);
        setIntField(term140052, term140052.getClass(), "encodedSourceEnd", 0);
        setField(term140052, term140052.getClass(), "sourceName", null);
        setIntField(term140052, term140052.getClass(), "baseLineno", 0);
        setIntField(term140052, term140052.getClass(), "endLineno", 0);
        setField(term140052, term140052.getClass(), "functions", null);
        setField(term140052, term140052.getClass(), "regexps", null);
        setField(term140052, term140052.getClass(), "itsVariables", null);
        setField(term140052, term140052.getClass(), "itsConst", null);
        setField(term140052, term140052.getClass(), "itsVariableNames", null);
        setIntField(term140052, term140052.getClass(), "varStart", 0);
        setField(term140052, term140052.getClass(), "compilerData", null);
        setIntField(term140052, term140052.getClass(), "type", 0);
        setField(term140052, term140052.getClass(), "next", null);
        setField(term140052, term140052.getClass(), "first", null);
        setField(term140052, term140052.getClass(), "last", null);
        setField(term140052, term140052.getClass(), "propListHead", null);
        setIntField(term140052, term140052.getClass(), "sourcePosition", 0);
        setField(term140052, term140052.getClass(), "jsType", null);
        setField(term140052, term140052.getClass(), "parent", null);
        setField(term140051, term140051.getClass(), "next", term140052);
        setField(term140051, term140051.getClass(), "first", null);
        setField(term140051, term140051.getClass(), "last", null);
        setField(term140051, term140051.getClass(), "propListHead", null);
        setIntField(term140051, term140051.getClass(), "sourcePosition", 0);
        setField(term140051, term140051.getClass(), "jsType", null);
        setField(term140051, term140051.getClass(), "parent", null);
        setField(term140050, term140050.getClass(), "first", term140051);
        setField(term140050, term140050.getClass(), "last", null);
        setField(term140050, term140050.getClass(), "propListHead", null);
        setIntField(term140050, term140050.getClass(), "sourcePosition", 0);
        setField(term140050, term140050.getClass(), "jsType", null);
        setField(term140050, term140050.getClass(), "parent", null);
        term139990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139994 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term139990, term139990.getClass(), "str", null);
        setIntField(term139990, term139990.getClass(), "type", 14);
        setField(term139990, term139990.getClass(), "next", null);
        setField(term139992, term139992.getClass(), "str", null);
        setIntField(term139992, term139992.getClass(), "type", 14);
        setIntField(term139994, term139994.getClass(), "encodedSourceStart", 0);
        setIntField(term139994, term139994.getClass(), "encodedSourceEnd", 0);
        setField(term139994, term139994.getClass(), "sourceName", null);
        setIntField(term139994, term139994.getClass(), "baseLineno", 0);
        setIntField(term139994, term139994.getClass(), "endLineno", 0);
        setField(term139994, term139994.getClass(), "functions", null);
        setField(term139994, term139994.getClass(), "regexps", null);
        setField(term139994, term139994.getClass(), "itsVariables", null);
        setField(term139994, term139994.getClass(), "itsConst", null);
        setField(term139994, term139994.getClass(), "itsVariableNames", null);
        setIntField(term139994, term139994.getClass(), "varStart", 0);
        setField(term139994, term139994.getClass(), "compilerData", null);
        setIntField(term139994, term139994.getClass(), "type", 0);
        setField(term139994, term139994.getClass(), "next", null);
        setField(term139994, term139994.getClass(), "first", null);
        setField(term139994, term139994.getClass(), "last", null);
        setField(term139994, term139994.getClass(), "propListHead", null);
        setIntField(term139994, term139994.getClass(), "sourcePosition", 0);
        setField(term139994, term139994.getClass(), "jsType", null);
        setField(term139994, term139994.getClass(), "parent", null);
        setField(term139992, term139992.getClass(), "next", term139994);
        setField(term139992, term139992.getClass(), "first", null);
        setField(term139992, term139992.getClass(), "last", null);
        setField(term139992, term139992.getClass(), "propListHead", null);
        setIntField(term139992, term139992.getClass(), "sourcePosition", 0);
        setField(term139992, term139992.getClass(), "jsType", null);
        setField(term139992, term139992.getClass(), "parent", null);
        setField(term139990, term139990.getClass(), "first", term139992);
        setField(term139990, term139990.getClass(), "last", null);
        setField(term139990, term139990.getClass(), "propListHead", null);
        setIntField(term139990, term139990.getClass(), "sourcePosition", 0);
        setField(term139990, term139990.getClass(), "jsType", null);
        setField(term139990, term139990.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term139398;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term139306, args);
        assertTrue(recursiveEquals(term139306, term140049));
        assertTrue(recursiveEquals(term139398, term140050));
        assertTrue(recursiveEquals(retValue, term139990));
    }

};


