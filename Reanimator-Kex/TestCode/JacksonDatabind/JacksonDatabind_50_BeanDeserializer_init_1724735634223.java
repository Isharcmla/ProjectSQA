package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1724735634223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138371;
     Object term138637;
     Object term139341;
     Object term139347;
     Object term139352;

    public BeanDeserializer_init_1724735634223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138245 = Class.forName((String) "java.lang.SecurityManager$1");
        Object term138209 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term138209, term138209.getClass(), "_valueClass", term138245);
        setField(term138209, term138209.getClass(), "_classAnnotations", null);
        setField(term138209, term138209.getClass(), "_beanType", null);
        setField(term138209, term138209.getClass(), "_valueInstantiator", null);
        setField(term138209, term138209.getClass(), "_beanProperties", null);
        setField(term138209, term138209.getClass(), "_backRefs", null);
        setField(term138209, term138209.getClass(), "_ignorableProps", null);
        setBooleanField(term138209, term138209.getClass(), "_ignoreAllUnknown", false);
        setField(term138209, term138209.getClass(), "_anySetter", null);
        setField(term138209, term138209.getClass(), "_injectables", null);
        setField(term138209, term138209.getClass(), "_objectIdReader", null);
        setField(term138209, term138209.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term138209, term138209.getClass(), "_nonStandardCreation", false);
        term138371 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term138507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term138371, term138371.getClass(), "_valueInstantiator", term138507);
        setField(term138371, term138371.getClass(), "_anySetter", null);
        setField(term138371, term138371.getClass(), "_injectables", null);
        setField(term138371, term138371.getClass(), "_objectIdReader", null);
        term138637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term138755 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term138871 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term138981 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term139087 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term138637, term138637.getClass(), "_type", null);
        setField(term138755, term138755.getClass(), "_classAnnotations", term138871);
        setField(term138755, term138755.getClass(), "_class", null);
        setField(term138637, term138637.getClass(), "_classInfo", term138755);
        setField(term138637, term138637.getClass(), "_annotationIntrospector", null);
        setField(term138981, term138981.getClass(), "_configOverrides", term139087);
        setField(term138637, term138637.getClass(), "_config", term138981);
        Class<? extends Object> term139438 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term139437 = ((Class) term139438).getDeclaredField((String) "ANY");
        ((Field) term139437).setAccessible(true);
        Object enum38 = ((Field) term139437).get((Object) null);
        term139341 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term139342 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term139346 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term139341, term139341.getClass(), "_nullFromCreator", null);
        setField(term139342, term139342.getClass(), "_annotations", null);
        setField(term139341, term139341.getClass(), "_classAnnotations", term139342);
        setField(term139341, term139341.getClass(), "_beanType", null);
        setField(term139341, term139341.getClass(), "_serializationShape", enum38);
        setField(term139346, term139346.getClass(), "_valueType", null);
        setField(term139341, term139341.getClass(), "_valueInstantiator", term139346);
        setField(term139341, term139341.getClass(), "_delegateDeserializer", null);
        setField(term139341, term139341.getClass(), "_arrayDelegateDeserializer", null);
        setField(term139341, term139341.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term139341, term139341.getClass(), "_nonStandardCreation", true);
        setBooleanField(term139341, term139341.getClass(), "_vanillaProcessing", false);
        setField(term139341, term139341.getClass(), "_beanProperties", null);
        setField(term139341, term139341.getClass(), "_injectables", null);
        setField(term139341, term139341.getClass(), "_anySetter", null);
        setField(term139341, term139341.getClass(), "_ignorableProps", null);
        setBooleanField(term139341, term139341.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term139341, term139341.getClass(), "_needViewProcesing", false);
        setField(term139341, term139341.getClass(), "_backRefs", null);
        setField(term139341, term139341.getClass(), "_subDeserializers", null);
        setField(term139341, term139341.getClass(), "_unwrappedPropertyHandler", null);
        setField(term139341, term139341.getClass(), "_externalTypeIdHandler", null);
        setField(term139341, term139341.getClass(), "_objectIdReader", null);
        setField(term139341, term139341.getClass(), "_valueClass", null);
        term139347 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term139348 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term139349 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term139350 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term139351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term139347, term139347.getClass(), "_propCollector", null);
        setField(term139348, term139348.getClass(), "_problemHandlers", null);
        setField(term139348, term139348.getClass(), "_nodeFactory", null);
        setIntField(term139348, term139348.getClass(), "_deserFeatures", 0);
        setIntField(term139348, term139348.getClass(), "_parserFeatures", 0);
        setIntField(term139348, term139348.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term139348, term139348.getClass(), "_formatReadFeatures", 0);
        setIntField(term139348, term139348.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term139348, term139348.getClass(), "_mixIns", null);
        setField(term139348, term139348.getClass(), "_subtypeResolver", null);
        setField(term139348, term139348.getClass(), "_rootName", null);
        setField(term139348, term139348.getClass(), "_view", null);
        setField(term139348, term139348.getClass(), "_attributes", null);
        setField(term139348, term139348.getClass(), "_rootNames", null);
        setField(term139349, term139349.getClass(), "_overrides", null);
        setField(term139348, term139348.getClass(), "_configOverrides", term139349);
        setIntField(term139348, term139348.getClass(), "_mapperFeatures", 0);
        setField(term139348, term139348.getClass(), "_base", null);
        setField(term139347, term139347.getClass(), "_config", term139348);
        setField(term139347, term139347.getClass(), "_annotationIntrospector", null);
        setField(term139350, term139350.getClass(), "_type", null);
        setField(term139350, term139350.getClass(), "_class", null);
        setField(term139350, term139350.getClass(), "_bindings", null);
        setField(term139350, term139350.getClass(), "_superTypes", null);
        setField(term139350, term139350.getClass(), "_annotationIntrospector", null);
        setField(term139350, term139350.getClass(), "_typeFactory", null);
        setField(term139350, term139350.getClass(), "_mixInResolver", null);
        setField(term139350, term139350.getClass(), "_primaryMixIn", null);
        setField(term139351, term139351.getClass(), "_annotations", null);
        setField(term139350, term139350.getClass(), "_classAnnotations", term139351);
        setBooleanField(term139350, term139350.getClass(), "_creatorsResolved", false);
        setField(term139350, term139350.getClass(), "_defaultConstructor", null);
        setField(term139350, term139350.getClass(), "_constructors", null);
        setField(term139350, term139350.getClass(), "_creatorMethods", null);
        setField(term139350, term139350.getClass(), "_memberMethods", null);
        setField(term139350, term139350.getClass(), "_fields", null);
        setField(term139347, term139347.getClass(), "_classInfo", term139350);
        setField(term139347, term139347.getClass(), "_properties", null);
        setField(term139347, term139347.getClass(), "_objectIdInfo", null);
        setField(term139347, term139347.getClass(), "_type", null);
        term139352 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term139353 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term139352, term139352.getClass(), "_beanDesc", null);
        setBooleanField(term139352, term139352.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term139352, term139352.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term139352, term139352.getClass(), "_properties", null);
        setField(term139352, term139352.getClass(), "_injectables", null);
        setField(term139352, term139352.getClass(), "_backRefProperties", null);
        setField(term139352, term139352.getClass(), "_ignorableProps", null);
        setField(term139353, term139353.getClass(), "_valueType", null);
        setField(term139352, term139352.getClass(), "_valueInstantiator", term139353);
        setField(term139352, term139352.getClass(), "_objectIdReader", null);
        setField(term139352, term139352.getClass(), "_anySetter", null);
        setBooleanField(term139352, term139352.getClass(), "_ignoreAllUnknown", false);
        setField(term139352, term139352.getClass(), "_buildMethod", null);
        setField(term139352, term139352.getClass(), "_builderConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term138371;
        args[1] = term138637;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term139341));
        assertTrue(recursiveEquals(term138371, term139347));
        assertTrue(recursiveEquals(term138637, term139352));
    }

};


