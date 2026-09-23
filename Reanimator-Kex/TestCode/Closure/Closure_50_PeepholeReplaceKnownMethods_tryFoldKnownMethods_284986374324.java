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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2626752;
     Object term2626844;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2626752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2626844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2626936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2627028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2626936, term2626936.getClass(), "type", 35);
        setField(term2627028, term2627028.getClass(), "next", term2627028);
        setIntField(term2627028, term2627028.getClass(), "type", 40);
        setField(term2626936, term2626936.getClass(), "first", term2627028);
        setField(term2626844, term2626844.getClass(), "first", term2626936);
        setIntField(term2626844, term2626844.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2626844;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term2626752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


