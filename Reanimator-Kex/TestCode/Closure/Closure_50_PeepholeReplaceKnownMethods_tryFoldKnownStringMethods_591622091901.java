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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3750054;
     Object term3750146;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3750054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3750146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3750238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3750330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3750422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3750492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3750146, term3750146.getClass(), "type", 37);
        setIntField(term3750238, term3750238.getClass(), "type", 35);
        setIntField(term3750422, term3750422.getClass(), "type", 40);
        setField(term3750422, term3750422.getClass(), "str", null);
        setField(term3750330, term3750330.getClass(), "next", term3750422);
        setIntField(term3750330, term3750330.getClass(), "type", 40);
        setField(term3750238, term3750238.getClass(), "first", term3750330);
        setIntField(term3750492, term3750492.getClass(), "type", 41);
        setField(term3750238, term3750238.getClass(), "next", term3750492);
        setField(term3750146, term3750146.getClass(), "first", term3750238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3750146;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3750054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


