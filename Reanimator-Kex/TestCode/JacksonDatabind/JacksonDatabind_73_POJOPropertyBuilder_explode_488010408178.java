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

public class POJOPropertyBuilder_explode_488010408178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22990;
     Object term23132;

    public POJOPropertyBuilder_explode_488010408178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22990 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term23132 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term23132, term23132.getClass(), "name", null);
        setBooleanField(term23132, term23132.getClass(), "isNameExplicit", false);
        setBooleanField(term23132, term23132.getClass(), "isVisible", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term23132;
        try {
            callMethod(klass, "_explode", argTypes, term22990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


