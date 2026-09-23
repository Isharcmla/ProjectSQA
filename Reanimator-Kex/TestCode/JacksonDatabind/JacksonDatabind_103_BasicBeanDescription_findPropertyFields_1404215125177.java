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

public class BasicBeanDescription_findPropertyFields_1404215125177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54488;

    public BasicBeanDescription_findPropertyFields_1404215125177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54668 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term54810 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term54668, term54668.getClass(), "_fields", term54810);
        Object term54848 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term54540 = new ArrayList();
        ((ArrayList) term54540).add(term54668);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add(term54848);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add((Object)null);
        ((ArrayList) term54540).add((Object)null);
        term54488 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term54488, term54488.getClass(), "_properties", term54540);
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
            callMethod(klass, "_findPropertyFields", argTypes, term54488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


