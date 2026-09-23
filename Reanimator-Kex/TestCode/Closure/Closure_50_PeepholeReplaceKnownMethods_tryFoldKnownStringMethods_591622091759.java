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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3649485;
     Object term3649571;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3649485 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3649571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3649663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3649755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3649879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3649571, term3649571.getClass(), "type", 37);
        setIntField(term3649663, term3649663.getClass(), "type", 33);
        setField(term3649755, term3649755.getClass(), "next", term3649755);
        setIntField(term3649755, term3649755.getClass(), "type", 40);
        setField(term3649755, term3649755.getClass(), "str", "indexOf");
        setField(term3649663, term3649663.getClass(), "first", term3649755);
        setIntField(term3649879, term3649879.getClass(), "type", 40);
        setField(term3649663, term3649663.getClass(), "next", term3649879);
        setField(term3649571, term3649571.getClass(), "first", term3649663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3649571;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3649485, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


