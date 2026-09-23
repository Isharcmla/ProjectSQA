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
import java.lang.String;

public class PropertyBuilder_init_125729300977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69275;
     Object term69511;
     Object term69823;
     Object term69833;
     Object term69835;

    public PropertyBuilder_init_125729300977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69063 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term69169 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term69063, term69063.getClass(), "_config", term69169);
        setField(term69063, term69063.getClass(), "_beanDesc", null);
        term69275 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term69381 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term69275, term69275.getClass(), "_configOverrides", term69381);
        term69511 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term69607 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term69511, term69511.getClass(), "_annotationIntrospector", null);
        setField(term69607, term69607.getClass(), "_class", null);
        setField(term69511, term69511.getClass(), "_type", term69607);
        Class<? extends Object> term69838 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term69837 = ((Class) term69838).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term69837).setAccessible(true);
        Object enum9 = ((Field) term69837).get((Object) null);
        term69823 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term69824 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term69825 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term69826 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term69827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term69828 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term69829 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term69824, term69824.getClass(), "_filterProvider", null);
        setField(term69824, term69824.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term69824, term69824.getClass(), "_serFeatures", 0);
        setIntField(term69824, term69824.getClass(), "_generatorFeatures", 0);
        setIntField(term69824, term69824.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term69824, term69824.getClass(), "_formatWriteFeatures", 0);
        setIntField(term69824, term69824.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term69824, term69824.getClass(), "_serializationInclusion", null);
        setField(term69824, term69824.getClass(), "_mixIns", null);
        setField(term69824, term69824.getClass(), "_subtypeResolver", null);
        setField(term69824, term69824.getClass(), "_rootName", null);
        setField(term69824, term69824.getClass(), "_view", null);
        setField(term69824, term69824.getClass(), "_attributes", null);
        setField(term69824, term69824.getClass(), "_rootNames", null);
        setField(term69825, term69825.getClass(), "_overrides", null);
        setField(term69824, term69824.getClass(), "_configOverrides", term69825);
        setIntField(term69824, term69824.getClass(), "_mapperFeatures", 0);
        setField(term69824, term69824.getClass(), "_base", null);
        setField(term69823, term69823.getClass(), "_config", term69824);
        setField(term69826, term69826.getClass(), "_propCollector", null);
        setField(term69826, term69826.getClass(), "_config", null);
        setField(term69826, term69826.getClass(), "_annotationIntrospector", null);
        setField(term69826, term69826.getClass(), "_classInfo", null);
        setField(term69826, term69826.getClass(), "_properties", null);
        setField(term69826, term69826.getClass(), "_objectIdInfo", null);
        setField(term69827, term69827.getClass(), "_componentType", null);
        setField(term69827, term69827.getClass(), "_emptyArray", null);
        setField(term69827, term69827.getClass(), "_superClass", null);
        setField(term69827, term69827.getClass(), "_superInterfaces", null);
        setField(term69827, term69827.getClass(), "_bindings", null);
        setField(term69827, term69827.getClass(), "_canonicalName", null);
        setField(term69827, term69827.getClass(), "_class", null);
        setIntField(term69827, term69827.getClass(), "_hash", 0);
        setField(term69827, term69827.getClass(), "_valueHandler", null);
        setField(term69827, term69827.getClass(), "_typeHandler", null);
        setBooleanField(term69827, term69827.getClass(), "_asStatic", false);
        setField(term69826, term69826.getClass(), "_type", term69827);
        setField(term69823, term69823.getClass(), "_beanDesc", term69826);
        setField(term69823, term69823.getClass(), "_annotationIntrospector", term69828);
        setField(term69823, term69823.getClass(), "_defaultBean", null);
        setField(term69829, term69829.getClass(), "_valueInclusion", enum9);
        setField(term69829, term69829.getClass(), "_contentInclusion", enum9);
        setField(term69823, term69823.getClass(), "_defaultInclusion", term69829);
        setBooleanField(term69823, term69823.getClass(), "_useRealPropertyDefaults", false);
        term69833 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term69834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term69833, term69833.getClass(), "_propCollector", null);
        setField(term69833, term69833.getClass(), "_config", null);
        setField(term69833, term69833.getClass(), "_annotationIntrospector", null);
        setField(term69833, term69833.getClass(), "_classInfo", null);
        setField(term69833, term69833.getClass(), "_properties", null);
        setField(term69833, term69833.getClass(), "_objectIdInfo", null);
        setField(term69834, term69834.getClass(), "_componentType", null);
        setField(term69834, term69834.getClass(), "_emptyArray", null);
        setField(term69834, term69834.getClass(), "_superClass", null);
        setField(term69834, term69834.getClass(), "_superInterfaces", null);
        setField(term69834, term69834.getClass(), "_bindings", null);
        setField(term69834, term69834.getClass(), "_canonicalName", null);
        setField(term69834, term69834.getClass(), "_class", null);
        setIntField(term69834, term69834.getClass(), "_hash", 0);
        setField(term69834, term69834.getClass(), "_valueHandler", null);
        setField(term69834, term69834.getClass(), "_typeHandler", null);
        setBooleanField(term69834, term69834.getClass(), "_asStatic", false);
        setField(term69833, term69833.getClass(), "_type", term69834);
        term69835 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term69836 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term69835, term69835.getClass(), "_filterProvider", null);
        setField(term69835, term69835.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term69835, term69835.getClass(), "_serFeatures", 0);
        setIntField(term69835, term69835.getClass(), "_generatorFeatures", 0);
        setIntField(term69835, term69835.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term69835, term69835.getClass(), "_formatWriteFeatures", 0);
        setIntField(term69835, term69835.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term69835, term69835.getClass(), "_serializationInclusion", null);
        setField(term69835, term69835.getClass(), "_mixIns", null);
        setField(term69835, term69835.getClass(), "_subtypeResolver", null);
        setField(term69835, term69835.getClass(), "_rootName", null);
        setField(term69835, term69835.getClass(), "_view", null);
        setField(term69835, term69835.getClass(), "_attributes", null);
        setField(term69835, term69835.getClass(), "_rootNames", null);
        setField(term69836, term69836.getClass(), "_overrides", null);
        setField(term69835, term69835.getClass(), "_configOverrides", term69836);
        setIntField(term69835, term69835.getClass(), "_mapperFeatures", 0);
        setField(term69835, term69835.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term69275;
        args[1] = term69511;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69823));
        assertTrue(recursiveEquals(term69275, term69833));
        assertTrue(recursiveEquals(term69511, term69835));
    }

};


