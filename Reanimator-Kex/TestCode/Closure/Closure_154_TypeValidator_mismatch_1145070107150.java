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

public class TypeValidator_mismatch_1145070107150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36739;
     Object term36829;
     Object term36927;
     Object term37025;

    public TypeValidator_mismatch_1145070107150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36739 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term36829 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term36829, term36829.getClass(), "sourceName", null);
        term36927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term37025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term36829;
        args[1] = null;
        args[2] = null;
        args[3] = term36927;
        args[4] = term37025;
        try {
            callMethod(klass, "mismatch", argTypes, term36739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


