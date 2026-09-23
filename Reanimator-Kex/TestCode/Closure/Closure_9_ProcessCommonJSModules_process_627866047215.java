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

public class ProcessCommonJSModules_process_627866047215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110101;
     Object term110251;

    public ProcessCommonJSModules_process_627866047215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110101 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term110181 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term110101, term110101.getClass(), "compiler", term110181);
        term110251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term110251, term110251.getClass(), "type", 0);
        setField(term110251, term110251.getClass(), "parent", null);
        setField(term110435, term110435.getClass(), "next", null);
        setIntField(term110435, term110435.getClass(), "type", 37);
        setField(term110435, term110435.getClass(), "first", null);
        setField(term110343, term110343.getClass(), "next", term110435);
        setIntField(term110343, term110343.getClass(), "type", 0);
        setField(term110619, term110619.getClass(), "next", null);
        setIntField(term110619, term110619.getClass(), "type", 0);
        setField(term110619, term110619.getClass(), "first", null);
        setField(term110527, term110527.getClass(), "next", term110619);
        setIntField(term110527, term110527.getClass(), "type", 0);
        setField(term110527, term110527.getClass(), "first", null);
        setField(term110343, term110343.getClass(), "first", term110527);
        setField(term110251, term110251.getClass(), "first", term110343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term110251;
        callMethod(klass, "process", argTypes, term110101, args);
    }

};


