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

public class JavaUtilCollectionsDeserializers_converter_180689703438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431726;
     Object term432252;

    public JavaUtilCollectionsDeserializers_converter_180689703438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term431762 = Class.forName((String) "java.util.zip.GZIPInputStream");
        Class<? extends Object> term431890 = Class.forName((String) "java.nio.channels.Channel");
        Class<? extends Object> term432018 = Class.forName((String) "java.util.stream.ReferencePipeline$5$1");
        term431726 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term431854 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term431982 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term432110 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term432216 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term431726, term431726.getClass(), "_class", term431762);
        setField(term431854, term431854.getClass(), "_class", term431890);
        setField(term431982, term431982.getClass(), "_class", term432018);
        setField(term432110, term432110.getClass(), "_class", null);
        setField(term432110, term432110.getClass(), "_superClass", term432216);
        setField(term431982, term431982.getClass(), "_superClass", term432110);
        setField(term431854, term431854.getClass(), "_superClass", term431982);
        setField(term431726, term431726.getClass(), "_superClass", term431854);
        term432252 = Class.forName((String) "java.lang.ClassValue$Entry");
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
        args[1] = term431726;
        args[2] = term432252;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


