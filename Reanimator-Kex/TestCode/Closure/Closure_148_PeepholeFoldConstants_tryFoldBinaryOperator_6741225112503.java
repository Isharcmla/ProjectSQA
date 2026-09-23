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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703336;
     Object term703428;
     Object term704190;
     Object term704191;
     Object term704086;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term703428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term703518 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term703604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term703604, term703604.getClass(), "type", 44);
        setField(term703518, term703518.getClass(), "next", term703604);
        setIntField(term703518, term703518.getClass(), "type", 0);
        setField(term703428, term703428.getClass(), "first", term703518);
        setIntField(term703428, term703428.getClass(), "type", 101);
        setField(term703428, term703428.getClass(), "parent", term703674);
        term704190 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term704190, term704190.getClass(), "currentTraversal", null);
        term704191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term704192 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term704193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term704191, term704191.getClass(), "number", 0.0);
        setIntField(term704191, term704191.getClass(), "type", 101);
        setField(term704191, term704191.getClass(), "next", null);
        setIntField(term704192, term704192.getClass(), "encodedSourceStart", 0);
        setIntField(term704192, term704192.getClass(), "encodedSourceEnd", 0);
        setField(term704192, term704192.getClass(), "sourceName", null);
        setIntField(term704192, term704192.getClass(), "baseLineno", 0);
        setIntField(term704192, term704192.getClass(), "endLineno", 0);
        setField(term704192, term704192.getClass(), "functions", null);
        setField(term704192, term704192.getClass(), "regexps", null);
        setField(term704192, term704192.getClass(), "itsVariables", null);
        setField(term704192, term704192.getClass(), "itsConst", null);
        setField(term704192, term704192.getClass(), "itsVariableNames", null);
        setIntField(term704192, term704192.getClass(), "varStart", 0);
        setField(term704192, term704192.getClass(), "compilerData", null);
        setIntField(term704192, term704192.getClass(), "type", 0);
        setField(term704193, term704193.getClass(), "functionName", null);
        setBooleanField(term704193, term704193.getClass(), "itsNeedsActivation", false);
        setIntField(term704193, term704193.getClass(), "itsFunctionType", 0);
        setBooleanField(term704193, term704193.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704193, term704193.getClass(), "encodedSourceStart", 0);
        setIntField(term704193, term704193.getClass(), "encodedSourceEnd", 0);
        setField(term704193, term704193.getClass(), "sourceName", null);
        setIntField(term704193, term704193.getClass(), "baseLineno", 0);
        setIntField(term704193, term704193.getClass(), "endLineno", 0);
        setField(term704193, term704193.getClass(), "functions", null);
        setField(term704193, term704193.getClass(), "regexps", null);
        setField(term704193, term704193.getClass(), "itsVariables", null);
        setField(term704193, term704193.getClass(), "itsConst", null);
        setField(term704193, term704193.getClass(), "itsVariableNames", null);
        setIntField(term704193, term704193.getClass(), "varStart", 0);
        setField(term704193, term704193.getClass(), "compilerData", null);
        setIntField(term704193, term704193.getClass(), "type", 44);
        setField(term704193, term704193.getClass(), "next", null);
        setField(term704193, term704193.getClass(), "first", null);
        setField(term704193, term704193.getClass(), "last", null);
        setField(term704193, term704193.getClass(), "propListHead", null);
        setIntField(term704193, term704193.getClass(), "sourcePosition", 0);
        setField(term704193, term704193.getClass(), "jsType", null);
        setField(term704193, term704193.getClass(), "parent", null);
        setField(term704192, term704192.getClass(), "next", term704193);
        setField(term704192, term704192.getClass(), "first", null);
        setField(term704192, term704192.getClass(), "last", null);
        setField(term704192, term704192.getClass(), "propListHead", null);
        setIntField(term704192, term704192.getClass(), "sourcePosition", 0);
        setField(term704192, term704192.getClass(), "jsType", null);
        setField(term704192, term704192.getClass(), "parent", null);
        setField(term704191, term704191.getClass(), "first", term704192);
        setField(term704191, term704191.getClass(), "last", null);
        setField(term704191, term704191.getClass(), "propListHead", null);
        setIntField(term704191, term704191.getClass(), "sourcePosition", 0);
        setField(term704191, term704191.getClass(), "jsType", null);
        setIntField(term704194, term704194.getClass(), "type", 0);
        setField(term704194, term704194.getClass(), "next", null);
        setField(term704194, term704194.getClass(), "first", null);
        setField(term704194, term704194.getClass(), "last", null);
        setField(term704194, term704194.getClass(), "propListHead", null);
        setIntField(term704194, term704194.getClass(), "sourcePosition", 0);
        setField(term704194, term704194.getClass(), "jsType", null);
        setField(term704194, term704194.getClass(), "parent", null);
        setField(term704191, term704191.getClass(), "parent", term704194);
        term704086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term704089 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term704096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term704086, term704086.getClass(), "number", 0.0);
        setIntField(term704086, term704086.getClass(), "type", 101);
        setField(term704086, term704086.getClass(), "next", null);
        setIntField(term704089, term704089.getClass(), "encodedSourceStart", 0);
        setIntField(term704089, term704089.getClass(), "encodedSourceEnd", 0);
        setField(term704089, term704089.getClass(), "sourceName", null);
        setIntField(term704089, term704089.getClass(), "baseLineno", 0);
        setIntField(term704089, term704089.getClass(), "endLineno", 0);
        setField(term704089, term704089.getClass(), "functions", null);
        setField(term704089, term704089.getClass(), "regexps", null);
        setField(term704089, term704089.getClass(), "itsVariables", null);
        setField(term704089, term704089.getClass(), "itsConst", null);
        setField(term704089, term704089.getClass(), "itsVariableNames", null);
        setIntField(term704089, term704089.getClass(), "varStart", 0);
        setField(term704089, term704089.getClass(), "compilerData", null);
        setIntField(term704089, term704089.getClass(), "type", 0);
        setField(term704096, term704096.getClass(), "functionName", null);
        setBooleanField(term704096, term704096.getClass(), "itsNeedsActivation", false);
        setIntField(term704096, term704096.getClass(), "itsFunctionType", 0);
        setBooleanField(term704096, term704096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704096, term704096.getClass(), "encodedSourceStart", 0);
        setIntField(term704096, term704096.getClass(), "encodedSourceEnd", 0);
        setField(term704096, term704096.getClass(), "sourceName", null);
        setIntField(term704096, term704096.getClass(), "baseLineno", 0);
        setIntField(term704096, term704096.getClass(), "endLineno", 0);
        setField(term704096, term704096.getClass(), "functions", null);
        setField(term704096, term704096.getClass(), "regexps", null);
        setField(term704096, term704096.getClass(), "itsVariables", null);
        setField(term704096, term704096.getClass(), "itsConst", null);
        setField(term704096, term704096.getClass(), "itsVariableNames", null);
        setIntField(term704096, term704096.getClass(), "varStart", 0);
        setField(term704096, term704096.getClass(), "compilerData", null);
        setIntField(term704096, term704096.getClass(), "type", 44);
        setField(term704096, term704096.getClass(), "next", null);
        setField(term704096, term704096.getClass(), "first", null);
        setField(term704096, term704096.getClass(), "last", null);
        setField(term704096, term704096.getClass(), "propListHead", null);
        setIntField(term704096, term704096.getClass(), "sourcePosition", 0);
        setField(term704096, term704096.getClass(), "jsType", null);
        setField(term704096, term704096.getClass(), "parent", null);
        setField(term704089, term704089.getClass(), "next", term704096);
        setField(term704089, term704089.getClass(), "first", null);
        setField(term704089, term704089.getClass(), "last", null);
        setField(term704089, term704089.getClass(), "propListHead", null);
        setIntField(term704089, term704089.getClass(), "sourcePosition", 0);
        setField(term704089, term704089.getClass(), "jsType", null);
        setField(term704089, term704089.getClass(), "parent", null);
        setField(term704086, term704086.getClass(), "first", term704089);
        setField(term704086, term704086.getClass(), "last", null);
        setField(term704086, term704086.getClass(), "propListHead", null);
        setIntField(term704086, term704086.getClass(), "sourcePosition", 0);
        setField(term704086, term704086.getClass(), "jsType", null);
        setIntField(term704109, term704109.getClass(), "type", 0);
        setField(term704109, term704109.getClass(), "next", null);
        setField(term704109, term704109.getClass(), "first", null);
        setField(term704109, term704109.getClass(), "last", null);
        setField(term704109, term704109.getClass(), "propListHead", null);
        setIntField(term704109, term704109.getClass(), "sourcePosition", 0);
        setField(term704109, term704109.getClass(), "jsType", null);
        setField(term704109, term704109.getClass(), "parent", null);
        setField(term704086, term704086.getClass(), "parent", term704109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term703428;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term703336, args);
        assertTrue(recursiveEquals(term703336, term704190));
        assertTrue(recursiveEquals(term703428, term704191));
        assertTrue(recursiveEquals(retValue, term704086));
    }

};


