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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489038;
     Object term489124;
     Object term489308;
     Object term489400;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term489124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term489216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term489216, term489216.getClass(), "type", 108);
        setField(term489124, term489124.getClass(), "parent", term489216);
        setIntField(term489124, term489124.getClass(), "type", 100);
        term489308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term489308, term489308.getClass(), "type", 52);
        term489400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term489400, term489400.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term489124;
        args[1] = term489308;
        args[2] = term489400;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term489038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


