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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504421;
     Object term504513;
     Object term504651;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504421 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term504513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term504651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term504513, term504513.getClass(), "parent", null);
        setIntField(term504513, term504513.getClass(), "type", 100);
        setIntField(term504651, term504651.getClass(), "type", 47);
        setField(term504513, term504513.getClass(), "first", term504651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term504513;
        args[1] = term504651;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term504421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


