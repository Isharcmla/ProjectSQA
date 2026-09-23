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

public class ProcessCommonJSModules_process_627866047196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99608;
     Object term99758;

    public ProcessCommonJSModules_process_627866047196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99608 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term99688 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term99608, term99608.getClass(), "compiler", term99688);
        term99758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term100034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term100126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term99758, term99758.getClass(), "type", 37);
        setField(term99758, term99758.getClass(), "parent", null);
        setField(term99850, term99850.getClass(), "next", null);
        setIntField(term99850, term99850.getClass(), "type", 0);
        setField(term100126, term100126.getClass(), "next", null);
        setIntField(term100126, term100126.getClass(), "type", 0);
        setField(term100126, term100126.getClass(), "first", null);
        setField(term100034, term100034.getClass(), "next", term100126);
        setIntField(term100034, term100034.getClass(), "type", 37);
        setField(term100034, term100034.getClass(), "first", null);
        setField(term99942, term99942.getClass(), "next", term100034);
        setIntField(term99942, term99942.getClass(), "type", 37);
        setField(term99942, term99942.getClass(), "first", null);
        setField(term99850, term99850.getClass(), "first", term99942);
        setField(term99758, term99758.getClass(), "first", term99850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term99758;
        callMethod(klass, "process", argTypes, term99608, args);
    }

};


