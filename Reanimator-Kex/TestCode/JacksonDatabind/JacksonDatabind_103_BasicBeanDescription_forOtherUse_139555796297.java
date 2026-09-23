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

public class BasicBeanDescription_forOtherUse_139555796297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11970;
     Object term12578;
     Object term12530;

    public BasicBeanDescription_forOtherUse_139555796297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11970 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term12578 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term12578, term12578.getClass(), "_filterProvider", null);
        setField(term12578, term12578.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term12578, term12578.getClass(), "_serFeatures", 0);
        setIntField(term12578, term12578.getClass(), "_generatorFeatures", 0);
        setIntField(term12578, term12578.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term12578, term12578.getClass(), "_formatWriteFeatures", 0);
        setIntField(term12578, term12578.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term12578, term12578.getClass(), "_mixIns", null);
        setField(term12578, term12578.getClass(), "_subtypeResolver", null);
        setField(term12578, term12578.getClass(), "_rootName", null);
        setField(term12578, term12578.getClass(), "_view", null);
        setField(term12578, term12578.getClass(), "_attributes", null);
        setField(term12578, term12578.getClass(), "_rootNames", null);
        setField(term12578, term12578.getClass(), "_configOverrides", null);
        setIntField(term12578, term12578.getClass(), "_mapperFeatures", 0);
        setField(term12578, term12578.getClass(), "_base", null);
        term12530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term12531 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term12538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term12540 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term12530, term12530.getClass(), "_propCollector", null);
        setField(term12531, term12531.getClass(), "_filterProvider", null);
        setField(term12531, term12531.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term12531, term12531.getClass(), "_serFeatures", 0);
        setIntField(term12531, term12531.getClass(), "_generatorFeatures", 0);
        setIntField(term12531, term12531.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term12531, term12531.getClass(), "_formatWriteFeatures", 0);
        setIntField(term12531, term12531.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term12531, term12531.getClass(), "_mixIns", null);
        setField(term12531, term12531.getClass(), "_subtypeResolver", null);
        setField(term12531, term12531.getClass(), "_rootName", null);
        setField(term12531, term12531.getClass(), "_view", null);
        setField(term12531, term12531.getClass(), "_attributes", null);
        setField(term12531, term12531.getClass(), "_rootNames", null);
        setField(term12531, term12531.getClass(), "_configOverrides", null);
        setIntField(term12531, term12531.getClass(), "_mapperFeatures", 0);
        setField(term12531, term12531.getClass(), "_base", null);
        setField(term12530, term12530.getClass(), "_config", term12531);
        setField(term12530, term12530.getClass(), "_annotationIntrospector", term12538);
        setField(term12530, term12530.getClass(), "_classInfo", null);
        setField(term12530, term12530.getClass(), "_defaultViews", null);
        setBooleanField(term12530, term12530.getClass(), "_defaultViewsResolved", false);
        setIntField(term12540, term12540.getClass(), "modCount", 0);
        setField(term12530, term12530.getClass(), "_properties", term12540);
        setField(term12530, term12530.getClass(), "_objectIdInfo", null);
        setField(term12530, term12530.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term11970;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "forOtherUse", argTypes, null, args);
        assertTrue(recursiveEquals(term11970, null));
        assertTrue(recursiveEquals(retValue, term12530));
    }

};


