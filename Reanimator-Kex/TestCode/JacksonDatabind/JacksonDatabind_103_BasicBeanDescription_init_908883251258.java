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

public class BasicBeanDescription_init_908883251258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105398;
     Object term106526;
     Object term106531;

    public BasicBeanDescription_init_908883251258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104740 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term104860 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term104996 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term105144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term105262 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term104740, term104740.getClass(), "_type", term104860);
        setField(term104740, term104740.getClass(), "_propCollector", term104996);
        setField(term104740, term104740.getClass(), "_config", null);
        setField(term104740, term104740.getClass(), "_annotationIntrospector", term105144);
        setField(term104740, term104740.getClass(), "_classInfo", term105262);
        term105398 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term105502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term105620 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term105764 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term105398, term105398.getClass(), "_type", term105502);
        setField(term105398, term105398.getClass(), "_classDef", term105620);
        setField(term105398, term105398.getClass(), "_config", null);
        setField(term105398, term105398.getClass(), "_annotationIntrospector", term105764);
        term106526 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term106527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term106528 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term106530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term106527, term106527.getClass(), "_config", null);
        setBooleanField(term106527, term106527.getClass(), "_forSerialization", false);
        setBooleanField(term106527, term106527.getClass(), "_stdBeanNaming", false);
        setField(term106528, term106528.getClass(), "_referencedType", null);
        setField(term106528, term106528.getClass(), "_anchorType", null);
        setField(term106528, term106528.getClass(), "_superClass", null);
        setField(term106528, term106528.getClass(), "_superInterfaces", null);
        setField(term106528, term106528.getClass(), "_bindings", null);
        setField(term106528, term106528.getClass(), "_canonicalName", null);
        setField(term106528, term106528.getClass(), "_class", null);
        setIntField(term106528, term106528.getClass(), "_hash", 0);
        setField(term106528, term106528.getClass(), "_valueHandler", null);
        setField(term106528, term106528.getClass(), "_typeHandler", null);
        setBooleanField(term106528, term106528.getClass(), "_asStatic", false);
        setField(term106527, term106527.getClass(), "_type", term106528);
        setField(term106529, term106529.getClass(), "_type", null);
        setField(term106529, term106529.getClass(), "_class", null);
        setField(term106529, term106529.getClass(), "_bindings", null);
        setField(term106529, term106529.getClass(), "_superTypes", null);
        setField(term106529, term106529.getClass(), "_annotationIntrospector", null);
        setField(term106529, term106529.getClass(), "_typeFactory", null);
        setField(term106529, term106529.getClass(), "_mixInResolver", null);
        setField(term106529, term106529.getClass(), "_primaryMixIn", null);
        setField(term106529, term106529.getClass(), "_classAnnotations", null);
        setField(term106529, term106529.getClass(), "_creators", null);
        setField(term106529, term106529.getClass(), "_memberMethods", null);
        setField(term106529, term106529.getClass(), "_fields", null);
        setField(term106529, term106529.getClass(), "_nonStaticInnerClass", null);
        setField(term106527, term106527.getClass(), "_classDef", term106529);
        setField(term106527, term106527.getClass(), "_visibilityChecker", null);
        setField(term106527, term106527.getClass(), "_annotationIntrospector", term106530);
        setBooleanField(term106527, term106527.getClass(), "_useAnnotations", false);
        setField(term106527, term106527.getClass(), "_mutatorPrefix", null);
        setBooleanField(term106527, term106527.getClass(), "_collected", false);
        setField(term106527, term106527.getClass(), "_properties", null);
        setField(term106527, term106527.getClass(), "_creatorProperties", null);
        setField(term106527, term106527.getClass(), "_anyGetters", null);
        setField(term106527, term106527.getClass(), "_anySetters", null);
        setField(term106527, term106527.getClass(), "_anySetterField", null);
        setField(term106527, term106527.getClass(), "_jsonValueAccessors", null);
        setField(term106527, term106527.getClass(), "_ignoredPropertyNames", null);
        setField(term106527, term106527.getClass(), "_injectables", null);
        setField(term106526, term106526.getClass(), "_propCollector", term106527);
        setField(term106526, term106526.getClass(), "_config", null);
        setField(term106526, term106526.getClass(), "_annotationIntrospector", null);
        setField(term106526, term106526.getClass(), "_classInfo", term106529);
        setField(term106526, term106526.getClass(), "_defaultViews", null);
        setBooleanField(term106526, term106526.getClass(), "_defaultViewsResolved", false);
        setField(term106526, term106526.getClass(), "_properties", null);
        setField(term106526, term106526.getClass(), "_objectIdInfo", null);
        setField(term106526, term106526.getClass(), "_type", term106528);
        term106531 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term106532 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106533 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term106534 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term106531, term106531.getClass(), "_config", null);
        setBooleanField(term106531, term106531.getClass(), "_forSerialization", false);
        setBooleanField(term106531, term106531.getClass(), "_stdBeanNaming", false);
        setField(term106532, term106532.getClass(), "_referencedType", null);
        setField(term106532, term106532.getClass(), "_anchorType", null);
        setField(term106532, term106532.getClass(), "_superClass", null);
        setField(term106532, term106532.getClass(), "_superInterfaces", null);
        setField(term106532, term106532.getClass(), "_bindings", null);
        setField(term106532, term106532.getClass(), "_canonicalName", null);
        setField(term106532, term106532.getClass(), "_class", null);
        setIntField(term106532, term106532.getClass(), "_hash", 0);
        setField(term106532, term106532.getClass(), "_valueHandler", null);
        setField(term106532, term106532.getClass(), "_typeHandler", null);
        setBooleanField(term106532, term106532.getClass(), "_asStatic", false);
        setField(term106531, term106531.getClass(), "_type", term106532);
        setField(term106533, term106533.getClass(), "_type", null);
        setField(term106533, term106533.getClass(), "_class", null);
        setField(term106533, term106533.getClass(), "_bindings", null);
        setField(term106533, term106533.getClass(), "_superTypes", null);
        setField(term106533, term106533.getClass(), "_annotationIntrospector", null);
        setField(term106533, term106533.getClass(), "_typeFactory", null);
        setField(term106533, term106533.getClass(), "_mixInResolver", null);
        setField(term106533, term106533.getClass(), "_primaryMixIn", null);
        setField(term106533, term106533.getClass(), "_classAnnotations", null);
        setField(term106533, term106533.getClass(), "_creators", null);
        setField(term106533, term106533.getClass(), "_memberMethods", null);
        setField(term106533, term106533.getClass(), "_fields", null);
        setField(term106533, term106533.getClass(), "_nonStaticInnerClass", null);
        setField(term106531, term106531.getClass(), "_classDef", term106533);
        setField(term106531, term106531.getClass(), "_visibilityChecker", null);
        setField(term106531, term106531.getClass(), "_annotationIntrospector", term106534);
        setBooleanField(term106531, term106531.getClass(), "_useAnnotations", false);
        setField(term106531, term106531.getClass(), "_mutatorPrefix", null);
        setBooleanField(term106531, term106531.getClass(), "_collected", false);
        setField(term106531, term106531.getClass(), "_properties", null);
        setField(term106531, term106531.getClass(), "_creatorProperties", null);
        setField(term106531, term106531.getClass(), "_anyGetters", null);
        setField(term106531, term106531.getClass(), "_anySetters", null);
        setField(term106531, term106531.getClass(), "_anySetterField", null);
        setField(term106531, term106531.getClass(), "_jsonValueAccessors", null);
        setField(term106531, term106531.getClass(), "_ignoredPropertyNames", null);
        setField(term106531, term106531.getClass(), "_injectables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term105398;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106526));
        assertTrue(recursiveEquals(term105398, term106531));
    }

};


