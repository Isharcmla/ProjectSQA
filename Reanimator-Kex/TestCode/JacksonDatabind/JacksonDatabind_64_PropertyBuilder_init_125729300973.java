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

public class PropertyBuilder_init_125729300973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65101;
     Object term65337;
     Object term65858;
     Object term65869;
     Object term65872;

    public PropertyBuilder_init_125729300973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64759 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term64865 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term64995 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term64759, term64759.getClass(), "_config", term64865);
        setField(term64759, term64759.getClass(), "_beanDesc", term64995);
        term65101 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65207 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term65207, term65207.getClass(), "_overrides", null);
        setField(term65101, term65101.getClass(), "_configOverrides", term65207);
        setField(term65101, term65101.getClass(), "_serializationInclusion", null);
        term65337 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term65481 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term65585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term65337, term65337.getClass(), "_annotationIntrospector", term65481);
        setField(term65337, term65337.getClass(), "_classInfo", null);
        setField(term65585, term65585.getClass(), "_class", null);
        setField(term65337, term65337.getClass(), "_type", term65585);
        Class<? extends Object> term65875 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term65874 = ((Class) term65875).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term65874).setAccessible(true);
        Object enum8 = ((Field) term65874).get((Object) null);
        term65858 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term65859 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65860 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term65861 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term65862 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term65863 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term65864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term65865 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term65859, term65859.getClass(), "_filterProvider", null);
        setField(term65859, term65859.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term65859, term65859.getClass(), "_serFeatures", 0);
        setIntField(term65859, term65859.getClass(), "_generatorFeatures", 0);
        setIntField(term65859, term65859.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term65859, term65859.getClass(), "_formatWriteFeatures", 0);
        setIntField(term65859, term65859.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term65859, term65859.getClass(), "_serializationInclusion", null);
        setField(term65859, term65859.getClass(), "_mixIns", null);
        setField(term65859, term65859.getClass(), "_subtypeResolver", null);
        setField(term65859, term65859.getClass(), "_rootName", null);
        setField(term65859, term65859.getClass(), "_view", null);
        setField(term65859, term65859.getClass(), "_attributes", null);
        setField(term65859, term65859.getClass(), "_rootNames", null);
        setField(term65860, term65860.getClass(), "_overrides", null);
        setField(term65859, term65859.getClass(), "_configOverrides", term65860);
        setIntField(term65859, term65859.getClass(), "_mapperFeatures", 0);
        setField(term65859, term65859.getClass(), "_base", null);
        setField(term65858, term65858.getClass(), "_config", term65859);
        setField(term65861, term65861.getClass(), "_propCollector", null);
        setField(term65861, term65861.getClass(), "_config", null);
        setField(term65861, term65861.getClass(), "_annotationIntrospector", term65862);
        setField(term65861, term65861.getClass(), "_classInfo", null);
        setField(term65861, term65861.getClass(), "_properties", null);
        setField(term65861, term65861.getClass(), "_objectIdInfo", null);
        setField(term65863, term65863.getClass(), "_referencedType", null);
        setField(term65863, term65863.getClass(), "_anchorType", null);
        setField(term65863, term65863.getClass(), "_superClass", null);
        setField(term65863, term65863.getClass(), "_superInterfaces", null);
        setField(term65863, term65863.getClass(), "_bindings", null);
        setField(term65863, term65863.getClass(), "_canonicalName", null);
        setField(term65863, term65863.getClass(), "_class", null);
        setIntField(term65863, term65863.getClass(), "_hash", 0);
        setField(term65863, term65863.getClass(), "_valueHandler", null);
        setField(term65863, term65863.getClass(), "_typeHandler", null);
        setBooleanField(term65863, term65863.getClass(), "_asStatic", false);
        setField(term65861, term65861.getClass(), "_type", term65863);
        setField(term65858, term65858.getClass(), "_beanDesc", term65861);
        setField(term65858, term65858.getClass(), "_annotationIntrospector", term65864);
        setField(term65858, term65858.getClass(), "_defaultBean", null);
        setField(term65865, term65865.getClass(), "_valueInclusion", enum8);
        setField(term65865, term65865.getClass(), "_contentInclusion", enum8);
        setField(term65858, term65858.getClass(), "_defaultInclusion", term65865);
        setBooleanField(term65858, term65858.getClass(), "_useRealPropertyDefaults", false);
        term65869 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term65870 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term65871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term65869, term65869.getClass(), "_propCollector", null);
        setField(term65869, term65869.getClass(), "_config", null);
        setField(term65869, term65869.getClass(), "_annotationIntrospector", term65870);
        setField(term65869, term65869.getClass(), "_classInfo", null);
        setField(term65869, term65869.getClass(), "_properties", null);
        setField(term65869, term65869.getClass(), "_objectIdInfo", null);
        setField(term65871, term65871.getClass(), "_referencedType", null);
        setField(term65871, term65871.getClass(), "_anchorType", null);
        setField(term65871, term65871.getClass(), "_superClass", null);
        setField(term65871, term65871.getClass(), "_superInterfaces", null);
        setField(term65871, term65871.getClass(), "_bindings", null);
        setField(term65871, term65871.getClass(), "_canonicalName", null);
        setField(term65871, term65871.getClass(), "_class", null);
        setIntField(term65871, term65871.getClass(), "_hash", 0);
        setField(term65871, term65871.getClass(), "_valueHandler", null);
        setField(term65871, term65871.getClass(), "_typeHandler", null);
        setBooleanField(term65871, term65871.getClass(), "_asStatic", false);
        setField(term65869, term65869.getClass(), "_type", term65871);
        term65872 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65873 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term65872, term65872.getClass(), "_filterProvider", null);
        setField(term65872, term65872.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term65872, term65872.getClass(), "_serFeatures", 0);
        setIntField(term65872, term65872.getClass(), "_generatorFeatures", 0);
        setIntField(term65872, term65872.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term65872, term65872.getClass(), "_formatWriteFeatures", 0);
        setIntField(term65872, term65872.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term65872, term65872.getClass(), "_serializationInclusion", null);
        setField(term65872, term65872.getClass(), "_mixIns", null);
        setField(term65872, term65872.getClass(), "_subtypeResolver", null);
        setField(term65872, term65872.getClass(), "_rootName", null);
        setField(term65872, term65872.getClass(), "_view", null);
        setField(term65872, term65872.getClass(), "_attributes", null);
        setField(term65872, term65872.getClass(), "_rootNames", null);
        setField(term65873, term65873.getClass(), "_overrides", null);
        setField(term65872, term65872.getClass(), "_configOverrides", term65873);
        setIntField(term65872, term65872.getClass(), "_mapperFeatures", 0);
        setField(term65872, term65872.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term65101;
        args[1] = term65337;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65858));
        assertTrue(recursiveEquals(term65101, term65869));
        assertTrue(recursiveEquals(term65337, term65872));
    }

};


