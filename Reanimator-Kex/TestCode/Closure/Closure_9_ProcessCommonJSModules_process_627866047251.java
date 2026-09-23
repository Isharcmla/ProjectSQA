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
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130366;
     Object term130458;

    public ProcessCommonJSModules_process_627866047251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130366 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term130366, term130366.getClass(), "compiler", null);
        term130458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term130458, term130458.getClass(), "type", 0);
        setField(term130458, term130458.getClass(), "parent", null);
        setField(term130642, term130642.getClass(), "next", term130712);
        setIntField(term130642, term130642.getClass(), "type", 33);
        setField(term130642, term130642.getClass(), "first", null);
        setField(term130550, term130550.getClass(), "next", term130642);
        setIntField(term130550, term130550.getClass(), "type", 0);
        setField(term130896, term130896.getClass(), "next", null);
        setIntField(term130896, term130896.getClass(), "type", 0);
        setField(term130896, term130896.getClass(), "first", null);
        setField(term130804, term130804.getClass(), "next", term130896);
        setIntField(term130804, term130804.getClass(), "type", 0);
        setField(term130804, term130804.getClass(), "first", null);
        setField(term130550, term130550.getClass(), "first", term130804);
        setField(term130458, term130458.getClass(), "first", term130550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term130458;
        callMethod(klass, "process", argTypes, term130366, args);
    }

};


