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

public class Normalize_process_1693239666184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2647083;
     Object term2647249;

    public Normalize_process_1693239666184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2647083 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2647163 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2647083, term2647083.getClass(), "compiler", term2647163);
        setBooleanField(term2647083, term2647083.getClass(), "assertOnChange", false);
        term2647249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2647341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2647411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2647249, term2647249.getClass(), "type", 126);
        setIntField(term2647341, term2647341.getClass(), "type", 0);
        setField(term2647341, term2647341.getClass(), "propListHead", null);
        setIntField(term2647341, term2647341.getClass(), "sourcePosition", 0);
        setField(term2647341, term2647341.getClass(), "next", term2647411);
        setField(term2647249, term2647249.getClass(), "last", term2647341);
        setField(term2647249, term2647249.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2647249;
        try {
            callMethod(klass, "process", argTypes, term2647083, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


