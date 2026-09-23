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

public class ProcessCommonJSModules_process_627866047214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109221;
     Object term109291;

    public ProcessCommonJSModules_process_627866047214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109221 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term109221, term109221.getClass(), "compiler", null);
        term109291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109751 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109291, term109291.getClass(), "type", 37);
        setField(term109291, term109291.getClass(), "parent", null);
        setField(term109475, term109475.getClass(), "next", null);
        setIntField(term109475, term109475.getClass(), "type", 0);
        setField(term109475, term109475.getClass(), "first", null);
        setField(term109383, term109383.getClass(), "next", term109475);
        setIntField(term109383, term109383.getClass(), "type", 0);
        setField(term109751, term109751.getClass(), "next", null);
        setIntField(term109751, term109751.getClass(), "type", 0);
        setField(term109751, term109751.getClass(), "first", null);
        setField(term109659, term109659.getClass(), "next", term109751);
        setIntField(term109659, term109659.getClass(), "type", 37);
        setField(term109659, term109659.getClass(), "first", null);
        setField(term109567, term109567.getClass(), "next", term109659);
        setIntField(term109567, term109567.getClass(), "type", 0);
        setField(term109567, term109567.getClass(), "first", null);
        setField(term109383, term109383.getClass(), "first", term109567);
        setField(term109291, term109291.getClass(), "first", term109383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term109291;
        callMethod(klass, "process", argTypes, term109221, args);
    }

};


