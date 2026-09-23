package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_178588617673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30342;
     Object term30516;
     Object term30698;
     Object term31255;
     Object term31266;
     Object term31274;
     Object term31275;

    public MapDeserializer_init_178588617673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30250 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term30250, term30250.getClass(), "_valueClass", null);
        setField(term30250, term30250.getClass(), "_mapType", null);
        setField(term30250, term30250.getClass(), "_keyDeserializer", null);
        setField(term30250, term30250.getClass(), "_valueDeserializer", null);
        setField(term30250, term30250.getClass(), "_valueTypeDeserializer", null);
        setField(term30250, term30250.getClass(), "_valueInstantiator", null);
        setBooleanField(term30250, term30250.getClass(), "_hasDefaultCreator", false);
        setField(term30250, term30250.getClass(), "_delegateDeserializer", null);
        setField(term30250, term30250.getClass(), "_propertyBasedCreator", null);
        Class<? extends Object> term30378 = Class.forName((String) "java.lang.reflect.InvocationTargetException");
        term30342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30342, term30342.getClass(), "_class", term30378);
        term30516 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        term30698 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        Class<? extends Object> term31257 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        term31255 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term31256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term31264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        Object term31265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term31256, term31256.getClass(), "_keyType", null);
        setField(term31256, term31256.getClass(), "_valueType", null);
        setField(term31256, term31256.getClass(), "_canonicalName", null);
        setField(term31256, term31256.getClass(), "_class", term31257);
        setIntField(term31256, term31256.getClass(), "_hash", 0);
        setField(term31256, term31256.getClass(), "_valueHandler", null);
        setField(term31256, term31256.getClass(), "_typeHandler", null);
        setBooleanField(term31256, term31256.getClass(), "_asStatic", false);
        setField(term31255, term31255.getClass(), "_mapType", term31256);
        setField(term31264, term31264.getClass(), "_factoryMethod", null);
        setIntField(term31264, term31264.getClass(), "_kind", 0);
        setField(term31264, term31264.getClass(), "_keyClass", null);
        setField(term31264, term31264.getClass(), "_deser", null);
        setField(term31255, term31255.getClass(), "_keyDeserializer", term31264);
        setBooleanField(term31255, term31255.getClass(), "_standardStringKey", true);
        setField(term31255, term31255.getClass(), "_valueDeserializer", null);
        setField(term31255, term31255.getClass(), "_valueTypeDeserializer", null);
        setIntField(term31265, term31265.getClass(), "_type", 0);
        setField(term31255, term31255.getClass(), "_valueInstantiator", term31265);
        setBooleanField(term31255, term31255.getClass(), "_hasDefaultCreator", true);
        setField(term31255, term31255.getClass(), "_delegateDeserializer", null);
        setField(term31255, term31255.getClass(), "_propertyBasedCreator", null);
        setField(term31255, term31255.getClass(), "_ignorableProperties", null);
        setField(term31255, term31255.getClass(), "_valueClass", term31257);
        Class<? extends Object> term31267 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        term31266 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term31266, term31266.getClass(), "_keyType", null);
        setField(term31266, term31266.getClass(), "_valueType", null);
        setField(term31266, term31266.getClass(), "_canonicalName", null);
        setField(term31266, term31266.getClass(), "_class", term31267);
        setIntField(term31266, term31266.getClass(), "_hash", 0);
        setField(term31266, term31266.getClass(), "_valueHandler", null);
        setField(term31266, term31266.getClass(), "_typeHandler", null);
        setBooleanField(term31266, term31266.getClass(), "_asStatic", false);
        term31274 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setIntField(term31274, term31274.getClass(), "_type", 0);
        term31275 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        setField(term31275, term31275.getClass(), "_factoryMethod", null);
        setIntField(term31275, term31275.getClass(), "_kind", 0);
        setField(term31275, term31275.getClass(), "_keyClass", null);
        setField(term31275, term31275.getClass(), "_deser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Object[] args = new Object[5];
        args[0] = term30342;
        args[1] = term30516;
        args[2] = term30698;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31255));
        assertTrue(recursiveEquals(term30342, term31266));
        assertTrue(recursiveEquals(term30516, term31274));
        assertTrue(recursiveEquals(term30698, term31275));
    }

};


