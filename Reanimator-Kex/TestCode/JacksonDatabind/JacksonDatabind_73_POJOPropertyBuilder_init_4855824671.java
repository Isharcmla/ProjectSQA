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
import java.lang.Boolean;

public class POJOPropertyBuilder_init_4855824671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term77;

    public POJOPropertyBuilder_init_4855824671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term77 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term77, term77.getClass(), "_forSerialization", false);
        setField(term77, term77.getClass(), "_config", null);
        setField(term77, term77.getClass(), "_annotationIntrospector", null);
        setField(term77, term77.getClass(), "_name", null);
        setField(term77, term77.getClass(), "_internalName", null);
        setField(term77, term77.getClass(), "_fields", null);
        setField(term77, term77.getClass(), "_ctorParameters", null);
        setField(term77, term77.getClass(), "_getters", null);
        setField(term77, term77.getClass(), "_setters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77));
        assertTrue(recursiveEquals(term1, false));
    }

};


