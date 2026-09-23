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

public class Normalize_process_1693239666210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663849;
     Object term2663919;

    public Normalize_process_1693239666210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2663849 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2663849, term2663849.getClass(), "compiler", null);
        setBooleanField(term2663849, term2663849.getClass(), "assertOnChange", false);
        term2663919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2664011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2663919, term2663919.getClass(), "type", 126);
        setIntField(term2664011, term2664011.getClass(), "type", 114);
        setField(term2663919, term2663919.getClass(), "last", term2664011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2663919;
        try {
            callMethod(klass, "process", argTypes, term2663849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


