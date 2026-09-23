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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503010;
     Object term3503102;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3503102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3503194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3503286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3503378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3503194, term3503194.getClass(), "type", 35);
        setIntField(term3503378, term3503378.getClass(), "type", 40);
        setField(term3503378, term3503378.getClass(), "str", "toUpperCase");
        setField(term3503286, term3503286.getClass(), "next", term3503378);
        setIntField(term3503286, term3503286.getClass(), "type", 40);
        setField(term3503286, term3503286.getClass(), "str", "");
        setField(term3503194, term3503194.getClass(), "first", term3503286);
        setField(term3503194, term3503194.getClass(), "next", null);
        setField(term3503102, term3503102.getClass(), "first", term3503194);
        setIntField(term3503102, term3503102.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3503102;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3503010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


