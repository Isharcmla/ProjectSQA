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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CheckSideEffects_process_152266774622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9691;
     Object term9761;
     Object term10944;
     Object term10945;

    public CheckSideEffects_process_152266774622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9691 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term9691, term9691.getClass(), "compiler", null);
        term9761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9761, term9761.getClass(), "type", 0);
        setField(term9761, term9761.getClass(), "parent", null);
        setField(term9831, term9831.getClass(), "next", null);
        setIntField(term9831, term9831.getClass(), "type", 115);
        setField(term9901, term9901.getClass(), "next", null);
        setIntField(term9901, term9901.getClass(), "type", 0);
        setField(term9901, term9901.getClass(), "first", null);
        setField(term9831, term9831.getClass(), "first", term9901);
        setField(term9761, term9761.getClass(), "first", term9831);
        term10944 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term10944, term10944.getClass(), "level", null);
        setField(term10944, term10944.getClass(), "problemNodes", null);
        setField(term10944, term10944.getClass(), "compiler", null);
        setBooleanField(term10944, term10944.getClass(), "protectSideEffectFreeCode", false);
        term10945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10945, term10945.getClass(), "type", 0);
        setField(term10945, term10945.getClass(), "next", null);
        setIntField(term10946, term10946.getClass(), "type", 115);
        setField(term10946, term10946.getClass(), "next", null);
        setIntField(term10947, term10947.getClass(), "type", 0);
        setField(term10947, term10947.getClass(), "next", null);
        setField(term10947, term10947.getClass(), "first", null);
        setField(term10947, term10947.getClass(), "last", null);
        setField(term10947, term10947.getClass(), "propListHead", null);
        setIntField(term10947, term10947.getClass(), "sourcePosition", 0);
        setField(term10947, term10947.getClass(), "jsType", null);
        setField(term10947, term10947.getClass(), "parent", null);
        setField(term10946, term10946.getClass(), "first", term10947);
        setField(term10946, term10946.getClass(), "last", null);
        setField(term10946, term10946.getClass(), "propListHead", null);
        setIntField(term10946, term10946.getClass(), "sourcePosition", 0);
        setField(term10946, term10946.getClass(), "jsType", null);
        setField(term10946, term10946.getClass(), "parent", null);
        setField(term10945, term10945.getClass(), "first", term10946);
        setField(term10945, term10945.getClass(), "last", null);
        setField(term10945, term10945.getClass(), "propListHead", null);
        setIntField(term10945, term10945.getClass(), "sourcePosition", 0);
        setField(term10945, term10945.getClass(), "jsType", null);
        setField(term10945, term10945.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9761;
        callMethod(klass, "process", argTypes, term9691, args);
        assertTrue(recursiveEquals(term9691, term10944));
        assertTrue(recursiveEquals(term9761, null));
    }

};


