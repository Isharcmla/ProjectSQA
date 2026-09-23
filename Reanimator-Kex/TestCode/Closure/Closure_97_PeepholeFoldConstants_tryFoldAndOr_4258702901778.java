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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694509;
     Object term694595;
     Object term694687;
     Object term694779;
     Object term695236;
     Object term695237;
     Object term695238;
     Object term695239;
     Object term695188;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term694595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term694595, term694595.getClass(), "parent", null);
        setIntField(term694595, term694595.getClass(), "type", 0);
        term694687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term694687, term694687.getClass(), "type", 0);
        term694779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term695236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term695236, term695236.getClass(), "currentTraversal", null);
        term695237 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term695237, term695237.getClass(), "functionName", null);
        setBooleanField(term695237, term695237.getClass(), "itsNeedsActivation", false);
        setIntField(term695237, term695237.getClass(), "itsFunctionType", 0);
        setBooleanField(term695237, term695237.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term695237, term695237.getClass(), "encodedSourceStart", 0);
        setIntField(term695237, term695237.getClass(), "encodedSourceEnd", 0);
        setField(term695237, term695237.getClass(), "sourceName", null);
        setIntField(term695237, term695237.getClass(), "baseLineno", 0);
        setIntField(term695237, term695237.getClass(), "endLineno", 0);
        setField(term695237, term695237.getClass(), "functions", null);
        setField(term695237, term695237.getClass(), "regexps", null);
        setField(term695237, term695237.getClass(), "itsVariables", null);
        setField(term695237, term695237.getClass(), "itsConst", null);
        setField(term695237, term695237.getClass(), "itsVariableNames", null);
        setIntField(term695237, term695237.getClass(), "varStart", 0);
        setField(term695237, term695237.getClass(), "compilerData", null);
        setIntField(term695237, term695237.getClass(), "type", 0);
        setField(term695237, term695237.getClass(), "next", null);
        setField(term695237, term695237.getClass(), "first", null);
        setField(term695237, term695237.getClass(), "last", null);
        setField(term695237, term695237.getClass(), "propListHead", null);
        setIntField(term695237, term695237.getClass(), "sourcePosition", 0);
        setField(term695237, term695237.getClass(), "jsType", null);
        setField(term695237, term695237.getClass(), "parent", null);
        term695238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term695238, term695238.getClass(), "number", 0.0);
        setIntField(term695238, term695238.getClass(), "type", 0);
        setField(term695238, term695238.getClass(), "next", null);
        setField(term695238, term695238.getClass(), "first", null);
        setField(term695238, term695238.getClass(), "last", null);
        setField(term695238, term695238.getClass(), "propListHead", null);
        setIntField(term695238, term695238.getClass(), "sourcePosition", 0);
        setField(term695238, term695238.getClass(), "jsType", null);
        setField(term695238, term695238.getClass(), "parent", null);
        term695239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term695239, term695239.getClass(), "number", 0.0);
        setIntField(term695239, term695239.getClass(), "type", 0);
        setField(term695239, term695239.getClass(), "next", null);
        setField(term695239, term695239.getClass(), "first", null);
        setField(term695239, term695239.getClass(), "last", null);
        setField(term695239, term695239.getClass(), "propListHead", null);
        setIntField(term695239, term695239.getClass(), "sourcePosition", 0);
        setField(term695239, term695239.getClass(), "jsType", null);
        setField(term695239, term695239.getClass(), "parent", null);
        term695188 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term695188, term695188.getClass(), "functionName", null);
        setBooleanField(term695188, term695188.getClass(), "itsNeedsActivation", false);
        setIntField(term695188, term695188.getClass(), "itsFunctionType", 0);
        setBooleanField(term695188, term695188.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term695188, term695188.getClass(), "encodedSourceStart", 0);
        setIntField(term695188, term695188.getClass(), "encodedSourceEnd", 0);
        setField(term695188, term695188.getClass(), "sourceName", null);
        setIntField(term695188, term695188.getClass(), "baseLineno", 0);
        setIntField(term695188, term695188.getClass(), "endLineno", 0);
        setField(term695188, term695188.getClass(), "functions", null);
        setField(term695188, term695188.getClass(), "regexps", null);
        setField(term695188, term695188.getClass(), "itsVariables", null);
        setField(term695188, term695188.getClass(), "itsConst", null);
        setField(term695188, term695188.getClass(), "itsVariableNames", null);
        setIntField(term695188, term695188.getClass(), "varStart", 0);
        setField(term695188, term695188.getClass(), "compilerData", null);
        setIntField(term695188, term695188.getClass(), "type", 0);
        setField(term695188, term695188.getClass(), "next", null);
        setField(term695188, term695188.getClass(), "first", null);
        setField(term695188, term695188.getClass(), "last", null);
        setField(term695188, term695188.getClass(), "propListHead", null);
        setIntField(term695188, term695188.getClass(), "sourcePosition", 0);
        setField(term695188, term695188.getClass(), "jsType", null);
        setField(term695188, term695188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term694595;
        args[1] = term694687;
        args[2] = term694779;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term694509, args);
        assertTrue(recursiveEquals(term694509, term695236));
        assertTrue(recursiveEquals(term694595, term695237));
        assertTrue(recursiveEquals(term694687, term695238));
        assertTrue(recursiveEquals(term694779, term695239));
        assertTrue(recursiveEquals(retValue, term695188));
    }

};


