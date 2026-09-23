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

public class CheckSideEffects_process_152266774647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20469;
     Object term20539;
     Object term21677;
     Object term21678;

    public CheckSideEffects_process_152266774647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20469 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term20469, term20469.getClass(), "compiler", null);
        term20539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20539, term20539.getClass(), "type", 115);
        setField(term20539, term20539.getClass(), "parent", null);
        setField(term20609, term20609.getClass(), "next", term20679);
        setIntField(term20609, term20609.getClass(), "type", 115);
        setField(term20749, term20749.getClass(), "next", null);
        setIntField(term20749, term20749.getClass(), "type", 0);
        setField(term20749, term20749.getClass(), "first", null);
        setField(term20609, term20609.getClass(), "first", term20749);
        setField(term20539, term20539.getClass(), "first", term20609);
        term21677 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term21677, term21677.getClass(), "level", null);
        setField(term21677, term21677.getClass(), "problemNodes", null);
        setField(term21677, term21677.getClass(), "compiler", null);
        setBooleanField(term21677, term21677.getClass(), "protectSideEffectFreeCode", false);
        term21678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21678, term21678.getClass(), "type", 115);
        setField(term21678, term21678.getClass(), "next", null);
        setIntField(term21679, term21679.getClass(), "type", 115);
        setIntField(term21680, term21680.getClass(), "type", 0);
        setField(term21680, term21680.getClass(), "next", null);
        setField(term21680, term21680.getClass(), "first", null);
        setField(term21680, term21680.getClass(), "last", null);
        setField(term21680, term21680.getClass(), "propListHead", null);
        setIntField(term21680, term21680.getClass(), "sourcePosition", 0);
        setField(term21680, term21680.getClass(), "jsType", null);
        setField(term21680, term21680.getClass(), "parent", null);
        setField(term21679, term21679.getClass(), "next", term21680);
        setIntField(term21681, term21681.getClass(), "type", 0);
        setField(term21681, term21681.getClass(), "next", null);
        setField(term21681, term21681.getClass(), "first", null);
        setField(term21681, term21681.getClass(), "last", null);
        setField(term21681, term21681.getClass(), "propListHead", null);
        setIntField(term21681, term21681.getClass(), "sourcePosition", 0);
        setField(term21681, term21681.getClass(), "jsType", null);
        setField(term21681, term21681.getClass(), "parent", null);
        setField(term21679, term21679.getClass(), "first", term21681);
        setField(term21679, term21679.getClass(), "last", null);
        setField(term21679, term21679.getClass(), "propListHead", null);
        setIntField(term21679, term21679.getClass(), "sourcePosition", 0);
        setField(term21679, term21679.getClass(), "jsType", null);
        setField(term21679, term21679.getClass(), "parent", null);
        setField(term21678, term21678.getClass(), "first", term21679);
        setField(term21678, term21678.getClass(), "last", null);
        setField(term21678, term21678.getClass(), "propListHead", null);
        setIntField(term21678, term21678.getClass(), "sourcePosition", 0);
        setField(term21678, term21678.getClass(), "jsType", null);
        setField(term21678, term21678.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20539;
        callMethod(klass, "process", argTypes, term20469, args);
        assertTrue(recursiveEquals(term20469, term21677));
        assertTrue(recursiveEquals(term20539, null));
    }

};


