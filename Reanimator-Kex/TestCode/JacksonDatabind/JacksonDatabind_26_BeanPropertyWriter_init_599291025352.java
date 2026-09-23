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

public class BeanPropertyWriter_init_599291025352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206884;
     Object term207536;
     Object term207638;
     Object term208621;
     Object term208628;
     Object term208635;
     Object term208636;

    public BeanPropertyWriter_init_599291025352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term206638 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term206756 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object[] term206387 = (Object[]) newArray("java.lang.Class", 0);
        setField(term206638, term206638.getClass(), "_member", term206756);
        setField(term206638, term206638.getClass(), "_contextAnnotations", null);
        setField(term206638, term206638.getClass(), "_name", null);
        setField(term206638, term206638.getClass(), "_wrapperName", null);
        setField(term206638, term206638.getClass(), "_metadata", null);
        setField(term206638, term206638.getClass(), "_includeInViews", term206387);
        setField(term206638, term206638.getClass(), "_declaredType", null);
        setField(term206638, term206638.getClass(), "_serializer", null);
        setField(term206638, term206638.getClass(), "_dynamicSerializers", null);
        setField(term206638, term206638.getClass(), "_typeSerializer", null);
        setField(term206638, term206638.getClass(), "_cfgSerializationType", null);
        term206884 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term206976 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term207156 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term207274 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term207418 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term206976, term206976.getClass(), "_simpleName", "");
        setField(term206884, term206884.getClass(), "_name", term206976);
        setBooleanField(term206884, term206884.getClass(), "_forSerialization", false);
        setField(term206884, term206884.getClass(), "_ctorParameters", null);
        setField(term206884, term206884.getClass(), "_setters", null);
        setField(term207156, term207156.getClass(), "value", term207274);
        setField(term207156, term207156.getClass(), "next", null);
        setField(term206884, term206884.getClass(), "_fields", term207156);
        setField(term206884, term206884.getClass(), "_annotationIntrospector", term207418);
        term207536 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term207638 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMSerializer"));
        term208621 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term208622 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term208625 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term208626 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term208627 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMSerializer"));
        setField(term208622, term208622.getClass(), "_value", "");
        setField(term208622, term208622.getClass(), "_quotedUTF8Ref", null);
        setField(term208622, term208622.getClass(), "_unquotedUTF8Ref", null);
        setField(term208622, term208622.getClass(), "_quotedChars", null);
        setField(term208622, term208622.getClass(), "_jdkSerializeValue", null);
        setField(term208621, term208621.getClass(), "_name", term208622);
        setField(term208621, term208621.getClass(), "_wrapperName", null);
        setField(term208621, term208621.getClass(), "_declaredType", null);
        setField(term208621, term208621.getClass(), "_cfgSerializationType", null);
        setField(term208621, term208621.getClass(), "_nonTrivialBaseType", null);
        setField(term208621, term208621.getClass(), "_contextAnnotations", null);
        setField(term208625, term208625.getClass(), "_required", null);
        setField(term208625, term208625.getClass(), "_description", null);
        setField(term208625, term208625.getClass(), "_index", null);
        setField(term208625, term208625.getClass(), "_defaultValue", null);
        setField(term208621, term208621.getClass(), "_metadata", term208625);
        setField(term208621, term208621.getClass(), "_format", null);
        setField(term208626, term208626.getClass(), "_field", null);
        setField(term208626, term208626.getClass(), "_serialization", null);
        setField(term208626, term208626.getClass(), "_context", null);
        setField(term208626, term208626.getClass(), "_annotations", null);
        setField(term208621, term208621.getClass(), "_member", term208626);
        setField(term208621, term208621.getClass(), "_accessorMethod", null);
        setField(term208621, term208621.getClass(), "_field", null);
        setField(term208627, term208627.getClass(), "_domImpl", null);
        setField(term208627, term208627.getClass(), "_handledType", null);
        setField(term208621, term208621.getClass(), "_serializer", term208627);
        setField(term208621, term208621.getClass(), "_nullSerializer", null);
        setField(term208621, term208621.getClass(), "_typeSerializer", null);
        setField(term208621, term208621.getClass(), "_dynamicSerializers", null);
        setBooleanField(term208621, term208621.getClass(), "_suppressNulls", false);
        setField(term208621, term208621.getClass(), "_suppressableValue", null);
        setField(term208621, term208621.getClass(), "_includeInViews", null);
        setField(term208621, term208621.getClass(), "_internalSettings", null);
        term208628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term208629 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term208630 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term208633 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term208634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term208628, term208628.getClass(), "_forSerialization", false);
        setField(term208628, term208628.getClass(), "_annotationIntrospector", term208629);
        setField(term208630, term208630.getClass(), "_simpleName", "");
        setField(term208630, term208630.getClass(), "_namespace", null);
        setField(term208630, term208630.getClass(), "_encodedSimple", null);
        setField(term208628, term208628.getClass(), "_name", term208630);
        setField(term208628, term208628.getClass(), "_internalName", null);
        setField(term208634, term208634.getClass(), "_field", null);
        setField(term208634, term208634.getClass(), "_serialization", null);
        setField(term208634, term208634.getClass(), "_context", null);
        setField(term208634, term208634.getClass(), "_annotations", null);
        setField(term208633, term208633.getClass(), "value", term208634);
        setField(term208633, term208633.getClass(), "next", null);
        setField(term208633, term208633.getClass(), "name", null);
        setBooleanField(term208633, term208633.getClass(), "isNameExplicit", false);
        setBooleanField(term208633, term208633.getClass(), "isVisible", false);
        setBooleanField(term208633, term208633.getClass(), "isMarkedIgnored", false);
        setField(term208628, term208628.getClass(), "_fields", term208633);
        setField(term208628, term208628.getClass(), "_ctorParameters", null);
        setField(term208628, term208628.getClass(), "_getters", null);
        setField(term208628, term208628.getClass(), "_setters", null);
        term208635 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term208635, term208635.getClass(), "_field", null);
        setField(term208635, term208635.getClass(), "_serialization", null);
        setField(term208635, term208635.getClass(), "_context", null);
        setField(term208635, term208635.getClass(), "_annotations", null);
        term208636 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMSerializer"));
        setField(term208636, term208636.getClass(), "_domImpl", null);
        setField(term208636, term208636.getClass(), "_handledType", null);
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
        args[0] = term206884;
        args[1] = term207536;
        args[2] = null;
        args[3] = null;
        args[4] = term207638;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term208621));
        assertTrue(recursiveEquals(term206884, term208628));
        assertTrue(recursiveEquals(term207536, term208635));
        assertTrue(recursiveEquals(term207638, term208636));
    }

};


