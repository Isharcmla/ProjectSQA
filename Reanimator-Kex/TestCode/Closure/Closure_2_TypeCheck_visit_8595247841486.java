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

public class TypeCheck_visit_8595247841486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478036;
     Object term478232;

    public TypeCheck_visit_8595247841486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478036 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term478140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term478036, term478036.getClass(), "validator", null);
        setField(term478036, term478036.getClass(), "typeRegistry", term478140);
        term478232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term478324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term478232, term478232.getClass(), "type", 29);
        setField(term478324, term478324.getClass(), "jsType", null);
        setField(term478232, term478232.getClass(), "first", term478324);
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
        args[1] = term478232;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term478036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


