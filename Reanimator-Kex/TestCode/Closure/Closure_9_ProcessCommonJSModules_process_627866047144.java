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

public class ProcessCommonJSModules_process_627866047144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67169;
     Object term67261;
     Object term68598;
     Object term68599;

    public ProcessCommonJSModules_process_627866047144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67169 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term67169, term67169.getClass(), "compiler", null);
        term67261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term67353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term67445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term67537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term67261, term67261.getClass(), "type", 0);
        setField(term67261, term67261.getClass(), "parent", null);
        setField(term67445, term67445.getClass(), "next", null);
        setIntField(term67445, term67445.getClass(), "type", 37);
        setField(term67445, term67445.getClass(), "first", null);
        setField(term67353, term67353.getClass(), "next", term67445);
        setIntField(term67353, term67353.getClass(), "type", 37);
        setField(term67537, term67537.getClass(), "next", null);
        setIntField(term67537, term67537.getClass(), "type", 0);
        setField(term67537, term67537.getClass(), "first", null);
        setField(term67353, term67353.getClass(), "first", term67537);
        setField(term67261, term67261.getClass(), "first", term67353);
        term68598 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term68598, term68598.getClass(), "compiler", null);
        setField(term68598, term68598.getClass(), "filenamePrefix", null);
        setBooleanField(term68598, term68598.getClass(), "reportDependencies", false);
        setField(term68598, term68598.getClass(), "module", null);
        term68599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term68600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term68601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term68602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term68599, term68599.getClass(), "number", 0.0);
        setIntField(term68599, term68599.getClass(), "type", 0);
        setField(term68599, term68599.getClass(), "next", null);
        setDoubleField(term68600, term68600.getClass(), "number", 0.0);
        setIntField(term68600, term68600.getClass(), "type", 37);
        setDoubleField(term68601, term68601.getClass(), "number", 0.0);
        setIntField(term68601, term68601.getClass(), "type", 37);
        setField(term68601, term68601.getClass(), "next", null);
        setField(term68601, term68601.getClass(), "first", null);
        setField(term68601, term68601.getClass(), "last", null);
        setField(term68601, term68601.getClass(), "propListHead", null);
        setIntField(term68601, term68601.getClass(), "sourcePosition", 0);
        setField(term68601, term68601.getClass(), "jsType", null);
        setField(term68601, term68601.getClass(), "parent", null);
        setField(term68600, term68600.getClass(), "next", term68601);
        setDoubleField(term68602, term68602.getClass(), "number", 0.0);
        setIntField(term68602, term68602.getClass(), "type", 0);
        setField(term68602, term68602.getClass(), "next", null);
        setField(term68602, term68602.getClass(), "first", null);
        setField(term68602, term68602.getClass(), "last", null);
        setField(term68602, term68602.getClass(), "propListHead", null);
        setIntField(term68602, term68602.getClass(), "sourcePosition", 0);
        setField(term68602, term68602.getClass(), "jsType", null);
        setField(term68602, term68602.getClass(), "parent", null);
        setField(term68600, term68600.getClass(), "first", term68602);
        setField(term68600, term68600.getClass(), "last", null);
        setField(term68600, term68600.getClass(), "propListHead", null);
        setIntField(term68600, term68600.getClass(), "sourcePosition", 0);
        setField(term68600, term68600.getClass(), "jsType", null);
        setField(term68600, term68600.getClass(), "parent", null);
        setField(term68599, term68599.getClass(), "first", term68600);
        setField(term68599, term68599.getClass(), "last", null);
        setField(term68599, term68599.getClass(), "propListHead", null);
        setIntField(term68599, term68599.getClass(), "sourcePosition", 0);
        setField(term68599, term68599.getClass(), "jsType", null);
        setField(term68599, term68599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term67261;
        callMethod(klass, "process", argTypes, term67169, args);
        assertTrue(recursiveEquals(term67169, term68598));
        assertTrue(recursiveEquals(term67261, null));
    }

};


