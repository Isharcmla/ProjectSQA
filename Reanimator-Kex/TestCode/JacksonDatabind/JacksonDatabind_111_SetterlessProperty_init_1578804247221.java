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

public class SetterlessProperty_init_1578804247221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133446;

    public SetterlessProperty_init_1578804247221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term133218 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term133318 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term133218, term133218.getClass(), "_metadata", term133318);
        setIntField(term133218, term133218.getClass(), "_propertyIndex", 0);
        term133446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term133538 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term133718 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term133818 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term133538, term133538.getClass(), "_simpleName", "");
        setField(term133446, term133446.getClass(), "_name", term133538);
        setBooleanField(term133446, term133446.getClass(), "_forSerialization", false);
        setField(term133446, term133446.getClass(), "_ctorParameters", null);
        setField(term133446, term133446.getClass(), "_setters", null);
        setField(term133718, term133718.getClass(), "value", null);
        setField(term133718, term133718.getClass(), "next", null);
        setField(term133446, term133446.getClass(), "_fields", term133718);
        setField(term133446, term133446.getClass(), "_getters", null);
        setField(term133446, term133446.getClass(), "_metadata", term133818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term133446;
        args[1] = null;
        args[2] = null;
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


