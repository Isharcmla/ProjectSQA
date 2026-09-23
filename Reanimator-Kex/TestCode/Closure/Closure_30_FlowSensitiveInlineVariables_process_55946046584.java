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

public class FlowSensitiveInlineVariables_process_55946046584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24871;
     Object term24941;

    public FlowSensitiveInlineVariables_process_55946046584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24871 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term24871, term24871.getClass(), "compiler", null);
        term24941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24941, term24941.getClass(), "type", 0);
        setField(term24941, term24941.getClass(), "parent", null);
        setField(term25125, term25125.getClass(), "next", term25217);
        setIntField(term25125, term25125.getClass(), "type", 105);
        setField(term25033, term25033.getClass(), "next", term25125);
        setIntField(term25033, term25033.getClass(), "type", 0);
        setField(term25309, term25309.getClass(), "next", null);
        setIntField(term25309, term25309.getClass(), "type", 0);
        setField(term25309, term25309.getClass(), "first", null);
        setField(term25033, term25033.getClass(), "first", term25309);
        setField(term24941, term24941.getClass(), "first", term25033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24941;
        callMethod(klass, "process", argTypes, term24871, args);
    }

};


