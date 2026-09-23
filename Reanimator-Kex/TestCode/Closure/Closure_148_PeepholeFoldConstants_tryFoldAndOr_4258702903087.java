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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911809;
     Object term911895;
     Object term911987;
     Object term912073;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911809 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term911895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term911895, term911895.getClass(), "parent", null);
        setIntField(term911895, term911895.getClass(), "type", 0);
        term911987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term911987, term911987.getClass(), "type", 0);
        term912073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term912073, term912073.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term911895;
        args[1] = term911987;
        args[2] = term912073;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term911809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


