package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.Object;

public class POJOPropertiesCollector_init_1286093710145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79498;
     Object term79864;
     Object term80221;
     Object term80229;
     Object term80232;

    public POJOPropertiesCollector_init_1286093710145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79388 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(term79388, term79388.getClass(), "_config", null);
        setBooleanField(term79388, term79388.getClass(), "_stdBeanNaming", false);
        setBooleanField(term79388, term79388.getClass(), "_forSerialization", false);
        setField(term79388, term79388.getClass(), "_type", null);
        setField(term79388, term79388.getClass(), "_classDef", null);
        setField(term79388, term79388.getClass(), "_mutatorPrefix", null);
        setField(term79388, term79388.getClass(), "_annotationIntrospector", null);
        term79498 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term79598 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term79746 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term79498, term79498.getClass(), "_mapperFeatures", -2);
        setField(term79598, term79598.getClass(), "_annotationIntrospector", term79746);
        setField(term79598, term79598.getClass(), "_visibilityChecker", null);
        setField(term79498, term79498.getClass(), "_base", term79598);
        term79864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term79980 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term79864, term79864.getClass(), "_classAnnotations", term79980);
        term80221 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term80222 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80223 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term80224 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term80225 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term80226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term80222, term80222.getClass(), "_problemHandlers", null);
        setField(term80222, term80222.getClass(), "_nodeFactory", null);
        setIntField(term80222, term80222.getClass(), "_deserFeatures", 0);
        setIntField(term80222, term80222.getClass(), "_parserFeatures", 0);
        setIntField(term80222, term80222.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term80222, term80222.getClass(), "_formatReadFeatures", 0);
        setIntField(term80222, term80222.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term80222, term80222.getClass(), "_mixIns", null);
        setField(term80222, term80222.getClass(), "_subtypeResolver", null);
        setField(term80222, term80222.getClass(), "_rootName", null);
        setField(term80222, term80222.getClass(), "_view", null);
        setField(term80222, term80222.getClass(), "_attributes", null);
        setField(term80222, term80222.getClass(), "_rootNames", null);
        setField(term80222, term80222.getClass(), "_configOverrides", null);
        setIntField(term80222, term80222.getClass(), "_mapperFeatures", -2);
        setField(term80223, term80223.getClass(), "_classIntrospector", null);
        setField(term80224, term80224.getClass(), "_annotationsInside", null);
        setBooleanField(term80224, term80224.getClass(), "_cfgConstructorPropertiesImpliesCreator", false);
        setField(term80223, term80223.getClass(), "_annotationIntrospector", term80224);
        setField(term80223, term80223.getClass(), "_visibilityChecker", null);
        setField(term80223, term80223.getClass(), "_propertyNamingStrategy", null);
        setField(term80223, term80223.getClass(), "_typeFactory", null);
        setField(term80223, term80223.getClass(), "_typeResolverBuilder", null);
        setField(term80223, term80223.getClass(), "_dateFormat", null);
        setField(term80223, term80223.getClass(), "_handlerInstantiator", null);
        setField(term80223, term80223.getClass(), "_locale", null);
        setField(term80223, term80223.getClass(), "_timeZone", null);
        setField(term80223, term80223.getClass(), "_defaultBase64", null);
        setField(term80222, term80222.getClass(), "_base", term80223);
        setField(term80221, term80221.getClass(), "_config", term80222);
        setBooleanField(term80221, term80221.getClass(), "_forSerialization", true);
        setBooleanField(term80221, term80221.getClass(), "_stdBeanNaming", true);
        setField(term80221, term80221.getClass(), "_type", null);
        setField(term80225, term80225.getClass(), "_type", null);
        setField(term80225, term80225.getClass(), "_class", null);
        setField(term80225, term80225.getClass(), "_bindings", null);
        setField(term80225, term80225.getClass(), "_superTypes", null);
        setField(term80225, term80225.getClass(), "_annotationIntrospector", null);
        setField(term80225, term80225.getClass(), "_typeFactory", null);
        setField(term80225, term80225.getClass(), "_mixInResolver", null);
        setField(term80225, term80225.getClass(), "_primaryMixIn", null);
        setField(term80226, term80226.getClass(), "_annotations", null);
        setField(term80225, term80225.getClass(), "_classAnnotations", term80226);
        setBooleanField(term80225, term80225.getClass(), "_creatorsResolved", false);
        setField(term80225, term80225.getClass(), "_defaultConstructor", null);
        setField(term80225, term80225.getClass(), "_constructors", null);
        setField(term80225, term80225.getClass(), "_creatorMethods", null);
        setField(term80225, term80225.getClass(), "_memberMethods", null);
        setField(term80225, term80225.getClass(), "_fields", null);
        setField(term80225, term80225.getClass(), "_nonStaticInnerClass", null);
        setField(term80221, term80221.getClass(), "_classDef", term80225);
        setField(term80221, term80221.getClass(), "_visibilityChecker", null);
        setField(term80221, term80221.getClass(), "_annotationIntrospector", null);
        setField(term80221, term80221.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term80221, term80221.getClass(), "_collected", false);
        setField(term80221, term80221.getClass(), "_properties", null);
        setField(term80221, term80221.getClass(), "_creatorProperties", null);
        setField(term80221, term80221.getClass(), "_anyGetters", null);
        setField(term80221, term80221.getClass(), "_anySetters", null);
        setField(term80221, term80221.getClass(), "_anySetterField", null);
        setField(term80221, term80221.getClass(), "_jsonValueGetters", null);
        setField(term80221, term80221.getClass(), "_ignoredPropertyNames", null);
        setField(term80221, term80221.getClass(), "_injectables", null);
        term80229 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80230 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term80231 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term80229, term80229.getClass(), "_problemHandlers", null);
        setField(term80229, term80229.getClass(), "_nodeFactory", null);
        setIntField(term80229, term80229.getClass(), "_deserFeatures", 0);
        setIntField(term80229, term80229.getClass(), "_parserFeatures", 0);
        setIntField(term80229, term80229.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term80229, term80229.getClass(), "_formatReadFeatures", 0);
        setIntField(term80229, term80229.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term80229, term80229.getClass(), "_mixIns", null);
        setField(term80229, term80229.getClass(), "_subtypeResolver", null);
        setField(term80229, term80229.getClass(), "_rootName", null);
        setField(term80229, term80229.getClass(), "_view", null);
        setField(term80229, term80229.getClass(), "_attributes", null);
        setField(term80229, term80229.getClass(), "_rootNames", null);
        setField(term80229, term80229.getClass(), "_configOverrides", null);
        setIntField(term80229, term80229.getClass(), "_mapperFeatures", -2);
        setField(term80230, term80230.getClass(), "_classIntrospector", null);
        setField(term80231, term80231.getClass(), "_annotationsInside", null);
        setBooleanField(term80231, term80231.getClass(), "_cfgConstructorPropertiesImpliesCreator", false);
        setField(term80230, term80230.getClass(), "_annotationIntrospector", term80231);
        setField(term80230, term80230.getClass(), "_visibilityChecker", null);
        setField(term80230, term80230.getClass(), "_propertyNamingStrategy", null);
        setField(term80230, term80230.getClass(), "_typeFactory", null);
        setField(term80230, term80230.getClass(), "_typeResolverBuilder", null);
        setField(term80230, term80230.getClass(), "_dateFormat", null);
        setField(term80230, term80230.getClass(), "_handlerInstantiator", null);
        setField(term80230, term80230.getClass(), "_locale", null);
        setField(term80230, term80230.getClass(), "_timeZone", null);
        setField(term80230, term80230.getClass(), "_defaultBase64", null);
        setField(term80229, term80229.getClass(), "_base", term80230);
        term80232 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term80233 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term80232, term80232.getClass(), "_type", null);
        setField(term80232, term80232.getClass(), "_class", null);
        setField(term80232, term80232.getClass(), "_bindings", null);
        setField(term80232, term80232.getClass(), "_superTypes", null);
        setField(term80232, term80232.getClass(), "_annotationIntrospector", null);
        setField(term80232, term80232.getClass(), "_typeFactory", null);
        setField(term80232, term80232.getClass(), "_mixInResolver", null);
        setField(term80232, term80232.getClass(), "_primaryMixIn", null);
        setField(term80233, term80233.getClass(), "_annotations", null);
        setField(term80232, term80232.getClass(), "_classAnnotations", term80233);
        setBooleanField(term80232, term80232.getClass(), "_creatorsResolved", false);
        setField(term80232, term80232.getClass(), "_defaultConstructor", null);
        setField(term80232, term80232.getClass(), "_constructors", null);
        setField(term80232, term80232.getClass(), "_creatorMethods", null);
        setField(term80232, term80232.getClass(), "_memberMethods", null);
        setField(term80232, term80232.getClass(), "_fields", null);
        setField(term80232, term80232.getClass(), "_nonStaticInnerClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term79498;
        args[1] = true;
        args[2] = null;
        args[3] = term79864;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80221));
        assertTrue(recursiveEquals(term79498, term80229));
        assertTrue(recursiveEquals(term79864, term80232));
    }

};


