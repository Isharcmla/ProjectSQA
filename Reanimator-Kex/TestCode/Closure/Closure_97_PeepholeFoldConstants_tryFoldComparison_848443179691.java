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

public class PeepholeFoldConstants_tryFoldComparison_848443179691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177853;
     Object term177945;
     Object term178037;
     Object term178123;
     Object term178618;
     Object term178619;
     Object term178620;
     Object term178621;
     Object term178587;

    public PeepholeFoldConstants_tryFoldComparison_848443179691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177853 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term177945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177945, term177945.getClass(), "type", 14);
        term178037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term178037, term178037.getClass(), "type", 42);
        term178123 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term178123, term178123.getClass(), "type", 42);
        term178618 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term178618, term178618.getClass(), "currentTraversal", null);
        term178619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term178619, term178619.getClass(), "number", 0.0);
        setIntField(term178619, term178619.getClass(), "type", 42);
        setField(term178619, term178619.getClass(), "next", null);
        setField(term178619, term178619.getClass(), "first", null);
        setField(term178619, term178619.getClass(), "last", null);
        setField(term178619, term178619.getClass(), "propListHead", null);
        setIntField(term178619, term178619.getClass(), "sourcePosition", 0);
        setField(term178619, term178619.getClass(), "jsType", null);
        setField(term178619, term178619.getClass(), "parent", null);
        term178620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term178620, term178620.getClass(), "number", 0.0);
        setIntField(term178620, term178620.getClass(), "type", 14);
        setField(term178620, term178620.getClass(), "next", null);
        setField(term178620, term178620.getClass(), "first", null);
        setField(term178620, term178620.getClass(), "last", null);
        setField(term178620, term178620.getClass(), "propListHead", null);
        setIntField(term178620, term178620.getClass(), "sourcePosition", 0);
        setField(term178620, term178620.getClass(), "jsType", null);
        setField(term178620, term178620.getClass(), "parent", null);
        term178621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term178621, term178621.getClass(), "functionName", null);
        setBooleanField(term178621, term178621.getClass(), "itsNeedsActivation", false);
        setIntField(term178621, term178621.getClass(), "itsFunctionType", 0);
        setBooleanField(term178621, term178621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178621, term178621.getClass(), "encodedSourceStart", 0);
        setIntField(term178621, term178621.getClass(), "encodedSourceEnd", 0);
        setField(term178621, term178621.getClass(), "sourceName", null);
        setIntField(term178621, term178621.getClass(), "baseLineno", 0);
        setIntField(term178621, term178621.getClass(), "endLineno", 0);
        setField(term178621, term178621.getClass(), "functions", null);
        setField(term178621, term178621.getClass(), "regexps", null);
        setField(term178621, term178621.getClass(), "itsVariables", null);
        setField(term178621, term178621.getClass(), "itsConst", null);
        setField(term178621, term178621.getClass(), "itsVariableNames", null);
        setIntField(term178621, term178621.getClass(), "varStart", 0);
        setField(term178621, term178621.getClass(), "compilerData", null);
        setIntField(term178621, term178621.getClass(), "type", 42);
        setField(term178621, term178621.getClass(), "next", null);
        setField(term178621, term178621.getClass(), "first", null);
        setField(term178621, term178621.getClass(), "last", null);
        setField(term178621, term178621.getClass(), "propListHead", null);
        setIntField(term178621, term178621.getClass(), "sourcePosition", 0);
        setField(term178621, term178621.getClass(), "jsType", null);
        setField(term178621, term178621.getClass(), "parent", null);
        term178587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term178587, term178587.getClass(), "number", 0.0);
        setIntField(term178587, term178587.getClass(), "type", 14);
        setField(term178587, term178587.getClass(), "next", null);
        setField(term178587, term178587.getClass(), "first", null);
        setField(term178587, term178587.getClass(), "last", null);
        setField(term178587, term178587.getClass(), "propListHead", null);
        setIntField(term178587, term178587.getClass(), "sourcePosition", 0);
        setField(term178587, term178587.getClass(), "jsType", null);
        setField(term178587, term178587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term177945;
        args[1] = term178037;
        args[2] = term178123;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term177853, args);
        assertTrue(recursiveEquals(term177853, term178618));
        assertTrue(recursiveEquals(term177945, term178619));
        assertTrue(recursiveEquals(term178037, term178620));
        assertTrue(recursiveEquals(term178123, term178621));
        assertTrue(recursiveEquals(retValue, term178587));
    }

};


