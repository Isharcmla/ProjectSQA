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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691647;
     Object term691733;
     Object term691825;
     Object term691917;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term691733 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term691733, term691733.getClass(), "parent", null);
        setIntField(term691733, term691733.getClass(), "type", 0);
        term691825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term691825, term691825.getClass(), "type", 0);
        term691917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term691917, term691917.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term691733;
        args[1] = term691825;
        args[2] = term691917;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term691647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


