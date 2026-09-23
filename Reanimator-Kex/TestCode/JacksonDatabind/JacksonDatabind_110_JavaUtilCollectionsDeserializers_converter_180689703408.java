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

public class JavaUtilCollectionsDeserializers_converter_180689703408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393040;
     Object term393758;

    public JavaUtilCollectionsDeserializers_converter_180689703408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term393190 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder");
        Class<? extends Object> term393332 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJObject$Sorter");
        Class<? extends Object> term393488 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfRef");
        term393040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term393154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term393296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term393452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term393608 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term393722 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term393040, term393040.getClass(), "_class", null);
        setField(term393154, term393154.getClass(), "_class", term393190);
        setField(term393296, term393296.getClass(), "_class", term393332);
        setField(term393452, term393452.getClass(), "_class", term393488);
        setField(term393608, term393608.getClass(), "_class", null);
        setField(term393608, term393608.getClass(), "_superClass", term393722);
        setField(term393452, term393452.getClass(), "_superClass", term393608);
        setField(term393296, term393296.getClass(), "_superClass", term393452);
        setField(term393154, term393154.getClass(), "_superClass", term393296);
        setField(term393040, term393040.getClass(), "_superClass", term393154);
        term393758 = Class.forName((String) "java.util.jar.JarFile$JarFileEntry");
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
        args[1] = term393040;
        args[2] = term393758;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


