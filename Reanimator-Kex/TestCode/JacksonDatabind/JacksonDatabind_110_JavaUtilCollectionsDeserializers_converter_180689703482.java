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

public class JavaUtilCollectionsDeserializers_converter_180689703482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494234;
     Object term494746;

    public JavaUtilCollectionsDeserializers_converter_180689703482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term494270 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer");
        Class<? extends Object> term494398 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer");
        term494234 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term494362 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term494490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term494596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term494710 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term494234, term494234.getClass(), "_class", term494270);
        setField(term494362, term494362.getClass(), "_class", term494398);
        setField(term494490, term494490.getClass(), "_class", null);
        setField(term494596, term494596.getClass(), "_class", null);
        setField(term494596, term494596.getClass(), "_superClass", term494710);
        setField(term494490, term494490.getClass(), "_superClass", term494596);
        setField(term494362, term494362.getClass(), "_superClass", term494490);
        setField(term494234, term494234.getClass(), "_superClass", term494362);
        term494746 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
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
        args[1] = term494234;
        args[2] = term494746;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


