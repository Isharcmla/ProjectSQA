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

public class JavaUtilCollectionsDeserializers_converter_180689703340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309000;
     Object term309692;

    public JavaUtilCollectionsDeserializers_converter_180689703340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309036 = Class.forName((String) "java.lang.ArrayIndexOutOfBoundsException");
        Class<? extends Object> term309176 = Class.forName((String) "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
        Class<? extends Object> term309318 = Class.forName((String) "java.util.stream.LongPipeline$4$1");
        Class<? extends Object> term309460 = Class.forName((String) "java.nio.file.AccessMode");
        term309000 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term309140 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term309282 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term309424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term309564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term309656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term309000, term309000.getClass(), "_class", term309036);
        setField(term309140, term309140.getClass(), "_class", term309176);
        setField(term309282, term309282.getClass(), "_class", term309318);
        setField(term309424, term309424.getClass(), "_class", term309460);
        setField(term309564, term309564.getClass(), "_class", null);
        setField(term309564, term309564.getClass(), "_superClass", term309656);
        setField(term309424, term309424.getClass(), "_superClass", term309564);
        setField(term309282, term309282.getClass(), "_superClass", term309424);
        setField(term309140, term309140.getClass(), "_superClass", term309282);
        setField(term309000, term309000.getClass(), "_superClass", term309140);
        term309692 = Class.forName((String) "java.util.IdentityHashMap$Values");
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
        args[1] = term309000;
        args[2] = term309692;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


