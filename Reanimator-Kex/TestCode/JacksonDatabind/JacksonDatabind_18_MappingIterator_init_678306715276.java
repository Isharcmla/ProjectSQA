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
import java.lang.String;

public class MappingIterator_init_678306715276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246571;
     Object term246835;
     Object term246977;
     Object term247246;
     Object term247257;
     Object term247265;
     Object term247266;

    public MappingIterator_init_678306715276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term246161 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term246265 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term246413 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term246451 = newInstance(Class.forName("java.lang.Object"));
        setField(term246161, term246161.getClass(), "_type", term246265);
        setField(term246161, term246161.getClass(), "_parser", null);
        setField(term246161, term246161.getClass(), "_context", term246413);
        setField(term246161, term246161.getClass(), "_deserializer", null);
        setBooleanField(term246161, term246161.getClass(), "_closeParser", false);
        setField(term246161, term246161.getClass(), "_updatedValue", term246451);
        Class<? extends Object> term247268 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term247267 = ((Class) term247268).getDeclaredField((String) "START_ARRAY");
        ((Field) term247267).setAccessible(true);
        Object enum157 = ((Field) term247267).get((Object) null);
        term246571 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term246571, term246571.getClass(), "_currToken", enum157);
        term246835 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term246977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Class<? extends Object> term247488 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term247487 = ((Class) term247488).getDeclaredField((String) "START_ARRAY");
        ((Field) term247487).setAccessible(true);
        Object enum158 = ((Field) term247487).get((Object) null);
        term247246 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term247247 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term247248 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term247249 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term247246, term247246.getClass(), "_type", null);
        setField(term247247, term247247.getClass(), "_objectIds", null);
        setField(term247247, term247247.getClass(), "_objectIdResolvers", null);
        setField(term247247, term247247.getClass(), "_cache", null);
        setField(term247247, term247247.getClass(), "_factory", null);
        setField(term247247, term247247.getClass(), "_config", null);
        setIntField(term247247, term247247.getClass(), "_featureFlags", 0);
        setField(term247247, term247247.getClass(), "_view", null);
        setField(term247247, term247247.getClass(), "_parser", null);
        setField(term247247, term247247.getClass(), "_injectableValues", null);
        setField(term247247, term247247.getClass(), "_arrayBuilders", null);
        setField(term247247, term247247.getClass(), "_objectBuffer", null);
        setField(term247247, term247247.getClass(), "_dateFormat", null);
        setField(term247247, term247247.getClass(), "_attributes", null);
        setField(term247247, term247247.getClass(), "_currentType", null);
        setField(term247246, term247246.getClass(), "_context", term247247);
        setField(term247248, term247248.getClass(), "_referencedType", null);
        setField(term247248, term247248.getClass(), "_valueTypeDeserializer", null);
        setField(term247248, term247248.getClass(), "_valueDeserializer", null);
        setField(term247248, term247248.getClass(), "_valueClass", null);
        setField(term247246, term247246.getClass(), "_deserializer", term247248);
        setField(term247249, term247249.getClass(), "rootFilter", null);
        setBooleanField(term247249, term247249.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term247249, term247249.getClass(), "_includePath", false);
        setBooleanField(term247249, term247249.getClass(), "_includeImmediateParent", false);
        setField(term247249, term247249.getClass(), "_currToken", null);
        setField(term247249, term247249.getClass(), "_lastClearedToken", enum158);
        setField(term247249, term247249.getClass(), "_headContext", null);
        setField(term247249, term247249.getClass(), "_exposedContext", null);
        setField(term247249, term247249.getClass(), "_itemFilter", null);
        setIntField(term247249, term247249.getClass(), "_matchCount", 0);
        setField(term247249, term247249.getClass(), "delegate", null);
        setIntField(term247249, term247249.getClass(), "_features", 0);
        setField(term247246, term247246.getClass(), "_parser", term247249);
        setField(term247246, term247246.getClass(), "_updatedValue", null);
        setBooleanField(term247246, term247246.getClass(), "_closeParser", true);
        setBooleanField(term247246, term247246.getClass(), "_hasNextChecked", false);
        Class<? extends Object> term247708 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term247707 = ((Class) term247708).getDeclaredField((String) "START_ARRAY");
        ((Field) term247707).setAccessible(true);
        Object enum159 = ((Field) term247707).get((Object) null);
        term247257 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term247257, term247257.getClass(), "rootFilter", null);
        setBooleanField(term247257, term247257.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term247257, term247257.getClass(), "_includePath", false);
        setBooleanField(term247257, term247257.getClass(), "_includeImmediateParent", false);
        setField(term247257, term247257.getClass(), "_currToken", null);
        setField(term247257, term247257.getClass(), "_lastClearedToken", enum159);
        setField(term247257, term247257.getClass(), "_headContext", null);
        setField(term247257, term247257.getClass(), "_exposedContext", null);
        setField(term247257, term247257.getClass(), "_itemFilter", null);
        setIntField(term247257, term247257.getClass(), "_matchCount", 0);
        setField(term247257, term247257.getClass(), "delegate", null);
        setIntField(term247257, term247257.getClass(), "_features", 0);
        term247265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term247265, term247265.getClass(), "_objectIds", null);
        setField(term247265, term247265.getClass(), "_objectIdResolvers", null);
        setField(term247265, term247265.getClass(), "_cache", null);
        setField(term247265, term247265.getClass(), "_factory", null);
        setField(term247265, term247265.getClass(), "_config", null);
        setIntField(term247265, term247265.getClass(), "_featureFlags", 0);
        setField(term247265, term247265.getClass(), "_view", null);
        setField(term247265, term247265.getClass(), "_parser", null);
        setField(term247265, term247265.getClass(), "_injectableValues", null);
        setField(term247265, term247265.getClass(), "_arrayBuilders", null);
        setField(term247265, term247265.getClass(), "_objectBuffer", null);
        setField(term247265, term247265.getClass(), "_dateFormat", null);
        setField(term247265, term247265.getClass(), "_attributes", null);
        setField(term247265, term247265.getClass(), "_currentType", null);
        term247266 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term247266, term247266.getClass(), "_referencedType", null);
        setField(term247266, term247266.getClass(), "_valueTypeDeserializer", null);
        setField(term247266, term247266.getClass(), "_valueDeserializer", null);
        setField(term247266, term247266.getClass(), "_valueClass", null);
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
        args[0] = null;
        args[1] = term246571;
        args[2] = term246835;
        args[3] = term246977;
        args[4] = true;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term247246));
        assertTrue(recursiveEquals(term246571, null));
        assertTrue(recursiveEquals(term246835, term247265));
        assertTrue(recursiveEquals(term246977, term247266));
    }

};


