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

public class PeepholeFoldConstants_tryFoldAndOr_425870290380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88347;
     Object term88439;
     Object term88531;
     Object term88617;
     Object term89012;
     Object term89013;
     Object term89014;
     Object term89015;
     Object term88966;

    public PeepholeFoldConstants_tryFoldAndOr_425870290380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88347 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term88439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term88439, term88439.getClass(), "parent", null);
        setIntField(term88439, term88439.getClass(), "type", 0);
        term88531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term88531, term88531.getClass(), "type", 0);
        term88617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term89012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term89012, term89012.getClass(), "currentTraversal", null);
        term89013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term89013, term89013.getClass(), "str", null);
        setIntField(term89013, term89013.getClass(), "type", 0);
        setField(term89013, term89013.getClass(), "next", null);
        setField(term89013, term89013.getClass(), "first", null);
        setField(term89013, term89013.getClass(), "last", null);
        setField(term89013, term89013.getClass(), "propListHead", null);
        setIntField(term89013, term89013.getClass(), "sourcePosition", 0);
        setField(term89013, term89013.getClass(), "jsType", null);
        setField(term89013, term89013.getClass(), "parent", null);
        term89014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term89014, term89014.getClass(), "str", null);
        setIntField(term89014, term89014.getClass(), "type", 0);
        setField(term89014, term89014.getClass(), "next", null);
        setField(term89014, term89014.getClass(), "first", null);
        setField(term89014, term89014.getClass(), "last", null);
        setField(term89014, term89014.getClass(), "propListHead", null);
        setIntField(term89014, term89014.getClass(), "sourcePosition", 0);
        setField(term89014, term89014.getClass(), "jsType", null);
        setField(term89014, term89014.getClass(), "parent", null);
        term89015 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term89015, term89015.getClass(), "functionName", null);
        setBooleanField(term89015, term89015.getClass(), "itsNeedsActivation", false);
        setIntField(term89015, term89015.getClass(), "itsFunctionType", 0);
        setBooleanField(term89015, term89015.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term89015, term89015.getClass(), "encodedSourceStart", 0);
        setIntField(term89015, term89015.getClass(), "encodedSourceEnd", 0);
        setField(term89015, term89015.getClass(), "sourceName", null);
        setIntField(term89015, term89015.getClass(), "baseLineno", 0);
        setIntField(term89015, term89015.getClass(), "endLineno", 0);
        setField(term89015, term89015.getClass(), "functions", null);
        setField(term89015, term89015.getClass(), "regexps", null);
        setField(term89015, term89015.getClass(), "itsVariables", null);
        setField(term89015, term89015.getClass(), "itsConst", null);
        setField(term89015, term89015.getClass(), "itsVariableNames", null);
        setIntField(term89015, term89015.getClass(), "varStart", 0);
        setField(term89015, term89015.getClass(), "compilerData", null);
        setIntField(term89015, term89015.getClass(), "type", 0);
        setField(term89015, term89015.getClass(), "next", null);
        setField(term89015, term89015.getClass(), "first", null);
        setField(term89015, term89015.getClass(), "last", null);
        setField(term89015, term89015.getClass(), "propListHead", null);
        setIntField(term89015, term89015.getClass(), "sourcePosition", 0);
        setField(term89015, term89015.getClass(), "jsType", null);
        setField(term89015, term89015.getClass(), "parent", null);
        term88966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term88966, term88966.getClass(), "str", null);
        setIntField(term88966, term88966.getClass(), "type", 0);
        setField(term88966, term88966.getClass(), "next", null);
        setField(term88966, term88966.getClass(), "first", null);
        setField(term88966, term88966.getClass(), "last", null);
        setField(term88966, term88966.getClass(), "propListHead", null);
        setIntField(term88966, term88966.getClass(), "sourcePosition", 0);
        setField(term88966, term88966.getClass(), "jsType", null);
        setField(term88966, term88966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term88439;
        args[1] = term88531;
        args[2] = term88617;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term88347, args);
        assertTrue(recursiveEquals(term88347, term89012));
        assertTrue(recursiveEquals(term88439, term89013));
        assertTrue(recursiveEquals(term88531, term89014));
        assertTrue(recursiveEquals(term88617, term89015));
        assertTrue(recursiveEquals(retValue, term88966));
    }

};


