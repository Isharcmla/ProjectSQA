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

public class PropertyBuilder_init_125729300955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44585;
     Object term44921;
     Object term45074;
     Object term45080;
     Object term45082;

    public PropertyBuilder_init_125729300955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44479 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term44479, term44479.getClass(), "_config", null);
        setField(term44479, term44479.getClass(), "_beanDesc", null);
        setField(term44479, term44479.getClass(), "_defaultInclusion", null);
        term44585 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term44691 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term44791 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term44691, term44691.getClass(), "_overrides", null);
        setField(term44585, term44585.getClass(), "_configOverrides", term44691);
        setField(term44585, term44585.getClass(), "_serializationInclusion", null);
        setIntField(term44585, term44585.getClass(), "_mapperFeatures", -1);
        setField(term44585, term44585.getClass(), "_base", term44791);
        term44921 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45017 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45017, term45017.getClass(), "_class", null);
        setField(term44921, term44921.getClass(), "_type", term45017);
        setField(term44921, term44921.getClass(), "_annotationIntrospector", null);
        term45074 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term45075 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45076 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term45077 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term45078 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45079 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45075, term45075.getClass(), "_filterProvider", null);
        setField(term45075, term45075.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term45075, term45075.getClass(), "_serFeatures", 0);
        setIntField(term45075, term45075.getClass(), "_generatorFeatures", 0);
        setIntField(term45075, term45075.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term45075, term45075.getClass(), "_formatWriteFeatures", 0);
        setIntField(term45075, term45075.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term45075, term45075.getClass(), "_serializationInclusion", null);
        setField(term45075, term45075.getClass(), "_mixIns", null);
        setField(term45075, term45075.getClass(), "_subtypeResolver", null);
        setField(term45075, term45075.getClass(), "_rootName", null);
        setField(term45075, term45075.getClass(), "_view", null);
        setField(term45075, term45075.getClass(), "_attributes", null);
        setField(term45075, term45075.getClass(), "_rootNames", null);
        setField(term45076, term45076.getClass(), "_overrides", null);
        setField(term45075, term45075.getClass(), "_configOverrides", term45076);
        setIntField(term45075, term45075.getClass(), "_mapperFeatures", -1);
        setField(term45077, term45077.getClass(), "_classIntrospector", null);
        setField(term45077, term45077.getClass(), "_annotationIntrospector", null);
        setField(term45077, term45077.getClass(), "_visibilityChecker", null);
        setField(term45077, term45077.getClass(), "_propertyNamingStrategy", null);
        setField(term45077, term45077.getClass(), "_typeFactory", null);
        setField(term45077, term45077.getClass(), "_typeResolverBuilder", null);
        setField(term45077, term45077.getClass(), "_dateFormat", null);
        setField(term45077, term45077.getClass(), "_handlerInstantiator", null);
        setField(term45077, term45077.getClass(), "_locale", null);
        setField(term45077, term45077.getClass(), "_timeZone", null);
        setField(term45077, term45077.getClass(), "_defaultBase64", null);
        setField(term45075, term45075.getClass(), "_base", term45077);
        setField(term45074, term45074.getClass(), "_config", term45075);
        setField(term45078, term45078.getClass(), "_propCollector", null);
        setField(term45078, term45078.getClass(), "_config", null);
        setField(term45078, term45078.getClass(), "_annotationIntrospector", null);
        setField(term45078, term45078.getClass(), "_classInfo", null);
        setField(term45078, term45078.getClass(), "_properties", null);
        setField(term45078, term45078.getClass(), "_objectIdInfo", null);
        setField(term45079, term45079.getClass(), "_componentType", null);
        setField(term45079, term45079.getClass(), "_emptyArray", null);
        setField(term45079, term45079.getClass(), "_superClass", null);
        setField(term45079, term45079.getClass(), "_superInterfaces", null);
        setField(term45079, term45079.getClass(), "_bindings", null);
        setField(term45079, term45079.getClass(), "_canonicalName", null);
        setField(term45079, term45079.getClass(), "_class", null);
        setIntField(term45079, term45079.getClass(), "_hash", 0);
        setField(term45079, term45079.getClass(), "_valueHandler", null);
        setField(term45079, term45079.getClass(), "_typeHandler", null);
        setBooleanField(term45079, term45079.getClass(), "_asStatic", false);
        setField(term45078, term45078.getClass(), "_type", term45079);
        setField(term45074, term45074.getClass(), "_beanDesc", term45078);
        setField(term45074, term45074.getClass(), "_defaultInclusion", null);
        setField(term45074, term45074.getClass(), "_annotationIntrospector", null);
        setField(term45074, term45074.getClass(), "_defaultBean", null);
        term45080 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45081 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45080, term45080.getClass(), "_propCollector", null);
        setField(term45080, term45080.getClass(), "_config", null);
        setField(term45080, term45080.getClass(), "_annotationIntrospector", null);
        setField(term45080, term45080.getClass(), "_classInfo", null);
        setField(term45080, term45080.getClass(), "_properties", null);
        setField(term45080, term45080.getClass(), "_objectIdInfo", null);
        setField(term45081, term45081.getClass(), "_componentType", null);
        setField(term45081, term45081.getClass(), "_emptyArray", null);
        setField(term45081, term45081.getClass(), "_superClass", null);
        setField(term45081, term45081.getClass(), "_superInterfaces", null);
        setField(term45081, term45081.getClass(), "_bindings", null);
        setField(term45081, term45081.getClass(), "_canonicalName", null);
        setField(term45081, term45081.getClass(), "_class", null);
        setIntField(term45081, term45081.getClass(), "_hash", 0);
        setField(term45081, term45081.getClass(), "_valueHandler", null);
        setField(term45081, term45081.getClass(), "_typeHandler", null);
        setBooleanField(term45081, term45081.getClass(), "_asStatic", false);
        setField(term45080, term45080.getClass(), "_type", term45081);
        term45082 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45083 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term45084 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term45082, term45082.getClass(), "_filterProvider", null);
        setField(term45082, term45082.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term45082, term45082.getClass(), "_serFeatures", 0);
        setIntField(term45082, term45082.getClass(), "_generatorFeatures", 0);
        setIntField(term45082, term45082.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term45082, term45082.getClass(), "_formatWriteFeatures", 0);
        setIntField(term45082, term45082.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term45082, term45082.getClass(), "_serializationInclusion", null);
        setField(term45082, term45082.getClass(), "_mixIns", null);
        setField(term45082, term45082.getClass(), "_subtypeResolver", null);
        setField(term45082, term45082.getClass(), "_rootName", null);
        setField(term45082, term45082.getClass(), "_view", null);
        setField(term45082, term45082.getClass(), "_attributes", null);
        setField(term45082, term45082.getClass(), "_rootNames", null);
        setField(term45083, term45083.getClass(), "_overrides", null);
        setField(term45082, term45082.getClass(), "_configOverrides", term45083);
        setIntField(term45082, term45082.getClass(), "_mapperFeatures", -1);
        setField(term45084, term45084.getClass(), "_classIntrospector", null);
        setField(term45084, term45084.getClass(), "_annotationIntrospector", null);
        setField(term45084, term45084.getClass(), "_visibilityChecker", null);
        setField(term45084, term45084.getClass(), "_propertyNamingStrategy", null);
        setField(term45084, term45084.getClass(), "_typeFactory", null);
        setField(term45084, term45084.getClass(), "_typeResolverBuilder", null);
        setField(term45084, term45084.getClass(), "_dateFormat", null);
        setField(term45084, term45084.getClass(), "_handlerInstantiator", null);
        setField(term45084, term45084.getClass(), "_locale", null);
        setField(term45084, term45084.getClass(), "_timeZone", null);
        setField(term45084, term45084.getClass(), "_defaultBase64", null);
        setField(term45082, term45082.getClass(), "_base", term45084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term44585;
        args[1] = term44921;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45074));
        assertTrue(recursiveEquals(term44585, term45080));
        assertTrue(recursiveEquals(term44921, term45082));
    }

};


