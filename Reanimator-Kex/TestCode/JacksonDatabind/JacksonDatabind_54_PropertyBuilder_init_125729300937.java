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

public class PropertyBuilder_init_125729300937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22601;
     Object term22837;
     Object term22986;
     Object term22992;
     Object term22994;

    public PropertyBuilder_init_125729300937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22259 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term22365 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22495 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term22259, term22259.getClass(), "_config", term22365);
        setField(term22259, term22259.getClass(), "_beanDesc", term22495);
        term22601 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22707 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term22601, term22601.getClass(), "_configOverrides", term22707);
        term22837 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term22929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term22929, term22929.getClass(), "_class", null);
        setField(term22837, term22837.getClass(), "_type", term22929);
        term22986 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term22987 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22988 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term22989 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term22990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term22991 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term22987, term22987.getClass(), "_filterProvider", null);
        setField(term22987, term22987.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term22987, term22987.getClass(), "_serFeatures", 0);
        setIntField(term22987, term22987.getClass(), "_generatorFeatures", 0);
        setIntField(term22987, term22987.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term22987, term22987.getClass(), "_formatWriteFeatures", 0);
        setIntField(term22987, term22987.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term22987, term22987.getClass(), "_serializationInclusion", null);
        setField(term22987, term22987.getClass(), "_mixIns", null);
        setField(term22987, term22987.getClass(), "_subtypeResolver", null);
        setField(term22987, term22987.getClass(), "_rootName", null);
        setField(term22987, term22987.getClass(), "_view", null);
        setField(term22987, term22987.getClass(), "_attributes", null);
        setField(term22987, term22987.getClass(), "_rootNames", null);
        setField(term22988, term22988.getClass(), "_overrides", null);
        setField(term22987, term22987.getClass(), "_configOverrides", term22988);
        setIntField(term22987, term22987.getClass(), "_mapperFeatures", 0);
        setField(term22987, term22987.getClass(), "_base", null);
        setField(term22986, term22986.getClass(), "_config", term22987);
        setField(term22989, term22989.getClass(), "_propCollector", null);
        setField(term22989, term22989.getClass(), "_config", null);
        setField(term22989, term22989.getClass(), "_annotationIntrospector", null);
        setField(term22989, term22989.getClass(), "_classInfo", null);
        setField(term22989, term22989.getClass(), "_properties", null);
        setField(term22989, term22989.getClass(), "_objectIdInfo", null);
        setField(term22990, term22990.getClass(), "_keyType", null);
        setField(term22990, term22990.getClass(), "_valueType", null);
        setField(term22990, term22990.getClass(), "_superClass", null);
        setField(term22990, term22990.getClass(), "_superInterfaces", null);
        setField(term22990, term22990.getClass(), "_bindings", null);
        setField(term22990, term22990.getClass(), "_canonicalName", null);
        setField(term22990, term22990.getClass(), "_class", null);
        setIntField(term22990, term22990.getClass(), "_hash", 0);
        setField(term22990, term22990.getClass(), "_valueHandler", null);
        setField(term22990, term22990.getClass(), "_typeHandler", null);
        setBooleanField(term22990, term22990.getClass(), "_asStatic", false);
        setField(term22989, term22989.getClass(), "_type", term22990);
        setField(term22986, term22986.getClass(), "_beanDesc", term22989);
        setField(term22986, term22986.getClass(), "_defaultInclusion", null);
        setField(term22986, term22986.getClass(), "_annotationIntrospector", term22991);
        setField(term22986, term22986.getClass(), "_defaultBean", null);
        term22992 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term22993 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term22992, term22992.getClass(), "_propCollector", null);
        setField(term22992, term22992.getClass(), "_config", null);
        setField(term22992, term22992.getClass(), "_annotationIntrospector", null);
        setField(term22992, term22992.getClass(), "_classInfo", null);
        setField(term22992, term22992.getClass(), "_properties", null);
        setField(term22992, term22992.getClass(), "_objectIdInfo", null);
        setField(term22993, term22993.getClass(), "_keyType", null);
        setField(term22993, term22993.getClass(), "_valueType", null);
        setField(term22993, term22993.getClass(), "_superClass", null);
        setField(term22993, term22993.getClass(), "_superInterfaces", null);
        setField(term22993, term22993.getClass(), "_bindings", null);
        setField(term22993, term22993.getClass(), "_canonicalName", null);
        setField(term22993, term22993.getClass(), "_class", null);
        setIntField(term22993, term22993.getClass(), "_hash", 0);
        setField(term22993, term22993.getClass(), "_valueHandler", null);
        setField(term22993, term22993.getClass(), "_typeHandler", null);
        setBooleanField(term22993, term22993.getClass(), "_asStatic", false);
        setField(term22992, term22992.getClass(), "_type", term22993);
        term22994 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term22995 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term22994, term22994.getClass(), "_filterProvider", null);
        setField(term22994, term22994.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term22994, term22994.getClass(), "_serFeatures", 0);
        setIntField(term22994, term22994.getClass(), "_generatorFeatures", 0);
        setIntField(term22994, term22994.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term22994, term22994.getClass(), "_formatWriteFeatures", 0);
        setIntField(term22994, term22994.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term22994, term22994.getClass(), "_serializationInclusion", null);
        setField(term22994, term22994.getClass(), "_mixIns", null);
        setField(term22994, term22994.getClass(), "_subtypeResolver", null);
        setField(term22994, term22994.getClass(), "_rootName", null);
        setField(term22994, term22994.getClass(), "_view", null);
        setField(term22994, term22994.getClass(), "_attributes", null);
        setField(term22994, term22994.getClass(), "_rootNames", null);
        setField(term22995, term22995.getClass(), "_overrides", null);
        setField(term22994, term22994.getClass(), "_configOverrides", term22995);
        setIntField(term22994, term22994.getClass(), "_mapperFeatures", 0);
        setField(term22994, term22994.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term22601;
        args[1] = term22837;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22986));
        assertTrue(recursiveEquals(term22601, term22992));
        assertTrue(recursiveEquals(term22837, term22994));
    }

};


