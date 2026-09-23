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

public class BasicBeanDescription_forOtherUse_139555796250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;

    public BasicBeanDescription_forOtherUse_139555796250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term1300 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term1298, term1298.getClass(), "_propCollector", null);
        setField(term1298, term1298.getClass(), "_config", null);
        setField(term1298, term1298.getClass(), "_annotationIntrospector", null);
        setField(term1298, term1298.getClass(), "_classInfo", null);
        setField(term1298, term1298.getClass(), "_defaultViews", null);
        setBooleanField(term1298, term1298.getClass(), "_defaultViewsResolved", false);
        setIntField(term1300, term1300.getClass(), "modCount", 0);
        setField(term1298, term1298.getClass(), "_properties", term1300);
        setField(term1298, term1298.getClass(), "_objectIdInfo", null);
        setField(term1298, term1298.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "forOtherUse", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1298));
    }

};


