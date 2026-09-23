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

public class JavaUtilCollectionsDeserializers_converter_180689703424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414838;
     Object term415582;

    public JavaUtilCollectionsDeserializers_converter_180689703424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term414874 = Class.forName((String) "java.util.zip.ZipUtils");
        Class<? extends Object> term415024 = Class.forName((String) "java.util.IllegalFormatConversionException");
        Class<? extends Object> term415166 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase");
        Class<? extends Object> term415322 = Class.forName((String) "java.util.regex.Matcher");
        term414838 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term414988 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term415130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term415286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term415442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term415546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term414838, term414838.getClass(), "_class", term414874);
        setField(term414988, term414988.getClass(), "_class", term415024);
        setField(term415130, term415130.getClass(), "_class", term415166);
        setField(term415286, term415286.getClass(), "_class", term415322);
        setField(term415442, term415442.getClass(), "_class", null);
        setField(term415442, term415442.getClass(), "_superClass", term415546);
        setField(term415286, term415286.getClass(), "_superClass", term415442);
        setField(term415130, term415130.getClass(), "_superClass", term415286);
        setField(term414988, term414988.getClass(), "_superClass", term415130);
        setField(term414838, term414838.getClass(), "_superClass", term414988);
        term415582 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
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
        args[1] = term414838;
        args[2] = term415582;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


