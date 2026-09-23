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

public class Normalize_process_1693239666121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213938;
     Object term2214088;

    public Normalize_process_1693239666121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213938 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2214018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2213938, term2213938.getClass(), "compiler", term2214018);
        setBooleanField(term2213938, term2213938.getClass(), "assertOnChange", false);
        term2214088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2214158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2214088, term2214088.getClass(), "type", 0);
        setField(term2214158, term2214158.getClass(), "next", null);
        setIntField(term2214158, term2214158.getClass(), "type", 126);
        setField(term2214158, term2214158.getClass(), "last", null);
        setField(term2214088, term2214088.getClass(), "first", term2214158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2214088;
        try {
            callMethod(klass, "process", argTypes, term2213938, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


