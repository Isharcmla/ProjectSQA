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

public class POJOPropertyBuilder_explode_29335045211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37551;

    public POJOPropertyBuilder_explode_29335045211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37551 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term37693 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term37835 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term37551, term37551.getClass(), "_fields", null);
        setField(term37551, term37551.getClass(), "_getters", null);
        setField(term37693, term37693.getClass(), "name", null);
        setBooleanField(term37693, term37693.getClass(), "isNameExplicit", false);
        setBooleanField(term37693, term37693.getClass(), "isVisible", false);
        setField(term37835, term37835.getClass(), "name", null);
        setBooleanField(term37835, term37835.getClass(), "isNameExplicit", false);
        setBooleanField(term37835, term37835.getClass(), "isVisible", false);
        setField(term37835, term37835.getClass(), "next", term37835);
        setField(term37693, term37693.getClass(), "next", term37835);
        setField(term37551, term37551.getClass(), "_setters", term37693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term37551, args);
    }

};


