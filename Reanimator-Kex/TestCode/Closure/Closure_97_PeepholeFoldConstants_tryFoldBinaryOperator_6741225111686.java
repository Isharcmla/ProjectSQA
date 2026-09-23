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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668595;
     Object term668681;
     Object term669834;
     Object term669835;
     Object term669740;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668595 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term668681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term668767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term668767, term668767.getClass(), "next", term668681);
        setIntField(term668767, term668767.getClass(), "type", 42);
        setField(term668681, term668681.getClass(), "first", term668767);
        setIntField(term668681, term668681.getClass(), "type", 14);
        term669834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term669834, term669834.getClass(), "currentTraversal", null);
        term669835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term669836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term669835, term669835.getClass(), "functionName", null);
        setBooleanField(term669835, term669835.getClass(), "itsNeedsActivation", false);
        setIntField(term669835, term669835.getClass(), "itsFunctionType", 0);
        setBooleanField(term669835, term669835.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term669835, term669835.getClass(), "encodedSourceStart", 0);
        setIntField(term669835, term669835.getClass(), "encodedSourceEnd", 0);
        setField(term669835, term669835.getClass(), "sourceName", null);
        setIntField(term669835, term669835.getClass(), "baseLineno", 0);
        setIntField(term669835, term669835.getClass(), "endLineno", 0);
        setField(term669835, term669835.getClass(), "functions", null);
        setField(term669835, term669835.getClass(), "regexps", null);
        setField(term669835, term669835.getClass(), "itsVariables", null);
        setField(term669835, term669835.getClass(), "itsConst", null);
        setField(term669835, term669835.getClass(), "itsVariableNames", null);
        setIntField(term669835, term669835.getClass(), "varStart", 0);
        setField(term669835, term669835.getClass(), "compilerData", null);
        setIntField(term669835, term669835.getClass(), "type", 14);
        setField(term669835, term669835.getClass(), "next", null);
        setField(term669836, term669836.getClass(), "functionName", null);
        setBooleanField(term669836, term669836.getClass(), "itsNeedsActivation", false);
        setIntField(term669836, term669836.getClass(), "itsFunctionType", 0);
        setBooleanField(term669836, term669836.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term669836, term669836.getClass(), "encodedSourceStart", 0);
        setIntField(term669836, term669836.getClass(), "encodedSourceEnd", 0);
        setField(term669836, term669836.getClass(), "sourceName", null);
        setIntField(term669836, term669836.getClass(), "baseLineno", 0);
        setIntField(term669836, term669836.getClass(), "endLineno", 0);
        setField(term669836, term669836.getClass(), "functions", null);
        setField(term669836, term669836.getClass(), "regexps", null);
        setField(term669836, term669836.getClass(), "itsVariables", null);
        setField(term669836, term669836.getClass(), "itsConst", null);
        setField(term669836, term669836.getClass(), "itsVariableNames", null);
        setIntField(term669836, term669836.getClass(), "varStart", 0);
        setField(term669836, term669836.getClass(), "compilerData", null);
        setIntField(term669836, term669836.getClass(), "type", 42);
        setField(term669836, term669836.getClass(), "next", term669835);
        setField(term669836, term669836.getClass(), "first", null);
        setField(term669836, term669836.getClass(), "last", null);
        setField(term669836, term669836.getClass(), "propListHead", null);
        setIntField(term669836, term669836.getClass(), "sourcePosition", 0);
        setField(term669836, term669836.getClass(), "jsType", null);
        setField(term669836, term669836.getClass(), "parent", null);
        setField(term669835, term669835.getClass(), "first", term669836);
        setField(term669835, term669835.getClass(), "last", null);
        setField(term669835, term669835.getClass(), "propListHead", null);
        setIntField(term669835, term669835.getClass(), "sourcePosition", 0);
        setField(term669835, term669835.getClass(), "jsType", null);
        setField(term669835, term669835.getClass(), "parent", null);
        term669740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term669750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term669740, term669740.getClass(), "functionName", null);
        setBooleanField(term669740, term669740.getClass(), "itsNeedsActivation", false);
        setIntField(term669740, term669740.getClass(), "itsFunctionType", 0);
        setBooleanField(term669740, term669740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term669740, term669740.getClass(), "encodedSourceStart", 0);
        setIntField(term669740, term669740.getClass(), "encodedSourceEnd", 0);
        setField(term669740, term669740.getClass(), "sourceName", null);
        setIntField(term669740, term669740.getClass(), "baseLineno", 0);
        setIntField(term669740, term669740.getClass(), "endLineno", 0);
        setField(term669740, term669740.getClass(), "functions", null);
        setField(term669740, term669740.getClass(), "regexps", null);
        setField(term669740, term669740.getClass(), "itsVariables", null);
        setField(term669740, term669740.getClass(), "itsConst", null);
        setField(term669740, term669740.getClass(), "itsVariableNames", null);
        setIntField(term669740, term669740.getClass(), "varStart", 0);
        setField(term669740, term669740.getClass(), "compilerData", null);
        setIntField(term669740, term669740.getClass(), "type", 14);
        setField(term669740, term669740.getClass(), "next", null);
        setField(term669750, term669750.getClass(), "functionName", null);
        setBooleanField(term669750, term669750.getClass(), "itsNeedsActivation", false);
        setIntField(term669750, term669750.getClass(), "itsFunctionType", 0);
        setBooleanField(term669750, term669750.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term669750, term669750.getClass(), "encodedSourceStart", 0);
        setIntField(term669750, term669750.getClass(), "encodedSourceEnd", 0);
        setField(term669750, term669750.getClass(), "sourceName", null);
        setIntField(term669750, term669750.getClass(), "baseLineno", 0);
        setIntField(term669750, term669750.getClass(), "endLineno", 0);
        setField(term669750, term669750.getClass(), "functions", null);
        setField(term669750, term669750.getClass(), "regexps", null);
        setField(term669750, term669750.getClass(), "itsVariables", null);
        setField(term669750, term669750.getClass(), "itsConst", null);
        setField(term669750, term669750.getClass(), "itsVariableNames", null);
        setIntField(term669750, term669750.getClass(), "varStart", 0);
        setField(term669750, term669750.getClass(), "compilerData", null);
        setIntField(term669750, term669750.getClass(), "type", 42);
        setField(term669750, term669750.getClass(), "next", term669740);
        setField(term669750, term669750.getClass(), "first", null);
        setField(term669750, term669750.getClass(), "last", null);
        setField(term669750, term669750.getClass(), "propListHead", null);
        setIntField(term669750, term669750.getClass(), "sourcePosition", 0);
        setField(term669750, term669750.getClass(), "jsType", null);
        setField(term669750, term669750.getClass(), "parent", null);
        setField(term669740, term669740.getClass(), "first", term669750);
        setField(term669740, term669740.getClass(), "last", null);
        setField(term669740, term669740.getClass(), "propListHead", null);
        setIntField(term669740, term669740.getClass(), "sourcePosition", 0);
        setField(term669740, term669740.getClass(), "jsType", null);
        setField(term669740, term669740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term668681;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term668595, args);
        assertTrue(recursiveEquals(term668595, term669834));
        assertTrue(recursiveEquals(term668681, term669835));
        assertTrue(recursiveEquals(retValue, term669740));
    }

};


