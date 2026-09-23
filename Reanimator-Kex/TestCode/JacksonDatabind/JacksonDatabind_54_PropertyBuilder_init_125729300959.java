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

public class PropertyBuilder_init_125729300959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49607;
     Object term49843;
     Object term50020;
     Object term50026;
     Object term50028;

    public PropertyBuilder_init_125729300959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49395 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term49501 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term49395, term49395.getClass(), "_config", term49501);
        setField(term49395, term49395.getClass(), "_beanDesc", null);
        term49607 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49713 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term49607, term49607.getClass(), "_configOverrides", term49713);
        term49843 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term49963 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term49963, term49963.getClass(), "_class", null);
        setField(term49843, term49843.getClass(), "_type", term49963);
        term50020 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term50021 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term50022 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term50023 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term50024 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term50025 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term50021, term50021.getClass(), "_filterProvider", null);
        setField(term50021, term50021.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term50021, term50021.getClass(), "_serFeatures", 0);
        setIntField(term50021, term50021.getClass(), "_generatorFeatures", 0);
        setIntField(term50021, term50021.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term50021, term50021.getClass(), "_formatWriteFeatures", 0);
        setIntField(term50021, term50021.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term50021, term50021.getClass(), "_serializationInclusion", null);
        setField(term50021, term50021.getClass(), "_mixIns", null);
        setField(term50021, term50021.getClass(), "_subtypeResolver", null);
        setField(term50021, term50021.getClass(), "_rootName", null);
        setField(term50021, term50021.getClass(), "_view", null);
        setField(term50021, term50021.getClass(), "_attributes", null);
        setField(term50021, term50021.getClass(), "_rootNames", null);
        setField(term50022, term50022.getClass(), "_overrides", null);
        setField(term50021, term50021.getClass(), "_configOverrides", term50022);
        setIntField(term50021, term50021.getClass(), "_mapperFeatures", 0);
        setField(term50021, term50021.getClass(), "_base", null);
        setField(term50020, term50020.getClass(), "_config", term50021);
        setField(term50023, term50023.getClass(), "_propCollector", null);
        setField(term50023, term50023.getClass(), "_config", null);
        setField(term50023, term50023.getClass(), "_annotationIntrospector", null);
        setField(term50023, term50023.getClass(), "_classInfo", null);
        setField(term50023, term50023.getClass(), "_properties", null);
        setField(term50023, term50023.getClass(), "_objectIdInfo", null);
        setField(term50024, term50024.getClass(), "_referencedType", null);
        setField(term50024, term50024.getClass(), "_superClass", null);
        setField(term50024, term50024.getClass(), "_superInterfaces", null);
        setField(term50024, term50024.getClass(), "_bindings", null);
        setField(term50024, term50024.getClass(), "_canonicalName", null);
        setField(term50024, term50024.getClass(), "_class", null);
        setIntField(term50024, term50024.getClass(), "_hash", 0);
        setField(term50024, term50024.getClass(), "_valueHandler", null);
        setField(term50024, term50024.getClass(), "_typeHandler", null);
        setBooleanField(term50024, term50024.getClass(), "_asStatic", false);
        setField(term50023, term50023.getClass(), "_type", term50024);
        setField(term50020, term50020.getClass(), "_beanDesc", term50023);
        setField(term50020, term50020.getClass(), "_defaultInclusion", null);
        setField(term50020, term50020.getClass(), "_annotationIntrospector", term50025);
        setField(term50020, term50020.getClass(), "_defaultBean", null);
        term50026 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term50027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term50026, term50026.getClass(), "_propCollector", null);
        setField(term50026, term50026.getClass(), "_config", null);
        setField(term50026, term50026.getClass(), "_annotationIntrospector", null);
        setField(term50026, term50026.getClass(), "_classInfo", null);
        setField(term50026, term50026.getClass(), "_properties", null);
        setField(term50026, term50026.getClass(), "_objectIdInfo", null);
        setField(term50027, term50027.getClass(), "_referencedType", null);
        setField(term50027, term50027.getClass(), "_superClass", null);
        setField(term50027, term50027.getClass(), "_superInterfaces", null);
        setField(term50027, term50027.getClass(), "_bindings", null);
        setField(term50027, term50027.getClass(), "_canonicalName", null);
        setField(term50027, term50027.getClass(), "_class", null);
        setIntField(term50027, term50027.getClass(), "_hash", 0);
        setField(term50027, term50027.getClass(), "_valueHandler", null);
        setField(term50027, term50027.getClass(), "_typeHandler", null);
        setBooleanField(term50027, term50027.getClass(), "_asStatic", false);
        setField(term50026, term50026.getClass(), "_type", term50027);
        term50028 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term50029 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term50028, term50028.getClass(), "_filterProvider", null);
        setField(term50028, term50028.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term50028, term50028.getClass(), "_serFeatures", 0);
        setIntField(term50028, term50028.getClass(), "_generatorFeatures", 0);
        setIntField(term50028, term50028.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term50028, term50028.getClass(), "_formatWriteFeatures", 0);
        setIntField(term50028, term50028.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term50028, term50028.getClass(), "_serializationInclusion", null);
        setField(term50028, term50028.getClass(), "_mixIns", null);
        setField(term50028, term50028.getClass(), "_subtypeResolver", null);
        setField(term50028, term50028.getClass(), "_rootName", null);
        setField(term50028, term50028.getClass(), "_view", null);
        setField(term50028, term50028.getClass(), "_attributes", null);
        setField(term50028, term50028.getClass(), "_rootNames", null);
        setField(term50029, term50029.getClass(), "_overrides", null);
        setField(term50028, term50028.getClass(), "_configOverrides", term50029);
        setIntField(term50028, term50028.getClass(), "_mapperFeatures", 0);
        setField(term50028, term50028.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term49607;
        args[1] = term49843;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term50020));
        assertTrue(recursiveEquals(term49607, term50026));
        assertTrue(recursiveEquals(term49843, term50028));
    }

};


