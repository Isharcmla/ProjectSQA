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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782236;
     Object term782322;
     Object term782478;
     Object term782564;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term782322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term782392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term782392, term782392.getClass(), "type", 108);
        setField(term782322, term782322.getClass(), "parent", term782392);
        setIntField(term782322, term782322.getClass(), "type", 0);
        term782478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term782478, term782478.getClass(), "type", 94);
        term782564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term782564, term782564.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term782322;
        args[1] = term782478;
        args[2] = term782564;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term782236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


