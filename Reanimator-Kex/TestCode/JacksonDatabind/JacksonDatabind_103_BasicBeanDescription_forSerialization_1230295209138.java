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

public class BasicBeanDescription_forSerialization_1230295209138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30356;
     Object term31226;
     Object term31177;

    public BasicBeanDescription_forSerialization_1230295209138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30356 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term30460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term30570 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term30714 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term30356, term30356.getClass(), "_type", term30460);
        setField(term30356, term30356.getClass(), "_classDef", null);
        setIntField(term30570, term30570.getClass(), "_mapperFeatures", 0);
        setField(term30356, term30356.getClass(), "_config", term30570);
        setField(term30356, term30356.getClass(), "_annotationIntrospector", term30714);
        term31226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term31227 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term31228 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term31229 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term31227, term31227.getClass(), "_problemHandlers", null);
        setField(term31227, term31227.getClass(), "_nodeFactory", null);
        setIntField(term31227, term31227.getClass(), "_deserFeatures", 0);
        setIntField(term31227, term31227.getClass(), "_parserFeatures", 0);
        setIntField(term31227, term31227.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term31227, term31227.getClass(), "_formatReadFeatures", 0);
        setIntField(term31227, term31227.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term31227, term31227.getClass(), "_mixIns", null);
        setField(term31227, term31227.getClass(), "_subtypeResolver", null);
        setField(term31227, term31227.getClass(), "_rootName", null);
        setField(term31227, term31227.getClass(), "_view", null);
        setField(term31227, term31227.getClass(), "_attributes", null);
        setField(term31227, term31227.getClass(), "_rootNames", null);
        setField(term31227, term31227.getClass(), "_configOverrides", null);
        setIntField(term31227, term31227.getClass(), "_mapperFeatures", 0);
        setField(term31227, term31227.getClass(), "_base", null);
        setField(term31226, term31226.getClass(), "_config", term31227);
        setBooleanField(term31226, term31226.getClass(), "_forSerialization", false);
        setBooleanField(term31226, term31226.getClass(), "_stdBeanNaming", false);
        setField(term31228, term31228.getClass(), "_referencedType", null);
        setField(term31228, term31228.getClass(), "_anchorType", null);
        setField(term31228, term31228.getClass(), "_superClass", null);
        setField(term31228, term31228.getClass(), "_superInterfaces", null);
        setField(term31228, term31228.getClass(), "_bindings", null);
        setField(term31228, term31228.getClass(), "_canonicalName", null);
        setField(term31228, term31228.getClass(), "_class", null);
        setIntField(term31228, term31228.getClass(), "_hash", 0);
        setField(term31228, term31228.getClass(), "_valueHandler", null);
        setField(term31228, term31228.getClass(), "_typeHandler", null);
        setBooleanField(term31228, term31228.getClass(), "_asStatic", false);
        setField(term31226, term31226.getClass(), "_type", term31228);
        setField(term31226, term31226.getClass(), "_classDef", null);
        setField(term31226, term31226.getClass(), "_visibilityChecker", null);
        setField(term31226, term31226.getClass(), "_annotationIntrospector", term31229);
        setBooleanField(term31226, term31226.getClass(), "_useAnnotations", false);
        setField(term31226, term31226.getClass(), "_mutatorPrefix", null);
        setBooleanField(term31226, term31226.getClass(), "_collected", false);
        setField(term31226, term31226.getClass(), "_properties", null);
        setField(term31226, term31226.getClass(), "_creatorProperties", null);
        setField(term31226, term31226.getClass(), "_anyGetters", null);
        setField(term31226, term31226.getClass(), "_anySetters", null);
        setField(term31226, term31226.getClass(), "_anySetterField", null);
        setField(term31226, term31226.getClass(), "_jsonValueAccessors", null);
        setField(term31226, term31226.getClass(), "_ignoredPropertyNames", null);
        setField(term31226, term31226.getClass(), "_injectables", null);
        term31177 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term31161 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term31162 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term31171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term31174 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term31178 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term31162, term31162.getClass(), "_problemHandlers", null);
        setField(term31162, term31162.getClass(), "_nodeFactory", null);
        setIntField(term31162, term31162.getClass(), "_deserFeatures", 0);
        setIntField(term31162, term31162.getClass(), "_parserFeatures", 0);
        setIntField(term31162, term31162.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term31162, term31162.getClass(), "_formatReadFeatures", 0);
        setIntField(term31162, term31162.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term31162, term31162.getClass(), "_mixIns", null);
        setField(term31162, term31162.getClass(), "_subtypeResolver", null);
        setField(term31162, term31162.getClass(), "_rootName", null);
        setField(term31162, term31162.getClass(), "_view", null);
        setField(term31162, term31162.getClass(), "_attributes", null);
        setField(term31162, term31162.getClass(), "_rootNames", null);
        setField(term31162, term31162.getClass(), "_configOverrides", null);
        setIntField(term31162, term31162.getClass(), "_mapperFeatures", 0);
        setField(term31162, term31162.getClass(), "_base", null);
        setField(term31161, term31161.getClass(), "_config", term31162);
        setBooleanField(term31161, term31161.getClass(), "_forSerialization", false);
        setBooleanField(term31161, term31161.getClass(), "_stdBeanNaming", false);
        setField(term31171, term31171.getClass(), "_referencedType", null);
        setField(term31171, term31171.getClass(), "_anchorType", null);
        setField(term31171, term31171.getClass(), "_superClass", null);
        setField(term31171, term31171.getClass(), "_superInterfaces", null);
        setField(term31171, term31171.getClass(), "_bindings", null);
        setField(term31171, term31171.getClass(), "_canonicalName", null);
        setField(term31171, term31171.getClass(), "_class", null);
        setIntField(term31171, term31171.getClass(), "_hash", 0);
        setField(term31171, term31171.getClass(), "_valueHandler", null);
        setField(term31171, term31171.getClass(), "_typeHandler", null);
        setBooleanField(term31171, term31171.getClass(), "_asStatic", false);
        setField(term31161, term31161.getClass(), "_type", term31171);
        setField(term31161, term31161.getClass(), "_classDef", null);
        setField(term31161, term31161.getClass(), "_visibilityChecker", null);
        setField(term31161, term31161.getClass(), "_annotationIntrospector", term31174);
        setBooleanField(term31161, term31161.getClass(), "_useAnnotations", false);
        setField(term31161, term31161.getClass(), "_mutatorPrefix", null);
        setBooleanField(term31161, term31161.getClass(), "_collected", false);
        setField(term31161, term31161.getClass(), "_properties", null);
        setField(term31161, term31161.getClass(), "_creatorProperties", null);
        setField(term31161, term31161.getClass(), "_anyGetters", null);
        setField(term31161, term31161.getClass(), "_anySetters", null);
        setField(term31161, term31161.getClass(), "_anySetterField", null);
        setField(term31161, term31161.getClass(), "_jsonValueAccessors", null);
        setField(term31161, term31161.getClass(), "_ignoredPropertyNames", null);
        setField(term31161, term31161.getClass(), "_injectables", null);
        setField(term31177, term31177.getClass(), "_propCollector", term31161);
        setField(term31177, term31177.getClass(), "_config", term31162);
        setField(term31177, term31177.getClass(), "_annotationIntrospector", term31178);
        setField(term31177, term31177.getClass(), "_classInfo", null);
        setField(term31177, term31177.getClass(), "_defaultViews", null);
        setBooleanField(term31177, term31177.getClass(), "_defaultViewsResolved", false);
        setField(term31177, term31177.getClass(), "_properties", null);
        setField(term31177, term31177.getClass(), "_objectIdInfo", null);
        setField(term31177, term31177.getClass(), "_type", term31171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term30356;
        Object retValue = callMethod(klass, "forSerialization", argTypes, null, args);
        assertTrue(recursiveEquals(term30356, term31226));
        assertTrue(recursiveEquals(retValue, term31177));
    }

};


