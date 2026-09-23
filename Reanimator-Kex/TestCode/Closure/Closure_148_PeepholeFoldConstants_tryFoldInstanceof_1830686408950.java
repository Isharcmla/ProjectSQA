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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221876;
     Object term221968;
     Object term222054;
     Object term222215;
     Object term222216;
     Object term222217;
     Object term222191;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term221968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221968, term221968.getClass(), "type", 52);
        term222054 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term222215 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term222215, term222215.getClass(), "currentTraversal", null);
        term222216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term222216, term222216.getClass(), "number", 0.0);
        setIntField(term222216, term222216.getClass(), "type", 52);
        setField(term222216, term222216.getClass(), "next", null);
        setField(term222216, term222216.getClass(), "first", null);
        setField(term222216, term222216.getClass(), "last", null);
        setField(term222216, term222216.getClass(), "propListHead", null);
        setIntField(term222216, term222216.getClass(), "sourcePosition", 0);
        setField(term222216, term222216.getClass(), "jsType", null);
        setField(term222216, term222216.getClass(), "parent", null);
        term222217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term222217, term222217.getClass(), "functionName", null);
        setBooleanField(term222217, term222217.getClass(), "itsNeedsActivation", false);
        setIntField(term222217, term222217.getClass(), "itsFunctionType", 0);
        setBooleanField(term222217, term222217.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term222217, term222217.getClass(), "encodedSourceStart", 0);
        setIntField(term222217, term222217.getClass(), "encodedSourceEnd", 0);
        setField(term222217, term222217.getClass(), "sourceName", null);
        setIntField(term222217, term222217.getClass(), "baseLineno", 0);
        setIntField(term222217, term222217.getClass(), "endLineno", 0);
        setField(term222217, term222217.getClass(), "functions", null);
        setField(term222217, term222217.getClass(), "regexps", null);
        setField(term222217, term222217.getClass(), "itsVariables", null);
        setField(term222217, term222217.getClass(), "itsConst", null);
        setField(term222217, term222217.getClass(), "itsVariableNames", null);
        setIntField(term222217, term222217.getClass(), "varStart", 0);
        setField(term222217, term222217.getClass(), "compilerData", null);
        setIntField(term222217, term222217.getClass(), "type", 0);
        setField(term222217, term222217.getClass(), "next", null);
        setField(term222217, term222217.getClass(), "first", null);
        setField(term222217, term222217.getClass(), "last", null);
        setField(term222217, term222217.getClass(), "propListHead", null);
        setIntField(term222217, term222217.getClass(), "sourcePosition", 0);
        setField(term222217, term222217.getClass(), "jsType", null);
        setField(term222217, term222217.getClass(), "parent", null);
        term222191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term222191, term222191.getClass(), "number", 0.0);
        setIntField(term222191, term222191.getClass(), "type", 52);
        setField(term222191, term222191.getClass(), "next", null);
        setField(term222191, term222191.getClass(), "first", null);
        setField(term222191, term222191.getClass(), "last", null);
        setField(term222191, term222191.getClass(), "propListHead", null);
        setIntField(term222191, term222191.getClass(), "sourcePosition", 0);
        setField(term222191, term222191.getClass(), "jsType", null);
        setField(term222191, term222191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term221968;
        args[1] = term222054;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term221876, args);
        assertTrue(recursiveEquals(term221876, term222215));
        assertTrue(recursiveEquals(term221968, term222216));
        assertTrue(recursiveEquals(term222054, term222217));
        assertTrue(recursiveEquals(retValue, term222191));
    }

};


