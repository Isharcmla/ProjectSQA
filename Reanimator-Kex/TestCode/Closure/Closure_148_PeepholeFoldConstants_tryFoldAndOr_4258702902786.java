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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805174;
     Object term805260;
     Object term805438;
     Object term805508;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term805260 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term805346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term805346, term805346.getClass(), "type", 108);
        setField(term805260, term805260.getClass(), "parent", term805346);
        setIntField(term805260, term805260.getClass(), "type", 0);
        term805438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term805438, term805438.getClass(), "type", 33);
        term805508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term805508, term805508.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term805260;
        args[1] = term805438;
        args[2] = term805508;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term805174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


