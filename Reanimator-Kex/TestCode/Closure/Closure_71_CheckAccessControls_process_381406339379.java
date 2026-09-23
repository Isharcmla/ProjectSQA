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

public class CheckAccessControls_process_381406339379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119017;
     Object term119167;

    public CheckAccessControls_process_381406339379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119017 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term119097 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term119017, term119017.getClass(), "compiler", term119097);
        term119167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term119167, term119167.getClass(), "type", 118);
        setField(term119237, term119237.getClass(), "next", term119307);
        setIntField(term119237, term119237.getClass(), "type", 38);
        setField(term119237, term119237.getClass(), "first", null);
        setField(term119167, term119167.getClass(), "first", term119237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term119167;
        try {
            callMethod(klass, "process", argTypes, term119017, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


