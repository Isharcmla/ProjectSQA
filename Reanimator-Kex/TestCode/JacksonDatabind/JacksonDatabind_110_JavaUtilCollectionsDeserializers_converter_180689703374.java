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

public class JavaUtilCollectionsDeserializers_converter_180689703374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351760;
     Object term352352;

    public JavaUtilCollectionsDeserializers_converter_180689703374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term351900 = Class.forName((String) "java.util.Collections$CheckedList$1");
        Class<? extends Object> term352056 = Class.forName((String) "java.nio.ByteBufferAsLongBufferB");
        Class<? extends Object> term352212 = Class.forName((String) "java.util.concurrent.SynchronousQueue$TransferStack$SNode");
        term351760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term351864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term352020 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term352176 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term352316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term351760, term351760.getClass(), "_class", null);
        setField(term351864, term351864.getClass(), "_class", term351900);
        setField(term352020, term352020.getClass(), "_class", term352056);
        setField(term352176, term352176.getClass(), "_class", term352212);
        setField(term352176, term352176.getClass(), "_superClass", term352316);
        setField(term352020, term352020.getClass(), "_superClass", term352176);
        setField(term351864, term351864.getClass(), "_superClass", term352020);
        setField(term351760, term351760.getClass(), "_superClass", term351864);
        term352352 = Class.forName((String) "java.util.Formatter$BigDecimalLayoutForm");
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
        args[1] = term351760;
        args[2] = term352352;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


