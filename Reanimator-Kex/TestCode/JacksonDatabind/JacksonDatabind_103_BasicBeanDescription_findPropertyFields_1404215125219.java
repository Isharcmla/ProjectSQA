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

public class BasicBeanDescription_findPropertyFields_1404215125219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81557;

    public BasicBeanDescription_findPropertyFields_1404215125219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81737 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term81879 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term81879, term81879.getClass(), "value", null);
        setField(term81879, term81879.getClass(), "next", null);
        setField(term81737, term81737.getClass(), "_fields", term81879);
        Object term82007 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term82149 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term82149, term82149.getClass(), "value", null);
        setField(term82149, term82149.getClass(), "next", null);
        setField(term82007, term82007.getClass(), "_fields", term82149);
        Object term82187 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term81609 = new ArrayList();
        ((ArrayList) term81609).add(term81737);
        ((ArrayList) term81609).add(term82007);
        ((ArrayList) term81609).add(term82187);
        term81557 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term81557, term81557.getClass(), "_properties", term81609);
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
            callMethod(klass, "_findPropertyFields", argTypes, term81557, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


