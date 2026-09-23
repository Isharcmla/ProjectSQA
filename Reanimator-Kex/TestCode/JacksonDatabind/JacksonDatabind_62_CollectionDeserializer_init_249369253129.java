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

public class CollectionDeserializer_init_249369253129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68674;
     Object term68680;
     Object term68682;

    public CollectionDeserializer_init_249369253129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term68674 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term68680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term68681 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term68681, term68681.getClass(), "_elementType", null);
        setField(term68681, term68681.getClass(), "_superClass", null);
        setField(term68681, term68681.getClass(), "_superInterfaces", null);
        setField(term68681, term68681.getClass(), "_bindings", null);
        setField(term68681, term68681.getClass(), "_canonicalName", null);
        setField(term68681, term68681.getClass(), "_class", null);
        setIntField(term68681, term68681.getClass(), "_hash", 0);
        setField(term68681, term68681.getClass(), "_valueHandler", null);
        setField(term68681, term68681.getClass(), "_typeHandler", null);
        setBooleanField(term68681, term68681.getClass(), "_asStatic", false);
        setField(term68680, term68680.getClass(), "_collectionType", term68681);
        setField(term68680, term68680.getClass(), "_valueDeserializer", null);
        setField(term68680, term68680.getClass(), "_valueTypeDeserializer", null);
        setField(term68680, term68680.getClass(), "_valueInstantiator", null);
        setField(term68680, term68680.getClass(), "_delegateDeserializer", null);
        setField(term68680, term68680.getClass(), "_unwrapSingle", null);
        setField(term68680, term68680.getClass(), "_valueClass", null);
        term68682 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term68682, term68682.getClass(), "_elementType", null);
        setField(term68682, term68682.getClass(), "_superClass", null);
        setField(term68682, term68682.getClass(), "_superInterfaces", null);
        setField(term68682, term68682.getClass(), "_bindings", null);
        setField(term68682, term68682.getClass(), "_canonicalName", null);
        setField(term68682, term68682.getClass(), "_class", null);
        setIntField(term68682, term68682.getClass(), "_hash", 0);
        setField(term68682, term68682.getClass(), "_valueHandler", null);
        setField(term68682, term68682.getClass(), "_typeHandler", null);
        setBooleanField(term68682, term68682.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = term68674;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68680));
        assertTrue(recursiveEquals(term68674, term68682));
    }

};


