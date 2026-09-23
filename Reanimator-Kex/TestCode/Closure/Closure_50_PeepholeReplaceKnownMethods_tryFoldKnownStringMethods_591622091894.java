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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3746180;
     Object term3746266;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3746180 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3746266 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3746358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3746450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3746542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3746672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3746266, term3746266.getClass(), "type", 37);
        setIntField(term3746358, term3746358.getClass(), "type", 33);
        setIntField(term3746542, term3746542.getClass(), "type", 40);
        setField(term3746542, term3746542.getClass(), "str", "lastIndexOf");
        setField(term3746450, term3746450.getClass(), "next", term3746542);
        setIntField(term3746450, term3746450.getClass(), "type", 40);
        setField(term3746358, term3746358.getClass(), "first", term3746450);
        setIntField(term3746672, term3746672.getClass(), "type", 39);
        setField(term3746358, term3746358.getClass(), "next", term3746672);
        setField(term3746266, term3746266.getClass(), "first", term3746358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3746266;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3746180, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


