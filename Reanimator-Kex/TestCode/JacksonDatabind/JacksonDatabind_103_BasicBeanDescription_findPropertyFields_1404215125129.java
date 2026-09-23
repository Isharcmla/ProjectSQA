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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BasicBeanDescription_findPropertyFields_1404215125129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24282;

    public BasicBeanDescription_findPropertyFields_1404215125129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24462 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term24462, term24462.getClass(), "_fields", null);
        Object term24500 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term24334 = new ArrayList();
        ((ArrayList) term24334).add(term24462);
        ((ArrayList) term24334).add(term24500);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        ((ArrayList) term24334).add((Object)null);
        term24282 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term24282, term24282.getClass(), "_properties", term24334);
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
            callMethod(klass, "_findPropertyFields", argTypes, term24282, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


