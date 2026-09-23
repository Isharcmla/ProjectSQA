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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_189141968738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8157;
     Object term8501;
     Object term9951;
     Object term9958;
     Object term9963;

    public ObjectIdValueProperty_init_189141968738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7939 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8039 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term7939, term7939.getClass(), "_metadata", term8039);
        setIntField(term7939, term7939.getClass(), "_propertyIndex", 0);
        term8157 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term8249 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term8249, term8249.getClass(), "_simpleName", "");
        setField(term8157, term8157.getClass(), "propertyName", term8249);
        setField(term8157, term8157.getClass(), "_idType", term8401);
        setField(term8157, term8157.getClass(), "_deserializer", null);
        term8501 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term9951 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term9952 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term9953 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term9954 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9957 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term9953, term9953.getClass(), "_elementType", null);
        setField(term9953, term9953.getClass(), "_superClass", null);
        setField(term9953, term9953.getClass(), "_superInterfaces", null);
        setField(term9953, term9953.getClass(), "_bindings", null);
        setField(term9953, term9953.getClass(), "_canonicalName", null);
        setField(term9953, term9953.getClass(), "_class", null);
        setIntField(term9953, term9953.getClass(), "_hash", 0);
        setField(term9953, term9953.getClass(), "_valueHandler", null);
        setField(term9953, term9953.getClass(), "_typeHandler", null);
        setBooleanField(term9953, term9953.getClass(), "_asStatic", false);
        setField(term9952, term9952.getClass(), "_idType", term9953);
        setField(term9954, term9954.getClass(), "_simpleName", "");
        setField(term9954, term9954.getClass(), "_namespace", null);
        setField(term9954, term9954.getClass(), "_encodedSimple", null);
        setField(term9952, term9952.getClass(), "propertyName", term9954);
        setField(term9952, term9952.getClass(), "generator", null);
        setField(term9952, term9952.getClass(), "resolver", null);
        setField(term9952, term9952.getClass(), "_deserializer", null);
        setField(term9952, term9952.getClass(), "idProperty", null);
        setField(term9951, term9951.getClass(), "_objectIdReader", term9952);
        setField(term9951, term9951.getClass(), "_propName", term9954);
        setField(term9951, term9951.getClass(), "_type", term9953);
        setField(term9951, term9951.getClass(), "_wrapperName", null);
        setField(term9951, term9951.getClass(), "_contextAnnotations", null);
        setField(term9951, term9951.getClass(), "_valueDeserializer", null);
        setField(term9951, term9951.getClass(), "_valueTypeDeserializer", null);
        setField(term9951, term9951.getClass(), "_managedReferenceName", null);
        setField(term9951, term9951.getClass(), "_objectIdInfo", null);
        setField(term9951, term9951.getClass(), "_viewMatcher", null);
        setIntField(term9951, term9951.getClass(), "_propertyIndex", -1);
        setField(term9957, term9957.getClass(), "_required", null);
        setField(term9957, term9957.getClass(), "_description", null);
        setField(term9957, term9957.getClass(), "_index", null);
        setField(term9957, term9957.getClass(), "_defaultValue", null);
        setField(term9951, term9951.getClass(), "_metadata", term9957);
        setField(term9951, term9951.getClass(), "_format", null);
        term9958 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term9959 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term9960 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term9959, term9959.getClass(), "_elementType", null);
        setField(term9959, term9959.getClass(), "_superClass", null);
        setField(term9959, term9959.getClass(), "_superInterfaces", null);
        setField(term9959, term9959.getClass(), "_bindings", null);
        setField(term9959, term9959.getClass(), "_canonicalName", null);
        setField(term9959, term9959.getClass(), "_class", null);
        setIntField(term9959, term9959.getClass(), "_hash", 0);
        setField(term9959, term9959.getClass(), "_valueHandler", null);
        setField(term9959, term9959.getClass(), "_typeHandler", null);
        setBooleanField(term9959, term9959.getClass(), "_asStatic", false);
        setField(term9958, term9958.getClass(), "_idType", term9959);
        setField(term9960, term9960.getClass(), "_simpleName", "");
        setField(term9960, term9960.getClass(), "_namespace", null);
        setField(term9960, term9960.getClass(), "_encodedSimple", null);
        setField(term9958, term9958.getClass(), "propertyName", term9960);
        setField(term9958, term9958.getClass(), "generator", null);
        setField(term9958, term9958.getClass(), "resolver", null);
        setField(term9958, term9958.getClass(), "_deserializer", null);
        setField(term9958, term9958.getClass(), "idProperty", null);
        term9963 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term9963, term9963.getClass(), "_required", null);
        setField(term9963, term9963.getClass(), "_description", null);
        setField(term9963, term9963.getClass(), "_index", null);
        setField(term9963, term9963.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term8157;
        args[1] = term8501;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9951));
        assertTrue(recursiveEquals(term8157, term9958));
        assertTrue(recursiveEquals(term8501, term9963));
    }

};


