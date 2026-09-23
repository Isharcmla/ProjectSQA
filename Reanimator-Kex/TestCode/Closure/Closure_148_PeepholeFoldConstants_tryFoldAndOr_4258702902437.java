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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680413;
     Object term680499;
     Object term680591;
     Object term681170;
     Object term681171;
     Object term681172;
     Object term681131;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term680413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term680499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term680499, term680499.getClass(), "parent", null);
        setIntField(term680499, term680499.getClass(), "type", 47);
        term680591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term680591, term680591.getClass(), "type", 47);
        term681170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term681170, term681170.getClass(), "currentTraversal", null);
        term681171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term681171, term681171.getClass(), "functionName", null);
        setBooleanField(term681171, term681171.getClass(), "itsNeedsActivation", false);
        setIntField(term681171, term681171.getClass(), "itsFunctionType", 0);
        setBooleanField(term681171, term681171.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681171, term681171.getClass(), "encodedSourceStart", 0);
        setIntField(term681171, term681171.getClass(), "encodedSourceEnd", 0);
        setField(term681171, term681171.getClass(), "sourceName", null);
        setIntField(term681171, term681171.getClass(), "baseLineno", 0);
        setIntField(term681171, term681171.getClass(), "endLineno", 0);
        setField(term681171, term681171.getClass(), "functions", null);
        setField(term681171, term681171.getClass(), "regexps", null);
        setField(term681171, term681171.getClass(), "itsVariables", null);
        setField(term681171, term681171.getClass(), "itsConst", null);
        setField(term681171, term681171.getClass(), "itsVariableNames", null);
        setIntField(term681171, term681171.getClass(), "varStart", 0);
        setField(term681171, term681171.getClass(), "compilerData", null);
        setIntField(term681171, term681171.getClass(), "type", 47);
        setField(term681171, term681171.getClass(), "next", null);
        setField(term681171, term681171.getClass(), "first", null);
        setField(term681171, term681171.getClass(), "last", null);
        setField(term681171, term681171.getClass(), "propListHead", null);
        setIntField(term681171, term681171.getClass(), "sourcePosition", 0);
        setField(term681171, term681171.getClass(), "jsType", null);
        setField(term681171, term681171.getClass(), "parent", null);
        term681172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term681172, term681172.getClass(), "str", null);
        setIntField(term681172, term681172.getClass(), "type", 47);
        setField(term681172, term681172.getClass(), "next", null);
        setField(term681172, term681172.getClass(), "first", null);
        setField(term681172, term681172.getClass(), "last", null);
        setField(term681172, term681172.getClass(), "propListHead", null);
        setIntField(term681172, term681172.getClass(), "sourcePosition", 0);
        setField(term681172, term681172.getClass(), "jsType", null);
        setField(term681172, term681172.getClass(), "parent", null);
        term681131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term681131, term681131.getClass(), "functionName", null);
        setBooleanField(term681131, term681131.getClass(), "itsNeedsActivation", false);
        setIntField(term681131, term681131.getClass(), "itsFunctionType", 0);
        setBooleanField(term681131, term681131.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681131, term681131.getClass(), "encodedSourceStart", 0);
        setIntField(term681131, term681131.getClass(), "encodedSourceEnd", 0);
        setField(term681131, term681131.getClass(), "sourceName", null);
        setIntField(term681131, term681131.getClass(), "baseLineno", 0);
        setIntField(term681131, term681131.getClass(), "endLineno", 0);
        setField(term681131, term681131.getClass(), "functions", null);
        setField(term681131, term681131.getClass(), "regexps", null);
        setField(term681131, term681131.getClass(), "itsVariables", null);
        setField(term681131, term681131.getClass(), "itsConst", null);
        setField(term681131, term681131.getClass(), "itsVariableNames", null);
        setIntField(term681131, term681131.getClass(), "varStart", 0);
        setField(term681131, term681131.getClass(), "compilerData", null);
        setIntField(term681131, term681131.getClass(), "type", 47);
        setField(term681131, term681131.getClass(), "next", null);
        setField(term681131, term681131.getClass(), "first", null);
        setField(term681131, term681131.getClass(), "last", null);
        setField(term681131, term681131.getClass(), "propListHead", null);
        setIntField(term681131, term681131.getClass(), "sourcePosition", 0);
        setField(term681131, term681131.getClass(), "jsType", null);
        setField(term681131, term681131.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term680499;
        args[1] = term680591;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term680413, args);
        assertTrue(recursiveEquals(term680413, term681170));
        assertTrue(recursiveEquals(term680499, term681171));
        assertTrue(recursiveEquals(term680591, term681172));
        assertTrue(recursiveEquals(retValue, term681131));
    }

};


