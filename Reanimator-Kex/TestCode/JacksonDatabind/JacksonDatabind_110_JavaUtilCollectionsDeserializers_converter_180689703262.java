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

public class JavaUtilCollectionsDeserializers_converter_180689703262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214830;
     Object term215584;

    public JavaUtilCollectionsDeserializers_converter_180689703262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214866 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble$1Splitr");
        Class<? extends Object> term215016 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder$1");
        Class<? extends Object> term215158 = Class.forName((String) "java.lang.invoke.MutableCallSite");
        Class<? extends Object> term215314 = Class.forName((String) "java.util.stream.LongPipeline$StatelessOp");
        term214830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term214980 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term215122 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term215278 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term215434 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term215548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term214830, term214830.getClass(), "_class", term214866);
        setField(term214980, term214980.getClass(), "_class", term215016);
        setField(term215122, term215122.getClass(), "_class", term215158);
        setField(term215278, term215278.getClass(), "_class", term215314);
        setField(term215434, term215434.getClass(), "_class", null);
        setField(term215434, term215434.getClass(), "_superClass", term215548);
        setField(term215278, term215278.getClass(), "_superClass", term215434);
        setField(term215122, term215122.getClass(), "_superClass", term215278);
        setField(term214980, term214980.getClass(), "_superClass", term215122);
        setField(term214830, term214830.getClass(), "_superClass", term214980);
        term215584 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonMerge");
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
        args[1] = term214830;
        args[2] = term215584;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


