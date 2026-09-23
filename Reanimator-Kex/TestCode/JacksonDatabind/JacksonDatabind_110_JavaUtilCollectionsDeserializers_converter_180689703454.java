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

public class JavaUtilCollectionsDeserializers_converter_180689703454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454841;
     Object term455401;

    public JavaUtilCollectionsDeserializers_converter_180689703454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term454877 = Class.forName((String) "java.lang.invoke.VarHandleBytes$FieldInstanceReadWrite");
        Class<? extends Object> term455005 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer");
        Class<? extends Object> term455155 = Class.forName((String) "com.fasterxml.jackson.databind.Module$SetupContext");
        term454841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term454969 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term455119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term455259 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term455365 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term454841, term454841.getClass(), "_class", term454877);
        setField(term454969, term454969.getClass(), "_class", term455005);
        setField(term455119, term455119.getClass(), "_class", term455155);
        setField(term455259, term455259.getClass(), "_class", null);
        setField(term455259, term455259.getClass(), "_superClass", term455365);
        setField(term455119, term455119.getClass(), "_superClass", term455259);
        setField(term454969, term454969.getClass(), "_superClass", term455119);
        setField(term454841, term454841.getClass(), "_superClass", term454969);
        term455401 = Class.forName((String) "java.util.concurrent.Executors$DelegatedExecutorService");
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
        args[1] = term454841;
        args[2] = term455401;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


