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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314066;
     Object term314158;
     Object term314250;
     Object term314342;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314066 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term314158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term314158, term314158.getClass(), "parent", null);
        setIntField(term314158, term314158.getClass(), "type", 0);
        term314250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term314250, term314250.getClass(), "type", 0);
        term314342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term314342, term314342.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term314158;
        args[1] = term314250;
        args[2] = term314342;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term314066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


