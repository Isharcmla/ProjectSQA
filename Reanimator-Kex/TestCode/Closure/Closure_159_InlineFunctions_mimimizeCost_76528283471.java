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

public class InlineFunctions_mimimizeCost_76528283471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12261;
     Object term12383;

    public InlineFunctions_mimimizeCost_76528283471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12261 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term12261, term12261.getClass(), "injector", null);
        term12383 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        Object term12505 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$NamedFunction"));
        setField(term12383, term12383.getClass(), "module", null);
        setField(term12383, term12383.getClass(), "fn", term12505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object[] args = new Object[1];
        args[0] = term12383;
        try {
            callMethod(klass, "mimimizeCost", argTypes, term12261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


