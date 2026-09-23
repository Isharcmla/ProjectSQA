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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44751;
     Object term44837;
     Object term44986;
     Object term44987;
     Object term44942;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term44907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44837, term44837.getClass(), "first", term44837);
        setField(term44837, term44837.getClass(), "next", term44907);
        setIntField(term44837, term44837.getClass(), "type", 17);
        term44986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term44986, term44986.getClass(), "currentTraversal", null);
        term44987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term44988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44987, term44987.getClass(), "functionName", null);
        setBooleanField(term44987, term44987.getClass(), "itsNeedsActivation", false);
        setIntField(term44987, term44987.getClass(), "itsFunctionType", 0);
        setBooleanField(term44987, term44987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44987, term44987.getClass(), "encodedSourceStart", 0);
        setIntField(term44987, term44987.getClass(), "encodedSourceEnd", 0);
        setField(term44987, term44987.getClass(), "sourceName", null);
        setIntField(term44987, term44987.getClass(), "baseLineno", 0);
        setIntField(term44987, term44987.getClass(), "endLineno", 0);
        setField(term44987, term44987.getClass(), "functions", null);
        setField(term44987, term44987.getClass(), "regexps", null);
        setField(term44987, term44987.getClass(), "itsVariables", null);
        setField(term44987, term44987.getClass(), "itsConst", null);
        setField(term44987, term44987.getClass(), "itsVariableNames", null);
        setIntField(term44987, term44987.getClass(), "varStart", 0);
        setField(term44987, term44987.getClass(), "compilerData", null);
        setIntField(term44987, term44987.getClass(), "type", 17);
        setIntField(term44988, term44988.getClass(), "type", 0);
        setField(term44988, term44988.getClass(), "next", null);
        setField(term44988, term44988.getClass(), "first", null);
        setField(term44988, term44988.getClass(), "last", null);
        setField(term44988, term44988.getClass(), "propListHead", null);
        setIntField(term44988, term44988.getClass(), "sourcePosition", 0);
        setField(term44988, term44988.getClass(), "jsType", null);
        setField(term44988, term44988.getClass(), "parent", null);
        setField(term44987, term44987.getClass(), "next", term44988);
        setField(term44987, term44987.getClass(), "first", term44987);
        setField(term44987, term44987.getClass(), "last", null);
        setField(term44987, term44987.getClass(), "propListHead", null);
        setIntField(term44987, term44987.getClass(), "sourcePosition", 0);
        setField(term44987, term44987.getClass(), "jsType", null);
        setField(term44987, term44987.getClass(), "parent", null);
        term44942 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term44952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44942, term44942.getClass(), "functionName", null);
        setBooleanField(term44942, term44942.getClass(), "itsNeedsActivation", false);
        setIntField(term44942, term44942.getClass(), "itsFunctionType", 0);
        setBooleanField(term44942, term44942.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44942, term44942.getClass(), "encodedSourceStart", 0);
        setIntField(term44942, term44942.getClass(), "encodedSourceEnd", 0);
        setField(term44942, term44942.getClass(), "sourceName", null);
        setIntField(term44942, term44942.getClass(), "baseLineno", 0);
        setIntField(term44942, term44942.getClass(), "endLineno", 0);
        setField(term44942, term44942.getClass(), "functions", null);
        setField(term44942, term44942.getClass(), "regexps", null);
        setField(term44942, term44942.getClass(), "itsVariables", null);
        setField(term44942, term44942.getClass(), "itsConst", null);
        setField(term44942, term44942.getClass(), "itsVariableNames", null);
        setIntField(term44942, term44942.getClass(), "varStart", 0);
        setField(term44942, term44942.getClass(), "compilerData", null);
        setIntField(term44942, term44942.getClass(), "type", 17);
        setIntField(term44952, term44952.getClass(), "type", 0);
        setField(term44952, term44952.getClass(), "next", null);
        setField(term44952, term44952.getClass(), "first", null);
        setField(term44952, term44952.getClass(), "last", null);
        setField(term44952, term44952.getClass(), "propListHead", null);
        setIntField(term44952, term44952.getClass(), "sourcePosition", 0);
        setField(term44952, term44952.getClass(), "jsType", null);
        setField(term44952, term44952.getClass(), "parent", null);
        setField(term44942, term44942.getClass(), "next", term44952);
        setField(term44942, term44942.getClass(), "first", term44942);
        setField(term44942, term44942.getClass(), "last", null);
        setField(term44942, term44942.getClass(), "propListHead", null);
        setIntField(term44942, term44942.getClass(), "sourcePosition", 0);
        setField(term44942, term44942.getClass(), "jsType", null);
        setField(term44942, term44942.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44837;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term44751, args);
        assertTrue(recursiveEquals(term44751, term44986));
        assertTrue(recursiveEquals(term44837, term44987));
        assertTrue(recursiveEquals(retValue, term44942));
    }

};


