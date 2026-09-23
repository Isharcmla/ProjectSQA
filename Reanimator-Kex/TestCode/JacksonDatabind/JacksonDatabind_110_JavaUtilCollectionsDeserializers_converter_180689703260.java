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

public class JavaUtilCollectionsDeserializers_converter_180689703260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212364;
     Object term212788;

    public JavaUtilCollectionsDeserializers_converter_180689703260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212400 = Class.forName((String) "java.nio.channels.AsynchronousChannel");
        term212788 = Class.forName((String) "java.lang.invoke.VarHandleChars$Array");
        term212364 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term212514 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term212620 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term212734 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term212364, term212364.getClass(), "_class", term212400);
        setField(term212514, term212514.getClass(), "_class", null);
        setField(term212620, term212620.getClass(), "_class", null);
        setField(term212734, term212734.getClass(), "_class", term212788);
        setField(term212620, term212620.getClass(), "_superClass", term212734);
        setField(term212514, term212514.getClass(), "_superClass", term212620);
        setField(term212364, term212364.getClass(), "_superClass", term212514);
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
        args[1] = term212364;
        args[2] = term212788;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


