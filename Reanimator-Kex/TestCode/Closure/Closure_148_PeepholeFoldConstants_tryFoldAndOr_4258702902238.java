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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614416;
     Object term614545;
     Object term614588;
     Object term614589;
     Object term614590;
     Object term614552;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term614545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term614545, term614545.getClass(), "parent", null);
        setIntField(term614545, term614545.getClass(), "type", 64);
        term614588 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term614588, term614588.getClass(), "currentTraversal", null);
        term614589 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term614589, term614589.getClass(), "functionName", null);
        setBooleanField(term614589, term614589.getClass(), "itsNeedsActivation", false);
        setIntField(term614589, term614589.getClass(), "itsFunctionType", 0);
        setBooleanField(term614589, term614589.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term614589, term614589.getClass(), "encodedSourceStart", 0);
        setIntField(term614589, term614589.getClass(), "encodedSourceEnd", 0);
        setField(term614589, term614589.getClass(), "sourceName", null);
        setIntField(term614589, term614589.getClass(), "baseLineno", 0);
        setIntField(term614589, term614589.getClass(), "endLineno", 0);
        setField(term614589, term614589.getClass(), "functions", null);
        setField(term614589, term614589.getClass(), "regexps", null);
        setField(term614589, term614589.getClass(), "itsVariables", null);
        setField(term614589, term614589.getClass(), "itsConst", null);
        setField(term614589, term614589.getClass(), "itsVariableNames", null);
        setIntField(term614589, term614589.getClass(), "varStart", 0);
        setField(term614589, term614589.getClass(), "compilerData", null);
        setIntField(term614589, term614589.getClass(), "type", 64);
        setField(term614589, term614589.getClass(), "next", null);
        setField(term614589, term614589.getClass(), "first", null);
        setField(term614589, term614589.getClass(), "last", null);
        setField(term614589, term614589.getClass(), "propListHead", null);
        setIntField(term614589, term614589.getClass(), "sourcePosition", 0);
        setField(term614589, term614589.getClass(), "jsType", null);
        setField(term614589, term614589.getClass(), "parent", null);
        term614590 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term614590, term614590.getClass(), "functionName", null);
        setBooleanField(term614590, term614590.getClass(), "itsNeedsActivation", false);
        setIntField(term614590, term614590.getClass(), "itsFunctionType", 0);
        setBooleanField(term614590, term614590.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term614590, term614590.getClass(), "encodedSourceStart", 0);
        setIntField(term614590, term614590.getClass(), "encodedSourceEnd", 0);
        setField(term614590, term614590.getClass(), "sourceName", null);
        setIntField(term614590, term614590.getClass(), "baseLineno", 0);
        setIntField(term614590, term614590.getClass(), "endLineno", 0);
        setField(term614590, term614590.getClass(), "functions", null);
        setField(term614590, term614590.getClass(), "regexps", null);
        setField(term614590, term614590.getClass(), "itsVariables", null);
        setField(term614590, term614590.getClass(), "itsConst", null);
        setField(term614590, term614590.getClass(), "itsVariableNames", null);
        setIntField(term614590, term614590.getClass(), "varStart", 0);
        setField(term614590, term614590.getClass(), "compilerData", null);
        setIntField(term614590, term614590.getClass(), "type", 64);
        setField(term614590, term614590.getClass(), "next", null);
        setField(term614590, term614590.getClass(), "first", null);
        setField(term614590, term614590.getClass(), "last", null);
        setField(term614590, term614590.getClass(), "propListHead", null);
        setIntField(term614590, term614590.getClass(), "sourcePosition", 0);
        setField(term614590, term614590.getClass(), "jsType", null);
        setField(term614590, term614590.getClass(), "parent", null);
        term614552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term614552, term614552.getClass(), "functionName", null);
        setBooleanField(term614552, term614552.getClass(), "itsNeedsActivation", false);
        setIntField(term614552, term614552.getClass(), "itsFunctionType", 0);
        setBooleanField(term614552, term614552.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term614552, term614552.getClass(), "encodedSourceStart", 0);
        setIntField(term614552, term614552.getClass(), "encodedSourceEnd", 0);
        setField(term614552, term614552.getClass(), "sourceName", null);
        setIntField(term614552, term614552.getClass(), "baseLineno", 0);
        setIntField(term614552, term614552.getClass(), "endLineno", 0);
        setField(term614552, term614552.getClass(), "functions", null);
        setField(term614552, term614552.getClass(), "regexps", null);
        setField(term614552, term614552.getClass(), "itsVariables", null);
        setField(term614552, term614552.getClass(), "itsConst", null);
        setField(term614552, term614552.getClass(), "itsVariableNames", null);
        setIntField(term614552, term614552.getClass(), "varStart", 0);
        setField(term614552, term614552.getClass(), "compilerData", null);
        setIntField(term614552, term614552.getClass(), "type", 64);
        setField(term614552, term614552.getClass(), "next", null);
        setField(term614552, term614552.getClass(), "first", null);
        setField(term614552, term614552.getClass(), "last", null);
        setField(term614552, term614552.getClass(), "propListHead", null);
        setIntField(term614552, term614552.getClass(), "sourcePosition", 0);
        setField(term614552, term614552.getClass(), "jsType", null);
        setField(term614552, term614552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term614545;
        args[1] = term614545;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term614416, args);
        assertTrue(recursiveEquals(term614416, term614588));
        assertTrue(recursiveEquals(term614545, term614589));
        assertTrue(recursiveEquals(term614545, term614590));
        assertTrue(recursiveEquals(retValue, term614552));
    }

};


