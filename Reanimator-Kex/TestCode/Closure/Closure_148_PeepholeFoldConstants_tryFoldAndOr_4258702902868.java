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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835210;
     Object term835296;
     Object term835388;
     Object term835458;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term835210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term835296 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term835296, term835296.getClass(), "parent", null);
        setIntField(term835296, term835296.getClass(), "type", 0);
        term835388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term835388, term835388.getClass(), "type", 0);
        term835458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term835458, term835458.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term835296;
        args[1] = term835388;
        args[2] = term835458;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term835210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


