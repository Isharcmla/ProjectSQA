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

public class BasicBeanDescription_findPropertyFields_1404215125205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73233;

    public BasicBeanDescription_findPropertyFields_1404215125205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73419 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term73537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term73419, term73419.getClass(), "_member", term73537);
        Object term73665 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term73703 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term73285 = new ArrayList();
        ((ArrayList) term73285).add(term73419);
        ((ArrayList) term73285).add(term73665);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add(term73703);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        ((ArrayList) term73285).add((Object)null);
        term73233 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term73233, term73233.getClass(), "_properties", term73285);
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
            callMethod(klass, "_findPropertyFields", argTypes, term73233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


