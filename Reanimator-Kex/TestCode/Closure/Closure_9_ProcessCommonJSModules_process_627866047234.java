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

public class ProcessCommonJSModules_process_627866047234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119670;
     Object term119762;

    public ProcessCommonJSModules_process_627866047234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119670 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term119670, term119670.getClass(), "compiler", null);
        term119762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119946 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term119762, term119762.getClass(), "type", 0);
        setField(term119762, term119762.getClass(), "parent", null);
        setField(term120108, term120108.getClass(), "next", null);
        setIntField(term120108, term120108.getClass(), "type", 37);
        setField(term120108, term120108.getClass(), "first", null);
        setField(term120016, term120016.getClass(), "next", term120108);
        setIntField(term120016, term120016.getClass(), "type", 37);
        setField(term120016, term120016.getClass(), "first", null);
        setField(term119946, term119946.getClass(), "next", term120016);
        setIntField(term119946, term119946.getClass(), "type", 37);
        setField(term119946, term119946.getClass(), "first", null);
        setField(term119854, term119854.getClass(), "next", term119946);
        setIntField(term119854, term119854.getClass(), "type", 0);
        setField(term119854, term119854.getClass(), "first", term120108);
        setField(term119762, term119762.getClass(), "first", term119854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term119762;
        callMethod(klass, "process", argTypes, term119670, args);
        assertTrue(recursiveEquals(term119762, null));
    }

};


