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

public class RuntimeTypeCheck_process_167558251335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16572;
     Object term16642;

    public RuntimeTypeCheck_process_167558251335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16572 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term16572, term16572.getClass(), "compiler", null);
        term16642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16642, term16642.getClass(), "type", 0);
        setField(term16782, term16782.getClass(), "next", term16852);
        setIntField(term16782, term16782.getClass(), "type", 0);
        setField(term16782, term16782.getClass(), "first", null);
        setField(term16712, term16712.getClass(), "next", term16782);
        setIntField(term16712, term16712.getClass(), "type", 0);
        setField(term16712, term16712.getClass(), "first", null);
        setField(term16642, term16642.getClass(), "first", term16712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16642;
        try {
            callMethod(klass, "process", argTypes, term16572, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


