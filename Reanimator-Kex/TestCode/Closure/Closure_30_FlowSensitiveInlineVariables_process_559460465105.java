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

public class FlowSensitiveInlineVariables_process_559460465105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34720;
     Object term34790;

    public FlowSensitiveInlineVariables_process_559460465105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34720 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term34720, term34720.getClass(), "compiler", null);
        term34790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34790, term34790.getClass(), "type", 0);
        setField(term34790, term34790.getClass(), "parent", null);
        setField(term34860, term34860.getClass(), "next", term34952);
        setIntField(term34860, term34860.getClass(), "type", 0);
        setField(term35022, term35022.getClass(), "next", null);
        setIntField(term35022, term35022.getClass(), "type", 0);
        setField(term35022, term35022.getClass(), "first", null);
        setField(term34860, term34860.getClass(), "first", term35022);
        setField(term34790, term34790.getClass(), "first", term34860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34790;
        callMethod(klass, "process", argTypes, term34720, args);
    }

};


