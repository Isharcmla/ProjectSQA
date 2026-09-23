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

public class BasicBeanDescription_forOtherUse_1395557962309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144776;
     Object term144926;
     Object term144877;

    public BasicBeanDescription_forOtherUse_1395557962309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144776 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term144876 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term144776, term144776.getClass(), "_mapperFeatures", -1);
        setField(term144776, term144776.getClass(), "_base", term144876);
        term144926 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term144927 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term144926, term144926.getClass(), "_problemHandlers", null);
        setField(term144926, term144926.getClass(), "_nodeFactory", null);
        setIntField(term144926, term144926.getClass(), "_deserFeatures", 0);
        setIntField(term144926, term144926.getClass(), "_parserFeatures", 0);
        setIntField(term144926, term144926.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term144926, term144926.getClass(), "_formatReadFeatures", 0);
        setIntField(term144926, term144926.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term144926, term144926.getClass(), "_mixIns", null);
        setField(term144926, term144926.getClass(), "_subtypeResolver", null);
        setField(term144926, term144926.getClass(), "_rootName", null);
        setField(term144926, term144926.getClass(), "_view", null);
        setField(term144926, term144926.getClass(), "_attributes", null);
        setField(term144926, term144926.getClass(), "_rootNames", null);
        setField(term144926, term144926.getClass(), "_configOverrides", null);
        setIntField(term144926, term144926.getClass(), "_mapperFeatures", -1);
        setField(term144927, term144927.getClass(), "_classIntrospector", null);
        setField(term144927, term144927.getClass(), "_annotationIntrospector", null);
        setField(term144927, term144927.getClass(), "_propertyNamingStrategy", null);
        setField(term144927, term144927.getClass(), "_typeFactory", null);
        setField(term144927, term144927.getClass(), "_typeResolverBuilder", null);
        setField(term144927, term144927.getClass(), "_dateFormat", null);
        setField(term144927, term144927.getClass(), "_handlerInstantiator", null);
        setField(term144927, term144927.getClass(), "_locale", null);
        setField(term144927, term144927.getClass(), "_timeZone", null);
        setField(term144927, term144927.getClass(), "_defaultBase64", null);
        setField(term144926, term144926.getClass(), "_base", term144927);
        term144877 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term144878 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term144885 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term144887 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term144877, term144877.getClass(), "_propCollector", null);
        setField(term144878, term144878.getClass(), "_problemHandlers", null);
        setField(term144878, term144878.getClass(), "_nodeFactory", null);
        setIntField(term144878, term144878.getClass(), "_deserFeatures", 0);
        setIntField(term144878, term144878.getClass(), "_parserFeatures", 0);
        setIntField(term144878, term144878.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term144878, term144878.getClass(), "_formatReadFeatures", 0);
        setIntField(term144878, term144878.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term144878, term144878.getClass(), "_mixIns", null);
        setField(term144878, term144878.getClass(), "_subtypeResolver", null);
        setField(term144878, term144878.getClass(), "_rootName", null);
        setField(term144878, term144878.getClass(), "_view", null);
        setField(term144878, term144878.getClass(), "_attributes", null);
        setField(term144878, term144878.getClass(), "_rootNames", null);
        setField(term144878, term144878.getClass(), "_configOverrides", null);
        setIntField(term144878, term144878.getClass(), "_mapperFeatures", -1);
        setField(term144885, term144885.getClass(), "_classIntrospector", null);
        setField(term144885, term144885.getClass(), "_annotationIntrospector", null);
        setField(term144885, term144885.getClass(), "_propertyNamingStrategy", null);
        setField(term144885, term144885.getClass(), "_typeFactory", null);
        setField(term144885, term144885.getClass(), "_typeResolverBuilder", null);
        setField(term144885, term144885.getClass(), "_dateFormat", null);
        setField(term144885, term144885.getClass(), "_handlerInstantiator", null);
        setField(term144885, term144885.getClass(), "_locale", null);
        setField(term144885, term144885.getClass(), "_timeZone", null);
        setField(term144885, term144885.getClass(), "_defaultBase64", null);
        setField(term144878, term144878.getClass(), "_base", term144885);
        setField(term144877, term144877.getClass(), "_config", term144878);
        setField(term144877, term144877.getClass(), "_annotationIntrospector", null);
        setField(term144877, term144877.getClass(), "_classInfo", null);
        setField(term144877, term144877.getClass(), "_defaultViews", null);
        setBooleanField(term144877, term144877.getClass(), "_defaultViewsResolved", false);
        setIntField(term144887, term144887.getClass(), "modCount", 0);
        setField(term144877, term144877.getClass(), "_properties", term144887);
        setField(term144877, term144877.getClass(), "_objectIdInfo", null);
        setField(term144877, term144877.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term144776;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "forOtherUse", argTypes, null, args);
        assertTrue(recursiveEquals(term144776, null));
        assertTrue(recursiveEquals(retValue, term144877));
    }

};


