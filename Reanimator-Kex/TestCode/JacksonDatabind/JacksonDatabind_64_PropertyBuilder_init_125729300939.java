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

public class PropertyBuilder_init_125729300939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25566;
     Object term25802;
     Object term26439;
     Object term26451;
     Object term26455;

    public PropertyBuilder_init_125729300939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25224 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term25330 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term25460 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term25224, term25224.getClass(), "_config", term25330);
        setField(term25224, term25224.getClass(), "_beanDesc", term25460);
        setField(term25224, term25224.getClass(), "_defaultInclusion", null);
        term25566 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term25672 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term25672, term25672.getClass(), "_overrides", null);
        setField(term25566, term25566.getClass(), "_configOverrides", term25672);
        setField(term25566, term25566.getClass(), "_serializationInclusion", null);
        term25802 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term25946 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term26064 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term26162 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term25802, term25802.getClass(), "_annotationIntrospector", term25946);
        setField(term25802, term25802.getClass(), "_classInfo", term26064);
        setField(term26162, term26162.getClass(), "_class", null);
        setField(term25802, term25802.getClass(), "_type", term26162);
        Class<? extends Object> term26458 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term26457 = ((Class) term26458).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term26457).setAccessible(true);
        Object enum2 = ((Field) term26457).get((Object) null);
        term26439 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term26440 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term26441 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term26442 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term26443 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term26444 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term26445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term26446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term26447 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term26440, term26440.getClass(), "_filterProvider", null);
        setField(term26440, term26440.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term26440, term26440.getClass(), "_serFeatures", 0);
        setIntField(term26440, term26440.getClass(), "_generatorFeatures", 0);
        setIntField(term26440, term26440.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term26440, term26440.getClass(), "_formatWriteFeatures", 0);
        setIntField(term26440, term26440.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term26440, term26440.getClass(), "_serializationInclusion", null);
        setField(term26440, term26440.getClass(), "_mixIns", null);
        setField(term26440, term26440.getClass(), "_subtypeResolver", null);
        setField(term26440, term26440.getClass(), "_rootName", null);
        setField(term26440, term26440.getClass(), "_view", null);
        setField(term26440, term26440.getClass(), "_attributes", null);
        setField(term26440, term26440.getClass(), "_rootNames", null);
        setField(term26441, term26441.getClass(), "_overrides", null);
        setField(term26440, term26440.getClass(), "_configOverrides", term26441);
        setIntField(term26440, term26440.getClass(), "_mapperFeatures", 0);
        setField(term26440, term26440.getClass(), "_base", null);
        setField(term26439, term26439.getClass(), "_config", term26440);
        setField(term26442, term26442.getClass(), "_propCollector", null);
        setField(term26442, term26442.getClass(), "_config", null);
        setField(term26442, term26442.getClass(), "_annotationIntrospector", term26443);
        setField(term26444, term26444.getClass(), "_type", null);
        setField(term26444, term26444.getClass(), "_class", null);
        setField(term26444, term26444.getClass(), "_bindings", null);
        setField(term26444, term26444.getClass(), "_superTypes", null);
        setField(term26444, term26444.getClass(), "_annotationIntrospector", null);
        setField(term26444, term26444.getClass(), "_typeFactory", null);
        setField(term26444, term26444.getClass(), "_mixInResolver", null);
        setField(term26444, term26444.getClass(), "_primaryMixIn", null);
        setField(term26444, term26444.getClass(), "_classAnnotations", null);
        setBooleanField(term26444, term26444.getClass(), "_creatorsResolved", false);
        setField(term26444, term26444.getClass(), "_defaultConstructor", null);
        setField(term26444, term26444.getClass(), "_constructors", null);
        setField(term26444, term26444.getClass(), "_creatorMethods", null);
        setField(term26444, term26444.getClass(), "_memberMethods", null);
        setField(term26444, term26444.getClass(), "_fields", null);
        setField(term26442, term26442.getClass(), "_classInfo", term26444);
        setField(term26442, term26442.getClass(), "_properties", null);
        setField(term26442, term26442.getClass(), "_objectIdInfo", null);
        setField(term26445, term26445.getClass(), "_superClass", null);
        setField(term26445, term26445.getClass(), "_superInterfaces", null);
        setField(term26445, term26445.getClass(), "_bindings", null);
        setField(term26445, term26445.getClass(), "_canonicalName", null);
        setField(term26445, term26445.getClass(), "_class", null);
        setIntField(term26445, term26445.getClass(), "_hash", 0);
        setField(term26445, term26445.getClass(), "_valueHandler", null);
        setField(term26445, term26445.getClass(), "_typeHandler", null);
        setBooleanField(term26445, term26445.getClass(), "_asStatic", false);
        setField(term26442, term26442.getClass(), "_type", term26445);
        setField(term26439, term26439.getClass(), "_beanDesc", term26442);
        setField(term26439, term26439.getClass(), "_annotationIntrospector", term26446);
        setField(term26439, term26439.getClass(), "_defaultBean", null);
        setField(term26447, term26447.getClass(), "_valueInclusion", enum2);
        setField(term26447, term26447.getClass(), "_contentInclusion", enum2);
        setField(term26439, term26439.getClass(), "_defaultInclusion", term26447);
        setBooleanField(term26439, term26439.getClass(), "_useRealPropertyDefaults", false);
        term26451 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term26452 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term26453 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term26454 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term26451, term26451.getClass(), "_propCollector", null);
        setField(term26451, term26451.getClass(), "_config", null);
        setField(term26451, term26451.getClass(), "_annotationIntrospector", term26452);
        setField(term26453, term26453.getClass(), "_type", null);
        setField(term26453, term26453.getClass(), "_class", null);
        setField(term26453, term26453.getClass(), "_bindings", null);
        setField(term26453, term26453.getClass(), "_superTypes", null);
        setField(term26453, term26453.getClass(), "_annotationIntrospector", null);
        setField(term26453, term26453.getClass(), "_typeFactory", null);
        setField(term26453, term26453.getClass(), "_mixInResolver", null);
        setField(term26453, term26453.getClass(), "_primaryMixIn", null);
        setField(term26453, term26453.getClass(), "_classAnnotations", null);
        setBooleanField(term26453, term26453.getClass(), "_creatorsResolved", false);
        setField(term26453, term26453.getClass(), "_defaultConstructor", null);
        setField(term26453, term26453.getClass(), "_constructors", null);
        setField(term26453, term26453.getClass(), "_creatorMethods", null);
        setField(term26453, term26453.getClass(), "_memberMethods", null);
        setField(term26453, term26453.getClass(), "_fields", null);
        setField(term26451, term26451.getClass(), "_classInfo", term26453);
        setField(term26451, term26451.getClass(), "_properties", null);
        setField(term26451, term26451.getClass(), "_objectIdInfo", null);
        setField(term26454, term26454.getClass(), "_superClass", null);
        setField(term26454, term26454.getClass(), "_superInterfaces", null);
        setField(term26454, term26454.getClass(), "_bindings", null);
        setField(term26454, term26454.getClass(), "_canonicalName", null);
        setField(term26454, term26454.getClass(), "_class", null);
        setIntField(term26454, term26454.getClass(), "_hash", 0);
        setField(term26454, term26454.getClass(), "_valueHandler", null);
        setField(term26454, term26454.getClass(), "_typeHandler", null);
        setBooleanField(term26454, term26454.getClass(), "_asStatic", false);
        setField(term26451, term26451.getClass(), "_type", term26454);
        term26455 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term26456 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term26455, term26455.getClass(), "_filterProvider", null);
        setField(term26455, term26455.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term26455, term26455.getClass(), "_serFeatures", 0);
        setIntField(term26455, term26455.getClass(), "_generatorFeatures", 0);
        setIntField(term26455, term26455.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term26455, term26455.getClass(), "_formatWriteFeatures", 0);
        setIntField(term26455, term26455.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term26455, term26455.getClass(), "_serializationInclusion", null);
        setField(term26455, term26455.getClass(), "_mixIns", null);
        setField(term26455, term26455.getClass(), "_subtypeResolver", null);
        setField(term26455, term26455.getClass(), "_rootName", null);
        setField(term26455, term26455.getClass(), "_view", null);
        setField(term26455, term26455.getClass(), "_attributes", null);
        setField(term26455, term26455.getClass(), "_rootNames", null);
        setField(term26456, term26456.getClass(), "_overrides", null);
        setField(term26455, term26455.getClass(), "_configOverrides", term26456);
        setIntField(term26455, term26455.getClass(), "_mapperFeatures", 0);
        setField(term26455, term26455.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term25566;
        args[1] = term25802;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26439));
        assertTrue(recursiveEquals(term25566, term26451));
        assertTrue(recursiveEquals(term25802, term26455));
    }

};


