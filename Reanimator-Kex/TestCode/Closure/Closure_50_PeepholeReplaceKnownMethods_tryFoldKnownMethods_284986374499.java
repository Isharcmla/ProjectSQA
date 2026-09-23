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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3480251;
     Object term3480343;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3480251 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3480343 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3480435 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3480527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3480619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3480787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3480435, term3480435.getClass(), "type", 35);
        setIntField(term3480619, term3480619.getClass(), "type", 40);
        setField(term3480619, term3480619.getClass(), "str", "toLowerCase");
        setField(term3480527, term3480527.getClass(), "next", term3480619);
        setIntField(term3480527, term3480527.getClass(), "type", 40);
        setField(term3480527, term3480527.getClass(), "str", "");
        setField(term3480435, term3480435.getClass(), "first", term3480527);
        setField(term3480435, term3480435.getClass(), "next", null);
        setField(term3480343, term3480343.getClass(), "first", term3480435);
        setIntField(term3480343, term3480343.getClass(), "type", 37);
        setField(term3480343, term3480343.getClass(), "parent", term3480787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3480343;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3480251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


