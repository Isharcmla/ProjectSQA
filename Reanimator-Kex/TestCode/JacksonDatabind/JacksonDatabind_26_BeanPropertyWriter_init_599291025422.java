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

public class BeanPropertyWriter_init_599291025422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269699;
     Object term270207;
     Object term270323;
     Object term270602;
     Object term270610;
     Object term270616;
     Object term270617;

    public BeanPropertyWriter_init_599291025422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term269475 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term269280 = (Object[]) newArray("java.lang.Class", 0);
        Object term269571 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term269475, term269475.getClass(), "_member", null);
        setField(term269475, term269475.getClass(), "_contextAnnotations", null);
        setField(term269475, term269475.getClass(), "_name", null);
        setField(term269475, term269475.getClass(), "_wrapperName", null);
        setField(term269475, term269475.getClass(), "_metadata", null);
        setField(term269475, term269475.getClass(), "_includeInViews", term269280);
        setField(term269475, term269475.getClass(), "_declaredType", null);
        setField(term269475, term269475.getClass(), "_serializer", null);
        setField(term269475, term269475.getClass(), "_dynamicSerializers", null);
        setField(term269475, term269475.getClass(), "_typeSerializer", null);
        setField(term269475, term269475.getClass(), "_cfgSerializationType", term269571);
        term269699 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term269791 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term269971 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term270089 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term269791, term269791.getClass(), "_simpleName", "");
        setField(term269699, term269699.getClass(), "_name", term269791);
        setBooleanField(term269699, term269699.getClass(), "_forSerialization", true);
        setField(term269699, term269699.getClass(), "_getters", null);
        setField(term269971, term269971.getClass(), "value", term270089);
        setField(term269971, term269971.getClass(), "next", null);
        setField(term269699, term269699.getClass(), "_fields", term269971);
        setField(term269699, term269699.getClass(), "_annotationIntrospector", null);
        term270207 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term270323 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term270602 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term270603 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term270606 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term270607 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term270608 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term270609 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term270603, term270603.getClass(), "_value", "");
        setField(term270603, term270603.getClass(), "_quotedUTF8Ref", null);
        setField(term270603, term270603.getClass(), "_unquotedUTF8Ref", null);
        setField(term270603, term270603.getClass(), "_quotedChars", null);
        setField(term270603, term270603.getClass(), "_jdkSerializeValue", null);
        setField(term270602, term270602.getClass(), "_name", term270603);
        setField(term270602, term270602.getClass(), "_wrapperName", null);
        setField(term270602, term270602.getClass(), "_declaredType", null);
        setField(term270602, term270602.getClass(), "_cfgSerializationType", null);
        setField(term270602, term270602.getClass(), "_nonTrivialBaseType", null);
        setField(term270606, term270606.getClass(), "_annotations", null);
        setField(term270602, term270602.getClass(), "_contextAnnotations", term270606);
        setField(term270607, term270607.getClass(), "_required", null);
        setField(term270607, term270607.getClass(), "_description", null);
        setField(term270607, term270607.getClass(), "_index", null);
        setField(term270607, term270607.getClass(), "_defaultValue", null);
        setField(term270602, term270602.getClass(), "_metadata", term270607);
        setField(term270602, term270602.getClass(), "_format", null);
        setField(term270608, term270608.getClass(), "_field", null);
        setField(term270608, term270608.getClass(), "_serialization", null);
        setField(term270608, term270608.getClass(), "_context", null);
        setField(term270608, term270608.getClass(), "_annotations", null);
        setField(term270602, term270602.getClass(), "_member", term270608);
        setField(term270602, term270602.getClass(), "_accessorMethod", null);
        setField(term270602, term270602.getClass(), "_field", null);
        setField(term270602, term270602.getClass(), "_serializer", null);
        setField(term270602, term270602.getClass(), "_nullSerializer", null);
        setField(term270602, term270602.getClass(), "_typeSerializer", null);
        setBooleanField(term270609, term270609.getClass(), "_resetWhenFull", false);
        setField(term270602, term270602.getClass(), "_dynamicSerializers", term270609);
        setBooleanField(term270602, term270602.getClass(), "_suppressNulls", false);
        setField(term270602, term270602.getClass(), "_suppressableValue", null);
        setField(term270602, term270602.getClass(), "_includeInViews", null);
        setField(term270602, term270602.getClass(), "_internalSettings", null);
        term270610 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term270611 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term270614 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term270615 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term270610, term270610.getClass(), "_forSerialization", true);
        setField(term270610, term270610.getClass(), "_annotationIntrospector", null);
        setField(term270611, term270611.getClass(), "_simpleName", "");
        setField(term270611, term270611.getClass(), "_namespace", null);
        setField(term270611, term270611.getClass(), "_encodedSimple", null);
        setField(term270610, term270610.getClass(), "_name", term270611);
        setField(term270610, term270610.getClass(), "_internalName", null);
        setField(term270615, term270615.getClass(), "_field", null);
        setField(term270615, term270615.getClass(), "_serialization", null);
        setField(term270615, term270615.getClass(), "_context", null);
        setField(term270615, term270615.getClass(), "_annotations", null);
        setField(term270614, term270614.getClass(), "value", term270615);
        setField(term270614, term270614.getClass(), "next", null);
        setField(term270614, term270614.getClass(), "name", null);
        setBooleanField(term270614, term270614.getClass(), "isNameExplicit", false);
        setBooleanField(term270614, term270614.getClass(), "isVisible", false);
        setBooleanField(term270614, term270614.getClass(), "isMarkedIgnored", false);
        setField(term270610, term270610.getClass(), "_fields", term270614);
        setField(term270610, term270610.getClass(), "_ctorParameters", null);
        setField(term270610, term270610.getClass(), "_getters", null);
        setField(term270610, term270610.getClass(), "_setters", null);
        term270616 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term270616, term270616.getClass(), "_field", null);
        setField(term270616, term270616.getClass(), "_serialization", null);
        setField(term270616, term270616.getClass(), "_context", null);
        setField(term270616, term270616.getClass(), "_annotations", null);
        term270617 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term270617, term270617.getClass(), "_annotations", null);
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
        args[0] = term269699;
        args[1] = term270207;
        args[2] = term270323;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term270602));
        assertTrue(recursiveEquals(term269699, term270610));
        assertTrue(recursiveEquals(term270207, term270616));
        assertTrue(recursiveEquals(term270323, term270617));
    }

};


