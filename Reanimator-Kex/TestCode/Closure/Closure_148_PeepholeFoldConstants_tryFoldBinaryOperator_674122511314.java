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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61033;
     Object term61119;
     Object term62015;
     Object term62016;
     Object term61972;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61033 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61119 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61119, term61119.getClass(), "first", term61119);
        setField(term61119, term61119.getClass(), "next", term61189);
        setIntField(term61119, term61119.getClass(), "type", 9);
        term62015 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62015, term62015.getClass(), "currentTraversal", null);
        term62016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term62017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62016, term62016.getClass(), "functionName", null);
        setBooleanField(term62016, term62016.getClass(), "itsNeedsActivation", false);
        setIntField(term62016, term62016.getClass(), "itsFunctionType", 0);
        setBooleanField(term62016, term62016.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62016, term62016.getClass(), "encodedSourceStart", 0);
        setIntField(term62016, term62016.getClass(), "encodedSourceEnd", 0);
        setField(term62016, term62016.getClass(), "sourceName", null);
        setIntField(term62016, term62016.getClass(), "baseLineno", 0);
        setIntField(term62016, term62016.getClass(), "endLineno", 0);
        setField(term62016, term62016.getClass(), "functions", null);
        setField(term62016, term62016.getClass(), "regexps", null);
        setField(term62016, term62016.getClass(), "itsVariables", null);
        setField(term62016, term62016.getClass(), "itsConst", null);
        setField(term62016, term62016.getClass(), "itsVariableNames", null);
        setIntField(term62016, term62016.getClass(), "varStart", 0);
        setField(term62016, term62016.getClass(), "compilerData", null);
        setIntField(term62016, term62016.getClass(), "type", 9);
        setIntField(term62017, term62017.getClass(), "type", 0);
        setField(term62017, term62017.getClass(), "next", null);
        setField(term62017, term62017.getClass(), "first", null);
        setField(term62017, term62017.getClass(), "last", null);
        setField(term62017, term62017.getClass(), "propListHead", null);
        setIntField(term62017, term62017.getClass(), "sourcePosition", 0);
        setField(term62017, term62017.getClass(), "jsType", null);
        setField(term62017, term62017.getClass(), "parent", null);
        setField(term62016, term62016.getClass(), "next", term62017);
        setField(term62016, term62016.getClass(), "first", term62016);
        setField(term62016, term62016.getClass(), "last", null);
        setField(term62016, term62016.getClass(), "propListHead", null);
        setIntField(term62016, term62016.getClass(), "sourcePosition", 0);
        setField(term62016, term62016.getClass(), "jsType", null);
        setField(term62016, term62016.getClass(), "parent", null);
        term61972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61972, term61972.getClass(), "functionName", null);
        setBooleanField(term61972, term61972.getClass(), "itsNeedsActivation", false);
        setIntField(term61972, term61972.getClass(), "itsFunctionType", 0);
        setBooleanField(term61972, term61972.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61972, term61972.getClass(), "encodedSourceStart", 0);
        setIntField(term61972, term61972.getClass(), "encodedSourceEnd", 0);
        setField(term61972, term61972.getClass(), "sourceName", null);
        setIntField(term61972, term61972.getClass(), "baseLineno", 0);
        setIntField(term61972, term61972.getClass(), "endLineno", 0);
        setField(term61972, term61972.getClass(), "functions", null);
        setField(term61972, term61972.getClass(), "regexps", null);
        setField(term61972, term61972.getClass(), "itsVariables", null);
        setField(term61972, term61972.getClass(), "itsConst", null);
        setField(term61972, term61972.getClass(), "itsVariableNames", null);
        setIntField(term61972, term61972.getClass(), "varStart", 0);
        setField(term61972, term61972.getClass(), "compilerData", null);
        setIntField(term61972, term61972.getClass(), "type", 9);
        setIntField(term61982, term61982.getClass(), "type", 0);
        setField(term61982, term61982.getClass(), "next", null);
        setField(term61982, term61982.getClass(), "first", null);
        setField(term61982, term61982.getClass(), "last", null);
        setField(term61982, term61982.getClass(), "propListHead", null);
        setIntField(term61982, term61982.getClass(), "sourcePosition", 0);
        setField(term61982, term61982.getClass(), "jsType", null);
        setField(term61982, term61982.getClass(), "parent", null);
        setField(term61972, term61972.getClass(), "next", term61982);
        setField(term61972, term61972.getClass(), "first", term61972);
        setField(term61972, term61972.getClass(), "last", null);
        setField(term61972, term61972.getClass(), "propListHead", null);
        setIntField(term61972, term61972.getClass(), "sourcePosition", 0);
        setField(term61972, term61972.getClass(), "jsType", null);
        setField(term61972, term61972.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61119;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61033, args);
        assertTrue(recursiveEquals(term61033, term62015));
        assertTrue(recursiveEquals(term61119, term62016));
        assertTrue(recursiveEquals(retValue, term61972));
    }

};


