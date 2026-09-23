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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508670;
     Object term508756;
     Object term508934;
     Object term509026;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508670 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term508756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term508842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term508842, term508842.getClass(), "type", 114);
        setField(term508756, term508756.getClass(), "parent", term508842);
        setIntField(term508756, term508756.getClass(), "type", 0);
        term508934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term508934, term508934.getClass(), "type", 93);
        term509026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term509026, term509026.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term508756;
        args[1] = term508934;
        args[2] = term509026;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term508670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


