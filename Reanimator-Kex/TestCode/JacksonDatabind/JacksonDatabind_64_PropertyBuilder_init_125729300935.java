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

public class PropertyBuilder_init_125729300935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20240;
     Object term20476;
     Object term20812;
     Object term20822;
     Object term20824;

    public PropertyBuilder_init_125729300935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20028 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term20134 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term20028, term20028.getClass(), "_config", term20134);
        setField(term20028, term20028.getClass(), "_beanDesc", null);
        term20240 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term20346 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term20240, term20240.getClass(), "_configOverrides", term20346);
        term20476 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term20596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term20476, term20476.getClass(), "_annotationIntrospector", null);
        setField(term20596, term20596.getClass(), "_class", null);
        setField(term20476, term20476.getClass(), "_type", term20596);
        Class<? extends Object> term20827 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term20826 = ((Class) term20827).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term20826).setAccessible(true);
        Object enum1 = ((Field) term20826).get((Object) null);
        term20812 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term20813 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term20814 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term20815 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term20816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term20817 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term20818 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term20813, term20813.getClass(), "_filterProvider", null);
        setField(term20813, term20813.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term20813, term20813.getClass(), "_serFeatures", 0);
        setIntField(term20813, term20813.getClass(), "_generatorFeatures", 0);
        setIntField(term20813, term20813.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term20813, term20813.getClass(), "_formatWriteFeatures", 0);
        setIntField(term20813, term20813.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term20813, term20813.getClass(), "_serializationInclusion", null);
        setField(term20813, term20813.getClass(), "_mixIns", null);
        setField(term20813, term20813.getClass(), "_subtypeResolver", null);
        setField(term20813, term20813.getClass(), "_rootName", null);
        setField(term20813, term20813.getClass(), "_view", null);
        setField(term20813, term20813.getClass(), "_attributes", null);
        setField(term20813, term20813.getClass(), "_rootNames", null);
        setField(term20814, term20814.getClass(), "_overrides", null);
        setField(term20813, term20813.getClass(), "_configOverrides", term20814);
        setIntField(term20813, term20813.getClass(), "_mapperFeatures", 0);
        setField(term20813, term20813.getClass(), "_base", null);
        setField(term20812, term20812.getClass(), "_config", term20813);
        setField(term20815, term20815.getClass(), "_propCollector", null);
        setField(term20815, term20815.getClass(), "_config", null);
        setField(term20815, term20815.getClass(), "_annotationIntrospector", null);
        setField(term20815, term20815.getClass(), "_classInfo", null);
        setField(term20815, term20815.getClass(), "_properties", null);
        setField(term20815, term20815.getClass(), "_objectIdInfo", null);
        setField(term20816, term20816.getClass(), "_referencedType", null);
        setField(term20816, term20816.getClass(), "_superClass", null);
        setField(term20816, term20816.getClass(), "_superInterfaces", null);
        setField(term20816, term20816.getClass(), "_bindings", null);
        setField(term20816, term20816.getClass(), "_canonicalName", null);
        setField(term20816, term20816.getClass(), "_class", null);
        setIntField(term20816, term20816.getClass(), "_hash", 0);
        setField(term20816, term20816.getClass(), "_valueHandler", null);
        setField(term20816, term20816.getClass(), "_typeHandler", null);
        setBooleanField(term20816, term20816.getClass(), "_asStatic", false);
        setField(term20815, term20815.getClass(), "_type", term20816);
        setField(term20812, term20812.getClass(), "_beanDesc", term20815);
        setField(term20812, term20812.getClass(), "_annotationIntrospector", term20817);
        setField(term20812, term20812.getClass(), "_defaultBean", null);
        setField(term20818, term20818.getClass(), "_valueInclusion", enum1);
        setField(term20818, term20818.getClass(), "_contentInclusion", enum1);
        setField(term20812, term20812.getClass(), "_defaultInclusion", term20818);
        setBooleanField(term20812, term20812.getClass(), "_useRealPropertyDefaults", false);
        term20822 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term20823 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term20822, term20822.getClass(), "_propCollector", null);
        setField(term20822, term20822.getClass(), "_config", null);
        setField(term20822, term20822.getClass(), "_annotationIntrospector", null);
        setField(term20822, term20822.getClass(), "_classInfo", null);
        setField(term20822, term20822.getClass(), "_properties", null);
        setField(term20822, term20822.getClass(), "_objectIdInfo", null);
        setField(term20823, term20823.getClass(), "_referencedType", null);
        setField(term20823, term20823.getClass(), "_superClass", null);
        setField(term20823, term20823.getClass(), "_superInterfaces", null);
        setField(term20823, term20823.getClass(), "_bindings", null);
        setField(term20823, term20823.getClass(), "_canonicalName", null);
        setField(term20823, term20823.getClass(), "_class", null);
        setIntField(term20823, term20823.getClass(), "_hash", 0);
        setField(term20823, term20823.getClass(), "_valueHandler", null);
        setField(term20823, term20823.getClass(), "_typeHandler", null);
        setBooleanField(term20823, term20823.getClass(), "_asStatic", false);
        setField(term20822, term20822.getClass(), "_type", term20823);
        term20824 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term20825 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term20824, term20824.getClass(), "_filterProvider", null);
        setField(term20824, term20824.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term20824, term20824.getClass(), "_serFeatures", 0);
        setIntField(term20824, term20824.getClass(), "_generatorFeatures", 0);
        setIntField(term20824, term20824.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term20824, term20824.getClass(), "_formatWriteFeatures", 0);
        setIntField(term20824, term20824.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term20824, term20824.getClass(), "_serializationInclusion", null);
        setField(term20824, term20824.getClass(), "_mixIns", null);
        setField(term20824, term20824.getClass(), "_subtypeResolver", null);
        setField(term20824, term20824.getClass(), "_rootName", null);
        setField(term20824, term20824.getClass(), "_view", null);
        setField(term20824, term20824.getClass(), "_attributes", null);
        setField(term20824, term20824.getClass(), "_rootNames", null);
        setField(term20825, term20825.getClass(), "_overrides", null);
        setField(term20824, term20824.getClass(), "_configOverrides", term20825);
        setIntField(term20824, term20824.getClass(), "_mapperFeatures", 0);
        setField(term20824, term20824.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term20240;
        args[1] = term20476;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20812));
        assertTrue(recursiveEquals(term20240, term20822));
        assertTrue(recursiveEquals(term20476, term20824));
    }

};


