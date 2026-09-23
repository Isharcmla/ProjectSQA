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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798626;
     Object term798712;
     Object term798798;
     Object term798884;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term798712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term798712, term798712.getClass(), "parent", null);
        setIntField(term798712, term798712.getClass(), "type", 0);
        term798798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term798798, term798798.getClass(), "type", 0);
        term798884 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term798884, term798884.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term798712;
        args[1] = term798798;
        args[2] = term798884;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term798626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


