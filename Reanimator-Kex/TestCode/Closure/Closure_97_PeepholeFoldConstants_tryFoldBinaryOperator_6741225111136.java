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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350235;
     Object term350327;
     Object term350587;
     Object term350588;
     Object term350522;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term350327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350509 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term350509, term350509.getClass(), "type", 42);
        setField(term350419, term350419.getClass(), "next", term350509);
        setIntField(term350419, term350419.getClass(), "type", 42);
        setField(term350327, term350327.getClass(), "first", term350419);
        setIntField(term350327, term350327.getClass(), "type", 14);
        term350587 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term350587, term350587.getClass(), "currentTraversal", null);
        term350588 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350590 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term350588, term350588.getClass(), "number", 0.0);
        setIntField(term350588, term350588.getClass(), "type", 14);
        setField(term350588, term350588.getClass(), "next", null);
        setDoubleField(term350589, term350589.getClass(), "number", 0.0);
        setIntField(term350589, term350589.getClass(), "type", 42);
        setIntField(term350590, term350590.getClass(), "encodedSourceStart", 0);
        setIntField(term350590, term350590.getClass(), "encodedSourceEnd", 0);
        setField(term350590, term350590.getClass(), "sourceName", null);
        setIntField(term350590, term350590.getClass(), "baseLineno", 0);
        setIntField(term350590, term350590.getClass(), "endLineno", 0);
        setField(term350590, term350590.getClass(), "functions", null);
        setField(term350590, term350590.getClass(), "regexps", null);
        setField(term350590, term350590.getClass(), "itsVariables", null);
        setField(term350590, term350590.getClass(), "itsConst", null);
        setField(term350590, term350590.getClass(), "itsVariableNames", null);
        setIntField(term350590, term350590.getClass(), "varStart", 0);
        setField(term350590, term350590.getClass(), "compilerData", null);
        setIntField(term350590, term350590.getClass(), "type", 42);
        setField(term350590, term350590.getClass(), "next", null);
        setField(term350590, term350590.getClass(), "first", null);
        setField(term350590, term350590.getClass(), "last", null);
        setField(term350590, term350590.getClass(), "propListHead", null);
        setIntField(term350590, term350590.getClass(), "sourcePosition", 0);
        setField(term350590, term350590.getClass(), "jsType", null);
        setField(term350590, term350590.getClass(), "parent", null);
        setField(term350589, term350589.getClass(), "next", term350590);
        setField(term350589, term350589.getClass(), "first", null);
        setField(term350589, term350589.getClass(), "last", null);
        setField(term350589, term350589.getClass(), "propListHead", null);
        setIntField(term350589, term350589.getClass(), "sourcePosition", 0);
        setField(term350589, term350589.getClass(), "jsType", null);
        setField(term350589, term350589.getClass(), "parent", null);
        setField(term350588, term350588.getClass(), "first", term350589);
        setField(term350588, term350588.getClass(), "last", null);
        setField(term350588, term350588.getClass(), "propListHead", null);
        setIntField(term350588, term350588.getClass(), "sourcePosition", 0);
        setField(term350588, term350588.getClass(), "jsType", null);
        setField(term350588, term350588.getClass(), "parent", null);
        term350522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350528 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term350522, term350522.getClass(), "number", 0.0);
        setIntField(term350522, term350522.getClass(), "type", 14);
        setField(term350522, term350522.getClass(), "next", null);
        setDoubleField(term350525, term350525.getClass(), "number", 0.0);
        setIntField(term350525, term350525.getClass(), "type", 42);
        setIntField(term350528, term350528.getClass(), "encodedSourceStart", 0);
        setIntField(term350528, term350528.getClass(), "encodedSourceEnd", 0);
        setField(term350528, term350528.getClass(), "sourceName", null);
        setIntField(term350528, term350528.getClass(), "baseLineno", 0);
        setIntField(term350528, term350528.getClass(), "endLineno", 0);
        setField(term350528, term350528.getClass(), "functions", null);
        setField(term350528, term350528.getClass(), "regexps", null);
        setField(term350528, term350528.getClass(), "itsVariables", null);
        setField(term350528, term350528.getClass(), "itsConst", null);
        setField(term350528, term350528.getClass(), "itsVariableNames", null);
        setIntField(term350528, term350528.getClass(), "varStart", 0);
        setField(term350528, term350528.getClass(), "compilerData", null);
        setIntField(term350528, term350528.getClass(), "type", 42);
        setField(term350528, term350528.getClass(), "next", null);
        setField(term350528, term350528.getClass(), "first", null);
        setField(term350528, term350528.getClass(), "last", null);
        setField(term350528, term350528.getClass(), "propListHead", null);
        setIntField(term350528, term350528.getClass(), "sourcePosition", 0);
        setField(term350528, term350528.getClass(), "jsType", null);
        setField(term350528, term350528.getClass(), "parent", null);
        setField(term350525, term350525.getClass(), "next", term350528);
        setField(term350525, term350525.getClass(), "first", null);
        setField(term350525, term350525.getClass(), "last", null);
        setField(term350525, term350525.getClass(), "propListHead", null);
        setIntField(term350525, term350525.getClass(), "sourcePosition", 0);
        setField(term350525, term350525.getClass(), "jsType", null);
        setField(term350525, term350525.getClass(), "parent", null);
        setField(term350522, term350522.getClass(), "first", term350525);
        setField(term350522, term350522.getClass(), "last", null);
        setField(term350522, term350522.getClass(), "propListHead", null);
        setIntField(term350522, term350522.getClass(), "sourcePosition", 0);
        setField(term350522, term350522.getClass(), "jsType", null);
        setField(term350522, term350522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term350327;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term350235, args);
        assertTrue(recursiveEquals(term350235, term350587));
        assertTrue(recursiveEquals(term350327, term350588));
        assertTrue(recursiveEquals(retValue, term350522));
    }

};


