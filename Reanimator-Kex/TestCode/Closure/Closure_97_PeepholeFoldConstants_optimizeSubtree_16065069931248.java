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

public class PeepholeFoldConstants_optimizeSubtree_16065069931248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403907;
     Object term403993;
     Object term421202;
     Object term421203;
     Object term421093;

    public PeepholeFoldConstants_optimizeSubtree_16065069931248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403907 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term403993 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term404079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term404171 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term403993, term403993.getClass(), "type", 35);
        setField(term404079, term404079.getClass(), "next", term404171);
        setIntField(term404079, term404079.getClass(), "type", 63);
        setField(term403993, term403993.getClass(), "first", term404079);
        term421202 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421202, term421202.getClass(), "currentTraversal", null);
        term421203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term421203, term421203.getClass(), "functionName", null);
        setBooleanField(term421203, term421203.getClass(), "itsNeedsActivation", false);
        setIntField(term421203, term421203.getClass(), "itsFunctionType", 0);
        setBooleanField(term421203, term421203.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421203, term421203.getClass(), "encodedSourceStart", 0);
        setIntField(term421203, term421203.getClass(), "encodedSourceEnd", 0);
        setField(term421203, term421203.getClass(), "sourceName", null);
        setIntField(term421203, term421203.getClass(), "baseLineno", 0);
        setIntField(term421203, term421203.getClass(), "endLineno", 0);
        setField(term421203, term421203.getClass(), "functions", null);
        setField(term421203, term421203.getClass(), "regexps", null);
        setField(term421203, term421203.getClass(), "itsVariables", null);
        setField(term421203, term421203.getClass(), "itsConst", null);
        setField(term421203, term421203.getClass(), "itsVariableNames", null);
        setIntField(term421203, term421203.getClass(), "varStart", 0);
        setField(term421203, term421203.getClass(), "compilerData", null);
        setIntField(term421203, term421203.getClass(), "type", 35);
        setField(term421203, term421203.getClass(), "next", null);
        setField(term421204, term421204.getClass(), "functionName", null);
        setBooleanField(term421204, term421204.getClass(), "itsNeedsActivation", false);
        setIntField(term421204, term421204.getClass(), "itsFunctionType", 0);
        setBooleanField(term421204, term421204.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421204, term421204.getClass(), "encodedSourceStart", 0);
        setIntField(term421204, term421204.getClass(), "encodedSourceEnd", 0);
        setField(term421204, term421204.getClass(), "sourceName", null);
        setIntField(term421204, term421204.getClass(), "baseLineno", 0);
        setIntField(term421204, term421204.getClass(), "endLineno", 0);
        setField(term421204, term421204.getClass(), "functions", null);
        setField(term421204, term421204.getClass(), "regexps", null);
        setField(term421204, term421204.getClass(), "itsVariables", null);
        setField(term421204, term421204.getClass(), "itsConst", null);
        setField(term421204, term421204.getClass(), "itsVariableNames", null);
        setIntField(term421204, term421204.getClass(), "varStart", 0);
        setField(term421204, term421204.getClass(), "compilerData", null);
        setIntField(term421204, term421204.getClass(), "type", 63);
        setDoubleField(term421205, term421205.getClass(), "number", 0.0);
        setIntField(term421205, term421205.getClass(), "type", 0);
        setField(term421205, term421205.getClass(), "next", null);
        setField(term421205, term421205.getClass(), "first", null);
        setField(term421205, term421205.getClass(), "last", null);
        setField(term421205, term421205.getClass(), "propListHead", null);
        setIntField(term421205, term421205.getClass(), "sourcePosition", 0);
        setField(term421205, term421205.getClass(), "jsType", null);
        setField(term421205, term421205.getClass(), "parent", null);
        setField(term421204, term421204.getClass(), "next", term421205);
        setField(term421204, term421204.getClass(), "first", null);
        setField(term421204, term421204.getClass(), "last", null);
        setField(term421204, term421204.getClass(), "propListHead", null);
        setIntField(term421204, term421204.getClass(), "sourcePosition", 0);
        setField(term421204, term421204.getClass(), "jsType", null);
        setField(term421204, term421204.getClass(), "parent", null);
        setField(term421203, term421203.getClass(), "first", term421204);
        setField(term421203, term421203.getClass(), "last", null);
        setField(term421203, term421203.getClass(), "propListHead", null);
        setIntField(term421203, term421203.getClass(), "sourcePosition", 0);
        setField(term421203, term421203.getClass(), "jsType", null);
        setField(term421203, term421203.getClass(), "parent", null);
        term421093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term421093, term421093.getClass(), "functionName", null);
        setBooleanField(term421093, term421093.getClass(), "itsNeedsActivation", false);
        setIntField(term421093, term421093.getClass(), "itsFunctionType", 0);
        setBooleanField(term421093, term421093.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421093, term421093.getClass(), "encodedSourceStart", 0);
        setIntField(term421093, term421093.getClass(), "encodedSourceEnd", 0);
        setField(term421093, term421093.getClass(), "sourceName", null);
        setIntField(term421093, term421093.getClass(), "baseLineno", 0);
        setIntField(term421093, term421093.getClass(), "endLineno", 0);
        setField(term421093, term421093.getClass(), "functions", null);
        setField(term421093, term421093.getClass(), "regexps", null);
        setField(term421093, term421093.getClass(), "itsVariables", null);
        setField(term421093, term421093.getClass(), "itsConst", null);
        setField(term421093, term421093.getClass(), "itsVariableNames", null);
        setIntField(term421093, term421093.getClass(), "varStart", 0);
        setField(term421093, term421093.getClass(), "compilerData", null);
        setIntField(term421093, term421093.getClass(), "type", 35);
        setField(term421093, term421093.getClass(), "next", null);
        setField(term421103, term421103.getClass(), "functionName", null);
        setBooleanField(term421103, term421103.getClass(), "itsNeedsActivation", false);
        setIntField(term421103, term421103.getClass(), "itsFunctionType", 0);
        setBooleanField(term421103, term421103.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421103, term421103.getClass(), "encodedSourceStart", 0);
        setIntField(term421103, term421103.getClass(), "encodedSourceEnd", 0);
        setField(term421103, term421103.getClass(), "sourceName", null);
        setIntField(term421103, term421103.getClass(), "baseLineno", 0);
        setIntField(term421103, term421103.getClass(), "endLineno", 0);
        setField(term421103, term421103.getClass(), "functions", null);
        setField(term421103, term421103.getClass(), "regexps", null);
        setField(term421103, term421103.getClass(), "itsVariables", null);
        setField(term421103, term421103.getClass(), "itsConst", null);
        setField(term421103, term421103.getClass(), "itsVariableNames", null);
        setIntField(term421103, term421103.getClass(), "varStart", 0);
        setField(term421103, term421103.getClass(), "compilerData", null);
        setIntField(term421103, term421103.getClass(), "type", 63);
        setDoubleField(term421113, term421113.getClass(), "number", 0.0);
        setIntField(term421113, term421113.getClass(), "type", 0);
        setField(term421113, term421113.getClass(), "next", null);
        setField(term421113, term421113.getClass(), "first", null);
        setField(term421113, term421113.getClass(), "last", null);
        setField(term421113, term421113.getClass(), "propListHead", null);
        setIntField(term421113, term421113.getClass(), "sourcePosition", 0);
        setField(term421113, term421113.getClass(), "jsType", null);
        setField(term421113, term421113.getClass(), "parent", null);
        setField(term421103, term421103.getClass(), "next", term421113);
        setField(term421103, term421103.getClass(), "first", null);
        setField(term421103, term421103.getClass(), "last", null);
        setField(term421103, term421103.getClass(), "propListHead", null);
        setIntField(term421103, term421103.getClass(), "sourcePosition", 0);
        setField(term421103, term421103.getClass(), "jsType", null);
        setField(term421103, term421103.getClass(), "parent", null);
        setField(term421093, term421093.getClass(), "first", term421103);
        setField(term421093, term421093.getClass(), "last", null);
        setField(term421093, term421093.getClass(), "propListHead", null);
        setIntField(term421093, term421093.getClass(), "sourcePosition", 0);
        setField(term421093, term421093.getClass(), "jsType", null);
        setField(term421093, term421093.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term403993;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term403907, args);
        assertTrue(recursiveEquals(term403907, term421202));
        assertTrue(recursiveEquals(term403993, term421203));
        assertTrue(recursiveEquals(retValue, term421093));
    }

};


