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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906055;
     Object term906141;
     Object term906325;
     Object term906417;
     Object term906683;
     Object term906684;
     Object term906686;
     Object term906687;
     Object term906625;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906055 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term906141 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term906233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term906141, term906141.getClass(), "parent", term906233);
        setIntField(term906141, term906141.getClass(), "type", 0);
        term906325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term906325, term906325.getClass(), "type", 0);
        term906417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term906417, term906417.getClass(), "type", 63);
        term906683 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term906683, term906683.getClass(), "currentTraversal", null);
        term906684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term906685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term906684, term906684.getClass(), "functionName", null);
        setBooleanField(term906684, term906684.getClass(), "itsNeedsActivation", false);
        setIntField(term906684, term906684.getClass(), "itsFunctionType", 0);
        setBooleanField(term906684, term906684.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term906684, term906684.getClass(), "encodedSourceStart", 0);
        setIntField(term906684, term906684.getClass(), "encodedSourceEnd", 0);
        setField(term906684, term906684.getClass(), "sourceName", null);
        setIntField(term906684, term906684.getClass(), "baseLineno", 0);
        setIntField(term906684, term906684.getClass(), "endLineno", 0);
        setField(term906684, term906684.getClass(), "functions", null);
        setField(term906684, term906684.getClass(), "regexps", null);
        setField(term906684, term906684.getClass(), "itsVariables", null);
        setField(term906684, term906684.getClass(), "itsConst", null);
        setField(term906684, term906684.getClass(), "itsVariableNames", null);
        setIntField(term906684, term906684.getClass(), "varStart", 0);
        setField(term906684, term906684.getClass(), "compilerData", null);
        setIntField(term906684, term906684.getClass(), "type", 0);
        setField(term906684, term906684.getClass(), "next", null);
        setField(term906684, term906684.getClass(), "first", null);
        setField(term906684, term906684.getClass(), "last", null);
        setField(term906684, term906684.getClass(), "propListHead", null);
        setIntField(term906684, term906684.getClass(), "sourcePosition", 0);
        setField(term906684, term906684.getClass(), "jsType", null);
        setDoubleField(term906685, term906685.getClass(), "number", 0.0);
        setIntField(term906685, term906685.getClass(), "type", 0);
        setField(term906685, term906685.getClass(), "next", null);
        setField(term906685, term906685.getClass(), "first", null);
        setField(term906685, term906685.getClass(), "last", null);
        setField(term906685, term906685.getClass(), "propListHead", null);
        setIntField(term906685, term906685.getClass(), "sourcePosition", 0);
        setField(term906685, term906685.getClass(), "jsType", null);
        setField(term906685, term906685.getClass(), "parent", null);
        setField(term906684, term906684.getClass(), "parent", term906685);
        term906686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term906686, term906686.getClass(), "number", 0.0);
        setIntField(term906686, term906686.getClass(), "type", 0);
        setField(term906686, term906686.getClass(), "next", null);
        setField(term906686, term906686.getClass(), "first", null);
        setField(term906686, term906686.getClass(), "last", null);
        setField(term906686, term906686.getClass(), "propListHead", null);
        setIntField(term906686, term906686.getClass(), "sourcePosition", 0);
        setField(term906686, term906686.getClass(), "jsType", null);
        setField(term906686, term906686.getClass(), "parent", null);
        term906687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term906687, term906687.getClass(), "str", null);
        setIntField(term906687, term906687.getClass(), "type", 63);
        setField(term906687, term906687.getClass(), "next", null);
        setField(term906687, term906687.getClass(), "first", null);
        setField(term906687, term906687.getClass(), "last", null);
        setField(term906687, term906687.getClass(), "propListHead", null);
        setIntField(term906687, term906687.getClass(), "sourcePosition", 0);
        setField(term906687, term906687.getClass(), "jsType", null);
        setField(term906687, term906687.getClass(), "parent", null);
        term906625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term906636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term906625, term906625.getClass(), "functionName", null);
        setBooleanField(term906625, term906625.getClass(), "itsNeedsActivation", false);
        setIntField(term906625, term906625.getClass(), "itsFunctionType", 0);
        setBooleanField(term906625, term906625.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term906625, term906625.getClass(), "encodedSourceStart", 0);
        setIntField(term906625, term906625.getClass(), "encodedSourceEnd", 0);
        setField(term906625, term906625.getClass(), "sourceName", null);
        setIntField(term906625, term906625.getClass(), "baseLineno", 0);
        setIntField(term906625, term906625.getClass(), "endLineno", 0);
        setField(term906625, term906625.getClass(), "functions", null);
        setField(term906625, term906625.getClass(), "regexps", null);
        setField(term906625, term906625.getClass(), "itsVariables", null);
        setField(term906625, term906625.getClass(), "itsConst", null);
        setField(term906625, term906625.getClass(), "itsVariableNames", null);
        setIntField(term906625, term906625.getClass(), "varStart", 0);
        setField(term906625, term906625.getClass(), "compilerData", null);
        setIntField(term906625, term906625.getClass(), "type", 0);
        setField(term906625, term906625.getClass(), "next", null);
        setField(term906625, term906625.getClass(), "first", null);
        setField(term906625, term906625.getClass(), "last", null);
        setField(term906625, term906625.getClass(), "propListHead", null);
        setIntField(term906625, term906625.getClass(), "sourcePosition", 0);
        setField(term906625, term906625.getClass(), "jsType", null);
        setDoubleField(term906636, term906636.getClass(), "number", 0.0);
        setIntField(term906636, term906636.getClass(), "type", 0);
        setField(term906636, term906636.getClass(), "next", null);
        setField(term906636, term906636.getClass(), "first", null);
        setField(term906636, term906636.getClass(), "last", null);
        setField(term906636, term906636.getClass(), "propListHead", null);
        setIntField(term906636, term906636.getClass(), "sourcePosition", 0);
        setField(term906636, term906636.getClass(), "jsType", null);
        setField(term906636, term906636.getClass(), "parent", null);
        setField(term906625, term906625.getClass(), "parent", term906636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term906141;
        args[1] = term906325;
        args[2] = term906417;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term906055, args);
        assertTrue(recursiveEquals(term906055, term906683));
        assertTrue(recursiveEquals(term906141, term906684));
        assertTrue(recursiveEquals(term906325, term906686));
        assertTrue(recursiveEquals(term906417, term906687));
        assertTrue(recursiveEquals(retValue, term906625));
    }

};


