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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189785;
     Object term190035;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191131 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term191130 = ((Class) term191131).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term191130).setAccessible(true);
        Object enum257 = ((Field) term191130).get((Object) null);
        term189785 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term189785, term189785.getClass(), "_appliesFor", enum257);
        Class<? extends Object> term190071 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase");
        term190035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term190035, term190035.getClass(), "_class", term190071);
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
        args[1] = term190035;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term189785, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


