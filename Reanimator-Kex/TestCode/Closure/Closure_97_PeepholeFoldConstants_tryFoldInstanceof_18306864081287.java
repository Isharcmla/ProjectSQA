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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429598;
     Object term429684;
     Object term429770;
     Object term430201;
     Object term430202;
     Object term430203;
     Object term430170;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term429684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term429684, term429684.getClass(), "type", 52);
        term429770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term430201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term430201, term430201.getClass(), "currentTraversal", null);
        term430202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term430202, term430202.getClass(), "functionName", null);
        setBooleanField(term430202, term430202.getClass(), "itsNeedsActivation", false);
        setIntField(term430202, term430202.getClass(), "itsFunctionType", 0);
        setBooleanField(term430202, term430202.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430202, term430202.getClass(), "encodedSourceStart", 0);
        setIntField(term430202, term430202.getClass(), "encodedSourceEnd", 0);
        setField(term430202, term430202.getClass(), "sourceName", null);
        setIntField(term430202, term430202.getClass(), "baseLineno", 0);
        setIntField(term430202, term430202.getClass(), "endLineno", 0);
        setField(term430202, term430202.getClass(), "functions", null);
        setField(term430202, term430202.getClass(), "regexps", null);
        setField(term430202, term430202.getClass(), "itsVariables", null);
        setField(term430202, term430202.getClass(), "itsConst", null);
        setField(term430202, term430202.getClass(), "itsVariableNames", null);
        setIntField(term430202, term430202.getClass(), "varStart", 0);
        setField(term430202, term430202.getClass(), "compilerData", null);
        setIntField(term430202, term430202.getClass(), "type", 52);
        setField(term430202, term430202.getClass(), "next", null);
        setField(term430202, term430202.getClass(), "first", null);
        setField(term430202, term430202.getClass(), "last", null);
        setField(term430202, term430202.getClass(), "propListHead", null);
        setIntField(term430202, term430202.getClass(), "sourcePosition", 0);
        setField(term430202, term430202.getClass(), "jsType", null);
        setField(term430202, term430202.getClass(), "parent", null);
        term430203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term430203, term430203.getClass(), "functionName", null);
        setBooleanField(term430203, term430203.getClass(), "itsNeedsActivation", false);
        setIntField(term430203, term430203.getClass(), "itsFunctionType", 0);
        setBooleanField(term430203, term430203.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430203, term430203.getClass(), "encodedSourceStart", 0);
        setIntField(term430203, term430203.getClass(), "encodedSourceEnd", 0);
        setField(term430203, term430203.getClass(), "sourceName", null);
        setIntField(term430203, term430203.getClass(), "baseLineno", 0);
        setIntField(term430203, term430203.getClass(), "endLineno", 0);
        setField(term430203, term430203.getClass(), "functions", null);
        setField(term430203, term430203.getClass(), "regexps", null);
        setField(term430203, term430203.getClass(), "itsVariables", null);
        setField(term430203, term430203.getClass(), "itsConst", null);
        setField(term430203, term430203.getClass(), "itsVariableNames", null);
        setIntField(term430203, term430203.getClass(), "varStart", 0);
        setField(term430203, term430203.getClass(), "compilerData", null);
        setIntField(term430203, term430203.getClass(), "type", 0);
        setField(term430203, term430203.getClass(), "next", null);
        setField(term430203, term430203.getClass(), "first", null);
        setField(term430203, term430203.getClass(), "last", null);
        setField(term430203, term430203.getClass(), "propListHead", null);
        setIntField(term430203, term430203.getClass(), "sourcePosition", 0);
        setField(term430203, term430203.getClass(), "jsType", null);
        setField(term430203, term430203.getClass(), "parent", null);
        term430170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term430170, term430170.getClass(), "functionName", null);
        setBooleanField(term430170, term430170.getClass(), "itsNeedsActivation", false);
        setIntField(term430170, term430170.getClass(), "itsFunctionType", 0);
        setBooleanField(term430170, term430170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430170, term430170.getClass(), "encodedSourceStart", 0);
        setIntField(term430170, term430170.getClass(), "encodedSourceEnd", 0);
        setField(term430170, term430170.getClass(), "sourceName", null);
        setIntField(term430170, term430170.getClass(), "baseLineno", 0);
        setIntField(term430170, term430170.getClass(), "endLineno", 0);
        setField(term430170, term430170.getClass(), "functions", null);
        setField(term430170, term430170.getClass(), "regexps", null);
        setField(term430170, term430170.getClass(), "itsVariables", null);
        setField(term430170, term430170.getClass(), "itsConst", null);
        setField(term430170, term430170.getClass(), "itsVariableNames", null);
        setIntField(term430170, term430170.getClass(), "varStart", 0);
        setField(term430170, term430170.getClass(), "compilerData", null);
        setIntField(term430170, term430170.getClass(), "type", 52);
        setField(term430170, term430170.getClass(), "next", null);
        setField(term430170, term430170.getClass(), "first", null);
        setField(term430170, term430170.getClass(), "last", null);
        setField(term430170, term430170.getClass(), "propListHead", null);
        setIntField(term430170, term430170.getClass(), "sourcePosition", 0);
        setField(term430170, term430170.getClass(), "jsType", null);
        setField(term430170, term430170.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term429684;
        args[1] = term429770;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term429598, args);
        assertTrue(recursiveEquals(term429598, term430201));
        assertTrue(recursiveEquals(term429684, term430202));
        assertTrue(recursiveEquals(term429770, term430203));
        assertTrue(recursiveEquals(retValue, term430170));
    }

};


