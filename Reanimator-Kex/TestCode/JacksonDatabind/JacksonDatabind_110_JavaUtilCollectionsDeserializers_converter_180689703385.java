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

public class JavaUtilCollectionsDeserializers_converter_180689703385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363983;
     Object term364733;

    public JavaUtilCollectionsDeserializers_converter_180689703385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term364019 = Class.forName((String) "com.fasterxml.jackson.core.JsonLocation");
        Class<? extends Object> term364159 = Class.forName((String) "java.util.regex.Pattern");
        Class<? extends Object> term364315 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer");
        Class<? extends Object> term364471 = Class.forName((String) "java.util.stream.Nodes$FixedNodeBuilder");
        term363983 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term364123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term364279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term364435 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term364591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term364697 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term363983, term363983.getClass(), "_class", term364019);
        setField(term364123, term364123.getClass(), "_class", term364159);
        setField(term364279, term364279.getClass(), "_class", term364315);
        setField(term364435, term364435.getClass(), "_class", term364471);
        setField(term364591, term364591.getClass(), "_class", null);
        setField(term364591, term364591.getClass(), "_superClass", term364697);
        setField(term364435, term364435.getClass(), "_superClass", term364591);
        setField(term364279, term364279.getClass(), "_superClass", term364435);
        setField(term364123, term364123.getClass(), "_superClass", term364279);
        setField(term363983, term363983.getClass(), "_superClass", term364123);
        term364733 = Class.forName((String) "java.nio.file.spi.FileTypeDetector");
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
        args[1] = term363983;
        args[2] = term364733;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


