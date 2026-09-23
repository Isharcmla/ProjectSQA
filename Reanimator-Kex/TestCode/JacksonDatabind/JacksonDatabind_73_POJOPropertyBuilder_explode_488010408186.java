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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class POJOPropertyBuilder_explode_488010408186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26287;
     Object term26429;

    public POJOPropertyBuilder_explode_488010408186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26287 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term26429 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26521 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term26429, term26429.getClass(), "name", term26521);
        setBooleanField(term26429, term26429.getClass(), "isNameExplicit", false);
        setBooleanField(term26429, term26429.getClass(), "isVisible", false);
        setField(term26429, term26429.getClass(), "next", term26429);
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
        args[2] = term26429;
        callMethod(klass, "_explode", argTypes, term26287, args);
    }

};


