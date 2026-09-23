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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188204;
     Object term1188296;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1188204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1188296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1188388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1188388, term1188388.getClass(), "type", 35);
        setField(term1188296, term1188296.getClass(), "first", term1188388);
        setIntField(term1188296, term1188296.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1188296;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term1188204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


