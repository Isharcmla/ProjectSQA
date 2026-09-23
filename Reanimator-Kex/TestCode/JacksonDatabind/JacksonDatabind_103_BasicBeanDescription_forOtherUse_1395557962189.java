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

public class BasicBeanDescription_forOtherUse_1395557962189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63832;
     Object term63982;
     Object term63933;

    public BasicBeanDescription_forOtherUse_1395557962189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63832 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63932 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term63832, term63832.getClass(), "_mapperFeatures", -1);
        setField(term63832, term63832.getClass(), "_base", term63932);
        term63982 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63983 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term63982, term63982.getClass(), "_filterProvider", null);
        setField(term63982, term63982.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term63982, term63982.getClass(), "_serFeatures", 0);
        setIntField(term63982, term63982.getClass(), "_generatorFeatures", 0);
        setIntField(term63982, term63982.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term63982, term63982.getClass(), "_formatWriteFeatures", 0);
        setIntField(term63982, term63982.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term63982, term63982.getClass(), "_mixIns", null);
        setField(term63982, term63982.getClass(), "_subtypeResolver", null);
        setField(term63982, term63982.getClass(), "_rootName", null);
        setField(term63982, term63982.getClass(), "_view", null);
        setField(term63982, term63982.getClass(), "_attributes", null);
        setField(term63982, term63982.getClass(), "_rootNames", null);
        setField(term63982, term63982.getClass(), "_configOverrides", null);
        setIntField(term63982, term63982.getClass(), "_mapperFeatures", -1);
        setField(term63983, term63983.getClass(), "_classIntrospector", null);
        setField(term63983, term63983.getClass(), "_annotationIntrospector", null);
        setField(term63983, term63983.getClass(), "_propertyNamingStrategy", null);
        setField(term63983, term63983.getClass(), "_typeFactory", null);
        setField(term63983, term63983.getClass(), "_typeResolverBuilder", null);
        setField(term63983, term63983.getClass(), "_dateFormat", null);
        setField(term63983, term63983.getClass(), "_handlerInstantiator", null);
        setField(term63983, term63983.getClass(), "_locale", null);
        setField(term63983, term63983.getClass(), "_timeZone", null);
        setField(term63983, term63983.getClass(), "_defaultBase64", null);
        setField(term63982, term63982.getClass(), "_base", term63983);
        term63933 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term63934 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63941 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term63943 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term63933, term63933.getClass(), "_propCollector", null);
        setField(term63934, term63934.getClass(), "_filterProvider", null);
        setField(term63934, term63934.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term63934, term63934.getClass(), "_serFeatures", 0);
        setIntField(term63934, term63934.getClass(), "_generatorFeatures", 0);
        setIntField(term63934, term63934.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term63934, term63934.getClass(), "_formatWriteFeatures", 0);
        setIntField(term63934, term63934.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term63934, term63934.getClass(), "_mixIns", null);
        setField(term63934, term63934.getClass(), "_subtypeResolver", null);
        setField(term63934, term63934.getClass(), "_rootName", null);
        setField(term63934, term63934.getClass(), "_view", null);
        setField(term63934, term63934.getClass(), "_attributes", null);
        setField(term63934, term63934.getClass(), "_rootNames", null);
        setField(term63934, term63934.getClass(), "_configOverrides", null);
        setIntField(term63934, term63934.getClass(), "_mapperFeatures", -1);
        setField(term63941, term63941.getClass(), "_classIntrospector", null);
        setField(term63941, term63941.getClass(), "_annotationIntrospector", null);
        setField(term63941, term63941.getClass(), "_propertyNamingStrategy", null);
        setField(term63941, term63941.getClass(), "_typeFactory", null);
        setField(term63941, term63941.getClass(), "_typeResolverBuilder", null);
        setField(term63941, term63941.getClass(), "_dateFormat", null);
        setField(term63941, term63941.getClass(), "_handlerInstantiator", null);
        setField(term63941, term63941.getClass(), "_locale", null);
        setField(term63941, term63941.getClass(), "_timeZone", null);
        setField(term63941, term63941.getClass(), "_defaultBase64", null);
        setField(term63934, term63934.getClass(), "_base", term63941);
        setField(term63933, term63933.getClass(), "_config", term63934);
        setField(term63933, term63933.getClass(), "_annotationIntrospector", null);
        setField(term63933, term63933.getClass(), "_classInfo", null);
        setField(term63933, term63933.getClass(), "_defaultViews", null);
        setBooleanField(term63933, term63933.getClass(), "_defaultViewsResolved", false);
        setIntField(term63943, term63943.getClass(), "modCount", 0);
        setField(term63933, term63933.getClass(), "_properties", term63943);
        setField(term63933, term63933.getClass(), "_objectIdInfo", null);
        setField(term63933, term63933.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term63832;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "forOtherUse", argTypes, null, args);
        assertTrue(recursiveEquals(term63832, null));
        assertTrue(recursiveEquals(retValue, term63933));
    }

};


