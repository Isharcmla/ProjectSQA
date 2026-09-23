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

public class Normalize_process_1693239666112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209982;
     Object term2210074;

    public Normalize_process_1693239666112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2209982 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2209982, term2209982.getClass(), "compiler", null);
        setBooleanField(term2209982, term2209982.getClass(), "assertOnChange", false);
        term2210074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2210074, term2210074.getClass(), "type", 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2210074;
        try {
            callMethod(klass, "process", argTypes, term2209982, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


