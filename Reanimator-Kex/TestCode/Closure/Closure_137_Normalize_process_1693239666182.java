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

public class Normalize_process_1693239666182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644701;
     Object term2644873;

    public Normalize_process_1693239666182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644701 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2644781 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2644701, term2644701.getClass(), "compiler", term2644781);
        setBooleanField(term2644701, term2644701.getClass(), "assertOnChange", false);
        term2644873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2644873, term2644873.getClass(), "type", 126);
        setField(term2644873, term2644873.getClass(), "last", term2644965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2644873;
        try {
            callMethod(klass, "process", argTypes, term2644701, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


