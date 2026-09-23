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

public class VarCheck_process_146632422058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20237;
     Object term20387;

    public VarCheck_process_146632422058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20237 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term20317 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term20237, term20237.getClass(), "sanityCheck", false);
        setField(term20237, term20237.getClass(), "compiler", term20317);
        term20387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20387, term20387.getClass(), "type", 0);
        setField(term20479, term20479.getClass(), "next", term20571);
        setIntField(term20479, term20479.getClass(), "type", 0);
        setField(term20479, term20479.getClass(), "first", term20663);
        setField(term20387, term20387.getClass(), "first", term20479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term20387;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term20237, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


