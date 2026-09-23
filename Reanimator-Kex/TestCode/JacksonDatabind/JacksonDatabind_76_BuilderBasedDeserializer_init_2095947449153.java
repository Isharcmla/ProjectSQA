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

public class BuilderBasedDeserializer_init_2095947449153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56019;

    public BuilderBasedDeserializer_init_2095947449153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55891 = Class.forName((String) "java.nio.DirectCharBufferRU");
        Object term55855 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term55855, term55855.getClass(), "_valueClass", term55891);
        setField(term55855, term55855.getClass(), "_classAnnotations", null);
        setField(term55855, term55855.getClass(), "_beanType", null);
        setField(term55855, term55855.getClass(), "_valueInstantiator", null);
        setField(term55855, term55855.getClass(), "_delegateDeserializer", null);
        setField(term55855, term55855.getClass(), "_propertyBasedCreator", null);
        setField(term55855, term55855.getClass(), "_backRefs", null);
        setField(term55855, term55855.getClass(), "_ignorableProps", null);
        Class<? extends Object> term56159 = Class.forName((String) "java.lang.invoke.InjectedProfile");
        term56019 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term56123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term56287 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term56417 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term56123, term56123.getClass(), "_class", term56159);
        setField(term56019, term56019.getClass(), "_beanType", term56123);
        setField(term56019, term56019.getClass(), "_classAnnotations", null);
        setField(term56019, term56019.getClass(), "_valueInstantiator", null);
        setField(term56019, term56019.getClass(), "_delegateDeserializer", term56287);
        setField(term56019, term56019.getClass(), "_propertyBasedCreator", term56417);
        setField(term56019, term56019.getClass(), "_backRefs", null);
        setField(term56019, term56019.getClass(), "_ignorableProps", null);
        setBooleanField(term56019, term56019.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term56019;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


