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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551826;
     Object term551912;
     Object term551998;
     Object term552084;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551826 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term551912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551912, term551912.getClass(), "parent", null);
        setIntField(term551912, term551912.getClass(), "type", 0);
        term551998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term551998, term551998.getClass(), "type", 47);
        term552084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term551912;
        args[1] = term551998;
        args[2] = term552084;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term551826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


