package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FunctionType_resolveInternal_5807426439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293530;

    public FunctionType_resolveInternal_5807426439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293620 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term293582 = new ArrayList();
        ((ArrayList) term293582).add(term293620);
        term293530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term293530, term293530.getClass(), "call", null);
        setField(term293530, term293530.getClass(), "prototype", null);
        setField(term293530, term293530.getClass(), "typeOfThis", null);
        setField(term293530, term293530.getClass(), "implementedInterfaces", term293582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term293530, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


