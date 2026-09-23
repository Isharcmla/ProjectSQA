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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884024;
     Object term884116;
     Object term884208;
     Object term884294;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term884116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term884116, term884116.getClass(), "parent", null);
        setIntField(term884116, term884116.getClass(), "type", 0);
        term884208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term884208, term884208.getClass(), "type", 0);
        term884294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term884294, term884294.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term884116;
        args[1] = term884208;
        args[2] = term884294;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term884024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


