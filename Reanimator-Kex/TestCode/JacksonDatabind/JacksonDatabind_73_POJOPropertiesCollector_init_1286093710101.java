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

public class POJOPropertiesCollector_init_1286093710101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33185;
     Object term33588;
     Object term33593;

    public POJOPropertiesCollector_init_1286093710101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32961 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term33075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term32961, term32961.getClass(), "_config", null);
        setBooleanField(term32961, term32961.getClass(), "_stdBeanNaming", false);
        setBooleanField(term32961, term32961.getClass(), "_forSerialization", false);
        setField(term32961, term32961.getClass(), "_type", term33075);
        setField(term32961, term32961.getClass(), "_classDef", null);
        setField(term32961, term32961.getClass(), "_mutatorPrefix", null);
        setField(term32961, term32961.getClass(), "_annotationIntrospector", null);
        term33185 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term33285 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term33185, term33185.getClass(), "_mapperFeatures", -1);
        setField(term33285, term33285.getClass(), "_annotationIntrospector", null);
        setField(term33285, term33285.getClass(), "_visibilityChecker", null);
        setField(term33185, term33185.getClass(), "_base", term33285);
        term33588 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term33589 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term33590 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term33589, term33589.getClass(), "_problemHandlers", null);
        setField(term33589, term33589.getClass(), "_nodeFactory", null);
        setIntField(term33589, term33589.getClass(), "_deserFeatures", 0);
        setIntField(term33589, term33589.getClass(), "_parserFeatures", 0);
        setIntField(term33589, term33589.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33589, term33589.getClass(), "_formatReadFeatures", 0);
        setIntField(term33589, term33589.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33589, term33589.getClass(), "_mixIns", null);
        setField(term33589, term33589.getClass(), "_subtypeResolver", null);
        setField(term33589, term33589.getClass(), "_rootName", null);
        setField(term33589, term33589.getClass(), "_view", null);
        setField(term33589, term33589.getClass(), "_attributes", null);
        setField(term33589, term33589.getClass(), "_rootNames", null);
        setField(term33589, term33589.getClass(), "_configOverrides", null);
        setIntField(term33589, term33589.getClass(), "_mapperFeatures", -1);
        setField(term33590, term33590.getClass(), "_classIntrospector", null);
        setField(term33590, term33590.getClass(), "_annotationIntrospector", null);
        setField(term33590, term33590.getClass(), "_visibilityChecker", null);
        setField(term33590, term33590.getClass(), "_propertyNamingStrategy", null);
        setField(term33590, term33590.getClass(), "_typeFactory", null);
        setField(term33590, term33590.getClass(), "_typeResolverBuilder", null);
        setField(term33590, term33590.getClass(), "_dateFormat", null);
        setField(term33590, term33590.getClass(), "_handlerInstantiator", null);
        setField(term33590, term33590.getClass(), "_locale", null);
        setField(term33590, term33590.getClass(), "_timeZone", null);
        setField(term33590, term33590.getClass(), "_defaultBase64", null);
        setField(term33589, term33589.getClass(), "_base", term33590);
        setField(term33588, term33588.getClass(), "_config", term33589);
        setBooleanField(term33588, term33588.getClass(), "_forSerialization", true);
        setBooleanField(term33588, term33588.getClass(), "_stdBeanNaming", true);
        setField(term33588, term33588.getClass(), "_type", null);
        setField(term33588, term33588.getClass(), "_classDef", null);
        setField(term33588, term33588.getClass(), "_visibilityChecker", null);
        setField(term33588, term33588.getClass(), "_annotationIntrospector", null);
        setField(term33588, term33588.getClass(), "_mutatorPrefix", "");
        setBooleanField(term33588, term33588.getClass(), "_collected", false);
        setField(term33588, term33588.getClass(), "_properties", null);
        setField(term33588, term33588.getClass(), "_creatorProperties", null);
        setField(term33588, term33588.getClass(), "_anyGetters", null);
        setField(term33588, term33588.getClass(), "_anySetters", null);
        setField(term33588, term33588.getClass(), "_anySetterField", null);
        setField(term33588, term33588.getClass(), "_jsonValueGetters", null);
        setField(term33588, term33588.getClass(), "_ignoredPropertyNames", null);
        setField(term33588, term33588.getClass(), "_injectables", null);
        term33593 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term33594 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term33593, term33593.getClass(), "_problemHandlers", null);
        setField(term33593, term33593.getClass(), "_nodeFactory", null);
        setIntField(term33593, term33593.getClass(), "_deserFeatures", 0);
        setIntField(term33593, term33593.getClass(), "_parserFeatures", 0);
        setIntField(term33593, term33593.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33593, term33593.getClass(), "_formatReadFeatures", 0);
        setIntField(term33593, term33593.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33593, term33593.getClass(), "_mixIns", null);
        setField(term33593, term33593.getClass(), "_subtypeResolver", null);
        setField(term33593, term33593.getClass(), "_rootName", null);
        setField(term33593, term33593.getClass(), "_view", null);
        setField(term33593, term33593.getClass(), "_attributes", null);
        setField(term33593, term33593.getClass(), "_rootNames", null);
        setField(term33593, term33593.getClass(), "_configOverrides", null);
        setIntField(term33593, term33593.getClass(), "_mapperFeatures", -1);
        setField(term33594, term33594.getClass(), "_classIntrospector", null);
        setField(term33594, term33594.getClass(), "_annotationIntrospector", null);
        setField(term33594, term33594.getClass(), "_visibilityChecker", null);
        setField(term33594, term33594.getClass(), "_propertyNamingStrategy", null);
        setField(term33594, term33594.getClass(), "_typeFactory", null);
        setField(term33594, term33594.getClass(), "_typeResolverBuilder", null);
        setField(term33594, term33594.getClass(), "_dateFormat", null);
        setField(term33594, term33594.getClass(), "_handlerInstantiator", null);
        setField(term33594, term33594.getClass(), "_locale", null);
        setField(term33594, term33594.getClass(), "_timeZone", null);
        setField(term33594, term33594.getClass(), "_defaultBase64", null);
        setField(term33593, term33593.getClass(), "_base", term33594);
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
        args[0] = term33185;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33588));
        assertTrue(recursiveEquals(term33185, term33593));
    }

};


