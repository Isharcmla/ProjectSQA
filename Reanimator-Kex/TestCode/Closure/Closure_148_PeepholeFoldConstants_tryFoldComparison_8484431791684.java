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

public class PeepholeFoldConstants_tryFoldComparison_8484431791684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433040;
     Object term433132;
     Object term433224;
     Object term433310;
     Object term433447;
     Object term433448;
     Object term433449;
     Object term433450;
     Object term433419;

    public PeepholeFoldConstants_tryFoldComparison_8484431791684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term433132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term433132, term433132.getClass(), "type", 16);
        term433224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term433224, term433224.getClass(), "type", 42);
        term433310 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term433310, term433310.getClass(), "type", 42);
        term433447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term433447, term433447.getClass(), "currentTraversal", null);
        term433448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term433448, term433448.getClass(), "str", null);
        setIntField(term433448, term433448.getClass(), "type", 42);
        setField(term433448, term433448.getClass(), "next", null);
        setField(term433448, term433448.getClass(), "first", null);
        setField(term433448, term433448.getClass(), "last", null);
        setField(term433448, term433448.getClass(), "propListHead", null);
        setIntField(term433448, term433448.getClass(), "sourcePosition", 0);
        setField(term433448, term433448.getClass(), "jsType", null);
        setField(term433448, term433448.getClass(), "parent", null);
        term433449 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term433449, term433449.getClass(), "str", null);
        setIntField(term433449, term433449.getClass(), "type", 16);
        setField(term433449, term433449.getClass(), "next", null);
        setField(term433449, term433449.getClass(), "first", null);
        setField(term433449, term433449.getClass(), "last", null);
        setField(term433449, term433449.getClass(), "propListHead", null);
        setIntField(term433449, term433449.getClass(), "sourcePosition", 0);
        setField(term433449, term433449.getClass(), "jsType", null);
        setField(term433449, term433449.getClass(), "parent", null);
        term433450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term433450, term433450.getClass(), "functionName", null);
        setBooleanField(term433450, term433450.getClass(), "itsNeedsActivation", false);
        setIntField(term433450, term433450.getClass(), "itsFunctionType", 0);
        setBooleanField(term433450, term433450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433450, term433450.getClass(), "encodedSourceStart", 0);
        setIntField(term433450, term433450.getClass(), "encodedSourceEnd", 0);
        setField(term433450, term433450.getClass(), "sourceName", null);
        setIntField(term433450, term433450.getClass(), "baseLineno", 0);
        setIntField(term433450, term433450.getClass(), "endLineno", 0);
        setField(term433450, term433450.getClass(), "functions", null);
        setField(term433450, term433450.getClass(), "regexps", null);
        setField(term433450, term433450.getClass(), "itsVariables", null);
        setField(term433450, term433450.getClass(), "itsConst", null);
        setField(term433450, term433450.getClass(), "itsVariableNames", null);
        setIntField(term433450, term433450.getClass(), "varStart", 0);
        setField(term433450, term433450.getClass(), "compilerData", null);
        setIntField(term433450, term433450.getClass(), "type", 42);
        setField(term433450, term433450.getClass(), "next", null);
        setField(term433450, term433450.getClass(), "first", null);
        setField(term433450, term433450.getClass(), "last", null);
        setField(term433450, term433450.getClass(), "propListHead", null);
        setIntField(term433450, term433450.getClass(), "sourcePosition", 0);
        setField(term433450, term433450.getClass(), "jsType", null);
        setField(term433450, term433450.getClass(), "parent", null);
        term433419 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term433419, term433419.getClass(), "str", null);
        setIntField(term433419, term433419.getClass(), "type", 16);
        setField(term433419, term433419.getClass(), "next", null);
        setField(term433419, term433419.getClass(), "first", null);
        setField(term433419, term433419.getClass(), "last", null);
        setField(term433419, term433419.getClass(), "propListHead", null);
        setIntField(term433419, term433419.getClass(), "sourcePosition", 0);
        setField(term433419, term433419.getClass(), "jsType", null);
        setField(term433419, term433419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term433132;
        args[1] = term433224;
        args[2] = term433310;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term433040, args);
        assertTrue(recursiveEquals(term433040, term433447));
        assertTrue(recursiveEquals(term433132, term433448));
        assertTrue(recursiveEquals(term433224, term433449));
        assertTrue(recursiveEquals(term433310, term433450));
        assertTrue(recursiveEquals(retValue, term433419));
    }

};


