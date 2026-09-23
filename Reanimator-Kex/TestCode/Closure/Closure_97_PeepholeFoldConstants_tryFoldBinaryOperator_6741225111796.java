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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699327;
     Object term699419;
     Object term699633;
     Object term699634;
     Object term699590;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term699327 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term699419 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term699505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term699575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term699505, term699505.getClass(), "next", term699575);
        setField(term699419, term699419.getClass(), "first", term699505);
        setIntField(term699419, term699419.getClass(), "type", 23);
        term699633 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term699633, term699633.getClass(), "currentTraversal", null);
        term699634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term699635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term699636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term699634, term699634.getClass(), "str", null);
        setIntField(term699634, term699634.getClass(), "type", 23);
        setField(term699634, term699634.getClass(), "next", null);
        setField(term699635, term699635.getClass(), "functionName", null);
        setBooleanField(term699635, term699635.getClass(), "itsNeedsActivation", false);
        setIntField(term699635, term699635.getClass(), "itsFunctionType", 0);
        setBooleanField(term699635, term699635.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term699635, term699635.getClass(), "encodedSourceStart", 0);
        setIntField(term699635, term699635.getClass(), "encodedSourceEnd", 0);
        setField(term699635, term699635.getClass(), "sourceName", null);
        setIntField(term699635, term699635.getClass(), "baseLineno", 0);
        setIntField(term699635, term699635.getClass(), "endLineno", 0);
        setField(term699635, term699635.getClass(), "functions", null);
        setField(term699635, term699635.getClass(), "regexps", null);
        setField(term699635, term699635.getClass(), "itsVariables", null);
        setField(term699635, term699635.getClass(), "itsConst", null);
        setField(term699635, term699635.getClass(), "itsVariableNames", null);
        setIntField(term699635, term699635.getClass(), "varStart", 0);
        setField(term699635, term699635.getClass(), "compilerData", null);
        setIntField(term699635, term699635.getClass(), "type", 0);
        setIntField(term699636, term699636.getClass(), "type", 0);
        setField(term699636, term699636.getClass(), "next", null);
        setField(term699636, term699636.getClass(), "first", null);
        setField(term699636, term699636.getClass(), "last", null);
        setField(term699636, term699636.getClass(), "propListHead", null);
        setIntField(term699636, term699636.getClass(), "sourcePosition", 0);
        setField(term699636, term699636.getClass(), "jsType", null);
        setField(term699636, term699636.getClass(), "parent", null);
        setField(term699635, term699635.getClass(), "next", term699636);
        setField(term699635, term699635.getClass(), "first", null);
        setField(term699635, term699635.getClass(), "last", null);
        setField(term699635, term699635.getClass(), "propListHead", null);
        setIntField(term699635, term699635.getClass(), "sourcePosition", 0);
        setField(term699635, term699635.getClass(), "jsType", null);
        setField(term699635, term699635.getClass(), "parent", null);
        setField(term699634, term699634.getClass(), "first", term699635);
        setField(term699634, term699634.getClass(), "last", null);
        setField(term699634, term699634.getClass(), "propListHead", null);
        setIntField(term699634, term699634.getClass(), "sourcePosition", 0);
        setField(term699634, term699634.getClass(), "jsType", null);
        setField(term699634, term699634.getClass(), "parent", null);
        term699590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term699592 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term699602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term699590, term699590.getClass(), "str", null);
        setIntField(term699590, term699590.getClass(), "type", 23);
        setField(term699590, term699590.getClass(), "next", null);
        setField(term699592, term699592.getClass(), "functionName", null);
        setBooleanField(term699592, term699592.getClass(), "itsNeedsActivation", false);
        setIntField(term699592, term699592.getClass(), "itsFunctionType", 0);
        setBooleanField(term699592, term699592.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term699592, term699592.getClass(), "encodedSourceStart", 0);
        setIntField(term699592, term699592.getClass(), "encodedSourceEnd", 0);
        setField(term699592, term699592.getClass(), "sourceName", null);
        setIntField(term699592, term699592.getClass(), "baseLineno", 0);
        setIntField(term699592, term699592.getClass(), "endLineno", 0);
        setField(term699592, term699592.getClass(), "functions", null);
        setField(term699592, term699592.getClass(), "regexps", null);
        setField(term699592, term699592.getClass(), "itsVariables", null);
        setField(term699592, term699592.getClass(), "itsConst", null);
        setField(term699592, term699592.getClass(), "itsVariableNames", null);
        setIntField(term699592, term699592.getClass(), "varStart", 0);
        setField(term699592, term699592.getClass(), "compilerData", null);
        setIntField(term699592, term699592.getClass(), "type", 0);
        setIntField(term699602, term699602.getClass(), "type", 0);
        setField(term699602, term699602.getClass(), "next", null);
        setField(term699602, term699602.getClass(), "first", null);
        setField(term699602, term699602.getClass(), "last", null);
        setField(term699602, term699602.getClass(), "propListHead", null);
        setIntField(term699602, term699602.getClass(), "sourcePosition", 0);
        setField(term699602, term699602.getClass(), "jsType", null);
        setField(term699602, term699602.getClass(), "parent", null);
        setField(term699592, term699592.getClass(), "next", term699602);
        setField(term699592, term699592.getClass(), "first", null);
        setField(term699592, term699592.getClass(), "last", null);
        setField(term699592, term699592.getClass(), "propListHead", null);
        setIntField(term699592, term699592.getClass(), "sourcePosition", 0);
        setField(term699592, term699592.getClass(), "jsType", null);
        setField(term699592, term699592.getClass(), "parent", null);
        setField(term699590, term699590.getClass(), "first", term699592);
        setField(term699590, term699590.getClass(), "last", null);
        setField(term699590, term699590.getClass(), "propListHead", null);
        setIntField(term699590, term699590.getClass(), "sourcePosition", 0);
        setField(term699590, term699590.getClass(), "jsType", null);
        setField(term699590, term699590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term699419;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term699327, args);
        assertTrue(recursiveEquals(term699327, term699633));
        assertTrue(recursiveEquals(term699419, term699634));
        assertTrue(recursiveEquals(retValue, term699590));
    }

};


