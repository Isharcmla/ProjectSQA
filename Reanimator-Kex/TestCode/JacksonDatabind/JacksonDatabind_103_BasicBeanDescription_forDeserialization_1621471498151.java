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

public class BasicBeanDescription_forDeserialization_1621471498151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38291;
     Object term38728;
     Object term38679;

    public BasicBeanDescription_forDeserialization_1621471498151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38291 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term38405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term38511 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term38655 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term38291, term38291.getClass(), "_type", term38405);
        setField(term38291, term38291.getClass(), "_classDef", null);
        setIntField(term38511, term38511.getClass(), "_mapperFeatures", 0);
        setField(term38291, term38291.getClass(), "_config", term38511);
        setField(term38291, term38291.getClass(), "_annotationIntrospector", term38655);
        term38728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term38729 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term38730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term38731 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term38729, term38729.getClass(), "_filterProvider", null);
        setField(term38729, term38729.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term38729, term38729.getClass(), "_serFeatures", 0);
        setIntField(term38729, term38729.getClass(), "_generatorFeatures", 0);
        setIntField(term38729, term38729.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term38729, term38729.getClass(), "_formatWriteFeatures", 0);
        setIntField(term38729, term38729.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term38729, term38729.getClass(), "_mixIns", null);
        setField(term38729, term38729.getClass(), "_subtypeResolver", null);
        setField(term38729, term38729.getClass(), "_rootName", null);
        setField(term38729, term38729.getClass(), "_view", null);
        setField(term38729, term38729.getClass(), "_attributes", null);
        setField(term38729, term38729.getClass(), "_rootNames", null);
        setField(term38729, term38729.getClass(), "_configOverrides", null);
        setIntField(term38729, term38729.getClass(), "_mapperFeatures", 0);
        setField(term38729, term38729.getClass(), "_base", null);
        setField(term38728, term38728.getClass(), "_config", term38729);
        setBooleanField(term38728, term38728.getClass(), "_forSerialization", false);
        setBooleanField(term38728, term38728.getClass(), "_stdBeanNaming", false);
        setField(term38730, term38730.getClass(), "_elementType", null);
        setField(term38730, term38730.getClass(), "_superClass", null);
        setField(term38730, term38730.getClass(), "_superInterfaces", null);
        setField(term38730, term38730.getClass(), "_bindings", null);
        setField(term38730, term38730.getClass(), "_canonicalName", null);
        setField(term38730, term38730.getClass(), "_class", null);
        setIntField(term38730, term38730.getClass(), "_hash", 0);
        setField(term38730, term38730.getClass(), "_valueHandler", null);
        setField(term38730, term38730.getClass(), "_typeHandler", null);
        setBooleanField(term38730, term38730.getClass(), "_asStatic", false);
        setField(term38728, term38728.getClass(), "_type", term38730);
        setField(term38728, term38728.getClass(), "_classDef", null);
        setField(term38728, term38728.getClass(), "_visibilityChecker", null);
        setField(term38728, term38728.getClass(), "_annotationIntrospector", term38731);
        setBooleanField(term38728, term38728.getClass(), "_useAnnotations", false);
        setField(term38728, term38728.getClass(), "_mutatorPrefix", null);
        setBooleanField(term38728, term38728.getClass(), "_collected", false);
        setField(term38728, term38728.getClass(), "_properties", null);
        setField(term38728, term38728.getClass(), "_creatorProperties", null);
        setField(term38728, term38728.getClass(), "_anyGetters", null);
        setField(term38728, term38728.getClass(), "_anySetters", null);
        setField(term38728, term38728.getClass(), "_anySetterField", null);
        setField(term38728, term38728.getClass(), "_jsonValueAccessors", null);
        setField(term38728, term38728.getClass(), "_ignoredPropertyNames", null);
        setField(term38728, term38728.getClass(), "_injectables", null);
        term38679 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term38663 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term38664 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term38673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term38676 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term38680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term38664, term38664.getClass(), "_filterProvider", null);
        setField(term38664, term38664.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term38664, term38664.getClass(), "_serFeatures", 0);
        setIntField(term38664, term38664.getClass(), "_generatorFeatures", 0);
        setIntField(term38664, term38664.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term38664, term38664.getClass(), "_formatWriteFeatures", 0);
        setIntField(term38664, term38664.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term38664, term38664.getClass(), "_mixIns", null);
        setField(term38664, term38664.getClass(), "_subtypeResolver", null);
        setField(term38664, term38664.getClass(), "_rootName", null);
        setField(term38664, term38664.getClass(), "_view", null);
        setField(term38664, term38664.getClass(), "_attributes", null);
        setField(term38664, term38664.getClass(), "_rootNames", null);
        setField(term38664, term38664.getClass(), "_configOverrides", null);
        setIntField(term38664, term38664.getClass(), "_mapperFeatures", 0);
        setField(term38664, term38664.getClass(), "_base", null);
        setField(term38663, term38663.getClass(), "_config", term38664);
        setBooleanField(term38663, term38663.getClass(), "_forSerialization", false);
        setBooleanField(term38663, term38663.getClass(), "_stdBeanNaming", false);
        setField(term38673, term38673.getClass(), "_elementType", null);
        setField(term38673, term38673.getClass(), "_superClass", null);
        setField(term38673, term38673.getClass(), "_superInterfaces", null);
        setField(term38673, term38673.getClass(), "_bindings", null);
        setField(term38673, term38673.getClass(), "_canonicalName", null);
        setField(term38673, term38673.getClass(), "_class", null);
        setIntField(term38673, term38673.getClass(), "_hash", 0);
        setField(term38673, term38673.getClass(), "_valueHandler", null);
        setField(term38673, term38673.getClass(), "_typeHandler", null);
        setBooleanField(term38673, term38673.getClass(), "_asStatic", false);
        setField(term38663, term38663.getClass(), "_type", term38673);
        setField(term38663, term38663.getClass(), "_classDef", null);
        setField(term38663, term38663.getClass(), "_visibilityChecker", null);
        setField(term38663, term38663.getClass(), "_annotationIntrospector", term38676);
        setBooleanField(term38663, term38663.getClass(), "_useAnnotations", false);
        setField(term38663, term38663.getClass(), "_mutatorPrefix", null);
        setBooleanField(term38663, term38663.getClass(), "_collected", false);
        setField(term38663, term38663.getClass(), "_properties", null);
        setField(term38663, term38663.getClass(), "_creatorProperties", null);
        setField(term38663, term38663.getClass(), "_anyGetters", null);
        setField(term38663, term38663.getClass(), "_anySetters", null);
        setField(term38663, term38663.getClass(), "_anySetterField", null);
        setField(term38663, term38663.getClass(), "_jsonValueAccessors", null);
        setField(term38663, term38663.getClass(), "_ignoredPropertyNames", null);
        setField(term38663, term38663.getClass(), "_injectables", null);
        setField(term38679, term38679.getClass(), "_propCollector", term38663);
        setField(term38679, term38679.getClass(), "_config", term38664);
        setField(term38679, term38679.getClass(), "_annotationIntrospector", term38680);
        setField(term38679, term38679.getClass(), "_classInfo", null);
        setField(term38679, term38679.getClass(), "_defaultViews", null);
        setBooleanField(term38679, term38679.getClass(), "_defaultViewsResolved", false);
        setField(term38679, term38679.getClass(), "_properties", null);
        setField(term38679, term38679.getClass(), "_objectIdInfo", null);
        setField(term38679, term38679.getClass(), "_type", term38673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term38291;
        Object retValue = callMethod(klass, "forDeserialization", argTypes, null, args);
        assertTrue(recursiveEquals(term38291, term38728));
        assertTrue(recursiveEquals(retValue, term38679));
    }

};


