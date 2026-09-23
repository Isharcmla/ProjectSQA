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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547260;
     Object term547346;
     Object term547530;
     Object term547622;
     Object term548717;
     Object term548718;
     Object term548720;
     Object term548721;
     Object term548661;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term547346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term547438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term547346, term547346.getClass(), "parent", term547438);
        setIntField(term547346, term547346.getClass(), "type", 0);
        term547530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term547530, term547530.getClass(), "type", 0);
        term547622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term547622, term547622.getClass(), "type", 64);
        term548717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term548717, term548717.getClass(), "currentTraversal", null);
        term548718 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term548718, term548718.getClass(), "functionName", null);
        setBooleanField(term548718, term548718.getClass(), "itsNeedsActivation", false);
        setIntField(term548718, term548718.getClass(), "itsFunctionType", 0);
        setBooleanField(term548718, term548718.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548718, term548718.getClass(), "encodedSourceStart", 0);
        setIntField(term548718, term548718.getClass(), "encodedSourceEnd", 0);
        setField(term548718, term548718.getClass(), "sourceName", null);
        setIntField(term548718, term548718.getClass(), "baseLineno", 0);
        setIntField(term548718, term548718.getClass(), "endLineno", 0);
        setField(term548718, term548718.getClass(), "functions", null);
        setField(term548718, term548718.getClass(), "regexps", null);
        setField(term548718, term548718.getClass(), "itsVariables", null);
        setField(term548718, term548718.getClass(), "itsConst", null);
        setField(term548718, term548718.getClass(), "itsVariableNames", null);
        setIntField(term548718, term548718.getClass(), "varStart", 0);
        setField(term548718, term548718.getClass(), "compilerData", null);
        setIntField(term548718, term548718.getClass(), "type", 0);
        setField(term548718, term548718.getClass(), "next", null);
        setField(term548718, term548718.getClass(), "first", null);
        setField(term548718, term548718.getClass(), "last", null);
        setField(term548718, term548718.getClass(), "propListHead", null);
        setIntField(term548718, term548718.getClass(), "sourcePosition", 0);
        setField(term548718, term548718.getClass(), "jsType", null);
        setField(term548719, term548719.getClass(), "str", null);
        setIntField(term548719, term548719.getClass(), "type", 0);
        setField(term548719, term548719.getClass(), "next", null);
        setField(term548719, term548719.getClass(), "first", null);
        setField(term548719, term548719.getClass(), "last", null);
        setField(term548719, term548719.getClass(), "propListHead", null);
        setIntField(term548719, term548719.getClass(), "sourcePosition", 0);
        setField(term548719, term548719.getClass(), "jsType", null);
        setField(term548719, term548719.getClass(), "parent", null);
        setField(term548718, term548718.getClass(), "parent", term548719);
        term548720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term548720, term548720.getClass(), "str", null);
        setIntField(term548720, term548720.getClass(), "type", 0);
        setField(term548720, term548720.getClass(), "next", null);
        setField(term548720, term548720.getClass(), "first", null);
        setField(term548720, term548720.getClass(), "last", null);
        setField(term548720, term548720.getClass(), "propListHead", null);
        setIntField(term548720, term548720.getClass(), "sourcePosition", 0);
        setField(term548720, term548720.getClass(), "jsType", null);
        setField(term548720, term548720.getClass(), "parent", null);
        term548721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term548721, term548721.getClass(), "number", 0.0);
        setIntField(term548721, term548721.getClass(), "type", 64);
        setField(term548721, term548721.getClass(), "next", null);
        setField(term548721, term548721.getClass(), "first", null);
        setField(term548721, term548721.getClass(), "last", null);
        setField(term548721, term548721.getClass(), "propListHead", null);
        setIntField(term548721, term548721.getClass(), "sourcePosition", 0);
        setField(term548721, term548721.getClass(), "jsType", null);
        setField(term548721, term548721.getClass(), "parent", null);
        term548661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term548661, term548661.getClass(), "functionName", null);
        setBooleanField(term548661, term548661.getClass(), "itsNeedsActivation", false);
        setIntField(term548661, term548661.getClass(), "itsFunctionType", 0);
        setBooleanField(term548661, term548661.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548661, term548661.getClass(), "encodedSourceStart", 0);
        setIntField(term548661, term548661.getClass(), "encodedSourceEnd", 0);
        setField(term548661, term548661.getClass(), "sourceName", null);
        setIntField(term548661, term548661.getClass(), "baseLineno", 0);
        setIntField(term548661, term548661.getClass(), "endLineno", 0);
        setField(term548661, term548661.getClass(), "functions", null);
        setField(term548661, term548661.getClass(), "regexps", null);
        setField(term548661, term548661.getClass(), "itsVariables", null);
        setField(term548661, term548661.getClass(), "itsConst", null);
        setField(term548661, term548661.getClass(), "itsVariableNames", null);
        setIntField(term548661, term548661.getClass(), "varStart", 0);
        setField(term548661, term548661.getClass(), "compilerData", null);
        setIntField(term548661, term548661.getClass(), "type", 0);
        setField(term548661, term548661.getClass(), "next", null);
        setField(term548661, term548661.getClass(), "first", null);
        setField(term548661, term548661.getClass(), "last", null);
        setField(term548661, term548661.getClass(), "propListHead", null);
        setIntField(term548661, term548661.getClass(), "sourcePosition", 0);
        setField(term548661, term548661.getClass(), "jsType", null);
        setField(term548672, term548672.getClass(), "str", null);
        setIntField(term548672, term548672.getClass(), "type", 0);
        setField(term548672, term548672.getClass(), "next", null);
        setField(term548672, term548672.getClass(), "first", null);
        setField(term548672, term548672.getClass(), "last", null);
        setField(term548672, term548672.getClass(), "propListHead", null);
        setIntField(term548672, term548672.getClass(), "sourcePosition", 0);
        setField(term548672, term548672.getClass(), "jsType", null);
        setField(term548672, term548672.getClass(), "parent", null);
        setField(term548661, term548661.getClass(), "parent", term548672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term547346;
        args[1] = term547530;
        args[2] = term547622;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term547260, args);
        assertTrue(recursiveEquals(term547260, term548717));
        assertTrue(recursiveEquals(term547346, term548718));
        assertTrue(recursiveEquals(term547530, term548720));
        assertTrue(recursiveEquals(term547622, term548721));
        assertTrue(recursiveEquals(retValue, term548661));
    }

};


