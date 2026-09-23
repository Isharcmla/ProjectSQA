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

public class CheckSideEffects_process_152266774664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28671;
     Object term28843;

    public CheckSideEffects_process_152266774664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28671 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term28751 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28671, term28671.getClass(), "compiler", term28751);
        term28843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28843, term28843.getClass(), "type", 0);
        setField(term28843, term28843.getClass(), "parent", null);
        setField(term28935, term28935.getClass(), "next", term29027);
        setIntField(term28935, term28935.getClass(), "type", 85);
        setField(term29119, term29119.getClass(), "next", null);
        setIntField(term29119, term29119.getClass(), "type", 0);
        setField(term29119, term29119.getClass(), "first", null);
        setField(term28935, term28935.getClass(), "first", term29119);
        setField(term28935, term28935.getClass(), "parent", term28843);
        setField(term28843, term28843.getClass(), "first", term28935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28843;
        try {
            callMethod(klass, "process", argTypes, term28671, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


