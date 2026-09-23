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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PeepholeReplaceKnownMethods_tryFoldStringCharAt_1897773713212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171932;
     Object term1172024;
     Object term1172116;

    public PeepholeReplaceKnownMethods_tryFoldStringCharAt_1897773713212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1171932 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1172024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1172024, term1172024.getClass(), "type", 37);
        term1172116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1172116, term1172116.getClass(), "type", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term1172024;
        args[1] = term1172116;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldStringCharAt", argTypes, term1171932, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


