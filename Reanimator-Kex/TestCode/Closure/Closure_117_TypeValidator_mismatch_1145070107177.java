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

public class TypeValidator_mismatch_1145070107177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62260;
     Object term62350;
     Object term62420;
     Object term62526;
     Object term62620;

    public TypeValidator_mismatch_1145070107177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62260 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term62350 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term62350, term62350.getClass(), "sourceName", null);
        term62420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term62526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplatizedType"));
        term62620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
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
        args[0] = term62350;
        args[1] = term62420;
        args[2] = null;
        args[3] = term62526;
        args[4] = term62620;
        try {
            callMethod(klass, "mismatch", argTypes, term62260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


