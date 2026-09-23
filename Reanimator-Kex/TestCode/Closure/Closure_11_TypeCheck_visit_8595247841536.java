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

public class TypeCheck_visit_8595247841536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481057;
     Object term481253;

    public TypeCheck_visit_8595247841536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481057 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term481161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term481057, term481057.getClass(), "validator", null);
        setField(term481057, term481057.getClass(), "typeRegistry", term481161);
        term481253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term481345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term481253, term481253.getClass(), "type", 103);
        setField(term481345, term481345.getClass(), "jsType", null);
        setField(term481253, term481253.getClass(), "first", term481345);
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
        args[1] = term481253;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term481057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


