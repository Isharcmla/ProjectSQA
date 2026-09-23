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

public class PropertyBuilder_init_125729300983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78107;
     Object term78391;
     Object term78726;
     Object term78737;
     Object term78739;

    public PropertyBuilder_init_125729300983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77765 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term77871 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term78001 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term77765, term77765.getClass(), "_config", term77871);
        setField(term77765, term77765.getClass(), "_beanDesc", term78001);
        HashMap term78261 = new HashMap();
        term78107 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term78213 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term78213, term78213.getClass(), "_overrides", term78261);
        setField(term78107, term78107.getClass(), "_configOverrides", term78213);
        term78391 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term78495 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term78391, term78391.getClass(), "_annotationIntrospector", null);
        setField(term78495, term78495.getClass(), "_class", null);
        setField(term78391, term78391.getClass(), "_type", term78495);
        HashMap term78729 = new HashMap();
        Class<? extends Object> term78743 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term78742 = ((Class) term78743).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term78742).setAccessible(true);
        Object enum10 = ((Field) term78742).get((Object) null);
        term78726 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term78727 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term78728 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term78730 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term78731 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78732 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term78733 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term78727, term78727.getClass(), "_filterProvider", null);
        setField(term78727, term78727.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term78727, term78727.getClass(), "_serFeatures", 0);
        setIntField(term78727, term78727.getClass(), "_generatorFeatures", 0);
        setIntField(term78727, term78727.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term78727, term78727.getClass(), "_formatWriteFeatures", 0);
        setIntField(term78727, term78727.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term78727, term78727.getClass(), "_serializationInclusion", null);
        setField(term78727, term78727.getClass(), "_mixIns", null);
        setField(term78727, term78727.getClass(), "_subtypeResolver", null);
        setField(term78727, term78727.getClass(), "_rootName", null);
        setField(term78727, term78727.getClass(), "_view", null);
        setField(term78727, term78727.getClass(), "_attributes", null);
        setField(term78727, term78727.getClass(), "_rootNames", null);
        setField(term78728, term78728.getClass(), "_overrides", term78729);
        setField(term78727, term78727.getClass(), "_configOverrides", term78728);
        setIntField(term78727, term78727.getClass(), "_mapperFeatures", 0);
        setField(term78727, term78727.getClass(), "_base", null);
        setField(term78726, term78726.getClass(), "_config", term78727);
        setField(term78730, term78730.getClass(), "_propCollector", null);
        setField(term78730, term78730.getClass(), "_config", null);
        setField(term78730, term78730.getClass(), "_annotationIntrospector", null);
        setField(term78730, term78730.getClass(), "_classInfo", null);
        setField(term78730, term78730.getClass(), "_properties", null);
        setField(term78730, term78730.getClass(), "_objectIdInfo", null);
        setField(term78731, term78731.getClass(), "_referencedType", null);
        setField(term78731, term78731.getClass(), "_anchorType", null);
        setField(term78731, term78731.getClass(), "_superClass", null);
        setField(term78731, term78731.getClass(), "_superInterfaces", null);
        setField(term78731, term78731.getClass(), "_bindings", null);
        setField(term78731, term78731.getClass(), "_canonicalName", null);
        setField(term78731, term78731.getClass(), "_class", null);
        setIntField(term78731, term78731.getClass(), "_hash", 0);
        setField(term78731, term78731.getClass(), "_valueHandler", null);
        setField(term78731, term78731.getClass(), "_typeHandler", null);
        setBooleanField(term78731, term78731.getClass(), "_asStatic", false);
        setField(term78730, term78730.getClass(), "_type", term78731);
        setField(term78726, term78726.getClass(), "_beanDesc", term78730);
        setField(term78726, term78726.getClass(), "_annotationIntrospector", term78732);
        setField(term78726, term78726.getClass(), "_defaultBean", null);
        setField(term78733, term78733.getClass(), "_valueInclusion", enum10);
        setField(term78733, term78733.getClass(), "_contentInclusion", enum10);
        setField(term78726, term78726.getClass(), "_defaultInclusion", term78733);
        setBooleanField(term78726, term78726.getClass(), "_useRealPropertyDefaults", false);
        term78737 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term78738 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term78737, term78737.getClass(), "_propCollector", null);
        setField(term78737, term78737.getClass(), "_config", null);
        setField(term78737, term78737.getClass(), "_annotationIntrospector", null);
        setField(term78737, term78737.getClass(), "_classInfo", null);
        setField(term78737, term78737.getClass(), "_properties", null);
        setField(term78737, term78737.getClass(), "_objectIdInfo", null);
        setField(term78738, term78738.getClass(), "_referencedType", null);
        setField(term78738, term78738.getClass(), "_anchorType", null);
        setField(term78738, term78738.getClass(), "_superClass", null);
        setField(term78738, term78738.getClass(), "_superInterfaces", null);
        setField(term78738, term78738.getClass(), "_bindings", null);
        setField(term78738, term78738.getClass(), "_canonicalName", null);
        setField(term78738, term78738.getClass(), "_class", null);
        setIntField(term78738, term78738.getClass(), "_hash", 0);
        setField(term78738, term78738.getClass(), "_valueHandler", null);
        setField(term78738, term78738.getClass(), "_typeHandler", null);
        setBooleanField(term78738, term78738.getClass(), "_asStatic", false);
        setField(term78737, term78737.getClass(), "_type", term78738);
        HashMap term78741 = new HashMap();
        term78739 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term78740 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term78739, term78739.getClass(), "_filterProvider", null);
        setField(term78739, term78739.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term78739, term78739.getClass(), "_serFeatures", 0);
        setIntField(term78739, term78739.getClass(), "_generatorFeatures", 0);
        setIntField(term78739, term78739.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term78739, term78739.getClass(), "_formatWriteFeatures", 0);
        setIntField(term78739, term78739.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term78739, term78739.getClass(), "_serializationInclusion", null);
        setField(term78739, term78739.getClass(), "_mixIns", null);
        setField(term78739, term78739.getClass(), "_subtypeResolver", null);
        setField(term78739, term78739.getClass(), "_rootName", null);
        setField(term78739, term78739.getClass(), "_view", null);
        setField(term78739, term78739.getClass(), "_attributes", null);
        setField(term78739, term78739.getClass(), "_rootNames", null);
        setField(term78740, term78740.getClass(), "_overrides", term78741);
        setField(term78739, term78739.getClass(), "_configOverrides", term78740);
        setIntField(term78739, term78739.getClass(), "_mapperFeatures", 0);
        setField(term78739, term78739.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term78107;
        args[1] = term78391;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78726));
        assertTrue(recursiveEquals(term78107, term78737));
        assertTrue(recursiveEquals(term78391, term78739));
    }

};


