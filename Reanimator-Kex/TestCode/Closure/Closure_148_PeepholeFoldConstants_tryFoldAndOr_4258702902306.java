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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635763;
     Object term635833;
     Object term635903;
     Object term635973;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635763 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term635833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term635833, term635833.getClass(), "parent", null);
        setIntField(term635833, term635833.getClass(), "type", 0);
        term635903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term635903, term635903.getClass(), "type", 0);
        term635973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term635973, term635973.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term635833;
        args[1] = term635903;
        args[2] = term635973;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term635763, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


