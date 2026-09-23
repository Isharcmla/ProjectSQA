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

public class CreatorProperty_init_1700879389197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333037;
     Object term333195;
     Object term333287;
     Object term333429;
     Object term333545;
     Object term333645;

    public CreatorProperty_init_1700879389197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term332341 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term332441 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term332533 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term332637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term332729 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term332845 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term332945 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term332341, term332341.getClass(), "_metadata", term332441);
        setIntField(term332341, term332341.getClass(), "_propertyIndex", 0);
        setField(term332341, term332341.getClass(), "_propName", term332533);
        setField(term332341, term332341.getClass(), "_type", term332637);
        setField(term332341, term332341.getClass(), "_wrapperName", term332729);
        setField(term332341, term332341.getClass(), "_contextAnnotations", term332845);
        setField(term332341, term332341.getClass(), "_viewMatcher", term332945);
        term333037 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term333037, term333037.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        term333195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term333287 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term333429 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term333545 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term333645 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
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
        args[0] = term333037;
        args[1] = term333195;
        args[2] = term333287;
        args[3] = term333429;
        args[4] = term333545;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term333645;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


