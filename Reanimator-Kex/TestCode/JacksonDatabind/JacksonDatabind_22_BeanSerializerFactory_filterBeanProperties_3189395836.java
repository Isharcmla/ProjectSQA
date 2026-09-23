package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class BeanSerializerFactory_filterBeanProperties_3189395836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public BeanSerializerFactory_filterBeanProperties_3189395836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = new LinkedList();
        ((LinkedList) term12).add((Object)null);
        ((LinkedList) term12).add((Object)null);
        ((LinkedList) term12).add((Object)null);
        ((LinkedList) term12).add((Object)null);
        ((LinkedList) term12).add((Object)null);
        ((LinkedList) term12).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term12;
        try {
            callMethod(klass, "filterBeanProperties", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


