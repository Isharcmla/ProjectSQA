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

public class PeepholeFoldConstants_tryFoldAndOr_42587029076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13493;
     Object term13563;
     Object term13633;
     Object term13719;
     Object term13800;
     Object term13801;
     Object term13802;
     Object term13803;
     Object term13754;

    public PeepholeFoldConstants_tryFoldAndOr_42587029076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13493 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13563, term13563.getClass(), "parent", null);
        setIntField(term13563, term13563.getClass(), "type", 0);
        term13633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13633, term13633.getClass(), "type", 0);
        term13719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term13800 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13800, term13800.getClass(), "currentTraversal", null);
        term13801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13801, term13801.getClass(), "type", 0);
        setField(term13801, term13801.getClass(), "next", null);
        setField(term13801, term13801.getClass(), "first", null);
        setField(term13801, term13801.getClass(), "last", null);
        setField(term13801, term13801.getClass(), "propListHead", null);
        setIntField(term13801, term13801.getClass(), "sourcePosition", 0);
        setField(term13801, term13801.getClass(), "jsType", null);
        setField(term13801, term13801.getClass(), "parent", null);
        term13802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13802, term13802.getClass(), "type", 0);
        setField(term13802, term13802.getClass(), "next", null);
        setField(term13802, term13802.getClass(), "first", null);
        setField(term13802, term13802.getClass(), "last", null);
        setField(term13802, term13802.getClass(), "propListHead", null);
        setIntField(term13802, term13802.getClass(), "sourcePosition", 0);
        setField(term13802, term13802.getClass(), "jsType", null);
        setField(term13802, term13802.getClass(), "parent", null);
        term13803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term13803, term13803.getClass(), "functionName", null);
        setBooleanField(term13803, term13803.getClass(), "itsNeedsActivation", false);
        setIntField(term13803, term13803.getClass(), "itsFunctionType", 0);
        setBooleanField(term13803, term13803.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term13803, term13803.getClass(), "encodedSourceStart", 0);
        setIntField(term13803, term13803.getClass(), "encodedSourceEnd", 0);
        setField(term13803, term13803.getClass(), "sourceName", null);
        setIntField(term13803, term13803.getClass(), "baseLineno", 0);
        setIntField(term13803, term13803.getClass(), "endLineno", 0);
        setField(term13803, term13803.getClass(), "functions", null);
        setField(term13803, term13803.getClass(), "regexps", null);
        setField(term13803, term13803.getClass(), "itsVariables", null);
        setField(term13803, term13803.getClass(), "itsConst", null);
        setField(term13803, term13803.getClass(), "itsVariableNames", null);
        setIntField(term13803, term13803.getClass(), "varStart", 0);
        setField(term13803, term13803.getClass(), "compilerData", null);
        setIntField(term13803, term13803.getClass(), "type", 0);
        setField(term13803, term13803.getClass(), "next", null);
        setField(term13803, term13803.getClass(), "first", null);
        setField(term13803, term13803.getClass(), "last", null);
        setField(term13803, term13803.getClass(), "propListHead", null);
        setIntField(term13803, term13803.getClass(), "sourcePosition", 0);
        setField(term13803, term13803.getClass(), "jsType", null);
        setField(term13803, term13803.getClass(), "parent", null);
        term13754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13754, term13754.getClass(), "type", 0);
        setField(term13754, term13754.getClass(), "next", null);
        setField(term13754, term13754.getClass(), "first", null);
        setField(term13754, term13754.getClass(), "last", null);
        setField(term13754, term13754.getClass(), "propListHead", null);
        setIntField(term13754, term13754.getClass(), "sourcePosition", 0);
        setField(term13754, term13754.getClass(), "jsType", null);
        setField(term13754, term13754.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term13563;
        args[1] = term13633;
        args[2] = term13719;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term13493, args);
        assertTrue(recursiveEquals(term13493, term13800));
        assertTrue(recursiveEquals(term13563, term13801));
        assertTrue(recursiveEquals(term13633, term13802));
        assertTrue(recursiveEquals(term13719, term13803));
        assertTrue(recursiveEquals(retValue, term13754));
    }

};


