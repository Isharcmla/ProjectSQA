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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanDeserializer_init_1724735634223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123751;
     Object term124017;

    public BeanDeserializer_init_1724735634223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123625 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term123625, term123625.getClass(), "_valueClass", null);
        setField(term123625, term123625.getClass(), "_beanType", null);
        setField(term123625, term123625.getClass(), "_valueInstantiator", null);
        setField(term123625, term123625.getClass(), "_beanProperties", null);
        setField(term123625, term123625.getClass(), "_backRefs", null);
        setField(term123625, term123625.getClass(), "_ignorableProps", null);
        setBooleanField(term123625, term123625.getClass(), "_ignoreAllUnknown", false);
        setField(term123625, term123625.getClass(), "_anySetter", null);
        setField(term123625, term123625.getClass(), "_injectables", null);
        setField(term123625, term123625.getClass(), "_objectIdReader", null);
        setField(term123625, term123625.getClass(), "_unwrappedPropertyHandler", null);
        term123751 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term123887 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term123751, term123751.getClass(), "_valueInstantiator", term123887);
        setField(term123751, term123751.getClass(), "_anySetter", null);
        setField(term123751, term123751.getClass(), "_injectables", null);
        setField(term123751, term123751.getClass(), "_objectIdReader", null);
        term124017 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term124131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term124131, term124131.getClass(), "_class", null);
        setField(term124017, term124017.getClass(), "_type", term124131);
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
        args[0] = term123751;
        args[1] = term124017;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


