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

public class PeepholeFoldConstants_tryFoldAndOr_425870290144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28031;
     Object term28123;
     Object term28215;

    public PeepholeFoldConstants_tryFoldAndOr_425870290144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28031 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term28123, term28123.getClass(), "parent", null);
        setIntField(term28123, term28123.getClass(), "type", 0);
        term28215 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term28123;
        args[1] = term28215;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term28031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


