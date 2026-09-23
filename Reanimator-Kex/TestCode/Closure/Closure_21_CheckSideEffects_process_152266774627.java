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

public class CheckSideEffects_process_152266774627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10667;
     Object term10817;

    public CheckSideEffects_process_152266774627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10667 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term10747 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10667, term10667.getClass(), "compiler", term10747);
        setBooleanField(term10667, term10667.getClass(), "protectSideEffectFreeCode", true);
        term10817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10817, term10817.getClass(), "type", 0);
        setField(term10817, term10817.getClass(), "parent", null);
        setField(term10817, term10817.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10817;
        try {
            callMethod(klass, "process", argTypes, term10667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


