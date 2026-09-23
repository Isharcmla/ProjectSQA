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

public class ProcessCommonJSModules_process_627866047117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52838;
     Object term52908;

    public ProcessCommonJSModules_process_627866047117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52838 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term52838, term52838.getClass(), "compiler", null);
        term52908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52908, term52908.getClass(), "type", 0);
        setField(term52908, term52908.getClass(), "parent", null);
        setField(term53118, term53118.getClass(), "next", null);
        setIntField(term53118, term53118.getClass(), "type", 33);
        setField(term53118, term53118.getClass(), "first", null);
        setField(term53048, term53048.getClass(), "next", term53118);
        setIntField(term53048, term53048.getClass(), "type", 0);
        setField(term53048, term53048.getClass(), "first", null);
        setField(term52978, term52978.getClass(), "next", term53048);
        setIntField(term52978, term52978.getClass(), "type", 0);
        setField(term53188, term53188.getClass(), "next", null);
        setIntField(term53188, term53188.getClass(), "type", 0);
        setField(term53188, term53188.getClass(), "first", null);
        setField(term52978, term52978.getClass(), "first", term53188);
        setField(term52908, term52908.getClass(), "first", term52978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term52908;
        try {
            callMethod(klass, "process", argTypes, term52838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


