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

public class PeepholeFoldConstants_tryReduceVoid_942546715108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16784;
     Object term16944;

    public PeepholeFoldConstants_tryReduceVoid_942546715108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16784 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term16874 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term16874, term16874.getClass(), "compiler", null);
        setField(term16784, term16784.getClass(), "currentTraversal", term16874);
        term16944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17014, term17014.getClass(), "type", 52);
        setField(term16944, term16944.getClass(), "first", term17014);
        setIntField(term16944, term16944.getClass(), "type", 52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16944;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term16784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


