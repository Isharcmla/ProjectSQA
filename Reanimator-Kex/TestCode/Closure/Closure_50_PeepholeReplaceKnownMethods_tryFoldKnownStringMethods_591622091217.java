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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1176707;
     Object term1176799;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1176707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1176799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1176891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1176799, term1176799.getClass(), "type", 37);
        setIntField(term1176891, term1176891.getClass(), "type", 33);
        setField(term1176799, term1176799.getClass(), "first", term1176891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1176799;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1176707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


