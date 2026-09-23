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

public class JavaUtilCollectionsDeserializers_converter_180689703291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248460;
     Object term249088;

    public JavaUtilCollectionsDeserializers_converter_180689703291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term248496 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base");
        Class<? extends Object> term248624 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.NamedType");
        Class<? extends Object> term248756 = Class.forName((String) "java.util.function.DoubleConsumer");
        term248460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term248588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term248720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term248852 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term248952 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term249052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term248460, term248460.getClass(), "_class", term248496);
        setField(term248588, term248588.getClass(), "_class", term248624);
        setField(term248720, term248720.getClass(), "_class", term248756);
        setField(term248852, term248852.getClass(), "_class", term248624);
        setField(term248952, term248952.getClass(), "_class", null);
        setField(term248952, term248952.getClass(), "_superClass", term249052);
        setField(term248852, term248852.getClass(), "_superClass", term248952);
        setField(term248720, term248720.getClass(), "_superClass", term248852);
        setField(term248588, term248588.getClass(), "_superClass", term248720);
        setField(term248460, term248460.getClass(), "_superClass", term248588);
        term249088 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider");
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
        args[1] = term248460;
        args[2] = term249088;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


