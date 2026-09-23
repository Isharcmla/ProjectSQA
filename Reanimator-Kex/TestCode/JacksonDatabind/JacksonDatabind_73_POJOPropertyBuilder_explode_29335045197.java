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

public class POJOPropertyBuilder_explode_29335045197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31014;

    public POJOPropertyBuilder_explode_29335045197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31014 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term31156 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term31298 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term31390 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term31532 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term31156, term31156.getClass(), "name", null);
        setBooleanField(term31156, term31156.getClass(), "isNameExplicit", false);
        setBooleanField(term31156, term31156.getClass(), "isVisible", false);
        setField(term31156, term31156.getClass(), "next", null);
        setField(term31014, term31014.getClass(), "_fields", term31156);
        setField(term31014, term31014.getClass(), "_getters", null);
        setField(term31014, term31014.getClass(), "_setters", null);
        setField(term31298, term31298.getClass(), "name", term31390);
        setBooleanField(term31298, term31298.getClass(), "isNameExplicit", false);
        setBooleanField(term31298, term31298.getClass(), "isVisible", false);
        setField(term31298, term31298.getClass(), "next", term31532);
        setField(term31014, term31014.getClass(), "_ctorParameters", term31298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term31014, args);
    }

};


