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

public class PropertyBuilder_init_125729300941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27872;
     Object term28214;
     Object term28523;
     Object term28530;
     Object term28532;

    public PropertyBuilder_init_125729300941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27660 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term27766 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term27660, term27660.getClass(), "_config", term27766);
        setField(term27660, term27660.getClass(), "_beanDesc", null);
        term27872 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term27978 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term28084 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term27978, term27978.getClass(), "_overrides", null);
        setField(term27872, term27872.getClass(), "_configOverrides", term27978);
        setField(term27872, term27872.getClass(), "_serializationInclusion", term28084);
        term28214 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term28334 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term28214, term28214.getClass(), "_annotationIntrospector", null);
        setField(term28334, term28334.getClass(), "_class", null);
        setField(term28214, term28214.getClass(), "_type", term28334);
        term28523 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term28524 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term28525 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term28526 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term28527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term28528 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term28529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term28524, term28524.getClass(), "_filterProvider", null);
        setField(term28524, term28524.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term28524, term28524.getClass(), "_serFeatures", 0);
        setIntField(term28524, term28524.getClass(), "_generatorFeatures", 0);
        setIntField(term28524, term28524.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term28524, term28524.getClass(), "_formatWriteFeatures", 0);
        setIntField(term28524, term28524.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term28525, term28525.getClass(), "_valueInclusion", null);
        setField(term28525, term28525.getClass(), "_contentInclusion", null);
        setField(term28524, term28524.getClass(), "_serializationInclusion", term28525);
        setField(term28524, term28524.getClass(), "_mixIns", null);
        setField(term28524, term28524.getClass(), "_subtypeResolver", null);
        setField(term28524, term28524.getClass(), "_rootName", null);
        setField(term28524, term28524.getClass(), "_view", null);
        setField(term28524, term28524.getClass(), "_attributes", null);
        setField(term28524, term28524.getClass(), "_rootNames", null);
        setField(term28526, term28526.getClass(), "_overrides", null);
        setField(term28524, term28524.getClass(), "_configOverrides", term28526);
        setIntField(term28524, term28524.getClass(), "_mapperFeatures", 0);
        setField(term28524, term28524.getClass(), "_base", null);
        setField(term28523, term28523.getClass(), "_config", term28524);
        setField(term28527, term28527.getClass(), "_propCollector", null);
        setField(term28527, term28527.getClass(), "_config", null);
        setField(term28527, term28527.getClass(), "_annotationIntrospector", null);
        setField(term28527, term28527.getClass(), "_classInfo", null);
        setField(term28527, term28527.getClass(), "_properties", null);
        setField(term28527, term28527.getClass(), "_objectIdInfo", null);
        setField(term28528, term28528.getClass(), "_referencedType", null);
        setField(term28528, term28528.getClass(), "_superClass", null);
        setField(term28528, term28528.getClass(), "_superInterfaces", null);
        setField(term28528, term28528.getClass(), "_bindings", null);
        setField(term28528, term28528.getClass(), "_canonicalName", null);
        setField(term28528, term28528.getClass(), "_class", null);
        setIntField(term28528, term28528.getClass(), "_hash", 0);
        setField(term28528, term28528.getClass(), "_valueHandler", null);
        setField(term28528, term28528.getClass(), "_typeHandler", null);
        setBooleanField(term28528, term28528.getClass(), "_asStatic", false);
        setField(term28527, term28527.getClass(), "_type", term28528);
        setField(term28523, term28523.getClass(), "_beanDesc", term28527);
        setField(term28523, term28523.getClass(), "_annotationIntrospector", term28529);
        setField(term28523, term28523.getClass(), "_defaultBean", null);
        setField(term28523, term28523.getClass(), "_defaultInclusion", term28525);
        setBooleanField(term28523, term28523.getClass(), "_useRealPropertyDefaults", false);
        term28530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term28531 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term28530, term28530.getClass(), "_propCollector", null);
        setField(term28530, term28530.getClass(), "_config", null);
        setField(term28530, term28530.getClass(), "_annotationIntrospector", null);
        setField(term28530, term28530.getClass(), "_classInfo", null);
        setField(term28530, term28530.getClass(), "_properties", null);
        setField(term28530, term28530.getClass(), "_objectIdInfo", null);
        setField(term28531, term28531.getClass(), "_referencedType", null);
        setField(term28531, term28531.getClass(), "_superClass", null);
        setField(term28531, term28531.getClass(), "_superInterfaces", null);
        setField(term28531, term28531.getClass(), "_bindings", null);
        setField(term28531, term28531.getClass(), "_canonicalName", null);
        setField(term28531, term28531.getClass(), "_class", null);
        setIntField(term28531, term28531.getClass(), "_hash", 0);
        setField(term28531, term28531.getClass(), "_valueHandler", null);
        setField(term28531, term28531.getClass(), "_typeHandler", null);
        setBooleanField(term28531, term28531.getClass(), "_asStatic", false);
        setField(term28530, term28530.getClass(), "_type", term28531);
        term28532 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term28533 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term28534 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term28532, term28532.getClass(), "_filterProvider", null);
        setField(term28532, term28532.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term28532, term28532.getClass(), "_serFeatures", 0);
        setIntField(term28532, term28532.getClass(), "_generatorFeatures", 0);
        setIntField(term28532, term28532.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term28532, term28532.getClass(), "_formatWriteFeatures", 0);
        setIntField(term28532, term28532.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term28533, term28533.getClass(), "_valueInclusion", null);
        setField(term28533, term28533.getClass(), "_contentInclusion", null);
        setField(term28532, term28532.getClass(), "_serializationInclusion", term28533);
        setField(term28532, term28532.getClass(), "_mixIns", null);
        setField(term28532, term28532.getClass(), "_subtypeResolver", null);
        setField(term28532, term28532.getClass(), "_rootName", null);
        setField(term28532, term28532.getClass(), "_view", null);
        setField(term28532, term28532.getClass(), "_attributes", null);
        setField(term28532, term28532.getClass(), "_rootNames", null);
        setField(term28534, term28534.getClass(), "_overrides", null);
        setField(term28532, term28532.getClass(), "_configOverrides", term28534);
        setIntField(term28532, term28532.getClass(), "_mapperFeatures", 0);
        setField(term28532, term28532.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term27872;
        args[1] = term28214;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28523));
        assertTrue(recursiveEquals(term27872, term28530));
        assertTrue(recursiveEquals(term28214, term28532));
    }

};


