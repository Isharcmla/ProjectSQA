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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363895;
     Object term363987;
     Object term364242;
     Object term364243;
     Object term364181;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term363987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364165 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term364079, term364079.getClass(), "next", term364165);
        setIntField(term364079, term364079.getClass(), "type", 63);
        setField(term363987, term363987.getClass(), "first", term364079);
        setIntField(term363987, term363987.getClass(), "type", 35);
        term364242 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term364242, term364242.getClass(), "currentTraversal", null);
        term364243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term364243, term364243.getClass(), "number", 0.0);
        setIntField(term364243, term364243.getClass(), "type", 35);
        setField(term364243, term364243.getClass(), "next", null);
        setDoubleField(term364244, term364244.getClass(), "number", 0.0);
        setIntField(term364244, term364244.getClass(), "type", 63);
        setField(term364245, term364245.getClass(), "functionName", null);
        setBooleanField(term364245, term364245.getClass(), "itsNeedsActivation", false);
        setIntField(term364245, term364245.getClass(), "itsFunctionType", 0);
        setBooleanField(term364245, term364245.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term364245, term364245.getClass(), "encodedSourceStart", 0);
        setIntField(term364245, term364245.getClass(), "encodedSourceEnd", 0);
        setField(term364245, term364245.getClass(), "sourceName", null);
        setIntField(term364245, term364245.getClass(), "baseLineno", 0);
        setIntField(term364245, term364245.getClass(), "endLineno", 0);
        setField(term364245, term364245.getClass(), "functions", null);
        setField(term364245, term364245.getClass(), "regexps", null);
        setField(term364245, term364245.getClass(), "itsVariables", null);
        setField(term364245, term364245.getClass(), "itsConst", null);
        setField(term364245, term364245.getClass(), "itsVariableNames", null);
        setIntField(term364245, term364245.getClass(), "varStart", 0);
        setField(term364245, term364245.getClass(), "compilerData", null);
        setIntField(term364245, term364245.getClass(), "type", 0);
        setField(term364245, term364245.getClass(), "next", null);
        setField(term364245, term364245.getClass(), "first", null);
        setField(term364245, term364245.getClass(), "last", null);
        setField(term364245, term364245.getClass(), "propListHead", null);
        setIntField(term364245, term364245.getClass(), "sourcePosition", 0);
        setField(term364245, term364245.getClass(), "jsType", null);
        setField(term364245, term364245.getClass(), "parent", null);
        setField(term364244, term364244.getClass(), "next", term364245);
        setField(term364244, term364244.getClass(), "first", null);
        setField(term364244, term364244.getClass(), "last", null);
        setField(term364244, term364244.getClass(), "propListHead", null);
        setIntField(term364244, term364244.getClass(), "sourcePosition", 0);
        setField(term364244, term364244.getClass(), "jsType", null);
        setField(term364244, term364244.getClass(), "parent", null);
        setField(term364243, term364243.getClass(), "first", term364244);
        setField(term364243, term364243.getClass(), "last", null);
        setField(term364243, term364243.getClass(), "propListHead", null);
        setIntField(term364243, term364243.getClass(), "sourcePosition", 0);
        setField(term364243, term364243.getClass(), "jsType", null);
        setField(term364243, term364243.getClass(), "parent", null);
        term364181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364184 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364187 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term364181, term364181.getClass(), "number", 0.0);
        setIntField(term364181, term364181.getClass(), "type", 35);
        setField(term364181, term364181.getClass(), "next", null);
        setDoubleField(term364184, term364184.getClass(), "number", 0.0);
        setIntField(term364184, term364184.getClass(), "type", 63);
        setField(term364187, term364187.getClass(), "functionName", null);
        setBooleanField(term364187, term364187.getClass(), "itsNeedsActivation", false);
        setIntField(term364187, term364187.getClass(), "itsFunctionType", 0);
        setBooleanField(term364187, term364187.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term364187, term364187.getClass(), "encodedSourceStart", 0);
        setIntField(term364187, term364187.getClass(), "encodedSourceEnd", 0);
        setField(term364187, term364187.getClass(), "sourceName", null);
        setIntField(term364187, term364187.getClass(), "baseLineno", 0);
        setIntField(term364187, term364187.getClass(), "endLineno", 0);
        setField(term364187, term364187.getClass(), "functions", null);
        setField(term364187, term364187.getClass(), "regexps", null);
        setField(term364187, term364187.getClass(), "itsVariables", null);
        setField(term364187, term364187.getClass(), "itsConst", null);
        setField(term364187, term364187.getClass(), "itsVariableNames", null);
        setIntField(term364187, term364187.getClass(), "varStart", 0);
        setField(term364187, term364187.getClass(), "compilerData", null);
        setIntField(term364187, term364187.getClass(), "type", 0);
        setField(term364187, term364187.getClass(), "next", null);
        setField(term364187, term364187.getClass(), "first", null);
        setField(term364187, term364187.getClass(), "last", null);
        setField(term364187, term364187.getClass(), "propListHead", null);
        setIntField(term364187, term364187.getClass(), "sourcePosition", 0);
        setField(term364187, term364187.getClass(), "jsType", null);
        setField(term364187, term364187.getClass(), "parent", null);
        setField(term364184, term364184.getClass(), "next", term364187);
        setField(term364184, term364184.getClass(), "first", null);
        setField(term364184, term364184.getClass(), "last", null);
        setField(term364184, term364184.getClass(), "propListHead", null);
        setIntField(term364184, term364184.getClass(), "sourcePosition", 0);
        setField(term364184, term364184.getClass(), "jsType", null);
        setField(term364184, term364184.getClass(), "parent", null);
        setField(term364181, term364181.getClass(), "first", term364184);
        setField(term364181, term364181.getClass(), "last", null);
        setField(term364181, term364181.getClass(), "propListHead", null);
        setIntField(term364181, term364181.getClass(), "sourcePosition", 0);
        setField(term364181, term364181.getClass(), "jsType", null);
        setField(term364181, term364181.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term363987;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term363895, args);
        assertTrue(recursiveEquals(term363895, term364242));
        assertTrue(recursiveEquals(term363987, term364243));
        assertTrue(recursiveEquals(retValue, term364181));
    }

};


