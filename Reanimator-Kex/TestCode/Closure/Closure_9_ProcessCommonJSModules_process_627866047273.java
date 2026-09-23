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

public class ProcessCommonJSModules_process_627866047273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141022;
     Object term141092;

    public ProcessCommonJSModules_process_627866047273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141022 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term141022, term141022.getClass(), "compiler", null);
        term141092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141092, term141092.getClass(), "type", 0);
        setField(term141092, term141092.getClass(), "parent", null);
        setField(term141232, term141232.getClass(), "next", null);
        setIntField(term141232, term141232.getClass(), "type", 33);
        setField(term141232, term141232.getClass(), "first", null);
        setField(term141162, term141162.getClass(), "next", term141232);
        setIntField(term141162, term141162.getClass(), "type", 33);
        setField(term141302, term141302.getClass(), "next", null);
        setIntField(term141302, term141302.getClass(), "type", 0);
        setField(term141302, term141302.getClass(), "first", null);
        setField(term141162, term141162.getClass(), "first", term141302);
        setField(term141092, term141092.getClass(), "first", term141162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term141092;
        callMethod(klass, "process", argTypes, term141022, args);
    }

};


