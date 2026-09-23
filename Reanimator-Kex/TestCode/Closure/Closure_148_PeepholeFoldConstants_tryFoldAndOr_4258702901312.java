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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316473;
     Object term316565;
     Object term316657;
     Object term316749;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316473 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term316565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term316565, term316565.getClass(), "parent", null);
        setIntField(term316565, term316565.getClass(), "type", 0);
        term316657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term316657, term316657.getClass(), "type", 0);
        term316749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term316749, term316749.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term316565;
        args[1] = term316657;
        args[2] = term316749;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term316473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


