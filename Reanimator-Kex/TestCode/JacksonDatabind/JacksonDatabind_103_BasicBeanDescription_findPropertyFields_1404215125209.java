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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class BasicBeanDescription_findPropertyFields_1404215125209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75299;
     Object term75940;
     Object term75933;

    public BasicBeanDescription_findPropertyFields_1404215125209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75479 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term75479, term75479.getClass(), "_fields", null);
        Object term75607 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term75749 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term75749, term75749.getClass(), "value", null);
        setField(term75749, term75749.getClass(), "next", null);
        setField(term75607, term75607.getClass(), "_fields", term75749);
        Object term75883 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        ArrayList term75351 = new ArrayList();
        ((ArrayList) term75351).add(term75479);
        ((ArrayList) term75351).add(term75607);
        ((ArrayList) term75351).add(term75883);
        term75299 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term75299, term75299.getClass(), "_properties", term75351);
        Object term75943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term75943, term75943.getClass(), "_forSerialization", false);
        setField(term75943, term75943.getClass(), "_config", null);
        setField(term75943, term75943.getClass(), "_annotationIntrospector", null);
        setField(term75943, term75943.getClass(), "_name", null);
        setField(term75943, term75943.getClass(), "_internalName", null);
        setField(term75943, term75943.getClass(), "_fields", null);
        setField(term75943, term75943.getClass(), "_ctorParameters", null);
        setField(term75943, term75943.getClass(), "_getters", null);
        setField(term75943, term75943.getClass(), "_setters", null);
        setField(term75943, term75943.getClass(), "_metadata", null);
        setField(term75943, term75943.getClass(), "_referenceInfo", null);
        Object term75944 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term75945 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term75944, term75944.getClass(), "_forSerialization", false);
        setField(term75944, term75944.getClass(), "_config", null);
        setField(term75944, term75944.getClass(), "_annotationIntrospector", null);
        setField(term75944, term75944.getClass(), "_name", null);
        setField(term75944, term75944.getClass(), "_internalName", null);
        setField(term75945, term75945.getClass(), "value", null);
        setField(term75945, term75945.getClass(), "next", null);
        setField(term75945, term75945.getClass(), "name", null);
        setBooleanField(term75945, term75945.getClass(), "isNameExplicit", false);
        setBooleanField(term75945, term75945.getClass(), "isVisible", false);
        setBooleanField(term75945, term75945.getClass(), "isMarkedIgnored", false);
        setField(term75944, term75944.getClass(), "_fields", term75945);
        setField(term75944, term75944.getClass(), "_ctorParameters", null);
        setField(term75944, term75944.getClass(), "_getters", null);
        setField(term75944, term75944.getClass(), "_setters", null);
        setField(term75944, term75944.getClass(), "_metadata", null);
        setField(term75944, term75944.getClass(), "_referenceInfo", null);
        Object term75946 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term75946, term75946.getClass(), "_annotationIntrospector", null);
        setField(term75946, term75946.getClass(), "_member", null);
        setField(term75946, term75946.getClass(), "_metadata", null);
        setField(term75946, term75946.getClass(), "_fullName", null);
        setField(term75946, term75946.getClass(), "_inclusion", null);
        ArrayList term75941 = new ArrayList();
        ((ArrayList) term75941).add(term75943);
        ((ArrayList) term75941).add(term75944);
        ((ArrayList) term75941).add(term75946);
        term75940 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term75940, term75940.getClass(), "_propCollector", null);
        setField(term75940, term75940.getClass(), "_config", null);
        setField(term75940, term75940.getClass(), "_annotationIntrospector", null);
        setField(term75940, term75940.getClass(), "_classInfo", null);
        setField(term75940, term75940.getClass(), "_defaultViews", null);
        setBooleanField(term75940, term75940.getClass(), "_defaultViewsResolved", false);
        setField(term75940, term75940.getClass(), "_properties", term75941);
        setField(term75940, term75940.getClass(), "_objectIdInfo", null);
        setField(term75940, term75940.getClass(), "_type", null);
        term75933 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term75299, args);
        assertTrue(recursiveEquals(term75299, term75940));
        assertTrue(recursiveEquals(retValue, term75933));
    }

};


