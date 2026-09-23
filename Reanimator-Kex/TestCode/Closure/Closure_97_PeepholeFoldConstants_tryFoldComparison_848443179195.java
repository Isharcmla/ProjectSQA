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

public class PeepholeFoldConstants_tryFoldComparison_848443179195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37117;
     Object term37209;
     Object term37301;

    public PeepholeFoldConstants_tryFoldComparison_848443179195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term37209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37209, term37209.getClass(), "type", 14);
        term37301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37301, term37301.getClass(), "type", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term37209;
        args[1] = term37301;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term37117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


