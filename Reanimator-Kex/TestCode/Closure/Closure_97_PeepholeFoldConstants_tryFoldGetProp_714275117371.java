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

public class PeepholeFoldConstants_tryFoldGetProp_714275117371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85918;
     Object term85988;
     Object term86058;

    public PeepholeFoldConstants_tryFoldGetProp_714275117371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term85988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85988, term85988.getClass(), "type", 33);
        term86058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86058, term86058.getClass(), "type", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term85988;
        args[1] = null;
        args[2] = term86058;
        try {
            callMethod(klass, "tryFoldGetProp", argTypes, term85918, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


