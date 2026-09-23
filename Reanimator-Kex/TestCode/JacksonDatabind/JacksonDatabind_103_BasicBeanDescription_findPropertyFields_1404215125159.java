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

public class BasicBeanDescription_findPropertyFields_1404215125159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42852;

    public BasicBeanDescription_findPropertyFields_1404215125159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43032 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term43032, term43032.getClass(), "_fields", null);
        Object term43166 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        ArrayList term42904 = new ArrayList();
        ((ArrayList) term42904).add(term43032);
        ((ArrayList) term42904).add(term43166);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        ((ArrayList) term42904).add((Object)null);
        term42852 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term42852, term42852.getClass(), "_properties", term42904);
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
            callMethod(klass, "_findPropertyFields", argTypes, term42852, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


