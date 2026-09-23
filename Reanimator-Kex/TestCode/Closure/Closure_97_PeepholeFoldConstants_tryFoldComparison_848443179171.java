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

public class PeepholeFoldConstants_tryFoldComparison_848443179171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32794;
     Object term32880;
     Object term32966;
     Object term33191;
     Object term33192;
     Object term33193;
     Object term33176;

    public PeepholeFoldConstants_tryFoldComparison_848443179171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32794 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32880 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term32880, term32880.getClass(), "type", 0);
        term32966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term32966, term32966.getClass(), "type", 0);
        term33191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33191, term33191.getClass(), "currentTraversal", null);
        term33192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term33192, term33192.getClass(), "functionName", null);
        setBooleanField(term33192, term33192.getClass(), "itsNeedsActivation", false);
        setIntField(term33192, term33192.getClass(), "itsFunctionType", 0);
        setBooleanField(term33192, term33192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33192, term33192.getClass(), "encodedSourceStart", 0);
        setIntField(term33192, term33192.getClass(), "encodedSourceEnd", 0);
        setField(term33192, term33192.getClass(), "sourceName", null);
        setIntField(term33192, term33192.getClass(), "baseLineno", 0);
        setIntField(term33192, term33192.getClass(), "endLineno", 0);
        setField(term33192, term33192.getClass(), "functions", null);
        setField(term33192, term33192.getClass(), "regexps", null);
        setField(term33192, term33192.getClass(), "itsVariables", null);
        setField(term33192, term33192.getClass(), "itsConst", null);
        setField(term33192, term33192.getClass(), "itsVariableNames", null);
        setIntField(term33192, term33192.getClass(), "varStart", 0);
        setField(term33192, term33192.getClass(), "compilerData", null);
        setIntField(term33192, term33192.getClass(), "type", 0);
        setField(term33192, term33192.getClass(), "next", null);
        setField(term33192, term33192.getClass(), "first", null);
        setField(term33192, term33192.getClass(), "last", null);
        setField(term33192, term33192.getClass(), "propListHead", null);
        setIntField(term33192, term33192.getClass(), "sourcePosition", 0);
        setField(term33192, term33192.getClass(), "jsType", null);
        setField(term33192, term33192.getClass(), "parent", null);
        term33193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term33193, term33193.getClass(), "functionName", null);
        setBooleanField(term33193, term33193.getClass(), "itsNeedsActivation", false);
        setIntField(term33193, term33193.getClass(), "itsFunctionType", 0);
        setBooleanField(term33193, term33193.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33193, term33193.getClass(), "encodedSourceStart", 0);
        setIntField(term33193, term33193.getClass(), "encodedSourceEnd", 0);
        setField(term33193, term33193.getClass(), "sourceName", null);
        setIntField(term33193, term33193.getClass(), "baseLineno", 0);
        setIntField(term33193, term33193.getClass(), "endLineno", 0);
        setField(term33193, term33193.getClass(), "functions", null);
        setField(term33193, term33193.getClass(), "regexps", null);
        setField(term33193, term33193.getClass(), "itsVariables", null);
        setField(term33193, term33193.getClass(), "itsConst", null);
        setField(term33193, term33193.getClass(), "itsVariableNames", null);
        setIntField(term33193, term33193.getClass(), "varStart", 0);
        setField(term33193, term33193.getClass(), "compilerData", null);
        setIntField(term33193, term33193.getClass(), "type", 0);
        setField(term33193, term33193.getClass(), "next", null);
        setField(term33193, term33193.getClass(), "first", null);
        setField(term33193, term33193.getClass(), "last", null);
        setField(term33193, term33193.getClass(), "propListHead", null);
        setIntField(term33193, term33193.getClass(), "sourcePosition", 0);
        setField(term33193, term33193.getClass(), "jsType", null);
        setField(term33193, term33193.getClass(), "parent", null);
        term33176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term33176, term33176.getClass(), "functionName", null);
        setBooleanField(term33176, term33176.getClass(), "itsNeedsActivation", false);
        setIntField(term33176, term33176.getClass(), "itsFunctionType", 0);
        setBooleanField(term33176, term33176.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33176, term33176.getClass(), "encodedSourceStart", 0);
        setIntField(term33176, term33176.getClass(), "encodedSourceEnd", 0);
        setField(term33176, term33176.getClass(), "sourceName", null);
        setIntField(term33176, term33176.getClass(), "baseLineno", 0);
        setIntField(term33176, term33176.getClass(), "endLineno", 0);
        setField(term33176, term33176.getClass(), "functions", null);
        setField(term33176, term33176.getClass(), "regexps", null);
        setField(term33176, term33176.getClass(), "itsVariables", null);
        setField(term33176, term33176.getClass(), "itsConst", null);
        setField(term33176, term33176.getClass(), "itsVariableNames", null);
        setIntField(term33176, term33176.getClass(), "varStart", 0);
        setField(term33176, term33176.getClass(), "compilerData", null);
        setIntField(term33176, term33176.getClass(), "type", 0);
        setField(term33176, term33176.getClass(), "next", null);
        setField(term33176, term33176.getClass(), "first", null);
        setField(term33176, term33176.getClass(), "last", null);
        setField(term33176, term33176.getClass(), "propListHead", null);
        setIntField(term33176, term33176.getClass(), "sourcePosition", 0);
        setField(term33176, term33176.getClass(), "jsType", null);
        setField(term33176, term33176.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term32880;
        args[1] = term32966;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term32794, args);
        assertTrue(recursiveEquals(term32794, term33191));
        assertTrue(recursiveEquals(term32880, term33192));
        assertTrue(recursiveEquals(term32966, term33193));
        assertTrue(recursiveEquals(retValue, term33176));
    }

};


