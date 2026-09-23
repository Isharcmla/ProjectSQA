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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58436;
     Object term58522;
     Object term58608;
     Object term58641;
     Object term58642;
     Object term58643;
     Object term58610;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term58522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term58522, term58522.getClass(), "type", 52);
        term58608 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term58641 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term58641, term58641.getClass(), "currentTraversal", null);
        term58642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58642, term58642.getClass(), "functionName", null);
        setBooleanField(term58642, term58642.getClass(), "itsNeedsActivation", false);
        setIntField(term58642, term58642.getClass(), "itsFunctionType", 0);
        setBooleanField(term58642, term58642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58642, term58642.getClass(), "encodedSourceStart", 0);
        setIntField(term58642, term58642.getClass(), "encodedSourceEnd", 0);
        setField(term58642, term58642.getClass(), "sourceName", null);
        setIntField(term58642, term58642.getClass(), "baseLineno", 0);
        setIntField(term58642, term58642.getClass(), "endLineno", 0);
        setField(term58642, term58642.getClass(), "functions", null);
        setField(term58642, term58642.getClass(), "regexps", null);
        setField(term58642, term58642.getClass(), "itsVariables", null);
        setField(term58642, term58642.getClass(), "itsConst", null);
        setField(term58642, term58642.getClass(), "itsVariableNames", null);
        setIntField(term58642, term58642.getClass(), "varStart", 0);
        setField(term58642, term58642.getClass(), "compilerData", null);
        setIntField(term58642, term58642.getClass(), "type", 52);
        setField(term58642, term58642.getClass(), "next", null);
        setField(term58642, term58642.getClass(), "first", null);
        setField(term58642, term58642.getClass(), "last", null);
        setField(term58642, term58642.getClass(), "propListHead", null);
        setIntField(term58642, term58642.getClass(), "sourcePosition", 0);
        setField(term58642, term58642.getClass(), "jsType", null);
        setField(term58642, term58642.getClass(), "parent", null);
        term58643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58643, term58643.getClass(), "functionName", null);
        setBooleanField(term58643, term58643.getClass(), "itsNeedsActivation", false);
        setIntField(term58643, term58643.getClass(), "itsFunctionType", 0);
        setBooleanField(term58643, term58643.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58643, term58643.getClass(), "encodedSourceStart", 0);
        setIntField(term58643, term58643.getClass(), "encodedSourceEnd", 0);
        setField(term58643, term58643.getClass(), "sourceName", null);
        setIntField(term58643, term58643.getClass(), "baseLineno", 0);
        setIntField(term58643, term58643.getClass(), "endLineno", 0);
        setField(term58643, term58643.getClass(), "functions", null);
        setField(term58643, term58643.getClass(), "regexps", null);
        setField(term58643, term58643.getClass(), "itsVariables", null);
        setField(term58643, term58643.getClass(), "itsConst", null);
        setField(term58643, term58643.getClass(), "itsVariableNames", null);
        setIntField(term58643, term58643.getClass(), "varStart", 0);
        setField(term58643, term58643.getClass(), "compilerData", null);
        setIntField(term58643, term58643.getClass(), "type", 0);
        setField(term58643, term58643.getClass(), "next", null);
        setField(term58643, term58643.getClass(), "first", null);
        setField(term58643, term58643.getClass(), "last", null);
        setField(term58643, term58643.getClass(), "propListHead", null);
        setIntField(term58643, term58643.getClass(), "sourcePosition", 0);
        setField(term58643, term58643.getClass(), "jsType", null);
        setField(term58643, term58643.getClass(), "parent", null);
        term58610 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58610, term58610.getClass(), "functionName", null);
        setBooleanField(term58610, term58610.getClass(), "itsNeedsActivation", false);
        setIntField(term58610, term58610.getClass(), "itsFunctionType", 0);
        setBooleanField(term58610, term58610.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58610, term58610.getClass(), "encodedSourceStart", 0);
        setIntField(term58610, term58610.getClass(), "encodedSourceEnd", 0);
        setField(term58610, term58610.getClass(), "sourceName", null);
        setIntField(term58610, term58610.getClass(), "baseLineno", 0);
        setIntField(term58610, term58610.getClass(), "endLineno", 0);
        setField(term58610, term58610.getClass(), "functions", null);
        setField(term58610, term58610.getClass(), "regexps", null);
        setField(term58610, term58610.getClass(), "itsVariables", null);
        setField(term58610, term58610.getClass(), "itsConst", null);
        setField(term58610, term58610.getClass(), "itsVariableNames", null);
        setIntField(term58610, term58610.getClass(), "varStart", 0);
        setField(term58610, term58610.getClass(), "compilerData", null);
        setIntField(term58610, term58610.getClass(), "type", 52);
        setField(term58610, term58610.getClass(), "next", null);
        setField(term58610, term58610.getClass(), "first", null);
        setField(term58610, term58610.getClass(), "last", null);
        setField(term58610, term58610.getClass(), "propListHead", null);
        setIntField(term58610, term58610.getClass(), "sourcePosition", 0);
        setField(term58610, term58610.getClass(), "jsType", null);
        setField(term58610, term58610.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term58522;
        args[1] = term58608;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term58436, args);
        assertTrue(recursiveEquals(term58436, term58641));
        assertTrue(recursiveEquals(term58522, term58642));
        assertTrue(recursiveEquals(term58608, term58643));
        assertTrue(recursiveEquals(retValue, term58610));
    }

};


