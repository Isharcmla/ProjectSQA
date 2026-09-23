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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3753573;
     Object term3753665;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3753573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3753665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3753757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3753849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3753941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3754065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3753757, term3753757.getClass(), "type", 35);
        setIntField(term3753941, term3753941.getClass(), "type", 40);
        setField(term3753941, term3753941.getClass(), "str", "lastIndexOf");
        setField(term3753849, term3753849.getClass(), "next", term3753941);
        setIntField(term3753849, term3753849.getClass(), "type", 40);
        setField(term3753757, term3753757.getClass(), "first", term3753849);
        setIntField(term3754065, term3754065.getClass(), "type", 43);
        setField(term3753757, term3753757.getClass(), "next", term3754065);
        setField(term3753665, term3753665.getClass(), "first", term3753757);
        setIntField(term3753665, term3753665.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3753665;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3753573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


