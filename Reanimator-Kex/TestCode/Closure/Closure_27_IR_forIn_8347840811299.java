package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IR_forIn_8347840811299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214600;
     Object term214670;

    public IR_forIn_8347840811299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term214600, term214600.getClass(), "type", 25);
        term214670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term214670, term214670.getClass(), "type", 113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term214600;
        args[1] = term214670;
        args[2] = null;
        try {
            callMethod(klass, "forIn", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


