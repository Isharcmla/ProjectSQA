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

public class BeanDeserializer_init_99674089160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75619;
     Object term76123;

    public BeanDeserializer_init_99674089160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75249 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$None");
        Object term75213 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term75345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        Object[] term74983 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        setField(term75213, term75213.getClass(), "_valueClass", term75249);
        setField(term75213, term75213.getClass(), "_classAnnotations", null);
        setField(term75213, term75213.getClass(), "_beanType", term75345);
        setField(term75213, term75213.getClass(), "_valueInstantiator", null);
        setField(term75213, term75213.getClass(), "_delegateDeserializer", term75507);
        setField(term75213, term75213.getClass(), "_propertyBasedCreator", null);
        setField(term75213, term75213.getClass(), "_backRefs", null);
        setField(term75213, term75213.getClass(), "_ignorableProps", null);
        setBooleanField(term75213, term75213.getClass(), "_ignoreAllUnknown", false);
        setField(term75213, term75213.getClass(), "_anySetter", null);
        setField(term75213, term75213.getClass(), "_injectables", term74983);
        setBooleanField(term75213, term75213.getClass(), "_nonStandardCreation", false);
        setField(term75213, term75213.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term75213, term75213.getClass(), "_needViewProcesing", false);
        setField(term75213, term75213.getClass(), "_serializationShape", null);
        setField(term75213, term75213.getClass(), "_objectIdReader", null);
        Class<? extends Object> term75747 = Class.forName((String) "java.lang.invoke.TypeConvertingMethodAdapter");
        Class<? extends Object> term77871 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term77870 = ((Class) term77871).getDeclaredField((String) "BOOLEAN");
        ((Field) term77870).setAccessible(true);
        Object enum21 = ((Field) term77870).get((Object) null);
        term75619 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term75711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term75863 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term75711, term75711.getClass(), "_class", term75747);
        setField(term75619, term75619.getClass(), "_beanType", term75711);
        setField(term75619, term75619.getClass(), "_classAnnotations", term75863);
        setField(term75619, term75619.getClass(), "_valueInstantiator", null);
        setField(term75619, term75619.getClass(), "_delegateDeserializer", null);
        setField(term75619, term75619.getClass(), "_propertyBasedCreator", null);
        setField(term75619, term75619.getClass(), "_backRefs", null);
        setField(term75619, term75619.getClass(), "_ignorableProps", null);
        setBooleanField(term75619, term75619.getClass(), "_ignoreAllUnknown", false);
        setField(term75619, term75619.getClass(), "_anySetter", null);
        setField(term75619, term75619.getClass(), "_injectables", term74983);
        setBooleanField(term75619, term75619.getClass(), "_nonStandardCreation", false);
        setField(term75619, term75619.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term75619, term75619.getClass(), "_needViewProcesing", false);
        setField(term75619, term75619.getClass(), "_serializationShape", enum21);
        term76123 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term75619;
        args[1] = term76123;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


