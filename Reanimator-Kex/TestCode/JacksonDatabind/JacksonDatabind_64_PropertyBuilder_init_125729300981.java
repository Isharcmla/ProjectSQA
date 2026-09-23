package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PropertyBuilder_init_125729300981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75509;
     Object term75851;

    public PropertyBuilder_init_125729300981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75167 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term75273 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term75403 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term75167, term75167.getClass(), "_config", term75273);
        setField(term75167, term75167.getClass(), "_beanDesc", term75403);
        setField(term75167, term75167.getClass(), "_defaultInclusion", null);
        setBooleanField(term75167, term75167.getClass(), "_useRealPropertyDefaults", false);
        term75509 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term75615 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term75721 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term75615, term75615.getClass(), "_overrides", null);
        setField(term75509, term75509.getClass(), "_configOverrides", term75615);
        setField(term75509, term75509.getClass(), "_serializationInclusion", term75721);
        setIntField(term75509, term75509.getClass(), "_mapperFeatures", -1);
        term75851 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term75995 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term76113 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term76217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term75851, term75851.getClass(), "_annotationIntrospector", term75995);
        setField(term75851, term75851.getClass(), "_classInfo", term76113);
        setField(term76217, term76217.getClass(), "_class", null);
        setField(term75851, term75851.getClass(), "_type", term76217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term75509;
        args[1] = term75851;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


