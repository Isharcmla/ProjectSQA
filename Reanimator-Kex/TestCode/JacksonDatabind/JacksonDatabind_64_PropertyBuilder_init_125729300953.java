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

public class PropertyBuilder_init_125729300953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43375;
     Object term43717;
     Object term44026;
     Object term44033;
     Object term44035;

    public PropertyBuilder_init_125729300953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43163 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term43269 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term43163, term43163.getClass(), "_config", null);
        setField(term43163, term43163.getClass(), "_beanDesc", null);
        setField(term43163, term43163.getClass(), "_defaultInclusion", term43269);
        term43375 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term43481 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term43587 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term43481, term43481.getClass(), "_overrides", null);
        setField(term43375, term43375.getClass(), "_configOverrides", term43481);
        setField(term43375, term43375.getClass(), "_serializationInclusion", term43587);
        term43717 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term43837 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term43717, term43717.getClass(), "_annotationIntrospector", null);
        setField(term43837, term43837.getClass(), "_class", null);
        setField(term43717, term43717.getClass(), "_type", term43837);
        term44026 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term44027 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term44028 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term44029 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term44030 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term44031 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term44032 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term44027, term44027.getClass(), "_filterProvider", null);
        setField(term44027, term44027.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term44027, term44027.getClass(), "_serFeatures", 0);
        setIntField(term44027, term44027.getClass(), "_generatorFeatures", 0);
        setIntField(term44027, term44027.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term44027, term44027.getClass(), "_formatWriteFeatures", 0);
        setIntField(term44027, term44027.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term44028, term44028.getClass(), "_valueInclusion", null);
        setField(term44028, term44028.getClass(), "_contentInclusion", null);
        setField(term44027, term44027.getClass(), "_serializationInclusion", term44028);
        setField(term44027, term44027.getClass(), "_mixIns", null);
        setField(term44027, term44027.getClass(), "_subtypeResolver", null);
        setField(term44027, term44027.getClass(), "_rootName", null);
        setField(term44027, term44027.getClass(), "_view", null);
        setField(term44027, term44027.getClass(), "_attributes", null);
        setField(term44027, term44027.getClass(), "_rootNames", null);
        setField(term44029, term44029.getClass(), "_overrides", null);
        setField(term44027, term44027.getClass(), "_configOverrides", term44029);
        setIntField(term44027, term44027.getClass(), "_mapperFeatures", 0);
        setField(term44027, term44027.getClass(), "_base", null);
        setField(term44026, term44026.getClass(), "_config", term44027);
        setField(term44030, term44030.getClass(), "_propCollector", null);
        setField(term44030, term44030.getClass(), "_config", null);
        setField(term44030, term44030.getClass(), "_annotationIntrospector", null);
        setField(term44030, term44030.getClass(), "_classInfo", null);
        setField(term44030, term44030.getClass(), "_properties", null);
        setField(term44030, term44030.getClass(), "_objectIdInfo", null);
        setField(term44031, term44031.getClass(), "_referencedType", null);
        setField(term44031, term44031.getClass(), "_superClass", null);
        setField(term44031, term44031.getClass(), "_superInterfaces", null);
        setField(term44031, term44031.getClass(), "_bindings", null);
        setField(term44031, term44031.getClass(), "_canonicalName", null);
        setField(term44031, term44031.getClass(), "_class", null);
        setIntField(term44031, term44031.getClass(), "_hash", 0);
        setField(term44031, term44031.getClass(), "_valueHandler", null);
        setField(term44031, term44031.getClass(), "_typeHandler", null);
        setBooleanField(term44031, term44031.getClass(), "_asStatic", false);
        setField(term44030, term44030.getClass(), "_type", term44031);
        setField(term44026, term44026.getClass(), "_beanDesc", term44030);
        setField(term44026, term44026.getClass(), "_annotationIntrospector", term44032);
        setField(term44026, term44026.getClass(), "_defaultBean", null);
        setField(term44026, term44026.getClass(), "_defaultInclusion", term44028);
        setBooleanField(term44026, term44026.getClass(), "_useRealPropertyDefaults", false);
        term44033 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term44034 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term44033, term44033.getClass(), "_propCollector", null);
        setField(term44033, term44033.getClass(), "_config", null);
        setField(term44033, term44033.getClass(), "_annotationIntrospector", null);
        setField(term44033, term44033.getClass(), "_classInfo", null);
        setField(term44033, term44033.getClass(), "_properties", null);
        setField(term44033, term44033.getClass(), "_objectIdInfo", null);
        setField(term44034, term44034.getClass(), "_referencedType", null);
        setField(term44034, term44034.getClass(), "_superClass", null);
        setField(term44034, term44034.getClass(), "_superInterfaces", null);
        setField(term44034, term44034.getClass(), "_bindings", null);
        setField(term44034, term44034.getClass(), "_canonicalName", null);
        setField(term44034, term44034.getClass(), "_class", null);
        setIntField(term44034, term44034.getClass(), "_hash", 0);
        setField(term44034, term44034.getClass(), "_valueHandler", null);
        setField(term44034, term44034.getClass(), "_typeHandler", null);
        setBooleanField(term44034, term44034.getClass(), "_asStatic", false);
        setField(term44033, term44033.getClass(), "_type", term44034);
        term44035 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term44036 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term44037 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term44035, term44035.getClass(), "_filterProvider", null);
        setField(term44035, term44035.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term44035, term44035.getClass(), "_serFeatures", 0);
        setIntField(term44035, term44035.getClass(), "_generatorFeatures", 0);
        setIntField(term44035, term44035.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term44035, term44035.getClass(), "_formatWriteFeatures", 0);
        setIntField(term44035, term44035.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term44036, term44036.getClass(), "_valueInclusion", null);
        setField(term44036, term44036.getClass(), "_contentInclusion", null);
        setField(term44035, term44035.getClass(), "_serializationInclusion", term44036);
        setField(term44035, term44035.getClass(), "_mixIns", null);
        setField(term44035, term44035.getClass(), "_subtypeResolver", null);
        setField(term44035, term44035.getClass(), "_rootName", null);
        setField(term44035, term44035.getClass(), "_view", null);
        setField(term44035, term44035.getClass(), "_attributes", null);
        setField(term44035, term44035.getClass(), "_rootNames", null);
        setField(term44037, term44037.getClass(), "_overrides", null);
        setField(term44035, term44035.getClass(), "_configOverrides", term44037);
        setIntField(term44035, term44035.getClass(), "_mapperFeatures", 0);
        setField(term44035, term44035.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term43375;
        args[1] = term43717;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44026));
        assertTrue(recursiveEquals(term43375, term44033));
        assertTrue(recursiveEquals(term43717, term44035));
    }

};


