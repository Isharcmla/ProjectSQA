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

public class BasicBeanDescription_init_509789319262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108476;
     Object term110192;
     Object term110196;

    public BasicBeanDescription_init_509789319262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108340 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term108340, term108340.getClass(), "_type", null);
        setField(term108340, term108340.getClass(), "_propCollector", null);
        setField(term108340, term108340.getClass(), "_config", null);
        term108476 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term108582 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term108682 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term108582, term108582.getClass(), "_mapperFeatures", -1);
        setField(term108582, term108582.getClass(), "_base", term108682);
        setField(term108476, term108476.getClass(), "_config", term108582);
        term110192 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term110193 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term110194 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term110195 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term110194, term110194.getClass(), "_filterProvider", null);
        setField(term110194, term110194.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term110194, term110194.getClass(), "_serFeatures", 0);
        setIntField(term110194, term110194.getClass(), "_generatorFeatures", 0);
        setIntField(term110194, term110194.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term110194, term110194.getClass(), "_formatWriteFeatures", 0);
        setIntField(term110194, term110194.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term110194, term110194.getClass(), "_mixIns", null);
        setField(term110194, term110194.getClass(), "_subtypeResolver", null);
        setField(term110194, term110194.getClass(), "_rootName", null);
        setField(term110194, term110194.getClass(), "_view", null);
        setField(term110194, term110194.getClass(), "_attributes", null);
        setField(term110194, term110194.getClass(), "_rootNames", null);
        setField(term110194, term110194.getClass(), "_configOverrides", null);
        setIntField(term110194, term110194.getClass(), "_mapperFeatures", -1);
        setField(term110195, term110195.getClass(), "_classIntrospector", null);
        setField(term110195, term110195.getClass(), "_annotationIntrospector", null);
        setField(term110195, term110195.getClass(), "_propertyNamingStrategy", null);
        setField(term110195, term110195.getClass(), "_typeFactory", null);
        setField(term110195, term110195.getClass(), "_typeResolverBuilder", null);
        setField(term110195, term110195.getClass(), "_dateFormat", null);
        setField(term110195, term110195.getClass(), "_handlerInstantiator", null);
        setField(term110195, term110195.getClass(), "_locale", null);
        setField(term110195, term110195.getClass(), "_timeZone", null);
        setField(term110195, term110195.getClass(), "_defaultBase64", null);
        setField(term110194, term110194.getClass(), "_base", term110195);
        setField(term110193, term110193.getClass(), "_config", term110194);
        setBooleanField(term110193, term110193.getClass(), "_forSerialization", false);
        setBooleanField(term110193, term110193.getClass(), "_stdBeanNaming", false);
        setField(term110193, term110193.getClass(), "_type", null);
        setField(term110193, term110193.getClass(), "_classDef", null);
        setField(term110193, term110193.getClass(), "_visibilityChecker", null);
        setField(term110193, term110193.getClass(), "_annotationIntrospector", null);
        setBooleanField(term110193, term110193.getClass(), "_useAnnotations", false);
        setField(term110193, term110193.getClass(), "_mutatorPrefix", null);
        setBooleanField(term110193, term110193.getClass(), "_collected", false);
        setField(term110193, term110193.getClass(), "_properties", null);
        setField(term110193, term110193.getClass(), "_creatorProperties", null);
        setField(term110193, term110193.getClass(), "_anyGetters", null);
        setField(term110193, term110193.getClass(), "_anySetters", null);
        setField(term110193, term110193.getClass(), "_anySetterField", null);
        setField(term110193, term110193.getClass(), "_jsonValueAccessors", null);
        setField(term110193, term110193.getClass(), "_ignoredPropertyNames", null);
        setField(term110193, term110193.getClass(), "_injectables", null);
        setField(term110192, term110192.getClass(), "_propCollector", term110193);
        setField(term110192, term110192.getClass(), "_config", term110194);
        setField(term110192, term110192.getClass(), "_annotationIntrospector", null);
        setField(term110192, term110192.getClass(), "_classInfo", null);
        setField(term110192, term110192.getClass(), "_defaultViews", null);
        setBooleanField(term110192, term110192.getClass(), "_defaultViewsResolved", false);
        setField(term110192, term110192.getClass(), "_properties", null);
        setField(term110192, term110192.getClass(), "_objectIdInfo", null);
        setField(term110192, term110192.getClass(), "_type", null);
        term110196 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term110197 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term110198 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term110197, term110197.getClass(), "_filterProvider", null);
        setField(term110197, term110197.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term110197, term110197.getClass(), "_serFeatures", 0);
        setIntField(term110197, term110197.getClass(), "_generatorFeatures", 0);
        setIntField(term110197, term110197.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term110197, term110197.getClass(), "_formatWriteFeatures", 0);
        setIntField(term110197, term110197.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term110197, term110197.getClass(), "_mixIns", null);
        setField(term110197, term110197.getClass(), "_subtypeResolver", null);
        setField(term110197, term110197.getClass(), "_rootName", null);
        setField(term110197, term110197.getClass(), "_view", null);
        setField(term110197, term110197.getClass(), "_attributes", null);
        setField(term110197, term110197.getClass(), "_rootNames", null);
        setField(term110197, term110197.getClass(), "_configOverrides", null);
        setIntField(term110197, term110197.getClass(), "_mapperFeatures", -1);
        setField(term110198, term110198.getClass(), "_classIntrospector", null);
        setField(term110198, term110198.getClass(), "_annotationIntrospector", null);
        setField(term110198, term110198.getClass(), "_propertyNamingStrategy", null);
        setField(term110198, term110198.getClass(), "_typeFactory", null);
        setField(term110198, term110198.getClass(), "_typeResolverBuilder", null);
        setField(term110198, term110198.getClass(), "_dateFormat", null);
        setField(term110198, term110198.getClass(), "_handlerInstantiator", null);
        setField(term110198, term110198.getClass(), "_locale", null);
        setField(term110198, term110198.getClass(), "_timeZone", null);
        setField(term110198, term110198.getClass(), "_defaultBase64", null);
        setField(term110197, term110197.getClass(), "_base", term110198);
        setField(term110196, term110196.getClass(), "_config", term110197);
        setBooleanField(term110196, term110196.getClass(), "_forSerialization", false);
        setBooleanField(term110196, term110196.getClass(), "_stdBeanNaming", false);
        setField(term110196, term110196.getClass(), "_type", null);
        setField(term110196, term110196.getClass(), "_classDef", null);
        setField(term110196, term110196.getClass(), "_visibilityChecker", null);
        setField(term110196, term110196.getClass(), "_annotationIntrospector", null);
        setBooleanField(term110196, term110196.getClass(), "_useAnnotations", false);
        setField(term110196, term110196.getClass(), "_mutatorPrefix", null);
        setBooleanField(term110196, term110196.getClass(), "_collected", false);
        setField(term110196, term110196.getClass(), "_properties", null);
        setField(term110196, term110196.getClass(), "_creatorProperties", null);
        setField(term110196, term110196.getClass(), "_anyGetters", null);
        setField(term110196, term110196.getClass(), "_anySetters", null);
        setField(term110196, term110196.getClass(), "_anySetterField", null);
        setField(term110196, term110196.getClass(), "_jsonValueAccessors", null);
        setField(term110196, term110196.getClass(), "_ignoredPropertyNames", null);
        setField(term110196, term110196.getClass(), "_injectables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term108476;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110192));
        assertTrue(recursiveEquals(term108476, null));
    }

};


