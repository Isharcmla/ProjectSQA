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

public class POJOPropertyBuilder_explode_29335045199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32122;

    public POJOPropertyBuilder_explode_29335045199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32122 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term32264 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term32406 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term32122, term32122.getClass(), "_fields", null);
        setField(term32122, term32122.getClass(), "_getters", null);
        setField(term32264, term32264.getClass(), "name", null);
        setBooleanField(term32264, term32264.getClass(), "isNameExplicit", true);
        setBooleanField(term32264, term32264.getClass(), "isVisible", false);
        setField(term32264, term32264.getClass(), "next", null);
        setField(term32122, term32122.getClass(), "_setters", term32264);
        setField(term32406, term32406.getClass(), "name", null);
        setBooleanField(term32406, term32406.getClass(), "isNameExplicit", false);
        setBooleanField(term32406, term32406.getClass(), "isVisible", false);
        setField(term32406, term32406.getClass(), "next", term32406);
        setField(term32122, term32122.getClass(), "_ctorParameters", term32406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term32122, args);
    }

};


