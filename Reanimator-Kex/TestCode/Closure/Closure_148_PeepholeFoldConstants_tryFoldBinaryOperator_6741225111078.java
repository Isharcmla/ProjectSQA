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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252800;
     Object term252892;
     Object term253237;
     Object term253238;
     Object term253190;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252800 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term252892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term252978, term252978.getClass(), "next", term253048);
        setField(term252892, term252892.getClass(), "first", term252978);
        setIntField(term252892, term252892.getClass(), "type", 33);
        term253237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253237, term253237.getClass(), "currentTraversal", null);
        term253238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term253238, term253238.getClass(), "str", null);
        setIntField(term253238, term253238.getClass(), "type", 33);
        setField(term253238, term253238.getClass(), "next", null);
        setField(term253239, term253239.getClass(), "functionName", null);
        setBooleanField(term253239, term253239.getClass(), "itsNeedsActivation", false);
        setIntField(term253239, term253239.getClass(), "itsFunctionType", 0);
        setBooleanField(term253239, term253239.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253239, term253239.getClass(), "encodedSourceStart", 0);
        setIntField(term253239, term253239.getClass(), "encodedSourceEnd", 0);
        setField(term253239, term253239.getClass(), "sourceName", null);
        setIntField(term253239, term253239.getClass(), "baseLineno", 0);
        setIntField(term253239, term253239.getClass(), "endLineno", 0);
        setField(term253239, term253239.getClass(), "functions", null);
        setField(term253239, term253239.getClass(), "regexps", null);
        setField(term253239, term253239.getClass(), "itsVariables", null);
        setField(term253239, term253239.getClass(), "itsConst", null);
        setField(term253239, term253239.getClass(), "itsVariableNames", null);
        setIntField(term253239, term253239.getClass(), "varStart", 0);
        setField(term253239, term253239.getClass(), "compilerData", null);
        setIntField(term253239, term253239.getClass(), "type", 0);
        setIntField(term253240, term253240.getClass(), "type", 0);
        setField(term253240, term253240.getClass(), "next", null);
        setField(term253240, term253240.getClass(), "first", null);
        setField(term253240, term253240.getClass(), "last", null);
        setField(term253240, term253240.getClass(), "propListHead", null);
        setIntField(term253240, term253240.getClass(), "sourcePosition", 0);
        setField(term253240, term253240.getClass(), "jsType", null);
        setField(term253240, term253240.getClass(), "parent", null);
        setField(term253239, term253239.getClass(), "next", term253240);
        setField(term253239, term253239.getClass(), "first", null);
        setField(term253239, term253239.getClass(), "last", null);
        setField(term253239, term253239.getClass(), "propListHead", null);
        setIntField(term253239, term253239.getClass(), "sourcePosition", 0);
        setField(term253239, term253239.getClass(), "jsType", null);
        setField(term253239, term253239.getClass(), "parent", null);
        setField(term253238, term253238.getClass(), "first", term253239);
        setField(term253238, term253238.getClass(), "last", null);
        setField(term253238, term253238.getClass(), "propListHead", null);
        setIntField(term253238, term253238.getClass(), "sourcePosition", 0);
        setField(term253238, term253238.getClass(), "jsType", null);
        setField(term253238, term253238.getClass(), "parent", null);
        term253190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term253190, term253190.getClass(), "str", null);
        setIntField(term253190, term253190.getClass(), "type", 33);
        setField(term253190, term253190.getClass(), "next", null);
        setField(term253192, term253192.getClass(), "functionName", null);
        setBooleanField(term253192, term253192.getClass(), "itsNeedsActivation", false);
        setIntField(term253192, term253192.getClass(), "itsFunctionType", 0);
        setBooleanField(term253192, term253192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253192, term253192.getClass(), "encodedSourceStart", 0);
        setIntField(term253192, term253192.getClass(), "encodedSourceEnd", 0);
        setField(term253192, term253192.getClass(), "sourceName", null);
        setIntField(term253192, term253192.getClass(), "baseLineno", 0);
        setIntField(term253192, term253192.getClass(), "endLineno", 0);
        setField(term253192, term253192.getClass(), "functions", null);
        setField(term253192, term253192.getClass(), "regexps", null);
        setField(term253192, term253192.getClass(), "itsVariables", null);
        setField(term253192, term253192.getClass(), "itsConst", null);
        setField(term253192, term253192.getClass(), "itsVariableNames", null);
        setIntField(term253192, term253192.getClass(), "varStart", 0);
        setField(term253192, term253192.getClass(), "compilerData", null);
        setIntField(term253192, term253192.getClass(), "type", 0);
        setIntField(term253202, term253202.getClass(), "type", 0);
        setField(term253202, term253202.getClass(), "next", null);
        setField(term253202, term253202.getClass(), "first", null);
        setField(term253202, term253202.getClass(), "last", null);
        setField(term253202, term253202.getClass(), "propListHead", null);
        setIntField(term253202, term253202.getClass(), "sourcePosition", 0);
        setField(term253202, term253202.getClass(), "jsType", null);
        setField(term253202, term253202.getClass(), "parent", null);
        setField(term253192, term253192.getClass(), "next", term253202);
        setField(term253192, term253192.getClass(), "first", null);
        setField(term253192, term253192.getClass(), "last", null);
        setField(term253192, term253192.getClass(), "propListHead", null);
        setIntField(term253192, term253192.getClass(), "sourcePosition", 0);
        setField(term253192, term253192.getClass(), "jsType", null);
        setField(term253192, term253192.getClass(), "parent", null);
        setField(term253190, term253190.getClass(), "first", term253192);
        setField(term253190, term253190.getClass(), "last", null);
        setField(term253190, term253190.getClass(), "propListHead", null);
        setIntField(term253190, term253190.getClass(), "sourcePosition", 0);
        setField(term253190, term253190.getClass(), "jsType", null);
        setField(term253190, term253190.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term252892;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term252800, args);
        assertTrue(recursiveEquals(term252800, term253237));
        assertTrue(recursiveEquals(term252892, term253238));
        assertTrue(recursiveEquals(retValue, term253190));
    }

};


