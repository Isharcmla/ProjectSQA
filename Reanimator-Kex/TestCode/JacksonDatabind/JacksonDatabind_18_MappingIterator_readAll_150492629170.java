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

public class MappingIterator_readAll_150492629170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32539;

    public MappingIterator_readAll_150492629170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33886 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term33885 = ((Class) term33886).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term33885).setAccessible(true);
        Object enum17 = ((Field) term33885).get((Object) null);
        term32539 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term32649 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term32649, term32649.getClass(), "_currToken", enum17);
        setField(term32539, term32539.getClass(), "_parser", term32649);
        setBooleanField(term32539, term32539.getClass(), "_hasNextChecked", false);
        setField(term32539, term32539.getClass(), "_updatedValue", "END_ARRAY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term32539, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


