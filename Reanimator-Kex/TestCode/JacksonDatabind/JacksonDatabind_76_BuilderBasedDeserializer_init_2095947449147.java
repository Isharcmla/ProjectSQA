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

public class BuilderBasedDeserializer_init_2095947449147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49206;
     Object term49574;

    public BuilderBasedDeserializer_init_2095947449147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49078 = Class.forName((String) "java.nio.file.CopyOption");
        Object term49042 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term49042, term49042.getClass(), "_valueClass", term49078);
        setField(term49042, term49042.getClass(), "_classAnnotations", null);
        setField(term49042, term49042.getClass(), "_beanType", null);
        setField(term49042, term49042.getClass(), "_valueInstantiator", null);
        setField(term49042, term49042.getClass(), "_delegateDeserializer", null);
        setField(term49042, term49042.getClass(), "_propertyBasedCreator", null);
        setField(term49042, term49042.getClass(), "_backRefs", null);
        setField(term49042, term49042.getClass(), "_ignorableProps", null);
        Class<? extends Object> term49334 = Class.forName((String) "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo");
        term49206 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term49298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term49450 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term49298, term49298.getClass(), "_class", term49334);
        setField(term49206, term49206.getClass(), "_beanType", term49298);
        setField(term49206, term49206.getClass(), "_classAnnotations", term49450);
        setField(term49206, term49206.getClass(), "_valueInstantiator", null);
        setField(term49206, term49206.getClass(), "_delegateDeserializer", null);
        setField(term49206, term49206.getClass(), "_propertyBasedCreator", null);
        setField(term49206, term49206.getClass(), "_backRefs", null);
        setField(term49206, term49206.getClass(), "_ignorableProps", null);
        term49574 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term49206;
        args[1] = term49574;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


