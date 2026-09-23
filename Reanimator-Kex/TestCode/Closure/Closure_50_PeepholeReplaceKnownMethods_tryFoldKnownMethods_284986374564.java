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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3525322;
     Object term3525414;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3525322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3525414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3525506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3525598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3525690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3525858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3525506, term3525506.getClass(), "type", 35);
        setIntField(term3525690, term3525690.getClass(), "type", 40);
        setField(term3525690, term3525690.getClass(), "str", "lastIndexOf");
        setField(term3525598, term3525598.getClass(), "next", term3525690);
        setIntField(term3525598, term3525598.getClass(), "type", 40);
        setField(term3525598, term3525598.getClass(), "str", "");
        setField(term3525506, term3525506.getClass(), "first", term3525598);
        setIntField(term3525858, term3525858.getClass(), "type", 40);
        setField(term3525858, term3525858.getClass(), "next", null);
        setField(term3525858, term3525858.getClass(), "str", "");
        setField(term3525506, term3525506.getClass(), "next", term3525858);
        setField(term3525414, term3525414.getClass(), "first", term3525506);
        setIntField(term3525414, term3525414.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3525414;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3525322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


