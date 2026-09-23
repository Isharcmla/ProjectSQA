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

public class ObjectIdValueProperty_init_120889015740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7659;
     Object term8134;
     Object term8930;
     Object term8940;
     Object term8941;

    public ObjectIdValueProperty_init_120889015740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7659 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term7705 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7751 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term7797 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7847 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term7905 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term7979 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setIntField(term7659, term7659.getClass(), "_propertyIndex", 0);
        setField(term7659, term7659.getClass(), "_propName", term7705);
        setField(term7659, term7659.getClass(), "_type", term7751);
        setField(term7659, term7659.getClass(), "_wrapperName", term7797);
        setField(term7659, term7659.getClass(), "_metadata", term7847);
        setField(term7659, term7659.getClass(), "_contextAnnotations", term7905);
        setField(term7659, term7659.getClass(), "_valueTypeDeserializer", term7979);
        setField(term7659, term7659.getClass(), "_managedReferenceName", "");
        term8134 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        term8930 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8931 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term8933 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term8935 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        Object term8936 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term8937 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term8930, term8930.getClass(), "_objectIdReader", null);
        setField(term8931, term8931.getClass(), "_simpleName", null);
        setField(term8931, term8931.getClass(), "_namespace", null);
        setField(term8931, term8931.getClass(), "_encodedSimple", null);
        setField(term8930, term8930.getClass(), "_propName", term8931);
        setField(term8932, term8932.getClass(), "_keyType", null);
        setField(term8932, term8932.getClass(), "_valueType", null);
        setField(term8932, term8932.getClass(), "_canonicalName", null);
        setField(term8932, term8932.getClass(), "_class", null);
        setIntField(term8932, term8932.getClass(), "_hash", 0);
        setField(term8932, term8932.getClass(), "_valueHandler", null);
        setField(term8932, term8932.getClass(), "_typeHandler", null);
        setBooleanField(term8932, term8932.getClass(), "_asStatic", false);
        setField(term8930, term8930.getClass(), "_type", term8932);
        setField(term8933, term8933.getClass(), "_simpleName", null);
        setField(term8933, term8933.getClass(), "_namespace", null);
        setField(term8933, term8933.getClass(), "_encodedSimple", null);
        setField(term8930, term8930.getClass(), "_wrapperName", term8933);
        setField(term8934, term8934.getClass(), "_annotations", null);
        setField(term8930, term8930.getClass(), "_contextAnnotations", term8934);
        setField(term8935, term8935.getClass(), "_typeDeserializer", null);
        setField(term8935, term8935.getClass(), "_deserializer", null);
        setField(term8930, term8930.getClass(), "_valueDeserializer", term8935);
        setField(term8936, term8936.getClass(), "_inclusion", null);
        setField(term8936, term8936.getClass(), "_idResolver", null);
        setField(term8936, term8936.getClass(), "_baseType", null);
        setField(term8936, term8936.getClass(), "_property", null);
        setField(term8936, term8936.getClass(), "_defaultImpl", null);
        setField(term8936, term8936.getClass(), "_typePropertyName", null);
        setBooleanField(term8936, term8936.getClass(), "_typeIdVisible", false);
        setField(term8936, term8936.getClass(), "_deserializers", null);
        setField(term8936, term8936.getClass(), "_defaultImplDeserializer", null);
        setField(term8930, term8930.getClass(), "_valueTypeDeserializer", term8936);
        setField(term8930, term8930.getClass(), "_nullProvider", null);
        setField(term8937, term8937.getClass(), "_required", null);
        setField(term8937, term8937.getClass(), "_description", null);
        setField(term8937, term8937.getClass(), "_index", null);
        setField(term8937, term8937.getClass(), "_defaultValue", null);
        setField(term8930, term8930.getClass(), "_metadata", term8937);
        setField(term8930, term8930.getClass(), "_managedReferenceName", "");
        setField(term8930, term8930.getClass(), "_objectIdInfo", null);
        setField(term8930, term8930.getClass(), "_viewMatcher", null);
        setIntField(term8930, term8930.getClass(), "_propertyIndex", 0);
        term8940 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(term8940, term8940.getClass(), "_typeDeserializer", null);
        setField(term8940, term8940.getClass(), "_deserializer", null);
        term8941 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8942 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term8944 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8945 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term8946 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term8947 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term8941, term8941.getClass(), "_objectIdReader", null);
        setField(term8942, term8942.getClass(), "_simpleName", null);
        setField(term8942, term8942.getClass(), "_namespace", null);
        setField(term8942, term8942.getClass(), "_encodedSimple", null);
        setField(term8941, term8941.getClass(), "_propName", term8942);
        setField(term8943, term8943.getClass(), "_keyType", null);
        setField(term8943, term8943.getClass(), "_valueType", null);
        setField(term8943, term8943.getClass(), "_canonicalName", null);
        setField(term8943, term8943.getClass(), "_class", null);
        setIntField(term8943, term8943.getClass(), "_hash", 0);
        setField(term8943, term8943.getClass(), "_valueHandler", null);
        setField(term8943, term8943.getClass(), "_typeHandler", null);
        setBooleanField(term8943, term8943.getClass(), "_asStatic", false);
        setField(term8941, term8941.getClass(), "_type", term8943);
        setField(term8944, term8944.getClass(), "_simpleName", null);
        setField(term8944, term8944.getClass(), "_namespace", null);
        setField(term8944, term8944.getClass(), "_encodedSimple", null);
        setField(term8941, term8941.getClass(), "_wrapperName", term8944);
        setField(term8945, term8945.getClass(), "_annotations", null);
        setField(term8941, term8941.getClass(), "_contextAnnotations", term8945);
        setField(term8941, term8941.getClass(), "_valueDeserializer", null);
        setField(term8946, term8946.getClass(), "_inclusion", null);
        setField(term8946, term8946.getClass(), "_idResolver", null);
        setField(term8946, term8946.getClass(), "_baseType", null);
        setField(term8946, term8946.getClass(), "_property", null);
        setField(term8946, term8946.getClass(), "_defaultImpl", null);
        setField(term8946, term8946.getClass(), "_typePropertyName", null);
        setBooleanField(term8946, term8946.getClass(), "_typeIdVisible", false);
        setField(term8946, term8946.getClass(), "_deserializers", null);
        setField(term8946, term8946.getClass(), "_defaultImplDeserializer", null);
        setField(term8941, term8941.getClass(), "_valueTypeDeserializer", term8946);
        setField(term8941, term8941.getClass(), "_nullProvider", null);
        setField(term8947, term8947.getClass(), "_required", null);
        setField(term8947, term8947.getClass(), "_description", null);
        setField(term8947, term8947.getClass(), "_index", null);
        setField(term8947, term8947.getClass(), "_defaultValue", null);
        setField(term8941, term8941.getClass(), "_metadata", term8947);
        setField(term8941, term8941.getClass(), "_managedReferenceName", "");
        setField(term8941, term8941.getClass(), "_objectIdInfo", null);
        setField(term8941, term8941.getClass(), "_viewMatcher", null);
        setIntField(term8941, term8941.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term7659;
        args[1] = term8134;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8930));
        assertTrue(recursiveEquals(term7659, term8940));
        assertTrue(recursiveEquals(term8134, term8941));
    }

};


