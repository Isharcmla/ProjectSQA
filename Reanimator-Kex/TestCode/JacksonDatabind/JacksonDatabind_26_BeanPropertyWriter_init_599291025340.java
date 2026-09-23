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

public class BeanPropertyWriter_init_599291025340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195270;
     Object term195928;
     Object term196090;
     Object term199667;
     Object term199674;
     Object term199681;
     Object term199682;

    public BeanPropertyWriter_init_599291025340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term194930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term195050 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term195142 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term194657 = (Object[]) newArray("java.lang.Class", 0);
        setField(term194930, term194930.getClass(), "_member", term195050);
        setField(term194930, term194930.getClass(), "_contextAnnotations", null);
        setField(term194930, term194930.getClass(), "_name", null);
        setField(term194930, term194930.getClass(), "_wrapperName", term195142);
        setField(term194930, term194930.getClass(), "_metadata", null);
        setField(term194930, term194930.getClass(), "_includeInViews", term194657);
        setField(term194930, term194930.getClass(), "_declaredType", null);
        setField(term194930, term194930.getClass(), "_serializer", null);
        setField(term194930, term194930.getClass(), "_dynamicSerializers", null);
        setField(term194930, term194930.getClass(), "_typeSerializer", null);
        setField(term194930, term194930.getClass(), "_cfgSerializationType", null);
        term195270 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term195362 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term195542 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term195660 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term195808 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term195362, term195362.getClass(), "_simpleName", "");
        setField(term195270, term195270.getClass(), "_name", term195362);
        setBooleanField(term195270, term195270.getClass(), "_forSerialization", false);
        setField(term195270, term195270.getClass(), "_ctorParameters", null);
        setField(term195270, term195270.getClass(), "_setters", null);
        setField(term195660, term195660.getClass(), "_annotations", null);
        setField(term195542, term195542.getClass(), "value", term195660);
        setField(term195542, term195542.getClass(), "next", null);
        setField(term195270, term195270.getClass(), "_fields", term195542);
        setField(term195270, term195270.getClass(), "_annotationIntrospector", term195808);
        term195928 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term196090 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        term199667 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term199668 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term199671 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term199672 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term199673 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term199668, term199668.getClass(), "_value", "");
        setField(term199668, term199668.getClass(), "_quotedUTF8Ref", null);
        setField(term199668, term199668.getClass(), "_unquotedUTF8Ref", null);
        setField(term199668, term199668.getClass(), "_quotedChars", null);
        setField(term199668, term199668.getClass(), "_jdkSerializeValue", null);
        setField(term199667, term199667.getClass(), "_name", term199668);
        setField(term199667, term199667.getClass(), "_wrapperName", null);
        setField(term199667, term199667.getClass(), "_declaredType", null);
        setField(term199667, term199667.getClass(), "_cfgSerializationType", null);
        setField(term199667, term199667.getClass(), "_nonTrivialBaseType", null);
        setField(term199667, term199667.getClass(), "_contextAnnotations", null);
        setField(term199671, term199671.getClass(), "_required", null);
        setField(term199671, term199671.getClass(), "_description", null);
        setField(term199671, term199671.getClass(), "_index", null);
        setField(term199671, term199671.getClass(), "_defaultValue", null);
        setField(term199667, term199667.getClass(), "_metadata", term199671);
        setField(term199667, term199667.getClass(), "_format", null);
        setField(term199672, term199672.getClass(), "_method", null);
        setField(term199672, term199672.getClass(), "_paramClasses", null);
        setField(term199672, term199672.getClass(), "_serialization", null);
        setField(term199672, term199672.getClass(), "_paramAnnotations", null);
        setField(term199672, term199672.getClass(), "_context", null);
        setField(term199672, term199672.getClass(), "_annotations", null);
        setField(term199667, term199667.getClass(), "_member", term199672);
        setField(term199667, term199667.getClass(), "_accessorMethod", null);
        setField(term199667, term199667.getClass(), "_field", null);
        setField(term199673, term199673.getClass(), "_handledType", null);
        setField(term199667, term199667.getClass(), "_serializer", term199673);
        setField(term199667, term199667.getClass(), "_nullSerializer", null);
        setField(term199667, term199667.getClass(), "_typeSerializer", null);
        setField(term199667, term199667.getClass(), "_dynamicSerializers", null);
        setBooleanField(term199667, term199667.getClass(), "_suppressNulls", false);
        setField(term199667, term199667.getClass(), "_suppressableValue", null);
        setField(term199667, term199667.getClass(), "_includeInViews", null);
        setField(term199667, term199667.getClass(), "_internalSettings", null);
        term199674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term199675 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term199676 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term199679 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term199680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term199674, term199674.getClass(), "_forSerialization", false);
        setField(term199674, term199674.getClass(), "_annotationIntrospector", term199675);
        setField(term199676, term199676.getClass(), "_simpleName", "");
        setField(term199676, term199676.getClass(), "_namespace", null);
        setField(term199676, term199676.getClass(), "_encodedSimple", null);
        setField(term199674, term199674.getClass(), "_name", term199676);
        setField(term199674, term199674.getClass(), "_internalName", null);
        setField(term199680, term199680.getClass(), "_field", null);
        setField(term199680, term199680.getClass(), "_serialization", null);
        setField(term199680, term199680.getClass(), "_context", null);
        setField(term199680, term199680.getClass(), "_annotations", null);
        setField(term199679, term199679.getClass(), "value", term199680);
        setField(term199679, term199679.getClass(), "next", null);
        setField(term199679, term199679.getClass(), "name", null);
        setBooleanField(term199679, term199679.getClass(), "isNameExplicit", false);
        setBooleanField(term199679, term199679.getClass(), "isVisible", false);
        setBooleanField(term199679, term199679.getClass(), "isMarkedIgnored", false);
        setField(term199674, term199674.getClass(), "_fields", term199679);
        setField(term199674, term199674.getClass(), "_ctorParameters", null);
        setField(term199674, term199674.getClass(), "_getters", null);
        setField(term199674, term199674.getClass(), "_setters", null);
        term199681 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term199681, term199681.getClass(), "_method", null);
        setField(term199681, term199681.getClass(), "_paramClasses", null);
        setField(term199681, term199681.getClass(), "_serialization", null);
        setField(term199681, term199681.getClass(), "_paramAnnotations", null);
        setField(term199681, term199681.getClass(), "_context", null);
        setField(term199681, term199681.getClass(), "_annotations", null);
        term199682 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term199682, term199682.getClass(), "_handledType", null);
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
        args[0] = term195270;
        args[1] = term195928;
        args[2] = null;
        args[3] = null;
        args[4] = term196090;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term199667));
        assertTrue(recursiveEquals(term195270, term199674));
        assertTrue(recursiveEquals(term195928, term199681));
        assertTrue(recursiveEquals(term196090, term199682));
    }

};


