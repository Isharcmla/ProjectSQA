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

public class POJOPropertyBuilder_explode_29335045230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46515;

    public POJOPropertyBuilder_explode_29335045230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46515 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term46657 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term46749 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term46891 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term47033 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term47125 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term46515, term46515.getClass(), "_fields", null);
        setField(term46657, term46657.getClass(), "name", term46749);
        setBooleanField(term46657, term46657.getClass(), "isNameExplicit", false);
        setBooleanField(term46657, term46657.getClass(), "isVisible", false);
        setField(term46657, term46657.getClass(), "next", null);
        setField(term46515, term46515.getClass(), "_getters", term46657);
        setField(term46891, term46891.getClass(), "name", null);
        setBooleanField(term46891, term46891.getClass(), "isNameExplicit", false);
        setBooleanField(term46891, term46891.getClass(), "isVisible", false);
        setField(term47033, term47033.getClass(), "name", term47125);
        setBooleanField(term47033, term47033.getClass(), "isNameExplicit", false);
        setBooleanField(term47033, term47033.getClass(), "isVisible", false);
        setField(term47033, term47033.getClass(), "next", term47033);
        setField(term46891, term46891.getClass(), "next", term47033);
        setField(term46515, term46515.getClass(), "_setters", term46891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term46515, args);
    }

};


