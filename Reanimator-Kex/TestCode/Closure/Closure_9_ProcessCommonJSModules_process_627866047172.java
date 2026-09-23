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

public class ProcessCommonJSModules_process_627866047172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86214;
     Object term86284;

    public ProcessCommonJSModules_process_627866047172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86214 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term86214, term86214.getClass(), "compiler", null);
        term86284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86284, term86284.getClass(), "type", 0);
        setField(term86284, term86284.getClass(), "parent", null);
        setField(term86354, term86354.getClass(), "next", null);
        setIntField(term86354, term86354.getClass(), "type", 0);
        setField(term86564, term86564.getClass(), "next", null);
        setIntField(term86564, term86564.getClass(), "type", 0);
        setField(term86564, term86564.getClass(), "first", null);
        setField(term86494, term86494.getClass(), "next", term86564);
        setIntField(term86494, term86494.getClass(), "type", 37);
        setField(term86494, term86494.getClass(), "first", null);
        setField(term86424, term86424.getClass(), "next", term86494);
        setIntField(term86424, term86424.getClass(), "type", 37);
        setField(term86424, term86424.getClass(), "first", null);
        setField(term86354, term86354.getClass(), "first", term86424);
        setField(term86284, term86284.getClass(), "first", term86354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term86284;
        callMethod(klass, "process", argTypes, term86214, args);
    }

};


