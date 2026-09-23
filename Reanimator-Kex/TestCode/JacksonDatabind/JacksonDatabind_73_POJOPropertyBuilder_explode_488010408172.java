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
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;

public class POJOPropertyBuilder_explode_488010408172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21612;
     Object term21754;
     Object term22350;
     Object term22351;

    public POJOPropertyBuilder_explode_488010408172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21612 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term21754 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term21754, term21754.getClass(), "name", null);
        setBooleanField(term21754, term21754.getClass(), "isNameExplicit", true);
        term22350 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term22350, term22350.getClass(), "_forSerialization", false);
        setField(term22350, term22350.getClass(), "_config", null);
        setField(term22350, term22350.getClass(), "_annotationIntrospector", null);
        setField(term22350, term22350.getClass(), "_name", null);
        setField(term22350, term22350.getClass(), "_internalName", null);
        setField(term22350, term22350.getClass(), "_fields", null);
        setField(term22350, term22350.getClass(), "_ctorParameters", null);
        setField(term22350, term22350.getClass(), "_getters", null);
        setField(term22350, term22350.getClass(), "_setters", null);
        term22351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term22351, term22351.getClass(), "value", null);
        setField(term22351, term22351.getClass(), "next", null);
        setField(term22351, term22351.getClass(), "name", null);
        setBooleanField(term22351, term22351.getClass(), "isNameExplicit", true);
        setBooleanField(term22351, term22351.getClass(), "isVisible", false);
        setBooleanField(term22351, term22351.getClass(), "isMarkedIgnored", false);
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
        args[2] = term21754;
        callMethod(klass, "_explode", argTypes, term21612, args);
        assertTrue(recursiveEquals(term21612, term22350));
        assertTrue(recursiveEquals(term21754, term22351));
    }

};


