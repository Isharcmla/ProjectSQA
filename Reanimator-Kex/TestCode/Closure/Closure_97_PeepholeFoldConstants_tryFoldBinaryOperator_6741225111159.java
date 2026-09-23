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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356318;
     Object term356404;
     Object term356985;
     Object term356986;
     Object term356926;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term356404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term356490, term356490.getClass(), "next", term356560);
        setField(term356404, term356404.getClass(), "first", term356490);
        setIntField(term356404, term356404.getClass(), "type", 22);
        term356985 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term356985, term356985.getClass(), "currentTraversal", null);
        term356986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term356986, term356986.getClass(), "functionName", null);
        setBooleanField(term356986, term356986.getClass(), "itsNeedsActivation", false);
        setIntField(term356986, term356986.getClass(), "itsFunctionType", 0);
        setBooleanField(term356986, term356986.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term356986, term356986.getClass(), "encodedSourceStart", 0);
        setIntField(term356986, term356986.getClass(), "encodedSourceEnd", 0);
        setField(term356986, term356986.getClass(), "sourceName", null);
        setIntField(term356986, term356986.getClass(), "baseLineno", 0);
        setIntField(term356986, term356986.getClass(), "endLineno", 0);
        setField(term356986, term356986.getClass(), "functions", null);
        setField(term356986, term356986.getClass(), "regexps", null);
        setField(term356986, term356986.getClass(), "itsVariables", null);
        setField(term356986, term356986.getClass(), "itsConst", null);
        setField(term356986, term356986.getClass(), "itsVariableNames", null);
        setIntField(term356986, term356986.getClass(), "varStart", 0);
        setField(term356986, term356986.getClass(), "compilerData", null);
        setIntField(term356986, term356986.getClass(), "type", 22);
        setField(term356986, term356986.getClass(), "next", null);
        setField(term356987, term356987.getClass(), "functionName", null);
        setBooleanField(term356987, term356987.getClass(), "itsNeedsActivation", false);
        setIntField(term356987, term356987.getClass(), "itsFunctionType", 0);
        setBooleanField(term356987, term356987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term356987, term356987.getClass(), "encodedSourceStart", 0);
        setIntField(term356987, term356987.getClass(), "encodedSourceEnd", 0);
        setField(term356987, term356987.getClass(), "sourceName", null);
        setIntField(term356987, term356987.getClass(), "baseLineno", 0);
        setIntField(term356987, term356987.getClass(), "endLineno", 0);
        setField(term356987, term356987.getClass(), "functions", null);
        setField(term356987, term356987.getClass(), "regexps", null);
        setField(term356987, term356987.getClass(), "itsVariables", null);
        setField(term356987, term356987.getClass(), "itsConst", null);
        setField(term356987, term356987.getClass(), "itsVariableNames", null);
        setIntField(term356987, term356987.getClass(), "varStart", 0);
        setField(term356987, term356987.getClass(), "compilerData", null);
        setIntField(term356987, term356987.getClass(), "type", 0);
        setIntField(term356988, term356988.getClass(), "type", 0);
        setField(term356988, term356988.getClass(), "next", null);
        setField(term356988, term356988.getClass(), "first", null);
        setField(term356988, term356988.getClass(), "last", null);
        setField(term356988, term356988.getClass(), "propListHead", null);
        setIntField(term356988, term356988.getClass(), "sourcePosition", 0);
        setField(term356988, term356988.getClass(), "jsType", null);
        setField(term356988, term356988.getClass(), "parent", null);
        setField(term356987, term356987.getClass(), "next", term356988);
        setField(term356987, term356987.getClass(), "first", null);
        setField(term356987, term356987.getClass(), "last", null);
        setField(term356987, term356987.getClass(), "propListHead", null);
        setIntField(term356987, term356987.getClass(), "sourcePosition", 0);
        setField(term356987, term356987.getClass(), "jsType", null);
        setField(term356987, term356987.getClass(), "parent", null);
        setField(term356986, term356986.getClass(), "first", term356987);
        setField(term356986, term356986.getClass(), "last", null);
        setField(term356986, term356986.getClass(), "propListHead", null);
        setIntField(term356986, term356986.getClass(), "sourcePosition", 0);
        setField(term356986, term356986.getClass(), "jsType", null);
        setField(term356986, term356986.getClass(), "parent", null);
        term356926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356936 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term356946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term356926, term356926.getClass(), "functionName", null);
        setBooleanField(term356926, term356926.getClass(), "itsNeedsActivation", false);
        setIntField(term356926, term356926.getClass(), "itsFunctionType", 0);
        setBooleanField(term356926, term356926.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term356926, term356926.getClass(), "encodedSourceStart", 0);
        setIntField(term356926, term356926.getClass(), "encodedSourceEnd", 0);
        setField(term356926, term356926.getClass(), "sourceName", null);
        setIntField(term356926, term356926.getClass(), "baseLineno", 0);
        setIntField(term356926, term356926.getClass(), "endLineno", 0);
        setField(term356926, term356926.getClass(), "functions", null);
        setField(term356926, term356926.getClass(), "regexps", null);
        setField(term356926, term356926.getClass(), "itsVariables", null);
        setField(term356926, term356926.getClass(), "itsConst", null);
        setField(term356926, term356926.getClass(), "itsVariableNames", null);
        setIntField(term356926, term356926.getClass(), "varStart", 0);
        setField(term356926, term356926.getClass(), "compilerData", null);
        setIntField(term356926, term356926.getClass(), "type", 22);
        setField(term356926, term356926.getClass(), "next", null);
        setField(term356936, term356936.getClass(), "functionName", null);
        setBooleanField(term356936, term356936.getClass(), "itsNeedsActivation", false);
        setIntField(term356936, term356936.getClass(), "itsFunctionType", 0);
        setBooleanField(term356936, term356936.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term356936, term356936.getClass(), "encodedSourceStart", 0);
        setIntField(term356936, term356936.getClass(), "encodedSourceEnd", 0);
        setField(term356936, term356936.getClass(), "sourceName", null);
        setIntField(term356936, term356936.getClass(), "baseLineno", 0);
        setIntField(term356936, term356936.getClass(), "endLineno", 0);
        setField(term356936, term356936.getClass(), "functions", null);
        setField(term356936, term356936.getClass(), "regexps", null);
        setField(term356936, term356936.getClass(), "itsVariables", null);
        setField(term356936, term356936.getClass(), "itsConst", null);
        setField(term356936, term356936.getClass(), "itsVariableNames", null);
        setIntField(term356936, term356936.getClass(), "varStart", 0);
        setField(term356936, term356936.getClass(), "compilerData", null);
        setIntField(term356936, term356936.getClass(), "type", 0);
        setIntField(term356946, term356946.getClass(), "type", 0);
        setField(term356946, term356946.getClass(), "next", null);
        setField(term356946, term356946.getClass(), "first", null);
        setField(term356946, term356946.getClass(), "last", null);
        setField(term356946, term356946.getClass(), "propListHead", null);
        setIntField(term356946, term356946.getClass(), "sourcePosition", 0);
        setField(term356946, term356946.getClass(), "jsType", null);
        setField(term356946, term356946.getClass(), "parent", null);
        setField(term356936, term356936.getClass(), "next", term356946);
        setField(term356936, term356936.getClass(), "first", null);
        setField(term356936, term356936.getClass(), "last", null);
        setField(term356936, term356936.getClass(), "propListHead", null);
        setIntField(term356936, term356936.getClass(), "sourcePosition", 0);
        setField(term356936, term356936.getClass(), "jsType", null);
        setField(term356936, term356936.getClass(), "parent", null);
        setField(term356926, term356926.getClass(), "first", term356936);
        setField(term356926, term356926.getClass(), "last", null);
        setField(term356926, term356926.getClass(), "propListHead", null);
        setIntField(term356926, term356926.getClass(), "sourcePosition", 0);
        setField(term356926, term356926.getClass(), "jsType", null);
        setField(term356926, term356926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term356404;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term356318, args);
        assertTrue(recursiveEquals(term356318, term356985));
        assertTrue(recursiveEquals(term356404, term356986));
        assertTrue(recursiveEquals(retValue, term356926));
    }

};


