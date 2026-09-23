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

public class PeepholeFoldConstants_tryFoldComparison_848443179208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39621;
     Object term39707;
     Object term39793;
     Object term40390;
     Object term40391;
     Object term40392;
     Object term40375;

    public PeepholeFoldConstants_tryFoldComparison_848443179208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39707 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term39793 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term39793, term39793.getClass(), "type", 0);
        term40390 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term40390, term40390.getClass(), "currentTraversal", null);
        term40391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term40391, term40391.getClass(), "functionName", null);
        setBooleanField(term40391, term40391.getClass(), "itsNeedsActivation", false);
        setIntField(term40391, term40391.getClass(), "itsFunctionType", 0);
        setBooleanField(term40391, term40391.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40391, term40391.getClass(), "encodedSourceStart", 0);
        setIntField(term40391, term40391.getClass(), "encodedSourceEnd", 0);
        setField(term40391, term40391.getClass(), "sourceName", null);
        setIntField(term40391, term40391.getClass(), "baseLineno", 0);
        setIntField(term40391, term40391.getClass(), "endLineno", 0);
        setField(term40391, term40391.getClass(), "functions", null);
        setField(term40391, term40391.getClass(), "regexps", null);
        setField(term40391, term40391.getClass(), "itsVariables", null);
        setField(term40391, term40391.getClass(), "itsConst", null);
        setField(term40391, term40391.getClass(), "itsVariableNames", null);
        setIntField(term40391, term40391.getClass(), "varStart", 0);
        setField(term40391, term40391.getClass(), "compilerData", null);
        setIntField(term40391, term40391.getClass(), "type", 0);
        setField(term40391, term40391.getClass(), "next", null);
        setField(term40391, term40391.getClass(), "first", null);
        setField(term40391, term40391.getClass(), "last", null);
        setField(term40391, term40391.getClass(), "propListHead", null);
        setIntField(term40391, term40391.getClass(), "sourcePosition", 0);
        setField(term40391, term40391.getClass(), "jsType", null);
        setField(term40391, term40391.getClass(), "parent", null);
        term40392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term40392, term40392.getClass(), "functionName", null);
        setBooleanField(term40392, term40392.getClass(), "itsNeedsActivation", false);
        setIntField(term40392, term40392.getClass(), "itsFunctionType", 0);
        setBooleanField(term40392, term40392.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40392, term40392.getClass(), "encodedSourceStart", 0);
        setIntField(term40392, term40392.getClass(), "encodedSourceEnd", 0);
        setField(term40392, term40392.getClass(), "sourceName", null);
        setIntField(term40392, term40392.getClass(), "baseLineno", 0);
        setIntField(term40392, term40392.getClass(), "endLineno", 0);
        setField(term40392, term40392.getClass(), "functions", null);
        setField(term40392, term40392.getClass(), "regexps", null);
        setField(term40392, term40392.getClass(), "itsVariables", null);
        setField(term40392, term40392.getClass(), "itsConst", null);
        setField(term40392, term40392.getClass(), "itsVariableNames", null);
        setIntField(term40392, term40392.getClass(), "varStart", 0);
        setField(term40392, term40392.getClass(), "compilerData", null);
        setIntField(term40392, term40392.getClass(), "type", 0);
        setField(term40392, term40392.getClass(), "next", null);
        setField(term40392, term40392.getClass(), "first", null);
        setField(term40392, term40392.getClass(), "last", null);
        setField(term40392, term40392.getClass(), "propListHead", null);
        setIntField(term40392, term40392.getClass(), "sourcePosition", 0);
        setField(term40392, term40392.getClass(), "jsType", null);
        setField(term40392, term40392.getClass(), "parent", null);
        term40375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term40375, term40375.getClass(), "functionName", null);
        setBooleanField(term40375, term40375.getClass(), "itsNeedsActivation", false);
        setIntField(term40375, term40375.getClass(), "itsFunctionType", 0);
        setBooleanField(term40375, term40375.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40375, term40375.getClass(), "encodedSourceStart", 0);
        setIntField(term40375, term40375.getClass(), "encodedSourceEnd", 0);
        setField(term40375, term40375.getClass(), "sourceName", null);
        setIntField(term40375, term40375.getClass(), "baseLineno", 0);
        setIntField(term40375, term40375.getClass(), "endLineno", 0);
        setField(term40375, term40375.getClass(), "functions", null);
        setField(term40375, term40375.getClass(), "regexps", null);
        setField(term40375, term40375.getClass(), "itsVariables", null);
        setField(term40375, term40375.getClass(), "itsConst", null);
        setField(term40375, term40375.getClass(), "itsVariableNames", null);
        setIntField(term40375, term40375.getClass(), "varStart", 0);
        setField(term40375, term40375.getClass(), "compilerData", null);
        setIntField(term40375, term40375.getClass(), "type", 0);
        setField(term40375, term40375.getClass(), "next", null);
        setField(term40375, term40375.getClass(), "first", null);
        setField(term40375, term40375.getClass(), "last", null);
        setField(term40375, term40375.getClass(), "propListHead", null);
        setIntField(term40375, term40375.getClass(), "sourcePosition", 0);
        setField(term40375, term40375.getClass(), "jsType", null);
        setField(term40375, term40375.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term39707;
        args[1] = term39793;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term39621, args);
        assertTrue(recursiveEquals(term39621, term40390));
        assertTrue(recursiveEquals(term39707, term40391));
        assertTrue(recursiveEquals(term39793, term40392));
        assertTrue(recursiveEquals(retValue, term40375));
    }

};


