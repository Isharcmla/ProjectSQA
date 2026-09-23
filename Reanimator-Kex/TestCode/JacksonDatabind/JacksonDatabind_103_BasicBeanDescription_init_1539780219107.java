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

public class BasicBeanDescription_init_1539780219107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13991;
     Object term14105;
     Object term15530;
     Object term15534;
     Object term15535;

    public BasicBeanDescription_init_1539780219107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term13635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term13771 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term13881 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term13543, term13543.getClass(), "_type", term13635);
        setField(term13543, term13543.getClass(), "_propCollector", term13771);
        setField(term13543, term13543.getClass(), "_config", term13881);
        term13991 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term14105 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term15530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term15531 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term15532 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term15533 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term15530, term15530.getClass(), "_propCollector", null);
        setField(term15531, term15531.getClass(), "_problemHandlers", null);
        setField(term15531, term15531.getClass(), "_nodeFactory", null);
        setIntField(term15531, term15531.getClass(), "_deserFeatures", 0);
        setIntField(term15531, term15531.getClass(), "_parserFeatures", 0);
        setIntField(term15531, term15531.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term15531, term15531.getClass(), "_formatReadFeatures", 0);
        setIntField(term15531, term15531.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term15531, term15531.getClass(), "_mixIns", null);
        setField(term15531, term15531.getClass(), "_subtypeResolver", null);
        setField(term15531, term15531.getClass(), "_rootName", null);
        setField(term15531, term15531.getClass(), "_view", null);
        setField(term15531, term15531.getClass(), "_attributes", null);
        setField(term15531, term15531.getClass(), "_rootNames", null);
        setField(term15531, term15531.getClass(), "_configOverrides", null);
        setIntField(term15531, term15531.getClass(), "_mapperFeatures", 0);
        setField(term15531, term15531.getClass(), "_base", null);
        setField(term15530, term15530.getClass(), "_config", term15531);
        setField(term15530, term15530.getClass(), "_annotationIntrospector", term15532);
        setField(term15530, term15530.getClass(), "_classInfo", null);
        setField(term15530, term15530.getClass(), "_defaultViews", null);
        setBooleanField(term15530, term15530.getClass(), "_defaultViewsResolved", false);
        setField(term15530, term15530.getClass(), "_properties", null);
        setField(term15530, term15530.getClass(), "_objectIdInfo", null);
        setField(term15533, term15533.getClass(), "_elementType", null);
        setField(term15533, term15533.getClass(), "_superClass", null);
        setField(term15533, term15533.getClass(), "_superInterfaces", null);
        setField(term15533, term15533.getClass(), "_bindings", null);
        setField(term15533, term15533.getClass(), "_canonicalName", null);
        setField(term15533, term15533.getClass(), "_class", null);
        setIntField(term15533, term15533.getClass(), "_hash", 0);
        setField(term15533, term15533.getClass(), "_valueHandler", null);
        setField(term15533, term15533.getClass(), "_typeHandler", null);
        setBooleanField(term15533, term15533.getClass(), "_asStatic", false);
        setField(term15530, term15530.getClass(), "_type", term15533);
        term15534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term15534, term15534.getClass(), "_elementType", null);
        setField(term15534, term15534.getClass(), "_superClass", null);
        setField(term15534, term15534.getClass(), "_superInterfaces", null);
        setField(term15534, term15534.getClass(), "_bindings", null);
        setField(term15534, term15534.getClass(), "_canonicalName", null);
        setField(term15534, term15534.getClass(), "_class", null);
        setIntField(term15534, term15534.getClass(), "_hash", 0);
        setField(term15534, term15534.getClass(), "_valueHandler", null);
        setField(term15534, term15534.getClass(), "_typeHandler", null);
        setBooleanField(term15534, term15534.getClass(), "_asStatic", false);
        term15535 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term15535, term15535.getClass(), "_problemHandlers", null);
        setField(term15535, term15535.getClass(), "_nodeFactory", null);
        setIntField(term15535, term15535.getClass(), "_deserFeatures", 0);
        setIntField(term15535, term15535.getClass(), "_parserFeatures", 0);
        setIntField(term15535, term15535.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term15535, term15535.getClass(), "_formatReadFeatures", 0);
        setIntField(term15535, term15535.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term15535, term15535.getClass(), "_mixIns", null);
        setField(term15535, term15535.getClass(), "_subtypeResolver", null);
        setField(term15535, term15535.getClass(), "_rootName", null);
        setField(term15535, term15535.getClass(), "_view", null);
        setField(term15535, term15535.getClass(), "_attributes", null);
        setField(term15535, term15535.getClass(), "_rootNames", null);
        setField(term15535, term15535.getClass(), "_configOverrides", null);
        setIntField(term15535, term15535.getClass(), "_mapperFeatures", 0);
        setField(term15535, term15535.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = term13991;
        args[1] = term14105;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15530));
        assertTrue(recursiveEquals(term13991, term15534));
        assertTrue(recursiveEquals(term14105, term15535));
    }

};


