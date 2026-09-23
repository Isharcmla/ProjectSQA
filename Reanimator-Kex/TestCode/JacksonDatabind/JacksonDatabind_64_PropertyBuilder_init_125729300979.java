package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;

public class PropertyBuilder_init_125729300979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71985;
     Object term72327;
     Object term72943;
     Object term72952;
     Object term72956;

    public PropertyBuilder_init_125729300979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71537 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term71643 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term71773 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term71879 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term71537, term71537.getClass(), "_config", term71643);
        setField(term71537, term71537.getClass(), "_beanDesc", term71773);
        setField(term71537, term71537.getClass(), "_defaultInclusion", term71879);
        term71985 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term72091 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term72197 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term72091, term72091.getClass(), "_overrides", null);
        setField(term71985, term71985.getClass(), "_configOverrides", term72091);
        setField(term71985, term71985.getClass(), "_serializationInclusion", term72197);
        term72327 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term72471 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term72589 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term72693 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term72327, term72327.getClass(), "_annotationIntrospector", term72471);
        setField(term72327, term72327.getClass(), "_classInfo", term72589);
        setField(term72693, term72693.getClass(), "_class", null);
        setField(term72327, term72327.getClass(), "_type", term72693);
        term72943 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term72944 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term72945 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term72946 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term72947 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term72948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term72949 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term72950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term72951 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term72944, term72944.getClass(), "_filterProvider", null);
        setField(term72944, term72944.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term72944, term72944.getClass(), "_serFeatures", 0);
        setIntField(term72944, term72944.getClass(), "_generatorFeatures", 0);
        setIntField(term72944, term72944.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term72944, term72944.getClass(), "_formatWriteFeatures", 0);
        setIntField(term72944, term72944.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term72945, term72945.getClass(), "_valueInclusion", null);
        setField(term72945, term72945.getClass(), "_contentInclusion", null);
        setField(term72944, term72944.getClass(), "_serializationInclusion", term72945);
        setField(term72944, term72944.getClass(), "_mixIns", null);
        setField(term72944, term72944.getClass(), "_subtypeResolver", null);
        setField(term72944, term72944.getClass(), "_rootName", null);
        setField(term72944, term72944.getClass(), "_view", null);
        setField(term72944, term72944.getClass(), "_attributes", null);
        setField(term72944, term72944.getClass(), "_rootNames", null);
        setField(term72946, term72946.getClass(), "_overrides", null);
        setField(term72944, term72944.getClass(), "_configOverrides", term72946);
        setIntField(term72944, term72944.getClass(), "_mapperFeatures", 0);
        setField(term72944, term72944.getClass(), "_base", null);
        setField(term72943, term72943.getClass(), "_config", term72944);
        setField(term72947, term72947.getClass(), "_propCollector", null);
        setField(term72947, term72947.getClass(), "_config", null);
        setField(term72947, term72947.getClass(), "_annotationIntrospector", term72948);
        setField(term72949, term72949.getClass(), "_type", null);
        setField(term72949, term72949.getClass(), "_class", null);
        setField(term72949, term72949.getClass(), "_bindings", null);
        setField(term72949, term72949.getClass(), "_superTypes", null);
        setField(term72949, term72949.getClass(), "_annotationIntrospector", null);
        setField(term72949, term72949.getClass(), "_typeFactory", null);
        setField(term72949, term72949.getClass(), "_mixInResolver", null);
        setField(term72949, term72949.getClass(), "_primaryMixIn", null);
        setField(term72949, term72949.getClass(), "_classAnnotations", null);
        setBooleanField(term72949, term72949.getClass(), "_creatorsResolved", false);
        setField(term72949, term72949.getClass(), "_defaultConstructor", null);
        setField(term72949, term72949.getClass(), "_constructors", null);
        setField(term72949, term72949.getClass(), "_creatorMethods", null);
        setField(term72949, term72949.getClass(), "_memberMethods", null);
        setField(term72949, term72949.getClass(), "_fields", null);
        setField(term72947, term72947.getClass(), "_classInfo", term72949);
        setField(term72947, term72947.getClass(), "_properties", null);
        setField(term72947, term72947.getClass(), "_objectIdInfo", null);
        setField(term72950, term72950.getClass(), "_referencedType", null);
        setField(term72950, term72950.getClass(), "_anchorType", null);
        setField(term72950, term72950.getClass(), "_superClass", null);
        setField(term72950, term72950.getClass(), "_superInterfaces", null);
        setField(term72950, term72950.getClass(), "_bindings", null);
        setField(term72950, term72950.getClass(), "_canonicalName", null);
        setField(term72950, term72950.getClass(), "_class", null);
        setIntField(term72950, term72950.getClass(), "_hash", 0);
        setField(term72950, term72950.getClass(), "_valueHandler", null);
        setField(term72950, term72950.getClass(), "_typeHandler", null);
        setBooleanField(term72950, term72950.getClass(), "_asStatic", false);
        setField(term72947, term72947.getClass(), "_type", term72950);
        setField(term72943, term72943.getClass(), "_beanDesc", term72947);
        setField(term72943, term72943.getClass(), "_annotationIntrospector", term72951);
        setField(term72943, term72943.getClass(), "_defaultBean", null);
        setField(term72943, term72943.getClass(), "_defaultInclusion", term72945);
        setBooleanField(term72943, term72943.getClass(), "_useRealPropertyDefaults", false);
        term72952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term72953 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term72954 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term72955 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term72952, term72952.getClass(), "_propCollector", null);
        setField(term72952, term72952.getClass(), "_config", null);
        setField(term72952, term72952.getClass(), "_annotationIntrospector", term72953);
        setField(term72954, term72954.getClass(), "_type", null);
        setField(term72954, term72954.getClass(), "_class", null);
        setField(term72954, term72954.getClass(), "_bindings", null);
        setField(term72954, term72954.getClass(), "_superTypes", null);
        setField(term72954, term72954.getClass(), "_annotationIntrospector", null);
        setField(term72954, term72954.getClass(), "_typeFactory", null);
        setField(term72954, term72954.getClass(), "_mixInResolver", null);
        setField(term72954, term72954.getClass(), "_primaryMixIn", null);
        setField(term72954, term72954.getClass(), "_classAnnotations", null);
        setBooleanField(term72954, term72954.getClass(), "_creatorsResolved", false);
        setField(term72954, term72954.getClass(), "_defaultConstructor", null);
        setField(term72954, term72954.getClass(), "_constructors", null);
        setField(term72954, term72954.getClass(), "_creatorMethods", null);
        setField(term72954, term72954.getClass(), "_memberMethods", null);
        setField(term72954, term72954.getClass(), "_fields", null);
        setField(term72952, term72952.getClass(), "_classInfo", term72954);
        setField(term72952, term72952.getClass(), "_properties", null);
        setField(term72952, term72952.getClass(), "_objectIdInfo", null);
        setField(term72955, term72955.getClass(), "_referencedType", null);
        setField(term72955, term72955.getClass(), "_anchorType", null);
        setField(term72955, term72955.getClass(), "_superClass", null);
        setField(term72955, term72955.getClass(), "_superInterfaces", null);
        setField(term72955, term72955.getClass(), "_bindings", null);
        setField(term72955, term72955.getClass(), "_canonicalName", null);
        setField(term72955, term72955.getClass(), "_class", null);
        setIntField(term72955, term72955.getClass(), "_hash", 0);
        setField(term72955, term72955.getClass(), "_valueHandler", null);
        setField(term72955, term72955.getClass(), "_typeHandler", null);
        setBooleanField(term72955, term72955.getClass(), "_asStatic", false);
        setField(term72952, term72952.getClass(), "_type", term72955);
        term72956 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term72957 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term72958 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term72956, term72956.getClass(), "_filterProvider", null);
        setField(term72956, term72956.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term72956, term72956.getClass(), "_serFeatures", 0);
        setIntField(term72956, term72956.getClass(), "_generatorFeatures", 0);
        setIntField(term72956, term72956.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term72956, term72956.getClass(), "_formatWriteFeatures", 0);
        setIntField(term72956, term72956.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term72957, term72957.getClass(), "_valueInclusion", null);
        setField(term72957, term72957.getClass(), "_contentInclusion", null);
        setField(term72956, term72956.getClass(), "_serializationInclusion", term72957);
        setField(term72956, term72956.getClass(), "_mixIns", null);
        setField(term72956, term72956.getClass(), "_subtypeResolver", null);
        setField(term72956, term72956.getClass(), "_rootName", null);
        setField(term72956, term72956.getClass(), "_view", null);
        setField(term72956, term72956.getClass(), "_attributes", null);
        setField(term72956, term72956.getClass(), "_rootNames", null);
        setField(term72958, term72958.getClass(), "_overrides", null);
        setField(term72956, term72956.getClass(), "_configOverrides", term72958);
        setIntField(term72956, term72956.getClass(), "_mapperFeatures", 0);
        setField(term72956, term72956.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term71985;
        args[1] = term72327;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term72943));
        assertTrue(recursiveEquals(term71985, term72952));
        assertTrue(recursiveEquals(term72327, term72956));
    }

};


