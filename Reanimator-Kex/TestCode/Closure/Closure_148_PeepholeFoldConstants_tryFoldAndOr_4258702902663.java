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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760425;
     Object term760517;
     Object term760695;
     Object term760787;
     Object term761323;
     Object term761324;
     Object term761326;
     Object term761327;
     Object term761244;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760425 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term760517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term760609, term760609.getClass(), "type", 108);
        setField(term760517, term760517.getClass(), "parent", term760609);
        setIntField(term760517, term760517.getClass(), "type", 0);
        term760695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term760695, term760695.getClass(), "type", 0);
        term760787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term760787, term760787.getClass(), "type", 47);
        term761323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term761323, term761323.getClass(), "currentTraversal", null);
        term761324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term761325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term761324, term761324.getClass(), "number", 0.0);
        setIntField(term761324, term761324.getClass(), "type", 0);
        setField(term761324, term761324.getClass(), "next", null);
        setField(term761324, term761324.getClass(), "first", null);
        setField(term761324, term761324.getClass(), "last", null);
        setField(term761324, term761324.getClass(), "propListHead", null);
        setIntField(term761324, term761324.getClass(), "sourcePosition", 0);
        setField(term761324, term761324.getClass(), "jsType", null);
        setDoubleField(term761325, term761325.getClass(), "number", 0.0);
        setIntField(term761325, term761325.getClass(), "type", 108);
        setField(term761325, term761325.getClass(), "next", null);
        setField(term761325, term761325.getClass(), "first", null);
        setField(term761325, term761325.getClass(), "last", null);
        setField(term761325, term761325.getClass(), "propListHead", null);
        setIntField(term761325, term761325.getClass(), "sourcePosition", 0);
        setField(term761325, term761325.getClass(), "jsType", null);
        setField(term761325, term761325.getClass(), "parent", null);
        setField(term761324, term761324.getClass(), "parent", term761325);
        term761326 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term761326, term761326.getClass(), "functionName", null);
        setBooleanField(term761326, term761326.getClass(), "itsNeedsActivation", false);
        setIntField(term761326, term761326.getClass(), "itsFunctionType", 0);
        setBooleanField(term761326, term761326.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term761326, term761326.getClass(), "encodedSourceStart", 0);
        setIntField(term761326, term761326.getClass(), "encodedSourceEnd", 0);
        setField(term761326, term761326.getClass(), "sourceName", null);
        setIntField(term761326, term761326.getClass(), "baseLineno", 0);
        setIntField(term761326, term761326.getClass(), "endLineno", 0);
        setField(term761326, term761326.getClass(), "functions", null);
        setField(term761326, term761326.getClass(), "regexps", null);
        setField(term761326, term761326.getClass(), "itsVariables", null);
        setField(term761326, term761326.getClass(), "itsConst", null);
        setField(term761326, term761326.getClass(), "itsVariableNames", null);
        setIntField(term761326, term761326.getClass(), "varStart", 0);
        setField(term761326, term761326.getClass(), "compilerData", null);
        setIntField(term761326, term761326.getClass(), "type", 0);
        setField(term761326, term761326.getClass(), "next", null);
        setField(term761326, term761326.getClass(), "first", null);
        setField(term761326, term761326.getClass(), "last", null);
        setField(term761326, term761326.getClass(), "propListHead", null);
        setIntField(term761326, term761326.getClass(), "sourcePosition", 0);
        setField(term761326, term761326.getClass(), "jsType", null);
        setField(term761326, term761326.getClass(), "parent", null);
        term761327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term761327, term761327.getClass(), "number", 0.0);
        setIntField(term761327, term761327.getClass(), "type", 47);
        setField(term761327, term761327.getClass(), "next", null);
        setField(term761327, term761327.getClass(), "first", null);
        setField(term761327, term761327.getClass(), "last", null);
        setField(term761327, term761327.getClass(), "propListHead", null);
        setIntField(term761327, term761327.getClass(), "sourcePosition", 0);
        setField(term761327, term761327.getClass(), "jsType", null);
        setField(term761327, term761327.getClass(), "parent", null);
        term761244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term761248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term761244, term761244.getClass(), "number", 0.0);
        setIntField(term761244, term761244.getClass(), "type", 0);
        setField(term761244, term761244.getClass(), "next", null);
        setField(term761244, term761244.getClass(), "first", null);
        setField(term761244, term761244.getClass(), "last", null);
        setField(term761244, term761244.getClass(), "propListHead", null);
        setIntField(term761244, term761244.getClass(), "sourcePosition", 0);
        setField(term761244, term761244.getClass(), "jsType", null);
        setDoubleField(term761248, term761248.getClass(), "number", 0.0);
        setIntField(term761248, term761248.getClass(), "type", 108);
        setField(term761248, term761248.getClass(), "next", null);
        setField(term761248, term761248.getClass(), "first", null);
        setField(term761248, term761248.getClass(), "last", null);
        setField(term761248, term761248.getClass(), "propListHead", null);
        setIntField(term761248, term761248.getClass(), "sourcePosition", 0);
        setField(term761248, term761248.getClass(), "jsType", null);
        setField(term761248, term761248.getClass(), "parent", null);
        setField(term761244, term761244.getClass(), "parent", term761248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term760517;
        args[1] = term760695;
        args[2] = term760787;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term760425, args);
        assertTrue(recursiveEquals(term760425, term761323));
        assertTrue(recursiveEquals(term760517, term761324));
        assertTrue(recursiveEquals(term760695, term761326));
        assertTrue(recursiveEquals(term760787, term761327));
        assertTrue(recursiveEquals(retValue, term761244));
    }

};


