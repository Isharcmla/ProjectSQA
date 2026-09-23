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

public class TypeCheck_visitCall_3619443331440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459206;
     Object term459380;

    public TypeCheck_visitCall_3619443331440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459206 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term459310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term459206, term459206.getClass(), "typeRegistry", term459310);
        term459380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term459450, term459450.getClass(), "jsType", null);
        setField(term459380, term459380.getClass(), "first", term459450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term459380;
        try {
            callMethod(klass, "visitCall", argTypes, term459206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


