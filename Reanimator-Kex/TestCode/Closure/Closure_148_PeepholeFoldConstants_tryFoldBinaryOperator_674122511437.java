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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89131;
     Object term89223;
     Object term89889;
     Object term89890;
     Object term89845;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89131 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term89223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89405 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term89315, term89315.getClass(), "next", term89405);
        setIntField(term89315, term89315.getClass(), "type", 39);
        setField(term89223, term89223.getClass(), "first", term89315);
        setIntField(term89223, term89223.getClass(), "type", 22);
        term89889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term89889, term89889.getClass(), "currentTraversal", null);
        term89890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89892 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term89890, term89890.getClass(), "str", null);
        setIntField(term89890, term89890.getClass(), "type", 22);
        setField(term89890, term89890.getClass(), "next", null);
        setField(term89891, term89891.getClass(), "str", null);
        setIntField(term89891, term89891.getClass(), "type", 39);
        setIntField(term89892, term89892.getClass(), "encodedSourceStart", 0);
        setIntField(term89892, term89892.getClass(), "encodedSourceEnd", 0);
        setField(term89892, term89892.getClass(), "sourceName", null);
        setIntField(term89892, term89892.getClass(), "baseLineno", 0);
        setIntField(term89892, term89892.getClass(), "endLineno", 0);
        setField(term89892, term89892.getClass(), "functions", null);
        setField(term89892, term89892.getClass(), "regexps", null);
        setField(term89892, term89892.getClass(), "itsVariables", null);
        setField(term89892, term89892.getClass(), "itsConst", null);
        setField(term89892, term89892.getClass(), "itsVariableNames", null);
        setIntField(term89892, term89892.getClass(), "varStart", 0);
        setField(term89892, term89892.getClass(), "compilerData", null);
        setIntField(term89892, term89892.getClass(), "type", 0);
        setField(term89892, term89892.getClass(), "next", null);
        setField(term89892, term89892.getClass(), "first", null);
        setField(term89892, term89892.getClass(), "last", null);
        setField(term89892, term89892.getClass(), "propListHead", null);
        setIntField(term89892, term89892.getClass(), "sourcePosition", 0);
        setField(term89892, term89892.getClass(), "jsType", null);
        setField(term89892, term89892.getClass(), "parent", null);
        setField(term89891, term89891.getClass(), "next", term89892);
        setField(term89891, term89891.getClass(), "first", null);
        setField(term89891, term89891.getClass(), "last", null);
        setField(term89891, term89891.getClass(), "propListHead", null);
        setIntField(term89891, term89891.getClass(), "sourcePosition", 0);
        setField(term89891, term89891.getClass(), "jsType", null);
        setField(term89891, term89891.getClass(), "parent", null);
        setField(term89890, term89890.getClass(), "first", term89891);
        setField(term89890, term89890.getClass(), "last", null);
        setField(term89890, term89890.getClass(), "propListHead", null);
        setIntField(term89890, term89890.getClass(), "sourcePosition", 0);
        setField(term89890, term89890.getClass(), "jsType", null);
        setField(term89890, term89890.getClass(), "parent", null);
        term89845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89849 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term89845, term89845.getClass(), "str", null);
        setIntField(term89845, term89845.getClass(), "type", 22);
        setField(term89845, term89845.getClass(), "next", null);
        setField(term89847, term89847.getClass(), "str", null);
        setIntField(term89847, term89847.getClass(), "type", 39);
        setIntField(term89849, term89849.getClass(), "encodedSourceStart", 0);
        setIntField(term89849, term89849.getClass(), "encodedSourceEnd", 0);
        setField(term89849, term89849.getClass(), "sourceName", null);
        setIntField(term89849, term89849.getClass(), "baseLineno", 0);
        setIntField(term89849, term89849.getClass(), "endLineno", 0);
        setField(term89849, term89849.getClass(), "functions", null);
        setField(term89849, term89849.getClass(), "regexps", null);
        setField(term89849, term89849.getClass(), "itsVariables", null);
        setField(term89849, term89849.getClass(), "itsConst", null);
        setField(term89849, term89849.getClass(), "itsVariableNames", null);
        setIntField(term89849, term89849.getClass(), "varStart", 0);
        setField(term89849, term89849.getClass(), "compilerData", null);
        setIntField(term89849, term89849.getClass(), "type", 0);
        setField(term89849, term89849.getClass(), "next", null);
        setField(term89849, term89849.getClass(), "first", null);
        setField(term89849, term89849.getClass(), "last", null);
        setField(term89849, term89849.getClass(), "propListHead", null);
        setIntField(term89849, term89849.getClass(), "sourcePosition", 0);
        setField(term89849, term89849.getClass(), "jsType", null);
        setField(term89849, term89849.getClass(), "parent", null);
        setField(term89847, term89847.getClass(), "next", term89849);
        setField(term89847, term89847.getClass(), "first", null);
        setField(term89847, term89847.getClass(), "last", null);
        setField(term89847, term89847.getClass(), "propListHead", null);
        setIntField(term89847, term89847.getClass(), "sourcePosition", 0);
        setField(term89847, term89847.getClass(), "jsType", null);
        setField(term89847, term89847.getClass(), "parent", null);
        setField(term89845, term89845.getClass(), "first", term89847);
        setField(term89845, term89845.getClass(), "last", null);
        setField(term89845, term89845.getClass(), "propListHead", null);
        setIntField(term89845, term89845.getClass(), "sourcePosition", 0);
        setField(term89845, term89845.getClass(), "jsType", null);
        setField(term89845, term89845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89223;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term89131, args);
        assertTrue(recursiveEquals(term89131, term89889));
        assertTrue(recursiveEquals(term89223, term89890));
        assertTrue(recursiveEquals(retValue, term89845));
    }

};


