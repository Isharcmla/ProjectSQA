package com.fasterxml.jackson.databind.deser.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FieldProperty_init_79566906161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127365;
     Object term127513;

    public FieldProperty_init_79566906161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term126935 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term127035 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term127127 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term127231 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term126935, term126935.getClass(), "_metadata", term127035);
        setIntField(term126935, term126935.getClass(), "_propertyIndex", 0);
        setField(term126935, term126935.getClass(), "_propName", term127127);
        setField(term126935, term126935.getClass(), "_type", term127231);
        setField(term126935, term126935.getClass(), "_wrapperName", null);
        setField(term126935, term126935.getClass(), "_contextAnnotations", null);
        setField(term126935, term126935.getClass(), "_viewMatcher", null);
        term127365 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term127365, term127365.getClass(), "_fullName", null);
        setField(term127365, term127365.getClass(), "_annotationIntrospector", null);
        setField(term127365, term127365.getClass(), "_metadata", null);
        term127513 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term127365;
        args[1] = null;
        args[2] = term127513;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


