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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232352;
     Object term232714;

    public JavaUtilCollectionsDeserializers_converter_180689703276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232388 = Class.forName((String) "java.util.stream.StreamSpliterators$DoubleWrappingSpliterator");
        term232352 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term232480 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term232572 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term232678 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term232352, term232352.getClass(), "_class", term232388);
        setField(term232480, term232480.getClass(), "_class", null);
        setField(term232572, term232572.getClass(), "_class", null);
        setField(term232572, term232572.getClass(), "_superClass", term232678);
        setField(term232480, term232480.getClass(), "_superClass", term232572);
        setField(term232352, term232352.getClass(), "_superClass", term232480);
        term232714 = Class.forName((String) "java.util.LongSummaryStatistics");
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
        args[1] = term232352;
        args[2] = term232714;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


