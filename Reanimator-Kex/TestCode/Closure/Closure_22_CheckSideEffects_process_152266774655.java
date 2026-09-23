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

public class CheckSideEffects_process_152266774655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25219;
     Object term25289;

    public CheckSideEffects_process_152266774655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25219 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term25219, term25219.getClass(), "compiler", null);
        setBooleanField(term25219, term25219.getClass(), "protectSideEffectFreeCode", true);
        term25289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25289, term25289.getClass(), "type", 0);
        setField(term25289, term25289.getClass(), "parent", null);
        setField(term25359, term25359.getClass(), "next", null);
        setIntField(term25359, term25359.getClass(), "type", 115);
        setField(term25429, term25429.getClass(), "next", null);
        setIntField(term25429, term25429.getClass(), "type", 0);
        setField(term25429, term25429.getClass(), "first", null);
        setField(term25359, term25359.getClass(), "first", term25429);
        setField(term25289, term25289.getClass(), "first", term25359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25289;
        try {
            callMethod(klass, "process", argTypes, term25219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


