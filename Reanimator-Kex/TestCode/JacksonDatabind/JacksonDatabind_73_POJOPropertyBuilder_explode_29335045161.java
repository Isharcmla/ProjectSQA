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
import java.lang.Object;
import java.util.HashMap;

public class POJOPropertyBuilder_explode_29335045161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19435;
     Object term19649;
     Object term19643;

    public POJOPropertyBuilder_explode_29335045161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19435 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19577 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term19435, term19435.getClass(), "_fields", null);
        setField(term19577, term19577.getClass(), "name", null);
        setBooleanField(term19577, term19577.getClass(), "isNameExplicit", true);
        setField(term19435, term19435.getClass(), "_getters", term19577);
        term19649 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19650 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term19649, term19649.getClass(), "_forSerialization", false);
        setField(term19649, term19649.getClass(), "_config", null);
        setField(term19649, term19649.getClass(), "_annotationIntrospector", null);
        setField(term19649, term19649.getClass(), "_name", null);
        setField(term19649, term19649.getClass(), "_internalName", null);
        setField(term19649, term19649.getClass(), "_fields", null);
        setField(term19649, term19649.getClass(), "_ctorParameters", null);
        setField(term19650, term19650.getClass(), "value", null);
        setField(term19650, term19650.getClass(), "next", null);
        setField(term19650, term19650.getClass(), "name", null);
        setBooleanField(term19650, term19650.getClass(), "isNameExplicit", true);
        setBooleanField(term19650, term19650.getClass(), "isVisible", false);
        setBooleanField(term19650, term19650.getClass(), "isMarkedIgnored", false);
        setField(term19649, term19649.getClass(), "_getters", term19650);
        setField(term19649, term19649.getClass(), "_setters", null);
        HashMap term19644 = new HashMap();
        term19643 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term19643, term19643.getClass(), "this$0", term19644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term19435, args);
        assertTrue(recursiveEquals(term19435, term19649));
        assertTrue(recursiveEquals(retValue, term19643));
    }

};


