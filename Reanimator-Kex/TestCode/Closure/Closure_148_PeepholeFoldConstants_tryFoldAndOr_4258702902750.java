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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791104;
     Object term791190;
     Object term791368;
     Object term791460;
     Object term791780;
     Object term791781;
     Object term791783;
     Object term791784;
     Object term791685;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term791190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791276 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term791276, term791276.getClass(), "type", 114);
        setField(term791190, term791190.getClass(), "parent", term791276);
        setIntField(term791190, term791190.getClass(), "type", 0);
        term791368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term791368, term791368.getClass(), "type", 67);
        term791460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term791460, term791460.getClass(), "type", 63);
        term791780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term791780, term791780.getClass(), "currentTraversal", null);
        term791781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term791781, term791781.getClass(), "functionName", null);
        setBooleanField(term791781, term791781.getClass(), "itsNeedsActivation", false);
        setIntField(term791781, term791781.getClass(), "itsFunctionType", 0);
        setBooleanField(term791781, term791781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791781, term791781.getClass(), "encodedSourceStart", 0);
        setIntField(term791781, term791781.getClass(), "encodedSourceEnd", 0);
        setField(term791781, term791781.getClass(), "sourceName", null);
        setIntField(term791781, term791781.getClass(), "baseLineno", 0);
        setIntField(term791781, term791781.getClass(), "endLineno", 0);
        setField(term791781, term791781.getClass(), "functions", null);
        setField(term791781, term791781.getClass(), "regexps", null);
        setField(term791781, term791781.getClass(), "itsVariables", null);
        setField(term791781, term791781.getClass(), "itsConst", null);
        setField(term791781, term791781.getClass(), "itsVariableNames", null);
        setIntField(term791781, term791781.getClass(), "varStart", 0);
        setField(term791781, term791781.getClass(), "compilerData", null);
        setIntField(term791781, term791781.getClass(), "type", 0);
        setField(term791781, term791781.getClass(), "next", null);
        setField(term791781, term791781.getClass(), "first", null);
        setField(term791781, term791781.getClass(), "last", null);
        setField(term791781, term791781.getClass(), "propListHead", null);
        setIntField(term791781, term791781.getClass(), "sourcePosition", 0);
        setField(term791781, term791781.getClass(), "jsType", null);
        setField(term791782, term791782.getClass(), "functionName", null);
        setBooleanField(term791782, term791782.getClass(), "itsNeedsActivation", false);
        setIntField(term791782, term791782.getClass(), "itsFunctionType", 0);
        setBooleanField(term791782, term791782.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791782, term791782.getClass(), "encodedSourceStart", 0);
        setIntField(term791782, term791782.getClass(), "encodedSourceEnd", 0);
        setField(term791782, term791782.getClass(), "sourceName", null);
        setIntField(term791782, term791782.getClass(), "baseLineno", 0);
        setIntField(term791782, term791782.getClass(), "endLineno", 0);
        setField(term791782, term791782.getClass(), "functions", null);
        setField(term791782, term791782.getClass(), "regexps", null);
        setField(term791782, term791782.getClass(), "itsVariables", null);
        setField(term791782, term791782.getClass(), "itsConst", null);
        setField(term791782, term791782.getClass(), "itsVariableNames", null);
        setIntField(term791782, term791782.getClass(), "varStart", 0);
        setField(term791782, term791782.getClass(), "compilerData", null);
        setIntField(term791782, term791782.getClass(), "type", 114);
        setField(term791782, term791782.getClass(), "next", null);
        setField(term791782, term791782.getClass(), "first", null);
        setField(term791782, term791782.getClass(), "last", null);
        setField(term791782, term791782.getClass(), "propListHead", null);
        setIntField(term791782, term791782.getClass(), "sourcePosition", 0);
        setField(term791782, term791782.getClass(), "jsType", null);
        setField(term791782, term791782.getClass(), "parent", null);
        setField(term791781, term791781.getClass(), "parent", term791782);
        term791783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term791783, term791783.getClass(), "number", 0.0);
        setIntField(term791783, term791783.getClass(), "type", 67);
        setField(term791783, term791783.getClass(), "next", null);
        setField(term791783, term791783.getClass(), "first", null);
        setField(term791783, term791783.getClass(), "last", null);
        setField(term791783, term791783.getClass(), "propListHead", null);
        setIntField(term791783, term791783.getClass(), "sourcePosition", 0);
        setField(term791783, term791783.getClass(), "jsType", null);
        setField(term791783, term791783.getClass(), "parent", null);
        term791784 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term791784, term791784.getClass(), "number", 0.0);
        setIntField(term791784, term791784.getClass(), "type", 63);
        setField(term791784, term791784.getClass(), "next", null);
        setField(term791784, term791784.getClass(), "first", null);
        setField(term791784, term791784.getClass(), "last", null);
        setField(term791784, term791784.getClass(), "propListHead", null);
        setIntField(term791784, term791784.getClass(), "sourcePosition", 0);
        setField(term791784, term791784.getClass(), "jsType", null);
        setField(term791784, term791784.getClass(), "parent", null);
        term791685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term791685, term791685.getClass(), "functionName", null);
        setBooleanField(term791685, term791685.getClass(), "itsNeedsActivation", false);
        setIntField(term791685, term791685.getClass(), "itsFunctionType", 0);
        setBooleanField(term791685, term791685.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791685, term791685.getClass(), "encodedSourceStart", 0);
        setIntField(term791685, term791685.getClass(), "encodedSourceEnd", 0);
        setField(term791685, term791685.getClass(), "sourceName", null);
        setIntField(term791685, term791685.getClass(), "baseLineno", 0);
        setIntField(term791685, term791685.getClass(), "endLineno", 0);
        setField(term791685, term791685.getClass(), "functions", null);
        setField(term791685, term791685.getClass(), "regexps", null);
        setField(term791685, term791685.getClass(), "itsVariables", null);
        setField(term791685, term791685.getClass(), "itsConst", null);
        setField(term791685, term791685.getClass(), "itsVariableNames", null);
        setIntField(term791685, term791685.getClass(), "varStart", 0);
        setField(term791685, term791685.getClass(), "compilerData", null);
        setIntField(term791685, term791685.getClass(), "type", 0);
        setField(term791685, term791685.getClass(), "next", null);
        setField(term791685, term791685.getClass(), "first", null);
        setField(term791685, term791685.getClass(), "last", null);
        setField(term791685, term791685.getClass(), "propListHead", null);
        setIntField(term791685, term791685.getClass(), "sourcePosition", 0);
        setField(term791685, term791685.getClass(), "jsType", null);
        setField(term791696, term791696.getClass(), "functionName", null);
        setBooleanField(term791696, term791696.getClass(), "itsNeedsActivation", false);
        setIntField(term791696, term791696.getClass(), "itsFunctionType", 0);
        setBooleanField(term791696, term791696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791696, term791696.getClass(), "encodedSourceStart", 0);
        setIntField(term791696, term791696.getClass(), "encodedSourceEnd", 0);
        setField(term791696, term791696.getClass(), "sourceName", null);
        setIntField(term791696, term791696.getClass(), "baseLineno", 0);
        setIntField(term791696, term791696.getClass(), "endLineno", 0);
        setField(term791696, term791696.getClass(), "functions", null);
        setField(term791696, term791696.getClass(), "regexps", null);
        setField(term791696, term791696.getClass(), "itsVariables", null);
        setField(term791696, term791696.getClass(), "itsConst", null);
        setField(term791696, term791696.getClass(), "itsVariableNames", null);
        setIntField(term791696, term791696.getClass(), "varStart", 0);
        setField(term791696, term791696.getClass(), "compilerData", null);
        setIntField(term791696, term791696.getClass(), "type", 114);
        setField(term791696, term791696.getClass(), "next", null);
        setField(term791696, term791696.getClass(), "first", null);
        setField(term791696, term791696.getClass(), "last", null);
        setField(term791696, term791696.getClass(), "propListHead", null);
        setIntField(term791696, term791696.getClass(), "sourcePosition", 0);
        setField(term791696, term791696.getClass(), "jsType", null);
        setField(term791696, term791696.getClass(), "parent", null);
        setField(term791685, term791685.getClass(), "parent", term791696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term791190;
        args[1] = term791368;
        args[2] = term791460;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term791104, args);
        assertTrue(recursiveEquals(term791104, term791780));
        assertTrue(recursiveEquals(term791190, term791781));
        assertTrue(recursiveEquals(term791368, term791783));
        assertTrue(recursiveEquals(term791460, term791784));
        assertTrue(recursiveEquals(retValue, term791685));
    }

};


