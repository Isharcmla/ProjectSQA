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

public class CheckAccessControls_hotSwapScript_739486180128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34354;
     Object term34424;

    public CheckAccessControls_hotSwapScript_739486180128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34354 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term34354, term34354.getClass(), "compiler", null);
        term34424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34424, term34424.getClass(), "type", 30);
        setField(term34494, term34494.getClass(), "next", term34564);
        setIntField(term34494, term34494.getClass(), "type", 33);
        setField(term34494, term34494.getClass(), "first", null);
        setField(term34424, term34424.getClass(), "first", term34494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34424;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term34354, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


