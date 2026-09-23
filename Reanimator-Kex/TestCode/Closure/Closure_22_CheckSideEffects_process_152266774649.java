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

public class CheckSideEffects_process_152266774649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21101;
     Object term21251;

    public CheckSideEffects_process_152266774649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21101 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term21181 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21101, term21101.getClass(), "compiler", term21181);
        setBooleanField(term21101, term21101.getClass(), "protectSideEffectFreeCode", true);
        term21251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21251, term21251.getClass(), "type", 0);
        setField(term21251, term21251.getClass(), "parent", null);
        setField(term21391, term21391.getClass(), "next", null);
        setIntField(term21391, term21391.getClass(), "type", 0);
        setField(term21391, term21391.getClass(), "first", null);
        setField(term21321, term21321.getClass(), "next", term21391);
        setIntField(term21321, term21321.getClass(), "type", 0);
        setField(term21461, term21461.getClass(), "next", null);
        setIntField(term21461, term21461.getClass(), "type", 0);
        setField(term21461, term21461.getClass(), "first", null);
        setField(term21321, term21321.getClass(), "first", term21461);
        setField(term21251, term21251.getClass(), "first", term21321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21251;
        try {
            callMethod(klass, "process", argTypes, term21101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


