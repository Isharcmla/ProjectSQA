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

public class BeanPropertyWriter_init_599291025154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64378;
     Object term64536;
     Object term64652;
     Object term64709;
     Object term65974;
     Object term65982;
     Object term65985;
     Object term65986;
     Object term65987;

    public BeanPropertyWriter_init_599291025154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63474 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term63592 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term63690 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term63782 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term63878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term63998 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        Object term64136 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        term64709 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term63474, term63474.getClass(), "_member", term63592);
        setField(term63474, term63474.getClass(), "_contextAnnotations", null);
        setField(term63474, term63474.getClass(), "_name", term63690);
        setField(term63474, term63474.getClass(), "_wrapperName", term63782);
        setField(term63474, term63474.getClass(), "_declaredType", term63878);
        setField(term63474, term63474.getClass(), "_serializer", term63998);
        setField(term63474, term63474.getClass(), "_dynamicSerializers", null);
        setField(term63474, term63474.getClass(), "_typeSerializer", term64136);
        setField(term63474, term63474.getClass(), "_cfgSerializationType", term64709);
        setBooleanField(term63474, term63474.getClass(), "_isRequired", false);
        term64378 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term64378, term64378.getClass(), "_name", "");
        setBooleanField(term64378, term64378.getClass(), "_forSerialization", false);
        setField(term64378, term64378.getClass(), "_ctorParameters", null);
        setField(term64378, term64378.getClass(), "_setters", null);
        setField(term64378, term64378.getClass(), "_fields", null);
        setField(term64378, term64378.getClass(), "_annotationIntrospector", null);
        term64536 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term64652 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term65974 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term65975 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term65976 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term65977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term65978 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term65981 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term65975, term65975.getClass(), "_method", null);
        setField(term65975, term65975.getClass(), "_paramClasses", null);
        setField(term65975, term65975.getClass(), "_serialization", null);
        setField(term65975, term65975.getClass(), "_paramAnnotations", null);
        setField(term65975, term65975.getClass(), "_annotations", null);
        setField(term65974, term65974.getClass(), "_member", term65975);
        setField(term65976, term65976.getClass(), "_annotations", null);
        setField(term65974, term65974.getClass(), "_contextAnnotations", term65976);
        setField(term65977, term65977.getClass(), "_elementType", null);
        setField(term65977, term65977.getClass(), "_canonicalName", null);
        setField(term65977, term65977.getClass(), "_class", null);
        setIntField(term65977, term65977.getClass(), "_hashCode", 0);
        setField(term65977, term65977.getClass(), "_valueHandler", null);
        setField(term65977, term65977.getClass(), "_typeHandler", null);
        setBooleanField(term65977, term65977.getClass(), "_asStatic", false);
        setField(term65974, term65974.getClass(), "_declaredType", term65977);
        setField(term65974, term65974.getClass(), "_accessorMethod", null);
        setField(term65974, term65974.getClass(), "_field", null);
        setField(term65974, term65974.getClass(), "_internalSettings", null);
        setField(term65978, term65978.getClass(), "_value", "");
        setField(term65978, term65978.getClass(), "_quotedUTF8Ref", null);
        setField(term65978, term65978.getClass(), "_unquotedUTF8Ref", null);
        setField(term65978, term65978.getClass(), "_quotedChars", null);
        setField(term65978, term65978.getClass(), "_jdkSerializeValue", null);
        setField(term65974, term65974.getClass(), "_name", term65978);
        setField(term65974, term65974.getClass(), "_wrapperName", null);
        setField(term65974, term65974.getClass(), "_cfgSerializationType", null);
        setField(term65974, term65974.getClass(), "_serializer", null);
        setField(term65974, term65974.getClass(), "_nullSerializer", null);
        setField(term65974, term65974.getClass(), "_dynamicSerializers", term65981);
        setBooleanField(term65974, term65974.getClass(), "_suppressNulls", false);
        setField(term65974, term65974.getClass(), "_suppressableValue", null);
        setField(term65974, term65974.getClass(), "_includeInViews", null);
        setField(term65974, term65974.getClass(), "_typeSerializer", null);
        setField(term65974, term65974.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term65974, term65974.getClass(), "_isRequired", false);
        term65982 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term65982, term65982.getClass(), "_forSerialization", false);
        setField(term65982, term65982.getClass(), "_annotationIntrospector", null);
        setField(term65982, term65982.getClass(), "_name", "");
        setField(term65982, term65982.getClass(), "_internalName", null);
        setField(term65982, term65982.getClass(), "_fields", null);
        setField(term65982, term65982.getClass(), "_ctorParameters", null);
        setField(term65982, term65982.getClass(), "_getters", null);
        setField(term65982, term65982.getClass(), "_setters", null);
        term65985 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term65985, term65985.getClass(), "_method", null);
        setField(term65985, term65985.getClass(), "_paramClasses", null);
        setField(term65985, term65985.getClass(), "_serialization", null);
        setField(term65985, term65985.getClass(), "_paramAnnotations", null);
        setField(term65985, term65985.getClass(), "_annotations", null);
        term65986 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term65986, term65986.getClass(), "_annotations", null);
        term65987 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term65987, term65987.getClass(), "_elementType", null);
        setField(term65987, term65987.getClass(), "_canonicalName", null);
        setField(term65987, term65987.getClass(), "_class", null);
        setIntField(term65987, term65987.getClass(), "_hashCode", 0);
        setField(term65987, term65987.getClass(), "_valueHandler", null);
        setField(term65987, term65987.getClass(), "_typeHandler", null);
        setBooleanField(term65987, term65987.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.Object");
        Object[] args = new Object[9];
        args[0] = term64378;
        args[1] = term64536;
        args[2] = term64652;
        args[3] = term64709;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65974));
        assertTrue(recursiveEquals(term64378, term65982));
        assertTrue(recursiveEquals(term64536, term65985));
        assertTrue(recursiveEquals(term64652, term65986));
        assertTrue(recursiveEquals(term64709, term65987));
    }

};
