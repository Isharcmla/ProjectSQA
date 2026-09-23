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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361076;
     Object term361162;
     Object term361252;
     Object term361338;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term361162 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361162, term361162.getClass(), "parent", null);
        setIntField(term361162, term361162.getClass(), "type", 0);
        term361252 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term361252, term361252.getClass(), "type", 0);
        term361338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term361338, term361338.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term361162;
        args[1] = term361252;
        args[2] = term361338;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term361076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


