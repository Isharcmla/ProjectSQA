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

public class ProcessCommonJSModules_process_62786604767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24612;
     Object term24704;
     Object term25129;
     Object term25130;

    public ProcessCommonJSModules_process_62786604767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24612 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term24612, term24612.getClass(), "compiler", null);
        term24704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24704, term24704.getClass(), "type", 0);
        setField(term24704, term24704.getClass(), "parent", null);
        setField(term24796, term24796.getClass(), "next", term24888);
        setIntField(term24796, term24796.getClass(), "type", 0);
        setField(term24796, term24796.getClass(), "first", null);
        setField(term24704, term24704.getClass(), "first", term24796);
        term25129 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term25129, term25129.getClass(), "compiler", null);
        setField(term25129, term25129.getClass(), "filenamePrefix", null);
        setBooleanField(term25129, term25129.getClass(), "reportDependencies", false);
        setField(term25129, term25129.getClass(), "module", null);
        term25130 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25132 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term25130, term25130.getClass(), "number", 0.0);
        setIntField(term25130, term25130.getClass(), "type", 0);
        setField(term25130, term25130.getClass(), "next", null);
        setDoubleField(term25131, term25131.getClass(), "number", 0.0);
        setIntField(term25131, term25131.getClass(), "type", 0);
        setDoubleField(term25132, term25132.getClass(), "number", 0.0);
        setIntField(term25132, term25132.getClass(), "type", 0);
        setField(term25132, term25132.getClass(), "next", null);
        setField(term25132, term25132.getClass(), "first", null);
        setField(term25132, term25132.getClass(), "last", null);
        setField(term25132, term25132.getClass(), "propListHead", null);
        setIntField(term25132, term25132.getClass(), "sourcePosition", 0);
        setField(term25132, term25132.getClass(), "jsType", null);
        setField(term25132, term25132.getClass(), "parent", null);
        setField(term25131, term25131.getClass(), "next", term25132);
        setField(term25131, term25131.getClass(), "first", null);
        setField(term25131, term25131.getClass(), "last", null);
        setField(term25131, term25131.getClass(), "propListHead", null);
        setIntField(term25131, term25131.getClass(), "sourcePosition", 0);
        setField(term25131, term25131.getClass(), "jsType", null);
        setField(term25131, term25131.getClass(), "parent", null);
        setField(term25130, term25130.getClass(), "first", term25131);
        setField(term25130, term25130.getClass(), "last", null);
        setField(term25130, term25130.getClass(), "propListHead", null);
        setIntField(term25130, term25130.getClass(), "sourcePosition", 0);
        setField(term25130, term25130.getClass(), "jsType", null);
        setField(term25130, term25130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24704;
        callMethod(klass, "process", argTypes, term24612, args);
        assertTrue(recursiveEquals(term24612, term25129));
        assertTrue(recursiveEquals(term24704, null));
    }

};


