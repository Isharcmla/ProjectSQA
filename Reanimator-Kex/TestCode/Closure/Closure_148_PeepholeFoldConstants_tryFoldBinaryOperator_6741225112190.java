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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597995;
     Object term598087;
     Object term598786;
     Object term598787;
     Object term598733;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term598087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598265 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term598179, term598179.getClass(), "next", term598265);
        setIntField(term598179, term598179.getClass(), "type", 39);
        setField(term598087, term598087.getClass(), "first", term598179);
        setIntField(term598087, term598087.getClass(), "type", 23);
        term598786 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term598786, term598786.getClass(), "currentTraversal", null);
        term598787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598789 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term598787, term598787.getClass(), "str", null);
        setIntField(term598787, term598787.getClass(), "type", 23);
        setField(term598787, term598787.getClass(), "next", null);
        setField(term598788, term598788.getClass(), "str", null);
        setIntField(term598788, term598788.getClass(), "type", 39);
        setField(term598789, term598789.getClass(), "functionName", null);
        setBooleanField(term598789, term598789.getClass(), "itsNeedsActivation", false);
        setIntField(term598789, term598789.getClass(), "itsFunctionType", 0);
        setBooleanField(term598789, term598789.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term598789, term598789.getClass(), "encodedSourceStart", 0);
        setIntField(term598789, term598789.getClass(), "encodedSourceEnd", 0);
        setField(term598789, term598789.getClass(), "sourceName", null);
        setIntField(term598789, term598789.getClass(), "baseLineno", 0);
        setIntField(term598789, term598789.getClass(), "endLineno", 0);
        setField(term598789, term598789.getClass(), "functions", null);
        setField(term598789, term598789.getClass(), "regexps", null);
        setField(term598789, term598789.getClass(), "itsVariables", null);
        setField(term598789, term598789.getClass(), "itsConst", null);
        setField(term598789, term598789.getClass(), "itsVariableNames", null);
        setIntField(term598789, term598789.getClass(), "varStart", 0);
        setField(term598789, term598789.getClass(), "compilerData", null);
        setIntField(term598789, term598789.getClass(), "type", 0);
        setField(term598789, term598789.getClass(), "next", null);
        setField(term598789, term598789.getClass(), "first", null);
        setField(term598789, term598789.getClass(), "last", null);
        setField(term598789, term598789.getClass(), "propListHead", null);
        setIntField(term598789, term598789.getClass(), "sourcePosition", 0);
        setField(term598789, term598789.getClass(), "jsType", null);
        setField(term598789, term598789.getClass(), "parent", null);
        setField(term598788, term598788.getClass(), "next", term598789);
        setField(term598788, term598788.getClass(), "first", null);
        setField(term598788, term598788.getClass(), "last", null);
        setField(term598788, term598788.getClass(), "propListHead", null);
        setIntField(term598788, term598788.getClass(), "sourcePosition", 0);
        setField(term598788, term598788.getClass(), "jsType", null);
        setField(term598788, term598788.getClass(), "parent", null);
        setField(term598787, term598787.getClass(), "first", term598788);
        setField(term598787, term598787.getClass(), "last", null);
        setField(term598787, term598787.getClass(), "propListHead", null);
        setIntField(term598787, term598787.getClass(), "sourcePosition", 0);
        setField(term598787, term598787.getClass(), "jsType", null);
        setField(term598787, term598787.getClass(), "parent", null);
        term598733 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term598737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term598733, term598733.getClass(), "str", null);
        setIntField(term598733, term598733.getClass(), "type", 23);
        setField(term598733, term598733.getClass(), "next", null);
        setField(term598735, term598735.getClass(), "str", null);
        setIntField(term598735, term598735.getClass(), "type", 39);
        setField(term598737, term598737.getClass(), "functionName", null);
        setBooleanField(term598737, term598737.getClass(), "itsNeedsActivation", false);
        setIntField(term598737, term598737.getClass(), "itsFunctionType", 0);
        setBooleanField(term598737, term598737.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term598737, term598737.getClass(), "encodedSourceStart", 0);
        setIntField(term598737, term598737.getClass(), "encodedSourceEnd", 0);
        setField(term598737, term598737.getClass(), "sourceName", null);
        setIntField(term598737, term598737.getClass(), "baseLineno", 0);
        setIntField(term598737, term598737.getClass(), "endLineno", 0);
        setField(term598737, term598737.getClass(), "functions", null);
        setField(term598737, term598737.getClass(), "regexps", null);
        setField(term598737, term598737.getClass(), "itsVariables", null);
        setField(term598737, term598737.getClass(), "itsConst", null);
        setField(term598737, term598737.getClass(), "itsVariableNames", null);
        setIntField(term598737, term598737.getClass(), "varStart", 0);
        setField(term598737, term598737.getClass(), "compilerData", null);
        setIntField(term598737, term598737.getClass(), "type", 0);
        setField(term598737, term598737.getClass(), "next", null);
        setField(term598737, term598737.getClass(), "first", null);
        setField(term598737, term598737.getClass(), "last", null);
        setField(term598737, term598737.getClass(), "propListHead", null);
        setIntField(term598737, term598737.getClass(), "sourcePosition", 0);
        setField(term598737, term598737.getClass(), "jsType", null);
        setField(term598737, term598737.getClass(), "parent", null);
        setField(term598735, term598735.getClass(), "next", term598737);
        setField(term598735, term598735.getClass(), "first", null);
        setField(term598735, term598735.getClass(), "last", null);
        setField(term598735, term598735.getClass(), "propListHead", null);
        setIntField(term598735, term598735.getClass(), "sourcePosition", 0);
        setField(term598735, term598735.getClass(), "jsType", null);
        setField(term598735, term598735.getClass(), "parent", null);
        setField(term598733, term598733.getClass(), "first", term598735);
        setField(term598733, term598733.getClass(), "last", null);
        setField(term598733, term598733.getClass(), "propListHead", null);
        setIntField(term598733, term598733.getClass(), "sourcePosition", 0);
        setField(term598733, term598733.getClass(), "jsType", null);
        setField(term598733, term598733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term598087;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term597995, args);
        assertTrue(recursiveEquals(term597995, term598786));
        assertTrue(recursiveEquals(term598087, term598787));
        assertTrue(recursiveEquals(retValue, term598733));
    }

};


