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

public class POJOPropertyBuilder_explode_29335045160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18952;
     Object term19617;
     Object term19611;

    public POJOPropertyBuilder_explode_29335045160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19094 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term19236 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term18952, term18952.getClass(), "_fields", null);
        setField(term18952, term18952.getClass(), "_getters", null);
        setField(term19094, term19094.getClass(), "name", null);
        setBooleanField(term19094, term19094.getClass(), "isNameExplicit", false);
        setBooleanField(term19094, term19094.getClass(), "isVisible", false);
        setField(term19094, term19094.getClass(), "next", null);
        setField(term18952, term18952.getClass(), "_setters", term19094);
        setField(term18952, term18952.getClass(), "_ctorParameters", term19236);
        term19617 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19618 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term19619 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term19617, term19617.getClass(), "_forSerialization", false);
        setField(term19617, term19617.getClass(), "_config", null);
        setField(term19617, term19617.getClass(), "_annotationIntrospector", null);
        setField(term19617, term19617.getClass(), "_name", null);
        setField(term19617, term19617.getClass(), "_internalName", null);
        setField(term19617, term19617.getClass(), "_fields", null);
        setField(term19618, term19618.getClass(), "value", null);
        setField(term19618, term19618.getClass(), "next", null);
        setField(term19618, term19618.getClass(), "name", null);
        setBooleanField(term19618, term19618.getClass(), "isNameExplicit", false);
        setBooleanField(term19618, term19618.getClass(), "isVisible", false);
        setBooleanField(term19618, term19618.getClass(), "isMarkedIgnored", false);
        setField(term19617, term19617.getClass(), "_ctorParameters", term19618);
        setField(term19617, term19617.getClass(), "_getters", null);
        setField(term19619, term19619.getClass(), "value", null);
        setField(term19619, term19619.getClass(), "next", null);
        setField(term19619, term19619.getClass(), "name", null);
        setBooleanField(term19619, term19619.getClass(), "isNameExplicit", false);
        setBooleanField(term19619, term19619.getClass(), "isVisible", false);
        setBooleanField(term19619, term19619.getClass(), "isMarkedIgnored", false);
        setField(term19617, term19617.getClass(), "_setters", term19619);
        HashMap term19612 = new HashMap();
        term19611 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term19611, term19611.getClass(), "this$0", term19612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term18952, args);
        assertTrue(recursiveEquals(term18952, term19617));
        assertTrue(recursiveEquals(retValue, term19611));
    }

};


