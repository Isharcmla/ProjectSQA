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

public class PeepholeFoldConstants_tryFoldComparison_848443179824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236698;
     Object term236784;
     Object term236870;
     Object term236956;
     Object term237010;
     Object term237011;
     Object term237012;
     Object term237013;
     Object term236974;

    public PeepholeFoldConstants_tryFoldComparison_848443179824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term236784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term236784, term236784.getClass(), "type", 14);
        term236870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term236870, term236870.getClass(), "type", 14);
        term236956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term237010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term237010, term237010.getClass(), "currentTraversal", null);
        term237011 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term237011, term237011.getClass(), "functionName", null);
        setBooleanField(term237011, term237011.getClass(), "itsNeedsActivation", false);
        setIntField(term237011, term237011.getClass(), "itsFunctionType", 0);
        setBooleanField(term237011, term237011.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term237011, term237011.getClass(), "encodedSourceStart", 0);
        setIntField(term237011, term237011.getClass(), "encodedSourceEnd", 0);
        setField(term237011, term237011.getClass(), "sourceName", null);
        setIntField(term237011, term237011.getClass(), "baseLineno", 0);
        setIntField(term237011, term237011.getClass(), "endLineno", 0);
        setField(term237011, term237011.getClass(), "functions", null);
        setField(term237011, term237011.getClass(), "regexps", null);
        setField(term237011, term237011.getClass(), "itsVariables", null);
        setField(term237011, term237011.getClass(), "itsConst", null);
        setField(term237011, term237011.getClass(), "itsVariableNames", null);
        setIntField(term237011, term237011.getClass(), "varStart", 0);
        setField(term237011, term237011.getClass(), "compilerData", null);
        setIntField(term237011, term237011.getClass(), "type", 14);
        setField(term237011, term237011.getClass(), "next", null);
        setField(term237011, term237011.getClass(), "first", null);
        setField(term237011, term237011.getClass(), "last", null);
        setField(term237011, term237011.getClass(), "propListHead", null);
        setIntField(term237011, term237011.getClass(), "sourcePosition", 0);
        setField(term237011, term237011.getClass(), "jsType", null);
        setField(term237011, term237011.getClass(), "parent", null);
        term237012 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term237012, term237012.getClass(), "functionName", null);
        setBooleanField(term237012, term237012.getClass(), "itsNeedsActivation", false);
        setIntField(term237012, term237012.getClass(), "itsFunctionType", 0);
        setBooleanField(term237012, term237012.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term237012, term237012.getClass(), "encodedSourceStart", 0);
        setIntField(term237012, term237012.getClass(), "encodedSourceEnd", 0);
        setField(term237012, term237012.getClass(), "sourceName", null);
        setIntField(term237012, term237012.getClass(), "baseLineno", 0);
        setIntField(term237012, term237012.getClass(), "endLineno", 0);
        setField(term237012, term237012.getClass(), "functions", null);
        setField(term237012, term237012.getClass(), "regexps", null);
        setField(term237012, term237012.getClass(), "itsVariables", null);
        setField(term237012, term237012.getClass(), "itsConst", null);
        setField(term237012, term237012.getClass(), "itsVariableNames", null);
        setIntField(term237012, term237012.getClass(), "varStart", 0);
        setField(term237012, term237012.getClass(), "compilerData", null);
        setIntField(term237012, term237012.getClass(), "type", 14);
        setField(term237012, term237012.getClass(), "next", null);
        setField(term237012, term237012.getClass(), "first", null);
        setField(term237012, term237012.getClass(), "last", null);
        setField(term237012, term237012.getClass(), "propListHead", null);
        setIntField(term237012, term237012.getClass(), "sourcePosition", 0);
        setField(term237012, term237012.getClass(), "jsType", null);
        setField(term237012, term237012.getClass(), "parent", null);
        term237013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term237013, term237013.getClass(), "functionName", null);
        setBooleanField(term237013, term237013.getClass(), "itsNeedsActivation", false);
        setIntField(term237013, term237013.getClass(), "itsFunctionType", 0);
        setBooleanField(term237013, term237013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term237013, term237013.getClass(), "encodedSourceStart", 0);
        setIntField(term237013, term237013.getClass(), "encodedSourceEnd", 0);
        setField(term237013, term237013.getClass(), "sourceName", null);
        setIntField(term237013, term237013.getClass(), "baseLineno", 0);
        setIntField(term237013, term237013.getClass(), "endLineno", 0);
        setField(term237013, term237013.getClass(), "functions", null);
        setField(term237013, term237013.getClass(), "regexps", null);
        setField(term237013, term237013.getClass(), "itsVariables", null);
        setField(term237013, term237013.getClass(), "itsConst", null);
        setField(term237013, term237013.getClass(), "itsVariableNames", null);
        setIntField(term237013, term237013.getClass(), "varStart", 0);
        setField(term237013, term237013.getClass(), "compilerData", null);
        setIntField(term237013, term237013.getClass(), "type", 0);
        setField(term237013, term237013.getClass(), "next", null);
        setField(term237013, term237013.getClass(), "first", null);
        setField(term237013, term237013.getClass(), "last", null);
        setField(term237013, term237013.getClass(), "propListHead", null);
        setIntField(term237013, term237013.getClass(), "sourcePosition", 0);
        setField(term237013, term237013.getClass(), "jsType", null);
        setField(term237013, term237013.getClass(), "parent", null);
        term236974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term236974, term236974.getClass(), "functionName", null);
        setBooleanField(term236974, term236974.getClass(), "itsNeedsActivation", false);
        setIntField(term236974, term236974.getClass(), "itsFunctionType", 0);
        setBooleanField(term236974, term236974.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236974, term236974.getClass(), "encodedSourceStart", 0);
        setIntField(term236974, term236974.getClass(), "encodedSourceEnd", 0);
        setField(term236974, term236974.getClass(), "sourceName", null);
        setIntField(term236974, term236974.getClass(), "baseLineno", 0);
        setIntField(term236974, term236974.getClass(), "endLineno", 0);
        setField(term236974, term236974.getClass(), "functions", null);
        setField(term236974, term236974.getClass(), "regexps", null);
        setField(term236974, term236974.getClass(), "itsVariables", null);
        setField(term236974, term236974.getClass(), "itsConst", null);
        setField(term236974, term236974.getClass(), "itsVariableNames", null);
        setIntField(term236974, term236974.getClass(), "varStart", 0);
        setField(term236974, term236974.getClass(), "compilerData", null);
        setIntField(term236974, term236974.getClass(), "type", 14);
        setField(term236974, term236974.getClass(), "next", null);
        setField(term236974, term236974.getClass(), "first", null);
        setField(term236974, term236974.getClass(), "last", null);
        setField(term236974, term236974.getClass(), "propListHead", null);
        setIntField(term236974, term236974.getClass(), "sourcePosition", 0);
        setField(term236974, term236974.getClass(), "jsType", null);
        setField(term236974, term236974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term236784;
        args[1] = term236870;
        args[2] = term236956;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term236698, args);
        assertTrue(recursiveEquals(term236698, term237010));
        assertTrue(recursiveEquals(term236784, term237011));
        assertTrue(recursiveEquals(term236870, term237012));
        assertTrue(recursiveEquals(term236956, term237013));
        assertTrue(recursiveEquals(retValue, term236974));
    }

};


