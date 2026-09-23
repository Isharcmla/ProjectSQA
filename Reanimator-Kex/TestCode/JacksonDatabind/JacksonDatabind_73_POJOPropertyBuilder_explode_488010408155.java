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

public class POJOPropertyBuilder_explode_488010408155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18304;
     Object term18446;
     Object term18463;
     Object term18464;

    public POJOPropertyBuilder_explode_488010408155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18304 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term18446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        term18463 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term18463, term18463.getClass(), "_forSerialization", false);
        setField(term18463, term18463.getClass(), "_config", null);
        setField(term18463, term18463.getClass(), "_annotationIntrospector", null);
        setField(term18463, term18463.getClass(), "_name", null);
        setField(term18463, term18463.getClass(), "_internalName", null);
        setField(term18463, term18463.getClass(), "_fields", null);
        setField(term18463, term18463.getClass(), "_ctorParameters", null);
        setField(term18463, term18463.getClass(), "_getters", null);
        setField(term18463, term18463.getClass(), "_setters", null);
        term18464 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term18464, term18464.getClass(), "value", null);
        setField(term18464, term18464.getClass(), "next", null);
        setField(term18464, term18464.getClass(), "name", null);
        setBooleanField(term18464, term18464.getClass(), "isNameExplicit", false);
        setBooleanField(term18464, term18464.getClass(), "isVisible", false);
        setBooleanField(term18464, term18464.getClass(), "isMarkedIgnored", false);
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
        args[2] = term18446;
        callMethod(klass, "_explode", argTypes, term18304, args);
        assertTrue(recursiveEquals(term18304, term18463));
        assertTrue(recursiveEquals(term18446, term18464));
    }

};


