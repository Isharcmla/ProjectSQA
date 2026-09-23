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

public class CheckSideEffects_hotSwapScript_77035414221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9133;
     Object term9203;

    public CheckSideEffects_hotSwapScript_77035414221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9133 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term9133, term9133.getClass(), "compiler", null);
        term9203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9203, term9203.getClass(), "type", 0);
        setField(term9203, term9203.getClass(), "parent", null);
        setField(term9273, term9273.getClass(), "next", null);
        setIntField(term9273, term9273.getClass(), "type", 0);
        setField(term9273, term9273.getClass(), "first", null);
        setField(term9203, term9203.getClass(), "first", term9273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9203;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term9133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


