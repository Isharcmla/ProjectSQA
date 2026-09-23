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

public class CollectionDeserializer_handleNonArray_782599076260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231061;
     Object term231433;
     Object term231697;

    public CollectionDeserializer_handleNonArray_782599076260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231061 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term231193 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term231321 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term231061, term231061.getClass(), "_unwrapSingle", null);
        setField(term231193, term231193.getClass(), "_delegateDeserializer", null);
        setField(term231193, term231193.getClass(), "_valueInstantiator", term231321);
        setField(term231061, term231061.getClass(), "_valueDeserializer", term231193);
        setField(term231061, term231061.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term234813 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term234812 = ((Class) term234813).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term234812).setAccessible(true);
        Object enum215 = ((Field) term234812).get((Object) null);
        term231433 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term231433, term231433.getClass(), "_currToken", enum215);
        term231697 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term231697, term231697.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term231433;
        args[1] = term231697;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term231061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


