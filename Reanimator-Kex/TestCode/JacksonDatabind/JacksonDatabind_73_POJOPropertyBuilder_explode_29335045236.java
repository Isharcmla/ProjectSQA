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

public class POJOPropertyBuilder_explode_29335045236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51438;

    public POJOPropertyBuilder_explode_29335045236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51438 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term51580 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term51672 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term51814 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term51956 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term51438, term51438.getClass(), "_fields", null);
        setField(term51580, term51580.getClass(), "name", term51672);
        setBooleanField(term51580, term51580.getClass(), "isNameExplicit", false);
        setBooleanField(term51580, term51580.getClass(), "isVisible", false);
        setField(term51580, term51580.getClass(), "next", null);
        setField(term51438, term51438.getClass(), "_getters", term51580);
        setField(term51814, term51814.getClass(), "name", null);
        setBooleanField(term51814, term51814.getClass(), "isNameExplicit", false);
        setBooleanField(term51814, term51814.getClass(), "isVisible", false);
        setField(term51956, term51956.getClass(), "name", null);
        setBooleanField(term51956, term51956.getClass(), "isNameExplicit", false);
        setBooleanField(term51956, term51956.getClass(), "isVisible", true);
        setField(term51814, term51814.getClass(), "next", term51956);
        setField(term51438, term51438.getClass(), "_setters", term51814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term51438, args);
    }

};


