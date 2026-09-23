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

public class CollectionDeserializer_handleNonArray_782599076199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150188;
     Object term150490;

    public CollectionDeserializer_handleNonArray_782599076199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term150236 = new Boolean(false);
        term150188 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term150342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term150188, term150188.getClass(), "_unwrapSingle", term150236);
        setField(term150342, term150342.getClass(), "_class", null);
        setField(term150188, term150188.getClass(), "_collectionType", term150342);
        term150490 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term150600 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term150490, term150490.getClass(), "_parser", term150600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term150490;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term150188, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


