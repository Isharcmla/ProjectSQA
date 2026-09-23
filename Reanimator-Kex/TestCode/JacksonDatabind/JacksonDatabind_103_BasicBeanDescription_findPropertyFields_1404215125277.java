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

public class BasicBeanDescription_findPropertyFields_1404215125277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119515;

    public BasicBeanDescription_findPropertyFields_1404215125277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119695 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term119695, term119695.getClass(), "_fields", null);
        Object term119823 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term119965 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term119965, term119965.getClass(), "value", null);
        setField(term119965, term119965.getClass(), "next", null);
        setField(term119823, term119823.getClass(), "_fields", term119965);
        Object term120099 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term120099, term120099.getClass(), "_member", null);
        Object term120233 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term120233, term120233.getClass(), "_member", null);
        ArrayList term120285 = new ArrayList();
        Object term120323 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term119567 = new ArrayList();
        ((ArrayList) term119567).add(term119695);
        ((ArrayList) term119567).add(term119823);
        ((ArrayList) term119567).add(term120099);
        ((ArrayList) term119567).add(term120233);
        ((ArrayList) term119567).add(term120285);
        ((ArrayList) term119567).add(term120323);
        term119515 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term119515, term119515.getClass(), "_properties", term119567);
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
            callMethod(klass, "_findPropertyFields", argTypes, term119515, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


