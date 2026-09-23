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

public class BasicBeanDescription_init_509789319109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14782;
     Object term15959;
     Object term15963;

    public BasicBeanDescription_init_509789319109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14550 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term14646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term14550, term14550.getClass(), "_type", term14646);
        setField(term14550, term14550.getClass(), "_propCollector", null);
        setField(term14550, term14550.getClass(), "_config", null);
        term14782 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term14888 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term14782, term14782.getClass(), "_config", term14888);
        term15959 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term15960 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term15961 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term15962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term15961, term15961.getClass(), "_filterProvider", null);
        setField(term15961, term15961.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term15961, term15961.getClass(), "_serFeatures", 0);
        setIntField(term15961, term15961.getClass(), "_generatorFeatures", 0);
        setIntField(term15961, term15961.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term15961, term15961.getClass(), "_formatWriteFeatures", 0);
        setIntField(term15961, term15961.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term15961, term15961.getClass(), "_mixIns", null);
        setField(term15961, term15961.getClass(), "_subtypeResolver", null);
        setField(term15961, term15961.getClass(), "_rootName", null);
        setField(term15961, term15961.getClass(), "_view", null);
        setField(term15961, term15961.getClass(), "_attributes", null);
        setField(term15961, term15961.getClass(), "_rootNames", null);
        setField(term15961, term15961.getClass(), "_configOverrides", null);
        setIntField(term15961, term15961.getClass(), "_mapperFeatures", 0);
        setField(term15961, term15961.getClass(), "_base", null);
        setField(term15960, term15960.getClass(), "_config", term15961);
        setBooleanField(term15960, term15960.getClass(), "_forSerialization", false);
        setBooleanField(term15960, term15960.getClass(), "_stdBeanNaming", false);
        setField(term15960, term15960.getClass(), "_type", null);
        setField(term15960, term15960.getClass(), "_classDef", null);
        setField(term15960, term15960.getClass(), "_visibilityChecker", null);
        setField(term15960, term15960.getClass(), "_annotationIntrospector", null);
        setBooleanField(term15960, term15960.getClass(), "_useAnnotations", false);
        setField(term15960, term15960.getClass(), "_mutatorPrefix", null);
        setBooleanField(term15960, term15960.getClass(), "_collected", false);
        setField(term15960, term15960.getClass(), "_properties", null);
        setField(term15960, term15960.getClass(), "_creatorProperties", null);
        setField(term15960, term15960.getClass(), "_anyGetters", null);
        setField(term15960, term15960.getClass(), "_anySetters", null);
        setField(term15960, term15960.getClass(), "_anySetterField", null);
        setField(term15960, term15960.getClass(), "_jsonValueAccessors", null);
        setField(term15960, term15960.getClass(), "_ignoredPropertyNames", null);
        setField(term15960, term15960.getClass(), "_injectables", null);
        setField(term15959, term15959.getClass(), "_propCollector", term15960);
        setField(term15959, term15959.getClass(), "_config", term15961);
        setField(term15959, term15959.getClass(), "_annotationIntrospector", term15962);
        setField(term15959, term15959.getClass(), "_classInfo", null);
        setField(term15959, term15959.getClass(), "_defaultViews", null);
        setBooleanField(term15959, term15959.getClass(), "_defaultViewsResolved", false);
        setField(term15959, term15959.getClass(), "_properties", null);
        setField(term15959, term15959.getClass(), "_objectIdInfo", null);
        setField(term15959, term15959.getClass(), "_type", null);
        term15963 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term15964 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term15964, term15964.getClass(), "_filterProvider", null);
        setField(term15964, term15964.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term15964, term15964.getClass(), "_serFeatures", 0);
        setIntField(term15964, term15964.getClass(), "_generatorFeatures", 0);
        setIntField(term15964, term15964.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term15964, term15964.getClass(), "_formatWriteFeatures", 0);
        setIntField(term15964, term15964.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term15964, term15964.getClass(), "_mixIns", null);
        setField(term15964, term15964.getClass(), "_subtypeResolver", null);
        setField(term15964, term15964.getClass(), "_rootName", null);
        setField(term15964, term15964.getClass(), "_view", null);
        setField(term15964, term15964.getClass(), "_attributes", null);
        setField(term15964, term15964.getClass(), "_rootNames", null);
        setField(term15964, term15964.getClass(), "_configOverrides", null);
        setIntField(term15964, term15964.getClass(), "_mapperFeatures", 0);
        setField(term15964, term15964.getClass(), "_base", null);
        setField(term15963, term15963.getClass(), "_config", term15964);
        setBooleanField(term15963, term15963.getClass(), "_forSerialization", false);
        setBooleanField(term15963, term15963.getClass(), "_stdBeanNaming", false);
        setField(term15963, term15963.getClass(), "_type", null);
        setField(term15963, term15963.getClass(), "_classDef", null);
        setField(term15963, term15963.getClass(), "_visibilityChecker", null);
        setField(term15963, term15963.getClass(), "_annotationIntrospector", null);
        setBooleanField(term15963, term15963.getClass(), "_useAnnotations", false);
        setField(term15963, term15963.getClass(), "_mutatorPrefix", null);
        setBooleanField(term15963, term15963.getClass(), "_collected", false);
        setField(term15963, term15963.getClass(), "_properties", null);
        setField(term15963, term15963.getClass(), "_creatorProperties", null);
        setField(term15963, term15963.getClass(), "_anyGetters", null);
        setField(term15963, term15963.getClass(), "_anySetters", null);
        setField(term15963, term15963.getClass(), "_anySetterField", null);
        setField(term15963, term15963.getClass(), "_jsonValueAccessors", null);
        setField(term15963, term15963.getClass(), "_ignoredPropertyNames", null);
        setField(term15963, term15963.getClass(), "_injectables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Object[] args = new Object[3];
        args[0] = term14782;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15959));
        assertTrue(recursiveEquals(term14782, null));
    }

};


