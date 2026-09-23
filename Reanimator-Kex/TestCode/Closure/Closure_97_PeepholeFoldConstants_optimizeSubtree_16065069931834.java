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

public class PeepholeFoldConstants_optimizeSubtree_16065069931834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709619;
     Object term709705;
     Object term709936;
     Object term709937;
     Object term709793;

    public PeepholeFoldConstants_optimizeSubtree_16065069931834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709619 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term709705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term709705, term709705.getClass(), "type", 37);
        setField(term709705, term709705.getClass(), "first", term709791);
        term709936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term709936, term709936.getClass(), "currentTraversal", null);
        term709937 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term709937, term709937.getClass(), "functionName", null);
        setBooleanField(term709937, term709937.getClass(), "itsNeedsActivation", false);
        setIntField(term709937, term709937.getClass(), "itsFunctionType", 0);
        setBooleanField(term709937, term709937.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709937, term709937.getClass(), "encodedSourceStart", 0);
        setIntField(term709937, term709937.getClass(), "encodedSourceEnd", 0);
        setField(term709937, term709937.getClass(), "sourceName", null);
        setIntField(term709937, term709937.getClass(), "baseLineno", 0);
        setIntField(term709937, term709937.getClass(), "endLineno", 0);
        setField(term709937, term709937.getClass(), "functions", null);
        setField(term709937, term709937.getClass(), "regexps", null);
        setField(term709937, term709937.getClass(), "itsVariables", null);
        setField(term709937, term709937.getClass(), "itsConst", null);
        setField(term709937, term709937.getClass(), "itsVariableNames", null);
        setIntField(term709937, term709937.getClass(), "varStart", 0);
        setField(term709937, term709937.getClass(), "compilerData", null);
        setIntField(term709937, term709937.getClass(), "type", 37);
        setField(term709937, term709937.getClass(), "next", null);
        setField(term709938, term709938.getClass(), "functionName", null);
        setBooleanField(term709938, term709938.getClass(), "itsNeedsActivation", false);
        setIntField(term709938, term709938.getClass(), "itsFunctionType", 0);
        setBooleanField(term709938, term709938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709938, term709938.getClass(), "encodedSourceStart", 0);
        setIntField(term709938, term709938.getClass(), "encodedSourceEnd", 0);
        setField(term709938, term709938.getClass(), "sourceName", null);
        setIntField(term709938, term709938.getClass(), "baseLineno", 0);
        setIntField(term709938, term709938.getClass(), "endLineno", 0);
        setField(term709938, term709938.getClass(), "functions", null);
        setField(term709938, term709938.getClass(), "regexps", null);
        setField(term709938, term709938.getClass(), "itsVariables", null);
        setField(term709938, term709938.getClass(), "itsConst", null);
        setField(term709938, term709938.getClass(), "itsVariableNames", null);
        setIntField(term709938, term709938.getClass(), "varStart", 0);
        setField(term709938, term709938.getClass(), "compilerData", null);
        setIntField(term709938, term709938.getClass(), "type", 0);
        setField(term709938, term709938.getClass(), "next", null);
        setField(term709938, term709938.getClass(), "first", null);
        setField(term709938, term709938.getClass(), "last", null);
        setField(term709938, term709938.getClass(), "propListHead", null);
        setIntField(term709938, term709938.getClass(), "sourcePosition", 0);
        setField(term709938, term709938.getClass(), "jsType", null);
        setField(term709938, term709938.getClass(), "parent", null);
        setField(term709937, term709937.getClass(), "first", term709938);
        setField(term709937, term709937.getClass(), "last", null);
        setField(term709937, term709937.getClass(), "propListHead", null);
        setIntField(term709937, term709937.getClass(), "sourcePosition", 0);
        setField(term709937, term709937.getClass(), "jsType", null);
        setField(term709937, term709937.getClass(), "parent", null);
        term709793 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term709793, term709793.getClass(), "functionName", null);
        setBooleanField(term709793, term709793.getClass(), "itsNeedsActivation", false);
        setIntField(term709793, term709793.getClass(), "itsFunctionType", 0);
        setBooleanField(term709793, term709793.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709793, term709793.getClass(), "encodedSourceStart", 0);
        setIntField(term709793, term709793.getClass(), "encodedSourceEnd", 0);
        setField(term709793, term709793.getClass(), "sourceName", null);
        setIntField(term709793, term709793.getClass(), "baseLineno", 0);
        setIntField(term709793, term709793.getClass(), "endLineno", 0);
        setField(term709793, term709793.getClass(), "functions", null);
        setField(term709793, term709793.getClass(), "regexps", null);
        setField(term709793, term709793.getClass(), "itsVariables", null);
        setField(term709793, term709793.getClass(), "itsConst", null);
        setField(term709793, term709793.getClass(), "itsVariableNames", null);
        setIntField(term709793, term709793.getClass(), "varStart", 0);
        setField(term709793, term709793.getClass(), "compilerData", null);
        setIntField(term709793, term709793.getClass(), "type", 37);
        setField(term709793, term709793.getClass(), "next", null);
        setField(term709803, term709803.getClass(), "functionName", null);
        setBooleanField(term709803, term709803.getClass(), "itsNeedsActivation", false);
        setIntField(term709803, term709803.getClass(), "itsFunctionType", 0);
        setBooleanField(term709803, term709803.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709803, term709803.getClass(), "encodedSourceStart", 0);
        setIntField(term709803, term709803.getClass(), "encodedSourceEnd", 0);
        setField(term709803, term709803.getClass(), "sourceName", null);
        setIntField(term709803, term709803.getClass(), "baseLineno", 0);
        setIntField(term709803, term709803.getClass(), "endLineno", 0);
        setField(term709803, term709803.getClass(), "functions", null);
        setField(term709803, term709803.getClass(), "regexps", null);
        setField(term709803, term709803.getClass(), "itsVariables", null);
        setField(term709803, term709803.getClass(), "itsConst", null);
        setField(term709803, term709803.getClass(), "itsVariableNames", null);
        setIntField(term709803, term709803.getClass(), "varStart", 0);
        setField(term709803, term709803.getClass(), "compilerData", null);
        setIntField(term709803, term709803.getClass(), "type", 0);
        setField(term709803, term709803.getClass(), "next", null);
        setField(term709803, term709803.getClass(), "first", null);
        setField(term709803, term709803.getClass(), "last", null);
        setField(term709803, term709803.getClass(), "propListHead", null);
        setIntField(term709803, term709803.getClass(), "sourcePosition", 0);
        setField(term709803, term709803.getClass(), "jsType", null);
        setField(term709803, term709803.getClass(), "parent", null);
        setField(term709793, term709793.getClass(), "first", term709803);
        setField(term709793, term709793.getClass(), "last", null);
        setField(term709793, term709793.getClass(), "propListHead", null);
        setIntField(term709793, term709793.getClass(), "sourcePosition", 0);
        setField(term709793, term709793.getClass(), "jsType", null);
        setField(term709793, term709793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term709705;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term709619, args);
        assertTrue(recursiveEquals(term709619, term709936));
        assertTrue(recursiveEquals(term709705, term709937));
        assertTrue(recursiveEquals(retValue, term709793));
    }

};


