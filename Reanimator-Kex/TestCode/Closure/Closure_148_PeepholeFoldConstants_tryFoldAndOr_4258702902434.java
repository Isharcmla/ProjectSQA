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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679721;
     Object term679807;
     Object term679899;
     Object term679969;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679721 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term679807 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term679807, term679807.getClass(), "parent", null);
        setIntField(term679807, term679807.getClass(), "type", 0);
        term679899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term679899, term679899.getClass(), "type", 0);
        term679969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term679969, term679969.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term679807;
        args[1] = term679899;
        args[2] = term679969;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term679721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


