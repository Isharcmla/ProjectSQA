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

public class PeepholeFoldConstants_tryFoldAdd_17496499311259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422214;
     Object term422306;
     Object term422392;
     Object term422484;
     Object term422936;
     Object term422937;
     Object term422938;
     Object term422939;
     Object term422899;

    public PeepholeFoldConstants_tryFoldAdd_17496499311259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422214 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term422306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term422306, term422306.getClass(), "type", 21);
        term422392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term422392, term422392.getClass(), "type", 21);
        term422484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term422936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term422936, term422936.getClass(), "currentTraversal", null);
        term422937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term422937, term422937.getClass(), "number", 0.0);
        setIntField(term422937, term422937.getClass(), "type", 21);
        setField(term422937, term422937.getClass(), "next", null);
        setField(term422937, term422937.getClass(), "first", null);
        setField(term422937, term422937.getClass(), "last", null);
        setField(term422937, term422937.getClass(), "propListHead", null);
        setIntField(term422937, term422937.getClass(), "sourcePosition", 0);
        setField(term422937, term422937.getClass(), "jsType", null);
        setField(term422937, term422937.getClass(), "parent", null);
        term422938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term422938, term422938.getClass(), "functionName", null);
        setBooleanField(term422938, term422938.getClass(), "itsNeedsActivation", false);
        setIntField(term422938, term422938.getClass(), "itsFunctionType", 0);
        setBooleanField(term422938, term422938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term422938, term422938.getClass(), "encodedSourceStart", 0);
        setIntField(term422938, term422938.getClass(), "encodedSourceEnd", 0);
        setField(term422938, term422938.getClass(), "sourceName", null);
        setIntField(term422938, term422938.getClass(), "baseLineno", 0);
        setIntField(term422938, term422938.getClass(), "endLineno", 0);
        setField(term422938, term422938.getClass(), "functions", null);
        setField(term422938, term422938.getClass(), "regexps", null);
        setField(term422938, term422938.getClass(), "itsVariables", null);
        setField(term422938, term422938.getClass(), "itsConst", null);
        setField(term422938, term422938.getClass(), "itsVariableNames", null);
        setIntField(term422938, term422938.getClass(), "varStart", 0);
        setField(term422938, term422938.getClass(), "compilerData", null);
        setIntField(term422938, term422938.getClass(), "type", 21);
        setField(term422938, term422938.getClass(), "next", null);
        setField(term422938, term422938.getClass(), "first", null);
        setField(term422938, term422938.getClass(), "last", null);
        setField(term422938, term422938.getClass(), "propListHead", null);
        setIntField(term422938, term422938.getClass(), "sourcePosition", 0);
        setField(term422938, term422938.getClass(), "jsType", null);
        setField(term422938, term422938.getClass(), "parent", null);
        term422939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term422939, term422939.getClass(), "number", 0.0);
        setIntField(term422939, term422939.getClass(), "type", 0);
        setField(term422939, term422939.getClass(), "next", null);
        setField(term422939, term422939.getClass(), "first", null);
        setField(term422939, term422939.getClass(), "last", null);
        setField(term422939, term422939.getClass(), "propListHead", null);
        setIntField(term422939, term422939.getClass(), "sourcePosition", 0);
        setField(term422939, term422939.getClass(), "jsType", null);
        setField(term422939, term422939.getClass(), "parent", null);
        term422899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term422899, term422899.getClass(), "number", 0.0);
        setIntField(term422899, term422899.getClass(), "type", 21);
        setField(term422899, term422899.getClass(), "next", null);
        setField(term422899, term422899.getClass(), "first", null);
        setField(term422899, term422899.getClass(), "last", null);
        setField(term422899, term422899.getClass(), "propListHead", null);
        setIntField(term422899, term422899.getClass(), "sourcePosition", 0);
        setField(term422899, term422899.getClass(), "jsType", null);
        setField(term422899, term422899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term422306;
        args[1] = term422392;
        args[2] = term422484;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term422214, args);
        assertTrue(recursiveEquals(term422214, term422936));
        assertTrue(recursiveEquals(term422306, term422937));
        assertTrue(recursiveEquals(term422392, term422938));
        assertTrue(recursiveEquals(term422484, term422939));
        assertTrue(recursiveEquals(retValue, term422899));
    }

};


