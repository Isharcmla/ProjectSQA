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

public class JavaUtilCollectionsDeserializers_converter_180689703442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436935;
     Object term437823;

    public JavaUtilCollectionsDeserializers_converter_180689703442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term436971 = Class.forName((String) "java.util.ArraysParallelSortHelpers$EmptyCompleter");
        Class<? extends Object> term437111 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsFloats$ArrayHandle");
        Class<? extends Object> term437253 = Class.forName((String) "java.util.concurrent.ExecutorCompletionService");
        Class<? extends Object> term437395 = Class.forName((String) "java.util.Locale$LocaleNameGetter");
        Class<? extends Object> term437535 = Class.forName((String) "java.util.ServiceLoader$LazyClassPathLookupIterator");
        Class<? extends Object> term437663 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeySpliterator");
        term437823 = Class.forName((String) "java.util.zip.ZipError");
        term436935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term437075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term437217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term437359 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term437499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term437627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term437769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term436935, term436935.getClass(), "_class", term436971);
        setField(term437075, term437075.getClass(), "_class", term437111);
        setField(term437217, term437217.getClass(), "_class", term437253);
        setField(term437359, term437359.getClass(), "_class", term437395);
        setField(term437499, term437499.getClass(), "_class", term437535);
        setField(term437627, term437627.getClass(), "_class", term437663);
        setField(term437769, term437769.getClass(), "_class", term437823);
        setField(term437627, term437627.getClass(), "_superClass", term437769);
        setField(term437499, term437499.getClass(), "_superClass", term437627);
        setField(term437359, term437359.getClass(), "_superClass", term437499);
        setField(term437217, term437217.getClass(), "_superClass", term437359);
        setField(term437075, term437075.getClass(), "_superClass", term437217);
        setField(term436935, term436935.getClass(), "_superClass", term437075);
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
        args[1] = term436935;
        args[2] = term437823;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


