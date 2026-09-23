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

public class POJOPropertyBuilder_explode_29335045219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41787;

    public POJOPropertyBuilder_explode_29335045219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41787 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term41929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term42071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term42163 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term41929, term41929.getClass(), "name", null);
        setBooleanField(term41929, term41929.getClass(), "isNameExplicit", false);
        setBooleanField(term41929, term41929.getClass(), "isVisible", false);
        setField(term41929, term41929.getClass(), "next", null);
        setField(term41787, term41787.getClass(), "_fields", term41929);
        setField(term41787, term41787.getClass(), "_getters", null);
        setField(term41787, term41787.getClass(), "_setters", null);
        setField(term42071, term42071.getClass(), "name", term42163);
        setBooleanField(term42071, term42071.getClass(), "isNameExplicit", true);
        setField(term41787, term41787.getClass(), "_ctorParameters", term42071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term41787, args);
    }

};


