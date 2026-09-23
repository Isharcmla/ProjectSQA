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
import java.lang.String;
import java.util.ArrayList;

public class BuilderBasedDeserializer_init_1465534056205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107309;
     Object term107627;

    public BuilderBasedDeserializer_init_1465534056205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107065 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsLongs$ByteArrayViewVarHandle");
        Object term107029 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term107183 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term107029, term107029.getClass(), "_valueClass", term107065);
        setField(term107029, term107029.getClass(), "_classAnnotations", null);
        setField(term107029, term107029.getClass(), "_beanType", null);
        setField(term107029, term107029.getClass(), "_valueInstantiator", null);
        setField(term107029, term107029.getClass(), "_beanProperties", null);
        setField(term107029, term107029.getClass(), "_backRefs", null);
        setField(term107029, term107029.getClass(), "_ignorableProps", null);
        setBooleanField(term107029, term107029.getClass(), "_ignoreAllUnknown", false);
        setField(term107029, term107029.getClass(), "_anySetter", null);
        setField(term107029, term107029.getClass(), "_injectables", null);
        setField(term107029, term107029.getClass(), "_objectIdReader", term107183);
        setField(term107029, term107029.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term107029, term107029.getClass(), "_nonStandardCreation", false);
        ArrayList term107497 = new ArrayList();
        term107309 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term107445 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term107309, term107309.getClass(), "_valueInstantiator", term107445);
        setField(term107309, term107309.getClass(), "_anySetter", null);
        setField(term107309, term107309.getClass(), "_injectables", term107497);
        setField(term107309, term107309.getClass(), "_objectIdReader", null);
        term107627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term107745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term107887 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term107627, term107627.getClass(), "_type", null);
        setField(term107745, term107745.getClass(), "_classAnnotations", null);
        setField(term107627, term107627.getClass(), "_classInfo", term107745);
        setField(term107627, term107627.getClass(), "_annotationIntrospector", term107887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term107309;
        args[1] = term107627;
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


