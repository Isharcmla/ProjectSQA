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

public class ProcessCommonJSModules_process_62786604771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26629;
     Object term26699;
     Object term27121;
     Object term27122;

    public ProcessCommonJSModules_process_62786604771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26629 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term26629, term26629.getClass(), "compiler", null);
        term26699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term26883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term26699, term26699.getClass(), "type", 0);
        setField(term26699, term26699.getClass(), "parent", null);
        setField(term26791, term26791.getClass(), "next", null);
        setIntField(term26791, term26791.getClass(), "type", 0);
        setField(term26883, term26883.getClass(), "next", null);
        setIntField(term26883, term26883.getClass(), "type", 0);
        setField(term26883, term26883.getClass(), "first", null);
        setField(term26791, term26791.getClass(), "first", term26883);
        setField(term26699, term26699.getClass(), "first", term26791);
        term27121 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term27121, term27121.getClass(), "compiler", null);
        setField(term27121, term27121.getClass(), "filenamePrefix", null);
        setBooleanField(term27121, term27121.getClass(), "reportDependencies", false);
        setField(term27121, term27121.getClass(), "module", null);
        term27122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27123 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27122, term27122.getClass(), "type", 0);
        setField(term27122, term27122.getClass(), "next", null);
        setDoubleField(term27123, term27123.getClass(), "number", 0.0);
        setIntField(term27123, term27123.getClass(), "type", 0);
        setField(term27123, term27123.getClass(), "next", null);
        setDoubleField(term27124, term27124.getClass(), "number", 0.0);
        setIntField(term27124, term27124.getClass(), "type", 0);
        setField(term27124, term27124.getClass(), "next", null);
        setField(term27124, term27124.getClass(), "first", null);
        setField(term27124, term27124.getClass(), "last", null);
        setField(term27124, term27124.getClass(), "propListHead", null);
        setIntField(term27124, term27124.getClass(), "sourcePosition", 0);
        setField(term27124, term27124.getClass(), "jsType", null);
        setField(term27124, term27124.getClass(), "parent", null);
        setField(term27123, term27123.getClass(), "first", term27124);
        setField(term27123, term27123.getClass(), "last", null);
        setField(term27123, term27123.getClass(), "propListHead", null);
        setIntField(term27123, term27123.getClass(), "sourcePosition", 0);
        setField(term27123, term27123.getClass(), "jsType", null);
        setField(term27123, term27123.getClass(), "parent", null);
        setField(term27122, term27122.getClass(), "first", term27123);
        setField(term27122, term27122.getClass(), "last", null);
        setField(term27122, term27122.getClass(), "propListHead", null);
        setIntField(term27122, term27122.getClass(), "sourcePosition", 0);
        setField(term27122, term27122.getClass(), "jsType", null);
        setField(term27122, term27122.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26699;
        callMethod(klass, "process", argTypes, term26629, args);
        assertTrue(recursiveEquals(term26629, term27121));
        assertTrue(recursiveEquals(term26699, null));
    }

};


