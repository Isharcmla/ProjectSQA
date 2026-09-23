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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68791;
     Object term69039;
     Object term69207;

    public BeanPropertyWriter_init_599291025185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68663 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term68466 = (Object[]) newArray("java.lang.Class", 0);
        setField(term68663, term68663.getClass(), "_member", null);
        setField(term68663, term68663.getClass(), "_contextAnnotations", null);
        setField(term68663, term68663.getClass(), "_name", null);
        setField(term68663, term68663.getClass(), "_wrapperName", null);
        setField(term68663, term68663.getClass(), "_metadata", null);
        setField(term68663, term68663.getClass(), "_includeInViews", term68466);
        setField(term68663, term68663.getClass(), "_declaredType", null);
        setField(term68663, term68663.getClass(), "_serializer", null);
        setField(term68663, term68663.getClass(), "_dynamicSerializers", null);
        setField(term68663, term68663.getClass(), "_typeSerializer", null);
        setField(term68663, term68663.getClass(), "_cfgSerializationType", null);
        setField(term68663, term68663.getClass(), "_accessorMethod", null);
        term68791 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term68883 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term68883, term68883.getClass(), "_simpleName", "");
        setField(term68791, term68791.getClass(), "_name", term68883);
        setBooleanField(term68791, term68791.getClass(), "_forSerialization", false);
        setField(term68791, term68791.getClass(), "_ctorParameters", null);
        setField(term68791, term68791.getClass(), "_setters", null);
        setField(term68791, term68791.getClass(), "_fields", null);
        setField(term68791, term68791.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term69973 = Class.forName((String) "java.lang.NegativeArraySizeException");
        Field term69091 = ((Class) term69973).getDeclaredField((String) "serialVersionUID");
        ((Field) term69091).setAccessible(false);
        term69039 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term69039, term69039.getClass(), "_field", term69091);
        term69207 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term68791;
        args[1] = term69039;
        args[2] = term69207;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


