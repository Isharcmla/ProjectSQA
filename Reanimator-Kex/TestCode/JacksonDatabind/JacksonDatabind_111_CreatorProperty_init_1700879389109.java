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

public class CreatorProperty_init_1700879389109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55464;
     Object term55622;
     Object term55714;
     Object term55862;
     Object term56020;

    public CreatorProperty_init_1700879389109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54710 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term54810 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term54902 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term55114 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55272 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term55372 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term54710, term54710.getClass(), "_metadata", term54810);
        setIntField(term54710, term54710.getClass(), "_propertyIndex", 0);
        setField(term54710, term54710.getClass(), "_propName", term54902);
        setField(term54710, term54710.getClass(), "_type", term55022);
        setField(term54710, term54710.getClass(), "_wrapperName", term55114);
        setField(term54710, term54710.getClass(), "_contextAnnotations", term55272);
        setField(term54710, term54710.getClass(), "_viewMatcher", term55372);
        term55464 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term55464, term55464.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        term55622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term55714 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term55862 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term56020 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term55464;
        args[1] = term55622;
        args[2] = term55714;
        args[3] = term55862;
        args[4] = term56020;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


