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

public class PeepholeFoldConstants_tryFoldComparison_848443179309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60003;
     Object term60095;
     Object term60187;

    public PeepholeFoldConstants_tryFoldComparison_848443179309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term60095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term60095, term60095.getClass(), "type", 14);
        term60187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term60187, term60187.getClass(), "type", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term60095;
        args[1] = term60187;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term60003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


