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

public class ProcessCommonJSModules_process_627866047385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208580;
     Object term208672;

    public ProcessCommonJSModules_process_627866047385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208580 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term208580, term208580.getClass(), "compiler", null);
        term208672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term208764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term208856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term208948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term208672, term208672.getClass(), "type", 0);
        setField(term208672, term208672.getClass(), "parent", null);
        setField(term208948, term208948.getClass(), "next", term209018);
        setIntField(term208948, term208948.getClass(), "type", 105);
        setField(term208856, term208856.getClass(), "next", term208948);
        setIntField(term208856, term208856.getClass(), "type", 37);
        setField(term208856, term208856.getClass(), "first", null);
        setField(term208764, term208764.getClass(), "next", term208856);
        setIntField(term208764, term208764.getClass(), "type", 0);
        setField(term209110, term209110.getClass(), "next", null);
        setIntField(term209110, term209110.getClass(), "type", 0);
        setField(term209110, term209110.getClass(), "first", null);
        setField(term208764, term208764.getClass(), "first", term209110);
        setField(term208672, term208672.getClass(), "first", term208764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term208672;
        try {
            callMethod(klass, "process", argTypes, term208580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


