package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BasicBeanDescription_findPropertyFields_1404215125305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141055;

    public BasicBeanDescription_findPropertyFields_1404215125305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141241 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term141359 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term141451 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term141241, term141241.getClass(), "_member", term141359);
        setField(term141241, term141241.getClass(), "_fullName", term141451);
        Object term141489 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term141107 = new ArrayList();
        ((ArrayList) term141107).add(term141241);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add((Object)null);
        ((ArrayList) term141107).add(term141489);
        term141055 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term141055, term141055.getClass(), "_properties", term141107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term141055, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


