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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122741;

    public MappingIterator_readAll_1504926291172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term124393 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term124392 = ((Class) term124393).getDeclaredField((String) "VALUE_NULL");
        ((Field) term124392).setAccessible(true);
        Object enum77 = ((Field) term124392).get((Object) null);
        term122741 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term122851 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term123027 = newInstance(Class.forName("java.io.BufferedInputStream"));
        Object term123189 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term122851, term122851.getClass(), "_currToken", enum77);
        setField(term122741, term122741.getClass(), "_parser", term122851);
        setBooleanField(term122741, term122741.getClass(), "_hasNextChecked", false);
        setField(term122741, term122741.getClass(), "_updatedValue", term123027);
        setField(term122741, term122741.getClass(), "_deserializer", term123189);
        setField(term122741, term122741.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term122741, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


