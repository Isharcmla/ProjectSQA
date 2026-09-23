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

public class PeepholeFoldConstants_tryFoldGetElem_393512537413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83219;
     Object term83289;
     Object term83359;
     Object term83429;

    public PeepholeFoldConstants_tryFoldGetElem_393512537413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term83289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83289, term83289.getClass(), "type", 35);
        term83359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83359, term83359.getClass(), "type", 63);
        term83429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83429, term83429.getClass(), "type", 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term83289;
        args[1] = term83359;
        args[2] = term83429;
        try {
            callMethod(klass, "tryFoldGetElem", argTypes, term83219, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


