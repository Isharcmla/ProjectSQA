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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497208;
     Object term497294;
     Object term497386;
     Object term498000;
     Object term498001;
     Object term498002;
     Object term497960;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term497294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term497294, term497294.getClass(), "parent", null);
        setIntField(term497294, term497294.getClass(), "type", 63);
        term497386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term497386, term497386.getClass(), "type", 63);
        term498000 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term498000, term498000.getClass(), "currentTraversal", null);
        term498001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term498001, term498001.getClass(), "functionName", null);
        setBooleanField(term498001, term498001.getClass(), "itsNeedsActivation", false);
        setIntField(term498001, term498001.getClass(), "itsFunctionType", 0);
        setBooleanField(term498001, term498001.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term498001, term498001.getClass(), "encodedSourceStart", 0);
        setIntField(term498001, term498001.getClass(), "encodedSourceEnd", 0);
        setField(term498001, term498001.getClass(), "sourceName", null);
        setIntField(term498001, term498001.getClass(), "baseLineno", 0);
        setIntField(term498001, term498001.getClass(), "endLineno", 0);
        setField(term498001, term498001.getClass(), "functions", null);
        setField(term498001, term498001.getClass(), "regexps", null);
        setField(term498001, term498001.getClass(), "itsVariables", null);
        setField(term498001, term498001.getClass(), "itsConst", null);
        setField(term498001, term498001.getClass(), "itsVariableNames", null);
        setIntField(term498001, term498001.getClass(), "varStart", 0);
        setField(term498001, term498001.getClass(), "compilerData", null);
        setIntField(term498001, term498001.getClass(), "type", 63);
        setField(term498001, term498001.getClass(), "next", null);
        setField(term498001, term498001.getClass(), "first", null);
        setField(term498001, term498001.getClass(), "last", null);
        setField(term498001, term498001.getClass(), "propListHead", null);
        setIntField(term498001, term498001.getClass(), "sourcePosition", 0);
        setField(term498001, term498001.getClass(), "jsType", null);
        setField(term498001, term498001.getClass(), "parent", null);
        term498002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term498002, term498002.getClass(), "number", 0.0);
        setIntField(term498002, term498002.getClass(), "type", 63);
        setField(term498002, term498002.getClass(), "next", null);
        setField(term498002, term498002.getClass(), "first", null);
        setField(term498002, term498002.getClass(), "last", null);
        setField(term498002, term498002.getClass(), "propListHead", null);
        setIntField(term498002, term498002.getClass(), "sourcePosition", 0);
        setField(term498002, term498002.getClass(), "jsType", null);
        setField(term498002, term498002.getClass(), "parent", null);
        term497960 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term497960, term497960.getClass(), "functionName", null);
        setBooleanField(term497960, term497960.getClass(), "itsNeedsActivation", false);
        setIntField(term497960, term497960.getClass(), "itsFunctionType", 0);
        setBooleanField(term497960, term497960.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term497960, term497960.getClass(), "encodedSourceStart", 0);
        setIntField(term497960, term497960.getClass(), "encodedSourceEnd", 0);
        setField(term497960, term497960.getClass(), "sourceName", null);
        setIntField(term497960, term497960.getClass(), "baseLineno", 0);
        setIntField(term497960, term497960.getClass(), "endLineno", 0);
        setField(term497960, term497960.getClass(), "functions", null);
        setField(term497960, term497960.getClass(), "regexps", null);
        setField(term497960, term497960.getClass(), "itsVariables", null);
        setField(term497960, term497960.getClass(), "itsConst", null);
        setField(term497960, term497960.getClass(), "itsVariableNames", null);
        setIntField(term497960, term497960.getClass(), "varStart", 0);
        setField(term497960, term497960.getClass(), "compilerData", null);
        setIntField(term497960, term497960.getClass(), "type", 63);
        setField(term497960, term497960.getClass(), "next", null);
        setField(term497960, term497960.getClass(), "first", null);
        setField(term497960, term497960.getClass(), "last", null);
        setField(term497960, term497960.getClass(), "propListHead", null);
        setIntField(term497960, term497960.getClass(), "sourcePosition", 0);
        setField(term497960, term497960.getClass(), "jsType", null);
        setField(term497960, term497960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term497294;
        args[1] = term497386;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term497208, args);
        assertTrue(recursiveEquals(term497208, term498000));
        assertTrue(recursiveEquals(term497294, term498001));
        assertTrue(recursiveEquals(term497386, term498002));
        assertTrue(recursiveEquals(retValue, term497960));
    }

};


