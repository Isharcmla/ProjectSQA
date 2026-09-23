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

public class CheckAccessControls_hotSwapScript_739486180363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110131;
     Object term110201;

    public CheckAccessControls_hotSwapScript_739486180363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110131 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term110131, term110131.getClass(), "compiler", null);
        term110201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term110201, term110201.getClass(), "type", 38);
        setField(term110341, term110341.getClass(), "next", null);
        setIntField(term110341, term110341.getClass(), "type", 0);
        setField(term110341, term110341.getClass(), "first", null);
        setField(term110271, term110271.getClass(), "next", term110341);
        setIntField(term110271, term110271.getClass(), "type", 30);
        setField(term110271, term110271.getClass(), "first", null);
        setField(term110429, term110429.getClass(), "docInfo", null);
        setField(term110271, term110271.getClass(), "jsType", term110429);
        setField(term110201, term110201.getClass(), "first", term110271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110201;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term110131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


