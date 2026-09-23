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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162182;
     Object term162274;

    public ProcessCommonJSModules_process_627866047316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162182 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term162182, term162182.getClass(), "compiler", null);
        term162274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term162274, term162274.getClass(), "type", 0);
        setField(term162274, term162274.getClass(), "parent", null);
        setField(term162458, term162458.getClass(), "next", null);
        setIntField(term162458, term162458.getClass(), "type", 33);
        setField(term162458, term162458.getClass(), "first", null);
        setField(term162366, term162366.getClass(), "next", term162458);
        setIntField(term162366, term162366.getClass(), "type", 37);
        setField(term162550, term162550.getClass(), "next", null);
        setIntField(term162550, term162550.getClass(), "type", 37);
        setField(term162550, term162550.getClass(), "first", null);
        setField(term162366, term162366.getClass(), "first", term162550);
        setField(term162274, term162274.getClass(), "first", term162366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term162274;
        try {
            callMethod(klass, "process", argTypes, term162182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


