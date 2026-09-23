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

public class PropertyBuilder_init_125729300943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29563;
     Object term29799;
     Object term30119;
     Object term30129;
     Object term30131;

    public PropertyBuilder_init_125729300943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29351 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term29457 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term29351, term29351.getClass(), "_config", term29457);
        setField(term29351, term29351.getClass(), "_beanDesc", null);
        term29563 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term29669 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term29563, term29563.getClass(), "_configOverrides", term29669);
        term29799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term29903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29799, term29799.getClass(), "_annotationIntrospector", null);
        setField(term29903, term29903.getClass(), "_class", null);
        setField(term29799, term29799.getClass(), "_type", term29903);
        Class<? extends Object> term30134 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term30133 = ((Class) term30134).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term30133).setAccessible(true);
        Object enum3 = ((Field) term30133).get((Object) null);
        term30119 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term30120 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term30121 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term30122 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term30123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term30124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term30125 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term30120, term30120.getClass(), "_filterProvider", null);
        setField(term30120, term30120.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term30120, term30120.getClass(), "_serFeatures", 0);
        setIntField(term30120, term30120.getClass(), "_generatorFeatures", 0);
        setIntField(term30120, term30120.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term30120, term30120.getClass(), "_formatWriteFeatures", 0);
        setIntField(term30120, term30120.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term30120, term30120.getClass(), "_serializationInclusion", null);
        setField(term30120, term30120.getClass(), "_mixIns", null);
        setField(term30120, term30120.getClass(), "_subtypeResolver", null);
        setField(term30120, term30120.getClass(), "_rootName", null);
        setField(term30120, term30120.getClass(), "_view", null);
        setField(term30120, term30120.getClass(), "_attributes", null);
        setField(term30120, term30120.getClass(), "_rootNames", null);
        setField(term30121, term30121.getClass(), "_overrides", null);
        setField(term30120, term30120.getClass(), "_configOverrides", term30121);
        setIntField(term30120, term30120.getClass(), "_mapperFeatures", 0);
        setField(term30120, term30120.getClass(), "_base", null);
        setField(term30119, term30119.getClass(), "_config", term30120);
        setField(term30122, term30122.getClass(), "_propCollector", null);
        setField(term30122, term30122.getClass(), "_config", null);
        setField(term30122, term30122.getClass(), "_annotationIntrospector", null);
        setField(term30122, term30122.getClass(), "_classInfo", null);
        setField(term30122, term30122.getClass(), "_properties", null);
        setField(term30122, term30122.getClass(), "_objectIdInfo", null);
        setField(term30123, term30123.getClass(), "_referencedType", null);
        setField(term30123, term30123.getClass(), "_anchorType", null);
        setField(term30123, term30123.getClass(), "_superClass", null);
        setField(term30123, term30123.getClass(), "_superInterfaces", null);
        setField(term30123, term30123.getClass(), "_bindings", null);
        setField(term30123, term30123.getClass(), "_canonicalName", null);
        setField(term30123, term30123.getClass(), "_class", null);
        setIntField(term30123, term30123.getClass(), "_hash", 0);
        setField(term30123, term30123.getClass(), "_valueHandler", null);
        setField(term30123, term30123.getClass(), "_typeHandler", null);
        setBooleanField(term30123, term30123.getClass(), "_asStatic", false);
        setField(term30122, term30122.getClass(), "_type", term30123);
        setField(term30119, term30119.getClass(), "_beanDesc", term30122);
        setField(term30119, term30119.getClass(), "_annotationIntrospector", term30124);
        setField(term30119, term30119.getClass(), "_defaultBean", null);
        setField(term30125, term30125.getClass(), "_valueInclusion", enum3);
        setField(term30125, term30125.getClass(), "_contentInclusion", enum3);
        setField(term30119, term30119.getClass(), "_defaultInclusion", term30125);
        setBooleanField(term30119, term30119.getClass(), "_useRealPropertyDefaults", false);
        term30129 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term30130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term30129, term30129.getClass(), "_propCollector", null);
        setField(term30129, term30129.getClass(), "_config", null);
        setField(term30129, term30129.getClass(), "_annotationIntrospector", null);
        setField(term30129, term30129.getClass(), "_classInfo", null);
        setField(term30129, term30129.getClass(), "_properties", null);
        setField(term30129, term30129.getClass(), "_objectIdInfo", null);
        setField(term30130, term30130.getClass(), "_referencedType", null);
        setField(term30130, term30130.getClass(), "_anchorType", null);
        setField(term30130, term30130.getClass(), "_superClass", null);
        setField(term30130, term30130.getClass(), "_superInterfaces", null);
        setField(term30130, term30130.getClass(), "_bindings", null);
        setField(term30130, term30130.getClass(), "_canonicalName", null);
        setField(term30130, term30130.getClass(), "_class", null);
        setIntField(term30130, term30130.getClass(), "_hash", 0);
        setField(term30130, term30130.getClass(), "_valueHandler", null);
        setField(term30130, term30130.getClass(), "_typeHandler", null);
        setBooleanField(term30130, term30130.getClass(), "_asStatic", false);
        setField(term30129, term30129.getClass(), "_type", term30130);
        term30131 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term30132 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term30131, term30131.getClass(), "_filterProvider", null);
        setField(term30131, term30131.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term30131, term30131.getClass(), "_serFeatures", 0);
        setIntField(term30131, term30131.getClass(), "_generatorFeatures", 0);
        setIntField(term30131, term30131.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term30131, term30131.getClass(), "_formatWriteFeatures", 0);
        setIntField(term30131, term30131.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term30131, term30131.getClass(), "_serializationInclusion", null);
        setField(term30131, term30131.getClass(), "_mixIns", null);
        setField(term30131, term30131.getClass(), "_subtypeResolver", null);
        setField(term30131, term30131.getClass(), "_rootName", null);
        setField(term30131, term30131.getClass(), "_view", null);
        setField(term30131, term30131.getClass(), "_attributes", null);
        setField(term30131, term30131.getClass(), "_rootNames", null);
        setField(term30132, term30132.getClass(), "_overrides", null);
        setField(term30131, term30131.getClass(), "_configOverrides", term30132);
        setIntField(term30131, term30131.getClass(), "_mapperFeatures", 0);
        setField(term30131, term30131.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term29563;
        args[1] = term29799;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30119));
        assertTrue(recursiveEquals(term29563, term30129));
        assertTrue(recursiveEquals(term29799, term30131));
    }

};


