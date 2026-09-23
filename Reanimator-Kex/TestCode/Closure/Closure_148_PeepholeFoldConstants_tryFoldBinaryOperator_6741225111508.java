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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376645;
     Object term376737;
     Object term377192;
     Object term377193;
     Object term377139;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376645 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term376737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term376829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term376915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term376829, term376829.getClass(), "next", term376915);
        setIntField(term376829, term376829.getClass(), "type", 39);
        setField(term376737, term376737.getClass(), "first", term376829);
        setIntField(term376737, term376737.getClass(), "type", 22);
        term377192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term377192, term377192.getClass(), "currentTraversal", null);
        term377193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term377194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term377195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term377193, term377193.getClass(), "str", null);
        setIntField(term377193, term377193.getClass(), "type", 22);
        setField(term377193, term377193.getClass(), "next", null);
        setField(term377194, term377194.getClass(), "str", null);
        setIntField(term377194, term377194.getClass(), "type", 39);
        setField(term377195, term377195.getClass(), "functionName", null);
        setBooleanField(term377195, term377195.getClass(), "itsNeedsActivation", false);
        setIntField(term377195, term377195.getClass(), "itsFunctionType", 0);
        setBooleanField(term377195, term377195.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377195, term377195.getClass(), "encodedSourceStart", 0);
        setIntField(term377195, term377195.getClass(), "encodedSourceEnd", 0);
        setField(term377195, term377195.getClass(), "sourceName", null);
        setIntField(term377195, term377195.getClass(), "baseLineno", 0);
        setIntField(term377195, term377195.getClass(), "endLineno", 0);
        setField(term377195, term377195.getClass(), "functions", null);
        setField(term377195, term377195.getClass(), "regexps", null);
        setField(term377195, term377195.getClass(), "itsVariables", null);
        setField(term377195, term377195.getClass(), "itsConst", null);
        setField(term377195, term377195.getClass(), "itsVariableNames", null);
        setIntField(term377195, term377195.getClass(), "varStart", 0);
        setField(term377195, term377195.getClass(), "compilerData", null);
        setIntField(term377195, term377195.getClass(), "type", 0);
        setField(term377195, term377195.getClass(), "next", null);
        setField(term377195, term377195.getClass(), "first", null);
        setField(term377195, term377195.getClass(), "last", null);
        setField(term377195, term377195.getClass(), "propListHead", null);
        setIntField(term377195, term377195.getClass(), "sourcePosition", 0);
        setField(term377195, term377195.getClass(), "jsType", null);
        setField(term377195, term377195.getClass(), "parent", null);
        setField(term377194, term377194.getClass(), "next", term377195);
        setField(term377194, term377194.getClass(), "first", null);
        setField(term377194, term377194.getClass(), "last", null);
        setField(term377194, term377194.getClass(), "propListHead", null);
        setIntField(term377194, term377194.getClass(), "sourcePosition", 0);
        setField(term377194, term377194.getClass(), "jsType", null);
        setField(term377194, term377194.getClass(), "parent", null);
        setField(term377193, term377193.getClass(), "first", term377194);
        setField(term377193, term377193.getClass(), "last", null);
        setField(term377193, term377193.getClass(), "propListHead", null);
        setIntField(term377193, term377193.getClass(), "sourcePosition", 0);
        setField(term377193, term377193.getClass(), "jsType", null);
        setField(term377193, term377193.getClass(), "parent", null);
        term377139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term377141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term377143 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term377139, term377139.getClass(), "str", null);
        setIntField(term377139, term377139.getClass(), "type", 22);
        setField(term377139, term377139.getClass(), "next", null);
        setField(term377141, term377141.getClass(), "str", null);
        setIntField(term377141, term377141.getClass(), "type", 39);
        setField(term377143, term377143.getClass(), "functionName", null);
        setBooleanField(term377143, term377143.getClass(), "itsNeedsActivation", false);
        setIntField(term377143, term377143.getClass(), "itsFunctionType", 0);
        setBooleanField(term377143, term377143.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377143, term377143.getClass(), "encodedSourceStart", 0);
        setIntField(term377143, term377143.getClass(), "encodedSourceEnd", 0);
        setField(term377143, term377143.getClass(), "sourceName", null);
        setIntField(term377143, term377143.getClass(), "baseLineno", 0);
        setIntField(term377143, term377143.getClass(), "endLineno", 0);
        setField(term377143, term377143.getClass(), "functions", null);
        setField(term377143, term377143.getClass(), "regexps", null);
        setField(term377143, term377143.getClass(), "itsVariables", null);
        setField(term377143, term377143.getClass(), "itsConst", null);
        setField(term377143, term377143.getClass(), "itsVariableNames", null);
        setIntField(term377143, term377143.getClass(), "varStart", 0);
        setField(term377143, term377143.getClass(), "compilerData", null);
        setIntField(term377143, term377143.getClass(), "type", 0);
        setField(term377143, term377143.getClass(), "next", null);
        setField(term377143, term377143.getClass(), "first", null);
        setField(term377143, term377143.getClass(), "last", null);
        setField(term377143, term377143.getClass(), "propListHead", null);
        setIntField(term377143, term377143.getClass(), "sourcePosition", 0);
        setField(term377143, term377143.getClass(), "jsType", null);
        setField(term377143, term377143.getClass(), "parent", null);
        setField(term377141, term377141.getClass(), "next", term377143);
        setField(term377141, term377141.getClass(), "first", null);
        setField(term377141, term377141.getClass(), "last", null);
        setField(term377141, term377141.getClass(), "propListHead", null);
        setIntField(term377141, term377141.getClass(), "sourcePosition", 0);
        setField(term377141, term377141.getClass(), "jsType", null);
        setField(term377141, term377141.getClass(), "parent", null);
        setField(term377139, term377139.getClass(), "first", term377141);
        setField(term377139, term377139.getClass(), "last", null);
        setField(term377139, term377139.getClass(), "propListHead", null);
        setIntField(term377139, term377139.getClass(), "sourcePosition", 0);
        setField(term377139, term377139.getClass(), "jsType", null);
        setField(term377139, term377139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term376737;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term376645, args);
        assertTrue(recursiveEquals(term376645, term377192));
        assertTrue(recursiveEquals(term376737, term377193));
        assertTrue(recursiveEquals(retValue, term377139));
    }

};


