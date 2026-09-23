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

public class BasicBeanDescription_findPropertyFields_1404215125267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112787;

    public BasicBeanDescription_findPropertyFields_1404215125267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term112967, term112967.getClass(), "_fields", null);
        Object term113095 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term113095, term113095.getClass(), "_fields", null);
        Object term113229 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        ArrayList term112839 = new ArrayList();
        ((ArrayList) term112839).add(term112967);
        ((ArrayList) term112839).add(term113095);
        ((ArrayList) term112839).add(term113229);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        ((ArrayList) term112839).add((Object)null);
        term112787 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term112787, term112787.getClass(), "_properties", term112839);
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
            callMethod(klass, "_findPropertyFields", argTypes, term112787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


