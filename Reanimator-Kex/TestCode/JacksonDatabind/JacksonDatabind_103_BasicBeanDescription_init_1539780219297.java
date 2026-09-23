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

public class BasicBeanDescription_init_1539780219297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136624;
     Object term136669;
     Object term136672;

    public BasicBeanDescription_init_1539780219297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term136404 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term136518 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term136404, term136404.getClass(), "_type", term136518);
        setField(term136404, term136404.getClass(), "_propCollector", null);
        setField(term136404, term136404.getClass(), "_config", null);
        term136624 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term136669 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term136670 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term136671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term136669, term136669.getClass(), "_propCollector", null);
        setField(term136670, term136670.getClass(), "_filterProvider", null);
        setField(term136670, term136670.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term136670, term136670.getClass(), "_serFeatures", 0);
        setIntField(term136670, term136670.getClass(), "_generatorFeatures", 0);
        setIntField(term136670, term136670.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term136670, term136670.getClass(), "_formatWriteFeatures", 0);
        setIntField(term136670, term136670.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term136670, term136670.getClass(), "_mixIns", null);
        setField(term136670, term136670.getClass(), "_subtypeResolver", null);
        setField(term136670, term136670.getClass(), "_rootName", null);
        setField(term136670, term136670.getClass(), "_view", null);
        setField(term136670, term136670.getClass(), "_attributes", null);
        setField(term136670, term136670.getClass(), "_rootNames", null);
        setField(term136670, term136670.getClass(), "_configOverrides", null);
        setIntField(term136670, term136670.getClass(), "_mapperFeatures", 0);
        setField(term136670, term136670.getClass(), "_base", null);
        setField(term136669, term136669.getClass(), "_config", term136670);
        setField(term136669, term136669.getClass(), "_annotationIntrospector", term136671);
        setField(term136669, term136669.getClass(), "_classInfo", null);
        setField(term136669, term136669.getClass(), "_defaultViews", null);
        setBooleanField(term136669, term136669.getClass(), "_defaultViewsResolved", false);
        setField(term136669, term136669.getClass(), "_properties", null);
        setField(term136669, term136669.getClass(), "_objectIdInfo", null);
        setField(term136669, term136669.getClass(), "_type", null);
        term136672 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term136672, term136672.getClass(), "_filterProvider", null);
        setField(term136672, term136672.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term136672, term136672.getClass(), "_serFeatures", 0);
        setIntField(term136672, term136672.getClass(), "_generatorFeatures", 0);
        setIntField(term136672, term136672.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term136672, term136672.getClass(), "_formatWriteFeatures", 0);
        setIntField(term136672, term136672.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term136672, term136672.getClass(), "_mixIns", null);
        setField(term136672, term136672.getClass(), "_subtypeResolver", null);
        setField(term136672, term136672.getClass(), "_rootName", null);
        setField(term136672, term136672.getClass(), "_view", null);
        setField(term136672, term136672.getClass(), "_attributes", null);
        setField(term136672, term136672.getClass(), "_rootNames", null);
        setField(term136672, term136672.getClass(), "_configOverrides", null);
        setIntField(term136672, term136672.getClass(), "_mapperFeatures", 0);
        setField(term136672, term136672.getClass(), "_base", null);
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
        args[0] = term136624;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term136669));
        assertTrue(recursiveEquals(term136624, null));
    }

};


