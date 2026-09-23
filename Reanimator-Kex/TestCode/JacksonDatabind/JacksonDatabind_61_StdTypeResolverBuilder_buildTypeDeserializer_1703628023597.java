package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726457;
     Object term726719;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term727852 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term727851 = ((Class) term727852).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term727851).setAccessible(true);
        Object enum767 = ((Field) term727851).get((Object) null);
        term726457 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term726457, term726457.getClass(), "_appliesFor", enum767);
        Class<? extends Object> term726847 = Class.forName((String) "java.util.Currency$CurrencyProperty");
        term726719 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term726811 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term726811, term726811.getClass(), "_class", term726847);
        setField(term726719, term726719.getClass(), "_referencedType", term726811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term726719;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term726457, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


