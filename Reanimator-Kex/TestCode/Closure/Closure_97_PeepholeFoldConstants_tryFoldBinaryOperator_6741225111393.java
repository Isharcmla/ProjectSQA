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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527825;
     Object term527911;
     Object term528507;
     Object term528508;
     Object term528423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term527911 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term527997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term528089, term528089.getClass(), "type", 106);
        setField(term527997, term527997.getClass(), "next", term528089);
        setIntField(term527997, term527997.getClass(), "type", 42);
        setField(term527911, term527911.getClass(), "first", term527997);
        setIntField(term527911, term527911.getClass(), "type", 14);
        term528507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term528507, term528507.getClass(), "currentTraversal", null);
        term528508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528509 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term528508, term528508.getClass(), "functionName", null);
        setBooleanField(term528508, term528508.getClass(), "itsNeedsActivation", false);
        setIntField(term528508, term528508.getClass(), "itsFunctionType", 0);
        setBooleanField(term528508, term528508.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528508, term528508.getClass(), "encodedSourceStart", 0);
        setIntField(term528508, term528508.getClass(), "encodedSourceEnd", 0);
        setField(term528508, term528508.getClass(), "sourceName", null);
        setIntField(term528508, term528508.getClass(), "baseLineno", 0);
        setIntField(term528508, term528508.getClass(), "endLineno", 0);
        setField(term528508, term528508.getClass(), "functions", null);
        setField(term528508, term528508.getClass(), "regexps", null);
        setField(term528508, term528508.getClass(), "itsVariables", null);
        setField(term528508, term528508.getClass(), "itsConst", null);
        setField(term528508, term528508.getClass(), "itsVariableNames", null);
        setIntField(term528508, term528508.getClass(), "varStart", 0);
        setField(term528508, term528508.getClass(), "compilerData", null);
        setIntField(term528508, term528508.getClass(), "type", 14);
        setField(term528508, term528508.getClass(), "next", null);
        setField(term528509, term528509.getClass(), "functionName", null);
        setBooleanField(term528509, term528509.getClass(), "itsNeedsActivation", false);
        setIntField(term528509, term528509.getClass(), "itsFunctionType", 0);
        setBooleanField(term528509, term528509.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528509, term528509.getClass(), "encodedSourceStart", 0);
        setIntField(term528509, term528509.getClass(), "encodedSourceEnd", 0);
        setField(term528509, term528509.getClass(), "sourceName", null);
        setIntField(term528509, term528509.getClass(), "baseLineno", 0);
        setIntField(term528509, term528509.getClass(), "endLineno", 0);
        setField(term528509, term528509.getClass(), "functions", null);
        setField(term528509, term528509.getClass(), "regexps", null);
        setField(term528509, term528509.getClass(), "itsVariables", null);
        setField(term528509, term528509.getClass(), "itsConst", null);
        setField(term528509, term528509.getClass(), "itsVariableNames", null);
        setIntField(term528509, term528509.getClass(), "varStart", 0);
        setField(term528509, term528509.getClass(), "compilerData", null);
        setIntField(term528509, term528509.getClass(), "type", 42);
        setDoubleField(term528510, term528510.getClass(), "number", 0.0);
        setIntField(term528510, term528510.getClass(), "type", 106);
        setField(term528510, term528510.getClass(), "next", null);
        setField(term528510, term528510.getClass(), "first", null);
        setField(term528510, term528510.getClass(), "last", null);
        setField(term528510, term528510.getClass(), "propListHead", null);
        setIntField(term528510, term528510.getClass(), "sourcePosition", 0);
        setField(term528510, term528510.getClass(), "jsType", null);
        setField(term528510, term528510.getClass(), "parent", null);
        setField(term528509, term528509.getClass(), "next", term528510);
        setField(term528509, term528509.getClass(), "first", null);
        setField(term528509, term528509.getClass(), "last", null);
        setField(term528509, term528509.getClass(), "propListHead", null);
        setIntField(term528509, term528509.getClass(), "sourcePosition", 0);
        setField(term528509, term528509.getClass(), "jsType", null);
        setField(term528509, term528509.getClass(), "parent", null);
        setField(term528508, term528508.getClass(), "first", term528509);
        setField(term528508, term528508.getClass(), "last", null);
        setField(term528508, term528508.getClass(), "propListHead", null);
        setIntField(term528508, term528508.getClass(), "sourcePosition", 0);
        setField(term528508, term528508.getClass(), "jsType", null);
        setField(term528508, term528508.getClass(), "parent", null);
        term528423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term528423, term528423.getClass(), "functionName", null);
        setBooleanField(term528423, term528423.getClass(), "itsNeedsActivation", false);
        setIntField(term528423, term528423.getClass(), "itsFunctionType", 0);
        setBooleanField(term528423, term528423.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528423, term528423.getClass(), "encodedSourceStart", 0);
        setIntField(term528423, term528423.getClass(), "encodedSourceEnd", 0);
        setField(term528423, term528423.getClass(), "sourceName", null);
        setIntField(term528423, term528423.getClass(), "baseLineno", 0);
        setIntField(term528423, term528423.getClass(), "endLineno", 0);
        setField(term528423, term528423.getClass(), "functions", null);
        setField(term528423, term528423.getClass(), "regexps", null);
        setField(term528423, term528423.getClass(), "itsVariables", null);
        setField(term528423, term528423.getClass(), "itsConst", null);
        setField(term528423, term528423.getClass(), "itsVariableNames", null);
        setIntField(term528423, term528423.getClass(), "varStart", 0);
        setField(term528423, term528423.getClass(), "compilerData", null);
        setIntField(term528423, term528423.getClass(), "type", 14);
        setField(term528423, term528423.getClass(), "next", null);
        setField(term528433, term528433.getClass(), "functionName", null);
        setBooleanField(term528433, term528433.getClass(), "itsNeedsActivation", false);
        setIntField(term528433, term528433.getClass(), "itsFunctionType", 0);
        setBooleanField(term528433, term528433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528433, term528433.getClass(), "encodedSourceStart", 0);
        setIntField(term528433, term528433.getClass(), "encodedSourceEnd", 0);
        setField(term528433, term528433.getClass(), "sourceName", null);
        setIntField(term528433, term528433.getClass(), "baseLineno", 0);
        setIntField(term528433, term528433.getClass(), "endLineno", 0);
        setField(term528433, term528433.getClass(), "functions", null);
        setField(term528433, term528433.getClass(), "regexps", null);
        setField(term528433, term528433.getClass(), "itsVariables", null);
        setField(term528433, term528433.getClass(), "itsConst", null);
        setField(term528433, term528433.getClass(), "itsVariableNames", null);
        setIntField(term528433, term528433.getClass(), "varStart", 0);
        setField(term528433, term528433.getClass(), "compilerData", null);
        setIntField(term528433, term528433.getClass(), "type", 42);
        setDoubleField(term528443, term528443.getClass(), "number", 0.0);
        setIntField(term528443, term528443.getClass(), "type", 106);
        setField(term528443, term528443.getClass(), "next", null);
        setField(term528443, term528443.getClass(), "first", null);
        setField(term528443, term528443.getClass(), "last", null);
        setField(term528443, term528443.getClass(), "propListHead", null);
        setIntField(term528443, term528443.getClass(), "sourcePosition", 0);
        setField(term528443, term528443.getClass(), "jsType", null);
        setField(term528443, term528443.getClass(), "parent", null);
        setField(term528433, term528433.getClass(), "next", term528443);
        setField(term528433, term528433.getClass(), "first", null);
        setField(term528433, term528433.getClass(), "last", null);
        setField(term528433, term528433.getClass(), "propListHead", null);
        setIntField(term528433, term528433.getClass(), "sourcePosition", 0);
        setField(term528433, term528433.getClass(), "jsType", null);
        setField(term528433, term528433.getClass(), "parent", null);
        setField(term528423, term528423.getClass(), "first", term528433);
        setField(term528423, term528423.getClass(), "last", null);
        setField(term528423, term528423.getClass(), "propListHead", null);
        setIntField(term528423, term528423.getClass(), "sourcePosition", 0);
        setField(term528423, term528423.getClass(), "jsType", null);
        setField(term528423, term528423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term527911;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term527825, args);
        assertTrue(recursiveEquals(term527825, term528507));
        assertTrue(recursiveEquals(term527911, term528508));
        assertTrue(recursiveEquals(retValue, term528423));
    }

};


