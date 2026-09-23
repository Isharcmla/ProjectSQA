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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckAccessControls_checkConstructorDeprecation_498101069447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211453;
     Object term211523;

    public CheckAccessControls_checkConstructorDeprecation_498101069447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211453 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term211523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term211641, term211641.getClass(), "docInfo", null);
        setField(term211641, term211641.getClass(), "implicitPrototypeFallback", term211641);
        setField(term211523, term211523.getClass(), "jsType", term211641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term211523;
        args[2] = null;
        try {
            callMethod(klass, "checkConstructorDeprecation", argTypes, term211453, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


