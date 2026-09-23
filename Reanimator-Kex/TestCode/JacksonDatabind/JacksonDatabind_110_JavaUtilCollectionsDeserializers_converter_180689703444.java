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

public class JavaUtilCollectionsDeserializers_converter_180689703444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441149;
     Object term441977;

    public JavaUtilCollectionsDeserializers_converter_180689703444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term441185 = Class.forName((String) "java.lang.IllegalArgumentException");
        Class<? extends Object> term441325 = Class.forName((String) "com.fasterxml.jackson.databind.ser.ContainerSerializer");
        Class<? extends Object> term441467 = Class.forName((String) "java.lang.ProcessBuilder$RedirectPipeImpl");
        Class<? extends Object> term441609 = Class.forName((String) "java.util.stream.AbstractTask");
        Class<? extends Object> term441749 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        term441149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term441289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term441431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term441573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term441713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term441841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term441941 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term441149, term441149.getClass(), "_class", term441185);
        setField(term441289, term441289.getClass(), "_class", term441325);
        setField(term441431, term441431.getClass(), "_class", term441467);
        setField(term441573, term441573.getClass(), "_class", term441609);
        setField(term441713, term441713.getClass(), "_class", term441749);
        setField(term441841, term441841.getClass(), "_class", null);
        setField(term441841, term441841.getClass(), "_superClass", term441941);
        setField(term441713, term441713.getClass(), "_superClass", term441841);
        setField(term441573, term441573.getClass(), "_superClass", term441713);
        setField(term441431, term441431.getClass(), "_superClass", term441573);
        setField(term441289, term441289.getClass(), "_superClass", term441431);
        setField(term441149, term441149.getClass(), "_superClass", term441289);
        term441977 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
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
        args[1] = term441149;
        args[2] = term441977;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


