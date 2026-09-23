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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639140;
     Object term639226;
     Object term639318;
     Object term639410;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term639140 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term639226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term639226, term639226.getClass(), "parent", null);
        setIntField(term639226, term639226.getClass(), "type", 0);
        term639318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term639318, term639318.getClass(), "type", 63);
        term639410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term639226;
        args[1] = term639318;
        args[2] = term639410;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term639140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


