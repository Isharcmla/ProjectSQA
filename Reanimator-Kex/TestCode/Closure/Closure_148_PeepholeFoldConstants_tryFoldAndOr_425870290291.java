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

public class PeepholeFoldConstants_tryFoldAndOr_425870290291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56025;
     Object term56111;
     Object term56197;
     Object term56289;
     Object term56824;
     Object term56825;
     Object term56826;
     Object term56827;
     Object term56769;

    public PeepholeFoldConstants_tryFoldAndOr_425870290291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term56111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56111, term56111.getClass(), "parent", null);
        setIntField(term56111, term56111.getClass(), "type", 0);
        term56197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term56197, term56197.getClass(), "type", 0);
        term56289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term56824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term56824, term56824.getClass(), "currentTraversal", null);
        term56825 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56825, term56825.getClass(), "functionName", null);
        setBooleanField(term56825, term56825.getClass(), "itsNeedsActivation", false);
        setIntField(term56825, term56825.getClass(), "itsFunctionType", 0);
        setBooleanField(term56825, term56825.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56825, term56825.getClass(), "encodedSourceStart", 0);
        setIntField(term56825, term56825.getClass(), "encodedSourceEnd", 0);
        setField(term56825, term56825.getClass(), "sourceName", null);
        setIntField(term56825, term56825.getClass(), "baseLineno", 0);
        setIntField(term56825, term56825.getClass(), "endLineno", 0);
        setField(term56825, term56825.getClass(), "functions", null);
        setField(term56825, term56825.getClass(), "regexps", null);
        setField(term56825, term56825.getClass(), "itsVariables", null);
        setField(term56825, term56825.getClass(), "itsConst", null);
        setField(term56825, term56825.getClass(), "itsVariableNames", null);
        setIntField(term56825, term56825.getClass(), "varStart", 0);
        setField(term56825, term56825.getClass(), "compilerData", null);
        setIntField(term56825, term56825.getClass(), "type", 0);
        setField(term56825, term56825.getClass(), "next", null);
        setField(term56825, term56825.getClass(), "first", null);
        setField(term56825, term56825.getClass(), "last", null);
        setField(term56825, term56825.getClass(), "propListHead", null);
        setIntField(term56825, term56825.getClass(), "sourcePosition", 0);
        setField(term56825, term56825.getClass(), "jsType", null);
        setField(term56825, term56825.getClass(), "parent", null);
        term56826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56826, term56826.getClass(), "functionName", null);
        setBooleanField(term56826, term56826.getClass(), "itsNeedsActivation", false);
        setIntField(term56826, term56826.getClass(), "itsFunctionType", 0);
        setBooleanField(term56826, term56826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56826, term56826.getClass(), "encodedSourceStart", 0);
        setIntField(term56826, term56826.getClass(), "encodedSourceEnd", 0);
        setField(term56826, term56826.getClass(), "sourceName", null);
        setIntField(term56826, term56826.getClass(), "baseLineno", 0);
        setIntField(term56826, term56826.getClass(), "endLineno", 0);
        setField(term56826, term56826.getClass(), "functions", null);
        setField(term56826, term56826.getClass(), "regexps", null);
        setField(term56826, term56826.getClass(), "itsVariables", null);
        setField(term56826, term56826.getClass(), "itsConst", null);
        setField(term56826, term56826.getClass(), "itsVariableNames", null);
        setIntField(term56826, term56826.getClass(), "varStart", 0);
        setField(term56826, term56826.getClass(), "compilerData", null);
        setIntField(term56826, term56826.getClass(), "type", 0);
        setField(term56826, term56826.getClass(), "next", null);
        setField(term56826, term56826.getClass(), "first", null);
        setField(term56826, term56826.getClass(), "last", null);
        setField(term56826, term56826.getClass(), "propListHead", null);
        setIntField(term56826, term56826.getClass(), "sourcePosition", 0);
        setField(term56826, term56826.getClass(), "jsType", null);
        setField(term56826, term56826.getClass(), "parent", null);
        term56827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term56827, term56827.getClass(), "number", 0.0);
        setIntField(term56827, term56827.getClass(), "type", 0);
        setField(term56827, term56827.getClass(), "next", null);
        setField(term56827, term56827.getClass(), "first", null);
        setField(term56827, term56827.getClass(), "last", null);
        setField(term56827, term56827.getClass(), "propListHead", null);
        setIntField(term56827, term56827.getClass(), "sourcePosition", 0);
        setField(term56827, term56827.getClass(), "jsType", null);
        setField(term56827, term56827.getClass(), "parent", null);
        term56769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56769, term56769.getClass(), "functionName", null);
        setBooleanField(term56769, term56769.getClass(), "itsNeedsActivation", false);
        setIntField(term56769, term56769.getClass(), "itsFunctionType", 0);
        setBooleanField(term56769, term56769.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56769, term56769.getClass(), "encodedSourceStart", 0);
        setIntField(term56769, term56769.getClass(), "encodedSourceEnd", 0);
        setField(term56769, term56769.getClass(), "sourceName", null);
        setIntField(term56769, term56769.getClass(), "baseLineno", 0);
        setIntField(term56769, term56769.getClass(), "endLineno", 0);
        setField(term56769, term56769.getClass(), "functions", null);
        setField(term56769, term56769.getClass(), "regexps", null);
        setField(term56769, term56769.getClass(), "itsVariables", null);
        setField(term56769, term56769.getClass(), "itsConst", null);
        setField(term56769, term56769.getClass(), "itsVariableNames", null);
        setIntField(term56769, term56769.getClass(), "varStart", 0);
        setField(term56769, term56769.getClass(), "compilerData", null);
        setIntField(term56769, term56769.getClass(), "type", 0);
        setField(term56769, term56769.getClass(), "next", null);
        setField(term56769, term56769.getClass(), "first", null);
        setField(term56769, term56769.getClass(), "last", null);
        setField(term56769, term56769.getClass(), "propListHead", null);
        setIntField(term56769, term56769.getClass(), "sourcePosition", 0);
        setField(term56769, term56769.getClass(), "jsType", null);
        setField(term56769, term56769.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term56111;
        args[1] = term56197;
        args[2] = term56289;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term56025, args);
        assertTrue(recursiveEquals(term56025, term56824));
        assertTrue(recursiveEquals(term56111, term56825));
        assertTrue(recursiveEquals(term56197, term56826));
        assertTrue(recursiveEquals(term56289, term56827));
        assertTrue(recursiveEquals(retValue, term56769));
    }

};


