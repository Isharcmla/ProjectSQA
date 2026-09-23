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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49649;
     Object term49735;
     Object term49821;
     Object term50266;
     Object term50267;
     Object term50268;
     Object term50235;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term49735, term49735.getClass(), "type", 52);
        term49821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term50266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50266, term50266.getClass(), "currentTraversal", null);
        term50267 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50267, term50267.getClass(), "functionName", null);
        setBooleanField(term50267, term50267.getClass(), "itsNeedsActivation", false);
        setIntField(term50267, term50267.getClass(), "itsFunctionType", 0);
        setBooleanField(term50267, term50267.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50267, term50267.getClass(), "encodedSourceStart", 0);
        setIntField(term50267, term50267.getClass(), "encodedSourceEnd", 0);
        setField(term50267, term50267.getClass(), "sourceName", null);
        setIntField(term50267, term50267.getClass(), "baseLineno", 0);
        setIntField(term50267, term50267.getClass(), "endLineno", 0);
        setField(term50267, term50267.getClass(), "functions", null);
        setField(term50267, term50267.getClass(), "regexps", null);
        setField(term50267, term50267.getClass(), "itsVariables", null);
        setField(term50267, term50267.getClass(), "itsConst", null);
        setField(term50267, term50267.getClass(), "itsVariableNames", null);
        setIntField(term50267, term50267.getClass(), "varStart", 0);
        setField(term50267, term50267.getClass(), "compilerData", null);
        setIntField(term50267, term50267.getClass(), "type", 52);
        setField(term50267, term50267.getClass(), "next", null);
        setField(term50267, term50267.getClass(), "first", null);
        setField(term50267, term50267.getClass(), "last", null);
        setField(term50267, term50267.getClass(), "propListHead", null);
        setIntField(term50267, term50267.getClass(), "sourcePosition", 0);
        setField(term50267, term50267.getClass(), "jsType", null);
        setField(term50267, term50267.getClass(), "parent", null);
        term50268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50268, term50268.getClass(), "functionName", null);
        setBooleanField(term50268, term50268.getClass(), "itsNeedsActivation", false);
        setIntField(term50268, term50268.getClass(), "itsFunctionType", 0);
        setBooleanField(term50268, term50268.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50268, term50268.getClass(), "encodedSourceStart", 0);
        setIntField(term50268, term50268.getClass(), "encodedSourceEnd", 0);
        setField(term50268, term50268.getClass(), "sourceName", null);
        setIntField(term50268, term50268.getClass(), "baseLineno", 0);
        setIntField(term50268, term50268.getClass(), "endLineno", 0);
        setField(term50268, term50268.getClass(), "functions", null);
        setField(term50268, term50268.getClass(), "regexps", null);
        setField(term50268, term50268.getClass(), "itsVariables", null);
        setField(term50268, term50268.getClass(), "itsConst", null);
        setField(term50268, term50268.getClass(), "itsVariableNames", null);
        setIntField(term50268, term50268.getClass(), "varStart", 0);
        setField(term50268, term50268.getClass(), "compilerData", null);
        setIntField(term50268, term50268.getClass(), "type", 0);
        setField(term50268, term50268.getClass(), "next", null);
        setField(term50268, term50268.getClass(), "first", null);
        setField(term50268, term50268.getClass(), "last", null);
        setField(term50268, term50268.getClass(), "propListHead", null);
        setIntField(term50268, term50268.getClass(), "sourcePosition", 0);
        setField(term50268, term50268.getClass(), "jsType", null);
        setField(term50268, term50268.getClass(), "parent", null);
        term50235 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50235, term50235.getClass(), "functionName", null);
        setBooleanField(term50235, term50235.getClass(), "itsNeedsActivation", false);
        setIntField(term50235, term50235.getClass(), "itsFunctionType", 0);
        setBooleanField(term50235, term50235.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50235, term50235.getClass(), "encodedSourceStart", 0);
        setIntField(term50235, term50235.getClass(), "encodedSourceEnd", 0);
        setField(term50235, term50235.getClass(), "sourceName", null);
        setIntField(term50235, term50235.getClass(), "baseLineno", 0);
        setIntField(term50235, term50235.getClass(), "endLineno", 0);
        setField(term50235, term50235.getClass(), "functions", null);
        setField(term50235, term50235.getClass(), "regexps", null);
        setField(term50235, term50235.getClass(), "itsVariables", null);
        setField(term50235, term50235.getClass(), "itsConst", null);
        setField(term50235, term50235.getClass(), "itsVariableNames", null);
        setIntField(term50235, term50235.getClass(), "varStart", 0);
        setField(term50235, term50235.getClass(), "compilerData", null);
        setIntField(term50235, term50235.getClass(), "type", 52);
        setField(term50235, term50235.getClass(), "next", null);
        setField(term50235, term50235.getClass(), "first", null);
        setField(term50235, term50235.getClass(), "last", null);
        setField(term50235, term50235.getClass(), "propListHead", null);
        setIntField(term50235, term50235.getClass(), "sourcePosition", 0);
        setField(term50235, term50235.getClass(), "jsType", null);
        setField(term50235, term50235.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term49735;
        args[1] = term49821;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term49649, args);
        assertTrue(recursiveEquals(term49649, term50266));
        assertTrue(recursiveEquals(term49735, term50267));
        assertTrue(recursiveEquals(term49821, term50268));
        assertTrue(recursiveEquals(retValue, term50235));
    }

};


