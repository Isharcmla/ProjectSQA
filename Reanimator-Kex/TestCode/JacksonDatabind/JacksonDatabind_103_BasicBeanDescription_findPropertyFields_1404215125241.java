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

public class BasicBeanDescription_findPropertyFields_1404215125241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95294;

    public BasicBeanDescription_findPropertyFields_1404215125241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95474 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term95474, term95474.getClass(), "_fields", null);
        Object term95608 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term95608, term95608.getClass(), "_member", null);
        Object term95736 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term95878 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term95736, term95736.getClass(), "_fields", term95878);
        ArrayList term95346 = new ArrayList();
        ((ArrayList) term95346).add(term95474);
        ((ArrayList) term95346).add(term95608);
        ((ArrayList) term95346).add(term95736);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        ((ArrayList) term95346).add((Object)null);
        term95294 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term95294, term95294.getClass(), "_properties", term95346);
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
            callMethod(klass, "_findPropertyFields", argTypes, term95294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


