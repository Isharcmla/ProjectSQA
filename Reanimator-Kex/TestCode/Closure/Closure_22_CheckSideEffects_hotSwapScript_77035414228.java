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

public class CheckSideEffects_hotSwapScript_77035414228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12592;
     Object term12742;

    public CheckSideEffects_hotSwapScript_77035414228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12592 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term12672 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12592, term12592.getClass(), "compiler", term12672);
        term12742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12742, term12742.getClass(), "type", 85);
        setField(term12742, term12742.getClass(), "parent", null);
        setField(term12812, term12812.getClass(), "next", term12882);
        setIntField(term12812, term12812.getClass(), "type", 115);
        setField(term12952, term12952.getClass(), "next", null);
        setIntField(term12952, term12952.getClass(), "type", 0);
        setField(term12952, term12952.getClass(), "first", null);
        setField(term12812, term12812.getClass(), "first", term12952);
        setField(term12742, term12742.getClass(), "first", term12812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12742;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term12592, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


