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

public class CheckSideEffects_process_152266774646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17820;
     Object term17970;

    public CheckSideEffects_process_152266774646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17820 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term17900 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17820, term17820.getClass(), "compiler", term17900);
        term17970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17970, term17970.getClass(), "type", 0);
        setField(term17970, term17970.getClass(), "parent", null);
        setField(term18040, term18040.getClass(), "next", term18110);
        setIntField(term18040, term18040.getClass(), "type", 0);
        setField(term18180, term18180.getClass(), "next", term18250);
        setIntField(term18180, term18180.getClass(), "type", 124);
        setField(term18180, term18180.getClass(), "first", null);
        setField(term18040, term18040.getClass(), "first", term18180);
        setField(term17970, term17970.getClass(), "first", term18040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17970;
        try {
            callMethod(klass, "process", argTypes, term17820, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


