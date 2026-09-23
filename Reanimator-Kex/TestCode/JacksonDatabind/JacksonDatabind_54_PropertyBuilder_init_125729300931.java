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

public class PropertyBuilder_init_125729300931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16398;
     Object term16634;
     Object term16805;
     Object term16811;
     Object term16813;

    public PropertyBuilder_init_125729300931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16186 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term16292 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term16186, term16186.getClass(), "_config", term16292);
        setField(term16186, term16186.getClass(), "_beanDesc", null);
        term16398 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term16504 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term16398, term16398.getClass(), "_configOverrides", term16504);
        term16634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term16748 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term16748, term16748.getClass(), "_class", null);
        setField(term16634, term16634.getClass(), "_type", term16748);
        term16805 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term16806 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term16807 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term16808 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term16809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term16810 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term16806, term16806.getClass(), "_filterProvider", null);
        setField(term16806, term16806.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term16806, term16806.getClass(), "_serFeatures", 0);
        setIntField(term16806, term16806.getClass(), "_generatorFeatures", 0);
        setIntField(term16806, term16806.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term16806, term16806.getClass(), "_formatWriteFeatures", 0);
        setIntField(term16806, term16806.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term16806, term16806.getClass(), "_serializationInclusion", null);
        setField(term16806, term16806.getClass(), "_mixIns", null);
        setField(term16806, term16806.getClass(), "_subtypeResolver", null);
        setField(term16806, term16806.getClass(), "_rootName", null);
        setField(term16806, term16806.getClass(), "_view", null);
        setField(term16806, term16806.getClass(), "_attributes", null);
        setField(term16806, term16806.getClass(), "_rootNames", null);
        setField(term16807, term16807.getClass(), "_overrides", null);
        setField(term16806, term16806.getClass(), "_configOverrides", term16807);
        setIntField(term16806, term16806.getClass(), "_mapperFeatures", 0);
        setField(term16806, term16806.getClass(), "_base", null);
        setField(term16805, term16805.getClass(), "_config", term16806);
        setField(term16808, term16808.getClass(), "_propCollector", null);
        setField(term16808, term16808.getClass(), "_config", null);
        setField(term16808, term16808.getClass(), "_annotationIntrospector", null);
        setField(term16808, term16808.getClass(), "_classInfo", null);
        setField(term16808, term16808.getClass(), "_properties", null);
        setField(term16808, term16808.getClass(), "_objectIdInfo", null);
        setField(term16809, term16809.getClass(), "_elementType", null);
        setField(term16809, term16809.getClass(), "_superClass", null);
        setField(term16809, term16809.getClass(), "_superInterfaces", null);
        setField(term16809, term16809.getClass(), "_bindings", null);
        setField(term16809, term16809.getClass(), "_canonicalName", null);
        setField(term16809, term16809.getClass(), "_class", null);
        setIntField(term16809, term16809.getClass(), "_hash", 0);
        setField(term16809, term16809.getClass(), "_valueHandler", null);
        setField(term16809, term16809.getClass(), "_typeHandler", null);
        setBooleanField(term16809, term16809.getClass(), "_asStatic", false);
        setField(term16808, term16808.getClass(), "_type", term16809);
        setField(term16805, term16805.getClass(), "_beanDesc", term16808);
        setField(term16805, term16805.getClass(), "_defaultInclusion", null);
        setField(term16805, term16805.getClass(), "_annotationIntrospector", term16810);
        setField(term16805, term16805.getClass(), "_defaultBean", null);
        term16811 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term16812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term16811, term16811.getClass(), "_propCollector", null);
        setField(term16811, term16811.getClass(), "_config", null);
        setField(term16811, term16811.getClass(), "_annotationIntrospector", null);
        setField(term16811, term16811.getClass(), "_classInfo", null);
        setField(term16811, term16811.getClass(), "_properties", null);
        setField(term16811, term16811.getClass(), "_objectIdInfo", null);
        setField(term16812, term16812.getClass(), "_elementType", null);
        setField(term16812, term16812.getClass(), "_superClass", null);
        setField(term16812, term16812.getClass(), "_superInterfaces", null);
        setField(term16812, term16812.getClass(), "_bindings", null);
        setField(term16812, term16812.getClass(), "_canonicalName", null);
        setField(term16812, term16812.getClass(), "_class", null);
        setIntField(term16812, term16812.getClass(), "_hash", 0);
        setField(term16812, term16812.getClass(), "_valueHandler", null);
        setField(term16812, term16812.getClass(), "_typeHandler", null);
        setBooleanField(term16812, term16812.getClass(), "_asStatic", false);
        setField(term16811, term16811.getClass(), "_type", term16812);
        term16813 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term16814 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term16813, term16813.getClass(), "_filterProvider", null);
        setField(term16813, term16813.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term16813, term16813.getClass(), "_serFeatures", 0);
        setIntField(term16813, term16813.getClass(), "_generatorFeatures", 0);
        setIntField(term16813, term16813.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term16813, term16813.getClass(), "_formatWriteFeatures", 0);
        setIntField(term16813, term16813.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term16813, term16813.getClass(), "_serializationInclusion", null);
        setField(term16813, term16813.getClass(), "_mixIns", null);
        setField(term16813, term16813.getClass(), "_subtypeResolver", null);
        setField(term16813, term16813.getClass(), "_rootName", null);
        setField(term16813, term16813.getClass(), "_view", null);
        setField(term16813, term16813.getClass(), "_attributes", null);
        setField(term16813, term16813.getClass(), "_rootNames", null);
        setField(term16814, term16814.getClass(), "_overrides", null);
        setField(term16813, term16813.getClass(), "_configOverrides", term16814);
        setIntField(term16813, term16813.getClass(), "_mapperFeatures", 0);
        setField(term16813, term16813.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term16398;
        args[1] = term16634;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16805));
        assertTrue(recursiveEquals(term16398, term16811));
        assertTrue(recursiveEquals(term16634, term16813));
    }

};


