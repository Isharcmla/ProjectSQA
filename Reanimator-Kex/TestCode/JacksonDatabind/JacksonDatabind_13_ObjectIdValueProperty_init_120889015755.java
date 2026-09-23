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

public class ObjectIdValueProperty_init_120889015755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28719;
     Object term29425;
     Object term29445;
     Object term29454;
     Object term29455;

    public ObjectIdValueProperty_init_120889015755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28035 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term28127 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28241 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term28333 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28433 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term29083 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setIntField(term28035, term28035.getClass(), "_propertyIndex", 0);
        setField(term28035, term28035.getClass(), "_propName", term28127);
        setField(term28035, term28035.getClass(), "_type", term28241);
        setField(term28035, term28035.getClass(), "_wrapperName", term28333);
        setField(term28035, term28035.getClass(), "_metadata", term28433);
        setField(term28035, term28035.getClass(), "_contextAnnotations", term29083);
        setField(term28035, term28035.getClass(), "_valueTypeDeserializer", null);
        setField(term28035, term28035.getClass(), "_managedReferenceName", "");
        term28719 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term28811 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term29025 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term29231 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term28719, term28719.getClass(), "_propName", term28811);
        setField(term28719, term28719.getClass(), "_type", term28925);
        setField(term28719, term28719.getClass(), "_wrapperName", null);
        setField(term28719, term28719.getClass(), "_metadata", term29025);
        setField(term28719, term28719.getClass(), "_contextAnnotations", term29083);
        setField(term28719, term28719.getClass(), "_valueTypeDeserializer", term29231);
        setField(term28719, term28719.getClass(), "_managedReferenceName", "");
        setIntField(term28719, term28719.getClass(), "_propertyIndex", 0);
        term29425 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer"));
        term29445 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term29446 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term29447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term29448 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term29449 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer"));
        Object term29450 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term29451 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term29445, term29445.getClass(), "_objectIdReader", null);
        setField(term29446, term29446.getClass(), "_simpleName", null);
        setField(term29446, term29446.getClass(), "_namespace", null);
        setField(term29446, term29446.getClass(), "_encodedSimple", null);
        setField(term29445, term29445.getClass(), "_propName", term29446);
        setField(term29447, term29447.getClass(), "_elementType", null);
        setField(term29447, term29447.getClass(), "_canonicalName", null);
        setField(term29447, term29447.getClass(), "_class", null);
        setIntField(term29447, term29447.getClass(), "_hash", 0);
        setField(term29447, term29447.getClass(), "_valueHandler", null);
        setField(term29447, term29447.getClass(), "_typeHandler", null);
        setBooleanField(term29447, term29447.getClass(), "_asStatic", false);
        setField(term29445, term29445.getClass(), "_type", term29447);
        setField(term29445, term29445.getClass(), "_wrapperName", null);
        setField(term29448, term29448.getClass(), "_annotations", null);
        setField(term29445, term29445.getClass(), "_contextAnnotations", term29448);
        setField(term29449, term29449.getClass(), "_customFormat", null);
        setField(term29449, term29449.getClass(), "_formatString", null);
        setField(term29449, term29449.getClass(), "_valueClass", null);
        setField(term29445, term29445.getClass(), "_valueDeserializer", term29449);
        setField(term29450, term29450.getClass(), "_inclusion", null);
        setField(term29450, term29450.getClass(), "_idResolver", null);
        setField(term29450, term29450.getClass(), "_baseType", null);
        setField(term29450, term29450.getClass(), "_property", null);
        setField(term29450, term29450.getClass(), "_defaultImpl", null);
        setField(term29450, term29450.getClass(), "_typePropertyName", null);
        setBooleanField(term29450, term29450.getClass(), "_typeIdVisible", false);
        setField(term29450, term29450.getClass(), "_deserializers", null);
        setField(term29450, term29450.getClass(), "_defaultImplDeserializer", null);
        setField(term29445, term29445.getClass(), "_valueTypeDeserializer", term29450);
        setField(term29445, term29445.getClass(), "_nullProvider", null);
        setField(term29451, term29451.getClass(), "_required", null);
        setField(term29451, term29451.getClass(), "_description", null);
        setField(term29451, term29451.getClass(), "_index", null);
        setField(term29451, term29451.getClass(), "_defaultValue", null);
        setField(term29445, term29445.getClass(), "_metadata", term29451);
        setField(term29445, term29445.getClass(), "_managedReferenceName", "");
        setField(term29445, term29445.getClass(), "_objectIdInfo", null);
        setField(term29445, term29445.getClass(), "_viewMatcher", null);
        setIntField(term29445, term29445.getClass(), "_propertyIndex", 0);
        term29454 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer"));
        setField(term29454, term29454.getClass(), "_customFormat", null);
        setField(term29454, term29454.getClass(), "_formatString", null);
        setField(term29454, term29454.getClass(), "_valueClass", null);
        term29455 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term29456 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term29457 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term29458 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term29459 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term29460 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term29455, term29455.getClass(), "_objectIdReader", null);
        setField(term29456, term29456.getClass(), "_simpleName", null);
        setField(term29456, term29456.getClass(), "_namespace", null);
        setField(term29456, term29456.getClass(), "_encodedSimple", null);
        setField(term29455, term29455.getClass(), "_propName", term29456);
        setField(term29457, term29457.getClass(), "_elementType", null);
        setField(term29457, term29457.getClass(), "_canonicalName", null);
        setField(term29457, term29457.getClass(), "_class", null);
        setIntField(term29457, term29457.getClass(), "_hash", 0);
        setField(term29457, term29457.getClass(), "_valueHandler", null);
        setField(term29457, term29457.getClass(), "_typeHandler", null);
        setBooleanField(term29457, term29457.getClass(), "_asStatic", false);
        setField(term29455, term29455.getClass(), "_type", term29457);
        setField(term29455, term29455.getClass(), "_wrapperName", null);
        setField(term29458, term29458.getClass(), "_annotations", null);
        setField(term29455, term29455.getClass(), "_contextAnnotations", term29458);
        setField(term29455, term29455.getClass(), "_valueDeserializer", null);
        setField(term29459, term29459.getClass(), "_inclusion", null);
        setField(term29459, term29459.getClass(), "_idResolver", null);
        setField(term29459, term29459.getClass(), "_baseType", null);
        setField(term29459, term29459.getClass(), "_property", null);
        setField(term29459, term29459.getClass(), "_defaultImpl", null);
        setField(term29459, term29459.getClass(), "_typePropertyName", null);
        setBooleanField(term29459, term29459.getClass(), "_typeIdVisible", false);
        setField(term29459, term29459.getClass(), "_deserializers", null);
        setField(term29459, term29459.getClass(), "_defaultImplDeserializer", null);
        setField(term29455, term29455.getClass(), "_valueTypeDeserializer", term29459);
        setField(term29455, term29455.getClass(), "_nullProvider", null);
        setField(term29460, term29460.getClass(), "_required", null);
        setField(term29460, term29460.getClass(), "_description", null);
        setField(term29460, term29460.getClass(), "_index", null);
        setField(term29460, term29460.getClass(), "_defaultValue", null);
        setField(term29455, term29455.getClass(), "_metadata", term29460);
        setField(term29455, term29455.getClass(), "_managedReferenceName", "");
        setField(term29455, term29455.getClass(), "_objectIdInfo", null);
        setField(term29455, term29455.getClass(), "_viewMatcher", null);
        setIntField(term29455, term29455.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term28719;
        args[1] = term29425;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29445));
        assertTrue(recursiveEquals(term28719, term29454));
        assertTrue(recursiveEquals(term29425, term29455));
    }

};


