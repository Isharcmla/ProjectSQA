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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63291;
     Object term63383;
     Object term64041;
     Object term64042;
     Object term63984;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63291 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63565 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term63475, term63475.getClass(), "next", term63565);
        setIntField(term63475, term63475.getClass(), "type", 16);
        setField(term63383, term63383.getClass(), "first", term63475);
        setIntField(term63383, term63383.getClass(), "type", 16);
        term64041 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term64041, term64041.getClass(), "currentTraversal", null);
        term64042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64044 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term64042, term64042.getClass(), "str", null);
        setIntField(term64042, term64042.getClass(), "type", 16);
        setField(term64042, term64042.getClass(), "next", null);
        setField(term64043, term64043.getClass(), "str", null);
        setIntField(term64043, term64043.getClass(), "type", 16);
        setIntField(term64044, term64044.getClass(), "encodedSourceStart", 0);
        setIntField(term64044, term64044.getClass(), "encodedSourceEnd", 0);
        setField(term64044, term64044.getClass(), "sourceName", null);
        setIntField(term64044, term64044.getClass(), "baseLineno", 0);
        setIntField(term64044, term64044.getClass(), "endLineno", 0);
        setField(term64044, term64044.getClass(), "functions", null);
        setField(term64044, term64044.getClass(), "regexps", null);
        setField(term64044, term64044.getClass(), "itsVariables", null);
        setField(term64044, term64044.getClass(), "itsConst", null);
        setField(term64044, term64044.getClass(), "itsVariableNames", null);
        setIntField(term64044, term64044.getClass(), "varStart", 0);
        setField(term64044, term64044.getClass(), "compilerData", null);
        setIntField(term64044, term64044.getClass(), "type", 0);
        setField(term64044, term64044.getClass(), "next", null);
        setField(term64044, term64044.getClass(), "first", null);
        setField(term64044, term64044.getClass(), "last", null);
        setField(term64044, term64044.getClass(), "propListHead", null);
        setIntField(term64044, term64044.getClass(), "sourcePosition", 0);
        setField(term64044, term64044.getClass(), "jsType", null);
        setField(term64044, term64044.getClass(), "parent", null);
        setField(term64043, term64043.getClass(), "next", term64044);
        setField(term64043, term64043.getClass(), "first", null);
        setField(term64043, term64043.getClass(), "last", null);
        setField(term64043, term64043.getClass(), "propListHead", null);
        setIntField(term64043, term64043.getClass(), "sourcePosition", 0);
        setField(term64043, term64043.getClass(), "jsType", null);
        setField(term64043, term64043.getClass(), "parent", null);
        setField(term64042, term64042.getClass(), "first", term64043);
        setField(term64042, term64042.getClass(), "last", null);
        setField(term64042, term64042.getClass(), "propListHead", null);
        setIntField(term64042, term64042.getClass(), "sourcePosition", 0);
        setField(term64042, term64042.getClass(), "jsType", null);
        setField(term64042, term64042.getClass(), "parent", null);
        term63984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63988 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term63984, term63984.getClass(), "str", null);
        setIntField(term63984, term63984.getClass(), "type", 16);
        setField(term63984, term63984.getClass(), "next", null);
        setField(term63986, term63986.getClass(), "str", null);
        setIntField(term63986, term63986.getClass(), "type", 16);
        setIntField(term63988, term63988.getClass(), "encodedSourceStart", 0);
        setIntField(term63988, term63988.getClass(), "encodedSourceEnd", 0);
        setField(term63988, term63988.getClass(), "sourceName", null);
        setIntField(term63988, term63988.getClass(), "baseLineno", 0);
        setIntField(term63988, term63988.getClass(), "endLineno", 0);
        setField(term63988, term63988.getClass(), "functions", null);
        setField(term63988, term63988.getClass(), "regexps", null);
        setField(term63988, term63988.getClass(), "itsVariables", null);
        setField(term63988, term63988.getClass(), "itsConst", null);
        setField(term63988, term63988.getClass(), "itsVariableNames", null);
        setIntField(term63988, term63988.getClass(), "varStart", 0);
        setField(term63988, term63988.getClass(), "compilerData", null);
        setIntField(term63988, term63988.getClass(), "type", 0);
        setField(term63988, term63988.getClass(), "next", null);
        setField(term63988, term63988.getClass(), "first", null);
        setField(term63988, term63988.getClass(), "last", null);
        setField(term63988, term63988.getClass(), "propListHead", null);
        setIntField(term63988, term63988.getClass(), "sourcePosition", 0);
        setField(term63988, term63988.getClass(), "jsType", null);
        setField(term63988, term63988.getClass(), "parent", null);
        setField(term63986, term63986.getClass(), "next", term63988);
        setField(term63986, term63986.getClass(), "first", null);
        setField(term63986, term63986.getClass(), "last", null);
        setField(term63986, term63986.getClass(), "propListHead", null);
        setIntField(term63986, term63986.getClass(), "sourcePosition", 0);
        setField(term63986, term63986.getClass(), "jsType", null);
        setField(term63986, term63986.getClass(), "parent", null);
        setField(term63984, term63984.getClass(), "first", term63986);
        setField(term63984, term63984.getClass(), "last", null);
        setField(term63984, term63984.getClass(), "propListHead", null);
        setIntField(term63984, term63984.getClass(), "sourcePosition", 0);
        setField(term63984, term63984.getClass(), "jsType", null);
        setField(term63984, term63984.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63383;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term63291, args);
        assertTrue(recursiveEquals(term63291, term64041));
        assertTrue(recursiveEquals(term63383, term64042));
        assertTrue(recursiveEquals(retValue, term63984));
    }

};


