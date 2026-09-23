package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1724735634229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132710;
     Object term132976;

    public BeanDeserializer_init_1724735634229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132584 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Object term132548 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term132548, term132548.getClass(), "_valueClass", term132584);
        setField(term132548, term132548.getClass(), "_beanType", null);
        setField(term132548, term132548.getClass(), "_valueInstantiator", null);
        setField(term132548, term132548.getClass(), "_beanProperties", null);
        setField(term132548, term132548.getClass(), "_backRefs", null);
        setField(term132548, term132548.getClass(), "_ignorableProps", null);
        setBooleanField(term132548, term132548.getClass(), "_ignoreAllUnknown", false);
        setField(term132548, term132548.getClass(), "_anySetter", null);
        setField(term132548, term132548.getClass(), "_injectables", null);
        setField(term132548, term132548.getClass(), "_objectIdReader", null);
        setField(term132548, term132548.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term132548, term132548.getClass(), "_nonStandardCreation", false);
        term132710 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term132846 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term132710, term132710.getClass(), "_valueInstantiator", term132846);
        setField(term132710, term132710.getClass(), "_anySetter", null);
        setField(term132710, term132710.getClass(), "_injectables", null);
        setField(term132710, term132710.getClass(), "_objectIdReader", null);
        Class<? extends Object> term133104 = Class.forName((String) "java.nio.DirectShortBufferS");
        term132976 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term133068 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term133252 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term133068, term133068.getClass(), "_class", term133104);
        setField(term132976, term132976.getClass(), "_type", term133068);
        setField(term132976, term132976.getClass(), "_annotationIntrospector", term133252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term132710;
        args[1] = term132976;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


