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
     Object term42209;
     Object term42445;
     Object term42608;
     Object term42614;
     Object term42616;

    public PropertyBuilder_init_125729300953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41997 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term42103 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term41997, term41997.getClass(), "_config", term42103);
        setField(term41997, term41997.getClass(), "_beanDesc", null);
        term42209 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term42315 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term42209, term42209.getClass(), "_configOverrides", term42315);
        term42445 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term42551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term42551, term42551.getClass(), "_class", null);
        setField(term42445, term42445.getClass(), "_type", term42551);
        term42608 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term42609 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term42610 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term42611 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term42612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term42613 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term42609, term42609.getClass(), "_filterProvider", null);
        setField(term42609, term42609.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term42609, term42609.getClass(), "_serFeatures", 0);
        setIntField(term42609, term42609.getClass(), "_generatorFeatures", 0);
        setIntField(term42609, term42609.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term42609, term42609.getClass(), "_formatWriteFeatures", 0);
        setIntField(term42609, term42609.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term42609, term42609.getClass(), "_serializationInclusion", null);
        setField(term42609, term42609.getClass(), "_mixIns", null);
        setField(term42609, term42609.getClass(), "_subtypeResolver", null);
        setField(term42609, term42609.getClass(), "_rootName", null);
        setField(term42609, term42609.getClass(), "_view", null);
        setField(term42609, term42609.getClass(), "_attributes", null);
        setField(term42609, term42609.getClass(), "_rootNames", null);
        setField(term42610, term42610.getClass(), "_overrides", null);
        setField(term42609, term42609.getClass(), "_configOverrides", term42610);
        setIntField(term42609, term42609.getClass(), "_mapperFeatures", 0);
        setField(term42609, term42609.getClass(), "_base", null);
        setField(term42608, term42608.getClass(), "_config", term42609);
        setField(term42611, term42611.getClass(), "_propCollector", null);
        setField(term42611, term42611.getClass(), "_config", null);
        setField(term42611, term42611.getClass(), "_annotationIntrospector", null);
        setField(term42611, term42611.getClass(), "_classInfo", null);
        setField(term42611, term42611.getClass(), "_properties", null);
        setField(term42611, term42611.getClass(), "_objectIdInfo", null);
        setField(term42612, term42612.getClass(), "_elementType", null);
        setField(term42612, term42612.getClass(), "_superClass", null);
        setField(term42612, term42612.getClass(), "_superInterfaces", null);
        setField(term42612, term42612.getClass(), "_bindings", null);
        setField(term42612, term42612.getClass(), "_canonicalName", null);
        setField(term42612, term42612.getClass(), "_class", null);
        setIntField(term42612, term42612.getClass(), "_hash", 0);
        setField(term42612, term42612.getClass(), "_valueHandler", null);
        setField(term42612, term42612.getClass(), "_typeHandler", null);
        setBooleanField(term42612, term42612.getClass(), "_asStatic", false);
        setField(term42611, term42611.getClass(), "_type", term42612);
        setField(term42608, term42608.getClass(), "_beanDesc", term42611);
        setField(term42608, term42608.getClass(), "_defaultInclusion", null);
        setField(term42608, term42608.getClass(), "_annotationIntrospector", term42613);
        setField(term42608, term42608.getClass(), "_defaultBean", null);
        term42614 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term42615 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term42614, term42614.getClass(), "_propCollector", null);
        setField(term42614, term42614.getClass(), "_config", null);
        setField(term42614, term42614.getClass(), "_annotationIntrospector", null);
        setField(term42614, term42614.getClass(), "_classInfo", null);
        setField(term42614, term42614.getClass(), "_properties", null);
        setField(term42614, term42614.getClass(), "_objectIdInfo", null);
        setField(term42615, term42615.getClass(), "_elementType", null);
        setField(term42615, term42615.getClass(), "_superClass", null);
        setField(term42615, term42615.getClass(), "_superInterfaces", null);
        setField(term42615, term42615.getClass(), "_bindings", null);
        setField(term42615, term42615.getClass(), "_canonicalName", null);
        setField(term42615, term42615.getClass(), "_class", null);
        setIntField(term42615, term42615.getClass(), "_hash", 0);
        setField(term42615, term42615.getClass(), "_valueHandler", null);
        setField(term42615, term42615.getClass(), "_typeHandler", null);
        setBooleanField(term42615, term42615.getClass(), "_asStatic", false);
        setField(term42614, term42614.getClass(), "_type", term42615);
        term42616 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term42617 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term42616, term42616.getClass(), "_filterProvider", null);
        setField(term42616, term42616.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term42616, term42616.getClass(), "_serFeatures", 0);
        setIntField(term42616, term42616.getClass(), "_generatorFeatures", 0);
        setIntField(term42616, term42616.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term42616, term42616.getClass(), "_formatWriteFeatures", 0);
        setIntField(term42616, term42616.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term42616, term42616.getClass(), "_serializationInclusion", null);
        setField(term42616, term42616.getClass(), "_mixIns", null);
        setField(term42616, term42616.getClass(), "_subtypeResolver", null);
        setField(term42616, term42616.getClass(), "_rootName", null);
        setField(term42616, term42616.getClass(), "_view", null);
        setField(term42616, term42616.getClass(), "_attributes", null);
        setField(term42616, term42616.getClass(), "_rootNames", null);
        setField(term42617, term42617.getClass(), "_overrides", null);
        setField(term42616, term42616.getClass(), "_configOverrides", term42617);
        setIntField(term42616, term42616.getClass(), "_mapperFeatures", 0);
        setField(term42616, term42616.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term42209;
        args[1] = term42445;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42608));
        assertTrue(recursiveEquals(term42209, term42614));
        assertTrue(recursiveEquals(term42445, term42616));
    }

};


