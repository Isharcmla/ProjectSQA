package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109499;
     Object term109787;

    public JavaUtilCollectionsDeserializers_converter_180689703163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109627 = Class.forName((String) "java.util.zip.ZipFile$EntrySpliterator");
        term109787 = Class.forName((String) "java.nio.channels.ClosedSelectorException");
        term109499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term109591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term109733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term109499, term109499.getClass(), "_class", null);
        setField(term109591, term109591.getClass(), "_class", term109627);
        setField(term109733, term109733.getClass(), "_class", term109787);
        setField(term109591, term109591.getClass(), "_superClass", term109733);
        setField(term109499, term109499.getClass(), "_superClass", term109591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term109499;
        args[2] = term109787;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


