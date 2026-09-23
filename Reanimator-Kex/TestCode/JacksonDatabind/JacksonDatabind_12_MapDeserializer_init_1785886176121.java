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

public class MapDeserializer_init_1785886176121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64484;
     Object term64701;
     Object term64704;

    public MapDeserializer_init_1785886176121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64242 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        Object term64206 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term64356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term64206, term64206.getClass(), "_valueClass", term64242);
        setField(term64206, term64206.getClass(), "_mapType", term64356);
        setField(term64206, term64206.getClass(), "_keyDeserializer", null);
        setField(term64206, term64206.getClass(), "_valueDeserializer", null);
        setField(term64206, term64206.getClass(), "_valueTypeDeserializer", null);
        setField(term64206, term64206.getClass(), "_valueInstantiator", null);
        term64484 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term64604 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term64484, term64484.getClass(), "_defaultCreator", term64604);
        term64701 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term64702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term64703 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term64701, term64701.getClass(), "_mapType", null);
        setField(term64701, term64701.getClass(), "_keyDeserializer", null);
        setBooleanField(term64701, term64701.getClass(), "_standardStringKey", true);
        setField(term64701, term64701.getClass(), "_valueDeserializer", null);
        setField(term64701, term64701.getClass(), "_valueTypeDeserializer", null);
        setField(term64702, term64702.getClass(), "_valueTypeDesc", null);
        setField(term64703, term64703.getClass(), "_method", null);
        setField(term64703, term64703.getClass(), "_paramClasses", null);
        setField(term64703, term64703.getClass(), "_serialization", null);
        setField(term64703, term64703.getClass(), "_paramAnnotations", null);
        setField(term64703, term64703.getClass(), "_annotations", null);
        setField(term64702, term64702.getClass(), "_defaultCreator", term64703);
        setField(term64702, term64702.getClass(), "_withArgsCreator", null);
        setField(term64702, term64702.getClass(), "_constructorArguments", null);
        setField(term64702, term64702.getClass(), "_delegateType", null);
        setField(term64702, term64702.getClass(), "_delegateCreator", null);
        setField(term64702, term64702.getClass(), "_delegateArguments", null);
        setField(term64702, term64702.getClass(), "_fromStringCreator", null);
        setField(term64702, term64702.getClass(), "_fromIntCreator", null);
        setField(term64702, term64702.getClass(), "_fromLongCreator", null);
        setField(term64702, term64702.getClass(), "_fromDoubleCreator", null);
        setField(term64702, term64702.getClass(), "_fromBooleanCreator", null);
        setField(term64702, term64702.getClass(), "_incompleteParameter", null);
        setField(term64701, term64701.getClass(), "_valueInstantiator", term64702);
        setBooleanField(term64701, term64701.getClass(), "_hasDefaultCreator", true);
        setField(term64701, term64701.getClass(), "_delegateDeserializer", null);
        setField(term64701, term64701.getClass(), "_propertyBasedCreator", null);
        setField(term64701, term64701.getClass(), "_ignorableProperties", null);
        setField(term64701, term64701.getClass(), "_valueClass", null);
        term64704 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term64705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term64704, term64704.getClass(), "_valueTypeDesc", null);
        setField(term64705, term64705.getClass(), "_method", null);
        setField(term64705, term64705.getClass(), "_paramClasses", null);
        setField(term64705, term64705.getClass(), "_serialization", null);
        setField(term64705, term64705.getClass(), "_paramAnnotations", null);
        setField(term64705, term64705.getClass(), "_annotations", null);
        setField(term64704, term64704.getClass(), "_defaultCreator", term64705);
        setField(term64704, term64704.getClass(), "_withArgsCreator", null);
        setField(term64704, term64704.getClass(), "_constructorArguments", null);
        setField(term64704, term64704.getClass(), "_delegateType", null);
        setField(term64704, term64704.getClass(), "_delegateCreator", null);
        setField(term64704, term64704.getClass(), "_delegateArguments", null);
        setField(term64704, term64704.getClass(), "_fromStringCreator", null);
        setField(term64704, term64704.getClass(), "_fromIntCreator", null);
        setField(term64704, term64704.getClass(), "_fromLongCreator", null);
        setField(term64704, term64704.getClass(), "_fromDoubleCreator", null);
        setField(term64704, term64704.getClass(), "_fromBooleanCreator", null);
        setField(term64704, term64704.getClass(), "_incompleteParameter", null);
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
        args[0] = null;
        args[1] = term64484;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64701));
        assertTrue(recursiveEquals(term64484, term64704));
    }

};


