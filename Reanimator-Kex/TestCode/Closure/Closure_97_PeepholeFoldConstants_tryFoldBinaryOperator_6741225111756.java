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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688975;
     Object term689067;
     Object term689285;
     Object term689286;
     Object term689238;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688975 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term689067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term689153 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term689153, term689153.getClass(), "next", term689223);
        setIntField(term689153, term689153.getClass(), "type", 39);
        setField(term689067, term689067.getClass(), "first", term689153);
        setIntField(term689067, term689067.getClass(), "type", 24);
        term689285 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term689285, term689285.getClass(), "currentTraversal", null);
        term689286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term689287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term689286, term689286.getClass(), "number", 0.0);
        setIntField(term689286, term689286.getClass(), "type", 24);
        setField(term689286, term689286.getClass(), "next", null);
        setField(term689287, term689287.getClass(), "functionName", null);
        setBooleanField(term689287, term689287.getClass(), "itsNeedsActivation", false);
        setIntField(term689287, term689287.getClass(), "itsFunctionType", 0);
        setBooleanField(term689287, term689287.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term689287, term689287.getClass(), "encodedSourceStart", 0);
        setIntField(term689287, term689287.getClass(), "encodedSourceEnd", 0);
        setField(term689287, term689287.getClass(), "sourceName", null);
        setIntField(term689287, term689287.getClass(), "baseLineno", 0);
        setIntField(term689287, term689287.getClass(), "endLineno", 0);
        setField(term689287, term689287.getClass(), "functions", null);
        setField(term689287, term689287.getClass(), "regexps", null);
        setField(term689287, term689287.getClass(), "itsVariables", null);
        setField(term689287, term689287.getClass(), "itsConst", null);
        setField(term689287, term689287.getClass(), "itsVariableNames", null);
        setIntField(term689287, term689287.getClass(), "varStart", 0);
        setField(term689287, term689287.getClass(), "compilerData", null);
        setIntField(term689287, term689287.getClass(), "type", 39);
        setIntField(term689288, term689288.getClass(), "type", 0);
        setField(term689288, term689288.getClass(), "next", null);
        setField(term689288, term689288.getClass(), "first", null);
        setField(term689288, term689288.getClass(), "last", null);
        setField(term689288, term689288.getClass(), "propListHead", null);
        setIntField(term689288, term689288.getClass(), "sourcePosition", 0);
        setField(term689288, term689288.getClass(), "jsType", null);
        setField(term689288, term689288.getClass(), "parent", null);
        setField(term689287, term689287.getClass(), "next", term689288);
        setField(term689287, term689287.getClass(), "first", null);
        setField(term689287, term689287.getClass(), "last", null);
        setField(term689287, term689287.getClass(), "propListHead", null);
        setIntField(term689287, term689287.getClass(), "sourcePosition", 0);
        setField(term689287, term689287.getClass(), "jsType", null);
        setField(term689287, term689287.getClass(), "parent", null);
        setField(term689286, term689286.getClass(), "first", term689287);
        setField(term689286, term689286.getClass(), "last", null);
        setField(term689286, term689286.getClass(), "propListHead", null);
        setIntField(term689286, term689286.getClass(), "sourcePosition", 0);
        setField(term689286, term689286.getClass(), "jsType", null);
        setField(term689286, term689286.getClass(), "parent", null);
        term689238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term689241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term689238, term689238.getClass(), "number", 0.0);
        setIntField(term689238, term689238.getClass(), "type", 24);
        setField(term689238, term689238.getClass(), "next", null);
        setField(term689241, term689241.getClass(), "functionName", null);
        setBooleanField(term689241, term689241.getClass(), "itsNeedsActivation", false);
        setIntField(term689241, term689241.getClass(), "itsFunctionType", 0);
        setBooleanField(term689241, term689241.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term689241, term689241.getClass(), "encodedSourceStart", 0);
        setIntField(term689241, term689241.getClass(), "encodedSourceEnd", 0);
        setField(term689241, term689241.getClass(), "sourceName", null);
        setIntField(term689241, term689241.getClass(), "baseLineno", 0);
        setIntField(term689241, term689241.getClass(), "endLineno", 0);
        setField(term689241, term689241.getClass(), "functions", null);
        setField(term689241, term689241.getClass(), "regexps", null);
        setField(term689241, term689241.getClass(), "itsVariables", null);
        setField(term689241, term689241.getClass(), "itsConst", null);
        setField(term689241, term689241.getClass(), "itsVariableNames", null);
        setIntField(term689241, term689241.getClass(), "varStart", 0);
        setField(term689241, term689241.getClass(), "compilerData", null);
        setIntField(term689241, term689241.getClass(), "type", 39);
        setIntField(term689251, term689251.getClass(), "type", 0);
        setField(term689251, term689251.getClass(), "next", null);
        setField(term689251, term689251.getClass(), "first", null);
        setField(term689251, term689251.getClass(), "last", null);
        setField(term689251, term689251.getClass(), "propListHead", null);
        setIntField(term689251, term689251.getClass(), "sourcePosition", 0);
        setField(term689251, term689251.getClass(), "jsType", null);
        setField(term689251, term689251.getClass(), "parent", null);
        setField(term689241, term689241.getClass(), "next", term689251);
        setField(term689241, term689241.getClass(), "first", null);
        setField(term689241, term689241.getClass(), "last", null);
        setField(term689241, term689241.getClass(), "propListHead", null);
        setIntField(term689241, term689241.getClass(), "sourcePosition", 0);
        setField(term689241, term689241.getClass(), "jsType", null);
        setField(term689241, term689241.getClass(), "parent", null);
        setField(term689238, term689238.getClass(), "first", term689241);
        setField(term689238, term689238.getClass(), "last", null);
        setField(term689238, term689238.getClass(), "propListHead", null);
        setIntField(term689238, term689238.getClass(), "sourcePosition", 0);
        setField(term689238, term689238.getClass(), "jsType", null);
        setField(term689238, term689238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term689067;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term688975, args);
        assertTrue(recursiveEquals(term688975, term689285));
        assertTrue(recursiveEquals(term689067, term689286));
        assertTrue(recursiveEquals(retValue, term689238));
    }

};


