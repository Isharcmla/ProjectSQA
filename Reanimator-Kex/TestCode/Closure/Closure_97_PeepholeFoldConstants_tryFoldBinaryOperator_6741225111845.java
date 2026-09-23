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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712177;
     Object term712269;
     Object term712889;
     Object term712890;
     Object term712844;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term712269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712355 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term712425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term712355, term712355.getClass(), "next", term712425);
        setField(term712269, term712269.getClass(), "first", term712355);
        setIntField(term712269, term712269.getClass(), "type", 20);
        term712889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term712889, term712889.getClass(), "currentTraversal", null);
        term712890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term712892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term712890, term712890.getClass(), "number", 0.0);
        setIntField(term712890, term712890.getClass(), "type", 20);
        setField(term712890, term712890.getClass(), "next", null);
        setField(term712891, term712891.getClass(), "functionName", null);
        setBooleanField(term712891, term712891.getClass(), "itsNeedsActivation", false);
        setIntField(term712891, term712891.getClass(), "itsFunctionType", 0);
        setBooleanField(term712891, term712891.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term712891, term712891.getClass(), "encodedSourceStart", 0);
        setIntField(term712891, term712891.getClass(), "encodedSourceEnd", 0);
        setField(term712891, term712891.getClass(), "sourceName", null);
        setIntField(term712891, term712891.getClass(), "baseLineno", 0);
        setIntField(term712891, term712891.getClass(), "endLineno", 0);
        setField(term712891, term712891.getClass(), "functions", null);
        setField(term712891, term712891.getClass(), "regexps", null);
        setField(term712891, term712891.getClass(), "itsVariables", null);
        setField(term712891, term712891.getClass(), "itsConst", null);
        setField(term712891, term712891.getClass(), "itsVariableNames", null);
        setIntField(term712891, term712891.getClass(), "varStart", 0);
        setField(term712891, term712891.getClass(), "compilerData", null);
        setIntField(term712891, term712891.getClass(), "type", 0);
        setIntField(term712892, term712892.getClass(), "type", 0);
        setField(term712892, term712892.getClass(), "next", null);
        setField(term712892, term712892.getClass(), "first", null);
        setField(term712892, term712892.getClass(), "last", null);
        setField(term712892, term712892.getClass(), "propListHead", null);
        setIntField(term712892, term712892.getClass(), "sourcePosition", 0);
        setField(term712892, term712892.getClass(), "jsType", null);
        setField(term712892, term712892.getClass(), "parent", null);
        setField(term712891, term712891.getClass(), "next", term712892);
        setField(term712891, term712891.getClass(), "first", null);
        setField(term712891, term712891.getClass(), "last", null);
        setField(term712891, term712891.getClass(), "propListHead", null);
        setIntField(term712891, term712891.getClass(), "sourcePosition", 0);
        setField(term712891, term712891.getClass(), "jsType", null);
        setField(term712891, term712891.getClass(), "parent", null);
        setField(term712890, term712890.getClass(), "first", term712891);
        setField(term712890, term712890.getClass(), "last", null);
        setField(term712890, term712890.getClass(), "propListHead", null);
        setIntField(term712890, term712890.getClass(), "sourcePosition", 0);
        setField(term712890, term712890.getClass(), "jsType", null);
        setField(term712890, term712890.getClass(), "parent", null);
        term712844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712847 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term712857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term712844, term712844.getClass(), "number", 0.0);
        setIntField(term712844, term712844.getClass(), "type", 20);
        setField(term712844, term712844.getClass(), "next", null);
        setField(term712847, term712847.getClass(), "functionName", null);
        setBooleanField(term712847, term712847.getClass(), "itsNeedsActivation", false);
        setIntField(term712847, term712847.getClass(), "itsFunctionType", 0);
        setBooleanField(term712847, term712847.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term712847, term712847.getClass(), "encodedSourceStart", 0);
        setIntField(term712847, term712847.getClass(), "encodedSourceEnd", 0);
        setField(term712847, term712847.getClass(), "sourceName", null);
        setIntField(term712847, term712847.getClass(), "baseLineno", 0);
        setIntField(term712847, term712847.getClass(), "endLineno", 0);
        setField(term712847, term712847.getClass(), "functions", null);
        setField(term712847, term712847.getClass(), "regexps", null);
        setField(term712847, term712847.getClass(), "itsVariables", null);
        setField(term712847, term712847.getClass(), "itsConst", null);
        setField(term712847, term712847.getClass(), "itsVariableNames", null);
        setIntField(term712847, term712847.getClass(), "varStart", 0);
        setField(term712847, term712847.getClass(), "compilerData", null);
        setIntField(term712847, term712847.getClass(), "type", 0);
        setIntField(term712857, term712857.getClass(), "type", 0);
        setField(term712857, term712857.getClass(), "next", null);
        setField(term712857, term712857.getClass(), "first", null);
        setField(term712857, term712857.getClass(), "last", null);
        setField(term712857, term712857.getClass(), "propListHead", null);
        setIntField(term712857, term712857.getClass(), "sourcePosition", 0);
        setField(term712857, term712857.getClass(), "jsType", null);
        setField(term712857, term712857.getClass(), "parent", null);
        setField(term712847, term712847.getClass(), "next", term712857);
        setField(term712847, term712847.getClass(), "first", null);
        setField(term712847, term712847.getClass(), "last", null);
        setField(term712847, term712847.getClass(), "propListHead", null);
        setIntField(term712847, term712847.getClass(), "sourcePosition", 0);
        setField(term712847, term712847.getClass(), "jsType", null);
        setField(term712847, term712847.getClass(), "parent", null);
        setField(term712844, term712844.getClass(), "first", term712847);
        setField(term712844, term712844.getClass(), "last", null);
        setField(term712844, term712844.getClass(), "propListHead", null);
        setIntField(term712844, term712844.getClass(), "sourcePosition", 0);
        setField(term712844, term712844.getClass(), "jsType", null);
        setField(term712844, term712844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term712269;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term712177, args);
        assertTrue(recursiveEquals(term712177, term712889));
        assertTrue(recursiveEquals(term712269, term712890));
        assertTrue(recursiveEquals(retValue, term712844));
    }

};


