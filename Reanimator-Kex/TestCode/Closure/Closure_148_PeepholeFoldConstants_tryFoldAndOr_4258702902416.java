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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673336;
     Object term673422;
     Object term673600;
     Object term673692;
     Object term673805;
     Object term673806;
     Object term673808;
     Object term673809;
     Object term673710;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term673422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term673508, term673508.getClass(), "type", 114);
        setField(term673422, term673422.getClass(), "parent", term673508);
        setIntField(term673422, term673422.getClass(), "type", 0);
        term673600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term673600, term673600.getClass(), "type", 104);
        term673692 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term673692, term673692.getClass(), "type", 63);
        term673805 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term673805, term673805.getClass(), "currentTraversal", null);
        term673806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673807 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term673806, term673806.getClass(), "functionName", null);
        setBooleanField(term673806, term673806.getClass(), "itsNeedsActivation", false);
        setIntField(term673806, term673806.getClass(), "itsFunctionType", 0);
        setBooleanField(term673806, term673806.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673806, term673806.getClass(), "encodedSourceStart", 0);
        setIntField(term673806, term673806.getClass(), "encodedSourceEnd", 0);
        setField(term673806, term673806.getClass(), "sourceName", null);
        setIntField(term673806, term673806.getClass(), "baseLineno", 0);
        setIntField(term673806, term673806.getClass(), "endLineno", 0);
        setField(term673806, term673806.getClass(), "functions", null);
        setField(term673806, term673806.getClass(), "regexps", null);
        setField(term673806, term673806.getClass(), "itsVariables", null);
        setField(term673806, term673806.getClass(), "itsConst", null);
        setField(term673806, term673806.getClass(), "itsVariableNames", null);
        setIntField(term673806, term673806.getClass(), "varStart", 0);
        setField(term673806, term673806.getClass(), "compilerData", null);
        setIntField(term673806, term673806.getClass(), "type", 0);
        setField(term673806, term673806.getClass(), "next", null);
        setField(term673806, term673806.getClass(), "first", null);
        setField(term673806, term673806.getClass(), "last", null);
        setField(term673806, term673806.getClass(), "propListHead", null);
        setIntField(term673806, term673806.getClass(), "sourcePosition", 0);
        setField(term673806, term673806.getClass(), "jsType", null);
        setField(term673807, term673807.getClass(), "functionName", null);
        setBooleanField(term673807, term673807.getClass(), "itsNeedsActivation", false);
        setIntField(term673807, term673807.getClass(), "itsFunctionType", 0);
        setBooleanField(term673807, term673807.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673807, term673807.getClass(), "encodedSourceStart", 0);
        setIntField(term673807, term673807.getClass(), "encodedSourceEnd", 0);
        setField(term673807, term673807.getClass(), "sourceName", null);
        setIntField(term673807, term673807.getClass(), "baseLineno", 0);
        setIntField(term673807, term673807.getClass(), "endLineno", 0);
        setField(term673807, term673807.getClass(), "functions", null);
        setField(term673807, term673807.getClass(), "regexps", null);
        setField(term673807, term673807.getClass(), "itsVariables", null);
        setField(term673807, term673807.getClass(), "itsConst", null);
        setField(term673807, term673807.getClass(), "itsVariableNames", null);
        setIntField(term673807, term673807.getClass(), "varStart", 0);
        setField(term673807, term673807.getClass(), "compilerData", null);
        setIntField(term673807, term673807.getClass(), "type", 114);
        setField(term673807, term673807.getClass(), "next", null);
        setField(term673807, term673807.getClass(), "first", null);
        setField(term673807, term673807.getClass(), "last", null);
        setField(term673807, term673807.getClass(), "propListHead", null);
        setIntField(term673807, term673807.getClass(), "sourcePosition", 0);
        setField(term673807, term673807.getClass(), "jsType", null);
        setField(term673807, term673807.getClass(), "parent", null);
        setField(term673806, term673806.getClass(), "parent", term673807);
        term673808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term673808, term673808.getClass(), "number", 0.0);
        setIntField(term673808, term673808.getClass(), "type", 104);
        setField(term673808, term673808.getClass(), "next", null);
        setField(term673808, term673808.getClass(), "first", null);
        setField(term673808, term673808.getClass(), "last", null);
        setField(term673808, term673808.getClass(), "propListHead", null);
        setIntField(term673808, term673808.getClass(), "sourcePosition", 0);
        setField(term673808, term673808.getClass(), "jsType", null);
        setField(term673808, term673808.getClass(), "parent", null);
        term673809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term673809, term673809.getClass(), "number", 0.0);
        setIntField(term673809, term673809.getClass(), "type", 63);
        setField(term673809, term673809.getClass(), "next", null);
        setField(term673809, term673809.getClass(), "first", null);
        setField(term673809, term673809.getClass(), "last", null);
        setField(term673809, term673809.getClass(), "propListHead", null);
        setIntField(term673809, term673809.getClass(), "sourcePosition", 0);
        setField(term673809, term673809.getClass(), "jsType", null);
        setField(term673809, term673809.getClass(), "parent", null);
        term673710 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term673710, term673710.getClass(), "functionName", null);
        setBooleanField(term673710, term673710.getClass(), "itsNeedsActivation", false);
        setIntField(term673710, term673710.getClass(), "itsFunctionType", 0);
        setBooleanField(term673710, term673710.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673710, term673710.getClass(), "encodedSourceStart", 0);
        setIntField(term673710, term673710.getClass(), "encodedSourceEnd", 0);
        setField(term673710, term673710.getClass(), "sourceName", null);
        setIntField(term673710, term673710.getClass(), "baseLineno", 0);
        setIntField(term673710, term673710.getClass(), "endLineno", 0);
        setField(term673710, term673710.getClass(), "functions", null);
        setField(term673710, term673710.getClass(), "regexps", null);
        setField(term673710, term673710.getClass(), "itsVariables", null);
        setField(term673710, term673710.getClass(), "itsConst", null);
        setField(term673710, term673710.getClass(), "itsVariableNames", null);
        setIntField(term673710, term673710.getClass(), "varStart", 0);
        setField(term673710, term673710.getClass(), "compilerData", null);
        setIntField(term673710, term673710.getClass(), "type", 0);
        setField(term673710, term673710.getClass(), "next", null);
        setField(term673710, term673710.getClass(), "first", null);
        setField(term673710, term673710.getClass(), "last", null);
        setField(term673710, term673710.getClass(), "propListHead", null);
        setIntField(term673710, term673710.getClass(), "sourcePosition", 0);
        setField(term673710, term673710.getClass(), "jsType", null);
        setField(term673721, term673721.getClass(), "functionName", null);
        setBooleanField(term673721, term673721.getClass(), "itsNeedsActivation", false);
        setIntField(term673721, term673721.getClass(), "itsFunctionType", 0);
        setBooleanField(term673721, term673721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673721, term673721.getClass(), "encodedSourceStart", 0);
        setIntField(term673721, term673721.getClass(), "encodedSourceEnd", 0);
        setField(term673721, term673721.getClass(), "sourceName", null);
        setIntField(term673721, term673721.getClass(), "baseLineno", 0);
        setIntField(term673721, term673721.getClass(), "endLineno", 0);
        setField(term673721, term673721.getClass(), "functions", null);
        setField(term673721, term673721.getClass(), "regexps", null);
        setField(term673721, term673721.getClass(), "itsVariables", null);
        setField(term673721, term673721.getClass(), "itsConst", null);
        setField(term673721, term673721.getClass(), "itsVariableNames", null);
        setIntField(term673721, term673721.getClass(), "varStart", 0);
        setField(term673721, term673721.getClass(), "compilerData", null);
        setIntField(term673721, term673721.getClass(), "type", 114);
        setField(term673721, term673721.getClass(), "next", null);
        setField(term673721, term673721.getClass(), "first", null);
        setField(term673721, term673721.getClass(), "last", null);
        setField(term673721, term673721.getClass(), "propListHead", null);
        setIntField(term673721, term673721.getClass(), "sourcePosition", 0);
        setField(term673721, term673721.getClass(), "jsType", null);
        setField(term673721, term673721.getClass(), "parent", null);
        setField(term673710, term673710.getClass(), "parent", term673721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term673422;
        args[1] = term673600;
        args[2] = term673692;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term673336, args);
        assertTrue(recursiveEquals(term673336, term673805));
        assertTrue(recursiveEquals(term673422, term673806));
        assertTrue(recursiveEquals(term673600, term673808));
        assertTrue(recursiveEquals(term673692, term673809));
        assertTrue(recursiveEquals(retValue, term673710));
    }

};


