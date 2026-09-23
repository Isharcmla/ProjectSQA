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

public class PeepholeFoldConstants_tryFoldAndOr_425870290260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49845;
     Object term49931;
     Object term50017;
     Object term50109;
     Object term50183;
     Object term50184;
     Object term50185;
     Object term50186;
     Object term50128;

    public PeepholeFoldConstants_tryFoldAndOr_425870290260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49845 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49931 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49931, term49931.getClass(), "parent", null);
        setIntField(term49931, term49931.getClass(), "type", 0);
        term50017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term50017, term50017.getClass(), "type", 0);
        term50109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term50183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50183, term50183.getClass(), "currentTraversal", null);
        term50184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50184, term50184.getClass(), "functionName", null);
        setBooleanField(term50184, term50184.getClass(), "itsNeedsActivation", false);
        setIntField(term50184, term50184.getClass(), "itsFunctionType", 0);
        setBooleanField(term50184, term50184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50184, term50184.getClass(), "encodedSourceStart", 0);
        setIntField(term50184, term50184.getClass(), "encodedSourceEnd", 0);
        setField(term50184, term50184.getClass(), "sourceName", null);
        setIntField(term50184, term50184.getClass(), "baseLineno", 0);
        setIntField(term50184, term50184.getClass(), "endLineno", 0);
        setField(term50184, term50184.getClass(), "functions", null);
        setField(term50184, term50184.getClass(), "regexps", null);
        setField(term50184, term50184.getClass(), "itsVariables", null);
        setField(term50184, term50184.getClass(), "itsConst", null);
        setField(term50184, term50184.getClass(), "itsVariableNames", null);
        setIntField(term50184, term50184.getClass(), "varStart", 0);
        setField(term50184, term50184.getClass(), "compilerData", null);
        setIntField(term50184, term50184.getClass(), "type", 0);
        setField(term50184, term50184.getClass(), "next", null);
        setField(term50184, term50184.getClass(), "first", null);
        setField(term50184, term50184.getClass(), "last", null);
        setField(term50184, term50184.getClass(), "propListHead", null);
        setIntField(term50184, term50184.getClass(), "sourcePosition", 0);
        setField(term50184, term50184.getClass(), "jsType", null);
        setField(term50184, term50184.getClass(), "parent", null);
        term50185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50185, term50185.getClass(), "functionName", null);
        setBooleanField(term50185, term50185.getClass(), "itsNeedsActivation", false);
        setIntField(term50185, term50185.getClass(), "itsFunctionType", 0);
        setBooleanField(term50185, term50185.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50185, term50185.getClass(), "encodedSourceStart", 0);
        setIntField(term50185, term50185.getClass(), "encodedSourceEnd", 0);
        setField(term50185, term50185.getClass(), "sourceName", null);
        setIntField(term50185, term50185.getClass(), "baseLineno", 0);
        setIntField(term50185, term50185.getClass(), "endLineno", 0);
        setField(term50185, term50185.getClass(), "functions", null);
        setField(term50185, term50185.getClass(), "regexps", null);
        setField(term50185, term50185.getClass(), "itsVariables", null);
        setField(term50185, term50185.getClass(), "itsConst", null);
        setField(term50185, term50185.getClass(), "itsVariableNames", null);
        setIntField(term50185, term50185.getClass(), "varStart", 0);
        setField(term50185, term50185.getClass(), "compilerData", null);
        setIntField(term50185, term50185.getClass(), "type", 0);
        setField(term50185, term50185.getClass(), "next", null);
        setField(term50185, term50185.getClass(), "first", null);
        setField(term50185, term50185.getClass(), "last", null);
        setField(term50185, term50185.getClass(), "propListHead", null);
        setIntField(term50185, term50185.getClass(), "sourcePosition", 0);
        setField(term50185, term50185.getClass(), "jsType", null);
        setField(term50185, term50185.getClass(), "parent", null);
        term50186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50186, term50186.getClass(), "number", 0.0);
        setIntField(term50186, term50186.getClass(), "type", 0);
        setField(term50186, term50186.getClass(), "next", null);
        setField(term50186, term50186.getClass(), "first", null);
        setField(term50186, term50186.getClass(), "last", null);
        setField(term50186, term50186.getClass(), "propListHead", null);
        setIntField(term50186, term50186.getClass(), "sourcePosition", 0);
        setField(term50186, term50186.getClass(), "jsType", null);
        setField(term50186, term50186.getClass(), "parent", null);
        term50128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50128, term50128.getClass(), "functionName", null);
        setBooleanField(term50128, term50128.getClass(), "itsNeedsActivation", false);
        setIntField(term50128, term50128.getClass(), "itsFunctionType", 0);
        setBooleanField(term50128, term50128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50128, term50128.getClass(), "encodedSourceStart", 0);
        setIntField(term50128, term50128.getClass(), "encodedSourceEnd", 0);
        setField(term50128, term50128.getClass(), "sourceName", null);
        setIntField(term50128, term50128.getClass(), "baseLineno", 0);
        setIntField(term50128, term50128.getClass(), "endLineno", 0);
        setField(term50128, term50128.getClass(), "functions", null);
        setField(term50128, term50128.getClass(), "regexps", null);
        setField(term50128, term50128.getClass(), "itsVariables", null);
        setField(term50128, term50128.getClass(), "itsConst", null);
        setField(term50128, term50128.getClass(), "itsVariableNames", null);
        setIntField(term50128, term50128.getClass(), "varStart", 0);
        setField(term50128, term50128.getClass(), "compilerData", null);
        setIntField(term50128, term50128.getClass(), "type", 0);
        setField(term50128, term50128.getClass(), "next", null);
        setField(term50128, term50128.getClass(), "first", null);
        setField(term50128, term50128.getClass(), "last", null);
        setField(term50128, term50128.getClass(), "propListHead", null);
        setIntField(term50128, term50128.getClass(), "sourcePosition", 0);
        setField(term50128, term50128.getClass(), "jsType", null);
        setField(term50128, term50128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term49931;
        args[1] = term50017;
        args[2] = term50109;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term49845, args);
        assertTrue(recursiveEquals(term49845, term50183));
        assertTrue(recursiveEquals(term49931, term50184));
        assertTrue(recursiveEquals(term50017, term50185));
        assertTrue(recursiveEquals(term50109, term50186));
        assertTrue(recursiveEquals(retValue, term50128));
    }

};


