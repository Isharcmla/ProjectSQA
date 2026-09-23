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

public class TypeCheck_visit_8595247841602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508406;
     Object term508602;

    public TypeCheck_visit_8595247841602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508406 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term508510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term508406, term508406.getClass(), "typeRegistry", term508510);
        term508602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term508694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term508602, term508602.getClass(), "type", 15);
        setField(term508694, term508694.getClass(), "jsType", null);
        setField(term508602, term508602.getClass(), "first", term508694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term508602;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term508406, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


