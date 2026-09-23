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

public class FlowSensitiveInlineVariables_process_55946046579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22133;
     Object term22283;

    public FlowSensitiveInlineVariables_process_55946046579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22133 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term22213 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22133, term22133.getClass(), "compiler", term22213);
        term22283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term22283, term22283.getClass(), "type", 0);
        setField(term22283, term22283.getClass(), "parent", null);
        setField(term22375, term22375.getClass(), "next", term22467);
        setIntField(term22375, term22375.getClass(), "type", 0);
        setField(term22559, term22559.getClass(), "next", term22283);
        setIntField(term22559, term22559.getClass(), "type", 105);
        setField(term22375, term22375.getClass(), "first", term22559);
        setField(term22283, term22283.getClass(), "first", term22375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22283;
        callMethod(klass, "process", argTypes, term22133, args);
    }

};


