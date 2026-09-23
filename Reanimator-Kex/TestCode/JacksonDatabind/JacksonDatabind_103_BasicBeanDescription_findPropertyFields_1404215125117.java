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

public class BasicBeanDescription_findPropertyFields_1404215125117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17997;

    public BasicBeanDescription_findPropertyFields_1404215125117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18087 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term18049 = new ArrayList();
        ((ArrayList) term18049).add(term18087);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        ((ArrayList) term18049).add((Object)null);
        term17997 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term17997, term17997.getClass(), "_properties", term18049);
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
            callMethod(klass, "_findPropertyFields", argTypes, term17997, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


