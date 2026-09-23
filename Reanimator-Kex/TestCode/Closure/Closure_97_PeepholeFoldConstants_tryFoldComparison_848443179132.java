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

public class PeepholeFoldConstants_tryFoldComparison_848443179132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25132;
     Object term25218;
     Object term25304;
     Object term25390;
     Object term25982;
     Object term25983;
     Object term25984;
     Object term25985;
     Object term25948;

    public PeepholeFoldConstants_tryFoldComparison_848443179132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term25218, term25218.getClass(), "type", 16);
        term25304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term25304, term25304.getClass(), "type", 16);
        term25390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term25982 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25982, term25982.getClass(), "currentTraversal", null);
        term25983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25983, term25983.getClass(), "functionName", null);
        setBooleanField(term25983, term25983.getClass(), "itsNeedsActivation", false);
        setIntField(term25983, term25983.getClass(), "itsFunctionType", 0);
        setBooleanField(term25983, term25983.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25983, term25983.getClass(), "encodedSourceStart", 0);
        setIntField(term25983, term25983.getClass(), "encodedSourceEnd", 0);
        setField(term25983, term25983.getClass(), "sourceName", null);
        setIntField(term25983, term25983.getClass(), "baseLineno", 0);
        setIntField(term25983, term25983.getClass(), "endLineno", 0);
        setField(term25983, term25983.getClass(), "functions", null);
        setField(term25983, term25983.getClass(), "regexps", null);
        setField(term25983, term25983.getClass(), "itsVariables", null);
        setField(term25983, term25983.getClass(), "itsConst", null);
        setField(term25983, term25983.getClass(), "itsVariableNames", null);
        setIntField(term25983, term25983.getClass(), "varStart", 0);
        setField(term25983, term25983.getClass(), "compilerData", null);
        setIntField(term25983, term25983.getClass(), "type", 16);
        setField(term25983, term25983.getClass(), "next", null);
        setField(term25983, term25983.getClass(), "first", null);
        setField(term25983, term25983.getClass(), "last", null);
        setField(term25983, term25983.getClass(), "propListHead", null);
        setIntField(term25983, term25983.getClass(), "sourcePosition", 0);
        setField(term25983, term25983.getClass(), "jsType", null);
        setField(term25983, term25983.getClass(), "parent", null);
        term25984 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25984, term25984.getClass(), "functionName", null);
        setBooleanField(term25984, term25984.getClass(), "itsNeedsActivation", false);
        setIntField(term25984, term25984.getClass(), "itsFunctionType", 0);
        setBooleanField(term25984, term25984.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25984, term25984.getClass(), "encodedSourceStart", 0);
        setIntField(term25984, term25984.getClass(), "encodedSourceEnd", 0);
        setField(term25984, term25984.getClass(), "sourceName", null);
        setIntField(term25984, term25984.getClass(), "baseLineno", 0);
        setIntField(term25984, term25984.getClass(), "endLineno", 0);
        setField(term25984, term25984.getClass(), "functions", null);
        setField(term25984, term25984.getClass(), "regexps", null);
        setField(term25984, term25984.getClass(), "itsVariables", null);
        setField(term25984, term25984.getClass(), "itsConst", null);
        setField(term25984, term25984.getClass(), "itsVariableNames", null);
        setIntField(term25984, term25984.getClass(), "varStart", 0);
        setField(term25984, term25984.getClass(), "compilerData", null);
        setIntField(term25984, term25984.getClass(), "type", 16);
        setField(term25984, term25984.getClass(), "next", null);
        setField(term25984, term25984.getClass(), "first", null);
        setField(term25984, term25984.getClass(), "last", null);
        setField(term25984, term25984.getClass(), "propListHead", null);
        setIntField(term25984, term25984.getClass(), "sourcePosition", 0);
        setField(term25984, term25984.getClass(), "jsType", null);
        setField(term25984, term25984.getClass(), "parent", null);
        term25985 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25985, term25985.getClass(), "functionName", null);
        setBooleanField(term25985, term25985.getClass(), "itsNeedsActivation", false);
        setIntField(term25985, term25985.getClass(), "itsFunctionType", 0);
        setBooleanField(term25985, term25985.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25985, term25985.getClass(), "encodedSourceStart", 0);
        setIntField(term25985, term25985.getClass(), "encodedSourceEnd", 0);
        setField(term25985, term25985.getClass(), "sourceName", null);
        setIntField(term25985, term25985.getClass(), "baseLineno", 0);
        setIntField(term25985, term25985.getClass(), "endLineno", 0);
        setField(term25985, term25985.getClass(), "functions", null);
        setField(term25985, term25985.getClass(), "regexps", null);
        setField(term25985, term25985.getClass(), "itsVariables", null);
        setField(term25985, term25985.getClass(), "itsConst", null);
        setField(term25985, term25985.getClass(), "itsVariableNames", null);
        setIntField(term25985, term25985.getClass(), "varStart", 0);
        setField(term25985, term25985.getClass(), "compilerData", null);
        setIntField(term25985, term25985.getClass(), "type", 0);
        setField(term25985, term25985.getClass(), "next", null);
        setField(term25985, term25985.getClass(), "first", null);
        setField(term25985, term25985.getClass(), "last", null);
        setField(term25985, term25985.getClass(), "propListHead", null);
        setIntField(term25985, term25985.getClass(), "sourcePosition", 0);
        setField(term25985, term25985.getClass(), "jsType", null);
        setField(term25985, term25985.getClass(), "parent", null);
        term25948 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25948, term25948.getClass(), "functionName", null);
        setBooleanField(term25948, term25948.getClass(), "itsNeedsActivation", false);
        setIntField(term25948, term25948.getClass(), "itsFunctionType", 0);
        setBooleanField(term25948, term25948.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25948, term25948.getClass(), "encodedSourceStart", 0);
        setIntField(term25948, term25948.getClass(), "encodedSourceEnd", 0);
        setField(term25948, term25948.getClass(), "sourceName", null);
        setIntField(term25948, term25948.getClass(), "baseLineno", 0);
        setIntField(term25948, term25948.getClass(), "endLineno", 0);
        setField(term25948, term25948.getClass(), "functions", null);
        setField(term25948, term25948.getClass(), "regexps", null);
        setField(term25948, term25948.getClass(), "itsVariables", null);
        setField(term25948, term25948.getClass(), "itsConst", null);
        setField(term25948, term25948.getClass(), "itsVariableNames", null);
        setIntField(term25948, term25948.getClass(), "varStart", 0);
        setField(term25948, term25948.getClass(), "compilerData", null);
        setIntField(term25948, term25948.getClass(), "type", 16);
        setField(term25948, term25948.getClass(), "next", null);
        setField(term25948, term25948.getClass(), "first", null);
        setField(term25948, term25948.getClass(), "last", null);
        setField(term25948, term25948.getClass(), "propListHead", null);
        setIntField(term25948, term25948.getClass(), "sourcePosition", 0);
        setField(term25948, term25948.getClass(), "jsType", null);
        setField(term25948, term25948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term25218;
        args[1] = term25304;
        args[2] = term25390;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term25132, args);
        assertTrue(recursiveEquals(term25132, term25982));
        assertTrue(recursiveEquals(term25218, term25983));
        assertTrue(recursiveEquals(term25304, term25984));
        assertTrue(recursiveEquals(term25390, term25985));
        assertTrue(recursiveEquals(retValue, term25948));
    }

};


