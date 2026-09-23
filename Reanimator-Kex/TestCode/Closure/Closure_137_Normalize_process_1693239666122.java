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

public class Normalize_process_1693239666122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2214548;
     Object term2214640;

    public Normalize_process_1693239666122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2214548 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2214548, term2214548.getClass(), "compiler", null);
        setBooleanField(term2214548, term2214548.getClass(), "assertOnChange", false);
        term2214640 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2214732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2214824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2214640, term2214640.getClass(), "type", 0);
        setField(term2214824, term2214824.getClass(), "next", null);
        setIntField(term2214824, term2214824.getClass(), "type", 0);
        setField(term2214824, term2214824.getClass(), "first", null);
        setField(term2214732, term2214732.getClass(), "next", term2214824);
        setIntField(term2214732, term2214732.getClass(), "type", 0);
        setField(term2214732, term2214732.getClass(), "first", null);
        setField(term2214640, term2214640.getClass(), "first", term2214732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2214640;
        try {
            callMethod(klass, "process", argTypes, term2214548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


