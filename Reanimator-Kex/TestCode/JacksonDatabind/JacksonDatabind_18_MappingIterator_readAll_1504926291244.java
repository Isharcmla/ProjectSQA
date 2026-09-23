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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204405;

    public MappingIterator_readAll_1504926291244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206731 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term206730 = ((Class) term206731).getDeclaredField((String) "END_OBJECT");
        ((Field) term206730).setAccessible(true);
        Object enum127 = ((Field) term206730).get((Object) null);
        term204405 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term204525 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term204753 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term204887 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term205035 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term204525, term204525.getClass(), "_currToken", enum127);
        setField(term204525, term204525.getClass(), "delegate", term204753);
        setField(term204405, term204405.getClass(), "_parser", term204525);
        setBooleanField(term204405, term204405.getClass(), "_hasNextChecked", false);
        setField(term204405, term204405.getClass(), "_updatedValue", null);
        setField(term204405, term204405.getClass(), "_deserializer", term204887);
        setIntField(term205035, term205035.getClass(), "_featureFlags", -1);
        setField(term204405, term204405.getClass(), "_context", term205035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term204405, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


