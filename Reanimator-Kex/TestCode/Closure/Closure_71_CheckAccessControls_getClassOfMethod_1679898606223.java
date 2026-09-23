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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CheckAccessControls_getClassOfMethod_1679898606223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64476;
     Object term64546;
     Object term64616;

    public CheckAccessControls_getClassOfMethod_1679898606223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64476 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term64546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64546, term64546.getClass(), "type", 105);
        term64616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64616, term64616.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term64546;
        args[1] = term64616;
        try {
            callMethod(klass, "getClassOfMethod", argTypes, term64476, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


