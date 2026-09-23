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

public class PropertyBuilder_init_125729300947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34002;
     Object term34238;
     Object term34574;
     Object term34584;
     Object term34586;

    public PropertyBuilder_init_125729300947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33660 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term33766 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term33896 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term33660, term33660.getClass(), "_config", term33766);
        setField(term33660, term33660.getClass(), "_beanDesc", term33896);
        term34002 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term34108 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term34108, term34108.getClass(), "_overrides", null);
        setField(term34002, term34002.getClass(), "_configOverrides", term34108);
        term34238 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term34358 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term34238, term34238.getClass(), "_annotationIntrospector", null);
        setField(term34358, term34358.getClass(), "_class", null);
        setField(term34238, term34238.getClass(), "_type", term34358);
        Class<? extends Object> term34589 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term34588 = ((Class) term34589).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term34588).setAccessible(true);
        Object enum4 = ((Field) term34588).get((Object) null);
        term34574 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term34575 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term34576 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term34577 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term34578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term34579 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term34580 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term34575, term34575.getClass(), "_filterProvider", null);
        setField(term34575, term34575.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term34575, term34575.getClass(), "_serFeatures", 0);
        setIntField(term34575, term34575.getClass(), "_generatorFeatures", 0);
        setIntField(term34575, term34575.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term34575, term34575.getClass(), "_formatWriteFeatures", 0);
        setIntField(term34575, term34575.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term34575, term34575.getClass(), "_serializationInclusion", null);
        setField(term34575, term34575.getClass(), "_mixIns", null);
        setField(term34575, term34575.getClass(), "_subtypeResolver", null);
        setField(term34575, term34575.getClass(), "_rootName", null);
        setField(term34575, term34575.getClass(), "_view", null);
        setField(term34575, term34575.getClass(), "_attributes", null);
        setField(term34575, term34575.getClass(), "_rootNames", null);
        setField(term34576, term34576.getClass(), "_overrides", null);
        setField(term34575, term34575.getClass(), "_configOverrides", term34576);
        setIntField(term34575, term34575.getClass(), "_mapperFeatures", 0);
        setField(term34575, term34575.getClass(), "_base", null);
        setField(term34574, term34574.getClass(), "_config", term34575);
        setField(term34577, term34577.getClass(), "_propCollector", null);
        setField(term34577, term34577.getClass(), "_config", null);
        setField(term34577, term34577.getClass(), "_annotationIntrospector", null);
        setField(term34577, term34577.getClass(), "_classInfo", null);
        setField(term34577, term34577.getClass(), "_properties", null);
        setField(term34577, term34577.getClass(), "_objectIdInfo", null);
        setField(term34578, term34578.getClass(), "_referencedType", null);
        setField(term34578, term34578.getClass(), "_superClass", null);
        setField(term34578, term34578.getClass(), "_superInterfaces", null);
        setField(term34578, term34578.getClass(), "_bindings", null);
        setField(term34578, term34578.getClass(), "_canonicalName", null);
        setField(term34578, term34578.getClass(), "_class", null);
        setIntField(term34578, term34578.getClass(), "_hash", 0);
        setField(term34578, term34578.getClass(), "_valueHandler", null);
        setField(term34578, term34578.getClass(), "_typeHandler", null);
        setBooleanField(term34578, term34578.getClass(), "_asStatic", false);
        setField(term34577, term34577.getClass(), "_type", term34578);
        setField(term34574, term34574.getClass(), "_beanDesc", term34577);
        setField(term34574, term34574.getClass(), "_annotationIntrospector", term34579);
        setField(term34574, term34574.getClass(), "_defaultBean", null);
        setField(term34580, term34580.getClass(), "_valueInclusion", enum4);
        setField(term34580, term34580.getClass(), "_contentInclusion", enum4);
        setField(term34574, term34574.getClass(), "_defaultInclusion", term34580);
        setBooleanField(term34574, term34574.getClass(), "_useRealPropertyDefaults", false);
        term34584 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term34585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term34584, term34584.getClass(), "_propCollector", null);
        setField(term34584, term34584.getClass(), "_config", null);
        setField(term34584, term34584.getClass(), "_annotationIntrospector", null);
        setField(term34584, term34584.getClass(), "_classInfo", null);
        setField(term34584, term34584.getClass(), "_properties", null);
        setField(term34584, term34584.getClass(), "_objectIdInfo", null);
        setField(term34585, term34585.getClass(), "_referencedType", null);
        setField(term34585, term34585.getClass(), "_superClass", null);
        setField(term34585, term34585.getClass(), "_superInterfaces", null);
        setField(term34585, term34585.getClass(), "_bindings", null);
        setField(term34585, term34585.getClass(), "_canonicalName", null);
        setField(term34585, term34585.getClass(), "_class", null);
        setIntField(term34585, term34585.getClass(), "_hash", 0);
        setField(term34585, term34585.getClass(), "_valueHandler", null);
        setField(term34585, term34585.getClass(), "_typeHandler", null);
        setBooleanField(term34585, term34585.getClass(), "_asStatic", false);
        setField(term34584, term34584.getClass(), "_type", term34585);
        term34586 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term34587 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term34586, term34586.getClass(), "_filterProvider", null);
        setField(term34586, term34586.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term34586, term34586.getClass(), "_serFeatures", 0);
        setIntField(term34586, term34586.getClass(), "_generatorFeatures", 0);
        setIntField(term34586, term34586.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term34586, term34586.getClass(), "_formatWriteFeatures", 0);
        setIntField(term34586, term34586.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term34586, term34586.getClass(), "_serializationInclusion", null);
        setField(term34586, term34586.getClass(), "_mixIns", null);
        setField(term34586, term34586.getClass(), "_subtypeResolver", null);
        setField(term34586, term34586.getClass(), "_rootName", null);
        setField(term34586, term34586.getClass(), "_view", null);
        setField(term34586, term34586.getClass(), "_attributes", null);
        setField(term34586, term34586.getClass(), "_rootNames", null);
        setField(term34587, term34587.getClass(), "_overrides", null);
        setField(term34586, term34586.getClass(), "_configOverrides", term34587);
        setIntField(term34586, term34586.getClass(), "_mapperFeatures", 0);
        setField(term34586, term34586.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term34002;
        args[1] = term34238;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34574));
        assertTrue(recursiveEquals(term34002, term34584));
        assertTrue(recursiveEquals(term34238, term34586));
    }

};


