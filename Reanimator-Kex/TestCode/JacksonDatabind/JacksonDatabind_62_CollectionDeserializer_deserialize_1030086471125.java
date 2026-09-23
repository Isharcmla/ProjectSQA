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

public class CollectionDeserializer_deserialize_1030086471125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65399;
     Object term65673;

    public CollectionDeserializer_deserialize_1030086471125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term65447 = new Boolean(false);
        term65399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term65553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term65399, term65399.getClass(), "_unwrapSingle", term65447);
        setField(term65399, term65399.getClass(), "_collectionType", term65553);
        Class<? extends Object> term66307 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term66306 = ((Class) term66307).getDeclaredField((String) "VALUE_STRING");
        ((Field) term66306).setAccessible(true);
        Object enum55 = ((Field) term66306).get((Object) null);
        term65673 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term65673, term65673.getClass(), "_currToken", enum55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term65673;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term65399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


