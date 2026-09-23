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

public class Normalize_process_169323966626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789728;
     Object term789798;

    public Normalize_process_169323966626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789728 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term789728, term789728.getClass(), "compiler", null);
        setBooleanField(term789728, term789728.getClass(), "assertOnChange", false);
        term789798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term789798, term789798.getClass(), "type", 0);
        setField(term789868, term789868.getClass(), "next", null);
        setIntField(term789868, term789868.getClass(), "type", 113);
        setField(term789868, term789868.getClass(), "first", null);
        setField(term789798, term789798.getClass(), "first", term789868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term789798;
        try {
            callMethod(klass, "process", argTypes, term789728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


