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

public class PeepholeFoldConstants_tryFoldComparison_8484431791450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358412;
     Object term358498;
     Object term358584;
     Object term358670;
     Object term359573;
     Object term359574;
     Object term359575;
     Object term359576;
     Object term359537;

    public PeepholeFoldConstants_tryFoldComparison_8484431791450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term358498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term358498, term358498.getClass(), "type", 14);
        term358584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term358584, term358584.getClass(), "type", 14);
        term358670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term359573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term359573, term359573.getClass(), "currentTraversal", null);
        term359574 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359574, term359574.getClass(), "functionName", null);
        setBooleanField(term359574, term359574.getClass(), "itsNeedsActivation", false);
        setIntField(term359574, term359574.getClass(), "itsFunctionType", 0);
        setBooleanField(term359574, term359574.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359574, term359574.getClass(), "encodedSourceStart", 0);
        setIntField(term359574, term359574.getClass(), "encodedSourceEnd", 0);
        setField(term359574, term359574.getClass(), "sourceName", null);
        setIntField(term359574, term359574.getClass(), "baseLineno", 0);
        setIntField(term359574, term359574.getClass(), "endLineno", 0);
        setField(term359574, term359574.getClass(), "functions", null);
        setField(term359574, term359574.getClass(), "regexps", null);
        setField(term359574, term359574.getClass(), "itsVariables", null);
        setField(term359574, term359574.getClass(), "itsConst", null);
        setField(term359574, term359574.getClass(), "itsVariableNames", null);
        setIntField(term359574, term359574.getClass(), "varStart", 0);
        setField(term359574, term359574.getClass(), "compilerData", null);
        setIntField(term359574, term359574.getClass(), "type", 14);
        setField(term359574, term359574.getClass(), "next", null);
        setField(term359574, term359574.getClass(), "first", null);
        setField(term359574, term359574.getClass(), "last", null);
        setField(term359574, term359574.getClass(), "propListHead", null);
        setIntField(term359574, term359574.getClass(), "sourcePosition", 0);
        setField(term359574, term359574.getClass(), "jsType", null);
        setField(term359574, term359574.getClass(), "parent", null);
        term359575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359575, term359575.getClass(), "functionName", null);
        setBooleanField(term359575, term359575.getClass(), "itsNeedsActivation", false);
        setIntField(term359575, term359575.getClass(), "itsFunctionType", 0);
        setBooleanField(term359575, term359575.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359575, term359575.getClass(), "encodedSourceStart", 0);
        setIntField(term359575, term359575.getClass(), "encodedSourceEnd", 0);
        setField(term359575, term359575.getClass(), "sourceName", null);
        setIntField(term359575, term359575.getClass(), "baseLineno", 0);
        setIntField(term359575, term359575.getClass(), "endLineno", 0);
        setField(term359575, term359575.getClass(), "functions", null);
        setField(term359575, term359575.getClass(), "regexps", null);
        setField(term359575, term359575.getClass(), "itsVariables", null);
        setField(term359575, term359575.getClass(), "itsConst", null);
        setField(term359575, term359575.getClass(), "itsVariableNames", null);
        setIntField(term359575, term359575.getClass(), "varStart", 0);
        setField(term359575, term359575.getClass(), "compilerData", null);
        setIntField(term359575, term359575.getClass(), "type", 14);
        setField(term359575, term359575.getClass(), "next", null);
        setField(term359575, term359575.getClass(), "first", null);
        setField(term359575, term359575.getClass(), "last", null);
        setField(term359575, term359575.getClass(), "propListHead", null);
        setIntField(term359575, term359575.getClass(), "sourcePosition", 0);
        setField(term359575, term359575.getClass(), "jsType", null);
        setField(term359575, term359575.getClass(), "parent", null);
        term359576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359576, term359576.getClass(), "functionName", null);
        setBooleanField(term359576, term359576.getClass(), "itsNeedsActivation", false);
        setIntField(term359576, term359576.getClass(), "itsFunctionType", 0);
        setBooleanField(term359576, term359576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359576, term359576.getClass(), "encodedSourceStart", 0);
        setIntField(term359576, term359576.getClass(), "encodedSourceEnd", 0);
        setField(term359576, term359576.getClass(), "sourceName", null);
        setIntField(term359576, term359576.getClass(), "baseLineno", 0);
        setIntField(term359576, term359576.getClass(), "endLineno", 0);
        setField(term359576, term359576.getClass(), "functions", null);
        setField(term359576, term359576.getClass(), "regexps", null);
        setField(term359576, term359576.getClass(), "itsVariables", null);
        setField(term359576, term359576.getClass(), "itsConst", null);
        setField(term359576, term359576.getClass(), "itsVariableNames", null);
        setIntField(term359576, term359576.getClass(), "varStart", 0);
        setField(term359576, term359576.getClass(), "compilerData", null);
        setIntField(term359576, term359576.getClass(), "type", 0);
        setField(term359576, term359576.getClass(), "next", null);
        setField(term359576, term359576.getClass(), "first", null);
        setField(term359576, term359576.getClass(), "last", null);
        setField(term359576, term359576.getClass(), "propListHead", null);
        setIntField(term359576, term359576.getClass(), "sourcePosition", 0);
        setField(term359576, term359576.getClass(), "jsType", null);
        setField(term359576, term359576.getClass(), "parent", null);
        term359537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359537, term359537.getClass(), "functionName", null);
        setBooleanField(term359537, term359537.getClass(), "itsNeedsActivation", false);
        setIntField(term359537, term359537.getClass(), "itsFunctionType", 0);
        setBooleanField(term359537, term359537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359537, term359537.getClass(), "encodedSourceStart", 0);
        setIntField(term359537, term359537.getClass(), "encodedSourceEnd", 0);
        setField(term359537, term359537.getClass(), "sourceName", null);
        setIntField(term359537, term359537.getClass(), "baseLineno", 0);
        setIntField(term359537, term359537.getClass(), "endLineno", 0);
        setField(term359537, term359537.getClass(), "functions", null);
        setField(term359537, term359537.getClass(), "regexps", null);
        setField(term359537, term359537.getClass(), "itsVariables", null);
        setField(term359537, term359537.getClass(), "itsConst", null);
        setField(term359537, term359537.getClass(), "itsVariableNames", null);
        setIntField(term359537, term359537.getClass(), "varStart", 0);
        setField(term359537, term359537.getClass(), "compilerData", null);
        setIntField(term359537, term359537.getClass(), "type", 14);
        setField(term359537, term359537.getClass(), "next", null);
        setField(term359537, term359537.getClass(), "first", null);
        setField(term359537, term359537.getClass(), "last", null);
        setField(term359537, term359537.getClass(), "propListHead", null);
        setIntField(term359537, term359537.getClass(), "sourcePosition", 0);
        setField(term359537, term359537.getClass(), "jsType", null);
        setField(term359537, term359537.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term358498;
        args[1] = term358584;
        args[2] = term358670;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term358412, args);
        assertTrue(recursiveEquals(term358412, term359573));
        assertTrue(recursiveEquals(term358498, term359574));
        assertTrue(recursiveEquals(term358584, term359575));
        assertTrue(recursiveEquals(term358670, term359576));
        assertTrue(recursiveEquals(retValue, term359537));
    }

};


