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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886653;
     Object term886739;
     Object term886917;
     Object term887009;
     Object term887510;
     Object term887511;
     Object term887513;
     Object term887514;
     Object term887439;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term886739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term886825 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term886739, term886739.getClass(), "parent", term886825);
        setIntField(term886739, term886739.getClass(), "type", 0);
        term886917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term886917, term886917.getClass(), "type", 0);
        term887009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term887009, term887009.getClass(), "type", 44);
        term887510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term887510, term887510.getClass(), "currentTraversal", null);
        term887511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term887512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term887511, term887511.getClass(), "functionName", null);
        setBooleanField(term887511, term887511.getClass(), "itsNeedsActivation", false);
        setIntField(term887511, term887511.getClass(), "itsFunctionType", 0);
        setBooleanField(term887511, term887511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887511, term887511.getClass(), "encodedSourceStart", 0);
        setIntField(term887511, term887511.getClass(), "encodedSourceEnd", 0);
        setField(term887511, term887511.getClass(), "sourceName", null);
        setIntField(term887511, term887511.getClass(), "baseLineno", 0);
        setIntField(term887511, term887511.getClass(), "endLineno", 0);
        setField(term887511, term887511.getClass(), "functions", null);
        setField(term887511, term887511.getClass(), "regexps", null);
        setField(term887511, term887511.getClass(), "itsVariables", null);
        setField(term887511, term887511.getClass(), "itsConst", null);
        setField(term887511, term887511.getClass(), "itsVariableNames", null);
        setIntField(term887511, term887511.getClass(), "varStart", 0);
        setField(term887511, term887511.getClass(), "compilerData", null);
        setIntField(term887511, term887511.getClass(), "type", 0);
        setField(term887511, term887511.getClass(), "next", null);
        setField(term887511, term887511.getClass(), "first", null);
        setField(term887511, term887511.getClass(), "last", null);
        setField(term887511, term887511.getClass(), "propListHead", null);
        setIntField(term887511, term887511.getClass(), "sourcePosition", 0);
        setField(term887511, term887511.getClass(), "jsType", null);
        setField(term887512, term887512.getClass(), "functionName", null);
        setBooleanField(term887512, term887512.getClass(), "itsNeedsActivation", false);
        setIntField(term887512, term887512.getClass(), "itsFunctionType", 0);
        setBooleanField(term887512, term887512.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887512, term887512.getClass(), "encodedSourceStart", 0);
        setIntField(term887512, term887512.getClass(), "encodedSourceEnd", 0);
        setField(term887512, term887512.getClass(), "sourceName", null);
        setIntField(term887512, term887512.getClass(), "baseLineno", 0);
        setIntField(term887512, term887512.getClass(), "endLineno", 0);
        setField(term887512, term887512.getClass(), "functions", null);
        setField(term887512, term887512.getClass(), "regexps", null);
        setField(term887512, term887512.getClass(), "itsVariables", null);
        setField(term887512, term887512.getClass(), "itsConst", null);
        setField(term887512, term887512.getClass(), "itsVariableNames", null);
        setIntField(term887512, term887512.getClass(), "varStart", 0);
        setField(term887512, term887512.getClass(), "compilerData", null);
        setIntField(term887512, term887512.getClass(), "type", 0);
        setField(term887512, term887512.getClass(), "next", null);
        setField(term887512, term887512.getClass(), "first", null);
        setField(term887512, term887512.getClass(), "last", null);
        setField(term887512, term887512.getClass(), "propListHead", null);
        setIntField(term887512, term887512.getClass(), "sourcePosition", 0);
        setField(term887512, term887512.getClass(), "jsType", null);
        setField(term887512, term887512.getClass(), "parent", null);
        setField(term887511, term887511.getClass(), "parent", term887512);
        term887513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term887513, term887513.getClass(), "str", null);
        setIntField(term887513, term887513.getClass(), "type", 0);
        setField(term887513, term887513.getClass(), "next", null);
        setField(term887513, term887513.getClass(), "first", null);
        setField(term887513, term887513.getClass(), "last", null);
        setField(term887513, term887513.getClass(), "propListHead", null);
        setIntField(term887513, term887513.getClass(), "sourcePosition", 0);
        setField(term887513, term887513.getClass(), "jsType", null);
        setField(term887513, term887513.getClass(), "parent", null);
        term887514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term887514, term887514.getClass(), "str", null);
        setIntField(term887514, term887514.getClass(), "type", 44);
        setField(term887514, term887514.getClass(), "next", null);
        setField(term887514, term887514.getClass(), "first", null);
        setField(term887514, term887514.getClass(), "last", null);
        setField(term887514, term887514.getClass(), "propListHead", null);
        setIntField(term887514, term887514.getClass(), "sourcePosition", 0);
        setField(term887514, term887514.getClass(), "jsType", null);
        setField(term887514, term887514.getClass(), "parent", null);
        term887439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term887450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term887439, term887439.getClass(), "functionName", null);
        setBooleanField(term887439, term887439.getClass(), "itsNeedsActivation", false);
        setIntField(term887439, term887439.getClass(), "itsFunctionType", 0);
        setBooleanField(term887439, term887439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887439, term887439.getClass(), "encodedSourceStart", 0);
        setIntField(term887439, term887439.getClass(), "encodedSourceEnd", 0);
        setField(term887439, term887439.getClass(), "sourceName", null);
        setIntField(term887439, term887439.getClass(), "baseLineno", 0);
        setIntField(term887439, term887439.getClass(), "endLineno", 0);
        setField(term887439, term887439.getClass(), "functions", null);
        setField(term887439, term887439.getClass(), "regexps", null);
        setField(term887439, term887439.getClass(), "itsVariables", null);
        setField(term887439, term887439.getClass(), "itsConst", null);
        setField(term887439, term887439.getClass(), "itsVariableNames", null);
        setIntField(term887439, term887439.getClass(), "varStart", 0);
        setField(term887439, term887439.getClass(), "compilerData", null);
        setIntField(term887439, term887439.getClass(), "type", 0);
        setField(term887439, term887439.getClass(), "next", null);
        setField(term887439, term887439.getClass(), "first", null);
        setField(term887439, term887439.getClass(), "last", null);
        setField(term887439, term887439.getClass(), "propListHead", null);
        setIntField(term887439, term887439.getClass(), "sourcePosition", 0);
        setField(term887439, term887439.getClass(), "jsType", null);
        setField(term887450, term887450.getClass(), "functionName", null);
        setBooleanField(term887450, term887450.getClass(), "itsNeedsActivation", false);
        setIntField(term887450, term887450.getClass(), "itsFunctionType", 0);
        setBooleanField(term887450, term887450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887450, term887450.getClass(), "encodedSourceStart", 0);
        setIntField(term887450, term887450.getClass(), "encodedSourceEnd", 0);
        setField(term887450, term887450.getClass(), "sourceName", null);
        setIntField(term887450, term887450.getClass(), "baseLineno", 0);
        setIntField(term887450, term887450.getClass(), "endLineno", 0);
        setField(term887450, term887450.getClass(), "functions", null);
        setField(term887450, term887450.getClass(), "regexps", null);
        setField(term887450, term887450.getClass(), "itsVariables", null);
        setField(term887450, term887450.getClass(), "itsConst", null);
        setField(term887450, term887450.getClass(), "itsVariableNames", null);
        setIntField(term887450, term887450.getClass(), "varStart", 0);
        setField(term887450, term887450.getClass(), "compilerData", null);
        setIntField(term887450, term887450.getClass(), "type", 0);
        setField(term887450, term887450.getClass(), "next", null);
        setField(term887450, term887450.getClass(), "first", null);
        setField(term887450, term887450.getClass(), "last", null);
        setField(term887450, term887450.getClass(), "propListHead", null);
        setIntField(term887450, term887450.getClass(), "sourcePosition", 0);
        setField(term887450, term887450.getClass(), "jsType", null);
        setField(term887450, term887450.getClass(), "parent", null);
        setField(term887439, term887439.getClass(), "parent", term887450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term886739;
        args[1] = term886917;
        args[2] = term887009;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term886653, args);
        assertTrue(recursiveEquals(term886653, term887510));
        assertTrue(recursiveEquals(term886739, term887511));
        assertTrue(recursiveEquals(term886917, term887513));
        assertTrue(recursiveEquals(term887009, term887514));
        assertTrue(recursiveEquals(retValue, term887439));
    }

};


