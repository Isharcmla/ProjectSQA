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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_handleNonArray_782599076262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233292;
     Object term233682;
     Object term233946;

    public CollectionDeserializer_handleNonArray_782599076262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233292 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term233424 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term233570 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term233292, term233292.getClass(), "_unwrapSingle", null);
        setField(term233292, term233292.getClass(), "_valueDeserializer", term233424);
        setField(term233292, term233292.getClass(), "_valueTypeDeserializer", term233570);
        Class<? extends Object> term236351 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term236350 = ((Class) term236351).getDeclaredField((String) "VALUE_STRING");
        ((Field) term236350).setAccessible(true);
        Object enum217 = ((Field) term236350).get((Object) null);
        term233682 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term233682, term233682.getClass(), "_currToken", enum217);
        term233946 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term233946, term233946.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term233682;
        args[1] = term233946;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term233292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


