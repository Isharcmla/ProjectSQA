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

public class Normalize_process_1693239666144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229154;
     Object term2229326;

    public Normalize_process_1693239666144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2229154 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2229234 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2229154, term2229154.getClass(), "compiler", term2229234);
        setBooleanField(term2229154, term2229154.getClass(), "assertOnChange", false);
        term2229326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2229418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2229326, term2229326.getClass(), "type", 105);
        setField(term2229326, term2229326.getClass(), "last", term2229418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2229326;
        try {
            callMethod(klass, "process", argTypes, term2229154, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


