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

public class SetterlessProperty_init_1578804247207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124372;
     Object term124798;

    public SetterlessProperty_init_1578804247207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123698 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term123798 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term123890 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term123988 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term124080 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term124238 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term123698, term123698.getClass(), "_metadata", term123798);
        setIntField(term123698, term123698.getClass(), "_propertyIndex", 0);
        setField(term123698, term123698.getClass(), "_propName", term123890);
        setField(term123698, term123698.getClass(), "_type", term123988);
        setField(term123698, term123698.getClass(), "_wrapperName", term124080);
        setField(term123698, term123698.getClass(), "_contextAnnotations", term124238);
        setField(term123698, term123698.getClass(), "_viewMatcher", null);
        term124372 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term124520 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term124650 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term124372, term124372.getClass(), "_fullName", null);
        setField(term124372, term124372.getClass(), "_annotationIntrospector", term124520);
        setField(term124372, term124372.getClass(), "_member", term124650);
        setField(term124372, term124372.getClass(), "_metadata", null);
        term124798 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term124372;
        args[1] = null;
        args[2] = term124798;
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


