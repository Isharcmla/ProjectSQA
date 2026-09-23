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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DisambiguateProperties_recordInvalidationError_1320724081150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52824;
     Object term53028;

    public DisambiguateProperties_recordInvalidationError_1320724081150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52824 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term52934 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableListMultimap"));
        setField(term52824, term52824.getClass(), "invalidationMap", term52934);
        ArrayList term53080 = new ArrayList();
        term53028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term53028, term53028.getClass(), "alternates", term53080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term53028;
        args[1] = null;
        try {
            callMethod(klass, "recordInvalidationError", argTypes, term52824, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


