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
     Object term45142;
     Object term45484;
     Object term45777;
     Object term45784;
     Object term45786;

    public PropertyBuilder_init_125729300955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term45036 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term44930, term44930.getClass(), "_config", term45036);
        setField(term44930, term44930.getClass(), "_beanDesc", null);
        term45142 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45248 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term45354 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term45248, term45248.getClass(), "_overrides", null);
        setField(term45142, term45142.getClass(), "_configOverrides", term45248);
        setField(term45142, term45142.getClass(), "_serializationInclusion", term45354);
        term45484 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term45484, term45484.getClass(), "_annotationIntrospector", null);
        setField(term45588, term45588.getClass(), "_class", null);
        setField(term45484, term45484.getClass(), "_type", term45588);
        term45777 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term45778 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45779 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term45780 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term45781 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term45783 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term45778, term45778.getClass(), "_filterProvider", null);
        setField(term45778, term45778.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term45778, term45778.getClass(), "_serFeatures", 0);
        setIntField(term45778, term45778.getClass(), "_generatorFeatures", 0);
        setIntField(term45778, term45778.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term45778, term45778.getClass(), "_formatWriteFeatures", 0);
        setIntField(term45778, term45778.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term45779, term45779.getClass(), "_valueInclusion", null);
        setField(term45779, term45779.getClass(), "_contentInclusion", null);
        setField(term45778, term45778.getClass(), "_serializationInclusion", term45779);
        setField(term45778, term45778.getClass(), "_mixIns", null);
        setField(term45778, term45778.getClass(), "_subtypeResolver", null);
        setField(term45778, term45778.getClass(), "_rootName", null);
        setField(term45778, term45778.getClass(), "_view", null);
        setField(term45778, term45778.getClass(), "_attributes", null);
        setField(term45778, term45778.getClass(), "_rootNames", null);
        setField(term45780, term45780.getClass(), "_overrides", null);
        setField(term45778, term45778.getClass(), "_configOverrides", term45780);
        setIntField(term45778, term45778.getClass(), "_mapperFeatures", 0);
        setField(term45778, term45778.getClass(), "_base", null);
        setField(term45777, term45777.getClass(), "_config", term45778);
        setField(term45781, term45781.getClass(), "_propCollector", null);
        setField(term45781, term45781.getClass(), "_config", null);
        setField(term45781, term45781.getClass(), "_annotationIntrospector", null);
        setField(term45781, term45781.getClass(), "_classInfo", null);
        setField(term45781, term45781.getClass(), "_properties", null);
        setField(term45781, term45781.getClass(), "_objectIdInfo", null);
        setField(term45782, term45782.getClass(), "_referencedType", null);
        setField(term45782, term45782.getClass(), "_anchorType", null);
        setField(term45782, term45782.getClass(), "_superClass", null);
        setField(term45782, term45782.getClass(), "_superInterfaces", null);
        setField(term45782, term45782.getClass(), "_bindings", null);
        setField(term45782, term45782.getClass(), "_canonicalName", null);
        setField(term45782, term45782.getClass(), "_class", null);
        setIntField(term45782, term45782.getClass(), "_hash", 0);
        setField(term45782, term45782.getClass(), "_valueHandler", null);
        setField(term45782, term45782.getClass(), "_typeHandler", null);
        setBooleanField(term45782, term45782.getClass(), "_asStatic", false);
        setField(term45781, term45781.getClass(), "_type", term45782);
        setField(term45777, term45777.getClass(), "_beanDesc", term45781);
        setField(term45777, term45777.getClass(), "_annotationIntrospector", term45783);
        setField(term45777, term45777.getClass(), "_defaultBean", null);
        setField(term45777, term45777.getClass(), "_defaultInclusion", term45779);
        setBooleanField(term45777, term45777.getClass(), "_useRealPropertyDefaults", false);
        term45784 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term45785 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term45784, term45784.getClass(), "_propCollector", null);
        setField(term45784, term45784.getClass(), "_config", null);
        setField(term45784, term45784.getClass(), "_annotationIntrospector", null);
        setField(term45784, term45784.getClass(), "_classInfo", null);
        setField(term45784, term45784.getClass(), "_properties", null);
        setField(term45784, term45784.getClass(), "_objectIdInfo", null);
        setField(term45785, term45785.getClass(), "_referencedType", null);
        setField(term45785, term45785.getClass(), "_anchorType", null);
        setField(term45785, term45785.getClass(), "_superClass", null);
        setField(term45785, term45785.getClass(), "_superInterfaces", null);
        setField(term45785, term45785.getClass(), "_bindings", null);
        setField(term45785, term45785.getClass(), "_canonicalName", null);
        setField(term45785, term45785.getClass(), "_class", null);
        setIntField(term45785, term45785.getClass(), "_hash", 0);
        setField(term45785, term45785.getClass(), "_valueHandler", null);
        setField(term45785, term45785.getClass(), "_typeHandler", null);
        setBooleanField(term45785, term45785.getClass(), "_asStatic", false);
        setField(term45784, term45784.getClass(), "_type", term45785);
        term45786 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45787 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term45788 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term45786, term45786.getClass(), "_filterProvider", null);
        setField(term45786, term45786.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term45786, term45786.getClass(), "_serFeatures", 0);
        setIntField(term45786, term45786.getClass(), "_generatorFeatures", 0);
        setIntField(term45786, term45786.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term45786, term45786.getClass(), "_formatWriteFeatures", 0);
        setIntField(term45786, term45786.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term45787, term45787.getClass(), "_valueInclusion", null);
        setField(term45787, term45787.getClass(), "_contentInclusion", null);
        setField(term45786, term45786.getClass(), "_serializationInclusion", term45787);
        setField(term45786, term45786.getClass(), "_mixIns", null);
        setField(term45786, term45786.getClass(), "_subtypeResolver", null);
        setField(term45786, term45786.getClass(), "_rootName", null);
        setField(term45786, term45786.getClass(), "_view", null);
        setField(term45786, term45786.getClass(), "_attributes", null);
        setField(term45786, term45786.getClass(), "_rootNames", null);
        setField(term45788, term45788.getClass(), "_overrides", null);
        setField(term45786, term45786.getClass(), "_configOverrides", term45788);
        setIntField(term45786, term45786.getClass(), "_mapperFeatures", 0);
        setField(term45786, term45786.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term45142;
        args[1] = term45484;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45777));
        assertTrue(recursiveEquals(term45142, term45784));
        assertTrue(recursiveEquals(term45484, term45786));
    }

};


