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

public class BasicBeanDescription_init_50978931993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11439;
     Object term11535;
     Object term11982;
     Object term11985;
     Object term11986;

    public BasicBeanDescription_init_50978931993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term11167 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term11303 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(term11071, term11071.getClass(), "_type", term11167);
        setField(term11071, term11071.getClass(), "_propCollector", term11303);
        term11439 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        term11535 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term11982 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term11983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term11984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term11983, term11983.getClass(), "_config", null);
        setBooleanField(term11983, term11983.getClass(), "_forSerialization", false);
        setBooleanField(term11983, term11983.getClass(), "_stdBeanNaming", false);
        setField(term11983, term11983.getClass(), "_type", null);
        setField(term11983, term11983.getClass(), "_classDef", null);
        setField(term11983, term11983.getClass(), "_visibilityChecker", null);
        setField(term11983, term11983.getClass(), "_annotationIntrospector", null);
        setBooleanField(term11983, term11983.getClass(), "_useAnnotations", false);
        setField(term11983, term11983.getClass(), "_mutatorPrefix", null);
        setBooleanField(term11983, term11983.getClass(), "_collected", false);
        setField(term11983, term11983.getClass(), "_properties", null);
        setField(term11983, term11983.getClass(), "_creatorProperties", null);
        setField(term11983, term11983.getClass(), "_anyGetters", null);
        setField(term11983, term11983.getClass(), "_anySetters", null);
        setField(term11983, term11983.getClass(), "_anySetterField", null);
        setField(term11983, term11983.getClass(), "_jsonValueAccessors", null);
        setField(term11983, term11983.getClass(), "_ignoredPropertyNames", null);
        setField(term11983, term11983.getClass(), "_injectables", null);
        setField(term11982, term11982.getClass(), "_propCollector", term11983);
        setField(term11982, term11982.getClass(), "_config", null);
        setField(term11982, term11982.getClass(), "_annotationIntrospector", null);
        setField(term11982, term11982.getClass(), "_classInfo", null);
        setField(term11982, term11982.getClass(), "_defaultViews", null);
        setBooleanField(term11982, term11982.getClass(), "_defaultViewsResolved", false);
        setField(term11982, term11982.getClass(), "_properties", null);
        setField(term11982, term11982.getClass(), "_objectIdInfo", null);
        setField(term11984, term11984.getClass(), "_componentType", null);
        setField(term11984, term11984.getClass(), "_emptyArray", null);
        setField(term11984, term11984.getClass(), "_superClass", null);
        setField(term11984, term11984.getClass(), "_superInterfaces", null);
        setField(term11984, term11984.getClass(), "_bindings", null);
        setField(term11984, term11984.getClass(), "_canonicalName", null);
        setField(term11984, term11984.getClass(), "_class", null);
        setIntField(term11984, term11984.getClass(), "_hash", 0);
        setField(term11984, term11984.getClass(), "_valueHandler", null);
        setField(term11984, term11984.getClass(), "_typeHandler", null);
        setBooleanField(term11984, term11984.getClass(), "_asStatic", false);
        setField(term11982, term11982.getClass(), "_type", term11984);
        term11985 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term11985, term11985.getClass(), "_componentType", null);
        setField(term11985, term11985.getClass(), "_emptyArray", null);
        setField(term11985, term11985.getClass(), "_superClass", null);
        setField(term11985, term11985.getClass(), "_superInterfaces", null);
        setField(term11985, term11985.getClass(), "_bindings", null);
        setField(term11985, term11985.getClass(), "_canonicalName", null);
        setField(term11985, term11985.getClass(), "_class", null);
        setIntField(term11985, term11985.getClass(), "_hash", 0);
        setField(term11985, term11985.getClass(), "_valueHandler", null);
        setField(term11985, term11985.getClass(), "_typeHandler", null);
        setBooleanField(term11985, term11985.getClass(), "_asStatic", false);
        term11986 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(term11986, term11986.getClass(), "_config", null);
        setBooleanField(term11986, term11986.getClass(), "_forSerialization", false);
        setBooleanField(term11986, term11986.getClass(), "_stdBeanNaming", false);
        setField(term11986, term11986.getClass(), "_type", null);
        setField(term11986, term11986.getClass(), "_classDef", null);
        setField(term11986, term11986.getClass(), "_visibilityChecker", null);
        setField(term11986, term11986.getClass(), "_annotationIntrospector", null);
        setBooleanField(term11986, term11986.getClass(), "_useAnnotations", false);
        setField(term11986, term11986.getClass(), "_mutatorPrefix", null);
        setBooleanField(term11986, term11986.getClass(), "_collected", false);
        setField(term11986, term11986.getClass(), "_properties", null);
        setField(term11986, term11986.getClass(), "_creatorProperties", null);
        setField(term11986, term11986.getClass(), "_anyGetters", null);
        setField(term11986, term11986.getClass(), "_anySetters", null);
        setField(term11986, term11986.getClass(), "_anySetterField", null);
        setField(term11986, term11986.getClass(), "_jsonValueAccessors", null);
        setField(term11986, term11986.getClass(), "_ignoredPropertyNames", null);
        setField(term11986, term11986.getClass(), "_injectables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term11439;
        args[1] = term11535;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11982));
        assertTrue(recursiveEquals(term11439, term11985));
        assertTrue(recursiveEquals(term11535, term11986));
    }

};


