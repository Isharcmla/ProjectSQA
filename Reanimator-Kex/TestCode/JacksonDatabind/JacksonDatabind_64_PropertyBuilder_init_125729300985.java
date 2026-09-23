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
import java.util.HashMap;
import java.lang.String;

public class PropertyBuilder_init_125729300985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80304;
     Object term80588;
     Object term81124;
     Object term81136;
     Object term81139;

    public PropertyBuilder_init_125729300985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80068 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term80198 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term80068, term80068.getClass(), "_config", null);
        setField(term80068, term80068.getClass(), "_beanDesc", term80198);
        HashMap term80458 = new HashMap();
        term80304 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term80410 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term80410, term80410.getClass(), "_overrides", term80458);
        setField(term80304, term80304.getClass(), "_configOverrides", term80410);
        term80588 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term80732 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term80836 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term80588, term80588.getClass(), "_annotationIntrospector", term80732);
        setField(term80588, term80588.getClass(), "_classInfo", null);
        setField(term80836, term80836.getClass(), "_class", null);
        setField(term80588, term80588.getClass(), "_type", term80836);
        HashMap term81127 = new HashMap();
        Class<? extends Object> term81143 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term81142 = ((Class) term81143).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term81142).setAccessible(true);
        Object enum11 = ((Field) term81142).get((Object) null);
        term81124 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term81125 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term81126 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term81128 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term81129 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term81130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term81131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term81132 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term81125, term81125.getClass(), "_filterProvider", null);
        setField(term81125, term81125.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term81125, term81125.getClass(), "_serFeatures", 0);
        setIntField(term81125, term81125.getClass(), "_generatorFeatures", 0);
        setIntField(term81125, term81125.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term81125, term81125.getClass(), "_formatWriteFeatures", 0);
        setIntField(term81125, term81125.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term81125, term81125.getClass(), "_serializationInclusion", null);
        setField(term81125, term81125.getClass(), "_mixIns", null);
        setField(term81125, term81125.getClass(), "_subtypeResolver", null);
        setField(term81125, term81125.getClass(), "_rootName", null);
        setField(term81125, term81125.getClass(), "_view", null);
        setField(term81125, term81125.getClass(), "_attributes", null);
        setField(term81125, term81125.getClass(), "_rootNames", null);
        setField(term81126, term81126.getClass(), "_overrides", term81127);
        setField(term81125, term81125.getClass(), "_configOverrides", term81126);
        setIntField(term81125, term81125.getClass(), "_mapperFeatures", 0);
        setField(term81125, term81125.getClass(), "_base", null);
        setField(term81124, term81124.getClass(), "_config", term81125);
        setField(term81128, term81128.getClass(), "_propCollector", null);
        setField(term81128, term81128.getClass(), "_config", null);
        setField(term81128, term81128.getClass(), "_annotationIntrospector", term81129);
        setField(term81128, term81128.getClass(), "_classInfo", null);
        setField(term81128, term81128.getClass(), "_properties", null);
        setField(term81128, term81128.getClass(), "_objectIdInfo", null);
        setField(term81130, term81130.getClass(), "_referencedType", null);
        setField(term81130, term81130.getClass(), "_anchorType", null);
        setField(term81130, term81130.getClass(), "_superClass", null);
        setField(term81130, term81130.getClass(), "_superInterfaces", null);
        setField(term81130, term81130.getClass(), "_bindings", null);
        setField(term81130, term81130.getClass(), "_canonicalName", null);
        setField(term81130, term81130.getClass(), "_class", null);
        setIntField(term81130, term81130.getClass(), "_hash", 0);
        setField(term81130, term81130.getClass(), "_valueHandler", null);
        setField(term81130, term81130.getClass(), "_typeHandler", null);
        setBooleanField(term81130, term81130.getClass(), "_asStatic", false);
        setField(term81128, term81128.getClass(), "_type", term81130);
        setField(term81124, term81124.getClass(), "_beanDesc", term81128);
        setField(term81124, term81124.getClass(), "_annotationIntrospector", term81131);
        setField(term81124, term81124.getClass(), "_defaultBean", null);
        setField(term81132, term81132.getClass(), "_valueInclusion", enum11);
        setField(term81132, term81132.getClass(), "_contentInclusion", enum11);
        setField(term81124, term81124.getClass(), "_defaultInclusion", term81132);
        setBooleanField(term81124, term81124.getClass(), "_useRealPropertyDefaults", false);
        term81136 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term81137 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term81138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term81136, term81136.getClass(), "_propCollector", null);
        setField(term81136, term81136.getClass(), "_config", null);
        setField(term81136, term81136.getClass(), "_annotationIntrospector", term81137);
        setField(term81136, term81136.getClass(), "_classInfo", null);
        setField(term81136, term81136.getClass(), "_properties", null);
        setField(term81136, term81136.getClass(), "_objectIdInfo", null);
        setField(term81138, term81138.getClass(), "_referencedType", null);
        setField(term81138, term81138.getClass(), "_anchorType", null);
        setField(term81138, term81138.getClass(), "_superClass", null);
        setField(term81138, term81138.getClass(), "_superInterfaces", null);
        setField(term81138, term81138.getClass(), "_bindings", null);
        setField(term81138, term81138.getClass(), "_canonicalName", null);
        setField(term81138, term81138.getClass(), "_class", null);
        setIntField(term81138, term81138.getClass(), "_hash", 0);
        setField(term81138, term81138.getClass(), "_valueHandler", null);
        setField(term81138, term81138.getClass(), "_typeHandler", null);
        setBooleanField(term81138, term81138.getClass(), "_asStatic", false);
        setField(term81136, term81136.getClass(), "_type", term81138);
        HashMap term81141 = new HashMap();
        term81139 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term81140 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term81139, term81139.getClass(), "_filterProvider", null);
        setField(term81139, term81139.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term81139, term81139.getClass(), "_serFeatures", 0);
        setIntField(term81139, term81139.getClass(), "_generatorFeatures", 0);
        setIntField(term81139, term81139.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term81139, term81139.getClass(), "_formatWriteFeatures", 0);
        setIntField(term81139, term81139.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term81139, term81139.getClass(), "_serializationInclusion", null);
        setField(term81139, term81139.getClass(), "_mixIns", null);
        setField(term81139, term81139.getClass(), "_subtypeResolver", null);
        setField(term81139, term81139.getClass(), "_rootName", null);
        setField(term81139, term81139.getClass(), "_view", null);
        setField(term81139, term81139.getClass(), "_attributes", null);
        setField(term81139, term81139.getClass(), "_rootNames", null);
        setField(term81140, term81140.getClass(), "_overrides", term81141);
        setField(term81139, term81139.getClass(), "_configOverrides", term81140);
        setIntField(term81139, term81139.getClass(), "_mapperFeatures", 0);
        setField(term81139, term81139.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term80304;
        args[1] = term80588;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term81124));
        assertTrue(recursiveEquals(term80304, term81136));
        assertTrue(recursiveEquals(term80588, term81139));
    }

};


