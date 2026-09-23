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
import java.util.LinkedHashMap;

public class POJOPropertiesCollector_addGetterMethod_43146062259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public POJOPropertiesCollector_addGetterMethod_43146062259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Object[] args = new Object[3];
        args[0] = term166;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "_addGetterMethod", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


