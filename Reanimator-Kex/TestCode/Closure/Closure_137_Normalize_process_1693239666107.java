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

public class Normalize_process_1693239666107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2010095;
     Object term2010187;

    public Normalize_process_1693239666107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2010095 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2010095, term2010095.getClass(), "compiler", null);
        setBooleanField(term2010095, term2010095.getClass(), "assertOnChange", false);
        term2010187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2010279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2010349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2010187, term2010187.getClass(), "type", 0);
        setField(term2010279, term2010279.getClass(), "next", term2010349);
        setIntField(term2010279, term2010279.getClass(), "type", 126);
        setField(term2010187, term2010187.getClass(), "first", term2010279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2010187;
        try {
            callMethod(klass, "process", argTypes, term2010095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


