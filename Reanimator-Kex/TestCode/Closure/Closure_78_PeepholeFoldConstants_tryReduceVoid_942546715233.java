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

public class PeepholeFoldConstants_tryReduceVoid_942546715233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37218;
     Object term37378;

    public PeepholeFoldConstants_tryReduceVoid_942546715233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term37308 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term37308, term37308.getClass(), "compiler", null);
        setField(term37218, term37218.getClass(), "currentTraversal", term37308);
        term37378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37448, term37448.getClass(), "type", 90);
        setField(term37378, term37378.getClass(), "first", term37448);
        setIntField(term37378, term37378.getClass(), "type", 90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37378;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term37218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


