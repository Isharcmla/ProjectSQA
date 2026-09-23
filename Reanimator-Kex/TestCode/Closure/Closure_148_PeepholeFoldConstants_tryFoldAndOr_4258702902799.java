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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810951;
     Object term811037;
     Object term811313;
     Object term811359;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term811037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term811129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term811359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term811129, term811129.getClass(), "type", 108);
        setField(term811037, term811037.getClass(), "parent", term811129);
        setIntField(term811037, term811037.getClass(), "type", 100);
        setIntField(term811359, term811359.getClass(), "type", 44);
        setField(term811037, term811037.getClass(), "first", term811359);
        term811313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term811313, term811313.getClass(), "type", 85);
        setField(term811313, term811313.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term811037;
        args[1] = term811313;
        args[2] = term811359;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term810951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


