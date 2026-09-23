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

public class JavaUtilCollectionsDeserializers_converter_180689703250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198643;
     Object term198943;

    public JavaUtilCollectionsDeserializers_converter_180689703250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198679 = Class.forName((String) "java.lang.ClassValue$Version");
        term198943 = Class.forName((String) "java.nio.channels.spi.SelectorProvider");
        term198643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term198783 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term198889 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term198643, term198643.getClass(), "_class", term198679);
        setField(term198783, term198783.getClass(), "_class", null);
        setField(term198889, term198889.getClass(), "_class", term198943);
        setField(term198783, term198783.getClass(), "_superClass", term198889);
        setField(term198643, term198643.getClass(), "_superClass", term198783);
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
        args[1] = term198643;
        args[2] = term198943;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


