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
import java.util.LinkedList;
import java.lang.Object;

public class BasicBeanDescription_init_153978021946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term433;
     Object term440;

    public BasicBeanDescription_init_153978021946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new LinkedList();
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        LinkedList term434 = new LinkedList();
        ((LinkedList) term434).add((Object)null);
        ((LinkedList) term434).add((Object)null);
        ((LinkedList) term434).add((Object)null);
        ((LinkedList) term434).add((Object)null);
        ((LinkedList) term434).add((Object)null);
        term433 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term433, term433.getClass(), "_propCollector", null);
        setField(term433, term433.getClass(), "_config", null);
        setField(term433, term433.getClass(), "_annotationIntrospector", null);
        setField(term433, term433.getClass(), "_classInfo", null);
        setField(term433, term433.getClass(), "_defaultViews", null);
        setBooleanField(term433, term433.getClass(), "_defaultViewsResolved", false);
        setField(term433, term433.getClass(), "_properties", term434);
        setField(term433, term433.getClass(), "_objectIdInfo", null);
        setField(term433, term433.getClass(), "_type", null);
        term440 = new LinkedList();
        ((LinkedList) term440).add((Object)null);
        ((LinkedList) term440).add((Object)null);
        ((LinkedList) term440).add((Object)null);
        ((LinkedList) term440).add((Object)null);
        ((LinkedList) term440).add((Object)null);
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
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term433));
        assertTrue(recursiveEquals(term1, term440));
    }

};


