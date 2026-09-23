package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class MappingIterator_init_67830671539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10899;
     Object term11019;
     Object term11167;
     Object term11463;
     Object term11467;
     Object term11468;
     Object term11469;

    public MappingIterator_init_67830671539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10261 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term10375 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term10481 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term10629 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term10793 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer"));
        setField(term10261, term10261.getClass(), "_type", term10375);
        setField(term10261, term10261.getClass(), "_parser", term10481);
        setField(term10261, term10261.getClass(), "_context", term10629);
        setField(term10261, term10261.getClass(), "_deserializer", term10793);
        setBooleanField(term10261, term10261.getClass(), "_closeParser", false);
        term10899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term11019 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        term11167 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term11463 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term11464 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term11465 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term11466 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term11464, term11464.getClass(), "_elementType", null);
        setField(term11464, term11464.getClass(), "_canonicalName", null);
        setField(term11464, term11464.getClass(), "_class", null);
        setIntField(term11464, term11464.getClass(), "_hash", 0);
        setField(term11464, term11464.getClass(), "_valueHandler", null);
        setField(term11464, term11464.getClass(), "_typeHandler", null);
        setBooleanField(term11464, term11464.getClass(), "_asStatic", false);
        setField(term11463, term11463.getClass(), "_type", term11464);
        setField(term11465, term11465.getClass(), "_objectIds", null);
        setField(term11465, term11465.getClass(), "_objectIdResolvers", null);
        setField(term11465, term11465.getClass(), "_cache", null);
        setField(term11465, term11465.getClass(), "_factory", null);
        setField(term11465, term11465.getClass(), "_config", null);
        setIntField(term11465, term11465.getClass(), "_featureFlags", 0);
        setField(term11465, term11465.getClass(), "_view", null);
        setField(term11465, term11465.getClass(), "_parser", null);
        setField(term11465, term11465.getClass(), "_injectableValues", null);
        setField(term11465, term11465.getClass(), "_arrayBuilders", null);
        setField(term11465, term11465.getClass(), "_objectBuffer", null);
        setField(term11465, term11465.getClass(), "_dateFormat", null);
        setField(term11465, term11465.getClass(), "_attributes", null);
        setField(term11465, term11465.getClass(), "_currentType", null);
        setField(term11463, term11463.getClass(), "_context", term11465);
        setField(term11463, term11463.getClass(), "_deserializer", null);
        setField(term11466, term11466.getClass(), "rootFilter", null);
        setBooleanField(term11466, term11466.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term11466, term11466.getClass(), "_includePath", false);
        setBooleanField(term11466, term11466.getClass(), "_includeImmediateParent", false);
        setField(term11466, term11466.getClass(), "_currToken", null);
        setField(term11466, term11466.getClass(), "_lastClearedToken", null);
        setField(term11466, term11466.getClass(), "_headContext", null);
        setField(term11466, term11466.getClass(), "_exposedContext", null);
        setField(term11466, term11466.getClass(), "_itemFilter", null);
        setIntField(term11466, term11466.getClass(), "_matchCount", 0);
        setField(term11466, term11466.getClass(), "delegate", null);
        setIntField(term11466, term11466.getClass(), "_features", 0);
        setField(term11463, term11463.getClass(), "_parser", term11466);
        setField(term11463, term11463.getClass(), "_updatedValue", null);
        setBooleanField(term11463, term11463.getClass(), "_closeParser", true);
        setBooleanField(term11463, term11463.getClass(), "_hasNextChecked", false);
        term11467 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term11467, term11467.getClass(), "rootFilter", null);
        setBooleanField(term11467, term11467.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term11467, term11467.getClass(), "_includePath", false);
        setBooleanField(term11467, term11467.getClass(), "_includeImmediateParent", false);
        setField(term11467, term11467.getClass(), "_currToken", null);
        setField(term11467, term11467.getClass(), "_lastClearedToken", null);
        setField(term11467, term11467.getClass(), "_headContext", null);
        setField(term11467, term11467.getClass(), "_exposedContext", null);
        setField(term11467, term11467.getClass(), "_itemFilter", null);
        setIntField(term11467, term11467.getClass(), "_matchCount", 0);
        setField(term11467, term11467.getClass(), "delegate", null);
        setIntField(term11467, term11467.getClass(), "_features", 0);
        term11468 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term11468, term11468.getClass(), "_elementType", null);
        setField(term11468, term11468.getClass(), "_canonicalName", null);
        setField(term11468, term11468.getClass(), "_class", null);
        setIntField(term11468, term11468.getClass(), "_hash", 0);
        setField(term11468, term11468.getClass(), "_valueHandler", null);
        setField(term11468, term11468.getClass(), "_typeHandler", null);
        setBooleanField(term11468, term11468.getClass(), "_asStatic", false);
        term11469 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term11469, term11469.getClass(), "_objectIds", null);
        setField(term11469, term11469.getClass(), "_objectIdResolvers", null);
        setField(term11469, term11469.getClass(), "_cache", null);
        setField(term11469, term11469.getClass(), "_factory", null);
        setField(term11469, term11469.getClass(), "_config", null);
        setIntField(term11469, term11469.getClass(), "_featureFlags", 0);
        setField(term11469, term11469.getClass(), "_view", null);
        setField(term11469, term11469.getClass(), "_parser", null);
        setField(term11469, term11469.getClass(), "_injectableValues", null);
        setField(term11469, term11469.getClass(), "_arrayBuilders", null);
        setField(term11469, term11469.getClass(), "_objectBuffer", null);
        setField(term11469, term11469.getClass(), "_dateFormat", null);
        setField(term11469, term11469.getClass(), "_attributes", null);
        setField(term11469, term11469.getClass(), "_currentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = term10899;
        args[1] = term11019;
        args[2] = term11167;
        args[3] = null;
        args[4] = true;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11463));
        assertTrue(recursiveEquals(term10899, term11467));
        assertTrue(recursiveEquals(term11019, term11468));
        assertTrue(recursiveEquals(term11167, term11469));
    }

};


