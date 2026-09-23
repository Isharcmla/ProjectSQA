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
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102768;
     Object term102950;

    public BeanDeserializer_init_1724735634209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102550 = Class.forName((String) "java.util.stream.Nodes$ConcNode$OfPrimitive");
        Object term102514 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term102642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term102514, term102514.getClass(), "_valueClass", term102550);
        setField(term102514, term102514.getClass(), "_beanType", term102642);
        setField(term102514, term102514.getClass(), "_valueInstantiator", null);
        setField(term102514, term102514.getClass(), "_beanProperties", null);
        setField(term102514, term102514.getClass(), "_backRefs", null);
        setField(term102514, term102514.getClass(), "_ignorableProps", null);
        setBooleanField(term102514, term102514.getClass(), "_ignoreAllUnknown", false);
        setField(term102514, term102514.getClass(), "_anySetter", null);
        ArrayList term102820 = new ArrayList();
        term102768 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term102768, term102768.getClass(), "_valueInstantiator", null);
        setField(term102768, term102768.getClass(), "_anySetter", null);
        setField(term102768, term102768.getClass(), "_injectables", term102820);
        Class<? extends Object> term103100 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate$Param");
        term102950 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term103064 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term103064, term103064.getClass(), "_class", term103100);
        setField(term102950, term102950.getClass(), "_type", term103064);
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
        args[0] = term102768;
        args[1] = term102950;
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


