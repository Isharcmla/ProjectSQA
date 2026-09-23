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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99556;

    public MappingIterator_readAll_1504926291152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100749 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term100748 = ((Class) term100749).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term100748).setAccessible(true);
        Object enum59 = ((Field) term100748).get((Object) null);
        term99556 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term99676 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term99928 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(term99676, term99676.getClass(), "_currToken", enum59);
        setField(term99556, term99556.getClass(), "_parser", term99676);
        setBooleanField(term99556, term99556.getClass(), "_hasNextChecked", false);
        setField(term99556, term99556.getClass(), "_updatedValue", null);
        setField(term99556, term99556.getClass(), "_deserializer", term99928);
        setField(term99556, term99556.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term99556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


