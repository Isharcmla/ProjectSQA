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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606778;
     Object term3606864;
     Object term3608251;
     Object term3608252;
     Object term3608079;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3606778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3606864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3606956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3607048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3607178 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3606864, term3606864.getClass(), "type", 37);
        setIntField(term3606956, term3606956.getClass(), "type", 35);
        setField(term3607048, term3607048.getClass(), "next", term3607048);
        setIntField(term3607048, term3607048.getClass(), "type", 40);
        setField(term3607048, term3607048.getClass(), "str", "substr");
        setField(term3606956, term3606956.getClass(), "first", term3607048);
        setIntField(term3607178, term3607178.getClass(), "type", 44);
        setField(term3606956, term3606956.getClass(), "next", term3607178);
        setField(term3606864, term3606864.getClass(), "first", term3606956);
        term3608251 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3608251, term3608251.getClass(), "currentTraversal", null);
        term3608252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3608253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3608252, term3608252.getClass(), "functionName", null);
        setBooleanField(term3608252, term3608252.getClass(), "itsNeedsActivation", false);
        setIntField(term3608252, term3608252.getClass(), "itsFunctionType", 0);
        setBooleanField(term3608252, term3608252.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3608252, term3608252.getClass(), "encodedSourceStart", 0);
        setIntField(term3608252, term3608252.getClass(), "encodedSourceEnd", 0);
        setField(term3608252, term3608252.getClass(), "sourceName", null);
        setIntField(term3608252, term3608252.getClass(), "baseLineno", 0);
        setIntField(term3608252, term3608252.getClass(), "endLineno", 0);
        setField(term3608252, term3608252.getClass(), "functions", null);
        setField(term3608252, term3608252.getClass(), "regexps", null);
        setField(term3608252, term3608252.getClass(), "itsVariables", null);
        setField(term3608252, term3608252.getClass(), "itsConst", null);
        setField(term3608252, term3608252.getClass(), "itsVariableNames", null);
        setIntField(term3608252, term3608252.getClass(), "varStart", 0);
        setField(term3608252, term3608252.getClass(), "compilerData", null);
        setIntField(term3608252, term3608252.getClass(), "type", 37);
        setField(term3608252, term3608252.getClass(), "next", null);
        setField(term3608253, term3608253.getClass(), "str", null);
        setIntField(term3608253, term3608253.getClass(), "type", 35);
        setField(term3608254, term3608254.getClass(), "str", null);
        setIntField(term3608254, term3608254.getClass(), "type", 44);
        setField(term3608254, term3608254.getClass(), "next", null);
        setField(term3608254, term3608254.getClass(), "first", null);
        setField(term3608254, term3608254.getClass(), "last", null);
        setField(term3608254, term3608254.getClass(), "propListHead", null);
        setIntField(term3608254, term3608254.getClass(), "sourcePosition", 0);
        setField(term3608254, term3608254.getClass(), "jsType", null);
        setField(term3608254, term3608254.getClass(), "parent", null);
        setField(term3608253, term3608253.getClass(), "next", term3608254);
        setField(term3608255, term3608255.getClass(), "str", "substr");
        setIntField(term3608255, term3608255.getClass(), "type", 40);
        setField(term3608255, term3608255.getClass(), "next", term3608255);
        setField(term3608255, term3608255.getClass(), "first", null);
        setField(term3608255, term3608255.getClass(), "last", null);
        setField(term3608255, term3608255.getClass(), "propListHead", null);
        setIntField(term3608255, term3608255.getClass(), "sourcePosition", 0);
        setField(term3608255, term3608255.getClass(), "jsType", null);
        setField(term3608255, term3608255.getClass(), "parent", null);
        setField(term3608253, term3608253.getClass(), "first", term3608255);
        setField(term3608253, term3608253.getClass(), "last", null);
        setField(term3608253, term3608253.getClass(), "propListHead", null);
        setIntField(term3608253, term3608253.getClass(), "sourcePosition", 0);
        setField(term3608253, term3608253.getClass(), "jsType", null);
        setField(term3608253, term3608253.getClass(), "parent", null);
        setField(term3608252, term3608252.getClass(), "first", term3608253);
        setField(term3608252, term3608252.getClass(), "last", null);
        setField(term3608252, term3608252.getClass(), "propListHead", null);
        setIntField(term3608252, term3608252.getClass(), "sourcePosition", 0);
        setField(term3608252, term3608252.getClass(), "jsType", null);
        setField(term3608252, term3608252.getClass(), "parent", null);
        term3608079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3608089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3608079, term3608079.getClass(), "functionName", null);
        setBooleanField(term3608079, term3608079.getClass(), "itsNeedsActivation", false);
        setIntField(term3608079, term3608079.getClass(), "itsFunctionType", 0);
        setBooleanField(term3608079, term3608079.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3608079, term3608079.getClass(), "encodedSourceStart", 0);
        setIntField(term3608079, term3608079.getClass(), "encodedSourceEnd", 0);
        setField(term3608079, term3608079.getClass(), "sourceName", null);
        setIntField(term3608079, term3608079.getClass(), "baseLineno", 0);
        setIntField(term3608079, term3608079.getClass(), "endLineno", 0);
        setField(term3608079, term3608079.getClass(), "functions", null);
        setField(term3608079, term3608079.getClass(), "regexps", null);
        setField(term3608079, term3608079.getClass(), "itsVariables", null);
        setField(term3608079, term3608079.getClass(), "itsConst", null);
        setField(term3608079, term3608079.getClass(), "itsVariableNames", null);
        setIntField(term3608079, term3608079.getClass(), "varStart", 0);
        setField(term3608079, term3608079.getClass(), "compilerData", null);
        setIntField(term3608079, term3608079.getClass(), "type", 37);
        setField(term3608079, term3608079.getClass(), "next", null);
        setField(term3608089, term3608089.getClass(), "str", null);
        setIntField(term3608089, term3608089.getClass(), "type", 35);
        setField(term3608091, term3608091.getClass(), "str", null);
        setIntField(term3608091, term3608091.getClass(), "type", 44);
        setField(term3608091, term3608091.getClass(), "next", null);
        setField(term3608091, term3608091.getClass(), "first", null);
        setField(term3608091, term3608091.getClass(), "last", null);
        setField(term3608091, term3608091.getClass(), "propListHead", null);
        setIntField(term3608091, term3608091.getClass(), "sourcePosition", 0);
        setField(term3608091, term3608091.getClass(), "jsType", null);
        setField(term3608091, term3608091.getClass(), "parent", null);
        setField(term3608089, term3608089.getClass(), "next", term3608091);
        setField(term3608094, term3608094.getClass(), "str", "substr");
        setIntField(term3608094, term3608094.getClass(), "type", 40);
        setField(term3608094, term3608094.getClass(), "next", term3608094);
        setField(term3608094, term3608094.getClass(), "first", null);
        setField(term3608094, term3608094.getClass(), "last", null);
        setField(term3608094, term3608094.getClass(), "propListHead", null);
        setIntField(term3608094, term3608094.getClass(), "sourcePosition", 0);
        setField(term3608094, term3608094.getClass(), "jsType", null);
        setField(term3608094, term3608094.getClass(), "parent", null);
        setField(term3608089, term3608089.getClass(), "first", term3608094);
        setField(term3608089, term3608089.getClass(), "last", null);
        setField(term3608089, term3608089.getClass(), "propListHead", null);
        setIntField(term3608089, term3608089.getClass(), "sourcePosition", 0);
        setField(term3608089, term3608089.getClass(), "jsType", null);
        setField(term3608089, term3608089.getClass(), "parent", null);
        setField(term3608079, term3608079.getClass(), "first", term3608089);
        setField(term3608079, term3608079.getClass(), "last", null);
        setField(term3608079, term3608079.getClass(), "propListHead", null);
        setIntField(term3608079, term3608079.getClass(), "sourcePosition", 0);
        setField(term3608079, term3608079.getClass(), "jsType", null);
        setField(term3608079, term3608079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3606864;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3606778, args);
        assertTrue(recursiveEquals(term3606778, term3608251));
        assertTrue(recursiveEquals(term3606864, term3608252));
        assertTrue(recursiveEquals(retValue, term3608079));
    }

};


