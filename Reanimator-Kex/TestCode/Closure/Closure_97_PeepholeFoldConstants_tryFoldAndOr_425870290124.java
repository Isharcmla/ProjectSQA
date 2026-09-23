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

public class PeepholeFoldConstants_tryFoldAndOr_425870290124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23984;
     Object term24070;
     Object term24156;
     Object term24248;
     Object term24575;
     Object term24576;
     Object term24577;
     Object term24578;
     Object term24521;

    public PeepholeFoldConstants_tryFoldAndOr_425870290124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24070, term24070.getClass(), "parent", null);
        setIntField(term24070, term24070.getClass(), "type", 0);
        term24156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term24156, term24156.getClass(), "type", 0);
        term24248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term24575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24575, term24575.getClass(), "currentTraversal", null);
        term24576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24576, term24576.getClass(), "functionName", null);
        setBooleanField(term24576, term24576.getClass(), "itsNeedsActivation", false);
        setIntField(term24576, term24576.getClass(), "itsFunctionType", 0);
        setBooleanField(term24576, term24576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term24576, term24576.getClass(), "encodedSourceStart", 0);
        setIntField(term24576, term24576.getClass(), "encodedSourceEnd", 0);
        setField(term24576, term24576.getClass(), "sourceName", null);
        setIntField(term24576, term24576.getClass(), "baseLineno", 0);
        setIntField(term24576, term24576.getClass(), "endLineno", 0);
        setField(term24576, term24576.getClass(), "functions", null);
        setField(term24576, term24576.getClass(), "regexps", null);
        setField(term24576, term24576.getClass(), "itsVariables", null);
        setField(term24576, term24576.getClass(), "itsConst", null);
        setField(term24576, term24576.getClass(), "itsVariableNames", null);
        setIntField(term24576, term24576.getClass(), "varStart", 0);
        setField(term24576, term24576.getClass(), "compilerData", null);
        setIntField(term24576, term24576.getClass(), "type", 0);
        setField(term24576, term24576.getClass(), "next", null);
        setField(term24576, term24576.getClass(), "first", null);
        setField(term24576, term24576.getClass(), "last", null);
        setField(term24576, term24576.getClass(), "propListHead", null);
        setIntField(term24576, term24576.getClass(), "sourcePosition", 0);
        setField(term24576, term24576.getClass(), "jsType", null);
        setField(term24576, term24576.getClass(), "parent", null);
        term24577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24577, term24577.getClass(), "functionName", null);
        setBooleanField(term24577, term24577.getClass(), "itsNeedsActivation", false);
        setIntField(term24577, term24577.getClass(), "itsFunctionType", 0);
        setBooleanField(term24577, term24577.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term24577, term24577.getClass(), "encodedSourceStart", 0);
        setIntField(term24577, term24577.getClass(), "encodedSourceEnd", 0);
        setField(term24577, term24577.getClass(), "sourceName", null);
        setIntField(term24577, term24577.getClass(), "baseLineno", 0);
        setIntField(term24577, term24577.getClass(), "endLineno", 0);
        setField(term24577, term24577.getClass(), "functions", null);
        setField(term24577, term24577.getClass(), "regexps", null);
        setField(term24577, term24577.getClass(), "itsVariables", null);
        setField(term24577, term24577.getClass(), "itsConst", null);
        setField(term24577, term24577.getClass(), "itsVariableNames", null);
        setIntField(term24577, term24577.getClass(), "varStart", 0);
        setField(term24577, term24577.getClass(), "compilerData", null);
        setIntField(term24577, term24577.getClass(), "type", 0);
        setField(term24577, term24577.getClass(), "next", null);
        setField(term24577, term24577.getClass(), "first", null);
        setField(term24577, term24577.getClass(), "last", null);
        setField(term24577, term24577.getClass(), "propListHead", null);
        setIntField(term24577, term24577.getClass(), "sourcePosition", 0);
        setField(term24577, term24577.getClass(), "jsType", null);
        setField(term24577, term24577.getClass(), "parent", null);
        term24578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term24578, term24578.getClass(), "str", null);
        setIntField(term24578, term24578.getClass(), "type", 0);
        setField(term24578, term24578.getClass(), "next", null);
        setField(term24578, term24578.getClass(), "first", null);
        setField(term24578, term24578.getClass(), "last", null);
        setField(term24578, term24578.getClass(), "propListHead", null);
        setIntField(term24578, term24578.getClass(), "sourcePosition", 0);
        setField(term24578, term24578.getClass(), "jsType", null);
        setField(term24578, term24578.getClass(), "parent", null);
        term24521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24521, term24521.getClass(), "functionName", null);
        setBooleanField(term24521, term24521.getClass(), "itsNeedsActivation", false);
        setIntField(term24521, term24521.getClass(), "itsFunctionType", 0);
        setBooleanField(term24521, term24521.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term24521, term24521.getClass(), "encodedSourceStart", 0);
        setIntField(term24521, term24521.getClass(), "encodedSourceEnd", 0);
        setField(term24521, term24521.getClass(), "sourceName", null);
        setIntField(term24521, term24521.getClass(), "baseLineno", 0);
        setIntField(term24521, term24521.getClass(), "endLineno", 0);
        setField(term24521, term24521.getClass(), "functions", null);
        setField(term24521, term24521.getClass(), "regexps", null);
        setField(term24521, term24521.getClass(), "itsVariables", null);
        setField(term24521, term24521.getClass(), "itsConst", null);
        setField(term24521, term24521.getClass(), "itsVariableNames", null);
        setIntField(term24521, term24521.getClass(), "varStart", 0);
        setField(term24521, term24521.getClass(), "compilerData", null);
        setIntField(term24521, term24521.getClass(), "type", 0);
        setField(term24521, term24521.getClass(), "next", null);
        setField(term24521, term24521.getClass(), "first", null);
        setField(term24521, term24521.getClass(), "last", null);
        setField(term24521, term24521.getClass(), "propListHead", null);
        setIntField(term24521, term24521.getClass(), "sourcePosition", 0);
        setField(term24521, term24521.getClass(), "jsType", null);
        setField(term24521, term24521.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term24070;
        args[1] = term24156;
        args[2] = term24248;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term23984, args);
        assertTrue(recursiveEquals(term23984, term24575));
        assertTrue(recursiveEquals(term24070, term24576));
        assertTrue(recursiveEquals(term24156, term24577));
        assertTrue(recursiveEquals(term24248, term24578));
        assertTrue(recursiveEquals(retValue, term24521));
    }

};


