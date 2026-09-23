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

public class PropertyBuilder_init_125729300945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31867;
     Object term32209;
     Object term32697;
     Object term32705;
     Object term32708;

    public PropertyBuilder_init_125729300945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31525 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term31631 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31761 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term31525, term31525.getClass(), "_config", term31631);
        setField(term31525, term31525.getClass(), "_beanDesc", term31761);
        term31867 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31973 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term32079 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term31973, term31973.getClass(), "_overrides", null);
        setField(term31867, term31867.getClass(), "_configOverrides", term31973);
        setField(term31867, term31867.getClass(), "_serializationInclusion", term32079);
        term32209 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term32353 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term32451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term32209, term32209.getClass(), "_annotationIntrospector", term32353);
        setField(term32209, term32209.getClass(), "_classInfo", null);
        setField(term32451, term32451.getClass(), "_class", null);
        setField(term32209, term32209.getClass(), "_type", term32451);
        term32697 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term32698 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term32699 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term32700 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term32701 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term32702 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term32703 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term32704 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term32698, term32698.getClass(), "_filterProvider", null);
        setField(term32698, term32698.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term32698, term32698.getClass(), "_serFeatures", 0);
        setIntField(term32698, term32698.getClass(), "_generatorFeatures", 0);
        setIntField(term32698, term32698.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term32698, term32698.getClass(), "_formatWriteFeatures", 0);
        setIntField(term32698, term32698.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term32699, term32699.getClass(), "_valueInclusion", null);
        setField(term32699, term32699.getClass(), "_contentInclusion", null);
        setField(term32698, term32698.getClass(), "_serializationInclusion", term32699);
        setField(term32698, term32698.getClass(), "_mixIns", null);
        setField(term32698, term32698.getClass(), "_subtypeResolver", null);
        setField(term32698, term32698.getClass(), "_rootName", null);
        setField(term32698, term32698.getClass(), "_view", null);
        setField(term32698, term32698.getClass(), "_attributes", null);
        setField(term32698, term32698.getClass(), "_rootNames", null);
        setField(term32700, term32700.getClass(), "_overrides", null);
        setField(term32698, term32698.getClass(), "_configOverrides", term32700);
        setIntField(term32698, term32698.getClass(), "_mapperFeatures", 0);
        setField(term32698, term32698.getClass(), "_base", null);
        setField(term32697, term32697.getClass(), "_config", term32698);
        setField(term32701, term32701.getClass(), "_propCollector", null);
        setField(term32701, term32701.getClass(), "_config", null);
        setField(term32701, term32701.getClass(), "_annotationIntrospector", term32702);
        setField(term32701, term32701.getClass(), "_classInfo", null);
        setField(term32701, term32701.getClass(), "_properties", null);
        setField(term32701, term32701.getClass(), "_objectIdInfo", null);
        setField(term32703, term32703.getClass(), "_superClass", null);
        setField(term32703, term32703.getClass(), "_superInterfaces", null);
        setField(term32703, term32703.getClass(), "_bindings", null);
        setField(term32703, term32703.getClass(), "_canonicalName", null);
        setField(term32703, term32703.getClass(), "_class", null);
        setIntField(term32703, term32703.getClass(), "_hash", 0);
        setField(term32703, term32703.getClass(), "_valueHandler", null);
        setField(term32703, term32703.getClass(), "_typeHandler", null);
        setBooleanField(term32703, term32703.getClass(), "_asStatic", false);
        setField(term32701, term32701.getClass(), "_type", term32703);
        setField(term32697, term32697.getClass(), "_beanDesc", term32701);
        setField(term32697, term32697.getClass(), "_annotationIntrospector", term32704);
        setField(term32697, term32697.getClass(), "_defaultBean", null);
        setField(term32697, term32697.getClass(), "_defaultInclusion", term32699);
        setBooleanField(term32697, term32697.getClass(), "_useRealPropertyDefaults", false);
        term32705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term32706 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term32707 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term32705, term32705.getClass(), "_propCollector", null);
        setField(term32705, term32705.getClass(), "_config", null);
        setField(term32705, term32705.getClass(), "_annotationIntrospector", term32706);
        setField(term32705, term32705.getClass(), "_classInfo", null);
        setField(term32705, term32705.getClass(), "_properties", null);
        setField(term32705, term32705.getClass(), "_objectIdInfo", null);
        setField(term32707, term32707.getClass(), "_superClass", null);
        setField(term32707, term32707.getClass(), "_superInterfaces", null);
        setField(term32707, term32707.getClass(), "_bindings", null);
        setField(term32707, term32707.getClass(), "_canonicalName", null);
        setField(term32707, term32707.getClass(), "_class", null);
        setIntField(term32707, term32707.getClass(), "_hash", 0);
        setField(term32707, term32707.getClass(), "_valueHandler", null);
        setField(term32707, term32707.getClass(), "_typeHandler", null);
        setBooleanField(term32707, term32707.getClass(), "_asStatic", false);
        setField(term32705, term32705.getClass(), "_type", term32707);
        term32708 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term32709 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term32710 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term32708, term32708.getClass(), "_filterProvider", null);
        setField(term32708, term32708.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term32708, term32708.getClass(), "_serFeatures", 0);
        setIntField(term32708, term32708.getClass(), "_generatorFeatures", 0);
        setIntField(term32708, term32708.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term32708, term32708.getClass(), "_formatWriteFeatures", 0);
        setIntField(term32708, term32708.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term32709, term32709.getClass(), "_valueInclusion", null);
        setField(term32709, term32709.getClass(), "_contentInclusion", null);
        setField(term32708, term32708.getClass(), "_serializationInclusion", term32709);
        setField(term32708, term32708.getClass(), "_mixIns", null);
        setField(term32708, term32708.getClass(), "_subtypeResolver", null);
        setField(term32708, term32708.getClass(), "_rootName", null);
        setField(term32708, term32708.getClass(), "_view", null);
        setField(term32708, term32708.getClass(), "_attributes", null);
        setField(term32708, term32708.getClass(), "_rootNames", null);
        setField(term32710, term32710.getClass(), "_overrides", null);
        setField(term32708, term32708.getClass(), "_configOverrides", term32710);
        setIntField(term32708, term32708.getClass(), "_mapperFeatures", 0);
        setField(term32708, term32708.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term31867;
        args[1] = term32209;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32697));
        assertTrue(recursiveEquals(term31867, term32705));
        assertTrue(recursiveEquals(term32209, term32708));
    }

};


