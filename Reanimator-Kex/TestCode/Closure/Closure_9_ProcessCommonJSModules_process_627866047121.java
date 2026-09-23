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

public class ProcessCommonJSModules_process_627866047121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55386;
     Object term55478;
     Object term55900;
     Object term55901;

    public ProcessCommonJSModules_process_627866047121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55386 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term55386, term55386.getClass(), "compiler", null);
        term55478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55478, term55478.getClass(), "type", 37);
        setField(term55478, term55478.getClass(), "parent", null);
        setField(term55570, term55570.getClass(), "next", null);
        setIntField(term55570, term55570.getClass(), "type", 0);
        setField(term55662, term55662.getClass(), "next", null);
        setIntField(term55662, term55662.getClass(), "type", 0);
        setField(term55662, term55662.getClass(), "first", null);
        setField(term55570, term55570.getClass(), "first", term55662);
        setField(term55478, term55478.getClass(), "first", term55570);
        term55900 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term55900, term55900.getClass(), "compiler", null);
        setField(term55900, term55900.getClass(), "filenamePrefix", null);
        setBooleanField(term55900, term55900.getClass(), "reportDependencies", false);
        setField(term55900, term55900.getClass(), "module", null);
        term55901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term55901, term55901.getClass(), "number", 0.0);
        setIntField(term55901, term55901.getClass(), "type", 37);
        setField(term55901, term55901.getClass(), "next", null);
        setDoubleField(term55902, term55902.getClass(), "number", 0.0);
        setIntField(term55902, term55902.getClass(), "type", 0);
        setField(term55902, term55902.getClass(), "next", null);
        setDoubleField(term55903, term55903.getClass(), "number", 0.0);
        setIntField(term55903, term55903.getClass(), "type", 0);
        setField(term55903, term55903.getClass(), "next", null);
        setField(term55903, term55903.getClass(), "first", null);
        setField(term55903, term55903.getClass(), "last", null);
        setField(term55903, term55903.getClass(), "propListHead", null);
        setIntField(term55903, term55903.getClass(), "sourcePosition", 0);
        setField(term55903, term55903.getClass(), "jsType", null);
        setField(term55903, term55903.getClass(), "parent", null);
        setField(term55902, term55902.getClass(), "first", term55903);
        setField(term55902, term55902.getClass(), "last", null);
        setField(term55902, term55902.getClass(), "propListHead", null);
        setIntField(term55902, term55902.getClass(), "sourcePosition", 0);
        setField(term55902, term55902.getClass(), "jsType", null);
        setField(term55902, term55902.getClass(), "parent", null);
        setField(term55901, term55901.getClass(), "first", term55902);
        setField(term55901, term55901.getClass(), "last", null);
        setField(term55901, term55901.getClass(), "propListHead", null);
        setIntField(term55901, term55901.getClass(), "sourcePosition", 0);
        setField(term55901, term55901.getClass(), "jsType", null);
        setField(term55901, term55901.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55478;
        callMethod(klass, "process", argTypes, term55386, args);
        assertTrue(recursiveEquals(term55386, term55900));
        assertTrue(recursiveEquals(term55478, null));
    }

};


