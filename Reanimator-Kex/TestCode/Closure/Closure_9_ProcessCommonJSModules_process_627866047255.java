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

public class ProcessCommonJSModules_process_627866047255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131529;
     Object term131621;
     Object term132148;

    public ProcessCommonJSModules_process_627866047255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131529 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term131529, term131529.getClass(), "compiler", null);
        term131621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term131713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term131805 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131621, term131621.getClass(), "type", 37);
        setField(term131621, term131621.getClass(), "parent", null);
        setField(term131805, term131805.getClass(), "next", null);
        setIntField(term131805, term131805.getClass(), "type", 0);
        setField(term131805, term131805.getClass(), "first", null);
        setField(term131713, term131713.getClass(), "next", term131805);
        setIntField(term131713, term131713.getClass(), "type", 37);
        setField(term131713, term131713.getClass(), "first", null);
        setField(term131621, term131621.getClass(), "first", term131713);
        term132148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132150 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term132148, term132148.getClass(), "number", 0.0);
        setIntField(term132148, term132148.getClass(), "type", 37);
        setField(term132148, term132148.getClass(), "next", null);
        setDoubleField(term132149, term132149.getClass(), "number", 0.0);
        setIntField(term132149, term132149.getClass(), "type", 37);
        setDoubleField(term132150, term132150.getClass(), "number", 0.0);
        setIntField(term132150, term132150.getClass(), "type", 0);
        setField(term132150, term132150.getClass(), "next", null);
        setField(term132150, term132150.getClass(), "first", null);
        setField(term132150, term132150.getClass(), "last", null);
        setField(term132150, term132150.getClass(), "propListHead", null);
        setIntField(term132150, term132150.getClass(), "sourcePosition", 0);
        setField(term132150, term132150.getClass(), "jsType", null);
        setField(term132150, term132150.getClass(), "parent", null);
        setField(term132149, term132149.getClass(), "next", term132150);
        setField(term132149, term132149.getClass(), "first", null);
        setField(term132149, term132149.getClass(), "last", null);
        setField(term132149, term132149.getClass(), "propListHead", null);
        setIntField(term132149, term132149.getClass(), "sourcePosition", 0);
        setField(term132149, term132149.getClass(), "jsType", null);
        setField(term132149, term132149.getClass(), "parent", null);
        setField(term132148, term132148.getClass(), "first", term132149);
        setField(term132148, term132148.getClass(), "last", null);
        setField(term132148, term132148.getClass(), "propListHead", null);
        setIntField(term132148, term132148.getClass(), "sourcePosition", 0);
        setField(term132148, term132148.getClass(), "jsType", null);
        setField(term132148, term132148.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term131621;
        callMethod(klass, "process", argTypes, term131529, args);
        assertTrue(recursiveEquals(term131621, null));
    }

};


