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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3565663;
     Object term3565749;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3565663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3565749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3565841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3565933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3566041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3565749, term3565749.getClass(), "type", 37);
        setIntField(term3565841, term3565841.getClass(), "type", 33);
        setField(term3565933, term3565933.getClass(), "next", term3565933);
        setIntField(term3565933, term3565933.getClass(), "type", 40);
        setField(term3565933, term3565933.getClass(), "str", "indexOf");
        setField(term3565841, term3565841.getClass(), "first", term3565933);
        setIntField(term3566041, term3566041.getClass(), "type", 44);
        setField(term3565841, term3565841.getClass(), "next", term3566041);
        setField(term3565749, term3565749.getClass(), "first", term3565841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3565749;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3565663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


