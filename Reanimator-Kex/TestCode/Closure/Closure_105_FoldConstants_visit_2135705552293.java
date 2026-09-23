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

public class FoldConstants_visit_2135705552293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78989;
     Object term79075;
     Object term79222;
     Object term79223;

    public FoldConstants_visit_2135705552293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78989 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term79075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term79161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term79075, term79075.getClass(), "type", 130);
        setField(term79075, term79075.getClass(), "first", term79161);
        term79222 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term79222, term79222.getClass(), "compiler", null);
        term79223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term79224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term79223, term79223.getClass(), "functionName", null);
        setBooleanField(term79223, term79223.getClass(), "itsNeedsActivation", false);
        setIntField(term79223, term79223.getClass(), "itsFunctionType", 0);
        setBooleanField(term79223, term79223.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term79223, term79223.getClass(), "encodedSourceStart", 0);
        setIntField(term79223, term79223.getClass(), "encodedSourceEnd", 0);
        setField(term79223, term79223.getClass(), "sourceName", null);
        setIntField(term79223, term79223.getClass(), "baseLineno", 0);
        setIntField(term79223, term79223.getClass(), "endLineno", 0);
        setField(term79223, term79223.getClass(), "functions", null);
        setField(term79223, term79223.getClass(), "regexps", null);
        setField(term79223, term79223.getClass(), "itsVariables", null);
        setField(term79223, term79223.getClass(), "itsConst", null);
        setField(term79223, term79223.getClass(), "itsVariableNames", null);
        setIntField(term79223, term79223.getClass(), "varStart", 0);
        setField(term79223, term79223.getClass(), "compilerData", null);
        setIntField(term79223, term79223.getClass(), "type", 130);
        setField(term79223, term79223.getClass(), "next", null);
        setField(term79224, term79224.getClass(), "functionName", null);
        setBooleanField(term79224, term79224.getClass(), "itsNeedsActivation", false);
        setIntField(term79224, term79224.getClass(), "itsFunctionType", 0);
        setBooleanField(term79224, term79224.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term79224, term79224.getClass(), "encodedSourceStart", 0);
        setIntField(term79224, term79224.getClass(), "encodedSourceEnd", 0);
        setField(term79224, term79224.getClass(), "sourceName", null);
        setIntField(term79224, term79224.getClass(), "baseLineno", 0);
        setIntField(term79224, term79224.getClass(), "endLineno", 0);
        setField(term79224, term79224.getClass(), "functions", null);
        setField(term79224, term79224.getClass(), "regexps", null);
        setField(term79224, term79224.getClass(), "itsVariables", null);
        setField(term79224, term79224.getClass(), "itsConst", null);
        setField(term79224, term79224.getClass(), "itsVariableNames", null);
        setIntField(term79224, term79224.getClass(), "varStart", 0);
        setField(term79224, term79224.getClass(), "compilerData", null);
        setIntField(term79224, term79224.getClass(), "type", 0);
        setField(term79224, term79224.getClass(), "next", null);
        setField(term79224, term79224.getClass(), "first", null);
        setField(term79224, term79224.getClass(), "last", null);
        setField(term79224, term79224.getClass(), "propListHead", null);
        setIntField(term79224, term79224.getClass(), "sourcePosition", 0);
        setField(term79224, term79224.getClass(), "jsType", null);
        setField(term79224, term79224.getClass(), "parent", null);
        setField(term79223, term79223.getClass(), "first", term79224);
        setField(term79223, term79223.getClass(), "last", null);
        setField(term79223, term79223.getClass(), "propListHead", null);
        setIntField(term79223, term79223.getClass(), "sourcePosition", 0);
        setField(term79223, term79223.getClass(), "jsType", null);
        setField(term79223, term79223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term79075;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term78989, args);
        assertTrue(recursiveEquals(term78989, term79222));
        assertTrue(recursiveEquals(term79075, null));
    }

};


