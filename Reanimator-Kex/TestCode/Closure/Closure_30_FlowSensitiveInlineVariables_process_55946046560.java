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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_process_55946046560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12994;
     Object term13144;

    public FlowSensitiveInlineVariables_process_55946046560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12994 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term13074 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12994, term12994.getClass(), "compiler", term13074);
        term13144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13144, term13144.getClass(), "type", 0);
        setField(term13144, term13144.getClass(), "parent", null);
        setField(term13284, term13284.getClass(), "next", term13354);
        setIntField(term13284, term13284.getClass(), "type", 105);
        setField(term13284, term13284.getClass(), "first", null);
        setField(term13214, term13214.getClass(), "next", term13284);
        setIntField(term13214, term13214.getClass(), "type", 0);
        setField(term13424, term13424.getClass(), "next", null);
        setIntField(term13424, term13424.getClass(), "type", 0);
        setField(term13424, term13424.getClass(), "first", null);
        setField(term13214, term13214.getClass(), "first", term13424);
        setField(term13144, term13144.getClass(), "first", term13214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13144;
        try {
            callMethod(klass, "process", argTypes, term12994, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


