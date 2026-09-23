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

public class POJOPropertyBuilder_explode_29335045232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48043;

    public POJOPropertyBuilder_explode_29335045232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48043 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term48185 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term48277 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term48419 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term48561 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term48653 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term48043, term48043.getClass(), "_fields", null);
        setField(term48185, term48185.getClass(), "name", term48277);
        setBooleanField(term48185, term48185.getClass(), "isNameExplicit", false);
        setBooleanField(term48185, term48185.getClass(), "isVisible", false);
        setField(term48185, term48185.getClass(), "next", null);
        setField(term48043, term48043.getClass(), "_getters", term48185);
        setField(term48419, term48419.getClass(), "name", null);
        setBooleanField(term48419, term48419.getClass(), "isNameExplicit", false);
        setBooleanField(term48419, term48419.getClass(), "isVisible", false);
        setField(term48561, term48561.getClass(), "name", term48653);
        setBooleanField(term48561, term48561.getClass(), "isNameExplicit", true);
        setField(term48419, term48419.getClass(), "next", term48561);
        setField(term48043, term48043.getClass(), "_setters", term48419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term48043, args);
    }

};


