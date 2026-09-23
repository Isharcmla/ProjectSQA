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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152693;
     Object term152779;
     Object term153050;
     Object term153051;
     Object term152973;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term152779 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term152865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term152957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term152865, term152865.getClass(), "next", term152957);
        setIntField(term152865, term152865.getClass(), "type", 16);
        setField(term152779, term152779.getClass(), "first", term152865);
        setIntField(term152779, term152779.getClass(), "type", 16);
        term153050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term153050, term153050.getClass(), "currentTraversal", null);
        term153051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term153052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term153053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term153051, term153051.getClass(), "functionName", null);
        setBooleanField(term153051, term153051.getClass(), "itsNeedsActivation", false);
        setIntField(term153051, term153051.getClass(), "itsFunctionType", 0);
        setBooleanField(term153051, term153051.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term153051, term153051.getClass(), "encodedSourceStart", 0);
        setIntField(term153051, term153051.getClass(), "encodedSourceEnd", 0);
        setField(term153051, term153051.getClass(), "sourceName", null);
        setIntField(term153051, term153051.getClass(), "baseLineno", 0);
        setIntField(term153051, term153051.getClass(), "endLineno", 0);
        setField(term153051, term153051.getClass(), "functions", null);
        setField(term153051, term153051.getClass(), "regexps", null);
        setField(term153051, term153051.getClass(), "itsVariables", null);
        setField(term153051, term153051.getClass(), "itsConst", null);
        setField(term153051, term153051.getClass(), "itsVariableNames", null);
        setIntField(term153051, term153051.getClass(), "varStart", 0);
        setField(term153051, term153051.getClass(), "compilerData", null);
        setIntField(term153051, term153051.getClass(), "type", 16);
        setField(term153051, term153051.getClass(), "next", null);
        setField(term153052, term153052.getClass(), "functionName", null);
        setBooleanField(term153052, term153052.getClass(), "itsNeedsActivation", false);
        setIntField(term153052, term153052.getClass(), "itsFunctionType", 0);
        setBooleanField(term153052, term153052.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term153052, term153052.getClass(), "encodedSourceStart", 0);
        setIntField(term153052, term153052.getClass(), "encodedSourceEnd", 0);
        setField(term153052, term153052.getClass(), "sourceName", null);
        setIntField(term153052, term153052.getClass(), "baseLineno", 0);
        setIntField(term153052, term153052.getClass(), "endLineno", 0);
        setField(term153052, term153052.getClass(), "functions", null);
        setField(term153052, term153052.getClass(), "regexps", null);
        setField(term153052, term153052.getClass(), "itsVariables", null);
        setField(term153052, term153052.getClass(), "itsConst", null);
        setField(term153052, term153052.getClass(), "itsVariableNames", null);
        setIntField(term153052, term153052.getClass(), "varStart", 0);
        setField(term153052, term153052.getClass(), "compilerData", null);
        setIntField(term153052, term153052.getClass(), "type", 16);
        setDoubleField(term153053, term153053.getClass(), "number", 0.0);
        setIntField(term153053, term153053.getClass(), "type", 0);
        setField(term153053, term153053.getClass(), "next", null);
        setField(term153053, term153053.getClass(), "first", null);
        setField(term153053, term153053.getClass(), "last", null);
        setField(term153053, term153053.getClass(), "propListHead", null);
        setIntField(term153053, term153053.getClass(), "sourcePosition", 0);
        setField(term153053, term153053.getClass(), "jsType", null);
        setField(term153053, term153053.getClass(), "parent", null);
        setField(term153052, term153052.getClass(), "next", term153053);
        setField(term153052, term153052.getClass(), "first", null);
        setField(term153052, term153052.getClass(), "last", null);
        setField(term153052, term153052.getClass(), "propListHead", null);
        setIntField(term153052, term153052.getClass(), "sourcePosition", 0);
        setField(term153052, term153052.getClass(), "jsType", null);
        setField(term153052, term153052.getClass(), "parent", null);
        setField(term153051, term153051.getClass(), "first", term153052);
        setField(term153051, term153051.getClass(), "last", null);
        setField(term153051, term153051.getClass(), "propListHead", null);
        setIntField(term153051, term153051.getClass(), "sourcePosition", 0);
        setField(term153051, term153051.getClass(), "jsType", null);
        setField(term153051, term153051.getClass(), "parent", null);
        term152973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term152983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term152993 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term152973, term152973.getClass(), "functionName", null);
        setBooleanField(term152973, term152973.getClass(), "itsNeedsActivation", false);
        setIntField(term152973, term152973.getClass(), "itsFunctionType", 0);
        setBooleanField(term152973, term152973.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term152973, term152973.getClass(), "encodedSourceStart", 0);
        setIntField(term152973, term152973.getClass(), "encodedSourceEnd", 0);
        setField(term152973, term152973.getClass(), "sourceName", null);
        setIntField(term152973, term152973.getClass(), "baseLineno", 0);
        setIntField(term152973, term152973.getClass(), "endLineno", 0);
        setField(term152973, term152973.getClass(), "functions", null);
        setField(term152973, term152973.getClass(), "regexps", null);
        setField(term152973, term152973.getClass(), "itsVariables", null);
        setField(term152973, term152973.getClass(), "itsConst", null);
        setField(term152973, term152973.getClass(), "itsVariableNames", null);
        setIntField(term152973, term152973.getClass(), "varStart", 0);
        setField(term152973, term152973.getClass(), "compilerData", null);
        setIntField(term152973, term152973.getClass(), "type", 16);
        setField(term152973, term152973.getClass(), "next", null);
        setField(term152983, term152983.getClass(), "functionName", null);
        setBooleanField(term152983, term152983.getClass(), "itsNeedsActivation", false);
        setIntField(term152983, term152983.getClass(), "itsFunctionType", 0);
        setBooleanField(term152983, term152983.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term152983, term152983.getClass(), "encodedSourceStart", 0);
        setIntField(term152983, term152983.getClass(), "encodedSourceEnd", 0);
        setField(term152983, term152983.getClass(), "sourceName", null);
        setIntField(term152983, term152983.getClass(), "baseLineno", 0);
        setIntField(term152983, term152983.getClass(), "endLineno", 0);
        setField(term152983, term152983.getClass(), "functions", null);
        setField(term152983, term152983.getClass(), "regexps", null);
        setField(term152983, term152983.getClass(), "itsVariables", null);
        setField(term152983, term152983.getClass(), "itsConst", null);
        setField(term152983, term152983.getClass(), "itsVariableNames", null);
        setIntField(term152983, term152983.getClass(), "varStart", 0);
        setField(term152983, term152983.getClass(), "compilerData", null);
        setIntField(term152983, term152983.getClass(), "type", 16);
        setDoubleField(term152993, term152993.getClass(), "number", 0.0);
        setIntField(term152993, term152993.getClass(), "type", 0);
        setField(term152993, term152993.getClass(), "next", null);
        setField(term152993, term152993.getClass(), "first", null);
        setField(term152993, term152993.getClass(), "last", null);
        setField(term152993, term152993.getClass(), "propListHead", null);
        setIntField(term152993, term152993.getClass(), "sourcePosition", 0);
        setField(term152993, term152993.getClass(), "jsType", null);
        setField(term152993, term152993.getClass(), "parent", null);
        setField(term152983, term152983.getClass(), "next", term152993);
        setField(term152983, term152983.getClass(), "first", null);
        setField(term152983, term152983.getClass(), "last", null);
        setField(term152983, term152983.getClass(), "propListHead", null);
        setIntField(term152983, term152983.getClass(), "sourcePosition", 0);
        setField(term152983, term152983.getClass(), "jsType", null);
        setField(term152983, term152983.getClass(), "parent", null);
        setField(term152973, term152973.getClass(), "first", term152983);
        setField(term152973, term152973.getClass(), "last", null);
        setField(term152973, term152973.getClass(), "propListHead", null);
        setIntField(term152973, term152973.getClass(), "sourcePosition", 0);
        setField(term152973, term152973.getClass(), "jsType", null);
        setField(term152973, term152973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term152779;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term152693, args);
        assertTrue(recursiveEquals(term152693, term153050));
        assertTrue(recursiveEquals(term152779, term153051));
        assertTrue(recursiveEquals(retValue, term152973));
    }

};


