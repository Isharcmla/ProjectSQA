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

public class CollectionDeserializer_handleNonArray_782599076241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204059;
     Object term204317;
     Object term204581;

    public CollectionDeserializer_handleNonArray_782599076241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204059 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term204205 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term204059, term204059.getClass(), "_unwrapSingle", null);
        setField(term204059, term204059.getClass(), "_valueDeserializer", null);
        setField(term204059, term204059.getClass(), "_valueTypeDeserializer", term204205);
        Class<? extends Object> term205354 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term205353 = ((Class) term205354).getDeclaredField((String) "START_ARRAY");
        ((Field) term205353).setAccessible(true);
        Object enum187 = ((Field) term205353).get((Object) null);
        term204317 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term204317, term204317.getClass(), "_currToken", enum187);
        term204581 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term204581, term204581.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term204317;
        args[1] = term204581;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term204059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


