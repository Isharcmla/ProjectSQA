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

public class BasicBeanDescription_forOtherUse_1395557962121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20665;
     Object term20714;
     Object term20666;

    public BasicBeanDescription_forOtherUse_1395557962121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20665 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term20714 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term20714, term20714.getClass(), "_problemHandlers", null);
        setField(term20714, term20714.getClass(), "_nodeFactory", null);
        setIntField(term20714, term20714.getClass(), "_deserFeatures", 0);
        setIntField(term20714, term20714.getClass(), "_parserFeatures", 0);
        setIntField(term20714, term20714.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term20714, term20714.getClass(), "_formatReadFeatures", 0);
        setIntField(term20714, term20714.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term20714, term20714.getClass(), "_mixIns", null);
        setField(term20714, term20714.getClass(), "_subtypeResolver", null);
        setField(term20714, term20714.getClass(), "_rootName", null);
        setField(term20714, term20714.getClass(), "_view", null);
        setField(term20714, term20714.getClass(), "_attributes", null);
        setField(term20714, term20714.getClass(), "_rootNames", null);
        setField(term20714, term20714.getClass(), "_configOverrides", null);
        setIntField(term20714, term20714.getClass(), "_mapperFeatures", 0);
        setField(term20714, term20714.getClass(), "_base", null);
        term20666 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term20667 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term20674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term20676 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term20666, term20666.getClass(), "_propCollector", null);
        setField(term20667, term20667.getClass(), "_problemHandlers", null);
        setField(term20667, term20667.getClass(), "_nodeFactory", null);
        setIntField(term20667, term20667.getClass(), "_deserFeatures", 0);
        setIntField(term20667, term20667.getClass(), "_parserFeatures", 0);
        setIntField(term20667, term20667.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term20667, term20667.getClass(), "_formatReadFeatures", 0);
        setIntField(term20667, term20667.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term20667, term20667.getClass(), "_mixIns", null);
        setField(term20667, term20667.getClass(), "_subtypeResolver", null);
        setField(term20667, term20667.getClass(), "_rootName", null);
        setField(term20667, term20667.getClass(), "_view", null);
        setField(term20667, term20667.getClass(), "_attributes", null);
        setField(term20667, term20667.getClass(), "_rootNames", null);
        setField(term20667, term20667.getClass(), "_configOverrides", null);
        setIntField(term20667, term20667.getClass(), "_mapperFeatures", 0);
        setField(term20667, term20667.getClass(), "_base", null);
        setField(term20666, term20666.getClass(), "_config", term20667);
        setField(term20666, term20666.getClass(), "_annotationIntrospector", term20674);
        setField(term20666, term20666.getClass(), "_classInfo", null);
        setField(term20666, term20666.getClass(), "_defaultViews", null);
        setBooleanField(term20666, term20666.getClass(), "_defaultViewsResolved", false);
        setIntField(term20676, term20676.getClass(), "modCount", 0);
        setField(term20666, term20666.getClass(), "_properties", term20676);
        setField(term20666, term20666.getClass(), "_objectIdInfo", null);
        setField(term20666, term20666.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term20665;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "forOtherUse", argTypes, null, args);
        assertTrue(recursiveEquals(term20665, null));
        assertTrue(recursiveEquals(retValue, term20666));
    }

};


