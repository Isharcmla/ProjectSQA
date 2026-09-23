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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220226;
     Object term3220312;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3220226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3220312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3220404 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3220312, term3220312.getClass(), "type", 37);
        setIntField(term3220404, term3220404.getClass(), "type", 35);
        setIntField(term3220588, term3220588.getClass(), "type", 40);
        setField(term3220588, term3220588.getClass(), "str", null);
        setField(term3220496, term3220496.getClass(), "next", term3220588);
        setIntField(term3220496, term3220496.getClass(), "type", 40);
        setField(term3220404, term3220404.getClass(), "first", term3220496);
        setIntField(term3220658, term3220658.getClass(), "type", 41);
        setField(term3220404, term3220404.getClass(), "next", term3220658);
        setField(term3220312, term3220312.getClass(), "first", term3220404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3220312;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3220226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


