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

public class PeepholeFoldConstants_tryFoldComparison_848443179533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141936;
     Object term142028;
     Object term142120;
     Object term142206;
     Object term142656;
     Object term142657;
     Object term142658;
     Object term142659;
     Object term142630;

    public PeepholeFoldConstants_tryFoldComparison_848443179533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term142028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142028, term142028.getClass(), "type", 16);
        term142120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142120, term142120.getClass(), "type", 16);
        term142206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term142656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term142656, term142656.getClass(), "currentTraversal", null);
        term142657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142657, term142657.getClass(), "str", null);
        setIntField(term142657, term142657.getClass(), "type", 16);
        setField(term142657, term142657.getClass(), "next", null);
        setField(term142657, term142657.getClass(), "first", null);
        setField(term142657, term142657.getClass(), "last", null);
        setField(term142657, term142657.getClass(), "propListHead", null);
        setIntField(term142657, term142657.getClass(), "sourcePosition", 0);
        setField(term142657, term142657.getClass(), "jsType", null);
        setField(term142657, term142657.getClass(), "parent", null);
        term142658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142658, term142658.getClass(), "str", null);
        setIntField(term142658, term142658.getClass(), "type", 16);
        setField(term142658, term142658.getClass(), "next", null);
        setField(term142658, term142658.getClass(), "first", null);
        setField(term142658, term142658.getClass(), "last", null);
        setField(term142658, term142658.getClass(), "propListHead", null);
        setIntField(term142658, term142658.getClass(), "sourcePosition", 0);
        setField(term142658, term142658.getClass(), "jsType", null);
        setField(term142658, term142658.getClass(), "parent", null);
        term142659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term142659, term142659.getClass(), "functionName", null);
        setBooleanField(term142659, term142659.getClass(), "itsNeedsActivation", false);
        setIntField(term142659, term142659.getClass(), "itsFunctionType", 0);
        setBooleanField(term142659, term142659.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term142659, term142659.getClass(), "encodedSourceStart", 0);
        setIntField(term142659, term142659.getClass(), "encodedSourceEnd", 0);
        setField(term142659, term142659.getClass(), "sourceName", null);
        setIntField(term142659, term142659.getClass(), "baseLineno", 0);
        setIntField(term142659, term142659.getClass(), "endLineno", 0);
        setField(term142659, term142659.getClass(), "functions", null);
        setField(term142659, term142659.getClass(), "regexps", null);
        setField(term142659, term142659.getClass(), "itsVariables", null);
        setField(term142659, term142659.getClass(), "itsConst", null);
        setField(term142659, term142659.getClass(), "itsVariableNames", null);
        setIntField(term142659, term142659.getClass(), "varStart", 0);
        setField(term142659, term142659.getClass(), "compilerData", null);
        setIntField(term142659, term142659.getClass(), "type", 0);
        setField(term142659, term142659.getClass(), "next", null);
        setField(term142659, term142659.getClass(), "first", null);
        setField(term142659, term142659.getClass(), "last", null);
        setField(term142659, term142659.getClass(), "propListHead", null);
        setIntField(term142659, term142659.getClass(), "sourcePosition", 0);
        setField(term142659, term142659.getClass(), "jsType", null);
        setField(term142659, term142659.getClass(), "parent", null);
        term142630 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142630, term142630.getClass(), "str", null);
        setIntField(term142630, term142630.getClass(), "type", 16);
        setField(term142630, term142630.getClass(), "next", null);
        setField(term142630, term142630.getClass(), "first", null);
        setField(term142630, term142630.getClass(), "last", null);
        setField(term142630, term142630.getClass(), "propListHead", null);
        setIntField(term142630, term142630.getClass(), "sourcePosition", 0);
        setField(term142630, term142630.getClass(), "jsType", null);
        setField(term142630, term142630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term142028;
        args[1] = term142120;
        args[2] = term142206;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term141936, args);
        assertTrue(recursiveEquals(term141936, term142656));
        assertTrue(recursiveEquals(term142028, term142657));
        assertTrue(recursiveEquals(term142120, term142658));
        assertTrue(recursiveEquals(term142206, term142659));
        assertTrue(recursiveEquals(retValue, term142630));
    }

};


