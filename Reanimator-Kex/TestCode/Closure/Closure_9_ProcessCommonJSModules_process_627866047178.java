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

public class ProcessCommonJSModules_process_627866047178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90995;
     Object term91167;

    public ProcessCommonJSModules_process_627866047178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90995 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term91075 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90995, term90995.getClass(), "compiler", term91075);
        term91167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term91167, term91167.getClass(), "type", 0);
        setField(term91167, term91167.getClass(), "parent", null);
        setField(term91259, term91259.getClass(), "next", term91351);
        setIntField(term91259, term91259.getClass(), "type", 37);
        setField(term91627, term91627.getClass(), "next", null);
        setIntField(term91627, term91627.getClass(), "type", 0);
        setField(term91627, term91627.getClass(), "first", null);
        setField(term91535, term91535.getClass(), "next", term91627);
        setIntField(term91535, term91535.getClass(), "type", 37);
        setField(term91535, term91535.getClass(), "first", null);
        setField(term91443, term91443.getClass(), "next", term91535);
        setIntField(term91443, term91443.getClass(), "type", 0);
        setField(term91443, term91443.getClass(), "first", null);
        setField(term91259, term91259.getClass(), "first", term91443);
        setField(term91167, term91167.getClass(), "first", term91259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91167;
        callMethod(klass, "process", argTypes, term90995, args);
    }

};


