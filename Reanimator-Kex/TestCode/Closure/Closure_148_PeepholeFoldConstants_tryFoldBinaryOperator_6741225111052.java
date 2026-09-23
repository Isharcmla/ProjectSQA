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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246497;
     Object term246589;
     Object term246993;
     Object term246994;
     Object term246885;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246497 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term246589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term246773, term246773.getClass(), "first", term246859);
        setField(term246681, term246681.getClass(), "next", term246773);
        setField(term246589, term246589.getClass(), "first", term246681);
        setIntField(term246589, term246589.getClass(), "type", 86);
        term246993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term246993, term246993.getClass(), "currentTraversal", null);
        term246994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term246994, term246994.getClass(), "number", 0.0);
        setIntField(term246994, term246994.getClass(), "type", 86);
        setField(term246994, term246994.getClass(), "next", null);
        setDoubleField(term246995, term246995.getClass(), "number", 0.0);
        setIntField(term246995, term246995.getClass(), "type", 0);
        setDoubleField(term246996, term246996.getClass(), "number", 0.0);
        setIntField(term246996, term246996.getClass(), "type", 0);
        setField(term246996, term246996.getClass(), "next", null);
        setField(term246997, term246997.getClass(), "functionName", null);
        setBooleanField(term246997, term246997.getClass(), "itsNeedsActivation", false);
        setIntField(term246997, term246997.getClass(), "itsFunctionType", 0);
        setBooleanField(term246997, term246997.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246997, term246997.getClass(), "encodedSourceStart", 0);
        setIntField(term246997, term246997.getClass(), "encodedSourceEnd", 0);
        setField(term246997, term246997.getClass(), "sourceName", null);
        setIntField(term246997, term246997.getClass(), "baseLineno", 0);
        setIntField(term246997, term246997.getClass(), "endLineno", 0);
        setField(term246997, term246997.getClass(), "functions", null);
        setField(term246997, term246997.getClass(), "regexps", null);
        setField(term246997, term246997.getClass(), "itsVariables", null);
        setField(term246997, term246997.getClass(), "itsConst", null);
        setField(term246997, term246997.getClass(), "itsVariableNames", null);
        setIntField(term246997, term246997.getClass(), "varStart", 0);
        setField(term246997, term246997.getClass(), "compilerData", null);
        setIntField(term246997, term246997.getClass(), "type", 0);
        setField(term246997, term246997.getClass(), "next", null);
        setField(term246997, term246997.getClass(), "first", null);
        setField(term246997, term246997.getClass(), "last", null);
        setField(term246997, term246997.getClass(), "propListHead", null);
        setIntField(term246997, term246997.getClass(), "sourcePosition", 0);
        setField(term246997, term246997.getClass(), "jsType", null);
        setField(term246997, term246997.getClass(), "parent", null);
        setField(term246996, term246996.getClass(), "first", term246997);
        setField(term246996, term246996.getClass(), "last", null);
        setField(term246996, term246996.getClass(), "propListHead", null);
        setIntField(term246996, term246996.getClass(), "sourcePosition", 0);
        setField(term246996, term246996.getClass(), "jsType", null);
        setField(term246996, term246996.getClass(), "parent", null);
        setField(term246995, term246995.getClass(), "next", term246996);
        setField(term246995, term246995.getClass(), "first", null);
        setField(term246995, term246995.getClass(), "last", null);
        setField(term246995, term246995.getClass(), "propListHead", null);
        setIntField(term246995, term246995.getClass(), "sourcePosition", 0);
        setField(term246995, term246995.getClass(), "jsType", null);
        setField(term246995, term246995.getClass(), "parent", null);
        setField(term246994, term246994.getClass(), "first", term246995);
        setField(term246994, term246994.getClass(), "last", null);
        setField(term246994, term246994.getClass(), "propListHead", null);
        setIntField(term246994, term246994.getClass(), "sourcePosition", 0);
        setField(term246994, term246994.getClass(), "jsType", null);
        setField(term246994, term246994.getClass(), "parent", null);
        term246885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term246885, term246885.getClass(), "number", 0.0);
        setIntField(term246885, term246885.getClass(), "type", 86);
        setField(term246885, term246885.getClass(), "next", null);
        setDoubleField(term246888, term246888.getClass(), "number", 0.0);
        setIntField(term246888, term246888.getClass(), "type", 0);
        setDoubleField(term246891, term246891.getClass(), "number", 0.0);
        setIntField(term246891, term246891.getClass(), "type", 0);
        setField(term246891, term246891.getClass(), "next", null);
        setField(term246894, term246894.getClass(), "functionName", null);
        setBooleanField(term246894, term246894.getClass(), "itsNeedsActivation", false);
        setIntField(term246894, term246894.getClass(), "itsFunctionType", 0);
        setBooleanField(term246894, term246894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246894, term246894.getClass(), "encodedSourceStart", 0);
        setIntField(term246894, term246894.getClass(), "encodedSourceEnd", 0);
        setField(term246894, term246894.getClass(), "sourceName", null);
        setIntField(term246894, term246894.getClass(), "baseLineno", 0);
        setIntField(term246894, term246894.getClass(), "endLineno", 0);
        setField(term246894, term246894.getClass(), "functions", null);
        setField(term246894, term246894.getClass(), "regexps", null);
        setField(term246894, term246894.getClass(), "itsVariables", null);
        setField(term246894, term246894.getClass(), "itsConst", null);
        setField(term246894, term246894.getClass(), "itsVariableNames", null);
        setIntField(term246894, term246894.getClass(), "varStart", 0);
        setField(term246894, term246894.getClass(), "compilerData", null);
        setIntField(term246894, term246894.getClass(), "type", 0);
        setField(term246894, term246894.getClass(), "next", null);
        setField(term246894, term246894.getClass(), "first", null);
        setField(term246894, term246894.getClass(), "last", null);
        setField(term246894, term246894.getClass(), "propListHead", null);
        setIntField(term246894, term246894.getClass(), "sourcePosition", 0);
        setField(term246894, term246894.getClass(), "jsType", null);
        setField(term246894, term246894.getClass(), "parent", null);
        setField(term246891, term246891.getClass(), "first", term246894);
        setField(term246891, term246891.getClass(), "last", null);
        setField(term246891, term246891.getClass(), "propListHead", null);
        setIntField(term246891, term246891.getClass(), "sourcePosition", 0);
        setField(term246891, term246891.getClass(), "jsType", null);
        setField(term246891, term246891.getClass(), "parent", null);
        setField(term246888, term246888.getClass(), "next", term246891);
        setField(term246888, term246888.getClass(), "first", null);
        setField(term246888, term246888.getClass(), "last", null);
        setField(term246888, term246888.getClass(), "propListHead", null);
        setIntField(term246888, term246888.getClass(), "sourcePosition", 0);
        setField(term246888, term246888.getClass(), "jsType", null);
        setField(term246888, term246888.getClass(), "parent", null);
        setField(term246885, term246885.getClass(), "first", term246888);
        setField(term246885, term246885.getClass(), "last", null);
        setField(term246885, term246885.getClass(), "propListHead", null);
        setIntField(term246885, term246885.getClass(), "sourcePosition", 0);
        setField(term246885, term246885.getClass(), "jsType", null);
        setField(term246885, term246885.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term246589;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term246497, args);
        assertTrue(recursiveEquals(term246497, term246993));
        assertTrue(recursiveEquals(term246589, term246994));
        assertTrue(recursiveEquals(retValue, term246885));
    }

};


