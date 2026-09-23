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

public class ObjectIdValueProperty_init_144421363558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45295;
     Object term45533;
     Object term51547;
     Object term51550;
     Object term51552;

    public ObjectIdValueProperty_init_144421363558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44711 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term44811 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term44915 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term45007 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term45163 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer"));
        setField(term44711, term44711.getClass(), "_metadata", term44811);
        setField(term44711, term44711.getClass(), "_propertyFormat", term44915);
        setIntField(term44711, term44711.getClass(), "_propertyIndex", 0);
        setField(term44711, term44711.getClass(), "_propName", term45007);
        setField(term44711, term44711.getClass(), "_type", null);
        setField(term44711, term44711.getClass(), "_wrapperName", null);
        setField(term44711, term44711.getClass(), "_contextAnnotations", null);
        setField(term44711, term44711.getClass(), "_valueTypeDeserializer", null);
        setField(term44711, term44711.getClass(), "_managedReferenceName", null);
        setField(term44711, term44711.getClass(), "_valueDeserializer", term45163);
        setField(term44711, term44711.getClass(), "_viewMatcher", null);
        term45295 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term45395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term45295, term45295.getClass(), "_metadata", null);
        setField(term45295, term45295.getClass(), "_propertyFormat", null);
        setField(term45295, term45295.getClass(), "_propName", null);
        setField(term45295, term45295.getClass(), "_type", term45395);
        setField(term45295, term45295.getClass(), "_wrapperName", null);
        setField(term45295, term45295.getClass(), "_contextAnnotations", null);
        setField(term45295, term45295.getClass(), "_valueTypeDeserializer", null);
        setField(term45295, term45295.getClass(), "_managedReferenceName", null);
        setIntField(term45295, term45295.getClass(), "_propertyIndex", 0);
        setField(term45295, term45295.getClass(), "_viewMatcher", null);
        term45533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        term51547 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term51548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term51549 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        setField(term51547, term51547.getClass(), "_objectIdReader", null);
        setField(term51547, term51547.getClass(), "_propName", null);
        setField(term51548, term51548.getClass(), "_keyType", null);
        setField(term51548, term51548.getClass(), "_valueType", null);
        setField(term51548, term51548.getClass(), "_superClass", null);
        setField(term51548, term51548.getClass(), "_superInterfaces", null);
        setField(term51548, term51548.getClass(), "_bindings", null);
        setField(term51548, term51548.getClass(), "_canonicalName", null);
        setField(term51548, term51548.getClass(), "_class", null);
        setIntField(term51548, term51548.getClass(), "_hash", 0);
        setField(term51548, term51548.getClass(), "_valueHandler", null);
        setField(term51548, term51548.getClass(), "_typeHandler", null);
        setBooleanField(term51548, term51548.getClass(), "_asStatic", false);
        setField(term51547, term51547.getClass(), "_type", term51548);
        setField(term51547, term51547.getClass(), "_wrapperName", null);
        setField(term51547, term51547.getClass(), "_contextAnnotations", null);
        setField(term51549, term51549.getClass(), "_valueClass", null);
        setField(term51547, term51547.getClass(), "_valueDeserializer", term51549);
        setField(term51547, term51547.getClass(), "_valueTypeDeserializer", null);
        setField(term51547, term51547.getClass(), "_nullProvider", null);
        setField(term51547, term51547.getClass(), "_managedReferenceName", null);
        setField(term51547, term51547.getClass(), "_objectIdInfo", null);
        setField(term51547, term51547.getClass(), "_viewMatcher", null);
        setIntField(term51547, term51547.getClass(), "_propertyIndex", 0);
        setField(term51547, term51547.getClass(), "_metadata", null);
        setField(term51547, term51547.getClass(), "_propertyFormat", null);
        setField(term51547, term51547.getClass(), "_aliases", null);
        term51550 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term51551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term51550, term51550.getClass(), "_objectIdReader", null);
        setField(term51550, term51550.getClass(), "_propName", null);
        setField(term51551, term51551.getClass(), "_keyType", null);
        setField(term51551, term51551.getClass(), "_valueType", null);
        setField(term51551, term51551.getClass(), "_superClass", null);
        setField(term51551, term51551.getClass(), "_superInterfaces", null);
        setField(term51551, term51551.getClass(), "_bindings", null);
        setField(term51551, term51551.getClass(), "_canonicalName", null);
        setField(term51551, term51551.getClass(), "_class", null);
        setIntField(term51551, term51551.getClass(), "_hash", 0);
        setField(term51551, term51551.getClass(), "_valueHandler", null);
        setField(term51551, term51551.getClass(), "_typeHandler", null);
        setBooleanField(term51551, term51551.getClass(), "_asStatic", false);
        setField(term51550, term51550.getClass(), "_type", term51551);
        setField(term51550, term51550.getClass(), "_wrapperName", null);
        setField(term51550, term51550.getClass(), "_contextAnnotations", null);
        setField(term51550, term51550.getClass(), "_valueDeserializer", null);
        setField(term51550, term51550.getClass(), "_valueTypeDeserializer", null);
        setField(term51550, term51550.getClass(), "_nullProvider", null);
        setField(term51550, term51550.getClass(), "_managedReferenceName", null);
        setField(term51550, term51550.getClass(), "_objectIdInfo", null);
        setField(term51550, term51550.getClass(), "_viewMatcher", null);
        setIntField(term51550, term51550.getClass(), "_propertyIndex", 0);
        setField(term51550, term51550.getClass(), "_metadata", null);
        setField(term51550, term51550.getClass(), "_propertyFormat", null);
        setField(term51550, term51550.getClass(), "_aliases", null);
        term51552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        setField(term51552, term51552.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term45295;
        args[1] = term45533;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51547));
        assertTrue(recursiveEquals(term45295, term51550));
        assertTrue(recursiveEquals(term45533, term51552));
    }

};


