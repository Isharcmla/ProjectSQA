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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;

public class PropertyBuilder_init_125729300987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82437;
     Object term82779;
     Object term83064;
     Object term83071;
     Object term83073;

    public PropertyBuilder_init_125729300987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82331 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term82331, term82331.getClass(), "_config", null);
        setField(term82331, term82331.getClass(), "_beanDesc", null);
        term82437 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term82543 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term82649 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term82543, term82543.getClass(), "_overrides", null);
        setField(term82437, term82437.getClass(), "_configOverrides", term82543);
        setField(term82437, term82437.getClass(), "_serializationInclusion", term82649);
        term82779 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term82875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term82779, term82779.getClass(), "_annotationIntrospector", null);
        setField(term82875, term82875.getClass(), "_class", null);
        setField(term82779, term82779.getClass(), "_type", term82875);
        term83064 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term83065 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term83066 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term83067 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term83068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term83069 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term83070 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term83065, term83065.getClass(), "_filterProvider", null);
        setField(term83065, term83065.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term83065, term83065.getClass(), "_serFeatures", 0);
        setIntField(term83065, term83065.getClass(), "_generatorFeatures", 0);
        setIntField(term83065, term83065.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term83065, term83065.getClass(), "_formatWriteFeatures", 0);
        setIntField(term83065, term83065.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term83066, term83066.getClass(), "_valueInclusion", null);
        setField(term83066, term83066.getClass(), "_contentInclusion", null);
        setField(term83065, term83065.getClass(), "_serializationInclusion", term83066);
        setField(term83065, term83065.getClass(), "_mixIns", null);
        setField(term83065, term83065.getClass(), "_subtypeResolver", null);
        setField(term83065, term83065.getClass(), "_rootName", null);
        setField(term83065, term83065.getClass(), "_view", null);
        setField(term83065, term83065.getClass(), "_attributes", null);
        setField(term83065, term83065.getClass(), "_rootNames", null);
        setField(term83067, term83067.getClass(), "_overrides", null);
        setField(term83065, term83065.getClass(), "_configOverrides", term83067);
        setIntField(term83065, term83065.getClass(), "_mapperFeatures", 0);
        setField(term83065, term83065.getClass(), "_base", null);
        setField(term83064, term83064.getClass(), "_config", term83065);
        setField(term83068, term83068.getClass(), "_propCollector", null);
        setField(term83068, term83068.getClass(), "_config", null);
        setField(term83068, term83068.getClass(), "_annotationIntrospector", null);
        setField(term83068, term83068.getClass(), "_classInfo", null);
        setField(term83068, term83068.getClass(), "_properties", null);
        setField(term83068, term83068.getClass(), "_objectIdInfo", null);
        setField(term83069, term83069.getClass(), "_componentType", null);
        setField(term83069, term83069.getClass(), "_emptyArray", null);
        setField(term83069, term83069.getClass(), "_superClass", null);
        setField(term83069, term83069.getClass(), "_superInterfaces", null);
        setField(term83069, term83069.getClass(), "_bindings", null);
        setField(term83069, term83069.getClass(), "_canonicalName", null);
        setField(term83069, term83069.getClass(), "_class", null);
        setIntField(term83069, term83069.getClass(), "_hash", 0);
        setField(term83069, term83069.getClass(), "_valueHandler", null);
        setField(term83069, term83069.getClass(), "_typeHandler", null);
        setBooleanField(term83069, term83069.getClass(), "_asStatic", false);
        setField(term83068, term83068.getClass(), "_type", term83069);
        setField(term83064, term83064.getClass(), "_beanDesc", term83068);
        setField(term83064, term83064.getClass(), "_annotationIntrospector", term83070);
        setField(term83064, term83064.getClass(), "_defaultBean", null);
        setField(term83064, term83064.getClass(), "_defaultInclusion", term83066);
        setBooleanField(term83064, term83064.getClass(), "_useRealPropertyDefaults", false);
        term83071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term83072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term83071, term83071.getClass(), "_propCollector", null);
        setField(term83071, term83071.getClass(), "_config", null);
        setField(term83071, term83071.getClass(), "_annotationIntrospector", null);
        setField(term83071, term83071.getClass(), "_classInfo", null);
        setField(term83071, term83071.getClass(), "_properties", null);
        setField(term83071, term83071.getClass(), "_objectIdInfo", null);
        setField(term83072, term83072.getClass(), "_componentType", null);
        setField(term83072, term83072.getClass(), "_emptyArray", null);
        setField(term83072, term83072.getClass(), "_superClass", null);
        setField(term83072, term83072.getClass(), "_superInterfaces", null);
        setField(term83072, term83072.getClass(), "_bindings", null);
        setField(term83072, term83072.getClass(), "_canonicalName", null);
        setField(term83072, term83072.getClass(), "_class", null);
        setIntField(term83072, term83072.getClass(), "_hash", 0);
        setField(term83072, term83072.getClass(), "_valueHandler", null);
        setField(term83072, term83072.getClass(), "_typeHandler", null);
        setBooleanField(term83072, term83072.getClass(), "_asStatic", false);
        setField(term83071, term83071.getClass(), "_type", term83072);
        term83073 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term83074 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term83075 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term83073, term83073.getClass(), "_filterProvider", null);
        setField(term83073, term83073.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term83073, term83073.getClass(), "_serFeatures", 0);
        setIntField(term83073, term83073.getClass(), "_generatorFeatures", 0);
        setIntField(term83073, term83073.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term83073, term83073.getClass(), "_formatWriteFeatures", 0);
        setIntField(term83073, term83073.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term83074, term83074.getClass(), "_valueInclusion", null);
        setField(term83074, term83074.getClass(), "_contentInclusion", null);
        setField(term83073, term83073.getClass(), "_serializationInclusion", term83074);
        setField(term83073, term83073.getClass(), "_mixIns", null);
        setField(term83073, term83073.getClass(), "_subtypeResolver", null);
        setField(term83073, term83073.getClass(), "_rootName", null);
        setField(term83073, term83073.getClass(), "_view", null);
        setField(term83073, term83073.getClass(), "_attributes", null);
        setField(term83073, term83073.getClass(), "_rootNames", null);
        setField(term83075, term83075.getClass(), "_overrides", null);
        setField(term83073, term83073.getClass(), "_configOverrides", term83075);
        setIntField(term83073, term83073.getClass(), "_mapperFeatures", 0);
        setField(term83073, term83073.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term82437;
        args[1] = term82779;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83064));
        assertTrue(recursiveEquals(term82437, term83071));
        assertTrue(recursiveEquals(term82779, term83073));
    }

};


