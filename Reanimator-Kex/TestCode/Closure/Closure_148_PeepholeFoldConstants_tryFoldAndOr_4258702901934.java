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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514297;
     Object term514389;
     Object term514475;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term514297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term514389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term514389, term514389.getClass(), "parent", null);
        setIntField(term514389, term514389.getClass(), "type", 100);
        term514475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term514475, term514475.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term514389;
        args[1] = term514475;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term514297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


