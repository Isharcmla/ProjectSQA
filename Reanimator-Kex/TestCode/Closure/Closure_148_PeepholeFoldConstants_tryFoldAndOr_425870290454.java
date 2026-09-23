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

public class PeepholeFoldConstants_tryFoldAndOr_425870290454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93400;
     Object term93486;
     Object term93578;
     Object term93670;
     Object term93795;
     Object term93796;
     Object term93797;
     Object term93798;
     Object term93748;

    public PeepholeFoldConstants_tryFoldAndOr_425870290454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term93486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93486, term93486.getClass(), "parent", null);
        setIntField(term93486, term93486.getClass(), "type", 0);
        term93578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93578, term93578.getClass(), "type", 0);
        term93670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term93795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93795, term93795.getClass(), "currentTraversal", null);
        term93796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93796, term93796.getClass(), "functionName", null);
        setBooleanField(term93796, term93796.getClass(), "itsNeedsActivation", false);
        setIntField(term93796, term93796.getClass(), "itsFunctionType", 0);
        setBooleanField(term93796, term93796.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93796, term93796.getClass(), "encodedSourceStart", 0);
        setIntField(term93796, term93796.getClass(), "encodedSourceEnd", 0);
        setField(term93796, term93796.getClass(), "sourceName", null);
        setIntField(term93796, term93796.getClass(), "baseLineno", 0);
        setIntField(term93796, term93796.getClass(), "endLineno", 0);
        setField(term93796, term93796.getClass(), "functions", null);
        setField(term93796, term93796.getClass(), "regexps", null);
        setField(term93796, term93796.getClass(), "itsVariables", null);
        setField(term93796, term93796.getClass(), "itsConst", null);
        setField(term93796, term93796.getClass(), "itsVariableNames", null);
        setIntField(term93796, term93796.getClass(), "varStart", 0);
        setField(term93796, term93796.getClass(), "compilerData", null);
        setIntField(term93796, term93796.getClass(), "type", 0);
        setField(term93796, term93796.getClass(), "next", null);
        setField(term93796, term93796.getClass(), "first", null);
        setField(term93796, term93796.getClass(), "last", null);
        setField(term93796, term93796.getClass(), "propListHead", null);
        setIntField(term93796, term93796.getClass(), "sourcePosition", 0);
        setField(term93796, term93796.getClass(), "jsType", null);
        setField(term93796, term93796.getClass(), "parent", null);
        term93797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term93797, term93797.getClass(), "number", 0.0);
        setIntField(term93797, term93797.getClass(), "type", 0);
        setField(term93797, term93797.getClass(), "next", null);
        setField(term93797, term93797.getClass(), "first", null);
        setField(term93797, term93797.getClass(), "last", null);
        setField(term93797, term93797.getClass(), "propListHead", null);
        setIntField(term93797, term93797.getClass(), "sourcePosition", 0);
        setField(term93797, term93797.getClass(), "jsType", null);
        setField(term93797, term93797.getClass(), "parent", null);
        term93798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term93798, term93798.getClass(), "str", null);
        setIntField(term93798, term93798.getClass(), "type", 0);
        setField(term93798, term93798.getClass(), "next", null);
        setField(term93798, term93798.getClass(), "first", null);
        setField(term93798, term93798.getClass(), "last", null);
        setField(term93798, term93798.getClass(), "propListHead", null);
        setIntField(term93798, term93798.getClass(), "sourcePosition", 0);
        setField(term93798, term93798.getClass(), "jsType", null);
        setField(term93798, term93798.getClass(), "parent", null);
        term93748 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93748, term93748.getClass(), "functionName", null);
        setBooleanField(term93748, term93748.getClass(), "itsNeedsActivation", false);
        setIntField(term93748, term93748.getClass(), "itsFunctionType", 0);
        setBooleanField(term93748, term93748.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93748, term93748.getClass(), "encodedSourceStart", 0);
        setIntField(term93748, term93748.getClass(), "encodedSourceEnd", 0);
        setField(term93748, term93748.getClass(), "sourceName", null);
        setIntField(term93748, term93748.getClass(), "baseLineno", 0);
        setIntField(term93748, term93748.getClass(), "endLineno", 0);
        setField(term93748, term93748.getClass(), "functions", null);
        setField(term93748, term93748.getClass(), "regexps", null);
        setField(term93748, term93748.getClass(), "itsVariables", null);
        setField(term93748, term93748.getClass(), "itsConst", null);
        setField(term93748, term93748.getClass(), "itsVariableNames", null);
        setIntField(term93748, term93748.getClass(), "varStart", 0);
        setField(term93748, term93748.getClass(), "compilerData", null);
        setIntField(term93748, term93748.getClass(), "type", 0);
        setField(term93748, term93748.getClass(), "next", null);
        setField(term93748, term93748.getClass(), "first", null);
        setField(term93748, term93748.getClass(), "last", null);
        setField(term93748, term93748.getClass(), "propListHead", null);
        setIntField(term93748, term93748.getClass(), "sourcePosition", 0);
        setField(term93748, term93748.getClass(), "jsType", null);
        setField(term93748, term93748.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term93486;
        args[1] = term93578;
        args[2] = term93670;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term93400, args);
        assertTrue(recursiveEquals(term93400, term93795));
        assertTrue(recursiveEquals(term93486, term93796));
        assertTrue(recursiveEquals(term93578, term93797));
        assertTrue(recursiveEquals(term93670, term93798));
        assertTrue(recursiveEquals(retValue, term93748));
    }

};


