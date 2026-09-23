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

public class BasicBeanDescription_findPropertyFields_1404215125225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86171;

    public BasicBeanDescription_findPropertyFields_1404215125225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term86493 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term86493, term86493.getClass(), "value", null);
        setField(term86493, term86493.getClass(), "next", null);
        setField(term86351, term86351.getClass(), "_fields", term86493);
        Object term86621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term86621, term86621.getClass(), "_fields", null);
        ArrayList term86223 = new ArrayList();
        ((ArrayList) term86223).add(term86351);
        ((ArrayList) term86223).add(term86621);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        ((ArrayList) term86223).add((Object)null);
        term86171 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term86171, term86171.getClass(), "_properties", term86223);
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
            callMethod(klass, "_findPropertyFields", argTypes, term86171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


