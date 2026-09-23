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

public class POJOPropertyBuilder_explode_29335045212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38022;

    public POJOPropertyBuilder_explode_29335045212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38022 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term38164 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term38306 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term38398 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term38540 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term38022, term38022.getClass(), "_fields", null);
        setField(term38164, term38164.getClass(), "name", null);
        setBooleanField(term38164, term38164.getClass(), "isNameExplicit", false);
        setBooleanField(term38164, term38164.getClass(), "isVisible", false);
        setField(term38306, term38306.getClass(), "name", term38398);
        setBooleanField(term38306, term38306.getClass(), "isNameExplicit", false);
        setBooleanField(term38306, term38306.getClass(), "isVisible", false);
        setField(term38306, term38306.getClass(), "next", null);
        setField(term38164, term38164.getClass(), "next", term38306);
        setField(term38022, term38022.getClass(), "_getters", term38164);
        setField(term38022, term38022.getClass(), "_setters", term38540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term38022, args);
    }

};


