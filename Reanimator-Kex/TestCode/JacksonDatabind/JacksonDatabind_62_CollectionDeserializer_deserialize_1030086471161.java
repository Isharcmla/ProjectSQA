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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98054;
     Object term98312;
     Object term98696;

    public CollectionDeserializer_deserialize_1030086471161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term98102 = new Boolean(false);
        term98054 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term98206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term98054, term98054.getClass(), "_unwrapSingle", term98102);
        setField(term98206, term98206.getClass(), "_class", null);
        setField(term98054, term98054.getClass(), "_collectionType", term98206);
        Class<? extends Object> term99294 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term99293 = ((Class) term99294).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term99293).setAccessible(true);
        Object enum85 = ((Field) term99293).get((Object) null);
        term98312 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term98432 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term98432, term98432.getClass(), "_currToken", enum85);
        setField(term98312, term98312.getClass(), "delegate", term98432);
        term98696 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term98312;
        args[1] = term98696;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term98054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


