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

public class StringCollectionDeserializer_handleNonArray_41383521123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public StringCollectionDeserializer_handleNonArray_41383521123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(term9, term9.getClass(), "_valueDeserializer", null);
        setField(term9, term9.getClass(), "_valueInstantiator", null);
        setField(term9, term9.getClass(), "_delegateDeserializer", null);
        setField(term9, term9.getClass(), "_containerType", null);
        setField(term9, term9.getClass(), "_nullProvider", null);
        setField(term9, term9.getClass(), "_unwrapSingle", null);
        setBooleanField(term9, term9.getClass(), "_skipNullValues", false);
        setField(term9, term9.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term9, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


