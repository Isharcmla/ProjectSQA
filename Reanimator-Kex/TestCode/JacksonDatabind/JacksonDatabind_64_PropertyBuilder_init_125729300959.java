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

public class PropertyBuilder_init_125729300959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49292;
     Object term49528;
     Object term49848;
     Object term49858;
     Object term49860;

    public PropertyBuilder_init_125729300959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term49186 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term49080, term49080.getClass(), "_config", term49186);
        setField(term49080, term49080.getClass(), "_beanDesc", null);
        setField(term49080, term49080.getClass(), "_defaultInclusion", null);
        term49292 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49398 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term49398, term49398.getClass(), "_overrides", null);
        setField(term49292, term49292.getClass(), "_configOverrides", term49398);
        setField(term49292, term49292.getClass(), "_serializationInclusion", null);
        term49528 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term49632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term49528, term49528.getClass(), "_annotationIntrospector", null);
        setField(term49632, term49632.getClass(), "_class", null);
        setField(term49528, term49528.getClass(), "_type", term49632);
        Class<? extends Object> term49863 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term49862 = ((Class) term49863).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term49862).setAccessible(true);
        Object enum6 = ((Field) term49862).get((Object) null);
        term49848 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term49849 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49850 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term49851 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term49852 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term49853 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term49854 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term49849, term49849.getClass(), "_filterProvider", null);
        setField(term49849, term49849.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term49849, term49849.getClass(), "_serFeatures", 0);
        setIntField(term49849, term49849.getClass(), "_generatorFeatures", 0);
        setIntField(term49849, term49849.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term49849, term49849.getClass(), "_formatWriteFeatures", 0);
        setIntField(term49849, term49849.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term49849, term49849.getClass(), "_serializationInclusion", null);
        setField(term49849, term49849.getClass(), "_mixIns", null);
        setField(term49849, term49849.getClass(), "_subtypeResolver", null);
        setField(term49849, term49849.getClass(), "_rootName", null);
        setField(term49849, term49849.getClass(), "_view", null);
        setField(term49849, term49849.getClass(), "_attributes", null);
        setField(term49849, term49849.getClass(), "_rootNames", null);
        setField(term49850, term49850.getClass(), "_overrides", null);
        setField(term49849, term49849.getClass(), "_configOverrides", term49850);
        setIntField(term49849, term49849.getClass(), "_mapperFeatures", 0);
        setField(term49849, term49849.getClass(), "_base", null);
        setField(term49848, term49848.getClass(), "_config", term49849);
        setField(term49851, term49851.getClass(), "_propCollector", null);
        setField(term49851, term49851.getClass(), "_config", null);
        setField(term49851, term49851.getClass(), "_annotationIntrospector", null);
        setField(term49851, term49851.getClass(), "_classInfo", null);
        setField(term49851, term49851.getClass(), "_properties", null);
        setField(term49851, term49851.getClass(), "_objectIdInfo", null);
        setField(term49852, term49852.getClass(), "_referencedType", null);
        setField(term49852, term49852.getClass(), "_anchorType", null);
        setField(term49852, term49852.getClass(), "_superClass", null);
        setField(term49852, term49852.getClass(), "_superInterfaces", null);
        setField(term49852, term49852.getClass(), "_bindings", null);
        setField(term49852, term49852.getClass(), "_canonicalName", null);
        setField(term49852, term49852.getClass(), "_class", null);
        setIntField(term49852, term49852.getClass(), "_hash", 0);
        setField(term49852, term49852.getClass(), "_valueHandler", null);
        setField(term49852, term49852.getClass(), "_typeHandler", null);
        setBooleanField(term49852, term49852.getClass(), "_asStatic", false);
        setField(term49851, term49851.getClass(), "_type", term49852);
        setField(term49848, term49848.getClass(), "_beanDesc", term49851);
        setField(term49848, term49848.getClass(), "_annotationIntrospector", term49853);
        setField(term49848, term49848.getClass(), "_defaultBean", null);
        setField(term49854, term49854.getClass(), "_valueInclusion", enum6);
        setField(term49854, term49854.getClass(), "_contentInclusion", enum6);
        setField(term49848, term49848.getClass(), "_defaultInclusion", term49854);
        setBooleanField(term49848, term49848.getClass(), "_useRealPropertyDefaults", false);
        term49858 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term49859 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term49858, term49858.getClass(), "_propCollector", null);
        setField(term49858, term49858.getClass(), "_config", null);
        setField(term49858, term49858.getClass(), "_annotationIntrospector", null);
        setField(term49858, term49858.getClass(), "_classInfo", null);
        setField(term49858, term49858.getClass(), "_properties", null);
        setField(term49858, term49858.getClass(), "_objectIdInfo", null);
        setField(term49859, term49859.getClass(), "_referencedType", null);
        setField(term49859, term49859.getClass(), "_anchorType", null);
        setField(term49859, term49859.getClass(), "_superClass", null);
        setField(term49859, term49859.getClass(), "_superInterfaces", null);
        setField(term49859, term49859.getClass(), "_bindings", null);
        setField(term49859, term49859.getClass(), "_canonicalName", null);
        setField(term49859, term49859.getClass(), "_class", null);
        setIntField(term49859, term49859.getClass(), "_hash", 0);
        setField(term49859, term49859.getClass(), "_valueHandler", null);
        setField(term49859, term49859.getClass(), "_typeHandler", null);
        setBooleanField(term49859, term49859.getClass(), "_asStatic", false);
        setField(term49858, term49858.getClass(), "_type", term49859);
        term49860 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49861 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term49860, term49860.getClass(), "_filterProvider", null);
        setField(term49860, term49860.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term49860, term49860.getClass(), "_serFeatures", 0);
        setIntField(term49860, term49860.getClass(), "_generatorFeatures", 0);
        setIntField(term49860, term49860.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term49860, term49860.getClass(), "_formatWriteFeatures", 0);
        setIntField(term49860, term49860.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term49860, term49860.getClass(), "_serializationInclusion", null);
        setField(term49860, term49860.getClass(), "_mixIns", null);
        setField(term49860, term49860.getClass(), "_subtypeResolver", null);
        setField(term49860, term49860.getClass(), "_rootName", null);
        setField(term49860, term49860.getClass(), "_view", null);
        setField(term49860, term49860.getClass(), "_attributes", null);
        setField(term49860, term49860.getClass(), "_rootNames", null);
        setField(term49861, term49861.getClass(), "_overrides", null);
        setField(term49860, term49860.getClass(), "_configOverrides", term49861);
        setIntField(term49860, term49860.getClass(), "_mapperFeatures", 0);
        setField(term49860, term49860.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term49292;
        args[1] = term49528;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term49848));
        assertTrue(recursiveEquals(term49292, term49858));
        assertTrue(recursiveEquals(term49528, term49860));
    }

};


