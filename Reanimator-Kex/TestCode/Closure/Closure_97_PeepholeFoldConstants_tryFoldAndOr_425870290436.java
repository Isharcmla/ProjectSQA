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

public class PeepholeFoldConstants_tryFoldAndOr_425870290436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100724;
     Object term100816;
     Object term100902;
     Object term100988;
     Object term101095;
     Object term101096;
     Object term101097;
     Object term101098;
     Object term101041;

    public PeepholeFoldConstants_tryFoldAndOr_425870290436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term100816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100816, term100816.getClass(), "parent", null);
        setIntField(term100816, term100816.getClass(), "type", 0);
        term100902 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term100902, term100902.getClass(), "type", 0);
        term100988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term101095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term101095, term101095.getClass(), "currentTraversal", null);
        term101096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101096, term101096.getClass(), "str", null);
        setIntField(term101096, term101096.getClass(), "type", 0);
        setField(term101096, term101096.getClass(), "next", null);
        setField(term101096, term101096.getClass(), "first", null);
        setField(term101096, term101096.getClass(), "last", null);
        setField(term101096, term101096.getClass(), "propListHead", null);
        setIntField(term101096, term101096.getClass(), "sourcePosition", 0);
        setField(term101096, term101096.getClass(), "jsType", null);
        setField(term101096, term101096.getClass(), "parent", null);
        term101097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term101097, term101097.getClass(), "functionName", null);
        setBooleanField(term101097, term101097.getClass(), "itsNeedsActivation", false);
        setIntField(term101097, term101097.getClass(), "itsFunctionType", 0);
        setBooleanField(term101097, term101097.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101097, term101097.getClass(), "encodedSourceStart", 0);
        setIntField(term101097, term101097.getClass(), "encodedSourceEnd", 0);
        setField(term101097, term101097.getClass(), "sourceName", null);
        setIntField(term101097, term101097.getClass(), "baseLineno", 0);
        setIntField(term101097, term101097.getClass(), "endLineno", 0);
        setField(term101097, term101097.getClass(), "functions", null);
        setField(term101097, term101097.getClass(), "regexps", null);
        setField(term101097, term101097.getClass(), "itsVariables", null);
        setField(term101097, term101097.getClass(), "itsConst", null);
        setField(term101097, term101097.getClass(), "itsVariableNames", null);
        setIntField(term101097, term101097.getClass(), "varStart", 0);
        setField(term101097, term101097.getClass(), "compilerData", null);
        setIntField(term101097, term101097.getClass(), "type", 0);
        setField(term101097, term101097.getClass(), "next", null);
        setField(term101097, term101097.getClass(), "first", null);
        setField(term101097, term101097.getClass(), "last", null);
        setField(term101097, term101097.getClass(), "propListHead", null);
        setIntField(term101097, term101097.getClass(), "sourcePosition", 0);
        setField(term101097, term101097.getClass(), "jsType", null);
        setField(term101097, term101097.getClass(), "parent", null);
        term101098 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term101098, term101098.getClass(), "functionName", null);
        setBooleanField(term101098, term101098.getClass(), "itsNeedsActivation", false);
        setIntField(term101098, term101098.getClass(), "itsFunctionType", 0);
        setBooleanField(term101098, term101098.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101098, term101098.getClass(), "encodedSourceStart", 0);
        setIntField(term101098, term101098.getClass(), "encodedSourceEnd", 0);
        setField(term101098, term101098.getClass(), "sourceName", null);
        setIntField(term101098, term101098.getClass(), "baseLineno", 0);
        setIntField(term101098, term101098.getClass(), "endLineno", 0);
        setField(term101098, term101098.getClass(), "functions", null);
        setField(term101098, term101098.getClass(), "regexps", null);
        setField(term101098, term101098.getClass(), "itsVariables", null);
        setField(term101098, term101098.getClass(), "itsConst", null);
        setField(term101098, term101098.getClass(), "itsVariableNames", null);
        setIntField(term101098, term101098.getClass(), "varStart", 0);
        setField(term101098, term101098.getClass(), "compilerData", null);
        setIntField(term101098, term101098.getClass(), "type", 0);
        setField(term101098, term101098.getClass(), "next", null);
        setField(term101098, term101098.getClass(), "first", null);
        setField(term101098, term101098.getClass(), "last", null);
        setField(term101098, term101098.getClass(), "propListHead", null);
        setIntField(term101098, term101098.getClass(), "sourcePosition", 0);
        setField(term101098, term101098.getClass(), "jsType", null);
        setField(term101098, term101098.getClass(), "parent", null);
        term101041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101041, term101041.getClass(), "str", null);
        setIntField(term101041, term101041.getClass(), "type", 0);
        setField(term101041, term101041.getClass(), "next", null);
        setField(term101041, term101041.getClass(), "first", null);
        setField(term101041, term101041.getClass(), "last", null);
        setField(term101041, term101041.getClass(), "propListHead", null);
        setIntField(term101041, term101041.getClass(), "sourcePosition", 0);
        setField(term101041, term101041.getClass(), "jsType", null);
        setField(term101041, term101041.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term100816;
        args[1] = term100902;
        args[2] = term100988;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term100724, args);
        assertTrue(recursiveEquals(term100724, term101095));
        assertTrue(recursiveEquals(term100816, term101096));
        assertTrue(recursiveEquals(term100902, term101097));
        assertTrue(recursiveEquals(term100988, term101098));
        assertTrue(recursiveEquals(retValue, term101041));
    }

};


