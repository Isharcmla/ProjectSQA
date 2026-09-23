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

public class JavaUtilCollectionsDeserializers_converter_180689703121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67671;
     Object term68063;

    public JavaUtilCollectionsDeserializers_converter_180689703121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67707 = Class.forName((String) "java.lang.invoke.VarHandle$2");
        Class<? extends Object> term67835 = Class.forName((String) "com.fasterxml.jackson.core.util.Separators");
        term67671 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term67799 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term67931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term68027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term67671, term67671.getClass(), "_class", term67707);
        setField(term67799, term67799.getClass(), "_class", term67835);
        setField(term67931, term67931.getClass(), "_class", null);
        setField(term67931, term67931.getClass(), "_superClass", term68027);
        setField(term67799, term67799.getClass(), "_superClass", term67931);
        setField(term67671, term67671.getClass(), "_superClass", term67799);
        term68063 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Value");
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
        args[1] = term67671;
        args[2] = term68063;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


