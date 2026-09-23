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

public class Normalize_process_169323966697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2005274;
     Object term2005344;

    public Normalize_process_169323966697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2005274 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2005274, term2005274.getClass(), "compiler", null);
        setBooleanField(term2005274, term2005274.getClass(), "assertOnChange", false);
        term2005344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2005344, term2005344.getClass(), "type", 126);
        setIntField(term2005436, term2005436.getClass(), "type", 118);
        setField(term2005436, term2005436.getClass(), "propListHead", null);
        setIntField(term2005436, term2005436.getClass(), "sourcePosition", 0);
        setField(term2005436, term2005436.getClass(), "next", null);
        setField(term2005344, term2005344.getClass(), "last", term2005436);
        setField(term2005344, term2005344.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2005344;
        try {
            callMethod(klass, "process", argTypes, term2005274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


