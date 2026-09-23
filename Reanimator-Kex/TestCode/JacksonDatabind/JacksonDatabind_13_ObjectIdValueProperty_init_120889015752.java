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

public class ObjectIdValueProperty_init_120889015752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20966;
     Object term21636;
     Object term23327;
     Object term23336;
     Object term23337;

    public ObjectIdValueProperty_init_120889015752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20290 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term20382 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20488 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term20580 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20680 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term21316 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setIntField(term20290, term20290.getClass(), "_propertyIndex", 0);
        setField(term20290, term20290.getClass(), "_propName", term20382);
        setField(term20290, term20290.getClass(), "_type", term20488);
        setField(term20290, term20290.getClass(), "_wrapperName", term20580);
        setField(term20290, term20290.getClass(), "_metadata", term20680);
        setField(term20290, term20290.getClass(), "_contextAnnotations", term21316);
        setField(term20290, term20290.getClass(), "_valueTypeDeserializer", null);
        setField(term20290, term20290.getClass(), "_managedReferenceName", "");
        term20966 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term21058 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term21158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term21258 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term21464 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term20966, term20966.getClass(), "_propName", term21058);
        setField(term20966, term20966.getClass(), "_type", term21158);
        setField(term20966, term20966.getClass(), "_wrapperName", null);
        setField(term20966, term20966.getClass(), "_metadata", term21258);
        setField(term20966, term20966.getClass(), "_contextAnnotations", term21316);
        setField(term20966, term20966.getClass(), "_valueTypeDeserializer", term21464);
        setField(term20966, term20966.getClass(), "_managedReferenceName", "");
        setIntField(term20966, term20966.getClass(), "_propertyIndex", 0);
        term21636 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        term23327 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term23328 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term23329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term23330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term23331 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        Object term23332 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term23333 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term23327, term23327.getClass(), "_objectIdReader", null);
        setField(term23328, term23328.getClass(), "_simpleName", null);
        setField(term23328, term23328.getClass(), "_namespace", null);
        setField(term23328, term23328.getClass(), "_encodedSimple", null);
        setField(term23327, term23327.getClass(), "_propName", term23328);
        setField(term23329, term23329.getClass(), "_keyType", null);
        setField(term23329, term23329.getClass(), "_valueType", null);
        setField(term23329, term23329.getClass(), "_canonicalName", null);
        setField(term23329, term23329.getClass(), "_class", null);
        setIntField(term23329, term23329.getClass(), "_hash", 0);
        setField(term23329, term23329.getClass(), "_valueHandler", null);
        setField(term23329, term23329.getClass(), "_typeHandler", null);
        setBooleanField(term23329, term23329.getClass(), "_asStatic", false);
        setField(term23327, term23327.getClass(), "_type", term23329);
        setField(term23327, term23327.getClass(), "_wrapperName", null);
        setField(term23330, term23330.getClass(), "_annotations", null);
        setField(term23327, term23327.getClass(), "_contextAnnotations", term23330);
        setField(term23331, term23331.getClass(), "_valueClass", null);
        setField(term23327, term23327.getClass(), "_valueDeserializer", term23331);
        setField(term23332, term23332.getClass(), "_inclusion", null);
        setField(term23332, term23332.getClass(), "_idResolver", null);
        setField(term23332, term23332.getClass(), "_baseType", null);
        setField(term23332, term23332.getClass(), "_property", null);
        setField(term23332, term23332.getClass(), "_defaultImpl", null);
        setField(term23332, term23332.getClass(), "_typePropertyName", null);
        setBooleanField(term23332, term23332.getClass(), "_typeIdVisible", false);
        setField(term23332, term23332.getClass(), "_deserializers", null);
        setField(term23332, term23332.getClass(), "_defaultImplDeserializer", null);
        setField(term23327, term23327.getClass(), "_valueTypeDeserializer", term23332);
        setField(term23327, term23327.getClass(), "_nullProvider", null);
        setField(term23333, term23333.getClass(), "_required", null);
        setField(term23333, term23333.getClass(), "_description", null);
        setField(term23333, term23333.getClass(), "_index", null);
        setField(term23333, term23333.getClass(), "_defaultValue", null);
        setField(term23327, term23327.getClass(), "_metadata", term23333);
        setField(term23327, term23327.getClass(), "_managedReferenceName", "");
        setField(term23327, term23327.getClass(), "_objectIdInfo", null);
        setField(term23327, term23327.getClass(), "_viewMatcher", null);
        setIntField(term23327, term23327.getClass(), "_propertyIndex", 0);
        term23336 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        setField(term23336, term23336.getClass(), "_valueClass", null);
        term23337 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term23338 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term23339 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term23340 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term23341 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term23342 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term23337, term23337.getClass(), "_objectIdReader", null);
        setField(term23338, term23338.getClass(), "_simpleName", null);
        setField(term23338, term23338.getClass(), "_namespace", null);
        setField(term23338, term23338.getClass(), "_encodedSimple", null);
        setField(term23337, term23337.getClass(), "_propName", term23338);
        setField(term23339, term23339.getClass(), "_keyType", null);
        setField(term23339, term23339.getClass(), "_valueType", null);
        setField(term23339, term23339.getClass(), "_canonicalName", null);
        setField(term23339, term23339.getClass(), "_class", null);
        setIntField(term23339, term23339.getClass(), "_hash", 0);
        setField(term23339, term23339.getClass(), "_valueHandler", null);
        setField(term23339, term23339.getClass(), "_typeHandler", null);
        setBooleanField(term23339, term23339.getClass(), "_asStatic", false);
        setField(term23337, term23337.getClass(), "_type", term23339);
        setField(term23337, term23337.getClass(), "_wrapperName", null);
        setField(term23340, term23340.getClass(), "_annotations", null);
        setField(term23337, term23337.getClass(), "_contextAnnotations", term23340);
        setField(term23337, term23337.getClass(), "_valueDeserializer", null);
        setField(term23341, term23341.getClass(), "_inclusion", null);
        setField(term23341, term23341.getClass(), "_idResolver", null);
        setField(term23341, term23341.getClass(), "_baseType", null);
        setField(term23341, term23341.getClass(), "_property", null);
        setField(term23341, term23341.getClass(), "_defaultImpl", null);
        setField(term23341, term23341.getClass(), "_typePropertyName", null);
        setBooleanField(term23341, term23341.getClass(), "_typeIdVisible", false);
        setField(term23341, term23341.getClass(), "_deserializers", null);
        setField(term23341, term23341.getClass(), "_defaultImplDeserializer", null);
        setField(term23337, term23337.getClass(), "_valueTypeDeserializer", term23341);
        setField(term23337, term23337.getClass(), "_nullProvider", null);
        setField(term23342, term23342.getClass(), "_required", null);
        setField(term23342, term23342.getClass(), "_description", null);
        setField(term23342, term23342.getClass(), "_index", null);
        setField(term23342, term23342.getClass(), "_defaultValue", null);
        setField(term23337, term23337.getClass(), "_metadata", term23342);
        setField(term23337, term23337.getClass(), "_managedReferenceName", "");
        setField(term23337, term23337.getClass(), "_objectIdInfo", null);
        setField(term23337, term23337.getClass(), "_viewMatcher", null);
        setIntField(term23337, term23337.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term20966;
        args[1] = term21636;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23327));
        assertTrue(recursiveEquals(term20966, term23336));
        assertTrue(recursiveEquals(term21636, term23337));
    }

};


