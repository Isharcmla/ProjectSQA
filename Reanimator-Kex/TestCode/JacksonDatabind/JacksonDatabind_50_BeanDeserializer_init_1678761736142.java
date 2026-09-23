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
import java.util.HashMap;
import java.util.HashSet;

public class BeanDeserializer_init_1678761736142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56447;

    public BeanDeserializer_init_1678761736142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55773 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonInject");
        HashMap term56335 = new HashMap();
        Object term55737 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term55871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term55995 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        Object term56157 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser"));
        Object term56287 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term55737, term55737.getClass(), "_valueClass", term55773);
        setField(term55737, term55737.getClass(), "_classAnnotations", null);
        setField(term55737, term55737.getClass(), "_beanType", term55871);
        setField(term55737, term55737.getClass(), "_valueInstantiator", term55995);
        setField(term55737, term55737.getClass(), "_delegateDeserializer", term56157);
        setField(term55737, term55737.getClass(), "_propertyBasedCreator", term56287);
        setField(term55737, term55737.getClass(), "_backRefs", term56335);
        setField(term55737, term55737.getClass(), "_ignorableProps", null);
        Class<? extends Object> term56589 = Class.forName((String) "java.util.Collections$SynchronizedSortedSet");
        HashSet term57021 = new HashSet();
        term56447 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term56553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term56705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term56843 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        Object term56973 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term56553, term56553.getClass(), "_class", term56589);
        setField(term56447, term56447.getClass(), "_beanType", term56553);
        setField(term56447, term56447.getClass(), "_classAnnotations", term56705);
        setField(term56447, term56447.getClass(), "_valueInstantiator", term56843);
        setField(term56447, term56447.getClass(), "_delegateDeserializer", null);
        setField(term56447, term56447.getClass(), "_propertyBasedCreator", term56973);
        setField(term56447, term56447.getClass(), "_backRefs", null);
        setField(term56447, term56447.getClass(), "_ignorableProps", term57021);
        setBooleanField(term56447, term56447.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term56447;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


