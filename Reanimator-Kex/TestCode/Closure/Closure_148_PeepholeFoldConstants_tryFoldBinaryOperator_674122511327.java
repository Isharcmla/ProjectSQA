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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64563;
     Object term64655;
     Object term65207;
     Object term65208;
     Object term65137;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64563 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term64655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64833 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term64747, term64747.getClass(), "next", term64833);
        setIntField(term64747, term64747.getClass(), "type", 16);
        setField(term64655, term64655.getClass(), "first", term64747);
        setIntField(term64655, term64655.getClass(), "type", 16);
        term65207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term65207, term65207.getClass(), "currentTraversal", null);
        term65208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term65208, term65208.getClass(), "number", 0.0);
        setIntField(term65208, term65208.getClass(), "type", 16);
        setField(term65208, term65208.getClass(), "next", null);
        setDoubleField(term65209, term65209.getClass(), "number", 0.0);
        setIntField(term65209, term65209.getClass(), "type", 16);
        setField(term65210, term65210.getClass(), "functionName", null);
        setBooleanField(term65210, term65210.getClass(), "itsNeedsActivation", false);
        setIntField(term65210, term65210.getClass(), "itsFunctionType", 0);
        setBooleanField(term65210, term65210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term65210, term65210.getClass(), "encodedSourceStart", 0);
        setIntField(term65210, term65210.getClass(), "encodedSourceEnd", 0);
        setField(term65210, term65210.getClass(), "sourceName", null);
        setIntField(term65210, term65210.getClass(), "baseLineno", 0);
        setIntField(term65210, term65210.getClass(), "endLineno", 0);
        setField(term65210, term65210.getClass(), "functions", null);
        setField(term65210, term65210.getClass(), "regexps", null);
        setField(term65210, term65210.getClass(), "itsVariables", null);
        setField(term65210, term65210.getClass(), "itsConst", null);
        setField(term65210, term65210.getClass(), "itsVariableNames", null);
        setIntField(term65210, term65210.getClass(), "varStart", 0);
        setField(term65210, term65210.getClass(), "compilerData", null);
        setIntField(term65210, term65210.getClass(), "type", 0);
        setField(term65210, term65210.getClass(), "next", null);
        setField(term65210, term65210.getClass(), "first", null);
        setField(term65210, term65210.getClass(), "last", null);
        setField(term65210, term65210.getClass(), "propListHead", null);
        setIntField(term65210, term65210.getClass(), "sourcePosition", 0);
        setField(term65210, term65210.getClass(), "jsType", null);
        setField(term65210, term65210.getClass(), "parent", null);
        setField(term65209, term65209.getClass(), "next", term65210);
        setField(term65209, term65209.getClass(), "first", null);
        setField(term65209, term65209.getClass(), "last", null);
        setField(term65209, term65209.getClass(), "propListHead", null);
        setIntField(term65209, term65209.getClass(), "sourcePosition", 0);
        setField(term65209, term65209.getClass(), "jsType", null);
        setField(term65209, term65209.getClass(), "parent", null);
        setField(term65208, term65208.getClass(), "first", term65209);
        setField(term65208, term65208.getClass(), "last", null);
        setField(term65208, term65208.getClass(), "propListHead", null);
        setIntField(term65208, term65208.getClass(), "sourcePosition", 0);
        setField(term65208, term65208.getClass(), "jsType", null);
        setField(term65208, term65208.getClass(), "parent", null);
        term65137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65143 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term65137, term65137.getClass(), "number", 0.0);
        setIntField(term65137, term65137.getClass(), "type", 16);
        setField(term65137, term65137.getClass(), "next", null);
        setDoubleField(term65140, term65140.getClass(), "number", 0.0);
        setIntField(term65140, term65140.getClass(), "type", 16);
        setField(term65143, term65143.getClass(), "functionName", null);
        setBooleanField(term65143, term65143.getClass(), "itsNeedsActivation", false);
        setIntField(term65143, term65143.getClass(), "itsFunctionType", 0);
        setBooleanField(term65143, term65143.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term65143, term65143.getClass(), "encodedSourceStart", 0);
        setIntField(term65143, term65143.getClass(), "encodedSourceEnd", 0);
        setField(term65143, term65143.getClass(), "sourceName", null);
        setIntField(term65143, term65143.getClass(), "baseLineno", 0);
        setIntField(term65143, term65143.getClass(), "endLineno", 0);
        setField(term65143, term65143.getClass(), "functions", null);
        setField(term65143, term65143.getClass(), "regexps", null);
        setField(term65143, term65143.getClass(), "itsVariables", null);
        setField(term65143, term65143.getClass(), "itsConst", null);
        setField(term65143, term65143.getClass(), "itsVariableNames", null);
        setIntField(term65143, term65143.getClass(), "varStart", 0);
        setField(term65143, term65143.getClass(), "compilerData", null);
        setIntField(term65143, term65143.getClass(), "type", 0);
        setField(term65143, term65143.getClass(), "next", null);
        setField(term65143, term65143.getClass(), "first", null);
        setField(term65143, term65143.getClass(), "last", null);
        setField(term65143, term65143.getClass(), "propListHead", null);
        setIntField(term65143, term65143.getClass(), "sourcePosition", 0);
        setField(term65143, term65143.getClass(), "jsType", null);
        setField(term65143, term65143.getClass(), "parent", null);
        setField(term65140, term65140.getClass(), "next", term65143);
        setField(term65140, term65140.getClass(), "first", null);
        setField(term65140, term65140.getClass(), "last", null);
        setField(term65140, term65140.getClass(), "propListHead", null);
        setIntField(term65140, term65140.getClass(), "sourcePosition", 0);
        setField(term65140, term65140.getClass(), "jsType", null);
        setField(term65140, term65140.getClass(), "parent", null);
        setField(term65137, term65137.getClass(), "first", term65140);
        setField(term65137, term65137.getClass(), "last", null);
        setField(term65137, term65137.getClass(), "propListHead", null);
        setIntField(term65137, term65137.getClass(), "sourcePosition", 0);
        setField(term65137, term65137.getClass(), "jsType", null);
        setField(term65137, term65137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term64655;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term64563, args);
        assertTrue(recursiveEquals(term64563, term65207));
        assertTrue(recursiveEquals(term64655, term65208));
        assertTrue(recursiveEquals(retValue, term65137));
    }

};


