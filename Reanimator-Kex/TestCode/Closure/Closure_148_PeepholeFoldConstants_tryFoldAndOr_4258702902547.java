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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702902547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719407;
     Object term719493;
     Object term719649;
     Object term719735;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term719493 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term719563, term719563.getClass(), "type", 108);
        setField(term719493, term719493.getClass(), "parent", term719563);
        setIntField(term719493, term719493.getClass(), "type", 0);
        term719649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term719649, term719649.getClass(), "type", 32);
        term719735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term719735, term719735.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term719493;
        args[1] = term719649;
        args[2] = term719735;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term719407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


