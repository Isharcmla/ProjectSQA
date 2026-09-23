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

public class CheckAccessControls_process_381406339261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77243;
     Object term77393;

    public CheckAccessControls_process_381406339261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77243 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term77323 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77243, term77243.getClass(), "compiler", term77323);
        term77393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77393, term77393.getClass(), "type", 30);
        setField(term77463, term77463.getClass(), "next", term77533);
        setIntField(term77463, term77463.getClass(), "type", 38);
        setField(term77463, term77463.getClass(), "first", null);
        setField(term77393, term77393.getClass(), "first", term77463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term77393;
        try {
            callMethod(klass, "process", argTypes, term77243, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


