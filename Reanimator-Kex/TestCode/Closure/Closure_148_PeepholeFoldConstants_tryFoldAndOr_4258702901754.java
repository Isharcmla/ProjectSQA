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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455318;
     Object term455410;
     Object term455502;
     Object term455594;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term455410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term455410, term455410.getClass(), "parent", null);
        setIntField(term455410, term455410.getClass(), "type", 0);
        term455502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term455502, term455502.getClass(), "type", 44);
        term455594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term455410;
        args[1] = term455502;
        args[2] = term455594;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term455318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


