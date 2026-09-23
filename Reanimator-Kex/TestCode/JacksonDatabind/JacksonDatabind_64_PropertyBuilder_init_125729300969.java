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

public class PropertyBuilder_init_125729300969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60468;
     Object term60804;
     Object term61140;
     Object term61150;
     Object term61152;

    public PropertyBuilder_init_125729300969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60150 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term60256 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term60362 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term60150, term60150.getClass(), "_config", term60256);
        setField(term60150, term60150.getClass(), "_beanDesc", null);
        setField(term60150, term60150.getClass(), "_defaultInclusion", term60362);
        setBooleanField(term60150, term60150.getClass(), "_useRealPropertyDefaults", false);
        term60468 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term60574 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term60674 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term60574, term60574.getClass(), "_overrides", null);
        setField(term60468, term60468.getClass(), "_configOverrides", term60574);
        setField(term60468, term60468.getClass(), "_serializationInclusion", null);
        setIntField(term60468, term60468.getClass(), "_mapperFeatures", -1);
        setField(term60468, term60468.getClass(), "_base", term60674);
        term60804 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term60924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term60804, term60804.getClass(), "_annotationIntrospector", null);
        setField(term60924, term60924.getClass(), "_class", null);
        setField(term60804, term60804.getClass(), "_type", term60924);
        Class<? extends Object> term61156 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term61155 = ((Class) term61156).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term61155).setAccessible(true);
        Object enum7 = ((Field) term61155).get((Object) null);
        term61140 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term61141 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term61142 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term61143 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term61144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term61145 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term61146 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term61141, term61141.getClass(), "_filterProvider", null);
        setField(term61141, term61141.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term61141, term61141.getClass(), "_serFeatures", 0);
        setIntField(term61141, term61141.getClass(), "_generatorFeatures", 0);
        setIntField(term61141, term61141.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term61141, term61141.getClass(), "_formatWriteFeatures", 0);
        setIntField(term61141, term61141.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term61141, term61141.getClass(), "_serializationInclusion", null);
        setField(term61141, term61141.getClass(), "_mixIns", null);
        setField(term61141, term61141.getClass(), "_subtypeResolver", null);
        setField(term61141, term61141.getClass(), "_rootName", null);
        setField(term61141, term61141.getClass(), "_view", null);
        setField(term61141, term61141.getClass(), "_attributes", null);
        setField(term61141, term61141.getClass(), "_rootNames", null);
        setField(term61142, term61142.getClass(), "_overrides", null);
        setField(term61141, term61141.getClass(), "_configOverrides", term61142);
        setIntField(term61141, term61141.getClass(), "_mapperFeatures", -1);
        setField(term61143, term61143.getClass(), "_classIntrospector", null);
        setField(term61143, term61143.getClass(), "_annotationIntrospector", null);
        setField(term61143, term61143.getClass(), "_visibilityChecker", null);
        setField(term61143, term61143.getClass(), "_propertyNamingStrategy", null);
        setField(term61143, term61143.getClass(), "_typeFactory", null);
        setField(term61143, term61143.getClass(), "_typeResolverBuilder", null);
        setField(term61143, term61143.getClass(), "_dateFormat", null);
        setField(term61143, term61143.getClass(), "_handlerInstantiator", null);
        setField(term61143, term61143.getClass(), "_locale", null);
        setField(term61143, term61143.getClass(), "_timeZone", null);
        setField(term61143, term61143.getClass(), "_defaultBase64", null);
        setField(term61141, term61141.getClass(), "_base", term61143);
        setField(term61140, term61140.getClass(), "_config", term61141);
        setField(term61144, term61144.getClass(), "_propCollector", null);
        setField(term61144, term61144.getClass(), "_config", null);
        setField(term61144, term61144.getClass(), "_annotationIntrospector", null);
        setField(term61144, term61144.getClass(), "_classInfo", null);
        setField(term61144, term61144.getClass(), "_properties", null);
        setField(term61144, term61144.getClass(), "_objectIdInfo", null);
        setField(term61145, term61145.getClass(), "_referencedType", null);
        setField(term61145, term61145.getClass(), "_superClass", null);
        setField(term61145, term61145.getClass(), "_superInterfaces", null);
        setField(term61145, term61145.getClass(), "_bindings", null);
        setField(term61145, term61145.getClass(), "_canonicalName", null);
        setField(term61145, term61145.getClass(), "_class", null);
        setIntField(term61145, term61145.getClass(), "_hash", 0);
        setField(term61145, term61145.getClass(), "_valueHandler", null);
        setField(term61145, term61145.getClass(), "_typeHandler", null);
        setBooleanField(term61145, term61145.getClass(), "_asStatic", false);
        setField(term61144, term61144.getClass(), "_type", term61145);
        setField(term61140, term61140.getClass(), "_beanDesc", term61144);
        setField(term61140, term61140.getClass(), "_annotationIntrospector", null);
        setField(term61140, term61140.getClass(), "_defaultBean", null);
        setField(term61146, term61146.getClass(), "_valueInclusion", enum7);
        setField(term61146, term61146.getClass(), "_contentInclusion", enum7);
        setField(term61140, term61140.getClass(), "_defaultInclusion", term61146);
        setBooleanField(term61140, term61140.getClass(), "_useRealPropertyDefaults", false);
        term61150 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term61151 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term61150, term61150.getClass(), "_propCollector", null);
        setField(term61150, term61150.getClass(), "_config", null);
        setField(term61150, term61150.getClass(), "_annotationIntrospector", null);
        setField(term61150, term61150.getClass(), "_classInfo", null);
        setField(term61150, term61150.getClass(), "_properties", null);
        setField(term61150, term61150.getClass(), "_objectIdInfo", null);
        setField(term61151, term61151.getClass(), "_referencedType", null);
        setField(term61151, term61151.getClass(), "_superClass", null);
        setField(term61151, term61151.getClass(), "_superInterfaces", null);
        setField(term61151, term61151.getClass(), "_bindings", null);
        setField(term61151, term61151.getClass(), "_canonicalName", null);
        setField(term61151, term61151.getClass(), "_class", null);
        setIntField(term61151, term61151.getClass(), "_hash", 0);
        setField(term61151, term61151.getClass(), "_valueHandler", null);
        setField(term61151, term61151.getClass(), "_typeHandler", null);
        setBooleanField(term61151, term61151.getClass(), "_asStatic", false);
        setField(term61150, term61150.getClass(), "_type", term61151);
        term61152 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term61153 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term61154 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term61152, term61152.getClass(), "_filterProvider", null);
        setField(term61152, term61152.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term61152, term61152.getClass(), "_serFeatures", 0);
        setIntField(term61152, term61152.getClass(), "_generatorFeatures", 0);
        setIntField(term61152, term61152.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term61152, term61152.getClass(), "_formatWriteFeatures", 0);
        setIntField(term61152, term61152.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term61152, term61152.getClass(), "_serializationInclusion", null);
        setField(term61152, term61152.getClass(), "_mixIns", null);
        setField(term61152, term61152.getClass(), "_subtypeResolver", null);
        setField(term61152, term61152.getClass(), "_rootName", null);
        setField(term61152, term61152.getClass(), "_view", null);
        setField(term61152, term61152.getClass(), "_attributes", null);
        setField(term61152, term61152.getClass(), "_rootNames", null);
        setField(term61153, term61153.getClass(), "_overrides", null);
        setField(term61152, term61152.getClass(), "_configOverrides", term61153);
        setIntField(term61152, term61152.getClass(), "_mapperFeatures", -1);
        setField(term61154, term61154.getClass(), "_classIntrospector", null);
        setField(term61154, term61154.getClass(), "_annotationIntrospector", null);
        setField(term61154, term61154.getClass(), "_visibilityChecker", null);
        setField(term61154, term61154.getClass(), "_propertyNamingStrategy", null);
        setField(term61154, term61154.getClass(), "_typeFactory", null);
        setField(term61154, term61154.getClass(), "_typeResolverBuilder", null);
        setField(term61154, term61154.getClass(), "_dateFormat", null);
        setField(term61154, term61154.getClass(), "_handlerInstantiator", null);
        setField(term61154, term61154.getClass(), "_locale", null);
        setField(term61154, term61154.getClass(), "_timeZone", null);
        setField(term61154, term61154.getClass(), "_defaultBase64", null);
        setField(term61152, term61152.getClass(), "_base", term61154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term60468;
        args[1] = term60804;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term61140));
        assertTrue(recursiveEquals(term60468, term61150));
        assertTrue(recursiveEquals(term60804, term61152));
    }

};


