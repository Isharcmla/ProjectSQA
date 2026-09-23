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

public class ObjectIdValueProperty_init_120889015744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9815;
     Object term10499;
     Object term12078;
     Object term12087;
     Object term12088;

    public ObjectIdValueProperty_init_120889015744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9149 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term9241 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9337 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term9429 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9529 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term10165 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setIntField(term9149, term9149.getClass(), "_propertyIndex", 0);
        setField(term9149, term9149.getClass(), "_propName", term9241);
        setField(term9149, term9149.getClass(), "_type", term9337);
        setField(term9149, term9149.getClass(), "_wrapperName", term9429);
        setField(term9149, term9149.getClass(), "_metadata", term9529);
        setField(term9149, term9149.getClass(), "_contextAnnotations", term10165);
        setField(term9149, term9149.getClass(), "_valueTypeDeserializer", null);
        setField(term9149, term9149.getClass(), "_managedReferenceName", "");
        term9815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term9907 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10007 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term10107 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term10313 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term9815, term9815.getClass(), "_propName", term9907);
        setField(term9815, term9815.getClass(), "_type", term10007);
        setField(term9815, term9815.getClass(), "_wrapperName", null);
        setField(term9815, term9815.getClass(), "_metadata", term10107);
        setField(term9815, term9815.getClass(), "_contextAnnotations", term10165);
        setField(term9815, term9815.getClass(), "_valueTypeDeserializer", term10313);
        setField(term9815, term9815.getClass(), "_managedReferenceName", "");
        setIntField(term9815, term9815.getClass(), "_propertyIndex", 0);
        term10499 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        term12078 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term12079 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term12080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term12081 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term12082 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term12083 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term12084 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term12078, term12078.getClass(), "_objectIdReader", null);
        setField(term12079, term12079.getClass(), "_simpleName", null);
        setField(term12079, term12079.getClass(), "_namespace", null);
        setField(term12079, term12079.getClass(), "_encodedSimple", null);
        setField(term12078, term12078.getClass(), "_propName", term12079);
        setField(term12080, term12080.getClass(), "_keyType", null);
        setField(term12080, term12080.getClass(), "_valueType", null);
        setField(term12080, term12080.getClass(), "_canonicalName", null);
        setField(term12080, term12080.getClass(), "_class", null);
        setIntField(term12080, term12080.getClass(), "_hash", 0);
        setField(term12080, term12080.getClass(), "_valueHandler", null);
        setField(term12080, term12080.getClass(), "_typeHandler", null);
        setBooleanField(term12080, term12080.getClass(), "_asStatic", false);
        setField(term12078, term12078.getClass(), "_type", term12080);
        setField(term12078, term12078.getClass(), "_wrapperName", null);
        setField(term12081, term12081.getClass(), "_annotations", null);
        setField(term12078, term12078.getClass(), "_contextAnnotations", term12081);
        setField(term12082, term12082.getClass(), "_collectionType", null);
        setField(term12082, term12082.getClass(), "_valueDeserializer", null);
        setField(term12082, term12082.getClass(), "_valueTypeDeserializer", null);
        setField(term12082, term12082.getClass(), "_valueInstantiator", null);
        setField(term12082, term12082.getClass(), "_delegateDeserializer", null);
        setField(term12082, term12082.getClass(), "_valueClass", null);
        setField(term12078, term12078.getClass(), "_valueDeserializer", term12082);
        setField(term12083, term12083.getClass(), "_idResolver", null);
        setField(term12083, term12083.getClass(), "_baseType", null);
        setField(term12083, term12083.getClass(), "_property", null);
        setField(term12083, term12083.getClass(), "_defaultImpl", null);
        setField(term12083, term12083.getClass(), "_typePropertyName", null);
        setBooleanField(term12083, term12083.getClass(), "_typeIdVisible", false);
        setField(term12083, term12083.getClass(), "_deserializers", null);
        setField(term12083, term12083.getClass(), "_defaultImplDeserializer", null);
        setField(term12078, term12078.getClass(), "_valueTypeDeserializer", term12083);
        setField(term12078, term12078.getClass(), "_nullProvider", null);
        setField(term12084, term12084.getClass(), "_required", null);
        setField(term12084, term12084.getClass(), "_description", null);
        setField(term12084, term12084.getClass(), "_index", null);
        setField(term12084, term12084.getClass(), "_defaultValue", null);
        setField(term12078, term12078.getClass(), "_metadata", term12084);
        setField(term12078, term12078.getClass(), "_managedReferenceName", "");
        setField(term12078, term12078.getClass(), "_objectIdInfo", null);
        setField(term12078, term12078.getClass(), "_viewMatcher", null);
        setIntField(term12078, term12078.getClass(), "_propertyIndex", 0);
        term12087 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term12087, term12087.getClass(), "_collectionType", null);
        setField(term12087, term12087.getClass(), "_valueDeserializer", null);
        setField(term12087, term12087.getClass(), "_valueTypeDeserializer", null);
        setField(term12087, term12087.getClass(), "_valueInstantiator", null);
        setField(term12087, term12087.getClass(), "_delegateDeserializer", null);
        setField(term12087, term12087.getClass(), "_valueClass", null);
        term12088 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term12089 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term12090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term12091 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term12092 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term12093 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term12088, term12088.getClass(), "_objectIdReader", null);
        setField(term12089, term12089.getClass(), "_simpleName", null);
        setField(term12089, term12089.getClass(), "_namespace", null);
        setField(term12089, term12089.getClass(), "_encodedSimple", null);
        setField(term12088, term12088.getClass(), "_propName", term12089);
        setField(term12090, term12090.getClass(), "_keyType", null);
        setField(term12090, term12090.getClass(), "_valueType", null);
        setField(term12090, term12090.getClass(), "_canonicalName", null);
        setField(term12090, term12090.getClass(), "_class", null);
        setIntField(term12090, term12090.getClass(), "_hash", 0);
        setField(term12090, term12090.getClass(), "_valueHandler", null);
        setField(term12090, term12090.getClass(), "_typeHandler", null);
        setBooleanField(term12090, term12090.getClass(), "_asStatic", false);
        setField(term12088, term12088.getClass(), "_type", term12090);
        setField(term12088, term12088.getClass(), "_wrapperName", null);
        setField(term12091, term12091.getClass(), "_annotations", null);
        setField(term12088, term12088.getClass(), "_contextAnnotations", term12091);
        setField(term12088, term12088.getClass(), "_valueDeserializer", null);
        setField(term12092, term12092.getClass(), "_idResolver", null);
        setField(term12092, term12092.getClass(), "_baseType", null);
        setField(term12092, term12092.getClass(), "_property", null);
        setField(term12092, term12092.getClass(), "_defaultImpl", null);
        setField(term12092, term12092.getClass(), "_typePropertyName", null);
        setBooleanField(term12092, term12092.getClass(), "_typeIdVisible", false);
        setField(term12092, term12092.getClass(), "_deserializers", null);
        setField(term12092, term12092.getClass(), "_defaultImplDeserializer", null);
        setField(term12088, term12088.getClass(), "_valueTypeDeserializer", term12092);
        setField(term12088, term12088.getClass(), "_nullProvider", null);
        setField(term12093, term12093.getClass(), "_required", null);
        setField(term12093, term12093.getClass(), "_description", null);
        setField(term12093, term12093.getClass(), "_index", null);
        setField(term12093, term12093.getClass(), "_defaultValue", null);
        setField(term12088, term12088.getClass(), "_metadata", term12093);
        setField(term12088, term12088.getClass(), "_managedReferenceName", "");
        setField(term12088, term12088.getClass(), "_objectIdInfo", null);
        setField(term12088, term12088.getClass(), "_viewMatcher", null);
        setIntField(term12088, term12088.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term9815;
        args[1] = term10499;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12078));
        assertTrue(recursiveEquals(term9815, term12087));
        assertTrue(recursiveEquals(term10499, term12088));
    }

};


