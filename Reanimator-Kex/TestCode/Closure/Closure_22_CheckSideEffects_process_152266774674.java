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

public class CheckSideEffects_process_152266774674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32845;
     Object term32995;

    public CheckSideEffects_process_152266774674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32845 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term32925 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32845, term32845.getClass(), "compiler", term32925);
        setBooleanField(term32845, term32845.getClass(), "protectSideEffectFreeCode", true);
        term32995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32995, term32995.getClass(), "type", 0);
        setField(term32995, term32995.getClass(), "parent", null);
        setField(term33065, term33065.getClass(), "next", null);
        setIntField(term33065, term33065.getClass(), "type", 0);
        setField(term33135, term33135.getClass(), "next", null);
        setIntField(term33135, term33135.getClass(), "type", 0);
        setField(term33135, term33135.getClass(), "first", null);
        setField(term33065, term33065.getClass(), "first", term33135);
        setField(term32995, term32995.getClass(), "first", term33065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32995;
        try {
            callMethod(klass, "process", argTypes, term32845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


