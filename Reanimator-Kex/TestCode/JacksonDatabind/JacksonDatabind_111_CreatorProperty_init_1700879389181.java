package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_1700879389181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278718;
     Object term278848;
     Object term278996;
     Object term279505;
     Object term279605;

    public CreatorProperty_init_1700879389181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term279051 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term279101 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term279147 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term279195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term279241 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term279299 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term279349 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term279051, term279051.getClass(), "_metadata", term279101);
        setIntField(term279051, term279051.getClass(), "_propertyIndex", 0);
        setField(term279051, term279051.getClass(), "_propName", term279147);
        setField(term279051, term279051.getClass(), "_type", term279195);
        setField(term279051, term279051.getClass(), "_wrapperName", term279241);
        setField(term279051, term279051.getClass(), "_contextAnnotations", term279299);
        setField(term279051, term279051.getClass(), "_viewMatcher", term279349);
        term278718 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term278718, term278718.getClass(), "_simpleName", "");
        term278848 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term278996 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term278996, term278996.getClass(), "_property", term279051);
        term279505 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        term279605 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = term278718;
        args[1] = null;
        args[2] = term278848;
        args[3] = term278996;
        args[4] = term279505;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term279605;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


