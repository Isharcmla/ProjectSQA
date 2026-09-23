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

public class MapDeserializer_init_178588617658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22459;
     Object term22633;
     Object term23586;
     Object term23596;
     Object term23604;

    public MapDeserializer_init_178588617658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22367 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term22367, term22367.getClass(), "_valueClass", null);
        setField(term22367, term22367.getClass(), "_mapType", null);
        setField(term22367, term22367.getClass(), "_keyDeserializer", null);
        setField(term22367, term22367.getClass(), "_valueDeserializer", null);
        setField(term22367, term22367.getClass(), "_valueTypeDeserializer", null);
        setField(term22367, term22367.getClass(), "_valueInstantiator", null);
        Class<? extends Object> term22495 = Class.forName((String) "com.fasterxml.jackson.core.io.SegmentedStringWriter");
        term22459 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term22459, term22459.getClass(), "_class", term22495);
        term22633 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        Class<? extends Object> term23588 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy");
        term23586 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term23587 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term23595 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term23587, term23587.getClass(), "_keyType", null);
        setField(term23587, term23587.getClass(), "_valueType", null);
        setField(term23587, term23587.getClass(), "_canonicalName", null);
        setField(term23587, term23587.getClass(), "_class", term23588);
        setIntField(term23587, term23587.getClass(), "_hash", 0);
        setField(term23587, term23587.getClass(), "_valueHandler", null);
        setField(term23587, term23587.getClass(), "_typeHandler", null);
        setBooleanField(term23587, term23587.getClass(), "_asStatic", false);
        setField(term23586, term23586.getClass(), "_mapType", term23587);
        setField(term23586, term23586.getClass(), "_keyDeserializer", null);
        setBooleanField(term23586, term23586.getClass(), "_standardStringKey", true);
        setField(term23586, term23586.getClass(), "_valueDeserializer", null);
        setField(term23586, term23586.getClass(), "_valueTypeDeserializer", null);
        setIntField(term23595, term23595.getClass(), "_type", 0);
        setField(term23586, term23586.getClass(), "_valueInstantiator", term23595);
        setBooleanField(term23586, term23586.getClass(), "_hasDefaultCreator", true);
        setField(term23586, term23586.getClass(), "_delegateDeserializer", null);
        setField(term23586, term23586.getClass(), "_propertyBasedCreator", null);
        setField(term23586, term23586.getClass(), "_ignorableProperties", null);
        setField(term23586, term23586.getClass(), "_valueClass", term23588);
        Class<? extends Object> term23597 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy");
        term23596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term23596, term23596.getClass(), "_keyType", null);
        setField(term23596, term23596.getClass(), "_valueType", null);
        setField(term23596, term23596.getClass(), "_canonicalName", null);
        setField(term23596, term23596.getClass(), "_class", term23597);
        setIntField(term23596, term23596.getClass(), "_hash", 0);
        setField(term23596, term23596.getClass(), "_valueHandler", null);
        setField(term23596, term23596.getClass(), "_typeHandler", null);
        setBooleanField(term23596, term23596.getClass(), "_asStatic", false);
        term23604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setIntField(term23604, term23604.getClass(), "_type", 0);
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
        args[0] = term22459;
        args[1] = term22633;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23586));
        assertTrue(recursiveEquals(term22459, term23596));
        assertTrue(recursiveEquals(term22633, term23604));
    }

};


