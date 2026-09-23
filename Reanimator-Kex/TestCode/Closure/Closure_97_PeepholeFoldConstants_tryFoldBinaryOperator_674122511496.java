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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128239;
     Object term128325;
     Object term134025;
     Object term134026;
     Object term133962;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term128325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128411, term128411.getClass(), "next", term128481);
        setField(term128325, term128325.getClass(), "first", term128411);
        setIntField(term128325, term128325.getClass(), "type", 11);
        term134025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term134025, term134025.getClass(), "currentTraversal", null);
        term134026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term134027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term134028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term134026, term134026.getClass(), "functionName", null);
        setBooleanField(term134026, term134026.getClass(), "itsNeedsActivation", false);
        setIntField(term134026, term134026.getClass(), "itsFunctionType", 0);
        setBooleanField(term134026, term134026.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term134026, term134026.getClass(), "encodedSourceStart", 0);
        setIntField(term134026, term134026.getClass(), "encodedSourceEnd", 0);
        setField(term134026, term134026.getClass(), "sourceName", null);
        setIntField(term134026, term134026.getClass(), "baseLineno", 0);
        setIntField(term134026, term134026.getClass(), "endLineno", 0);
        setField(term134026, term134026.getClass(), "functions", null);
        setField(term134026, term134026.getClass(), "regexps", null);
        setField(term134026, term134026.getClass(), "itsVariables", null);
        setField(term134026, term134026.getClass(), "itsConst", null);
        setField(term134026, term134026.getClass(), "itsVariableNames", null);
        setIntField(term134026, term134026.getClass(), "varStart", 0);
        setField(term134026, term134026.getClass(), "compilerData", null);
        setIntField(term134026, term134026.getClass(), "type", 11);
        setField(term134026, term134026.getClass(), "next", null);
        setField(term134027, term134027.getClass(), "functionName", null);
        setBooleanField(term134027, term134027.getClass(), "itsNeedsActivation", false);
        setIntField(term134027, term134027.getClass(), "itsFunctionType", 0);
        setBooleanField(term134027, term134027.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term134027, term134027.getClass(), "encodedSourceStart", 0);
        setIntField(term134027, term134027.getClass(), "encodedSourceEnd", 0);
        setField(term134027, term134027.getClass(), "sourceName", null);
        setIntField(term134027, term134027.getClass(), "baseLineno", 0);
        setIntField(term134027, term134027.getClass(), "endLineno", 0);
        setField(term134027, term134027.getClass(), "functions", null);
        setField(term134027, term134027.getClass(), "regexps", null);
        setField(term134027, term134027.getClass(), "itsVariables", null);
        setField(term134027, term134027.getClass(), "itsConst", null);
        setField(term134027, term134027.getClass(), "itsVariableNames", null);
        setIntField(term134027, term134027.getClass(), "varStart", 0);
        setField(term134027, term134027.getClass(), "compilerData", null);
        setIntField(term134027, term134027.getClass(), "type", 0);
        setIntField(term134028, term134028.getClass(), "type", 0);
        setField(term134028, term134028.getClass(), "next", null);
        setField(term134028, term134028.getClass(), "first", null);
        setField(term134028, term134028.getClass(), "last", null);
        setField(term134028, term134028.getClass(), "propListHead", null);
        setIntField(term134028, term134028.getClass(), "sourcePosition", 0);
        setField(term134028, term134028.getClass(), "jsType", null);
        setField(term134028, term134028.getClass(), "parent", null);
        setField(term134027, term134027.getClass(), "next", term134028);
        setField(term134027, term134027.getClass(), "first", null);
        setField(term134027, term134027.getClass(), "last", null);
        setField(term134027, term134027.getClass(), "propListHead", null);
        setIntField(term134027, term134027.getClass(), "sourcePosition", 0);
        setField(term134027, term134027.getClass(), "jsType", null);
        setField(term134027, term134027.getClass(), "parent", null);
        setField(term134026, term134026.getClass(), "first", term134027);
        setField(term134026, term134026.getClass(), "last", null);
        setField(term134026, term134026.getClass(), "propListHead", null);
        setIntField(term134026, term134026.getClass(), "sourcePosition", 0);
        setField(term134026, term134026.getClass(), "jsType", null);
        setField(term134026, term134026.getClass(), "parent", null);
        term133962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133962, term133962.getClass(), "functionName", null);
        setBooleanField(term133962, term133962.getClass(), "itsNeedsActivation", false);
        setIntField(term133962, term133962.getClass(), "itsFunctionType", 0);
        setBooleanField(term133962, term133962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133962, term133962.getClass(), "encodedSourceStart", 0);
        setIntField(term133962, term133962.getClass(), "encodedSourceEnd", 0);
        setField(term133962, term133962.getClass(), "sourceName", null);
        setIntField(term133962, term133962.getClass(), "baseLineno", 0);
        setIntField(term133962, term133962.getClass(), "endLineno", 0);
        setField(term133962, term133962.getClass(), "functions", null);
        setField(term133962, term133962.getClass(), "regexps", null);
        setField(term133962, term133962.getClass(), "itsVariables", null);
        setField(term133962, term133962.getClass(), "itsConst", null);
        setField(term133962, term133962.getClass(), "itsVariableNames", null);
        setIntField(term133962, term133962.getClass(), "varStart", 0);
        setField(term133962, term133962.getClass(), "compilerData", null);
        setIntField(term133962, term133962.getClass(), "type", 11);
        setField(term133962, term133962.getClass(), "next", null);
        setField(term133972, term133972.getClass(), "functionName", null);
        setBooleanField(term133972, term133972.getClass(), "itsNeedsActivation", false);
        setIntField(term133972, term133972.getClass(), "itsFunctionType", 0);
        setBooleanField(term133972, term133972.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133972, term133972.getClass(), "encodedSourceStart", 0);
        setIntField(term133972, term133972.getClass(), "encodedSourceEnd", 0);
        setField(term133972, term133972.getClass(), "sourceName", null);
        setIntField(term133972, term133972.getClass(), "baseLineno", 0);
        setIntField(term133972, term133972.getClass(), "endLineno", 0);
        setField(term133972, term133972.getClass(), "functions", null);
        setField(term133972, term133972.getClass(), "regexps", null);
        setField(term133972, term133972.getClass(), "itsVariables", null);
        setField(term133972, term133972.getClass(), "itsConst", null);
        setField(term133972, term133972.getClass(), "itsVariableNames", null);
        setIntField(term133972, term133972.getClass(), "varStart", 0);
        setField(term133972, term133972.getClass(), "compilerData", null);
        setIntField(term133972, term133972.getClass(), "type", 0);
        setIntField(term133982, term133982.getClass(), "type", 0);
        setField(term133982, term133982.getClass(), "next", null);
        setField(term133982, term133982.getClass(), "first", null);
        setField(term133982, term133982.getClass(), "last", null);
        setField(term133982, term133982.getClass(), "propListHead", null);
        setIntField(term133982, term133982.getClass(), "sourcePosition", 0);
        setField(term133982, term133982.getClass(), "jsType", null);
        setField(term133982, term133982.getClass(), "parent", null);
        setField(term133972, term133972.getClass(), "next", term133982);
        setField(term133972, term133972.getClass(), "first", null);
        setField(term133972, term133972.getClass(), "last", null);
        setField(term133972, term133972.getClass(), "propListHead", null);
        setIntField(term133972, term133972.getClass(), "sourcePosition", 0);
        setField(term133972, term133972.getClass(), "jsType", null);
        setField(term133972, term133972.getClass(), "parent", null);
        setField(term133962, term133962.getClass(), "first", term133972);
        setField(term133962, term133962.getClass(), "last", null);
        setField(term133962, term133962.getClass(), "propListHead", null);
        setIntField(term133962, term133962.getClass(), "sourcePosition", 0);
        setField(term133962, term133962.getClass(), "jsType", null);
        setField(term133962, term133962.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128325;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term128239, args);
        assertTrue(recursiveEquals(term128239, term134025));
        assertTrue(recursiveEquals(term128325, term134026));
        assertTrue(recursiveEquals(retValue, term133962));
    }

};


