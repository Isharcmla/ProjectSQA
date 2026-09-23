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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457872;
     Object term457958;
     Object term458050;
     Object term458136;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term457958 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term457958, term457958.getClass(), "parent", null);
        setIntField(term457958, term457958.getClass(), "type", 0);
        term458050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term458050, term458050.getClass(), "type", 0);
        term458136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term458136, term458136.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term457958;
        args[1] = term458050;
        args[2] = term458136;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term457872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


