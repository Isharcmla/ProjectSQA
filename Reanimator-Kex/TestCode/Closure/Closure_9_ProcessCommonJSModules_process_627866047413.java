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

public class ProcessCommonJSModules_process_627866047413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223206;
     Object term223276;

    public ProcessCommonJSModules_process_627866047413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223206 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term223206, term223206.getClass(), "compiler", null);
        term223276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223276, term223276.getClass(), "type", 0);
        setField(term223276, term223276.getClass(), "parent", null);
        setField(term223416, term223416.getClass(), "next", null);
        setIntField(term223416, term223416.getClass(), "type", 33);
        setField(term223416, term223416.getClass(), "first", null);
        setField(term223346, term223346.getClass(), "next", term223416);
        setIntField(term223346, term223346.getClass(), "type", 33);
        setField(term223556, term223556.getClass(), "next", null);
        setIntField(term223556, term223556.getClass(), "type", 0);
        setField(term223556, term223556.getClass(), "first", null);
        setField(term223486, term223486.getClass(), "next", term223556);
        setIntField(term223486, term223486.getClass(), "type", 37);
        setField(term223486, term223486.getClass(), "first", null);
        setField(term223346, term223346.getClass(), "first", term223486);
        setField(term223276, term223276.getClass(), "first", term223346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term223276;
        try {
            callMethod(klass, "process", argTypes, term223206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


