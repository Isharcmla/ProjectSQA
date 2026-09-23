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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317999;
     Object term318085;
     Object term318177;
     Object term318269;
     Object term318674;
     Object term318675;
     Object term318676;
     Object term318677;
     Object term318626;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317999 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term318085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318085, term318085.getClass(), "parent", null);
        setIntField(term318085, term318085.getClass(), "type", 0);
        term318177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term318177, term318177.getClass(), "type", 0);
        term318269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term318674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term318674, term318674.getClass(), "currentTraversal", null);
        term318675 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318675, term318675.getClass(), "functionName", null);
        setBooleanField(term318675, term318675.getClass(), "itsNeedsActivation", false);
        setIntField(term318675, term318675.getClass(), "itsFunctionType", 0);
        setBooleanField(term318675, term318675.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318675, term318675.getClass(), "encodedSourceStart", 0);
        setIntField(term318675, term318675.getClass(), "encodedSourceEnd", 0);
        setField(term318675, term318675.getClass(), "sourceName", null);
        setIntField(term318675, term318675.getClass(), "baseLineno", 0);
        setIntField(term318675, term318675.getClass(), "endLineno", 0);
        setField(term318675, term318675.getClass(), "functions", null);
        setField(term318675, term318675.getClass(), "regexps", null);
        setField(term318675, term318675.getClass(), "itsVariables", null);
        setField(term318675, term318675.getClass(), "itsConst", null);
        setField(term318675, term318675.getClass(), "itsVariableNames", null);
        setIntField(term318675, term318675.getClass(), "varStart", 0);
        setField(term318675, term318675.getClass(), "compilerData", null);
        setIntField(term318675, term318675.getClass(), "type", 0);
        setField(term318675, term318675.getClass(), "next", null);
        setField(term318675, term318675.getClass(), "first", null);
        setField(term318675, term318675.getClass(), "last", null);
        setField(term318675, term318675.getClass(), "propListHead", null);
        setIntField(term318675, term318675.getClass(), "sourcePosition", 0);
        setField(term318675, term318675.getClass(), "jsType", null);
        setField(term318675, term318675.getClass(), "parent", null);
        term318676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318676, term318676.getClass(), "number", 0.0);
        setIntField(term318676, term318676.getClass(), "type", 0);
        setField(term318676, term318676.getClass(), "next", null);
        setField(term318676, term318676.getClass(), "first", null);
        setField(term318676, term318676.getClass(), "last", null);
        setField(term318676, term318676.getClass(), "propListHead", null);
        setIntField(term318676, term318676.getClass(), "sourcePosition", 0);
        setField(term318676, term318676.getClass(), "jsType", null);
        setField(term318676, term318676.getClass(), "parent", null);
        term318677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318677, term318677.getClass(), "number", 0.0);
        setIntField(term318677, term318677.getClass(), "type", 0);
        setField(term318677, term318677.getClass(), "next", null);
        setField(term318677, term318677.getClass(), "first", null);
        setField(term318677, term318677.getClass(), "last", null);
        setField(term318677, term318677.getClass(), "propListHead", null);
        setIntField(term318677, term318677.getClass(), "sourcePosition", 0);
        setField(term318677, term318677.getClass(), "jsType", null);
        setField(term318677, term318677.getClass(), "parent", null);
        term318626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318626, term318626.getClass(), "functionName", null);
        setBooleanField(term318626, term318626.getClass(), "itsNeedsActivation", false);
        setIntField(term318626, term318626.getClass(), "itsFunctionType", 0);
        setBooleanField(term318626, term318626.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318626, term318626.getClass(), "encodedSourceStart", 0);
        setIntField(term318626, term318626.getClass(), "encodedSourceEnd", 0);
        setField(term318626, term318626.getClass(), "sourceName", null);
        setIntField(term318626, term318626.getClass(), "baseLineno", 0);
        setIntField(term318626, term318626.getClass(), "endLineno", 0);
        setField(term318626, term318626.getClass(), "functions", null);
        setField(term318626, term318626.getClass(), "regexps", null);
        setField(term318626, term318626.getClass(), "itsVariables", null);
        setField(term318626, term318626.getClass(), "itsConst", null);
        setField(term318626, term318626.getClass(), "itsVariableNames", null);
        setIntField(term318626, term318626.getClass(), "varStart", 0);
        setField(term318626, term318626.getClass(), "compilerData", null);
        setIntField(term318626, term318626.getClass(), "type", 0);
        setField(term318626, term318626.getClass(), "next", null);
        setField(term318626, term318626.getClass(), "first", null);
        setField(term318626, term318626.getClass(), "last", null);
        setField(term318626, term318626.getClass(), "propListHead", null);
        setIntField(term318626, term318626.getClass(), "sourcePosition", 0);
        setField(term318626, term318626.getClass(), "jsType", null);
        setField(term318626, term318626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term318085;
        args[1] = term318177;
        args[2] = term318269;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term317999, args);
        assertTrue(recursiveEquals(term317999, term318674));
        assertTrue(recursiveEquals(term318085, term318675));
        assertTrue(recursiveEquals(term318177, term318676));
        assertTrue(recursiveEquals(term318269, term318677));
        assertTrue(recursiveEquals(retValue, term318626));
    }

};


