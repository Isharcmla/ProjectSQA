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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691292;
     Object term3691378;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3691292 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3691378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3691470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3691562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3691654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3691378, term3691378.getClass(), "type", 37);
        setIntField(term3691470, term3691470.getClass(), "type", 35);
        setIntField(term3691654, term3691654.getClass(), "type", 40);
        setField(term3691654, term3691654.getClass(), "str", "toUpperCase");
        setField(term3691562, term3691562.getClass(), "next", term3691654);
        setIntField(term3691562, term3691562.getClass(), "type", 40);
        setField(term3691470, term3691470.getClass(), "first", term3691562);
        setField(term3691470, term3691470.getClass(), "next", null);
        setField(term3691378, term3691378.getClass(), "first", term3691470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3691378;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3691292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


