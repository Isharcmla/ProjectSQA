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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933917;
     Object term934003;
     Object term934181;
     Object term934273;
     Object term934693;
     Object term934694;
     Object term934696;
     Object term934697;
     Object term934619;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term934003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term934089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term934089, term934089.getClass(), "type", 98);
        setField(term934003, term934003.getClass(), "parent", term934089);
        setIntField(term934003, term934003.getClass(), "type", 0);
        term934181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term934181, term934181.getClass(), "type", 0);
        term934273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term934273, term934273.getClass(), "type", 63);
        term934693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term934693, term934693.getClass(), "currentTraversal", null);
        term934694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term934695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term934694, term934694.getClass(), "functionName", null);
        setBooleanField(term934694, term934694.getClass(), "itsNeedsActivation", false);
        setIntField(term934694, term934694.getClass(), "itsFunctionType", 0);
        setBooleanField(term934694, term934694.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term934694, term934694.getClass(), "encodedSourceStart", 0);
        setIntField(term934694, term934694.getClass(), "encodedSourceEnd", 0);
        setField(term934694, term934694.getClass(), "sourceName", null);
        setIntField(term934694, term934694.getClass(), "baseLineno", 0);
        setIntField(term934694, term934694.getClass(), "endLineno", 0);
        setField(term934694, term934694.getClass(), "functions", null);
        setField(term934694, term934694.getClass(), "regexps", null);
        setField(term934694, term934694.getClass(), "itsVariables", null);
        setField(term934694, term934694.getClass(), "itsConst", null);
        setField(term934694, term934694.getClass(), "itsVariableNames", null);
        setIntField(term934694, term934694.getClass(), "varStart", 0);
        setField(term934694, term934694.getClass(), "compilerData", null);
        setIntField(term934694, term934694.getClass(), "type", 0);
        setField(term934694, term934694.getClass(), "next", null);
        setField(term934694, term934694.getClass(), "first", null);
        setField(term934694, term934694.getClass(), "last", null);
        setField(term934694, term934694.getClass(), "propListHead", null);
        setIntField(term934694, term934694.getClass(), "sourcePosition", 0);
        setField(term934694, term934694.getClass(), "jsType", null);
        setField(term934695, term934695.getClass(), "functionName", null);
        setBooleanField(term934695, term934695.getClass(), "itsNeedsActivation", false);
        setIntField(term934695, term934695.getClass(), "itsFunctionType", 0);
        setBooleanField(term934695, term934695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term934695, term934695.getClass(), "encodedSourceStart", 0);
        setIntField(term934695, term934695.getClass(), "encodedSourceEnd", 0);
        setField(term934695, term934695.getClass(), "sourceName", null);
        setIntField(term934695, term934695.getClass(), "baseLineno", 0);
        setIntField(term934695, term934695.getClass(), "endLineno", 0);
        setField(term934695, term934695.getClass(), "functions", null);
        setField(term934695, term934695.getClass(), "regexps", null);
        setField(term934695, term934695.getClass(), "itsVariables", null);
        setField(term934695, term934695.getClass(), "itsConst", null);
        setField(term934695, term934695.getClass(), "itsVariableNames", null);
        setIntField(term934695, term934695.getClass(), "varStart", 0);
        setField(term934695, term934695.getClass(), "compilerData", null);
        setIntField(term934695, term934695.getClass(), "type", 98);
        setField(term934695, term934695.getClass(), "next", null);
        setField(term934695, term934695.getClass(), "first", null);
        setField(term934695, term934695.getClass(), "last", null);
        setField(term934695, term934695.getClass(), "propListHead", null);
        setIntField(term934695, term934695.getClass(), "sourcePosition", 0);
        setField(term934695, term934695.getClass(), "jsType", null);
        setField(term934695, term934695.getClass(), "parent", null);
        setField(term934694, term934694.getClass(), "parent", term934695);
        term934696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term934696, term934696.getClass(), "number", 0.0);
        setIntField(term934696, term934696.getClass(), "type", 0);
        setField(term934696, term934696.getClass(), "next", null);
        setField(term934696, term934696.getClass(), "first", null);
        setField(term934696, term934696.getClass(), "last", null);
        setField(term934696, term934696.getClass(), "propListHead", null);
        setIntField(term934696, term934696.getClass(), "sourcePosition", 0);
        setField(term934696, term934696.getClass(), "jsType", null);
        setField(term934696, term934696.getClass(), "parent", null);
        term934697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term934697, term934697.getClass(), "number", 0.0);
        setIntField(term934697, term934697.getClass(), "type", 63);
        setField(term934697, term934697.getClass(), "next", null);
        setField(term934697, term934697.getClass(), "first", null);
        setField(term934697, term934697.getClass(), "last", null);
        setField(term934697, term934697.getClass(), "propListHead", null);
        setIntField(term934697, term934697.getClass(), "sourcePosition", 0);
        setField(term934697, term934697.getClass(), "jsType", null);
        setField(term934697, term934697.getClass(), "parent", null);
        term934619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term934630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term934619, term934619.getClass(), "functionName", null);
        setBooleanField(term934619, term934619.getClass(), "itsNeedsActivation", false);
        setIntField(term934619, term934619.getClass(), "itsFunctionType", 0);
        setBooleanField(term934619, term934619.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term934619, term934619.getClass(), "encodedSourceStart", 0);
        setIntField(term934619, term934619.getClass(), "encodedSourceEnd", 0);
        setField(term934619, term934619.getClass(), "sourceName", null);
        setIntField(term934619, term934619.getClass(), "baseLineno", 0);
        setIntField(term934619, term934619.getClass(), "endLineno", 0);
        setField(term934619, term934619.getClass(), "functions", null);
        setField(term934619, term934619.getClass(), "regexps", null);
        setField(term934619, term934619.getClass(), "itsVariables", null);
        setField(term934619, term934619.getClass(), "itsConst", null);
        setField(term934619, term934619.getClass(), "itsVariableNames", null);
        setIntField(term934619, term934619.getClass(), "varStart", 0);
        setField(term934619, term934619.getClass(), "compilerData", null);
        setIntField(term934619, term934619.getClass(), "type", 0);
        setField(term934619, term934619.getClass(), "next", null);
        setField(term934619, term934619.getClass(), "first", null);
        setField(term934619, term934619.getClass(), "last", null);
        setField(term934619, term934619.getClass(), "propListHead", null);
        setIntField(term934619, term934619.getClass(), "sourcePosition", 0);
        setField(term934619, term934619.getClass(), "jsType", null);
        setField(term934630, term934630.getClass(), "functionName", null);
        setBooleanField(term934630, term934630.getClass(), "itsNeedsActivation", false);
        setIntField(term934630, term934630.getClass(), "itsFunctionType", 0);
        setBooleanField(term934630, term934630.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term934630, term934630.getClass(), "encodedSourceStart", 0);
        setIntField(term934630, term934630.getClass(), "encodedSourceEnd", 0);
        setField(term934630, term934630.getClass(), "sourceName", null);
        setIntField(term934630, term934630.getClass(), "baseLineno", 0);
        setIntField(term934630, term934630.getClass(), "endLineno", 0);
        setField(term934630, term934630.getClass(), "functions", null);
        setField(term934630, term934630.getClass(), "regexps", null);
        setField(term934630, term934630.getClass(), "itsVariables", null);
        setField(term934630, term934630.getClass(), "itsConst", null);
        setField(term934630, term934630.getClass(), "itsVariableNames", null);
        setIntField(term934630, term934630.getClass(), "varStart", 0);
        setField(term934630, term934630.getClass(), "compilerData", null);
        setIntField(term934630, term934630.getClass(), "type", 98);
        setField(term934630, term934630.getClass(), "next", null);
        setField(term934630, term934630.getClass(), "first", null);
        setField(term934630, term934630.getClass(), "last", null);
        setField(term934630, term934630.getClass(), "propListHead", null);
        setIntField(term934630, term934630.getClass(), "sourcePosition", 0);
        setField(term934630, term934630.getClass(), "jsType", null);
        setField(term934630, term934630.getClass(), "parent", null);
        setField(term934619, term934619.getClass(), "parent", term934630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term934003;
        args[1] = term934181;
        args[2] = term934273;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term933917, args);
        assertTrue(recursiveEquals(term933917, term934693));
        assertTrue(recursiveEquals(term934003, term934694));
        assertTrue(recursiveEquals(term934181, term934696));
        assertTrue(recursiveEquals(term934273, term934697));
        assertTrue(recursiveEquals(retValue, term934619));
    }

};


