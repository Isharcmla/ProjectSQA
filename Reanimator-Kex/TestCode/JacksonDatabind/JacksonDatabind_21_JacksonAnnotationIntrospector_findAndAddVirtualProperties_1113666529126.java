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
import java.util.LinkedList;
import java.lang.Object;

public class JacksonAnnotationIntrospector_findAndAddVirtualProperties_1113666529126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public JacksonAnnotationIntrospector_findAndAddVirtualProperties_1113666529126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new LinkedList();
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term3;
        try {
            callMethod(klass, "findAndAddVirtualProperties", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


