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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401149;
     Object term401241;
     Object term401511;
     Object term401512;
     Object term401434;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401149 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term401241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401419 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401333, term401333.getClass(), "next", term401419);
        setIntField(term401333, term401333.getClass(), "type", 0);
        setField(term401241, term401241.getClass(), "first", term401333);
        setIntField(term401241, term401241.getClass(), "type", 101);
        setField(term401241, term401241.getClass(), "parent", null);
        term401511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term401511, term401511.getClass(), "currentTraversal", null);
        term401512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401512, term401512.getClass(), "str", null);
        setIntField(term401512, term401512.getClass(), "type", 101);
        setField(term401512, term401512.getClass(), "next", null);
        setField(term401513, term401513.getClass(), "str", null);
        setIntField(term401513, term401513.getClass(), "type", 0);
        setField(term401514, term401514.getClass(), "functionName", null);
        setBooleanField(term401514, term401514.getClass(), "itsNeedsActivation", false);
        setIntField(term401514, term401514.getClass(), "itsFunctionType", 0);
        setBooleanField(term401514, term401514.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term401514, term401514.getClass(), "encodedSourceStart", 0);
        setIntField(term401514, term401514.getClass(), "encodedSourceEnd", 0);
        setField(term401514, term401514.getClass(), "sourceName", null);
        setIntField(term401514, term401514.getClass(), "baseLineno", 0);
        setIntField(term401514, term401514.getClass(), "endLineno", 0);
        setField(term401514, term401514.getClass(), "functions", null);
        setField(term401514, term401514.getClass(), "regexps", null);
        setField(term401514, term401514.getClass(), "itsVariables", null);
        setField(term401514, term401514.getClass(), "itsConst", null);
        setField(term401514, term401514.getClass(), "itsVariableNames", null);
        setIntField(term401514, term401514.getClass(), "varStart", 0);
        setField(term401514, term401514.getClass(), "compilerData", null);
        setIntField(term401514, term401514.getClass(), "type", 0);
        setField(term401514, term401514.getClass(), "next", null);
        setField(term401514, term401514.getClass(), "first", null);
        setField(term401514, term401514.getClass(), "last", null);
        setField(term401514, term401514.getClass(), "propListHead", null);
        setIntField(term401514, term401514.getClass(), "sourcePosition", 0);
        setField(term401514, term401514.getClass(), "jsType", null);
        setField(term401514, term401514.getClass(), "parent", null);
        setField(term401513, term401513.getClass(), "next", term401514);
        setField(term401513, term401513.getClass(), "first", null);
        setField(term401513, term401513.getClass(), "last", null);
        setField(term401513, term401513.getClass(), "propListHead", null);
        setIntField(term401513, term401513.getClass(), "sourcePosition", 0);
        setField(term401513, term401513.getClass(), "jsType", null);
        setField(term401513, term401513.getClass(), "parent", null);
        setField(term401512, term401512.getClass(), "first", term401513);
        setField(term401512, term401512.getClass(), "last", null);
        setField(term401512, term401512.getClass(), "propListHead", null);
        setIntField(term401512, term401512.getClass(), "sourcePosition", 0);
        setField(term401512, term401512.getClass(), "jsType", null);
        setField(term401512, term401512.getClass(), "parent", null);
        term401434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term401438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401434, term401434.getClass(), "str", null);
        setIntField(term401434, term401434.getClass(), "type", 101);
        setField(term401434, term401434.getClass(), "next", null);
        setField(term401436, term401436.getClass(), "str", null);
        setIntField(term401436, term401436.getClass(), "type", 0);
        setField(term401438, term401438.getClass(), "functionName", null);
        setBooleanField(term401438, term401438.getClass(), "itsNeedsActivation", false);
        setIntField(term401438, term401438.getClass(), "itsFunctionType", 0);
        setBooleanField(term401438, term401438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term401438, term401438.getClass(), "encodedSourceStart", 0);
        setIntField(term401438, term401438.getClass(), "encodedSourceEnd", 0);
        setField(term401438, term401438.getClass(), "sourceName", null);
        setIntField(term401438, term401438.getClass(), "baseLineno", 0);
        setIntField(term401438, term401438.getClass(), "endLineno", 0);
        setField(term401438, term401438.getClass(), "functions", null);
        setField(term401438, term401438.getClass(), "regexps", null);
        setField(term401438, term401438.getClass(), "itsVariables", null);
        setField(term401438, term401438.getClass(), "itsConst", null);
        setField(term401438, term401438.getClass(), "itsVariableNames", null);
        setIntField(term401438, term401438.getClass(), "varStart", 0);
        setField(term401438, term401438.getClass(), "compilerData", null);
        setIntField(term401438, term401438.getClass(), "type", 0);
        setField(term401438, term401438.getClass(), "next", null);
        setField(term401438, term401438.getClass(), "first", null);
        setField(term401438, term401438.getClass(), "last", null);
        setField(term401438, term401438.getClass(), "propListHead", null);
        setIntField(term401438, term401438.getClass(), "sourcePosition", 0);
        setField(term401438, term401438.getClass(), "jsType", null);
        setField(term401438, term401438.getClass(), "parent", null);
        setField(term401436, term401436.getClass(), "next", term401438);
        setField(term401436, term401436.getClass(), "first", null);
        setField(term401436, term401436.getClass(), "last", null);
        setField(term401436, term401436.getClass(), "propListHead", null);
        setIntField(term401436, term401436.getClass(), "sourcePosition", 0);
        setField(term401436, term401436.getClass(), "jsType", null);
        setField(term401436, term401436.getClass(), "parent", null);
        setField(term401434, term401434.getClass(), "first", term401436);
        setField(term401434, term401434.getClass(), "last", null);
        setField(term401434, term401434.getClass(), "propListHead", null);
        setIntField(term401434, term401434.getClass(), "sourcePosition", 0);
        setField(term401434, term401434.getClass(), "jsType", null);
        setField(term401434, term401434.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term401241;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term401149, args);
        assertTrue(recursiveEquals(term401149, term401511));
        assertTrue(recursiveEquals(term401241, term401512));
        assertTrue(recursiveEquals(retValue, term401434));
    }

};


