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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602546;
     Object term602632;
     Object term602724;
     Object term602794;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602546 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term602632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term602632, term602632.getClass(), "parent", null);
        setIntField(term602632, term602632.getClass(), "type", 0);
        term602724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term602724, term602724.getClass(), "type", 0);
        term602794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term602794, term602794.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term602632;
        args[1] = term602724;
        args[2] = term602794;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term602546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


