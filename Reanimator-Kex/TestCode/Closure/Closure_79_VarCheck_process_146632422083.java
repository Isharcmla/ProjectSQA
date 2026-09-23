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

public class VarCheck_process_146632422083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59835;
     Object term59905;

    public VarCheck_process_146632422083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59835 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term59835, term59835.getClass(), "sanityCheck", false);
        setField(term59835, term59835.getClass(), "compiler", null);
        term59905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59905, term59905.getClass(), "type", 0);
        setField(term60045, term60045.getClass(), "next", term60115);
        setIntField(term60045, term60045.getClass(), "type", 0);
        setField(term60045, term60045.getClass(), "first", null);
        setField(term59975, term59975.getClass(), "next", term60045);
        setIntField(term59975, term59975.getClass(), "type", 0);
        setField(term59975, term59975.getClass(), "first", null);
        setField(term59905, term59905.getClass(), "first", term59975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term59905;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term59835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


