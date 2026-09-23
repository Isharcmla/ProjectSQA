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

public class MappingIterator_readAll_1504926291216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172838;

    public MappingIterator_readAll_1504926291216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172838 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term172944 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term173056 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term173090 = newInstance(Class.forName("java.lang.invoke.VarHandleBytes"));
        Object term173161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term173309 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term172944, term172944.getClass(), "delegate", term173056);
        setField(term172838, term172838.getClass(), "_parser", term172944);
        setBooleanField(term172838, term172838.getClass(), "_hasNextChecked", true);
        setField(term172838, term172838.getClass(), "_updatedValue", term173090);
        setField(term172838, term172838.getClass(), "_deserializer", term173161);
        setField(term172838, term172838.getClass(), "_context", term173309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term172838, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


